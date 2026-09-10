package com.zg.adlib.model;

import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import com.p004ironsource.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0018\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003JR\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, d2 = {"Lcom/zg/adlib/model/ApiResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "code", "", "data", "errors", "", "", "status", "error", "<init>", "(ILjava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrors", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/zg/adlib/model/ApiResult;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public ApiResult(int i2, T t, List<String> list, String str, String str2) {
        this.code = i2;
        this.data = t;
        this.errors = list;
        this.status = str;
        this.error = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResult copy$default(ApiResult apiResult, int i2, Object obj, List list, String str, String str2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i2 = apiResult.code;
        }
        if ((i3 & 2) != 0) {
            obj = apiResult.data;
        }
        if ((i3 & 4) != 0) {
            list = apiResult.errors;
        }
        if ((i3 & 8) != 0) {
            str = apiResult.status;
        }
        if ((i3 & 16) != 0) {
            str2 = apiResult.error;
        }
        String str3 = str2;
        List list2 = list;
        return apiResult.copy(i2, obj, list2, str, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final T component2() {
        return this.data;
    }

    public final List<String> component3() {
        return this.errors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ApiResult<T> copy(int code, T data, List<String> errors, String status, String error) {
        return new ApiResult<>(code, data, errors, status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResult)) {
            return false;
        }
        ApiResult apiResult = (ApiResult) other;
        return this.code == apiResult.code && Intrinsics.a(this.data, apiResult.data) && Intrinsics.a(this.errors, apiResult.errors) && Intrinsics.a(this.status, apiResult.status) && Intrinsics.a(this.error, apiResult.error);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
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

    public String toString() {
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
