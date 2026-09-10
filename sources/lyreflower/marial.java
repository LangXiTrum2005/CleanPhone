package lyreflower;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SmartList.java */
/* JADX INFO: loaded from: classes5.dex */
public class marial<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Object f33201arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f33202kowloon;

    /* JADX INFO: compiled from: SmartList.java */
    public class dern extends wireman<E> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f33203arytenoidectomy;

        public dern() {
            super();
            this.f33203arytenoidectomy = ((AbstractList) marial.this).modCount;
        }

        @Override // lyreflower.marial.wireman
        public void attabal() {
            if (((AbstractList) marial.this).modCount == this.f33203arytenoidectomy) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) marial.this).modCount + "; expected: " + this.f33203arytenoidectomy);
        }

        @Override // java.util.Iterator
        public void remove() {
            attabal();
            marial.this.clear();
        }

        @Override // lyreflower.marial.wireman
        public E saneness() {
            return (E) marial.this.f33201arytenoidectomy;
        }
    }

    /* JADX INFO: compiled from: SmartList.java */
    public static class saneness<T> implements Iterator<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final saneness f33205kowloon = new saneness();

        public static <T> saneness<T> attabal() {
            return f33205kowloon;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: SmartList.java */
    public static abstract class wireman<T> implements Iterator<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f33206kowloon;

        public wireman() {
        }

        public abstract void attabal();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f33206kowloon;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f33206kowloon) {
                throw new NoSuchElementException();
            }
            this.f33206kowloon = true;
            attabal();
            return saneness();
        }

        public abstract T saneness();
    }

    public static /* synthetic */ void saneness(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.f33202kowloon;
        if (i == 0) {
            this.f33201arytenoidectomy = e;
        } else if (i == 1) {
            this.f33201arytenoidectomy = new Object[]{this.f33201arytenoidectomy, e};
        } else {
            Object[] objArr = (Object[]) this.f33201arytenoidectomy;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f33201arytenoidectomy = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f33202kowloon] = e;
        }
        this.f33202kowloon++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f33201arytenoidectomy = null;
        this.f33202kowloon = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f33202kowloon)) {
            return i2 == 1 ? (E) this.f33201arytenoidectomy : (E) ((Object[]) this.f33201arytenoidectomy)[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f33202kowloon);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i = this.f33202kowloon;
        if (i == 0) {
            saneness sanenessVarAttabal = saneness.attabal();
            if (sanenessVarAttabal == null) {
                saneness(2);
            }
            return sanenessVarAttabal;
        }
        if (i == 1) {
            return new dern();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            saneness(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f33202kowloon)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f33202kowloon);
        }
        if (i2 == 1) {
            e = (E) this.f33201arytenoidectomy;
            this.f33201arytenoidectomy = null;
        } else {
            Object[] objArr = (Object[]) this.f33201arytenoidectomy;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.f33201arytenoidectomy = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f33202kowloon - 1] = null;
            }
            e = (E) obj;
        }
        this.f33202kowloon--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f33202kowloon)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f33202kowloon);
        }
        if (i2 == 1) {
            E e2 = (E) this.f33201arytenoidectomy;
            this.f33201arytenoidectomy = e;
            return e2;
        }
        Object[] objArr = (Object[]) this.f33201arytenoidectomy;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33202kowloon;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f33202kowloon;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f33201arytenoidectomy, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            saneness(4);
        }
        int length = tArr.length;
        int i = this.f33202kowloon;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f33201arytenoidectomy;
                return tArr2;
            }
            tArr[0] = this.f33201arytenoidectomy;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f33201arytenoidectomy, i, tArr.getClass());
                if (tArr3 == null) {
                    saneness(6);
                }
                return tArr3;
            }
            if (i != 0) {
                System.arraycopy(this.f33201arytenoidectomy, 0, tArr, 0, i);
            }
        }
        int i2 = this.f33202kowloon;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f33202kowloon)) {
            if (i2 == 0) {
                this.f33201arytenoidectomy = e;
            } else if (i2 == 1 && i == 0) {
                this.f33201arytenoidectomy = new Object[]{e, this.f33201arytenoidectomy};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f33201arytenoidectomy;
                } else {
                    Object[] objArr2 = (Object[]) this.f33201arytenoidectomy;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f33202kowloon - i);
                }
                objArr[i] = e;
                this.f33201arytenoidectomy = objArr;
            }
            this.f33202kowloon++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f33202kowloon);
    }
}
