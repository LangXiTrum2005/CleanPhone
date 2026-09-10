package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f33814c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f33812a = i10;
        this.f33814c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f33812a = i10;
        this.f33814c = aVar;
        this.f33813b = str;
    }
}
