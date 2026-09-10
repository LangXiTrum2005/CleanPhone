package com.p004ironsource.mediationsdk.demandOnly;

import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.ac;
import com.p004ironsource.bs;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.f;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.ta;
import com.p004ironsource.ug;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class k implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ta f25853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, l> f25854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ug<ISDemandOnlyRewardedVideoListener> f25855c;

    public k(List<NetworkSettings> list, bs bsVar, c cVar, ug<ISDemandOnlyRewardedVideoListener> ugVar, String str, String str2, ta taVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zD = bsVar.d();
        f fVar = new f(bsVar.k(), sessionId);
        this.f25854b = new ConcurrentHashMap<>();
        this.f25853a = taVar;
        this.f25855c = ugVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    l lVar = new l(str, str2, networkSettings, this.f25855c.a(networkSettings.getSubProviderId()), bsVar.i(), abstractAdapterA, new e(fVar));
                    lVar.a(zD);
                    this.f25854b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, l> a() {
        return this.f25854b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.f25854b.get(str);
            if (lVar != null) {
                lVar.e();
                return;
            }
            this.f25853a.a(ac.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f25855c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e2) {
            StringBuilder sbO = a.o(e2, "showRewardedVideo exception ");
            sbO.append(e2.getMessage());
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, sbO.toString());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f25855c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String instanceId = dVar.getInstanceId();
        try {
            l lVar = this.f25854b.get(instanceId);
            if (lVar == null) {
                this.f25853a.a(ac.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, instanceId);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f25855c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.getCom.smartdigimkt.m6.a.r.z java.lang.String()) {
                lVar.b(new o.a(IronSourceAES.decode(mb.b().c(), dVar.getAdMarkup())));
            } else {
                lVar.d();
            }
        } catch (Exception e2) {
            StringBuilder sbO = a.o(e2, "loadRewardedVideo exception ");
            sbO.append(e2.getMessage());
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(sbO.toString());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f25855c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.f25854b.get(str);
        if (lVar != null) {
            return lVar.a();
        }
        this.f25853a.a(ac.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }
}
