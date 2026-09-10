package com.google.android.libraries.ads.mobile.sdk.internal.webview;

import ads_mobile_sdk.gq0;
import ads_mobile_sdk.mp0;
import android.net.Uri;
import formularization.attabal;
import formularization.beachfront;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.gintrap;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.hemolysin;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "Lsaneness/gerenuk;", "", "Lsaneness/hemolysin;", "perAdGmsgHandlers", "Ljava/util/Set;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class PerAdNativeJavscriptEngineJsContext implements gerenuk {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final gerenuk f19440attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f19441dern;
    private final Set<hemolysin> perAdGmsgHandlers;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f19442saneness;

    public PerAdNativeJavscriptEngineJsContext(gerenuk jsContext, String str) {
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        this.f19440attabal = jsContext;
        this.f19442saneness = str;
        this.f19441dern = beachfront.attabal(false);
        this.perAdGmsgHandlers = new LinkedHashSet();
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, Uri uri, dern dernVar) {
        return this.f19440attabal.a(gq0Var, uri, dernVar);
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, String str, dern dernVar) {
        return this.f19440attabal.a(gq0Var, str, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        if (r10.a(r8, r9, r0) == r1) goto L50;
     */
    @Override // saneness.gerenuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, saneness.hemolysin r9, wretchedly.dern r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext.a(java.lang.String, saneness.hemolysin, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.gerenuk
    public final Object a(String str, gintrap gintrapVar, mp0 mp0Var) {
        return this.f19440attabal.a(str, gintrapVar, mp0Var);
    }
}
