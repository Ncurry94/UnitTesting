
package ilinkedlist;


public class ILinkedList<T> implements ILinkedListInterface<T> {

    private ILinkedList<T> head;
    private ILinkedList<T> tail;
    private T element;
   
    

    @Override
    public ILinkedList<T> next() {
        return this.head;
    }

    @Override
    public ILinkedList<T> last() {
         ILinkedList temp = this;
        while(temp.next() != null)
        {
            temp = temp.next();
        }
        return temp;
    }

    @Override
    public ILinkedList<T> after(int n) {
        ILinkedList temp = this;
        for(int i = 0; i < n; i++)
        {
            temp = temp.next();
        }
        return temp;
    }
    

    public ILinkedList<T> detach() {
        ILinkedList temp = this.head;
        this.head = null;
        return temp;
    }

    public T get() {
        return this.element;
    }

    public void set(T data) {
        this.element = element;
    }

    @Override
    public void setNext(ILinkedList<T> next) {
        this.head = next;
    }

    @Override
    public void append(ILinkedList<T> next) {
        ILinkedList temp = this;
        temp = temp.last();
        temp.head = next;
    }

    @Override
    public void insert(ILinkedList<T> newFirst) {
        ILinkedList temp = this;
        newFirst.next();
        newFirst = temp;   
    }
    
}//class
