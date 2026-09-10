package ads_mobile_sdk;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3865zf;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ads_mobile_sdk.aj2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lads_mobile_sdk/aj2;", "", "", "a", "Ljava/lang/String;", "adapterClassName", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C3865zf.b, "c", "sdkVersion", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "signals", "e", "signalErrorMessage", "", "f", "Ljava/lang/Integer;", "signalErrorCode", "", "g", "Ljava/lang/Long;", "latency", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class RtbAdapterData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    public final String adapterClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("adapter_version")
    public final String adapterVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sdk_version")
    public final String sdkVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("signals")
    public String signals;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("signal_error")
    public String signalErrorMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("signal_error_code")
    public Integer signalErrorCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("latency")
    public Long latency;

    public RtbAdapterData() {
        this(null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtbAdapterData)) {
            return false;
        }
        RtbAdapterData rtbAdapterData = (RtbAdapterData) obj;
        return Intrinsics.wireman(this.adapterClassName, rtbAdapterData.adapterClassName) && Intrinsics.wireman(this.adapterVersion, rtbAdapterData.adapterVersion) && Intrinsics.wireman(this.sdkVersion, rtbAdapterData.sdkVersion) && Intrinsics.wireman(this.signals, rtbAdapterData.signals) && Intrinsics.wireman(this.signalErrorMessage, rtbAdapterData.signalErrorMessage) && Intrinsics.wireman(this.signalErrorCode, rtbAdapterData.signalErrorCode) && Intrinsics.wireman(this.latency, rtbAdapterData.latency);
    }

    public final int hashCode() {
        String str = this.adapterClassName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adapterVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.signals;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.signalErrorMessage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.signalErrorCode;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.latency;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "RtbAdapterData(adapterClassName=" + this.adapterClassName + ", adapterVersion=" + this.adapterVersion + ", sdkVersion=" + this.sdkVersion + ", signals=" + this.signals + ", signalErrorMessage=" + this.signalErrorMessage + ", signalErrorCode=" + this.signalErrorCode + ", latency=" + this.latency + ")";
    }

    public /* synthetic */ RtbAdapterData(String str, String str2, String str3, String str4, Integer num, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, null);
    }

    public RtbAdapterData(String str, String str2, String str3, String str4, String str5, Integer num, Long l) {
        this.adapterClassName = str;
        this.adapterVersion = str2;
        this.sdkVersion = str3;
        this.signals = str4;
        this.signalErrorMessage = str5;
        this.signalErrorCode = num;
        this.latency = l;
    }
}
