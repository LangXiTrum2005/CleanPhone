package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.apical, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsvd/apical;", "", "", "attabal", "Ljava/lang/Integer;", "activeNetworkState", "", "saneness", "Ljava/lang/Boolean;", "isActiveNetworkMetered", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NetworkSignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("active_network_state")
    public Integer activeNetworkState;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("active_network_metered")
    public Boolean isActiveNetworkMetered;

    public NetworkSignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkSignals)) {
            return false;
        }
        NetworkSignals networkSignals = (NetworkSignals) obj;
        return Intrinsics.wireman(this.activeNetworkState, networkSignals.activeNetworkState) && Intrinsics.wireman(this.isActiveNetworkMetered, networkSignals.isActiveNetworkMetered);
    }

    public final int hashCode() {
        Integer num = this.activeNetworkState;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.isActiveNetworkMetered;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSignals(activeNetworkState=" + this.activeNetworkState + ", isActiveNetworkMetered=" + this.isActiveNetworkMetered + ")";
    }

    public NetworkSignals(Integer num, Boolean bool) {
        this.activeNetworkState = num;
        this.isActiveNetworkMetered = bool;
    }

    public /* synthetic */ NetworkSignals(int i) {
        this(null, null);
    }
}
