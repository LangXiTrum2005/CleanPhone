package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.saneness, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsvd/saneness;", "", "", "attabal", "Ljava/lang/Integer;", "priorClickCount", "", "saneness", "Ljava/lang/Long;", "loadDuration", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AdUnitQualitySignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("pcc")
    public final Integer priorClickCount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("dload")
    public final Long loadDuration;

    public AdUnitQualitySignals(Integer num, Long l) {
        this.priorClickCount = num;
        this.loadDuration = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdUnitQualitySignals)) {
            return false;
        }
        AdUnitQualitySignals adUnitQualitySignals = (AdUnitQualitySignals) obj;
        return Intrinsics.wireman(this.priorClickCount, adUnitQualitySignals.priorClickCount) && Intrinsics.wireman(this.loadDuration, adUnitQualitySignals.loadDuration);
    }

    public final int hashCode() {
        Integer num = this.priorClickCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.loadDuration;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AdUnitQualitySignals(priorClickCount=" + this.priorClickCount + ", loadDuration=" + this.loadDuration + ")";
    }
}
