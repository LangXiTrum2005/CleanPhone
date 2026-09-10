package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.attabal, reason: from toString */
/* JADX INFO: compiled from: CommonLimit.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcanephora/attabal;", "", "", "debugState", "", "label", "<init>", "(Ljava/lang/Boolean;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setDebugState", "(Ljava/lang/Boolean;)V", "saneness", "I", "setLabel", "(I)V", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CommonLimit {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("debug_state")
    private Boolean debugState;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("label")
    private int label;

    public CommonLimit() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final Boolean getDebugState() {
        return this.debugState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLimit)) {
            return false;
        }
        CommonLimit commonLimit = (CommonLimit) other;
        return Intrinsics.wireman(this.debugState, commonLimit.debugState) && this.label == commonLimit.label;
    }

    public int hashCode() {
        Boolean bool = this.debugState;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + Integer.hashCode(this.label);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    public String toString() {
        return "CommonLimit(debugState=" + this.debugState + ", label=" + this.label + ')';
    }

    public CommonLimit(Boolean bool, int i) {
        this.debugState = bool;
        this.label = i;
    }

    public /* synthetic */ CommonLimit(Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? 0 : i);
    }
}
