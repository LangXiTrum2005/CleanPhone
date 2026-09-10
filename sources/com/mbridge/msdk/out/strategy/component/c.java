package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MBridgeIds f35118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RewardInfo f35119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.mbridge.msdk.config.manager.callback.b f35120d;

    public /* synthetic */ c(com.mbridge.msdk.config.manager.callback.b bVar, MBridgeIds mBridgeIds, RewardInfo rewardInfo, int i10) {
        this.f35117a = i10;
        this.f35120d = bVar;
        this.f35118b = mBridgeIds;
        this.f35119c = rewardInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35117a) {
            case 0:
                ((BaseComponentStrategy.AnonymousClass1) this.f35120d).lambda$onAdClose$1(this.f35118b, this.f35119c);
                break;
            default:
                ((BaseComponentStrategy.AnonymousClass2) this.f35120d).lambda$onAdClose$1(this.f35118b, this.f35119c);
                break;
        }
    }
}
