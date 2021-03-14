package CreationalPatterns.Prototype;

public abstract class Pizza implements Cloneable {
    abstract Pizza make() throws CloneNotSupportedException;
}
