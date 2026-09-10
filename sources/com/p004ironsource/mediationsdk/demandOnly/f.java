package com.p004ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.ac;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.ta;
import com.p004ironsource.ug;
import com.p004ironsource.uj;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class f implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ta f25830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f25831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ug<ISDemandOnlyInterstitialListener> f25832c;

    public f(List<NetworkSettings> list, uj ujVar, c cVar, ug<ISDemandOnlyInterstitialListener> ugVar, String str, String str2, ta taVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zJ = ujVar.j();
        com.p004ironsource.mediationsdk.f fVar = new com.p004ironsource.mediationsdk.f(ujVar.g(), sessionId);
        this.f25831b = new ConcurrentHashMap<>();
        this.f25830a = taVar;
        this.f25832c = ugVar;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    g gVar = new g(str, str2, networkSettings, this.f25832c.a(networkSettings.getSubProviderId()), ujVar.e(), abstractAdapterA, new e(fVar));
                    gVar.a(zJ);
                    this.f25831b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f25831b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f25831b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f25830a.a(ac.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(h.d dVar) {
        String instanceId = dVar.getInstanceId();
        String adMarkup = dVar.getAdMarkup();
        try {
            g gVar = this.f25831b.get(instanceId);
            if (gVar == null) {
                this.f25830a.a(ac.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, instanceId);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f25832c.a(instanceId).onInterstitialAdLoadFailed(instanceId, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(adMarkup)) {
                gVar.c();
            } else {
                gVar.a(new o.a(IronSourceAES.decode(mb.b().c(), adMarkup)));
            }
        } catch (Exception e2) {
            StringBuilder sbO = a.o(e2, "loadInterstitial exception ");
            sbO.append(e2.getMessage());
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(sbO.toString());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f25832c.a(instanceId).onInterstitialAdLoadFailed(instanceId, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f25831b.get(str);
            if (gVar != null) {
                gVar.b();
                return;
            }
            this.f25830a.a(ac.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f25832c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e2) {
            StringBuilder sbO = a.o(e2, "showInterstitial exception ");
            sbO.append(e2.getMessage());
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", sbO.toString());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f25832c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }
}
