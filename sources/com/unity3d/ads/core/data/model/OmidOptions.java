package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/model/OmidOptions;", "", "isolateVerificationScripts", "", "impressionOwner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "videoEventsOwner", "customReferenceData", "", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "mediaEventsOwner", "(ZLcom/iab/omid/library/unity3d/adsession/Owner;Lcom/iab/omid/library/unity3d/adsession/Owner;Ljava/lang/String;Lcom/iab/omid/library/unity3d/adsession/ImpressionType;Lcom/iab/omid/library/unity3d/adsession/CreativeType;Lcom/iab/omid/library/unity3d/adsession/Owner;)V", "getCreativeType", "()Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "getCustomReferenceData", "()Ljava/lang/String;", "getImpressionOwner", "()Lcom/iab/omid/library/unity3d/adsession/Owner;", "getImpressionType", "()Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "getIsolateVerificationScripts", "()Z", "getMediaEventsOwner", "getVideoEventsOwner", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class OmidOptions {
    private final CreativeType creativeType;
    private final String customReferenceData;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;
    private final Owner videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = omidOptions.isolateVerificationScripts;
        }
        if ((i10 & 2) != 0) {
            owner = omidOptions.impressionOwner;
        }
        if ((i10 & 4) != 0) {
            owner2 = omidOptions.videoEventsOwner;
        }
        if ((i10 & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        if ((i10 & 16) != 0) {
            impressionType = omidOptions.impressionType;
        }
        if ((i10 & 32) != 0) {
            creativeType = omidOptions.creativeType;
        }
        if ((i10 & 64) != 0) {
            owner3 = omidOptions.mediaEventsOwner;
        }
        CreativeType creativeType2 = creativeType;
        Owner owner4 = owner3;
        ImpressionType impressionType2 = impressionType;
        Owner owner5 = owner2;
        return omidOptions.copy(z10, owner, owner5, str, impressionType2, creativeType2, owner4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean isolateVerificationScripts, Owner impressionOwner, Owner videoEventsOwner, String customReferenceData, ImpressionType impressionType, CreativeType creativeType, Owner mediaEventsOwner) {
        return new OmidOptions(isolateVerificationScripts, impressionOwner, videoEventsOwner, customReferenceData, impressionType, creativeType, mediaEventsOwner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) other;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && n.a(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z10 = this.isolateVerificationScripts;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        int i10 = r0 * 31;
        Owner owner = this.impressionOwner;
        int iHashCode = (i10 + (owner == null ? 0 : owner.hashCode())) * 31;
        Owner owner2 = this.videoEventsOwner;
        int iHashCode2 = (iHashCode + (owner2 == null ? 0 : owner2.hashCode())) * 31;
        String str = this.customReferenceData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ImpressionType impressionType = this.impressionType;
        int iHashCode4 = (iHashCode3 + (impressionType == null ? 0 : impressionType.hashCode())) * 31;
        CreativeType creativeType = this.creativeType;
        int iHashCode5 = (iHashCode4 + (creativeType == null ? 0 : creativeType.hashCode())) * 31;
        Owner owner3 = this.mediaEventsOwner;
        return iHashCode5 + (owner3 != null ? owner3.hashCode() : 0);
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3) {
        this.isolateVerificationScripts = z10;
        this.impressionOwner = owner;
        this.videoEventsOwner = owner2;
        this.customReferenceData = str;
        this.impressionType = impressionType;
        this.creativeType = creativeType;
        this.mediaEventsOwner = owner3;
    }

    public /* synthetic */ OmidOptions(boolean z10, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i10, g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : owner, (i10 & 4) != 0 ? null : owner2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : impressionType, (i10 & 32) != 0 ? null : creativeType, (i10 & 64) != 0 ? null : owner3);
    }
}
