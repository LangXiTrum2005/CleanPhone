package com.smartdigimkt.h0;

/* JADX INFO: loaded from: classes5.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f35606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.smartdigimkt.i0.a f35607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.smartdigimkt.n0.c f35608c;

    private l(T t, com.smartdigimkt.n0.c cVar) {
        this.f35607b = null;
        this.f35606a = t;
        this.f35608c = cVar;
    }

    public boolean a() {
        return this.f35607b == null;
    }

    public static <T> l<T> a(T t, com.smartdigimkt.n0.c cVar) {
        return new l<>(t, cVar);
    }

    public static <T> l<T> a(com.smartdigimkt.i0.a aVar) {
        return new l<>(aVar);
    }

    private l(com.smartdigimkt.i0.a aVar) {
        this.f35606a = null;
        this.f35608c = null;
        this.f35607b = aVar;
    }
}
