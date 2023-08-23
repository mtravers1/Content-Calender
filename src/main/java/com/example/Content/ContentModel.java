 package com.example.Content;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.stereotype.Component;
// import java.lang.String;
// public class ContentModel {
    
//     private String name;
//     private String email;

//     public ContentModel(String name, String email ){
      
//         this.name=name;
//         this.email=email;
//     }

//     //    public Student(String name, int age, LocalDate dob, String email ){
//     //     this.age=age;
//     //     this.dob=dob;
//     //     this.name=name;
//     //     this.email=email;
//     // }
    


    

//     public String getemail(){
//         return email;
//     }

//     public void setemail(String email){
//         this.email=email;
//     }

   
    
//     public void setname(String name){
//         this.name=name;
//     }

//     public String getname(){
//         return name;
//     }




// }

public record ContentModel(
    Integer id,
    String title,
    String desc,
    Status status,
    Type contentType,
    // LocatDateTime dataCreated,
    // LocalDateTime dateUpdate,
    String url

){

}
