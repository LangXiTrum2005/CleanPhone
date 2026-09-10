package com.smartdigimkt.l4;

import com.smartdigimkt.n4.k;
import com.smartdigimkt.n4.t;
import com.smartdigimkt.w3.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements t.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f36340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f36342c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f36343e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final com.smartdigimkt.n4.h f36344h;

    public c(com.smartdigimkt.n4.h hVar, k kVar, int i2, m mVar, int i3, Object obj, long j, long j2) {
        this.f36344h = (com.smartdigimkt.n4.h) com.smartdigimkt.p4.a.a(hVar);
        this.f36340a = (k) com.smartdigimkt.p4.a.a(kVar);
        this.f36341b = i2;
        this.f36342c = mVar;
        this.d = i3;
        this.f36343e = obj;
        this.f = j;
        this.g = j2;
    }

    public abstract long c();

    public final long d() {
        return this.g - this.f;
    }
}
