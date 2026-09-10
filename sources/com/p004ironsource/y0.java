package com.p004ironsource;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/y0;", "Lcom/ironsource/x0;", "", "a", "Lcom/ironsource/zj;", d9.h.p0, "", "loadParams", "", "Lcom/ironsource/xo;", "Lcom/ironsource/xo;", "networkLoadApi", "<init>", "(Lcom/ironsource/xo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class y0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xo networkLoadApi;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/y0$a;", "", "", "b", "I", "LOAD_EXCEPTION", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27745a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int LOAD_EXCEPTION = 1000;

        private a() {
        }
    }

    public y0(xo networkLoadApi) {
        Intrinsics.f(networkLoadApi, "networkLoadApi");
        this.networkLoadApi = networkLoadApi;
    }

    @Override // com.p004ironsource.x0
    public String a() {
        return this.networkLoadApi.a();
    }

    @Override // com.p004ironsource.x0
    public void a(zj adInstance, Map<String, String> loadParams) {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(loadParams, "loadParams");
        try {
            this.networkLoadApi.a(adInstance, new zo(null, false, 3, null));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e2.getMessage());
            String strM = Z.m(e2, new StringBuilder("1000: loadAd failed: "));
            kp kpVarB = adInstance.b();
            if (kpVarB instanceof bd) {
                kp kpVarB2 = adInstance.b();
                Intrinsics.d(kpVarB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((bd) kpVarB2).onInterstitialLoadFailed(strM);
            } else if (kpVarB instanceof mp) {
                kp kpVarB3 = adInstance.b();
                Intrinsics.d(kpVarB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((mp) kpVarB3).onBannerLoadFail(strM);
            }
        }
    }
}
