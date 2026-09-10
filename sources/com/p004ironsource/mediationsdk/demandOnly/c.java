package com.p004ironsource.mediationsdk.demandOnly;

import com.p004ironsource.ac;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.f;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.ta;
import com.p004ironsource.u6;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class c implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f25816a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ta f25817b;

    public c(List<NetworkSettings> list, u6 u6Var, String str, String str2, ta taVar) {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zK = u6Var.k();
        this.f25817b = taVar;
        e eVar = new e(new f(u6Var.d(), sessionId));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = com.p004ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterA != null) {
                    d dVar = new d(str, str2, networkSettings, u6Var.b(), abstractAdapterA, eVar);
                    dVar.a(zK);
                    this.f25816a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.f25816a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f25817b.a(ac.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.f25816a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout, new o.a(IronSourceAES.decode(mb.b().c(), str2)));
            return;
        }
        this.f25817b.a(ac.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.f25816a.get(str);
        if (dVar != null) {
            dVar.r();
            return;
        }
        this.f25817b.a(ac.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}
