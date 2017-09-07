public final class LazyInitialization<T> {

    private final T[] elements;

    public LazyInitialization(T[] elements) {
        this.elements = elements;
    }

    public boolean read(int i) {
        return elements[i] == null;
    }
}
