package com.chartboost.heliumsdk.domain;

import android.util.Size;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.x4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0011HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "", "partnerId", "", "chartboostPlacement", "partnerPlacement", "size", "Landroid/util/Size;", "format", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "adm", "identifier", "partnerSettings", "", "adInteractionListener", "Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "isAdaptiveBanner", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Lcom/chartboost/heliumsdk/domain/AdFormat;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/chartboost/heliumsdk/domain/AdInteractionListener;Z)V", "getAdInteractionListener", "()Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "getAdm", "()Ljava/lang/String;", "getChartboostPlacement", "getFormat", "()Lcom/chartboost/heliumsdk/domain/AdFormat;", "getIdentifier", "()Z", "getPartnerId", "getPartnerPlacement", "getPartnerSettings", "()Ljava/util/Map;", "getSize", "()Landroid/util/Size;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartnerAdLoadRequest {
    private final AdInteractionListener adInteractionListener;
    private final String adm;
    private final String chartboostPlacement;
    private final AdFormat format;
    private final String identifier;
    private final boolean isAdaptiveBanner;
    private final String partnerId;
    private final String partnerPlacement;
    private final Map<String, String> partnerSettings;
    private final Size size;

    public PartnerAdLoadRequest(String partnerId, String chartboostPlacement, String partnerPlacement, Size size, AdFormat format, String str, String identifier, Map<String, String> partnerSettings, AdInteractionListener adInteractionListener, boolean z2) {
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(partnerPlacement, "partnerPlacement");
        Intrinsics.f(format, "format");
        Intrinsics.f(identifier, "identifier");
        Intrinsics.f(partnerSettings, "partnerSettings");
        Intrinsics.f(adInteractionListener, "adInteractionListener");
        this.partnerId = partnerId;
        this.chartboostPlacement = chartboostPlacement;
        this.partnerPlacement = partnerPlacement;
        this.size = size;
        this.format = format;
        this.adm = str;
        this.identifier = identifier;
        this.partnerSettings = partnerSettings;
        this.adInteractionListener = adInteractionListener;
        this.isAdaptiveBanner = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerAdLoadRequest copy$default(PartnerAdLoadRequest partnerAdLoadRequest, String str, String str2, String str3, Size size, AdFormat adFormat, String str4, String str5, Map map, AdInteractionListener adInteractionListener, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = partnerAdLoadRequest.partnerId;
        }
        if ((i2 & 2) != 0) {
            str2 = partnerAdLoadRequest.chartboostPlacement;
        }
        if ((i2 & 4) != 0) {
            str3 = partnerAdLoadRequest.partnerPlacement;
        }
        if ((i2 & 8) != 0) {
            size = partnerAdLoadRequest.size;
        }
        if ((i2 & 16) != 0) {
            adFormat = partnerAdLoadRequest.format;
        }
        if ((i2 & 32) != 0) {
            str4 = partnerAdLoadRequest.adm;
        }
        if ((i2 & 64) != 0) {
            str5 = partnerAdLoadRequest.identifier;
        }
        if ((i2 & 128) != 0) {
            map = partnerAdLoadRequest.partnerSettings;
        }
        if ((i2 & 256) != 0) {
            adInteractionListener = partnerAdLoadRequest.adInteractionListener;
        }
        if ((i2 & 512) != 0) {
            z2 = partnerAdLoadRequest.isAdaptiveBanner;
        }
        AdInteractionListener adInteractionListener2 = adInteractionListener;
        boolean z3 = z2;
        String str6 = str5;
        Map map2 = map;
        AdFormat adFormat2 = adFormat;
        String str7 = str4;
        return partnerAdLoadRequest.copy(str, str2, str3, size, adFormat2, str7, str6, map2, adInteractionListener2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsAdaptiveBanner() {
        return this.isAdaptiveBanner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartnerPlacement() {
        return this.partnerPlacement;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AdFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final Map<String, String> component8() {
        return this.partnerSettings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AdInteractionListener getAdInteractionListener() {
        return this.adInteractionListener;
    }

    public final PartnerAdLoadRequest copy(String partnerId, String chartboostPlacement, String partnerPlacement, Size size, AdFormat format, String adm, String identifier, Map<String, String> partnerSettings, AdInteractionListener adInteractionListener, boolean isAdaptiveBanner) {
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(partnerPlacement, "partnerPlacement");
        Intrinsics.f(format, "format");
        Intrinsics.f(identifier, "identifier");
        Intrinsics.f(partnerSettings, "partnerSettings");
        Intrinsics.f(adInteractionListener, "adInteractionListener");
        return new PartnerAdLoadRequest(partnerId, chartboostPlacement, partnerPlacement, size, format, adm, identifier, partnerSettings, adInteractionListener, isAdaptiveBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAdLoadRequest)) {
            return false;
        }
        PartnerAdLoadRequest partnerAdLoadRequest = (PartnerAdLoadRequest) other;
        return Intrinsics.a(this.partnerId, partnerAdLoadRequest.partnerId) && Intrinsics.a(this.chartboostPlacement, partnerAdLoadRequest.chartboostPlacement) && Intrinsics.a(this.partnerPlacement, partnerAdLoadRequest.partnerPlacement) && Intrinsics.a(this.size, partnerAdLoadRequest.size) && this.format == partnerAdLoadRequest.format && Intrinsics.a(this.adm, partnerAdLoadRequest.adm) && Intrinsics.a(this.identifier, partnerAdLoadRequest.identifier) && Intrinsics.a(this.partnerSettings, partnerAdLoadRequest.partnerSettings) && Intrinsics.a(this.adInteractionListener, partnerAdLoadRequest.adInteractionListener) && this.isAdaptiveBanner == partnerAdLoadRequest.isAdaptiveBanner;
    }

    public final AdInteractionListener getAdInteractionListener() {
        return this.adInteractionListener;
    }

    public final String getAdm() {
        return this.adm;
    }

    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    public final AdFormat getFormat() {
        return this.format;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerPlacement() {
        return this.partnerPlacement;
    }

    public final Map<String, String> getPartnerSettings() {
        return this.partnerSettings;
    }

    public final Size getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iB = a.b(this.partnerPlacement, a.b(this.chartboostPlacement, this.partnerId.hashCode() * 31, 31), 31);
        Size size = this.size;
        int iHashCode = (this.format.hashCode() + ((iB + (size == null ? 0 : size.hashCode())) * 31)) * 31;
        String str = this.adm;
        int iHashCode2 = (this.adInteractionListener.hashCode() + ((this.partnerSettings.hashCode() + a.b(this.identifier, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31)) * 31;
        boolean z2 = this.isAdaptiveBanner;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final boolean isAdaptiveBanner() {
        return this.isAdaptiveBanner;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PartnerAdLoadRequest(partnerId=");
        sb.append(this.partnerId);
        sb.append(", chartboostPlacement=");
        sb.append(this.chartboostPlacement);
        sb.append(", partnerPlacement=");
        sb.append(this.partnerPlacement);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", adm=");
        sb.append(this.adm);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", partnerSettings=");
        sb.append(this.partnerSettings);
        sb.append(", adInteractionListener=");
        sb.append(this.adInteractionListener);
        sb.append(", isAdaptiveBanner=");
        return androidx.media3.extractor.text.ttml.a.r(sb, this.isAdaptiveBanner, ')');
    }

    public /* synthetic */ PartnerAdLoadRequest(String str, String str2, String str3, Size size, AdFormat adFormat, String str4, String str5, Map map, AdInteractionListener adInteractionListener, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, size, adFormat, str4, str5, map, adInteractionListener, (i2 & 512) != 0 ? false : z2);
    }
}
