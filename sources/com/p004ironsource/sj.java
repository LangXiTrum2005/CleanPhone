package com.p004ironsource;

import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/ironsource/sj;", "Lcom/ironsource/u1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/e1;", "w", "", "x", "Lcom/ironsource/t1;", "y", "Lcom/ironsource/uj;", "z", "adProperties", "isPublisherLoad", "adUnitCommonData", ch.f24532p, "a", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "t", "Lcom/ironsource/e1;", "()Lcom/ironsource/e1;", "u", "Z", "()Z", "v", "Lcom/ironsource/t1;", "A", "()Lcom/ironsource/t1;", "Lcom/ironsource/uj;", "B", "()Lcom/ironsource/uj;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "adUnitPrefix", "j", "managerName", "<init>", "(Lcom/ironsource/e1;ZLcom/ironsource/t1;Lcom/ironsource/uj;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class sj extends u1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final e1 adProperties;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublisherLoad;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final t1 adUnitCommonData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final uj configs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String adUnitPrefix;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String managerName;

    /* JADX INFO: renamed from: com.ironsource.sj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ironsource/sj$a;", "", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/fm;", "levelPlayConfig", "", "isPublisherLoad", "Lcom/ironsource/sj;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final sj a(e1 adProperties, fm levelPlayConfig, boolean isPublisherLoad) {
            List<bp> listD;
            qt qtVarD;
            Intrinsics.f(adProperties, "adProperties");
            u1.Companion companion = u1.INSTANCE;
            u8 u8VarC = (levelPlayConfig == null || (qtVarD = levelPlayConfig.d()) == null) ? null : qtVarD.c();
            uj interstitialConfigurations = u8VarC != null ? u8VarC.getInterstitialConfigurations() : null;
            if (interstitialConfigurations == null) {
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
            return new sj(adProperties, isPublisherLoad, new t1(userIdForNetworks, arrayList, xkVarB), interstitialConfigurations);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sj(e1 adProperties, boolean z2, t1 adUnitCommonData, uj configs) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        xk xkVarE = adUnitCommonData.e();
        o5 o5VarG = configs.g();
        Intrinsics.e(o5VarG, "configs.interstitialAuctionSettings");
        super(adProperties, z2, strF, listD, xkVarE, o5VarG, configs.c(), configs.d(), configs.f(), configs.b(), -1, new m2(m2.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        this.adProperties = adProperties;
        this.isPublisherLoad = z2;
        this.adUnitCommonData = adUnitCommonData;
        this.configs = configs;
        this.adUnitPrefix = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.managerName = gm.MADU_IS_MANAGER_NAME;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final t1 getAdUnitCommonData() {
        return this.adUnitCommonData;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final uj getConfigs() {
        return this.configs;
    }

    public final sj a(e1 adProperties, boolean isPublisherLoad, t1 adUnitCommonData, uj configs) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        return new sj(adProperties, isPublisherLoad, adUnitCommonData, configs);
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: b, reason: from getter */
    public e1 getAdProperties() {
        return this.adProperties;
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
        if (!(other instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) other;
        return Intrinsics.a(this.adProperties, sjVar.adProperties) && this.isPublisherLoad == sjVar.isPublisherLoad && Intrinsics.a(this.adUnitCommonData, sjVar.adUnitCommonData) && Intrinsics.a(this.configs, sjVar.configs);
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
        return "InterstitialAdUnitData(adProperties=" + this.adProperties + ", isPublisherLoad=" + this.isPublisherLoad + ", adUnitCommonData=" + this.adUnitCommonData + ", configs=" + this.configs + ')';
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getIsPublisherLoad() {
        return this.isPublisherLoad;
    }

    public final e1 w() {
        return this.adProperties;
    }

    public final boolean x() {
        return this.isPublisherLoad;
    }

    public final t1 y() {
        return this.adUnitCommonData;
    }

    public final uj z() {
        return this.configs;
    }

    public static /* synthetic */ sj a(sj sjVar, e1 e1Var, boolean z2, t1 t1Var, uj ujVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e1Var = sjVar.adProperties;
        }
        if ((i2 & 2) != 0) {
            z2 = sjVar.isPublisherLoad;
        }
        if ((i2 & 4) != 0) {
            t1Var = sjVar.adUnitCommonData;
        }
        if ((i2 & 8) != 0) {
            ujVar = sjVar.configs;
        }
        return sjVar.a(e1Var, z2, t1Var, ujVar);
    }

    @Override // com.p004ironsource.u1
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.e(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
