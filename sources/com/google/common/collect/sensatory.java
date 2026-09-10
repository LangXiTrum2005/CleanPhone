package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: FluentIterable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sensatory<E> implements Iterable<E> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Optional<Iterable<E>> f21939kowloon = Optional.absent();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FluentIterable.java */
    public class attabal<T> extends sensatory<T> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Iterable[] f21940arytenoidectomy;

        /* JADX INFO: renamed from: com.google.common.collect.sensatory$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FluentIterable.java */
        public class C0314attabal extends com.google.common.collect.attabal<Iterator<? extends T>> {
            public C0314attabal(int i) {
                super(i);
            }

            @Override // com.google.common.collect.attabal
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> attabal(int i) {
                return attabal.this.f21940arytenoidectomy[i].iterator();
            }
        }

        public attabal(Iterable[] iterableArr) {
            this.f21940arytenoidectomy = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.wireman(new C0314attabal(this.f21940arytenoidectomy.length));
        }
    }

    public static <T> sensatory<T> dern(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            com.google.common.base.formularize.triweekly(iterable);
        }
        return new attabal(iterableArr);
    }

    public static <T> sensatory<T> saneness(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return dern(iterable, iterable2);
    }

    public String toString() {
        return achondroplasia.kowloon(wireman());
    }

    public final Iterable<E> wireman() {
        return this.f21939kowloon.or(this);
    }
}
