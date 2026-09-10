package com.smartdigimkt.l4;

import com.smartdigimkt.n4.k;
import com.smartdigimkt.w3.m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f36356i;

    public i(com.smartdigimkt.n4.h hVar, k kVar, m mVar, int i2, Object obj, long j, long j2, long j3) {
        super(hVar, kVar, 1, mVar, i2, obj, j, j2);
        com.smartdigimkt.p4.a.a(mVar);
        this.f36356i = j3;
    }

    public long e() {
        long j = this.f36356i;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
