package com.p004ironsource;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lcom/ironsource/io;", "Lcom/ironsource/u1;", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/e1;", "w", "Lcom/ironsource/t1;", "x", "Lcom/ironsource/tn;", "y", "adProperties", "adUnitCommonData", ch.f24532p, "a", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "t", "Lcom/ironsource/e1;", "()Lcom/ironsource/e1;", "u", "Lcom/ironsource/t1;", "z", "()Lcom/ironsource/t1;", "v", "Lcom/ironsource/tn;", "A", "()Lcom/ironsource/tn;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "adUnitPrefix", "j", "managerName", "<init>", "(Lcom/ironsource/e1;Lcom/ironsource/t1;Lcom/ironsource/tn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class io extends u1 {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final e1 adProperties;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final t1 adUnitCommonData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final tn configs;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String adUnitPrefix;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String managerName;

    /* JADX INFO: renamed from: com.ironsource.io$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/io$a;", "", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/fm;", "levelPlayConfig", "Lcom/ironsource/io;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final io a(e1 adProperties, fm levelPlayConfig) {
            List<bp> listD;
            qt qtVarD;
            Intrinsics.f(adProperties, "adProperties");
            u1.Companion companion = u1.INSTANCE;
            u8 u8VarC = (levelPlayConfig == null || (qtVarD = levelPlayConfig.d()) == null) ? null : qtVarD.c();
            tn nativeAdConfigurations = u8VarC != null ? u8VarC.getNativeAdConfigurations() : null;
            if (nativeAdConfigurations == null) {
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
            return new io(adProperties, new t1(userIdForNetworks, arrayList, xkVarB), nativeAdConfigurations);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(e1 adProperties, t1 adUnitCommonData, tn configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.getAuctionSettings(), configs.getAdaptersSmartLoadAmount(), (int) (configs.getAdaptersSmartLoadTimeoutInMills() / ((long) 1000)), configs.getAdapterAdvancedLoading(), configs.getDelayLoadFailure(), -1, new m2(m2.a.MANUAL, configs.getAuctionSettings().j(), configs.getAuctionSettings().b(), -1L), configs.getMCollectBiddingDataTimeout(), configs.getMProvidersParallelInit(), configs.getMWaitUntilAllProvidersFinishInit(), configs.getMSharedManagersThread(), false, 65536, null);
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        this.adProperties = adProperties;
        this.adUnitCommonData = adUnitCommonData;
        this.configs = configs;
        this.adUnitPrefix = "NA";
        this.managerName = gm.MADU_NT_MANAGER_NAME;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final tn getConfigs() {
        return this.configs;
    }

    public final io a(e1 adProperties, t1 adUnitCommonData, tn configs) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(adUnitCommonData, "adUnitCommonData");
        Intrinsics.f(configs, "configs");
        return new io(adProperties, adUnitCommonData, configs);
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
        if (!(other instanceof io)) {
            return false;
        }
        io ioVar = (io) other;
        return Intrinsics.a(this.adProperties, ioVar.adProperties) && Intrinsics.a(this.adUnitCommonData, ioVar.adUnitCommonData) && Intrinsics.a(this.configs, ioVar.configs);
    }

    public int hashCode() {
        return this.configs.hashCode() + ((this.adUnitCommonData.hashCode() + (this.adProperties.hashCode() * 31)) * 31);
    }

    @Override // com.p004ironsource.u1
    /* JADX INFO: renamed from: j, reason: from getter */
    public String getManagerName() {
        return this.managerName;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.adProperties + ", adUnitCommonData=" + this.adUnitCommonData + ", configs=" + this.configs + ')';
    }

    public final e1 w() {
        return this.adProperties;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final t1 getAdUnitCommonData() {
        return this.adUnitCommonData;
    }

    public final tn y() {
        return this.configs;
    }

    public final t1 z() {
        return this.adUnitCommonData;
    }

    public static /* synthetic */ io a(io ioVar, e1 e1Var, t1 t1Var, tn tnVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            e1Var = ioVar.adProperties;
        }
        if ((i2 & 2) != 0) {
            t1Var = ioVar.adUnitCommonData;
        }
        if ((i2 & 4) != 0) {
            tnVar = ioVar.configs;
        }
        return ioVar.a(e1Var, t1Var, tnVar);
    }

    @Override // com.p004ironsource.u1
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
