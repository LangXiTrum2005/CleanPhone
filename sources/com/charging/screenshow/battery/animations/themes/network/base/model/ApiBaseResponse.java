package com.charging.screenshow.battery.animations.themes.network.base.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiBaseResponse;", "", "", "code", "I", "a", "()I", "", "", "errors", "Ljava/util/List;", "c", "()Ljava/util/List;", "status", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "error", "b", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApiBaseResponse {

    @SerializedName("code")
    private final int code;

    @SerializedName("error")
    private final String error;

    @SerializedName("errors")
    private final List<String> errors;

    @SerializedName("status")
    private final String status;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getErrors() {
        return this.errors;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
