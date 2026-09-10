package p1;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements l2.p, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l2.p f48176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f48177b;

    @Override // l2.p
    public final void a(long j10, long j11, i1.p pVar, MediaFormat mediaFormat) {
        l2.p pVar2 = this.f48176a;
        if (pVar2 != null) {
            pVar2.a(j10, j11, pVar, mediaFormat);
        }
    }

    public final void b() {
        w wVar = this.f48177b;
        if (wVar != null) {
            wVar.b();
        }
    }

    public final void c() {
        w wVar = this.f48177b;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // p1.y0
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f48176a = (l2.p) obj;
        } else if (i10 == 8) {
            this.f48177b = (w) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
