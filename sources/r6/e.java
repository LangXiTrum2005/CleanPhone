package r6;

import a7.p;
import android.graphics.Bitmap;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w6.c f49432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f49433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f49436g;

    public e(Handler handler, int i10, long j10) {
        if (!p.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f49430a = Integer.MIN_VALUE;
        this.f49431b = Integer.MIN_VALUE;
        this.f49433d = handler;
        this.f49434e = i10;
        this.f49435f = j10;
    }

    @Override // x6.a
    public final void a(Object obj) {
        this.f49436g = (Bitmap) obj;
        Handler handler = this.f49433d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f49435f);
    }

    @Override // x6.a
    public final void b(w6.c cVar) {
        this.f49432c = cVar;
    }

    @Override // x6.a
    public final w6.c d() {
        return this.f49432c;
    }

    @Override // x6.a
    public final void e(w6.g gVar) throws Throwable {
        gVar.l(this.f49430a, this.f49431b);
    }

    @Override // x6.a
    public final void g() {
        this.f49436g = null;
    }

    @Override // x6.a
    public final void c() {
    }

    @Override // t6.f
    public final void f() {
    }

    @Override // t6.f
    public final void onDestroy() {
    }

    @Override // t6.f
    public final void onStart() {
    }
}
