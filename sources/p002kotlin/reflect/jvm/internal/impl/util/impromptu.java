package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu extends dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final impromptu f31857kowloon = new impromptu();

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class attabal implements Iterator, unready.attabal {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }
    }

    public impromptu() {
        super(null);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public void wireman(int i, Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern, java.lang.Iterable
    public Iterator iterator() {
        return new attabal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public Void get(int i) {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public int saneness() {
        return 0;
    }
}
