package com.chartboost.heliumsdk.domain;

import android.view.View;
import com.p004ironsource.x4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PartnerAd;", "", "ad", "details", "", "", "request", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "(Ljava/lang/Object;Ljava/util/Map;Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;)V", "getAd", "()Ljava/lang/Object;", "getDetails", "()Ljava/util/Map;", "inlineView", "Landroid/view/View;", "getInlineView", "()Landroid/view/View;", "getRequest", "()Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartnerAd {
    private final Object ad;
    private final Map<String, String> details;
    private final View inlineView;
    private final PartnerAdLoadRequest request;

    public PartnerAd(Object obj, Map<String, String> details, PartnerAdLoadRequest request) {
        Intrinsics.f(details, "details");
        Intrinsics.f(request, "request");
        this.ad = obj;
        this.details = details;
        this.request = request;
        this.inlineView = obj instanceof View ? (View) obj : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerAd copy$default(PartnerAd partnerAd, Object obj, Map map, PartnerAdLoadRequest partnerAdLoadRequest, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = partnerAd.ad;
        }
        if ((i2 & 2) != 0) {
            map = partnerAd.details;
        }
        if ((i2 & 4) != 0) {
            partnerAdLoadRequest = partnerAd.request;
        }
        return partnerAd.copy(obj, map, partnerAdLoadRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getAd() {
        return this.ad;
    }

    public final Map<String, String> component2() {
        return this.details;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PartnerAdLoadRequest getRequest() {
        return this.request;
    }

    public final PartnerAd copy(Object ad, Map<String, String> details, PartnerAdLoadRequest request) {
        Intrinsics.f(details, "details");
        Intrinsics.f(request, "request");
        return new PartnerAd(ad, details, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAd)) {
            return false;
        }
        PartnerAd partnerAd = (PartnerAd) other;
        return Intrinsics.a(this.ad, partnerAd.ad) && Intrinsics.a(this.details, partnerAd.details) && Intrinsics.a(this.request, partnerAd.request);
    }

    public final Object getAd() {
        return this.ad;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final View getInlineView() {
        return this.inlineView;
    }

    public final PartnerAdLoadRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        Object obj = this.ad;
        return this.request.hashCode() + ((this.details.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
    }

    public String toString() {
        return "PartnerAd(ad=" + this.ad + ", details=" + this.details + ", request=" + this.request + ')';
    }
}
