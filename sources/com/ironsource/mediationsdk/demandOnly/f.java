package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C0421k5;
import com.ironsource.C0474n4;
import com.ironsource.E9;
import com.ironsource.EnumC0672y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.X7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4 f29435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f29436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7<ISDemandOnlyInterstitialListener> f29437c;

    public f(List<NetworkSettings> list, E9 e10, com.ironsource.mediationsdk.c cVar, X7<ISDemandOnlyInterstitialListener> x10, String str, String str2, P4 p10) {
        String strD = IronSourceUtils.d();
        boolean zJ = e10.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(e10.g(), strD);
        this.f29436b = new ConcurrentHashMap<>();
        this.f29435a = p10;
        this.f29437c = x10;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    g gVar = new g(str, str2, networkSettings, this.f29437c.a(networkSettings.getSubProviderId()), e10.e(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(zJ);
                    this.f29436b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(h.d dVar) {
        String strE = dVar.e();
        String strB = dVar.b();
        try {
            g gVar = this.f29436b.get(strE);
            if (gVar == null) {
                this.f29435a.a(EnumC0672y5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f29437c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                gVar.b();
            } else {
                gVar.a(new o.a(J9.b(C0421k5.b().c(), strB)));
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f29437c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f29436b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f29435a.a(EnumC0672y5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f29436b.get(str);
            if (gVar == null) {
                this.f29435a.a(EnumC0672y5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f29437c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f29437c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f29436b;
    }
}
