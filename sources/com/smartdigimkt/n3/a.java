package com.smartdigimkt.n3;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<R, E> implements e<R, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f36981a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f36982b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<Integer> f36983c = new CopyOnWriteArrayList<>();
    private d<R, E> d;

    @Override // com.smartdigimkt.n3.e
    public void a(R r, int i2) {
        if (this.f36981a.get() || this.f36983c.contains(Integer.valueOf(i2))) {
            return;
        }
        this.f36983c.add(Integer.valueOf(i2));
        if (this.f36982b.decrementAndGet() == 0) {
            this.f36981a.set(true);
            d<R, E> dVar = this.d;
            if (dVar != null) {
                dVar.a(r);
            }
        }
    }

    @Override // com.smartdigimkt.n3.e
    public void a(E e2) {
        if (this.f36981a.get()) {
            return;
        }
        this.f36981a.set(true);
        d<R, E> dVar = this.d;
        if (dVar != null) {
            dVar.b(e2);
        }
    }

    @Override // com.smartdigimkt.n3.e
    public void a(int i2) {
        this.f36982b.set(i2);
    }

    @Override // com.smartdigimkt.n3.e
    public void a(d<R, E> dVar) {
        this.d = dVar;
    }
}
