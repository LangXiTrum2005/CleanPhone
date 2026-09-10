package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass2 f35122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MBridgeIds f35123c;

    public /* synthetic */ d(BaseComponentStrategy.AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, int i10) {
        this.f35121a = i10;
        this.f35122b = anonymousClass2;
        this.f35123c = mBridgeIds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35121a) {
            case 0:
                this.f35122b.lambda$onVideoAdClicked$3(this.f35123c);
                break;
            case 1:
                this.f35122b.lambda$onEndCardShow$5(this.f35123c);
                break;
            case 2:
                this.f35122b.lambda$onAdShow$0(this.f35123c);
                break;
            case 3:
                this.f35122b.lambda$onLoadSuccess$8(this.f35123c);
                break;
            case 4:
                this.f35122b.lambda$onVideoComplete$4(this.f35123c);
                break;
            default:
                this.f35122b.lambda$onVideoLoadSuccess$7(this.f35123c);
                break;
        }
    }
}
