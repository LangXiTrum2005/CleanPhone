package com.inmobi.media.videoPlayer.model;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/videoPlayer/model/HtmlOmidTracker;", "", "<init>", "()V", "vendor", "", "getVendor", "()Ljava/lang/String;", "setVendor", "(Ljava/lang/String;)V", "verificationParams", "getVerificationParams", "setVerificationParams", "url", "getUrl", "setUrl", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HtmlOmidTracker {
    private String verificationParams;
    private String vendor = "";
    private String url = "";

    public final String getUrl() {
        return this.url;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final String getVerificationParams() {
        return this.verificationParams;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setVendor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vendor = str;
    }

    public final void setVerificationParams(String str) {
        this.verificationParams = str;
    }
}
