package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class triweekly<T> extends dern<T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f31912kowloon;
    private final T value;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class attabal implements Iterator<T>, unready.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ triweekly<T> f31913arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f31914kowloon = true;

        public attabal(triweekly<T> triweeklyVar) {
            this.f31913arytenoidectomy = triweeklyVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31914kowloon;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f31914kowloon) {
                throw new NoSuchElementException();
            }
            this.f31914kowloon = false;
            return this.f31913arytenoidectomy.beachfront();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public triweekly(T value, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.f31912kowloon = i;
    }

    public final T beachfront() {
        return this.value;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public T get(int i) {
        if (i == this.f31912kowloon) {
            return this.value;
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern, java.lang.Iterable
    public Iterator<T> iterator() {
        return new attabal(this);
    }

    public final int marial() {
        return this.f31912kowloon;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public int saneness() {
        return 1;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public void wireman(int i, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}
