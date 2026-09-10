package com.p004ironsource;

import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B'\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J1\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/ironsource/m6;", "Lcom/ironsource/u1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "a", "Lcom/ironsource/j6;", "w", "", "x", "Lcom/ironsource/t1;", "y", "Lcom/ironsource/u6;", "z", "adProperties", "isPublisherLoad", "adUnitCommonData", ch.f24532p, "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "t", "Lcom/ironsource/j6;", "A", "()Lcom/ironsource/j6;", "u", "Z", "()Z", "v", "Lcom/ironsource/t1;", "B", "()Lcom/ironsource/t1;", "Lcom/ironsource/u6;", "C", "()Lcom/ironsource/u6;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "adUnitPrefix", "j", "managerName", "<init>", "(Lcom/ironsource/j6;ZLcom/ironsource/t1;Lcom/ironsource/u6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class m6 extends u1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final j6 adProperties;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublisherLoad;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final t1 adUnitCommonData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final u6 configs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String adUnitPrefix;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String managerName;

    /* JADX INFO: renamed from: com.ironsource.m6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/m6$a;", "", "Lcom/ironsource/j6;", "adProperties", "Lcom/ironsource/fm;", "levelPlayConfig", "", "isPublisherLoad", "Lcom/ironsource/m6;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final m6 a(j6 adProperties, fm levelPlayConfig, boolean isPublisherLoad) {
            List<bp> listD;
            qt qtVarD;
            Intrinsics.f(adProperties, "adProperties");
            u1.Companion companion = u1.INSTANCE;
            u8 u8VarC = (levelPlayConfig == null || (qtVarD = levelPlayConfig.d()) == null) ? null : qtVarD.c();
            u6 bannerConfigurations = u8VarC != null ? u8VarC.getBannerConfigurations() : null;
            if (bannerConfigurations == null) {
                throw new IllegalStateException("Error getting " + adProperties.getAdFormat() + " configurations");
            }
            if (levelPlayConfig == null || (listD = levelPlayConfig.d(adProperties.e(), adProperties.getAdUnitId())) == null) {
                listD = EmptyList.X;
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(CollectionsKt.n(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((bp) it.next()).f());
            }
            xk xkVarB = xk.b();
            Intrinsics.e(xkVarB, "getInstance()");
            return new m6(adProperties, isPublisherLoad, new t1(userIdForNetworks, arrayList, xkVarB), bannerConfigurations);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m6(j6 adProperties, boolean z2, t1 adUnitCommonData, u6 configs) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        xk xkVarE = adUnitCommonData.e();
        o5 o5VarD = configs.d();
        Intrinsics.e(o5VarD, "configs.bannerAuctionSettings");
        super(adProperties, z2, strF, listD, xkVarE, o5VarD, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, new m2(m2.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * ((long) configs.h())), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        this.adProperties = adProperties;
        this.isPublisherLoad = z2;
        this.adUnitCommonData = adUnitCommonData;
        this.configs = configs;
        this.adUnitPrefix = "BN";
        this.managerName = gm.MADU_BN_MANAGER_NAME;
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: A, reason: from getter */
    public j6 getAdProperties() {
        return this.adProperties;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final t1 getAdUnitCommonData() {
        return this.adUnitCommonData;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final u6 getConfigs() {
        return this.configs;
    }

    public final m6 a(j6 adProperties, boolean isPublisherLoad, t1 adUnitCommonData, u6 configs) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        return new m6(adProperties, isPublisherLoad, adUnitCommonData, configs);
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getAdUnitPrefix() {
        return this.adUnitPrefix;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) other;
        return Intrinsics.a(this.adProperties, m6Var.adProperties) && this.isPublisherLoad == m6Var.isPublisherLoad && Intrinsics.a(this.adUnitCommonData, m6Var.adUnitCommonData) && Intrinsics.a(this.configs, m6Var.configs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.adProperties.hashCode() * 31;
        boolean z2 = this.isPublisherLoad;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return this.configs.hashCode() + ((this.adUnitCommonData.hashCode() + ((iHashCode + r1) * 31)) * 31);
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: j, reason: from getter */
    public String getManagerName() {
        return this.managerName;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.adProperties + ", isPublisherLoad=" + this.isPublisherLoad + ", adUnitCommonData=" + this.adUnitCommonData + ", configs=" + this.configs + ')';
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getIsPublisherLoad() {
        return this.isPublisherLoad;
    }

    public final j6 w() {
        return this.adProperties;
    }

    public final boolean x() {
        return this.isPublisherLoad;
    }

    public final t1 y() {
        return this.adUnitCommonData;
    }

    public final u6 z() {
        return this.configs;
    }

    public static /* synthetic */ m6 a(m6 m6Var, j6 j6Var, boolean z2, t1 t1Var, u6 u6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j6Var = m6Var.adProperties;
        }
        if ((i2 & 2) != 0) {
            z2 = m6Var.isPublisherLoad;
        }
        if ((i2 & 4) != 0) {
            t1Var = m6Var.adUnitCommonData;
        }
        if ((i2 & 8) != 0) {
            u6Var = m6Var.configs;
        }
        return m6Var.a(j6Var, z2, t1Var, u6Var);
    }

    @Override // com.p004ironsource.u1
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.e(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.p004ironsource.u1
    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), getAdProperties().getAdFormat(), getUserId(), new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), new j1().b(getAdProperties().getAdSize())));
        Intrinsics.e(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
