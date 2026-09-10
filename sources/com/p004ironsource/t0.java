package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0093\u0001\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\u001d\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010<\u001a\u000208\u0012\u0006\u0010>\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\b\b\u0002\u0010B\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0005\u0010\"R\u0017\u0010&\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\"\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u0013\u0010)\"\u0004\b\u0005\u0010*R\u0017\u0010-\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010.\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0005\u0010!R\u0017\u00102\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b,\u00101R\u0017\u00107\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b'\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u001e\u0010;R\u0017\u0010>\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b4\u0010)R\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b?\u0010)R\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b9\u0010)R\"\u0010B\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010(\u001a\u0004\b=\u0010)\"\u0004\b\u000b\u0010*¨\u0006E"}, d2 = {"Lcom/ironsource/t0;", "", "", "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "a", "", "q", "r", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "b", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "userId", "", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "providerList", "Lcom/ironsource/o5;", "d", "Lcom/ironsource/o5;", "()Lcom/ironsource/o5;", "auctionSettings", "", "e", "I", i.f37957c, "()I", "(I)V", "maxSmashesToLoad", f.j, dc.q, "smashLoadTimeout", g.f40227p, "Z", "()Z", "(Z)V", "advancedLoading", h.f36614b, "delayLoadFailure", "adExpirationInMinutes", "Lcom/ironsource/m2;", "Lcom/ironsource/m2;", "()Lcom/ironsource/m2;", "loadingData", "Lcom/ironsource/g2;", "k", "Lcom/ironsource/g2;", "()Lcom/ironsource/g2;", "interactionData", "", "l", "J", "()J", "collectBiddingDataTimeout", "m", "providersParallelInit", "p", "waitUntilAllProvidersFinishInit", "sharedManagersThread", d.f25777z, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/o5;IIZIILcom/ironsource/m2;Lcom/ironsource/g2;JZZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class t0 {
    public static final int r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o5 auctionSettings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxSmashesToLoad;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int smashLoadTimeout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean advancedLoading;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int delayLoadFailure;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int adExpirationInMinutes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final m2 loadingData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final g2 interactionData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long collectBiddingDataTimeout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean providersParallelInit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean waitUntilAllProvidersFinishInit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean sharedManagersThread;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean showPriorityEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(IronSource.AD_UNIT adUnit, String str, List<? extends NetworkSettings> list, o5 auctionSettings, int i2, int i3, boolean z2, int i4, int i5, m2 loadingData, g2 interactionData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(auctionSettings, "auctionSettings");
        Intrinsics.f(loadingData, "loadingData");
        Intrinsics.f(interactionData, "interactionData");
        this.adUnit = adUnit;
        this.userId = str;
        this.providerList = list;
        this.auctionSettings = auctionSettings;
        this.maxSmashesToLoad = i2;
        this.smashLoadTimeout = i3;
        this.advancedLoading = z2;
        this.delayLoadFailure = i4;
        this.adExpirationInMinutes = i5;
        this.loadingData = loadingData;
        this.interactionData = interactionData;
        this.collectBiddingDataTimeout = j;
        this.providersParallelInit = z3;
        this.waitUntilAllProvidersFinishInit = z4;
        this.sharedManagersThread = z5;
        this.showPriorityEnabled = z6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdExpirationInMinutes() {
        return this.adExpirationInMinutes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IronSource.AD_UNIT getAdUnit() {
        return this.adUnit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAdvancedLoading() {
        return this.advancedLoading;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o5 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCollectBiddingDataTimeout() {
        return this.collectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g2 getInteractionData() {
        return this.interactionData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m2 getLoadingData() {
        return this.loadingData;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMaxSmashesToLoad() {
        return this.maxSmashesToLoad;
    }

    public List<NetworkSettings> j() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getProvidersParallelInit() {
        return this.providersParallelInit;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSharedManagersThread() {
        return this.sharedManagersThread;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowPriorityEnabled() {
        return this.showPriorityEnabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSmashLoadTimeout() {
        return this.smashLoadTimeout;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getWaitUntilAllProvidersFinishInit() {
        return this.waitUntilAllProvidersFinishInit;
    }

    public final boolean q() {
        return this.auctionSettings.g() > 0;
    }

    public final String r() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", d.x, Integer.valueOf(this.maxSmashesToLoad), d.y, Boolean.valueOf(this.advancedLoading), d.f25777z, Boolean.valueOf(this.showPriorityEnabled));
    }

    public /* synthetic */ t0(IronSource.AD_UNIT ad_unit, String str, List list, o5 o5Var, int i2, int i3, boolean z2, int i4, int i5, m2 m2Var, g2 g2Var, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, list, o5Var, i2, i3, z2, i4, i5, m2Var, g2Var, j, z3, z4, z5, (i6 & 32768) != 0 ? false : z6);
    }

    public final NetworkSettings a(String instanceName) {
        Intrinsics.f(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (Object obj2 : listJ) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(instanceName)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void b(boolean z2) {
        this.showPriorityEnabled = z2;
    }

    public final void a(int i2) {
        this.maxSmashesToLoad = i2;
    }

    public final void a(boolean z2) {
        this.advancedLoading = z2;
    }
}
