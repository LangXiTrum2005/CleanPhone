package svd;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3865zf;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.dern, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lsvd/dern;", "", "", "attabal", "Ljava/lang/String;", C3865zf.b, "saneness", "sdkVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AdapterVersionData {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("adapter_version")
    public final String adapterVersion;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("sdk_version")
    public final String sdkVersion;

    public AdapterVersionData(String str, String str2) {
        this.adapterVersion = str;
        this.sdkVersion = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterVersionData)) {
            return false;
        }
        AdapterVersionData adapterVersionData = (AdapterVersionData) obj;
        return Intrinsics.wireman(this.adapterVersion, adapterVersionData.adapterVersion) && Intrinsics.wireman(this.sdkVersion, adapterVersionData.sdkVersion);
    }

    public final int hashCode() {
        String str = this.adapterVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkVersion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AdapterVersionData(adapterVersion=" + this.adapterVersion + ", sdkVersion=" + this.sdkVersion + ")";
    }
}
