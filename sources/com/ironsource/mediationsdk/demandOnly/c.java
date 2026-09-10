package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C0421k5;
import com.ironsource.EnumC0672y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.U2;
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
public class c implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f29410a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P4 f29411b;

    public c(List<NetworkSettings> list, U2 u6, String str, String str2, P4 p10) {
        String strD = IronSourceUtils.d();
        boolean zK = u6.k();
        this.f29411b = p10;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(u6.d(), strD));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterA != null) {
                    d dVar = new d(str, str2, networkSettings, u6.b(), abstractAdapterA, eVar);
                    dVar.a(zK);
                    this.f29410a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f29410a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f29411b.a(EnumC0672y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f29410a.get(str);
        if (dVar == null) {
            this.f29411b.a(EnumC0672y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new o.a(J9.b(C0421k5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f29410a.get(str);
        if (dVar == null) {
            this.f29411b.a(EnumC0672y5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
