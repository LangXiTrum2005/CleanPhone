package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/model/OMData;", "", "version", "", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartnerName", "()Ljava/lang/String;", "getPartnerVersion", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public OMData(String version, String partnerName, String partnerVersion) {
        n.f(version, "version");
        n.f(partnerName, "partnerName");
        n.f(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oMData.version;
        }
        if ((i10 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i10 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final OMData copy(String version, String partnerName, String partnerVersion) {
        n.f(version, "version");
        n.f(partnerName, "partnerName");
        n.f(partnerVersion, "partnerVersion");
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) other;
        return n.a(this.version, oMData.version) && n.a(this.partnerName, oMData.partnerName) && n.a(this.partnerVersion, oMData.partnerVersion);
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + u.e(this.version.hashCode() * 31, 31, this.partnerName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OMData(version=");
        sb2.append(this.version);
        sb2.append(", partnerName=");
        sb2.append(this.partnerName);
        sb2.append(", partnerVersion=");
        return d.k(sb2, this.partnerVersion, ')');
    }
}
