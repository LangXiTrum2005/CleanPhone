package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface EventStore extends Closeable {
    void A0(long j, TransportContext transportContext);

    Iterable F();

    PersistedEvent F0(TransportContext transportContext, EventInternal eventInternal);

    long X(TransportContext transportContext);

    boolean Z(TransportContext transportContext);

    void a0(Iterable iterable);

    Iterable g0(TransportContext transportContext);

    int y();

    void z(Iterable iterable);
}
