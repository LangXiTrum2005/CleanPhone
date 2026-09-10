package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 @2\u00020\u0001:\u0001\u0005BW\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010:\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u0010;\u001a\u00020\u001b\u0012\u0006\u0010<\u001a\u00020\t\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0005\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b\u0005\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e\"\u0004\b\u0005\u0010\u001fR\"\u0010#\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\u0005\u0010\f\"\u0004\b\u0005\u0010\"R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\"\u0010,\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b&\u0010\u0018\"\u0004\b\u000f\u0010\u0019R\"\u00102\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u001c\u00100\"\u0004\b\u0005\u00101R\"\u00103\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b+\u0010\u001e\"\u0004\b\u000f\u0010\u001fR\"\u00105\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010\n\u001a\u0004\b.\u0010\f\"\u0004\b\u000f\u0010\"R\"\u00107\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010\n\u001a\u0004\b4\u0010\f\"\u0004\b\u0016\u0010\"R\u0013\u00109\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b!\u00108¨\u0006A"}, d2 = {"Lcom/ironsource/tn;", "", "Lcom/ironsource/eo;", "placement", "", "a", "", "placementName", "toString", "", "Z", "j", "()Z", "mSharedManagersThread", "Lcom/ironsource/g4;", "b", "Lcom/ironsource/g4;", g.f40227p, "()Lcom/ironsource/g4;", "(Lcom/ironsource/g4;)V", "eventsConfigurations", "", "c", "I", "()I", "(I)V", "adaptersSmartLoadAmount", "", "d", "J", "()J", "(J)V", "adaptersSmartLoadTimeoutInMills", "e", "(Z)V", "adapterAdvancedLoading", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", f.j, "Ljava/util/ArrayList;", "mPlacements", "Lcom/ironsource/eo;", "mDefaultPlacement", h.f36614b, "delayLoadFailure", "Lcom/ironsource/o5;", i.f37957c, "Lcom/ironsource/o5;", "()Lcom/ironsource/o5;", "(Lcom/ironsource/o5;)V", "auctionSettings", "mCollectBiddingDataTimeout", "k", "mProvidersParallelInit", "l", "mWaitUntilAllProvidersFinishInit", "()Lcom/ironsource/eo;", "defaultPlacement", "events", "collectBiddingDataTimeout", "providersParallelInit", "waitUntilAllProvidersFinishInit", "<init>", "(IJZLcom/ironsource/g4;Lcom/ironsource/o5;IJZZZ)V", "m", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tn {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27325n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean mSharedManagersThread;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g4 eventsConfigurations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int adaptersSmartLoadAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long adaptersSmartLoadTimeoutInMills;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean adapterAdvancedLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ArrayList<eo> mPlacements;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private eo mDefaultPlacement;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int delayLoadFailure;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private o5 auctionSettings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long mCollectBiddingDataTimeout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean mProvidersParallelInit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean mWaitUntilAllProvidersFinishInit;

    public tn(int i2, long j, boolean z2, g4 events, o5 auctionSettings, int i3, long j2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.f(events, "events");
        Intrinsics.f(auctionSettings, "auctionSettings");
        this.mSharedManagersThread = z5;
        this.mPlacements = new ArrayList<>();
        this.adaptersSmartLoadAmount = i2;
        this.adaptersSmartLoadTimeoutInMills = j;
        this.adapterAdvancedLoading = z2;
        this.eventsConfigurations = events;
        this.delayLoadFailure = i3;
        this.auctionSettings = auctionSettings;
        this.mCollectBiddingDataTimeout = j2;
        this.mProvidersParallelInit = z3;
        this.mWaitUntilAllProvidersFinishInit = z4;
    }

    public final eo a(String placementName) {
        Intrinsics.f(placementName, "placementName");
        for (eo eoVar : this.mPlacements) {
            if (Intrinsics.a(eoVar.getPlacementName(), placementName)) {
                return eoVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAdaptersSmartLoadAmount() {
        return this.adaptersSmartLoadAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAdaptersSmartLoadTimeoutInMills() {
        return this.adaptersSmartLoadTimeoutInMills;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o5 getAuctionSettings() {
        return this.auctionSettings;
    }

    public final eo e() {
        for (eo eoVar : this.mPlacements) {
            if (eoVar.getIsDefault()) {
                return eoVar;
            }
        }
        return this.mDefaultPlacement;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g4 getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMCollectBiddingDataTimeout() {
        return this.mCollectBiddingDataTimeout;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getMProvidersParallelInit() {
        return this.mProvidersParallelInit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getMSharedManagersThread() {
        return this.mSharedManagersThread;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getMWaitUntilAllProvidersFinishInit() {
        return this.mWaitUntilAllProvidersFinishInit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeAdConfigurations{parallelLoad=");
        sb.append(this.adaptersSmartLoadAmount);
        sb.append(", bidderExclusive=");
        return a.r(sb, this.adapterAdvancedLoading, AbstractJsonLexerKt.END_OBJ);
    }

    public final void a(int i2) {
        this.adaptersSmartLoadAmount = i2;
    }

    public final void b(int i2) {
        this.delayLoadFailure = i2;
    }

    public final void c(boolean z2) {
        this.mWaitUntilAllProvidersFinishInit = z2;
    }

    public final void a(long j) {
        this.adaptersSmartLoadTimeoutInMills = j;
    }

    public final void b(long j) {
        this.mCollectBiddingDataTimeout = j;
    }

    public final void a(eo placement) {
        if (placement != null) {
            this.mPlacements.add(placement);
            if (this.mDefaultPlacement == null || placement.getPlacementId() == 0) {
                this.mDefaultPlacement = placement;
            }
        }
    }

    public final void b(boolean z2) {
        this.mProvidersParallelInit = z2;
    }

    public final void a(g4 g4Var) {
        Intrinsics.f(g4Var, "<set-?>");
        this.eventsConfigurations = g4Var;
    }

    public final void a(o5 o5Var) {
        Intrinsics.f(o5Var, "<set-?>");
        this.auctionSettings = o5Var;
    }

    public final void a(boolean z2) {
        this.adapterAdvancedLoading = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAdapterAdvancedLoading() {
        return this.adapterAdvancedLoading;
    }
}
