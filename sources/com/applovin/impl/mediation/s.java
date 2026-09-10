package com.applovin.impl.mediation;

import com.applovin.impl.e3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8784c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f8782a = i10;
        this.f8783b = obj;
        this.f8784c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8782a) {
            case 0:
                ((h.b) this.f8783b).a((MaxError) this.f8784c);
                break;
            case 1:
                ((MediationServiceImpl.b) this.f8783b).a((MaxAd) this.f8784c);
                break;
            case 2:
                ((b) this.f8783b).c((e3) this.f8784c);
                break;
            case 3:
                ((c) this.f8783b).a((e3) this.f8784c);
                break;
            default:
                ((h) this.f8783b).a((Runnable) this.f8784c);
                break;
        }
    }
}
