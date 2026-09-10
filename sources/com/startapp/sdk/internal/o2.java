package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.FailuresHandler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class o2 extends q2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FailuresHandler f41291e;
    public int f;
    public boolean g;

    public o2(x2 x2Var) {
        super(x2Var);
        this.f41291e = CacheMetaData.b().a().c();
        this.f = 0;
        this.g = false;
    }

    @Override // com.startapp.sdk.internal.q2
    public final boolean a() {
        FailuresHandler failuresHandler;
        jh jhVar = ih.f41097a;
        if (jhVar.f41154c || jhVar.f41155e || (failuresHandler = this.f41291e) == null || failuresHandler.a() == null) {
            return false;
        }
        if (this.g) {
            return this.f41291e.b();
        }
        return true;
    }

    @Override // com.startapp.sdk.internal.q2
    public final long b() {
        Long l2;
        if (this.f >= this.f41291e.a().size() || (l2 = this.f41385c) == null) {
            return -1L;
        }
        long millis = TimeUnit.SECONDS.toMillis(((Integer) this.f41291e.a().get(this.f)).intValue()) - (System.currentTimeMillis() - l2.longValue());
        if (millis >= 0) {
            return millis;
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.q2
    public final void c() {
        if (this.f == this.f41291e.a().size() - 1) {
            this.g = true;
        } else {
            this.f++;
        }
        super.c();
    }
}
