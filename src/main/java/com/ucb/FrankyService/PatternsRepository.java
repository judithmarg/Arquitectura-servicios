package com.ucb.FrankyService;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PatternsRepository {
    static ArrayList<Pattern> patterns = new ArrayList<>();

    static {
        patterns.add(new Pattern(
                "Factory Method",
                new String[]{"Replace direct object construction calls",
                        "Calls to a factory method",
                        "Objects returned by a factory method are often referred to as products."
                },
                "Creational",
                new String[]{"Avoid tight coupling between the creator and the concrete product",
                    "Single Responsibility Principle", "Open/Closed Principle, new types of data without breaking existing code"},
                new String[]{"when you don’t know beforehand the exact types and dependencies of the objects your code should work with.",
                "when you want to provide users of your library or framework with a way to extend its internal components.",
                "when you want to save system resources by reusing existing objects instead of rebuilding them each time."},
                new String[]{" The code may become more complicated",
                        " need to introduce a lot of new subclasses to implement the pattern."}
        ));
        patterns.add(new Pattern(
                "Prototype",
                new String[]{"Also known as Clone",
                        "Copy existing objects without making your code dependent on their classes.",
                        "delegates the cloning process to the actual objects that are being cloned.",
                        "declares a common interface lets you clone an object without coupling your code to the class of that object, contains just a single clone method.",
                        "prototypes don’t participate in any actual production, playing a passive role instead."
                },
                "Creational",
                new String[]{"can clone objects without coupling to their concrete classes.",
                        "can get rid of repeated initialization code in favor of cloning pre-built prototypes.",
                        "can produce complex objects more conveniently.",
                        "You get an alternative to inheritance when dealing with configuration presets"},
                new String[]{"when your code shouldn’t depend on the concrete classes of objects that you need to copy.",
                        "when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects.",
                        "lets you use a set of pre-built objects configured in various ways as prototypes. Instead of instantiating a subclass that matches some configuration."},
                new String[]{" Cloning complex objects that have circular references might be very tricky."}
        ));
        patterns.add(new Pattern(
                "Decorator",
                new String[]{"The Component declares the common interface for both wrappers and wrapped objects.",
                        "Concrete Component is a class of objects being wrapped. It defines the basic behavior",
                "The Base Decorator class has a field for referencing a wrapped object. The field’s type should be declared as the component interface",
                "Concrete Decorators define extra behaviors that can be added to components dynamically. Concrete decorators override methods of the base decorator and execute their behavior",
                "The Client can wrap components in multiple layers of decorators, as long as it works with all objects"},
                "Structural",
                new String[]{"when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.",
                "when it’s awkward or not possible to extend an object’s behavior using inheritance."},
                new String[]{"You can extend an object’s behavior without making a new subclass.",
                "can add or remove responsibilities from an object at runtime.",
                "can combine several behaviors by wrapping an object into multiple decorators.",
                "Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes."},
                new String[]{"The initial configuration code of layers might look pretty ugly.",
                " It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.",
                " It’s hard to remove a specific wrapper from the wrappers stack."}
        ));
        patterns.add(new Pattern(
                "Adapter",
                new String[]{"design pattern that allows objects with incompatible interfaces to collaborate.",
                "The Client is a class that contains the existing business logic of the program.",
                "The Client Interface describes a protocol that other classes must follow to be able to collaborate with the client code",
                "The Service is some useful class (usually 3rd-party or legacy). The client can’t use this class directly",
                "The Adapter is a class that’s able to work with both the client and the service: it implements the client interface, while wrapping the service object. "},
                "Structural",
                new String[]{"when you want to use some existing class, but its interface isn’t compatible with the rest of your code.",
                "when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass."},
                new String[]{"Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic",
                "Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code"},
                new String[]{"The overall complexity of the code increases because you need to introduce a set of new interfaces and classes."}
                ));
        patterns.add(new Pattern(
                "Chain of Responsibility",
                new String[]{"Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.",
                "The Handler declares the interface, common for all concrete handlers. It usually contains just a single method for handling requests",
                "The Base Handler is an optional class where you can put the boilerplate code that’s common to all handler classes.",
                "Concrete Handlers contain the actual code for processing requests. Upon receiving a request, each handler must decide whether to process it and, additionally, whether to pass it along the chain.",
                "The Client may compose chains just once or compose them dynamically, depending on the application’s logic."},
                "Behavioral",
                new String[]{"when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.",
                "when it’s essential to execute several handlers in a particular order.",
                "when the set of handlers and their order are supposed to change at runtime."},
                new String[]{"You can control the order of request handling.",
                "Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.",
                "Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code."},
                new String[]{"Some requests may end up unhandled."}
                ));
        patterns.add(new Pattern(
                "Strategy",
                new String[]{" lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.",
                "The Context maintains a reference to one of the concrete strategies and communicates with this object only via the strategy interface.",
                "The Strategy interface is common to all concrete strategies. It declares a method the context uses to execute a strategy.",
                "Concrete Strategies implement different variations of an algorithm the context uses",
                " The context doesn’t know what type of strategy it works with or how the algorithm is executed.",
                "The Client creates a specific strategy object and passes it to the context. "},
                "Behavioral",
                new String[]{"when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.",
                "when you have a lot of similar classes that only differ in the way they execute some behavior.",
                "to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.",
                " when your class has a massive conditional statement that switches between different variants of the same algorithm."},
                new String[]{"You can swap algorithms used inside an object at runtime.",
                "You can isolate the implementation details of an algorithm from the code that uses it.",
                "You can replace inheritance with composition.",
                "Open/Closed Principle. You can introduce new strategies without having to change the context."},
                new String[]{"If you only have a couple of algorithms and they rarely change",
                "Clients must be aware of the differences between strategies to be able to select a proper one.",
                "A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm"}
                ));
    }

    public Pattern findByName(String name) {
        return patterns.stream().filter(pattern1 -> pattern1.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
