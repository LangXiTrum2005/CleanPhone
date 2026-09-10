package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: svd.competently, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lsvd/competently;", "", "Lsvd/arytenoidectomy;", "attabal", "Lsvd/arytenoidectomy;", "signals", "", "saneness", "Ljava/lang/String;", "url", "dern", "postBody", "wireman", "error", "", "marial", "Ljava/lang/Boolean;", "cookiesInclude", "beachfront", "requestId", "competently", "params", "impromptu", "cParams", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ClientRequestBuildingData {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("signals")
    public arytenoidectomy signals;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("request_id")
    public String requestId;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("params")
    public String params;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("post_body")
    public String postBody;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("c_params")
    public String cParams;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("cookies_include")
    public Boolean cookiesInclude;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("url")
    public String url;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("error")
    public String error;

    public ClientRequestBuildingData() {
        this(null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRequestBuildingData)) {
            return false;
        }
        ClientRequestBuildingData clientRequestBuildingData = (ClientRequestBuildingData) obj;
        return Intrinsics.wireman(this.signals, clientRequestBuildingData.signals) && Intrinsics.wireman(this.url, clientRequestBuildingData.url) && Intrinsics.wireman(this.postBody, clientRequestBuildingData.postBody) && Intrinsics.wireman(this.error, clientRequestBuildingData.error) && Intrinsics.wireman(this.cookiesInclude, clientRequestBuildingData.cookiesInclude) && Intrinsics.wireman(this.requestId, clientRequestBuildingData.requestId) && Intrinsics.wireman(this.params, clientRequestBuildingData.params) && Intrinsics.wireman(this.cParams, clientRequestBuildingData.cParams);
    }

    public final int hashCode() {
        arytenoidectomy arytenoidectomyVar = this.signals;
        int iHashCode = (arytenoidectomyVar == null ? 0 : arytenoidectomyVar.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postBody;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.cookiesInclude;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.params;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cParams;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "ClientRequestBuildingData(signals=" + this.signals + ", url=" + this.url + ", postBody=" + this.postBody + ", error=" + this.error + ", cookiesInclude=" + this.cookiesInclude + ", requestId=" + this.requestId + ", params=" + this.params + ", cParams=" + this.cParams + ")";
    }

    public ClientRequestBuildingData(arytenoidectomy arytenoidectomyVar, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6) {
        this.signals = arytenoidectomyVar;
        this.url = str;
        this.postBody = str2;
        this.error = str3;
        this.cookiesInclude = bool;
        this.requestId = str4;
        this.params = str5;
        this.cParams = str6;
    }

    public /* synthetic */ ClientRequestBuildingData(String str, String str2, String str3, Boolean bool, String str4, String str5, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, null, (i & 128) != 0 ? null : str5);
    }
}
