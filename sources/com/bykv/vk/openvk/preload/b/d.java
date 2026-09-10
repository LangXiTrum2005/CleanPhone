package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<IN, OUT> {
    private static AtomicLong d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f308a;
    IN b;
    OUT c;
    private com.bykv.vk.openvk.preload.b.b.a e;
    private b f;
    private long g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this);
    }

    public final OUT f() {
        return this.c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f = new c(bVar);
        this.f308a = dVar;
        this.b = in;
        this.e = aVar;
        if (dVar != null) {
            this.g = dVar.g;
        } else {
            long andIncrement = d.getAndIncrement();
            this.g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this, th);
    }
}
