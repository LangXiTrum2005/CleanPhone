package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass1 f35111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MBridgeIds f35112c;

    public /* synthetic */ a(BaseComponentStrategy.AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, int i10) {
        this.f35110a = i10;
        this.f35111b = anonymousClass1;
        this.f35112c = mBridgeIds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35110a) {
            case 0:
                this.f35111b.lambda$onAdShow$0(this.f35112c);
                break;
            case 1:
                this.f35111b.lambda$onEndCardShow$5(this.f35112c);
                break;
            case 2:
                this.f35111b.lambda$onVideoComplete$4(this.f35112c);
                break;
            case 3:
                this.f35111b.lambda$onVideoAdClicked$3(this.f35112c);
                break;
            case 4:
                this.f35111b.lambda$onLoadSuccess$8(this.f35112c);
                break;
            default:
                this.f35111b.lambda$onVideoLoadSuccess$7(this.f35112c);
                break;
        }
    }
}
