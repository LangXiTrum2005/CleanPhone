package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class zh extends e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ge f41781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f41782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bi f41783c;

    public zh(bi biVar, ge geVar, long j) {
        this.f41783c = biVar;
        this.f41781a = geVar;
        this.f41782b = j;
    }

    @Override // com.startapp.sdk.internal.e3
    public final void a(cb cbVar) {
        bi biVar = this.f41783c;
        int iAbs = Math.abs(Arrays.hashCode(this.f41781a.f41011a));
        long j = this.f41782b;
        synchronized (biVar) {
            biVar.f40840b.put(Integer.valueOf(iAbs), biVar.f40841c.scheduleAtFixedRate(cbVar, j, j, TimeUnit.MILLISECONDS));
        }
    }
}
