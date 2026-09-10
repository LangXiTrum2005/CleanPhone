package nhl;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: renamed from: nhl.saneness, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lnhl/saneness;", "", "", "", "attabal", "Ljava/util/List;", "noFillUrls", "", "saneness", "J", "refreshIntervalInSeconds", "dern", "Ljava/lang/String;", "gwsQueryId", "Lcom/google/gson/JsonObject;", "wireman", "Lcom/google/gson/JsonObject;", "responseInfoExtras", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ParentCommonConfig {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("nofill_urls")
    public final List<String> noFillUrls;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("gws_query_id")
    public final String gwsQueryId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("refresh_interval")
    public final long refreshIntervalInSeconds;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("response_info_extras")
    public final JsonObject responseInfoExtras;

    public ParentCommonConfig(ArrayList noFillUrls, long j, String gwsQueryId, JsonObject responseInfoExtras) {
        Intrinsics.checkNotNullParameter(noFillUrls, "noFillUrls");
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(responseInfoExtras, "responseInfoExtras");
        this.noFillUrls = noFillUrls;
        this.refreshIntervalInSeconds = j;
        this.gwsQueryId = gwsQueryId;
        this.responseInfoExtras = responseInfoExtras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentCommonConfig)) {
            return false;
        }
        ParentCommonConfig parentCommonConfig = (ParentCommonConfig) obj;
        return Intrinsics.wireman(this.noFillUrls, parentCommonConfig.noFillUrls) && this.refreshIntervalInSeconds == parentCommonConfig.refreshIntervalInSeconds && Intrinsics.wireman(this.gwsQueryId, parentCommonConfig.gwsQueryId) && Intrinsics.wireman(this.responseInfoExtras, parentCommonConfig.responseInfoExtras);
    }

    public final int hashCode() {
        return this.responseInfoExtras.hashCode() + licking.attabal(this.gwsQueryId, (Long.hashCode(this.refreshIntervalInSeconds) + (this.noFillUrls.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ParentCommonConfig(noFillUrls=" + this.noFillUrls + ", refreshIntervalInSeconds=" + this.refreshIntervalInSeconds + ", gwsQueryId=" + this.gwsQueryId + ", responseInfoExtras=" + this.responseInfoExtras + ")";
    }
}
