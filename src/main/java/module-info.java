module jmavlib {
    requires java.xml;
    requires java.desktop;

    exports me.drton.jmavlib.conversion;
    exports me.drton.jmavlib.geo;
    exports me.drton.jmavlib.log;
    exports me.drton.jmavlib.log.px4;
    exports me.drton.jmavlib.log.ulog;
    exports me.drton.jmavlib.mavlink;
    exports me.drton.jmavlib.processing;
}