/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazinesubscription;

import java.util.List;

/**
 * Startup class for this package
 * @author mdeboer1
 */
public class Startup {
    public static void main(String[] args) {
        // Instantiate the objects
        MagazinePublisher1 publisher = new MagazinePublisher1();
        PrivateIndividualMagazineSubscriber subscriber1 = new PrivateIndividualMagazineSubscriber("Mark DeBoer", "123 Main St.",
            1);
        PrivateIndividualMagazineSubscriber subscriber2 = new PrivateIndividualMagazineSubscriber("John Doe", "555 Anywhere Dr.",
            2);
        
        // Add subscribers to the publishers List
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        
        // Publish new edition
        publisher.publishNewEdition();
        
        // This allows us to see the current subscriber info!
        List<PrivateIndividualMagazineSubscriber> subscribers = publisher.getSubscriberList();
        for (PrivateIndividualMagazineSubscriber subscriber : subscribers){
            System.out.println("Name is: " + subscriber.getName() + " Address is: " +
                    subscriber.getAddress());
        }
        
        // Making a view changes to the subscriber's info, which has publisher
        // also as a subscriber to the subscribers as it replies to info changes
        publisher.changeSubscriberAddress("321 Main St.", 1);
        subscriber1.setAddress("321 Main St.");
        
        publisher.changeSubscriberName("Johnathon Doe", 2);
        subscriber2.setName("Johnathon Doe");
        
        // This allows us to see that the name and address changes above where 
        // completed properly in the publisher's List
        subscribers = publisher.getSubscriberList();
        for (PrivateIndividualMagazineSubscriber subscriber : subscribers){
            System.out.println("Name is: " + subscriber.getName() + " Address is: " +
                    subscriber.getAddress());
        }
        System.out.println("Adding a new subscriber");
        PrivateIndividualMagazineSubscriber subscriber3 = 
                new PrivateIndividualMagazineSubscriber("Jill Smith", "123 Home St",
                3);
        publisher.addSubscriber(subscriber3);
        subscribers = publisher.getSubscriberList();
        for (PrivateIndividualMagazineSubscriber subscriber : subscribers){
            System.out.println("Name is: " + subscriber.getName() + " Address is: " +
                    subscriber.getAddress());
        }
    }
}
