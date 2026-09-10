package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.impassible, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lsvd/impassible;", "", "", "attabal", "Ljava/lang/String;", "playStoreVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class PlayStoreSignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("package_version")
    public String playStoreVersion;

    public PlayStoreSignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayStoreSignals) && Intrinsics.wireman(this.playStoreVersion, ((PlayStoreSignals) obj).playStoreVersion);
    }

    public final int hashCode() {
        String str = this.playStoreVersion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PlayStoreSignals(playStoreVersion=" + this.playStoreVersion + ")";
    }

    public PlayStoreSignals(String str) {
        this.playStoreVersion = str;
    }

    public /* synthetic */ PlayStoreSignals(int i) {
        this((String) null);
    }
}
