package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass2 f35125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MBridgeIds f35126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35127d;

    public /* synthetic */ e(BaseComponentStrategy.AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str, int i10) {
        this.f35124a = i10;
        this.f35125b = anonymousClass2;
        this.f35126c = mBridgeIds;
        this.f35127d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35124a) {
            case 0:
                this.f35125b.lambda$onShowFail$2(this.f35126c, this.f35127d);
                break;
            default:
                this.f35125b.lambda$onVideoLoadFail$6(this.f35126c, this.f35127d);
                break;
        }
    }
}
