package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.kowloon, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsvd/kowloon;", "", "", "attabal", "Ljava/lang/Boolean;", "isInstantApp", "saneness", "Z", "isPrivilegedProcess", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SdkEnvironment {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("instant_app")
    public Boolean isInstantApp;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_privileged_process")
    public boolean isPrivilegedProcess;

    public SdkEnvironment() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return Intrinsics.wireman(this.isInstantApp, sdkEnvironment.isInstantApp) && this.isPrivilegedProcess == sdkEnvironment.isPrivilegedProcess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        Boolean bool = this.isInstantApp;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.isPrivilegedProcess;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "SdkEnvironment(isInstantApp=" + this.isInstantApp + ", isPrivilegedProcess=" + this.isPrivilegedProcess + ")";
    }

    public SdkEnvironment(Boolean bool, boolean z) {
        this.isInstantApp = bool;
        this.isPrivilegedProcess = z;
    }

    public /* synthetic */ SdkEnvironment(int i) {
        this(null, false);
    }
}
