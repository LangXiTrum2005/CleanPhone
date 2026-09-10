package com.zg.adlib.model;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/zg/adlib/model/ApiResultData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "code", "", "errors", "", "", "status", "error", "data", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getErrors", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getError", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApiResultData<T> {

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

    public ApiResultData() {
        this(0, null, null, null, null, 31, null);
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

    public ApiResultData(int i2, List<String> list, String str, String str2, T t) {
        this.code = i2;
        this.errors = list;
        this.status = str;
        this.error = str2;
        this.data = t;
    }

    public /* synthetic */ ApiResultData(int i2, List list, String str, String str2, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 20000 : i2, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : obj);
    }
}
