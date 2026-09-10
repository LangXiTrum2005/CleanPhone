package com.smartdigimkt.l4;

import com.smartdigimkt.n4.k;
import com.smartdigimkt.w3.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends i {
    public final long j;
    private b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f36336l;

    public a(com.smartdigimkt.n4.h hVar, k kVar, m mVar, int i2, Object obj, long j, long j2, long j3, long j4) {
        super(hVar, kVar, mVar, i2, obj, j, j2, j4);
        this.j = j3;
    }

    public void a(b bVar) {
        this.k = bVar;
        this.f36336l = bVar.a();
    }

    public final b g() {
        return this.k;
    }

    public final int a(int i2) {
        return this.f36336l[i2];
    }
}
