package pf;

import android.opengl.EGLSurface;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f48368a;

    public e(EGLSurface eGLSurface) {
        this.f48368a = eGLSurface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && n.a(this.f48368a, ((e) obj).f48368a);
    }

    public final int hashCode() {
        EGLSurface eGLSurface = this.f48368a;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    public final String toString() {
        return "EglSurface(native=" + this.f48368a + ')';
    }
}
