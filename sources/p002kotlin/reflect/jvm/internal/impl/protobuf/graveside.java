package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes5.dex */
public class graveside extends AbstractList<String> implements RandomAccess, formularize {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final formularize f31121kowloon;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class attabal implements ListIterator<String> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ int f31122arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public ListIterator<String> f31123kowloon;

        public attabal(int i) {
            this.f31122arytenoidectomy = i;
            this.f31123kowloon = graveside.this.f31121kowloon.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f31123kowloon.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f31123kowloon.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31123kowloon.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31123kowloon.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f31123kowloon.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f31123kowloon.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class saneness implements Iterator<String> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public Iterator<String> f31126kowloon;

        public saneness() {
            this.f31126kowloon = graveside.this.f31121kowloon.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f31126kowloon.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31126kowloon.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public graveside(formularize formularizeVar) {
        this.f31121kowloon = formularizeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return this.f31121kowloon.get(i);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public wireman getByteString(int i) {
        return this.f31121kowloon.getByteString(i);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public List<?> getUnderlyingElements() {
        return this.f31121kowloon.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new saneness();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new attabal(i);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public void polder(wireman wiremanVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f31121kowloon.size();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.formularize
    public formularize getUnmodifiableView() {
        return this;
    }
}
