package com.yolo.networklibrary.common.model;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yolo/networklibrary/common/model/HttpResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "data", "", NotificationCompat.CATEGORY_MESSAGE, "", "error", "<init>", "(Ljava/lang/Object;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "saneness", "Ljava/lang/String;", "dern", "setMsg", "(Ljava/lang/String;)V", "I", "setError", "(I)V", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpResult<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("data")
    private T data;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("error")
    private int error;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private String msg;

    public HttpResult() {
        this(null, null, 0, 7, null);
    }

    public final T attabal() {
        return this.data;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResult)) {
            return false;
        }
        HttpResult httpResult = (HttpResult) other;
        return Intrinsics.wireman(this.data, httpResult.data) && Intrinsics.wireman(this.msg, httpResult.msg) && this.error == httpResult.error;
    }

    public int hashCode() {
        T t = this.data;
        return ((((t == null ? 0 : t.hashCode()) * 31) + this.msg.hashCode()) * 31) + Integer.hashCode(this.error);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getError() {
        return this.error;
    }

    public String toString() {
        return "HttpResult(data=" + this.data + ", msg=" + this.msg + ", error=" + this.error + ')';
    }

    public HttpResult(T t, String msg, int i) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.data = t;
        this.msg = msg;
        this.error = i;
    }

    public /* synthetic */ HttpResult(Object obj, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? -1 : i);
    }
}
