// package com.chrisodum.ll.wapp.data;

// import org.springframework.boot.context.event.ApplicationReadyEvent;
// import org.springframework.context.ApplicationListener;
// import org.springframework.stereotype.Component;

// //@component makes sure springs knows to manage this class
// //app ready event makes sure that spring is done building and ready to do
// work before spring
// //queries the db, so that db is set up before the query code is run
// @Component
// public class AppStartupEvent implements
// ApplicationListener<ApplicationReadyEvent> {

// // since this is final it has to have a constructor
// private final McqRepo mcqRepo;

// public AppStartupEvent(McqRepo mcqRepo) {
// this.mcqRepo = mcqRepo;
// }

// @Override
// public void onApplicationEvent(ApplicationReadyEvent event) {

// Iterable<MultipleChoiceQuestions> mcq = this.mcqRepo.findAll();
// mcq.forEach(System.out::println);

// // this.mcqRepo.save(
// // new MultipleChoiceQuestions("How is sookie?", "2 years", "1 year", "2
// years",
// // "3 years", "4 years"));

// }

// }
