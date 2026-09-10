package com.google.protobuf.kotlin;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Iterator;
import kk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0003J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableIterator;", "E", "", "delegate", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnmodifiableIterator<E> implements Iterator<E>, a {
    private final /* synthetic */ Iterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(Iterator<? extends E> delegate) {
        n.f(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
