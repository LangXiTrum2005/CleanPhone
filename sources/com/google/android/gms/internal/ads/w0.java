package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f21332e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f21334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21335c;

    public /* synthetic */ w0(v0 v0Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f21334b = v0Var;
        this.f21333a = z10;
    }

    public static synchronized boolean a() {
        int i10;
        try {
            if (!f21332e) {
                try {
                    if (x10.C("EGL_EXT_protected_content")) {
                        i10 = x10.C("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i10 = 0;
                    }
                } catch (ih0 e10) {
                    v71.F("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
                }
                f21331d = i10;
                f21332e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f21331d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        v0 v0Var = this.f21334b;
        synchronized (v0Var) {
            try {
                if (!this.f21335c) {
                    Handler handler = v0Var.f20979b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f21335c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
