package incidentally;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: incidentally.attabal, reason: from toString */
/* JADX INFO: compiled from: VersionResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Lincidentally/attabal;", "", "", "isNew", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "Z", "()Z", "setNew", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VersionResponse {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_new")
    private boolean isNew;

    public VersionResponse() {
        this(false, 1, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VersionResponse) && this.isNew == ((VersionResponse) other).isNew;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew);
    }

    public String toString() {
        return "VersionResponse(isNew=" + this.isNew + ")";
    }

    public VersionResponse(boolean z) {
        this.isNew = z;
    }

    public /* synthetic */ VersionResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
