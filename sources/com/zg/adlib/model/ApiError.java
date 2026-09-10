package com.zg.adlib.model;

import androidx.datastore.preferences.protobuf.a;
import com.google.gson.annotations.SerializedName;
import com.p004ironsource.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/zg/adlib/model/ApiError;", "", "code", "", "status", "", "error", "errors", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getStatus", "()Ljava/lang/String;", "getError", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApiError {

    @SerializedName("code")
    private final int code;

    @SerializedName("error")
    private final String error;

    @SerializedName("errors")
    private final List<String> errors;

    @SerializedName("status")
    private final String status;

    public ApiError(int i2, String status, String error, List<String> list) {
        Intrinsics.f(status, "status");
        Intrinsics.f(error, "error");
        this.code = i2;
        this.status = status;
        this.error = error;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiError copy$default(ApiError apiError, int i2, String str, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = apiError.code;
        }
        if ((i3 & 2) != 0) {
            str = apiError.status;
        }
        if ((i3 & 4) != 0) {
            str2 = apiError.error;
        }
        if ((i3 & 8) != 0) {
            list = apiError.errors;
        }
        return apiError.copy(i2, str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final List<String> component4() {
        return this.errors;
    }

    public final ApiError copy(int code, String status, String error, List<String> errors) {
        Intrinsics.f(status, "status");
        Intrinsics.f(error, "error");
        return new ApiError(code, status, error, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) other;
        return this.code == apiError.code && Intrinsics.a(this.status, apiError.status) && Intrinsics.a(this.error, apiError.error) && Intrinsics.a(this.errors, apiError.errors);
    }

    public final int getCode() {
        return this.code;
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
        int iB = a.b(this.error, a.b(this.status, Integer.hashCode(this.code) * 31, 31), 31);
        List<String> list = this.errors;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ApiError(code=" + this.code + ", status=" + this.status + ", error=" + this.error + ", errors=" + this.errors + ')';
    }

    public /* synthetic */ ApiError(int i2, String str, String str2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, (i3 & 8) != 0 ? null : list);
    }
}
