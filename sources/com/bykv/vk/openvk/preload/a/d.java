package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<IN, OUT> {
    private static AtomicLong d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f12861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f12862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f12863c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f12864e;
    private b f;
    private long g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this);
    }

    public final OUT f() {
        return this.f12863c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f = new m(bVar);
        this.f12861a = dVar;
        this.f12862b = in;
        this.f12864e = aVar;
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
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f12864e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f, this, th);
    }
}
