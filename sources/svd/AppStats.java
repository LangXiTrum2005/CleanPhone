package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: renamed from: svd.wireman, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsvd/wireman;", "", "", "attabal", "Ljava/lang/String;", "sequenceNumber", "", "saneness", "I", "priorRequestCount", "dern", "priorRequestInSessionCount", "", "wireman", "J", "timeInSessionMilliseconds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppStats {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("seq_num")
    public final String sequenceNumber;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("preqs_in_session")
    public final int priorRequestInSessionCount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("preqs")
    public final int priorRequestCount;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("time_in_session")
    public final long timeInSessionMilliseconds;

    public AppStats(String sequenceNumber, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(sequenceNumber, "sequenceNumber");
        this.sequenceNumber = sequenceNumber;
        this.priorRequestCount = i;
        this.priorRequestInSessionCount = i2;
        this.timeInSessionMilliseconds = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStats)) {
            return false;
        }
        AppStats appStats = (AppStats) obj;
        return Intrinsics.wireman(this.sequenceNumber, appStats.sequenceNumber) && this.priorRequestCount == appStats.priorRequestCount && this.priorRequestInSessionCount == appStats.priorRequestInSessionCount && this.timeInSessionMilliseconds == appStats.timeInSessionMilliseconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeInSessionMilliseconds) + bonny.attabal(this.priorRequestInSessionCount, bonny.attabal(this.priorRequestCount, this.sequenceNumber.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AppStats(sequenceNumber=" + this.sequenceNumber + ", priorRequestCount=" + this.priorRequestCount + ", priorRequestInSessionCount=" + this.priorRequestInSessionCount + ", timeInSessionMilliseconds=" + this.timeInSessionMilliseconds + ")";
    }
}
