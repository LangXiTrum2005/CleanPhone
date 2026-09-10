package r6;

import a7.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.k;
import e6.m;
import g6.l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.d f49437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f49438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f49439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f49440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h6.a f49441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.i f49444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f49445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f49447k;
    public Bitmap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f49448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49451p;

    public g(com.bumptech.glide.b bVar, d6.d dVar, int i10, int i11, Bitmap bitmap) {
        h6.a aVar = bVar.f10458b;
        com.bumptech.glide.e eVar = bVar.f10460d;
        k kVarC = com.bumptech.glide.b.c(eVar.getBaseContext());
        com.bumptech.glide.i iVarS = com.bumptech.glide.b.c(eVar.getBaseContext()).h().a(((w6.f) ((w6.f) ((w6.f) new w6.f().d(l.f41644b)).q()).m()).g(i10, i11));
        this.f49439c = new ArrayList();
        this.f49440d = kVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new h9.h(this, 2));
        this.f49441e = aVar;
        this.f49438b = handler;
        this.f49444h = iVarS;
        this.f49437a = dVar;
        c(m6.c.f45911b, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (!this.f49442f || this.f49443g) {
            return;
        }
        e eVar = this.f49448m;
        if (eVar != null) {
            this.f49448m = null;
            b(eVar);
            return;
        }
        this.f49443g = true;
        d6.d dVar = this.f49437a;
        d6.b bVar = dVar.l;
        int i12 = bVar.f38724c;
        if (i12 <= 0 || (i11 = dVar.f38747k) < 0) {
            i10 = 0;
        } else {
            i10 = (i11 < 0 || i11 >= i12) ? -1 : ((d6.a) bVar.f38726e.get(i11)).f38719i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i10);
        int i13 = (dVar.f38747k + 1) % dVar.l.f38724c;
        dVar.f38747k = i13;
        this.f49447k = new e(this.f49438b, i13, jUptimeMillis);
        this.f49444h.a((w6.f) new w6.f().l(new z6.d(Double.valueOf(Math.random())))).x(dVar).v(this.f49447k, null, a7.h.f3429a);
    }

    public final void b(e eVar) {
        this.f49443g = false;
        boolean z10 = this.f49446j;
        Handler handler = this.f49438b;
        if (z10) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f49442f) {
            this.f49448m = eVar;
            return;
        }
        if (eVar.f49436g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.f49441e.b(bitmap);
                this.l = null;
            }
            e eVar2 = this.f49445i;
            this.f49445i = eVar;
            ArrayList arrayList = this.f49439c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    g gVar = cVar.f49419a.f49418a;
                    e eVar3 = gVar.f49445i;
                    if ((eVar3 != null ? eVar3.f49434e : -1) == gVar.f49437a.l.f38724c - 1) {
                        cVar.f49424f++;
                    }
                    int i10 = cVar.f49425g;
                    if (i10 != -1 && cVar.f49424f >= i10) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(m mVar, Bitmap bitmap) {
        a7.h.c(mVar, "Argument must not be null");
        a7.h.c(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.f49444h = this.f49444h.a(new w6.f().o(mVar));
        this.f49449n = p.c(bitmap);
        this.f49450o = bitmap.getWidth();
        this.f49451p = bitmap.getHeight();
    }
}
