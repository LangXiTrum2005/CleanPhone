package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sayid {

    /* JADX INFO: compiled from: Collections2.java */
    public static class attabal<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final com.google.common.base.impassible<? super E> f21937arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Collection<E> f21938kowloon;

        public attabal(Collection<E> collection2, com.google.common.base.impassible<? super E> impassibleVar) {
            this.f21938kowloon = collection2;
            this.f21937arytenoidectomy = impassibleVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            com.google.common.base.formularize.wireman(this.f21937arytenoidectomy.apply(e));
            return this.f21938kowloon.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection2) {
            Iterator<? extends E> it = collection2.iterator();
            while (it.hasNext()) {
                com.google.common.base.formularize.wireman(this.f21937arytenoidectomy.apply(it.next()));
            }
            return this.f21938kowloon.addAll(collection2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            achondroplasia.cutely(this.f21938kowloon, this.f21937arytenoidectomy);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            if (sayid.dern(this.f21938kowloon, obj)) {
                return this.f21937arytenoidectomy.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection2) {
            return sayid.attabal(this, collection2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !achondroplasia.saneness(this.f21938kowloon, this.f21937arytenoidectomy);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.cutely(this.f21938kowloon.iterator(), this.f21937arytenoidectomy);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            return contains(obj) && this.f21938kowloon.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection2) {
            Iterator<E> it = this.f21938kowloon.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f21937arytenoidectomy.apply(next) && collection2.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection2) {
            Iterator<E> it = this.f21938kowloon.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f21937arytenoidectomy.apply(next) && !collection2.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f21938kowloon.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f21937arytenoidectomy.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.taiyuan(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.taiyuan(iterator()).toArray(tArr);
        }
    }

    public static boolean attabal(Collection<?> collection2, Collection<?> collection3) {
        Iterator<?> it = collection3.iterator();
        while (it.hasNext()) {
            if (!collection2.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean dern(Collection<?> collection2, @CheckForNull Object obj) {
        com.google.common.base.formularize.triweekly(collection2);
        try {
            return collection2.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static StringBuilder saneness(int i) {
        lotta.saneness(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static String wireman(Collection<?> collection2) {
        StringBuilder sbSaneness = saneness(collection2.size());
        sbSaneness.append('[');
        boolean z = true;
        for (Object obj : collection2) {
            if (!z) {
                sbSaneness.append(", ");
            }
            if (obj == collection2) {
                sbSaneness.append("(this Collection)");
            } else {
                sbSaneness.append(obj);
            }
            z = false;
        }
        sbSaneness.append(']');
        return sbSaneness.toString();
    }
}
