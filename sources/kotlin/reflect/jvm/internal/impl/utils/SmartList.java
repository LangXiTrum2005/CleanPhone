package kotlin.reflect.jvm.internal.impl.utils;

import android.support.v4.media.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f44647Y;

    public static class EmptyIterator<T> implements Iterator<T> {
        public static final EmptyIterator X = new EmptyIterator();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    public class SingletonIterator extends SingletonIteratorBase<E> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f44648Y;

        public SingletonIterator() {
            this.f44648Y = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public final void a() {
            SmartList smartList = SmartList.this;
            int i2 = ((AbstractList) smartList).modCount;
            int i3 = this.f44648Y;
            if (i2 == i3) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i3);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public final Object b() {
            return SmartList.this.f44647Y;
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            SmartList.this.clear();
        }
    }

    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {
        public boolean X;

        public abstract void a();

        public abstract Object b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.X;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.X) {
                throw new NoSuchElementException();
            }
            this.X = true;
            a();
            return b();
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
        switch (i2) {
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
        if (i2 == 2 || i2 == 3) {
            objArr[1] = "iterator";
        } else if (i2 == 5 || i2 == 6 || i2 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i2) {
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
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6 && i2 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i2 = this.X;
        if (i2 == 0) {
            this.f44647Y = obj;
        } else if (i2 == 1) {
            this.f44647Y = new Object[]{this.f44647Y, obj};
        } else {
            Object[] objArr = (Object[]) this.f44647Y;
            int length = objArr.length;
            if (i2 >= length) {
                int iB = a.B(length, 3, 2, 1);
                int i3 = i2 + 1;
                if (iB < i3) {
                    iB = i3;
                }
                Object[] objArr2 = new Object[iB];
                this.f44647Y = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.X] = obj;
        }
        this.X++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f44647Y = null;
        this.X = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3;
        if (i2 >= 0 && i2 < (i3 = this.X)) {
            return i3 == 1 ? this.f44647Y : ((Object[]) this.f44647Y)[i2];
        }
        StringBuilder sbU = a.u(i2, "Index: ", ", Size: ");
        sbU.append(this.X);
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i2 = this.X;
        if (i2 == 0) {
            return EmptyIterator.X;
        }
        if (i2 == 1) {
            return new SingletonIterator();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3;
        Object obj;
        if (i2 < 0 || i2 >= (i3 = this.X)) {
            StringBuilder sbU = a.u(i2, "Index: ", ", Size: ");
            sbU.append(this.X);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        if (i3 == 1) {
            obj = this.f44647Y;
            this.f44647Y = null;
        } else {
            Object[] objArr = (Object[]) this.f44647Y;
            Object obj2 = objArr[i2];
            if (i3 == 2) {
                this.f44647Y = objArr[1 - i2];
            } else {
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i4);
                }
                objArr[this.X - 1] = null;
            }
            obj = obj2;
        }
        this.X--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.X)) {
            StringBuilder sbU = a.u(i2, "Index: ", ", Size: ");
            sbU.append(this.X);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        if (i3 == 1) {
            Object obj2 = this.f44647Y;
            this.f44647Y = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f44647Y;
        Object obj3 = objArr[i2];
        objArr[i2] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i2 = this.X;
        if (i2 >= 2) {
            Arrays.sort((Object[]) this.f44647Y, 0, i2, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i2 = this.X;
        if (i2 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) a.e(1, objArr);
                objArr2[0] = this.f44647Y;
                return objArr2;
            }
            objArr[0] = this.f44647Y;
        } else {
            if (length < i2) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f44647Y, i2, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i2 != 0) {
                System.arraycopy(this.f44647Y, 0, objArr, 0, i2);
            }
        }
        int i3 = this.X;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        if (i2 >= 0 && i2 <= (i3 = this.X)) {
            if (i3 == 0) {
                this.f44647Y = obj;
            } else if (i3 == 1 && i2 == 0) {
                this.f44647Y = new Object[]{obj, this.f44647Y};
            } else {
                Object[] objArr = new Object[i3 + 1];
                if (i3 == 1) {
                    objArr[0] = this.f44647Y;
                } else {
                    Object[] objArr2 = (Object[]) this.f44647Y;
                    System.arraycopy(objArr2, 0, objArr, 0, i2);
                    System.arraycopy(objArr2, i2, objArr, i2 + 1, this.X - i2);
                }
                objArr[i2] = obj;
                this.f44647Y = objArr;
            }
            this.X++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = a.u(i2, "Index: ", ", Size: ");
        sbU.append(this.X);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
