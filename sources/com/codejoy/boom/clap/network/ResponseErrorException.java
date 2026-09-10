package com.codejoy.boom.clap.network;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResponseErrorException.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/codejoy/boom/clap/network/ResponseErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "state", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "error", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResponseErrorException extends Exception {
    public static final int $stable = 8;

    @SerializedName("errorMessage")
    private final String errorMessage;

    @SerializedName("state")
    private final int state;

    public ResponseErrorException(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.state = i;
        this.errorMessage = errorMessage;
    }

    /* JADX INFO: renamed from: error, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: state, reason: from getter */
    public final int getState() {
        return this.state;
    }
}
