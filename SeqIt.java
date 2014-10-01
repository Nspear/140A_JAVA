// the SeqIt base interface

public interface SeqIt {
    public boolean hasNext();
    public int next() throws UsingIteratorPastEndException;
}
