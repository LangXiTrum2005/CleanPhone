package com.yolo.networklibrary.common.model;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResponseErrorException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yolo/networklibrary/common/model/ResponseErrorException;", "", "", "state", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "attabal", "I", "saneness", "Ljava/lang/String;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResponseErrorException {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    @SerializedName("state")
    private final int state;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMessage")
    private final String errorMessage;

    public ResponseErrorException(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.state = i;
        this.errorMessage = errorMessage;
    }
}
