package pf;

import android.opengl.EGLDisplay;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLDisplay f48351a;

    public c(EGLDisplay eGLDisplay) {
        this.f48351a = eGLDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && n.a(this.f48351a, ((c) obj).f48351a);
    }

    public final int hashCode() {
        EGLDisplay eGLDisplay = this.f48351a;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    public final String toString() {
        return "EglDisplay(native=" + this.f48351a + ')';
    }
}
