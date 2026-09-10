package com.google.common.base;

import com.google.common.collect.FluentIterable;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: com.google.common.base.Optional$1, reason: invalid class name */
    class AnonymousClass1 implements Iterable<Object> {

        /* JADX INFO: renamed from: com.google.common.base.Optional$1$1, reason: invalid class name and collision with other inner class name */
        class C01921 extends AbstractIterator<Object> {
            @Override // com.google.common.base.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            throw null;
        }
    }

    public static Optional d() {
        return Absent.X;
    }

    public static Optional i(Object obj) {
        obj.getClass();
        return new Present(obj);
    }

    public abstract Object g();

    public abstract boolean h();

    public abstract Object j(FluentIterable fluentIterable);

    public abstract Object k();
}
