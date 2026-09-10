package jg;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f43840a;

    @Override // jg.b
    public final void b(vf.c cVar) {
        this.f43840a.b(cVar);
    }

    @Override // jg.b
    public final void c(vf.c cVar) {
        this.f43840a.c(cVar);
    }

    @Override // jg.b
    public final MediaFormat d(vf.c cVar) {
        return this.f43840a.d(cVar);
    }

    @Override // jg.b
    public final void e(f2.e eVar) {
        this.f43840a.e(eVar);
    }

    @Override // jg.b
    public final double[] getLocation() {
        return this.f43840a.getLocation();
    }

    @Override // jg.b
    public final int getOrientation() {
        return this.f43840a.getOrientation();
    }
}
