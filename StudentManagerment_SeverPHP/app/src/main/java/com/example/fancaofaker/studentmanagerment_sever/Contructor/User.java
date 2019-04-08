package com.example.fancaofaker.studentmanagerment_sever.Contructor;

public class User {
    String id;
    String Username;
    String Pass;
    public User(){

    }
    public  User(String id ,String username, String pass)
    {
        this.id=id;
        this.Username = username;
        this.Pass = pass;
    }
    public  String getUsername(){return  this.Username;}
    public  void  setUsername(String username){this.Username=username;}
    public  String getPass(){return this.Pass;}
    public  void  setPass(String pass){this.Pass=pass;}
    public String getId(){return  this.id;}
    public  void  setId(String id){this.id=id;}
    public String toString() {
        return id+"-" +Username+"-"+Pass;
    }
}
