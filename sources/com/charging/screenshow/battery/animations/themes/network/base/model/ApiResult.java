package com.charging.screenshow.battery.animations.themes.network.base.model;

import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "code", "I", "getCode", "()I", "data", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "", "", "errors", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "error", "getError", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApiResult<T> {

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final T data;

    @SerializedName("error")
    private final String error;

    @SerializedName("errors")
    private final List<String> errors;

    @SerializedName("status")
    private final String status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResult)) {
            return false;
        }
        ApiResult apiResult = (ApiResult) obj;
        return this.code == apiResult.code && Intrinsics.a(this.data, apiResult.data) && Intrinsics.a(this.errors, apiResult.errors) && Intrinsics.a(this.status, apiResult.status) && Intrinsics.a(this.error, apiResult.error);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        List<String> list = this.errors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.status;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiResult(code=");
        sb.append(this.code);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", error=");
        return a.p(sb, this.error, ')');
    }
}
