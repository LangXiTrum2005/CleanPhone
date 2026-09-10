package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass1 f35114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MBridgeIds f35115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35116d;

    public /* synthetic */ b(BaseComponentStrategy.AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, String str, int i10) {
        this.f35113a = i10;
        this.f35114b = anonymousClass1;
        this.f35115c = mBridgeIds;
        this.f35116d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35113a) {
            case 0:
                this.f35114b.lambda$onVideoLoadFail$6(this.f35115c, this.f35116d);
                break;
            default:
                this.f35114b.lambda$onShowFail$2(this.f35115c, this.f35116d);
                break;
        }
    }
}
