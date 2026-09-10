package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.competently, reason: from toString */
/* JADX INFO: compiled from: UserLabel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcanephora/competently;", "", "Lcanephora/saneness;", "forbiddenRegion", "Lcanephora/dern;", "limitRegion", "Lcanephora/wireman;", "notGpInstall", "Lcanephora/marial;", "oldUser", "<init>", "(Lcanephora/saneness;Lcanephora/dern;Lcanephora/wireman;Lcanephora/marial;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcanephora/saneness;", "()Lcanephora/saneness;", "setForbiddenRegion", "(Lcanephora/saneness;)V", "saneness", "Lcanephora/dern;", "()Lcanephora/dern;", "setLimitRegion", "(Lcanephora/dern;)V", "dern", "Lcanephora/wireman;", "()Lcanephora/wireman;", "setNotGpInstall", "(Lcanephora/wireman;)V", "wireman", "Lcanephora/marial;", "()Lcanephora/marial;", "setOldUser", "(Lcanephora/marial;)V", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserLabel {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("forbidden_region")
    private ForbiddenRegion forbiddenRegion;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("gp_install")
    private NotGpInstall notGpInstall;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("limit_region")
    private LimitRegion limitRegion;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("old_user")
    private OldUser oldUser;

    public UserLabel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final ForbiddenRegion getForbiddenRegion() {
        return this.forbiddenRegion;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final NotGpInstall getNotGpInstall() {
        return this.notGpInstall;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLabel)) {
            return false;
        }
        UserLabel userLabel = (UserLabel) other;
        return Intrinsics.wireman(this.forbiddenRegion, userLabel.forbiddenRegion) && Intrinsics.wireman(this.limitRegion, userLabel.limitRegion) && Intrinsics.wireman(this.notGpInstall, userLabel.notGpInstall) && Intrinsics.wireman(this.oldUser, userLabel.oldUser);
    }

    public int hashCode() {
        return (((((this.forbiddenRegion.hashCode() * 31) + this.limitRegion.hashCode()) * 31) + this.notGpInstall.hashCode()) * 31) + this.oldUser.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final LimitRegion getLimitRegion() {
        return this.limitRegion;
    }

    public String toString() {
        return "UserLabel(forbiddenRegion=" + this.forbiddenRegion + ", limitRegion=" + this.limitRegion + ", notGpInstall=" + this.notGpInstall + ", oldUser=" + this.oldUser + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final OldUser getOldUser() {
        return this.oldUser;
    }

    public UserLabel(ForbiddenRegion forbiddenRegion, LimitRegion limitRegion, NotGpInstall notGpInstall, OldUser oldUser) {
        Intrinsics.checkNotNullParameter(forbiddenRegion, "forbiddenRegion");
        Intrinsics.checkNotNullParameter(limitRegion, "limitRegion");
        Intrinsics.checkNotNullParameter(notGpInstall, "notGpInstall");
        Intrinsics.checkNotNullParameter(oldUser, "oldUser");
        this.forbiddenRegion = forbiddenRegion;
        this.limitRegion = limitRegion;
        this.notGpInstall = notGpInstall;
        this.oldUser = oldUser;
    }

    public /* synthetic */ UserLabel(ForbiddenRegion forbiddenRegion, LimitRegion limitRegion, NotGpInstall notGpInstall, OldUser oldUser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ForbiddenRegion(null, 1, null) : forbiddenRegion, (i & 2) != 0 ? new LimitRegion(null, null, 3, null) : limitRegion, (i & 4) != 0 ? new NotGpInstall(null, 1, null) : notGpInstall, (i & 8) != 0 ? new OldUser(null, null, 3, null) : oldUser);
    }
}
