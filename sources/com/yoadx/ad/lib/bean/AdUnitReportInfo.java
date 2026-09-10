package com.yoadx.ad.lib.bean;

import com.ironsource.sdk.controller.f;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdUnitReportInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;", "Ljava/io/Serializable;", "adFormat", "", "adUnitId", "adUnitName", "adSource", f.b.c, "adLoadScenes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdFormat", "()Ljava/lang/String;", "setAdFormat", "(Ljava/lang/String;)V", "getAdUnitId", "setAdUnitId", "getAdUnitName", "setAdUnitName", "getAdSource", "setAdSource", "getAdId", "setAdId", "getAdLoadScenes", "setAdLoadScenes", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AdUnitReportInfo implements Serializable {
    private String adFormat;
    private String adId;
    private String adLoadScenes;
    private String adSource;
    private String adUnitId;
    private String adUnitName;

    public AdUnitReportInfo(String adFormat, String adUnitId, String adUnitName, String adSource, String adId, String adLoadScenes) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adLoadScenes, "adLoadScenes");
        this.adFormat = adFormat;
        this.adUnitId = adUnitId;
        this.adUnitName = adUnitName;
        this.adSource = adSource;
        this.adId = adId;
        this.adLoadScenes = adLoadScenes;
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getAdLoadScenes() {
        return this.adLoadScenes;
    }

    public final String getAdSource() {
        return this.adSource;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAdUnitName() {
        return this.adUnitName;
    }

    public final void setAdFormat(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adFormat = str;
    }

    public final void setAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adId = str;
    }

    public final void setAdLoadScenes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adLoadScenes = str;
    }

    public final void setAdSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adSource = str;
    }

    public final void setAdUnitId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setAdUnitName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adUnitName = str;
    }

    public /* synthetic */ AdUnitReportInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, str5, (i & 32) != 0 ? "" : str6);
    }
}
