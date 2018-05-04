package sample01

import groovy.transform.Canonical

/**
 * 1. The class is public by default.
 * 2. Attributes are private by default.
 * 3. Methods are public by default.
 * 4. Getter and setter methods are generated for each attribute not marked public or private
 * 5. Both a default constructor and a "map-based" constructor (uses arguments of the
 * form "attribute:value") are provided.
 */
@Canonical
class Event {
    String name
    Date when
    int priority
}

Event event = new Event(name: 'Android Stdio 1.0',
        when: new Date(),
        priority: 1)
println(event.toString())

