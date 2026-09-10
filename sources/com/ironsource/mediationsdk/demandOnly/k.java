package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C0323ee;
import com.ironsource.C0421k5;
import com.ironsource.C0474n4;
import com.ironsource.EnumC0672y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.X7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4 f29473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f29474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7<ISDemandOnlyRewardedVideoListener> f29475c;

    public k(List<NetworkSettings> list, C0323ee c0323ee, com.ironsource.mediationsdk.c cVar, X7<ISDemandOnlyRewardedVideoListener> x10, String str, String str2, P4 p10) {
        String strD = IronSourceUtils.d();
        boolean zD = c0323ee.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(c0323ee.k(), strD);
        this.f29474b = new ConcurrentHashMap<>();
        this.f29473a = p10;
        this.f29475c = x10;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    l lVar = new l(str, str2, networkSettings, this.f29475c.a(networkSettings.getSubProviderId()), c0323ee.i(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(zD);
                    this.f29474b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String strE = dVar.e();
        try {
            l lVar = this.f29474b.get(strE);
            if (lVar == null) {
                this.f29473a.a(EnumC0672y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f29475c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.c()) {
                lVar.b(new o.a(J9.b(C0421k5.b().c(), dVar.b())));
            } else {
                lVar.c();
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f29475c.a(strE).onRewardedVideoAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f29474b.get(str);
            if (lVar != null) {
                lVar.d();
                return;
            }
            this.f29473a.a(EnumC0672y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f29475c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f29475c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f29474b.get(str);
        if (lVar == null) {
            this.f29473a.a(EnumC0672y5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return lVar.a();
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f29474b;
    }
}
