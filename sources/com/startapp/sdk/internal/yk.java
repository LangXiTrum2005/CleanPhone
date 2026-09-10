package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class yk implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41725a;

    public yk(Context context) {
        Intrinsics.f(context, "context");
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f41725a = context;
        } else {
            this.f41725a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.startapp.sdk.internal.tk
    public final String a() {
        String property;
        try {
            property = WebSettings.getDefaultUserAgent(this.f41725a);
        } catch (Throwable th) {
            g9.a(th);
            property = null;
        }
        if (property == null) {
            try {
                property = System.getProperty("http.agent");
                if (property != null || StringsKt.w(property)) {
                }
            } catch (Throwable th2) {
                g9.a(th2);
                return null;
            }
        } else {
            if (StringsKt.w(property)) {
                property = null;
            }
            if (property == null) {
                property = System.getProperty("http.agent");
                return property != null ? null : null;
            }
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        return new WebView(this.f41725a);
    }
}
