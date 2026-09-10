package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg f21865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21867c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class[] f21869e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Method f21868d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f21870f = new CountDownLatch(1);

    public xg(fg fgVar, String str, String str2, Class... clsArr) {
        this.f21865a = fgVar;
        this.f21866b = str;
        this.f21867c = str2;
        this.f21869e = clsArr;
        fgVar.f14388b.submit(new d(this, 7));
    }
}
