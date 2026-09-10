package com.p004ironsource.mediationsdk;

import com.p004ironsource.a4;
import com.p004ironsource.dc;
import com.p004ironsource.f5;
import com.p004ironsource.k6;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.ne;
import com.p004ironsource.x4;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bc\u0010dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0012j\b\u0012\u0004\u0012\u00020\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0010\u0010\u001cR\"\u0010#\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0010\u0010\"R\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b\u0014\u0010\u001cR4\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010+\"\u0004\b\u0005\u0010,R.\u00107\u001a\b\u0012\u0004\u0012\u00020\b008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b6\u0010.\u001a\u0004\b3\u00104\"\u0004\b\u0005\u00105R\"\u0010<\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b9\u0010:\"\u0004\b\u0005\u0010;R$\u0010B\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b$\u0010@\"\u0004\b\u0005\u0010AR$\u0010H\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010D\u001a\u0004\bE\u0010F\"\u0004\b\u0005\u0010GR\"\u0010J\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\bI\u0010!\"\u0004\b\u001e\u0010\"R$\u0010O\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010L\u001a\u0004\b(\u0010M\"\u0004\b\u0005\u0010NR\"\u0010R\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010\u001b\"\u0004\b\u0005\u0010\u001cR\"\u0010T\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0019\u001a\u0004\bS\u0010\u001b\"\u0004\b\u001e\u0010\u001cR\"\u0010V\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\bU\u0010\u001b\"\u0004\b$\u0010\u001cR$\u0010W\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u001f\u001a\u0004\b\u001e\u0010!\"\u0004\b\u0014\u0010\"R$\u0010X\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\u001f\u001a\u0004\b\u0014\u0010!\"\u0004\b\u0005\u0010\"R$\u0010]\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\u0005\u0010\\R$\u0010b\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010_\u001a\u0004\b1\u0010`\"\u0004\b\u0005\u0010a¨\u0006e"}, d2 = {"Lcom/ironsource/mediationsdk/i;", "", "Lcom/ironsource/f5;", "instanceInfo", "", "a", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "c", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "k", "()Ljava/util/ArrayList;", "instancesInfo", "Z", "v", "()Z", "(Z)V", "isOneFlow", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "instanceId", "e", "t", "isEncryptedResponse", "", f.j, "Ljava/util/Map;", h.f36614b, "()Ljava/util/Map;", "(Ljava/util/Map;)V", "getBidders$annotations", "()V", "bidders", "", g.f40227p, "Ljava/util/List;", "l", "()Ljava/util/List;", "(Ljava/util/List;)V", "getNonBidders$annotations", "nonBidders", "I", "o", "()I", "(I)V", "sessionDepth", "Lcom/ironsource/mediationsdk/h;", com.smartdigimkt.q8.i.f37957c, "Lcom/ironsource/mediationsdk/h;", "()Lcom/ironsource/mediationsdk/h;", "(Lcom/ironsource/mediationsdk/h;)V", "auctionHistory", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "Lcom/ironsource/mediationsdk/IronSourceSegment;", dc.q, "()Lcom/ironsource/mediationsdk/IronSourceSegment;", "(Lcom/ironsource/mediationsdk/IronSourceSegment;)V", a4.f24258i, "r", "waterfallString", "Lcom/ironsource/mediationsdk/ISBannerSize;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "()Lcom/ironsource/mediationsdk/ISBannerSize;", "(Lcom/ironsource/mediationsdk/ISBannerSize;)V", k6.f25513u, "m", "s", IronSourceConstants.EVENTS_DEMAND_ONLY, "p", "testSuiteLaunched", "q", "useTestAds", "adUnitId", "adFormat", "Ljava/lang/Boolean;", "u", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", ne.m0, "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "(Ljava/lang/Double;)V", "bidFloor", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<f5> instancesInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isOneFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String instanceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isEncryptedResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Map<String, Object> bidders;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<String> nonBidders;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int sessionDepth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private h auctionHistory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private IronSourceSegment segment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String waterfallString;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ISBannerSize bannerSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isDemandOnly;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean testSuiteLaunched;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean useTestAds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String adUnitId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String adFormat;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Boolean isMultipleAdsFlow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Double bidFloor;

    public i(IronSource.AD_UNIT adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.adUnit = adUnit;
        this.instancesInfo = new ArrayList<>();
        this.instanceId = "";
        this.bidders = new HashMap();
        this.nonBidders = new ArrayList();
        this.sessionDepth = -1;
        this.waterfallString = "";
    }

    @Deprecated
    public static /* synthetic */ void i() {
    }

    @Deprecated
    public static /* synthetic */ void m() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IronSource.AD_UNIT getAdUnit() {
        return this.adUnit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdFormat() {
        return this.adFormat;
    }

    public final IronSource.AD_UNIT c() {
        return this.adUnit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getAuctionHistory() {
        return this.auctionHistory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof i) && this.adUnit == ((i) other).adUnit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ISBannerSize getBannerSize() {
        return this.bannerSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getBidFloor() {
        return this.bidFloor;
    }

    public final Map<String, Object> h() {
        return this.bidders;
    }

    public int hashCode() {
        return this.adUnit.hashCode();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    public final ArrayList<f5> k() {
        return this.instancesInfo;
    }

    public final List<String> l() {
        return this.nonBidders;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final IronSourceSegment getSegment() {
        return this.segment;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSessionDepth() {
        return this.sessionDepth;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getTestSuiteLaunched() {
        return this.testSuiteLaunched;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getUseTestAds() {
        return this.useTestAds;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getWaterfallString() {
        return this.waterfallString;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsDemandOnly() {
        return this.isDemandOnly;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsEncryptedResponse() {
        return this.isEncryptedResponse;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.adUnit + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getIsMultipleAdsFlow() {
        return this.isMultipleAdsFlow;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsOneFlow() {
        return this.isOneFlow;
    }

    public final i a(IronSource.AD_UNIT adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void b(String str) {
        this.adUnitId = str;
    }

    public final void c(String str) {
        Intrinsics.f(str, "<set-?>");
        this.instanceId = str;
    }

    public final void d(String str) {
        Intrinsics.f(str, "<set-?>");
        this.waterfallString = str;
    }

    public final void e(boolean z2) {
        this.useTestAds = z2;
    }

    public static /* synthetic */ i a(i iVar, IronSource.AD_UNIT ad_unit, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ad_unit = iVar.adUnit;
        }
        return iVar.a(ad_unit);
    }

    public final void b(boolean z2) {
        this.isEncryptedResponse = z2;
    }

    public final void c(boolean z2) {
        this.isOneFlow = z2;
    }

    public final void d(boolean z2) {
        this.testSuiteLaunched = z2;
    }

    public final void a(int i2) {
        this.sessionDepth = i2;
    }

    public final void a(f5 instanceInfo) {
        Intrinsics.f(instanceInfo, "instanceInfo");
        this.instancesInfo.add(instanceInfo);
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.bannerSize = iSBannerSize;
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.segment = ironSourceSegment;
    }

    public final void a(h hVar) {
        this.auctionHistory = hVar;
    }

    public final void a(Boolean bool) {
        this.isMultipleAdsFlow = bool;
    }

    public final void a(Double d) {
        this.bidFloor = d;
    }

    public final void a(String str) {
        this.adFormat = str;
    }

    public final void a(List<String> list) {
        Intrinsics.f(list, "<set-?>");
        this.nonBidders = list;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.f(map, "<set-?>");
        this.bidders = map;
    }

    public final void a(boolean z2) {
        this.isDemandOnly = z2;
    }
}
