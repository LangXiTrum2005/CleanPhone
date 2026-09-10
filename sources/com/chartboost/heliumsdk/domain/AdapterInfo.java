package com.chartboost.heliumsdk.domain;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.gv;
import com.p004ironsource.x4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdapterInfo;", "", HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "", gv.f25175b, "partnerId", "partnerDisplayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdapterVersion", "()Ljava/lang/String;", "getPartnerDisplayName", "getPartnerId", "getPartnerVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AdapterInfo {
    private final String adapterVersion;
    private final String partnerDisplayName;
    private final String partnerId;
    private final String partnerVersion;

    public AdapterInfo(String partnerVersion, String adapterVersion, String partnerId, String partnerDisplayName) {
        Intrinsics.f(partnerVersion, "partnerVersion");
        Intrinsics.f(adapterVersion, "adapterVersion");
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(partnerDisplayName, "partnerDisplayName");
        this.partnerVersion = partnerVersion;
        this.adapterVersion = adapterVersion;
        this.partnerId = partnerId;
        this.partnerDisplayName = partnerDisplayName;
    }

    public static /* synthetic */ AdapterInfo copy$default(AdapterInfo adapterInfo, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = adapterInfo.partnerVersion;
        }
        if ((i2 & 2) != 0) {
            str2 = adapterInfo.adapterVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = adapterInfo.partnerId;
        }
        if ((i2 & 8) != 0) {
            str4 = adapterInfo.partnerDisplayName;
        }
        return adapterInfo.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPartnerDisplayName() {
        return this.partnerDisplayName;
    }

    public final AdapterInfo copy(String partnerVersion, String adapterVersion, String partnerId, String partnerDisplayName) {
        Intrinsics.f(partnerVersion, "partnerVersion");
        Intrinsics.f(adapterVersion, "adapterVersion");
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(partnerDisplayName, "partnerDisplayName");
        return new AdapterInfo(partnerVersion, adapterVersion, partnerId, partnerDisplayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdapterInfo)) {
            return false;
        }
        AdapterInfo adapterInfo = (AdapterInfo) other;
        return Intrinsics.a(this.partnerVersion, adapterInfo.partnerVersion) && Intrinsics.a(this.adapterVersion, adapterInfo.adapterVersion) && Intrinsics.a(this.partnerId, adapterInfo.partnerId) && Intrinsics.a(this.partnerDisplayName, adapterInfo.partnerDisplayName);
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getPartnerDisplayName() {
        return this.partnerDisplayName;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public int hashCode() {
        return this.partnerDisplayName.hashCode() + a.b(this.partnerId, a.b(this.adapterVersion, this.partnerVersion.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdapterInfo(partnerVersion=");
        sb.append(this.partnerVersion);
        sb.append(", adapterVersion=");
        sb.append(this.adapterVersion);
        sb.append(", partnerId=");
        sb.append(this.partnerId);
        sb.append(", partnerDisplayName=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.partnerDisplayName, ')');
    }
}
