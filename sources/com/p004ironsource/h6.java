package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ironsource/h6;", "Lcom/ironsource/t0;", "", "s", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/u6;", "u", "userId", "providerList", ch.f24532p, "a", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/u6;", "v", "()Lcom/ironsource/u6;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/u6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class h6 extends t0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final u6 configs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public h6(String str, List<? extends NetworkSettings> list, u6 configs) {
        Intrinsics.f(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        o5 o5VarD = configs.d();
        Intrinsics.e(o5VarD, "configs.bannerAuctionSettings");
        super(ad_unit, str, list, o5VarD, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, i6.b(configs), new g2(configs.j()), configs.e(), configs.l(), configs.n(), configs.m(), false, 32768, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h6 a(h6 h6Var, String str, List list, u6 u6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = h6Var.userId;
        }
        if ((i2 & 2) != 0) {
            list = h6Var.providerList;
        }
        if ((i2 & 4) != 0) {
            u6Var = h6Var.configs;
        }
        return h6Var.a(str, list, u6Var);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) other;
        return Intrinsics.a(this.userId, h6Var.userId) && Intrinsics.a(this.providerList, h6Var.providerList) && Intrinsics.a(this.configs, h6Var.configs);
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
        return "BannerAdManagerData(userId=" + this.userId + ", providerList=" + this.providerList + ", configs=" + this.configs + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final u6 getConfigs() {
        return this.configs;
    }

    public final u6 v() {
        return this.configs;
    }

    public final h6 a(String userId, List<? extends NetworkSettings> providerList, u6 configs) {
        Intrinsics.f(configs, "configs");
        return new h6(userId, providerList, configs);
    }
}
