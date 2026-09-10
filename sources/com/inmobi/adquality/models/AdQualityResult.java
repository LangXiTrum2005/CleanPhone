package com.inmobi.adquality.models;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/inmobi/adquality/models/AdQualityResult;", "", "imageLocation", "", "sdkModelResult", "beaconUrl", "extras", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBeaconUrl", "()Ljava/lang/String;", "getExtras", "setExtras", "(Ljava/lang/String;)V", "getImageLocation", "setImageLocation", "getSdkModelResult", "setSdkModelResult", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdQualityResult {
    private final String beaconUrl;
    private String extras;
    private String imageLocation;
    private String sdkModelResult;

    public AdQualityResult(String imageLocation, String str, String beaconUrl, String str2) {
        Intrinsics.f(imageLocation, "imageLocation");
        Intrinsics.f(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i2 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i2 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i2 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageLocation() {
        return this.imageLocation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    public final AdQualityResult copy(String imageLocation, String sdkModelResult, String beaconUrl, String extras) {
        Intrinsics.f(imageLocation, "imageLocation");
        Intrinsics.f(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, sdkModelResult, beaconUrl, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) other;
        return Intrinsics.a(this.imageLocation, adQualityResult.imageLocation) && Intrinsics.a(this.sdkModelResult, adQualityResult.sdkModelResult) && Intrinsics.a(this.beaconUrl, adQualityResult.beaconUrl) && Intrinsics.a(this.extras, adQualityResult.extras);
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getImageLocation() {
        return this.imageLocation;
    }

    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iB = a.b(this.beaconUrl, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.extras;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(String str) {
        this.extras = str;
    }

    public final void setImageLocation(String str) {
        Intrinsics.f(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(String str) {
        this.sdkModelResult = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdQualityResult(imageLocation=");
        sb.append(this.imageLocation);
        sb.append(", sdkModelResult=");
        sb.append(this.sdkModelResult);
        sb.append(", beaconUrl=");
        sb.append(this.beaconUrl);
        sb.append(", extras=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.extras, ')');
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : str4);
    }
}
