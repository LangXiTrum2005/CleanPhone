package com.chartboost.heliumsdk.domain;

import android.support.v4.media.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "", "adType", "", "placementName", "", "(ILjava/lang/String;)V", "getAdType", "()I", "getPlacementName", "()Ljava/lang/String;", "placementType", "getPlacementType", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdIdentifier {
    private final int adType;
    private final String placementName;

    public AdIdentifier(int i2, String placementName) {
        Intrinsics.f(placementName, "placementName");
        this.adType = i2;
        this.placementName = placementName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !AdIdentifier.class.equals(other.getClass())) {
            return false;
        }
        AdIdentifier adIdentifier = (AdIdentifier) other;
        return adIdentifier.adType == this.adType && Intrinsics.a(adIdentifier.placementName, this.placementName);
    }

    public final int getAdType() {
        return this.adType;
    }

    public final String getPlacementName() {
        return this.placementName;
    }

    public final String getPlacementType() {
        int i2 = this.adType;
        if (i2 == 0) {
            return "interstitial";
        }
        if (i2 == 1) {
            return "rewarded";
        }
        if (i2 == 2) {
            return "banner";
        }
        if (i2 != 3) {
            return i2 != 4 ? "unknown" : "adaptive_banner";
        }
        return "rewarded_interstitial";
    }

    public int hashCode() {
        return (this.adType + AbstractJsonLexerKt.COLON + this.placementName).hashCode();
    }

    public String toString() {
        int i2 = this.adType;
        if (i2 == 0) {
            return a.r(new StringBuilder(), this.placementName, " (Interstitial)");
        }
        if (i2 == 1) {
            return a.r(new StringBuilder(), this.placementName, " (Rewarded)");
        }
        if (i2 == 2) {
            return a.r(new StringBuilder(), this.placementName, " (Banner)");
        }
        if (i2 != 3) {
            return i2 != 4 ? "" : a.r(new StringBuilder(), this.placementName, " (Adaptive Banner)");
        }
        return a.r(new StringBuilder(), this.placementName, " (Rewarded Interstitial)");
    }
}
