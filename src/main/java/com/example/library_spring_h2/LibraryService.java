package com.example.library_spring_h2;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
@Service

public class LibraryService {
    private final LibraryRepo libraryRepo;

    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }
    @Transactional
    public void  addNewBook(LibraryDto libraryDto){
        Library library =new Library(libraryDto.getBookName()
        ,libraryDto.getAuthor(),libraryDto.getNumberOfPages(),
                libraryDto.getCategory(), libraryDto.getIsbn());
      libraryRepo.save(library);
    }
@Transactional
    public void delte(long number){
        libraryRepo.deleteById(number);
    }
@Transactional
    public Library rent(long number,  String firstName, String lastName, String id,int day) {
Library library =libraryRepo.findById(number).orElseThrow(NotFoudBookExeption::new);
LocalDate localDate =LocalDate.now();

library.setDateOfReturn(localDate.plusDays(day));
library.setFirstName(firstName);
library.setLastName(lastName);
library.setDocumentNumber(id);
return library;
    }
@Transactional
    public void  returnBook(long number){
        Library library =libraryRepo.findById(number).orElseThrow(NotFoudBookExeption::new);
        library.setDateOfReturn(null);
        library.setFirstName(null);
        library.setLastName(null);
        library.setDocumentNumber(null);

    }
    public void printAllBooks(){
        for (Library l: libraryRepo.findAll()
             ) {
            System.out.println(l);

        }
    }



}
