package com.inmobi.media.ads.network.common.model;

import com.inmobi.media.A8;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/inmobi/media/ads/network/common/model/InlineParams;", "", "url", "", "referrer", "listing", "overlay", "", "callerBundleId", "targetBundleId", "pingInWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getReferrer", "getListing", "getOverlay", "()Z", "getCallerBundleId", "setCallerBundleId", "(Ljava/lang/String;)V", "getTargetBundleId", "setTargetBundleId", "getPingInWebView", "setPingInWebView", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", C3414a2.d, "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InlineParams {

    @A8
    private String callerBundleId;
    private final String listing;
    private final boolean overlay;

    @A8
    private boolean pingInWebView;
    private final String referrer;

    @A8
    private String targetBundleId;
    private final String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ InlineParams copy$default(InlineParams inlineParams, String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        if ((i & 4) != 0) {
            str3 = inlineParams.listing;
        }
        if ((i & 8) != 0) {
            z = inlineParams.overlay;
        }
        if ((i & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        if ((i & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        if ((i & 64) != 0) {
            z2 = inlineParams.pingInWebView;
        }
        String str6 = str5;
        boolean z3 = z2;
        String str7 = str4;
        String str8 = str3;
        return inlineParams.copy(str, str2, str8, z, str7, str6, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getListing() {
        return this.listing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOverlay() {
        return this.overlay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    public final InlineParams copy(String url, String referrer, String listing, boolean overlay, String callerBundleId, String targetBundleId, boolean pingInWebView) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new InlineParams(url, referrer, listing, overlay, callerBundleId, targetBundleId, pingInWebView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineParams)) {
            return false;
        }
        InlineParams inlineParams = (InlineParams) other;
        return Intrinsics.wireman(this.url, inlineParams.url) && Intrinsics.wireman(this.referrer, inlineParams.referrer) && Intrinsics.wireman(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && Intrinsics.wireman(this.callerBundleId, inlineParams.callerBundleId) && Intrinsics.wireman(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    public final String getCallerBundleId() {
        return this.callerBundleId;
    }

    public final String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getTargetBundleId() {
        return this.targetBundleId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.referrer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.listing;
        int iHashCode3 = (Boolean.hashCode(this.overlay) + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.callerBundleId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetBundleId;
        return Boolean.hashCode(this.pingInWebView) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCallerBundleId(String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z) {
        this.pingInWebView = z;
    }

    public final void setTargetBundleId(String str) {
        this.targetBundleId = str;
    }

    public String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + ")";
    }

    public InlineParams(String url, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.referrer = str;
        this.listing = str2;
        this.overlay = z;
        this.callerBundleId = str3;
        this.targetBundleId = str4;
        this.pingInWebView = z2;
    }

    public /* synthetic */ InlineParams(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://play.google.com/d?" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z2);
    }
}
