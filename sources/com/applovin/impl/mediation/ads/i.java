package com.applovin.impl.mediation.ads;

import com.applovin.impl.e3;
import com.applovin.mediation.MaxAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8575c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f8573a = i10;
        this.f8574b = obj;
        this.f8575c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8573a) {
            case 0:
                ((MaxNativeAdLoaderImpl.c) this.f8574b).a((MaxAd) this.f8575c);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f8574b).a((Long) this.f8575c);
                break;
            case 2:
                ((MaxFullscreenAdImpl.b) this.f8574b).a((MaxAd) this.f8575c);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.f8574b).a((e3) this.f8575c);
                break;
        }
    }
}
