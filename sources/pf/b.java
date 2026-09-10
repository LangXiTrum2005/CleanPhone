package pf;

import android.opengl.EGLContext;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLContext f48350a;

    public b(EGLContext eGLContext) {
        this.f48350a = eGLContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && n.a(this.f48350a, ((b) obj).f48350a);
    }

    public final int hashCode() {
        EGLContext eGLContext = this.f48350a;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    public final String toString() {
        return "EglContext(native=" + this.f48350a + ')';
    }
}
