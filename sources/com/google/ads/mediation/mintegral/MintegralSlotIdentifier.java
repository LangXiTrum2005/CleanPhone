package com.google.ads.mediation.mintegral;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MintegralSlotIdentifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/google/ads/mediation/mintegral/MintegralSlotIdentifier;", "", "", "adUnitId", "placementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/ads/mediation/mintegral/MintegralSlotIdentifier;", "toString", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "getAdUnitId", "saneness", "getPlacementId", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MintegralSlotIdentifier {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String adUnitId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String placementId;

    public MintegralSlotIdentifier(String adUnitId, String placementId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.adUnitId = adUnitId;
        this.placementId = placementId;
    }

    public static /* synthetic */ MintegralSlotIdentifier copy$default(MintegralSlotIdentifier mintegralSlotIdentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mintegralSlotIdentifier.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = mintegralSlotIdentifier.placementId;
        }
        return mintegralSlotIdentifier.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    public final MintegralSlotIdentifier copy(String adUnitId, String placementId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new MintegralSlotIdentifier(adUnitId, placementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MintegralSlotIdentifier)) {
            return false;
        }
        MintegralSlotIdentifier mintegralSlotIdentifier = (MintegralSlotIdentifier) other;
        return Intrinsics.wireman(this.adUnitId, mintegralSlotIdentifier.adUnitId) && Intrinsics.wireman(this.placementId, mintegralSlotIdentifier.placementId);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return (this.adUnitId.hashCode() * 31) + this.placementId.hashCode();
    }

    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ")";
    }
}
