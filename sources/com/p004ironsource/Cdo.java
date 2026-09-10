package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.do, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/do;", "Lcom/ironsource/t0;", "", "s", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/tn;", "u", "userId", "providerList", ch.f24532p, "a", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/tn;", "v", "()Lcom/ironsource/tn;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/tn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Cdo extends t0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final tn configs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Cdo(String str, List<? extends NetworkSettings> list, tn configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.getAuctionSettings(), configs.getAdaptersSmartLoadAmount(), (int) (configs.getAdaptersSmartLoadTimeoutInMills() / ((long) 1000)), configs.getAdapterAdvancedLoading(), configs.getDelayLoadFailure(), -1, new m2(m2.a.MANUAL, configs.getAuctionSettings().j(), configs.getAuctionSettings().b(), -1L), new g2(-1L), configs.getMCollectBiddingDataTimeout(), configs.getMProvidersParallelInit(), configs.getMWaitUntilAllProvidersFinishInit(), configs.getMSharedManagersThread(), false, 32768, null);
        Intrinsics.f(configs, "configs");
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cdo a(Cdo cdo, String str, List list, tn tnVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cdo.userId;
        }
        if ((i2 & 2) != 0) {
            list = cdo.providerList;
        }
        if ((i2 & 4) != 0) {
            tnVar = cdo.configs;
        }
        return cdo.a(str, list, tnVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cdo)) {
            return false;
        }
        Cdo cdo = (Cdo) other;
        return Intrinsics.a(this.userId, cdo.userId) && Intrinsics.a(this.providerList, cdo.providerList) && Intrinsics.a(this.configs, cdo.configs);
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.providerList;
        return this.configs.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.p004ironsource.t0
    public List<NetworkSettings> j() {
        return this.providerList;
    }

    @Override // com.p004ironsource.t0
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getUserId() {
        return this.userId;
    }

    public final String s() {
        return this.userId;
    }

    public final List<NetworkSettings> t() {
        return this.providerList;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.userId + ", providerList=" + this.providerList + ", configs=" + this.configs + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final tn getConfigs() {
        return this.configs;
    }

    public final tn v() {
        return this.configs;
    }

    public final Cdo a(String userId, List<? extends NetworkSettings> providerList, tn configs) {
        Intrinsics.f(configs, "configs");
        return new Cdo(userId, providerList, configs);
    }
}
