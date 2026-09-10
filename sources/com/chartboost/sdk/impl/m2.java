package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 extends i3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    public static final boolean a(zf zfVar, View view, MotionEvent motionEvent) {
        if (zfVar != null) {
            Intrinsics.c(motionEvent);
            zfVar.a(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        Intrinsics.f(client, "client");
        super.setWebViewClient(client);
        setOnTouchListener(new com.unity3d.ads.adplayer.a(client instanceof n2 ? ((n2) client).a() : null, 1));
    }
}
