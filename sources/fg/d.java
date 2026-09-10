package fg;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import cg.l;
import cg.n;
import cg.p;
import m5.k;
import zf.g;
import zf.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends cg.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cg.b f40828d;

    public d() {
        super("VideoPublisher");
        this.f40828d = cg.b.f6383a;
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        boolean z10 = state instanceof l;
        h hVar = h.f54949d;
        if (z10) {
            return new l(hVar);
        }
        k kVar = ((g) e()).f54944d.f53180b;
        kotlin.jvm.internal.n.c(kVar);
        rf.a aVar = (rf.a) kVar.f45903c;
        g9.k kVar2 = aVar.f49570a;
        long jLongValue = ((Number) state.f6411a).longValue() * ((long) 1000);
        pf.e eglSurface = aVar.f49571b;
        kVar2.getClass();
        kotlin.jvm.internal.n.f(eglSurface, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(((pf.c) kVar2.f41770b).f48351a, eglSurface.f48368a, jLongValue);
        pf.e eglSurface2 = aVar.f49571b;
        kVar2.getClass();
        kotlin.jvm.internal.n.f(eglSurface2, "eglSurface");
        EGL14.eglSwapBuffers(((pf.c) kVar2.f41770b).f48351a, eglSurface2.f48368a);
        return new n(hVar);
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f40828d;
    }
}
