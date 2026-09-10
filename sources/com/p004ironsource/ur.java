package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/ur;", "Lcom/ironsource/gn;", "Lcom/ironsource/dn;", "a", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;", "adRequest", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;", "b", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;", "publisherListener", "Lcom/ironsource/c3;", "c", "Lcom/ironsource/c3;", "adapterConfigProvider", "Lcom/ironsource/n3;", "d", "Lcom/ironsource/n3;", "analyticsFactory", "<init>", "(Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;Lcom/unity3d/ironsourceads/rewarded/RewardedAdLoaderListener;Lcom/ironsource/c3;Lcom/ironsource/n3;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ur implements gn {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RewardedAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RewardedAdLoaderListener publisherListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c3 adapterConfigProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final n3 analyticsFactory;

    public ur(RewardedAdRequest adRequest, RewardedAdLoaderListener publisherListener, c3 adapterConfigProvider, n3 analyticsFactory) {
        Intrinsics.f(adRequest, "adRequest");
        Intrinsics.f(publisherListener, "publisherListener");
        Intrinsics.f(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.f(analyticsFactory, "analyticsFactory");
        this.adRequest = adRequest;
        this.publisherListener = publisherListener;
        this.adapterConfigProvider = adapterConfigProvider;
        this.analyticsFactory = analyticsFactory;
    }

    @Override // com.p004ironsource.gn
    public dn a() throws Exception {
        IronSourceError ironSourceErrorD;
        String instanceId = this.adRequest.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        Intrinsics.e(sDKVersion, "getSDKVersion()");
        o3 o3VarA = this.analyticsFactory.a(new i3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            en enVarA = new fn(this.adRequest.getAdm(), this.adRequest.getProviderName(), this.adapterConfigProvider, mo.INSTANCE.a().getInitialized().get()).a();
            new sr(enVarA).a();
            yo yoVar = new yo();
            k5 k5Var = new k5(this.adRequest.getAdm(), this.adRequest.getProviderName());
            RewardedAdRequest rewardedAdRequest = this.adRequest;
            Intrinsics.c(enVarA);
            pg pgVar = pg.f26494a;
            return new rr(rewardedAdRequest, enVarA, new tr(pgVar, this.publisherListener), k5Var, yoVar, o3VarA, new mr(o3VarA, pgVar.c()), null, null, 384, null);
        } catch (Exception e2) {
            q9.d().a(e2);
            if (e2 instanceof rs) {
                ironSourceErrorD = ((rs) e2).getError();
            } else {
                wb wbVar = wb.f27568a;
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorD = wbVar.d(message);
            }
            return new yb(this.adRequest, new tr(pg.f26494a, this.publisherListener), o3VarA, ironSourceErrorD);
        }
    }

    public /* synthetic */ ur(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, c3 c3Var, n3 n3Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, c3Var, (i2 & 8) != 0 ? new m3(IronSource.AD_UNIT.REWARDED_VIDEO) : n3Var);
    }
}
