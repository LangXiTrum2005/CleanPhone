package com.mbridge.msdk.foundation.same.net;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f33809a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f33810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f33811c;

    private e(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f33811c = t10;
        this.f33810b = aVar;
    }

    public static <T> e<T> a(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t10, aVar);
    }
}
