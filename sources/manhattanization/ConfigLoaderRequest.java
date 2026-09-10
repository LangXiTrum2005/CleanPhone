package manhattanization;

import com.google.gson.annotations.SerializedName;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: renamed from: manhattanization.attabal, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lmanhattanization/attabal;", "", "", "attabal", "Ljava/lang/String;", "appId", "saneness", "adUnitId", "", "dern", "Z", "isCalledFromInit", "wireman", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "marial", "Ljava/lang/Integer;", "versionCode", "beachfront", "afmaVersion", "competently", "experimentIds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ConfigLoaderRequest {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("app_id")
    public final String appId;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("js")
    public final String afmaVersion;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("experiment_ids")
    public final String experimentIds;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_init")
    public final boolean isCalledFromInit;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("version")
    public final Integer versionCode;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("ad_unit_id")
    public final String adUnitId;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("pn")
    public final String packageName;

    public ConfigLoaderRequest(String appId, String str, boolean z, String packageName, Integer num, String afmaVersion, String experimentIds) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        this.appId = appId;
        this.adUnitId = str;
        this.isCalledFromInit = z;
        this.packageName = packageName;
        this.versionCode = num;
        this.afmaVersion = afmaVersion;
        this.experimentIds = experimentIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigLoaderRequest)) {
            return false;
        }
        ConfigLoaderRequest configLoaderRequest = (ConfigLoaderRequest) obj;
        return Intrinsics.wireman(this.appId, configLoaderRequest.appId) && Intrinsics.wireman(this.adUnitId, configLoaderRequest.adUnitId) && this.isCalledFromInit == configLoaderRequest.isCalledFromInit && Intrinsics.wireman(this.packageName, configLoaderRequest.packageName) && Intrinsics.wireman(this.versionCode, configLoaderRequest.versionCode) && Intrinsics.wireman(this.afmaVersion, configLoaderRequest.afmaVersion) && Intrinsics.wireman(this.experimentIds, configLoaderRequest.experimentIds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iHashCode = this.appId.hashCode() * 31;
        String str = this.adUnitId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isCalledFromInit;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iAttabal = licking.attabal(this.packageName, (iHashCode2 + r2) * 31, 31);
        Integer num = this.versionCode;
        return this.experimentIds.hashCode() + licking.attabal(this.afmaVersion, (iAttabal + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "ConfigLoaderRequest(appId=" + this.appId + ", adUnitId=" + this.adUnitId + ", isCalledFromInit=" + this.isCalledFromInit + ", packageName=" + this.packageName + ", versionCode=" + this.versionCode + ", afmaVersion=" + this.afmaVersion + ", experimentIds=" + this.experimentIds + ")";
    }
}
