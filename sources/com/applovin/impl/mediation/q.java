package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f11308Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ q(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f11308Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                ((h.b) this.f11308Y).a((MaxError) this.Z);
                break;
            case 1:
                ((MediationServiceImpl.b) this.f11308Y).a((MaxAd) this.Z);
                break;
            case 2:
                ((b) this.f11308Y).c((c3) this.Z);
                break;
            case 3:
                ((c) this.f11308Y).a((c3) this.Z);
                break;
            default:
                ((h) this.f11308Y).a((Runnable) this.Z);
                break;
        }
    }
}
