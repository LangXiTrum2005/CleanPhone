package com.yoadx.ad.lib.bean;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdShowReportInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yoadx/ad/lib/bean/AdShowReportInfo;", "Ljava/io/Serializable;", "adCacheTimeInSec", "", "adShowDurationInMs", "", "showError", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "showErrorCode", "showErrorMsg", "", "<init>", "(IJLcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;ILjava/lang/String;)V", "getAdCacheTimeInSec", "()I", "setAdCacheTimeInSec", "(I)V", "getAdShowDurationInMs", "()J", "setAdShowDurationInMs", "(J)V", "getShowError", "()Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "setShowError", "(Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;)V", "getShowErrorCode", "setShowErrorCode", "getShowErrorMsg", "()Ljava/lang/String;", "setShowErrorMsg", "(Ljava/lang/String;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdShowReportInfo implements Serializable {
    private int adCacheTimeInSec;
    private long adShowDurationInMs;
    private FullScreenContentError showError;
    private int showErrorCode;
    private String showErrorMsg;

    public AdShowReportInfo() {
        this(0, 0L, null, 0, null, 31, null);
    }

    public final int getAdCacheTimeInSec() {
        return this.adCacheTimeInSec;
    }

    public final long getAdShowDurationInMs() {
        return this.adShowDurationInMs;
    }

    public final FullScreenContentError getShowError() {
        return this.showError;
    }

    public final int getShowErrorCode() {
        return this.showErrorCode;
    }

    public final String getShowErrorMsg() {
        return this.showErrorMsg;
    }

    public final void setAdCacheTimeInSec(int i) {
        this.adCacheTimeInSec = i;
    }

    public final void setAdShowDurationInMs(long j) {
        this.adShowDurationInMs = j;
    }

    public final void setShowError(FullScreenContentError fullScreenContentError) {
        this.showError = fullScreenContentError;
    }

    public final void setShowErrorCode(int i) {
        this.showErrorCode = i;
    }

    public final void setShowErrorMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.showErrorMsg = str;
    }

    public AdShowReportInfo(int i, long j, FullScreenContentError fullScreenContentError, int i2, String showErrorMsg) {
        Intrinsics.checkNotNullParameter(showErrorMsg, "showErrorMsg");
        this.adCacheTimeInSec = i;
        this.adShowDurationInMs = j;
        this.showError = fullScreenContentError;
        this.showErrorCode = i2;
        this.showErrorMsg = showErrorMsg;
    }

    public /* synthetic */ AdShowReportInfo(int i, long j, FullScreenContentError fullScreenContentError, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? null : fullScreenContentError, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? "" : str);
    }
}
