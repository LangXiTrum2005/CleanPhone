package com.charging.screenshow.battery.animations.themes.network.base.model;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiResultData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "code", "I", "getCode", "()I", "", "", "errors", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "error", "getError", "data", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
}
