package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.saneness, reason: from toString */
/* JADX INFO: compiled from: ForbiddenRegion.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcanephora/saneness;", "", "Lcanephora/attabal;", "common", "<init>", "(Lcanephora/attabal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcanephora/attabal;", "()Lcanephora/attabal;", "setCommon", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ForbiddenRegion {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("common")
    private CommonLimit common;

    public ForbiddenRegion() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final CommonLimit getCommon() {
        return this.common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForbiddenRegion) && Intrinsics.wireman(this.common, ((ForbiddenRegion) other).common);
    }

    public int hashCode() {
        return this.common.hashCode();
    }

    public String toString() {
        return "ForbiddenRegion(common=" + this.common + ')';
    }

    public ForbiddenRegion(CommonLimit common) {
        Intrinsics.checkNotNullParameter(common, "common");
        this.common = common;
    }

    public /* synthetic */ ForbiddenRegion(CommonLimit commonLimit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CommonLimit(null, 0, 3, null) : commonLimit);
    }
}
