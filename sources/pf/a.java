package pf;

import android.opengl.EGLConfig;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLConfig f48349a;

    public a(EGLConfig eGLConfig) {
        this.f48349a = eGLConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && n.a(this.f48349a, ((a) obj).f48349a);
    }

    public final int hashCode() {
        return this.f48349a.hashCode();
    }

    public final String toString() {
        return "EglConfig(native=" + this.f48349a + ')';
    }
}
