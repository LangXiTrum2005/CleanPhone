package com.p004ironsource;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0006B\u0099\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u00102\u001a\u00020,\u0012\u0006\u00104\u001a\u00020,\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u00109\u001a\u00020,\u0012\u0006\u0010:\u001a\u00020,\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010F\u001a\u00020\u0007\u0012\u0006\u0010H\u001a\u00020\u0007\u0012\b\b\u0002\u0010J\u001a\u00020\u0007¢\u0006\u0004\bM\u0010NJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b\u0006\u00101R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b3\u00100R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u0006\u00106R\u0017\u00109\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b-\u00100R\u0017\u0010:\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b\u0006\u00100R\u0017\u0010>\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b5\u0010=R\u0017\u0010B\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\b(\u0010AR\u0017\u0010D\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bC\u0010\u0014R\u0017\u0010F\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\bE\u0010\u0014R\u0017\u0010H\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bG\u0010\u0012\u001a\u0004\bG\u0010\u0014R\"\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0012\u001a\u0004\bI\u0010\u0014\"\u0004\b\f\u00106R\u0014\u0010K\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0014\u0010L\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0019¨\u0006O"}, d2 = {"Lcom/ironsource/u1;", "", "", "l", "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "a", "", "t", "v", xs.f27731b, "Lorg/json/JSONObject;", "b", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "Lcom/ironsource/e1;", "Lcom/ironsource/e1;", "()Lcom/ironsource/e1;", "adProperties", "Z", "u", "()Z", "isPublisherLoad", "c", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "userId", "", "d", "Ljava/util/List;", "m", "()Ljava/util/List;", "providerList", "Lcom/ironsource/xk;", "e", "Lcom/ironsource/xk;", "o", "()Lcom/ironsource/xk;", "publisherDataHolder", "Lcom/ironsource/o5;", f.j, "Lcom/ironsource/o5;", "()Lcom/ironsource/o5;", "auctionSettings", "", g.f40227p, "I", "k", "()I", "(I)V", "maxInstancesToLoad", h.f36614b, "instanceLoadTimeout", i.f37957c, "(Z)V", "advancedLoading", "j", "delayLoadFailure", "adExpirationInMinutes", "Lcom/ironsource/m2;", "Lcom/ironsource/m2;", "()Lcom/ironsource/m2;", "loadingData", "", "J", "()J", "collectBiddingDataTimeout", dc.q, "providersParallelInit", "s", "waitUntilAllProvidersFinishInit", "p", "sharedManagersThread", "q", d.f25777z, "adUnitPrefix", "managerName", "<init>", "(Lcom/ironsource/e1;ZLjava/lang/String;Ljava/util/List;Lcom/ironsource/xk;Lcom/ironsource/o5;IIZIILcom/ironsource/m2;JZZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class u1 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e1 adProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublisherLoad;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xk publisherDataHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o5 auctionSettings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int maxInstancesToLoad;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int instanceLoadTimeout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean advancedLoading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int delayLoadFailure;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int adExpirationInMinutes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m2 loadingData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long collectBiddingDataTimeout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean providersParallelInit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean waitUntilAllProvidersFinishInit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean sharedManagersThread;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean showPriorityEnabled;

    /* JADX INFO: renamed from: com.ironsource.u1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jc\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/ironsource/u1$a;", "", "AdFormatConfig", "AdUnitData", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/fm;", "levelPlayConfig", "Lkotlin/Function1;", "Lcom/ironsource/u8;", "getAdFormatConfig", "Lkotlin/Function2;", "Lcom/ironsource/t1;", "createAdUnitData", "a", "(Lcom/ironsource/e1;Lcom/ironsource/fm;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "DISABLED", "I", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(e1 adProperties, fm levelPlayConfig, Function1<? super u8, ? extends AdFormatConfig> getAdFormatConfig, Function2<? super t1, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<bp> listD;
            qt qtVarD;
            Intrinsics.f(adProperties, "adProperties");
            Intrinsics.f(getAdFormatConfig, "getAdFormatConfig");
            Intrinsics.f(createAdUnitData, "createAdUnitData");
            Object objInvoke = getAdFormatConfig.invoke((levelPlayConfig == null || (qtVarD = levelPlayConfig.d()) == null) ? null : qtVarD.c());
            if (objInvoke == null) {
                throw new IllegalStateException("Error getting " + adProperties.getAdFormat() + " configurations");
            }
            if (levelPlayConfig == null || (listD = levelPlayConfig.d(adProperties.e(), adProperties.getAdUnitId())) == null) {
                listD = EmptyList.X;
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            List<bp> list = listD;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((bp) it.next()).f());
            }
            xk xkVarB = xk.b();
            Intrinsics.e(xkVarB, "getInstance()");
            return (AdUnitData) createAdUnitData.invoke(new t1(userIdForNetworks, arrayList, xkVarB), objInvoke);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u1(e1 adProperties, boolean z2, String str, List<? extends NetworkSettings> providerList, xk publisherDataHolder, o5 auctionSettings, int i2, int i3, boolean z3, int i4, int i5, m2 loadingData, long j, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(providerList, "providerList");
        Intrinsics.f(publisherDataHolder, "publisherDataHolder");
        Intrinsics.f(auctionSettings, "auctionSettings");
        Intrinsics.f(loadingData, "loadingData");
        this.adProperties = adProperties;
        this.isPublisherLoad = z2;
        this.userId = str;
        this.providerList = providerList;
        this.publisherDataHolder = publisherDataHolder;
        this.auctionSettings = auctionSettings;
        this.maxInstancesToLoad = i2;
        this.instanceLoadTimeout = i3;
        this.advancedLoading = z3;
        this.delayLoadFailure = i4;
        this.adExpirationInMinutes = i5;
        this.loadingData = loadingData;
        this.collectBiddingDataTimeout = j;
        this.providersParallelInit = z4;
        this.waitUntilAllProvidersFinishInit = z5;
        this.sharedManagersThread = z6;
        this.showPriorityEnabled = z7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdExpirationInMinutes() {
        return this.adExpirationInMinutes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public e1 getAdProperties() {
        return this.adProperties;
    }

    public abstract JSONObject b(NetworkSettings providerSettings);

    public abstract String c();

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAdvancedLoading() {
        return this.advancedLoading;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o5 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCollectBiddingDataTimeout() {
        return this.collectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getInstanceLoadTimeout() {
        return this.instanceLoadTimeout;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m2 getLoadingData() {
        return this.loadingData;
    }

    public abstract String j();

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxInstancesToLoad() {
        return this.maxInstancesToLoad;
    }

    public final String l() {
        String placementName;
        Placement placement = getAdProperties().getPlacement();
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? "" : placementName;
    }

    public final List<NetworkSettings> m() {
        return this.providerList;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getProvidersParallelInit() {
        return this.providersParallelInit;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final xk getPublisherDataHolder() {
        return this.publisherDataHolder;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getSharedManagersThread() {
        return this.sharedManagersThread;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShowPriorityEnabled() {
        return this.showPriorityEnabled;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getWaitUntilAllProvidersFinishInit() {
        return this.waitUntilAllProvidersFinishInit;
    }

    public final boolean t() {
        return this.auctionSettings.g() > 0;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getIsPublisherLoad() {
        return this.isPublisherLoad;
    }

    public final String v() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", d.x, Integer.valueOf(this.maxInstancesToLoad), d.y, Boolean.valueOf(this.advancedLoading), d.f25777z, Boolean.valueOf(this.showPriorityEnabled));
    }

    public /* synthetic */ u1(e1 e1Var, boolean z2, String str, List list, xk xkVar, o5 o5Var, int i2, int i3, boolean z3, int i4, int i5, m2 m2Var, long j, boolean z4, boolean z5, boolean z6, boolean z7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, z2, str, list, xkVar, o5Var, i2, i3, z3, i4, i5, m2Var, j, z4, z5, z6, (i6 & 65536) != 0 ? false : z7);
    }

    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.f(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), getAdProperties().getAdFormat(), this.userId);
        Intrinsics.e(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return adDataCreateAdDataForNetworkAdapter;
    }

    public final void b(boolean z2) {
        this.showPriorityEnabled = z2;
    }

    public final NetworkSettings a(String instanceName) {
        Object next;
        Intrinsics.f(instanceName, "instanceName");
        Iterator<T> it = this.providerList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                return (NetworkSettings) next;
            }
        }
        next = null;
        return (NetworkSettings) next;
    }

    public final void a(int i2) {
        this.maxInstancesToLoad = i2;
    }

    public final void a(boolean z2) {
        this.advancedLoading = z2;
    }
}
