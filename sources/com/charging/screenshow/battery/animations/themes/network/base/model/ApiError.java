package com.charging.screenshow.battery.animations.themes.network.base.model;

import androidx.datastore.preferences.protobuf.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiError;", "", "", "code", "I", "getCode", "()I", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "error", "getError", "", "errors", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApiError {

    @SerializedName("code")
    private final int code;

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
        if (!(obj instanceof ApiError)) {
            return false;
        }
        ApiError apiError = (ApiError) obj;
        return this.code == apiError.code && Intrinsics.a(this.status, apiError.status) && Intrinsics.a(this.error, apiError.error) && Intrinsics.a(this.errors, apiError.errors);
    }

    public final int hashCode() {
        int iB = a.b(this.error, a.b(this.status, Integer.hashCode(this.code) * 31, 31), 31);
        List<String> list = this.errors;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ApiError(code=" + this.code + ", status=" + this.status + ", error=" + this.error + ", errors=" + this.errors + ')';
    }
}
