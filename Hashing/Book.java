package com.hashing;
public class Book{
    int id;
    String title;
    String address;
    public Book(int id, String title){
        this.id=id;
        this.title=title;
    }
    public String toString(){
        return "Book ID:"+id+"\nBook Title:"+title+"\nBook Address:"+address;
    }
}