package com.kafka.kafka;

 class BuilderClass {

    private final String userId;
    private final String userName;
    private final String emailId;

     public BuilderClass(UserBuilder userBuilder) {
         this.userId = userBuilder.userId;
         this.userName = userBuilder.userName;
         this.emailId = userBuilder.emailId;
     }

     public String getUserId() {
         return userId;
     }

     public String getUserName() {
         return userName;
     }

     public String getEmailId() {
         return emailId;
     }
     public static class UserBuilder{
         private  String userId;
         private  String userName;
         private  String emailId;

         public UserBuilder setUserId(String userId) {
             this.userId = userId;
             return this;
         }

         public UserBuilder setUserName(String userName) {
             this.userName = userName;
             return this;
         }

         public UserBuilder setEmailId(String emailId) {
             this.emailId = emailId;
             return this;
         }
         public BuilderClass build(){
             BuilderClass builderClass=new BuilderClass(this);
             return builderClass;
         }

     }
 }
