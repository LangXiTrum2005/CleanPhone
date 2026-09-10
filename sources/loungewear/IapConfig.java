package loungewear;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: loungewear.saneness, reason: from toString */
/* JADX INFO: compiled from: IapConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lloungewear/saneness;", "", "", "openAfTransactionObserve", "openUpdateDate", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "Z", "getOpenAfTransactionObserve", "()Z", "saneness", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IapConfig {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("open_af_transaction_observe")
    private final boolean openAfTransactionObserve;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("open_update_cfg")
    private final boolean openUpdateDate;

    /* JADX WARN: Illegal instructions before constructor call */
    public IapConfig() {
        boolean z = false;
        this(z, z, 3, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getOpenUpdateDate() {
        return this.openUpdateDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IapConfig)) {
            return false;
        }
        IapConfig iapConfig = (IapConfig) other;
        return this.openAfTransactionObserve == iapConfig.openAfTransactionObserve && this.openUpdateDate == iapConfig.openUpdateDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.openAfTransactionObserve;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.openUpdateDate;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        return "IapConfig(openAfTransactionObserve=" + this.openAfTransactionObserve + ", openUpdateDate=" + this.openUpdateDate + ')';
    }

    public IapConfig(boolean z, boolean z2) {
        this.openAfTransactionObserve = z;
        this.openUpdateDate = z2;
    }

    public /* synthetic */ IapConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
