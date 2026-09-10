package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.gms.internal.ads.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f44891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f44892e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f44894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44895c;

    public i(v0 v0Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f44894b = v0Var;
        this.f44893a = z10;
    }

    public static synchronized boolean a() {
        int i10;
        try {
            if (!f44892e) {
                try {
                    if (l1.a.l("EGL_EXT_protected_content")) {
                        i10 = l1.a.l("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i10 = 0;
                    }
                } catch (l1.i e10) {
                    l1.a.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
                }
                f44891d = i10;
                f44892e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44891d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f44894b) {
            try {
                if (!this.f44895c) {
                    v0 v0Var = this.f44894b;
                    v0Var.f20979b.getClass();
                    v0Var.f20979b.sendEmptyMessage(2);
                    this.f44895c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
