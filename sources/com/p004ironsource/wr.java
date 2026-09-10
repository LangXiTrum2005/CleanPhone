package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/ironsource/wr;", "Lcom/ironsource/t0;", "", "s", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "t", "Lcom/ironsource/bs;", "u", "", "v", "userId", "providerList", ch.f24532p, "isManual", "a", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lcom/ironsource/bs;", "w", "()Lcom/ironsource/bs;", "Z", "x", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ironsource/bs;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class wr extends t0 {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final bs configs;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean isManual;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public wr(String str, List<? extends NetworkSettings> list, bs configs, boolean z2) {
        Intrinsics.f(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        o5 o5VarK = configs.k();
        Intrinsics.e(o5VarK, "configs.rewardedVideoAuctionSettings");
        super(ad_unit, str, list, o5VarK, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), xr.b(configs, z2), new g2(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        this.userId = str;
        this.providerList = list;
        this.configs = configs;
        this.isManual = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ wr a(wr wrVar, String str, List list, bs bsVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wrVar.userId;
        }
        if ((i2 & 2) != 0) {
            list = wrVar.providerList;
        }
        if ((i2 & 4) != 0) {
            bsVar = wrVar.configs;
        }
        if ((i2 & 8) != 0) {
            z2 = wrVar.isManual;
        }
        return wrVar.a(str, list, bsVar, z2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) other;
        return Intrinsics.a(this.userId, wrVar.userId) && Intrinsics.a(this.providerList, wrVar.providerList) && Intrinsics.a(this.configs, wrVar.configs) && this.isManual == wrVar.isManual;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.providerList;
        int iHashCode2 = (this.configs.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        boolean z2 = this.isManual;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return iHashCode2 + r0;
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
        StringBuilder sb = new StringBuilder("RewardedVideoAdDataManager(userId=");
        sb.append(this.userId);
        sb.append(", providerList=");
        sb.append(this.providerList);
        sb.append(", configs=");
        sb.append(this.configs);
        sb.append(", isManual=");
        return a.r(sb, this.isManual, ')');
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final bs getConfigs() {
        return this.configs;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsManual() {
        return this.isManual;
    }

    public final bs w() {
        return this.configs;
    }

    public final boolean x() {
        return this.isManual;
    }

    public final wr a(String userId, List<? extends NetworkSettings> providerList, bs configs, boolean isManual) {
        Intrinsics.f(configs, "configs");
        return new wr(userId, providerList, configs, isManual);
    }
}
