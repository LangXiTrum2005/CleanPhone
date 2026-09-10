package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public abstract class Traverser<N> {

    /* JADX INFO: renamed from: com.google.common.graph.Traverser$1, reason: invalid class name */
    class AnonymousClass1 extends Traverser<Object> {
    }

    /* JADX INFO: renamed from: com.google.common.graph.Traverser$2, reason: invalid class name */
    class AnonymousClass2 extends Traverser<Object> {
    }

    /* JADX INFO: renamed from: com.google.common.graph.Traverser$3, reason: invalid class name */
    class AnonymousClass3 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.Traverser$4, reason: invalid class name */
    class AnonymousClass4 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.Traverser$5, reason: invalid class name */
    class AnonymousClass5 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            throw null;
        }
    }

    public enum InsertionOrder {
        /* JADX INFO: Fake field, exist only in values array */
        EF2 { // from class: com.google.common.graph.Traverser.InsertionOrder.1
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF7 { // from class: com.google.common.graph.Traverser.InsertionOrder.2
        }
    }

    public static abstract class Traversal<N> {

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$Traversal$1, reason: invalid class name */
        class AnonymousClass1 extends Traversal<Object> {
            @Override // com.google.common.graph.Traverser.Traversal
            public final Object a(ArrayDeque arrayDeque) {
                Iterator it = (Iterator) arrayDeque.getFirst();
                if (it.hasNext()) {
                    Objects.requireNonNull(it.next());
                    throw null;
                }
                arrayDeque.removeFirst();
                return null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$Traversal$2, reason: invalid class name */
        class AnonymousClass2 extends Traversal<Object> {
            @Override // com.google.common.graph.Traverser.Traversal
            public final Object a(ArrayDeque arrayDeque) {
                Iterator it = (Iterator) arrayDeque.getFirst();
                if (!it.hasNext()) {
                    arrayDeque.removeFirst();
                    return null;
                }
                Object next = it.next();
                next.getClass();
                return next;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$Traversal$3, reason: invalid class name */
        class AnonymousClass3 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$Traversal$4, reason: invalid class name */
        class AnonymousClass4 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public abstract Object a(ArrayDeque arrayDeque);
    }
}
