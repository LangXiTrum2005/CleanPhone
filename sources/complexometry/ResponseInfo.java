package complexometry;

import android.os.Bundle;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: complexometry.molybdenite, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010#¨\u0006$"}, d2 = {"Lcomplexometry/molybdenite;", "", "", "adapterClassName", "responseId", "Landroid/os/Bundle;", "responseExtras", "Lcomplexometry/impromptu;", "loadedAdSourceResponseInfo", "", "adSourceResponses", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcomplexometry/impromptu;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "saneness", "dern", "Landroid/os/Bundle;", "getResponseExtras", "()Landroid/os/Bundle;", "wireman", "Lcomplexometry/impromptu;", "getLoadedAdSourceResponseInfo", "()Lcomplexometry/impromptu;", "marial", "Ljava/util/List;", "()Ljava/util/List;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ResponseInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String adapterClassName;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final Bundle responseExtras;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    public final List adSourceResponses;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final String responseId;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    public final AdSourceResponseInfo loadedAdSourceResponseInfo;

    public ResponseInfo(String str, String str2, Bundle responseExtras, AdSourceResponseInfo impromptuVar, List<AdSourceResponseInfo> adSourceResponses) {
        Intrinsics.checkNotNullParameter(responseExtras, "responseExtras");
        Intrinsics.checkNotNullParameter(adSourceResponses, "adSourceResponses");
        this.adapterClassName = str;
        this.responseId = str2;
        this.responseExtras = responseExtras;
        this.loadedAdSourceResponseInfo = impromptuVar;
        this.adSourceResponses = adSourceResponses;
    }

    public final List<AdSourceResponseInfo> attabal() {
        return this.adSourceResponses;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final String getResponseId() {
        return this.responseId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseInfo)) {
            return false;
        }
        ResponseInfo responseInfo = (ResponseInfo) other;
        return Intrinsics.wireman(this.adapterClassName, responseInfo.adapterClassName) && Intrinsics.wireman(this.responseId, responseInfo.responseId) && Intrinsics.wireman(this.responseExtras, responseInfo.responseExtras) && Intrinsics.wireman(this.loadedAdSourceResponseInfo, responseInfo.loadedAdSourceResponseInfo) && Intrinsics.wireman(this.adSourceResponses, responseInfo.adSourceResponses);
    }

    public int hashCode() {
        String str = this.adapterClassName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.responseId;
        int iHashCode2 = (this.responseExtras.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        AdSourceResponseInfo impromptuVar = this.loadedAdSourceResponseInfo;
        return this.adSourceResponses.hashCode() + ((iHashCode2 + (impromptuVar != null ? impromptuVar.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getAdapterClassName() {
        return this.adapterClassName;
    }

    public String toString() {
        return "ResponseInfo(adapterClassName=" + this.adapterClassName + ", responseId=" + this.responseId + ", responseExtras=" + this.responseExtras + ", loadedAdSourceResponseInfo=" + this.loadedAdSourceResponseInfo + ", adSourceResponses=" + this.adSourceResponses + ")";
    }
}
