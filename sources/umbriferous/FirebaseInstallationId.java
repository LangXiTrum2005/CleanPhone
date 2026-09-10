package umbriferous;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: umbriferous.sealless, reason: from toString */
/* JADX INFO: compiled from: FirebaseInstallationId.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lumbriferous/sealless;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "saneness", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirebaseInstallationId {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String fid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String authToken;

    public FirebaseInstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) other;
        return Intrinsics.wireman(this.fid, firebaseInstallationId.fid) && Intrinsics.wireman(this.authToken, firebaseInstallationId.authToken);
    }

    public int hashCode() {
        String str = this.fid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.fid + ", authToken=" + this.authToken + ')';
    }
}
