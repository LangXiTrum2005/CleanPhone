package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.cutely, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsvd/cutely;", "", "", "attabal", "Ljava/lang/Long;", "runtimeFreeMemory", "saneness", "runtimeMaxMemory", "dern", "runtimeTotalMemory", "", "wireman", "Ljava/lang/Integer;", "webviewCount", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MemorySignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("runtime_free")
    public Long runtimeFreeMemory;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("runtime_total")
    public Long runtimeTotalMemory;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("runtime_max")
    public Long runtimeMaxMemory;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("web_view_count")
    public Integer webviewCount;

    public MemorySignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemorySignals)) {
            return false;
        }
        MemorySignals memorySignals = (MemorySignals) obj;
        return Intrinsics.wireman(this.runtimeFreeMemory, memorySignals.runtimeFreeMemory) && Intrinsics.wireman(this.runtimeMaxMemory, memorySignals.runtimeMaxMemory) && Intrinsics.wireman(this.runtimeTotalMemory, memorySignals.runtimeTotalMemory) && Intrinsics.wireman(this.webviewCount, memorySignals.webviewCount);
    }

    public final int hashCode() {
        Long l = this.runtimeFreeMemory;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.runtimeMaxMemory;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.runtimeTotalMemory;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.webviewCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MemorySignals(runtimeFreeMemory=" + this.runtimeFreeMemory + ", runtimeMaxMemory=" + this.runtimeMaxMemory + ", runtimeTotalMemory=" + this.runtimeTotalMemory + ", webviewCount=" + this.webviewCount + ")";
    }

    public MemorySignals(Long l, Long l2, Long l3, Integer num) {
        this.runtimeFreeMemory = l;
        this.runtimeMaxMemory = l2;
        this.runtimeTotalMemory = l3;
        this.webviewCount = num;
    }

    public /* synthetic */ MemorySignals(int i) {
        this(null, null, null, null);
    }
}
