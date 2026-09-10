package com.yoadx.ad.lib.bean;

import com.ironsource.sdk.controller.f;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdLtvReportInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yoadx/ad/lib/bean/AdLtvReportInfo;", "Lcom/yoadx/ad/lib/bean/AdUnitReportInfo;", "adFormat", "", "adUnitId", "adUnitName", "adSource", f.b.c, "adLoadScenes", "responseMediationAdapterClassName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResponseMediationAdapterClassName", "()Ljava/lang/String;", "setResponseMediationAdapterClassName", "(Ljava/lang/String;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdLtvReportInfo extends AdUnitReportInfo {
    private String responseMediationAdapterClassName;

    public /* synthetic */ AdLtvReportInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, str5, str6, str7);
    }

    public final String getResponseMediationAdapterClassName() {
        return this.responseMediationAdapterClassName;
    }

    public final void setResponseMediationAdapterClassName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.responseMediationAdapterClassName = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLtvReportInfo(String adFormat, String adUnitId, String adUnitName, String adSource, String adId, String adLoadScenes, String responseMediationAdapterClassName) {
        super(adFormat, adUnitId, adUnitName, adSource, adId, adLoadScenes);
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adUnitName, "adUnitName");
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adLoadScenes, "adLoadScenes");
        Intrinsics.checkNotNullParameter(responseMediationAdapterClassName, "responseMediationAdapterClassName");
        this.responseMediationAdapterClassName = responseMediationAdapterClassName;
    }
}
