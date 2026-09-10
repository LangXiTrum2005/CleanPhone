package p6;

import a7.h;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.k;
import com.google.android.gms.internal.ads.dm0;
import d6.d;
import g6.a0;
import g6.x;
import r6.e;
import r6.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f48257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48258b;

    public b(Drawable drawable, int i10) {
        this.f48258b = i10;
        h.c(drawable, "Argument must not be null");
        this.f48257a = drawable;
    }

    @Override // g6.a0
    public final void b() {
        dm0 dm0Var;
        dm0 dm0Var2;
        dm0 dm0Var3;
        switch (this.f48258b) {
            case 0:
                break;
            default:
                r6.c cVar = (r6.c) this.f48257a;
                cVar.stop();
                cVar.f49422d = true;
                g gVar = cVar.f49419a.f49418a;
                k kVar = gVar.f49440d;
                gVar.f49439c.clear();
                Bitmap bitmap = gVar.l;
                if (bitmap != null) {
                    gVar.f49441e.b(bitmap);
                    gVar.l = null;
                }
                gVar.f49442f = false;
                e eVar = gVar.f49445i;
                if (eVar != null) {
                    kVar.i(eVar);
                    gVar.f49445i = null;
                }
                e eVar2 = gVar.f49447k;
                if (eVar2 != null) {
                    kVar.i(eVar2);
                    gVar.f49447k = null;
                }
                e eVar3 = gVar.f49448m;
                if (eVar3 != null) {
                    kVar.i(eVar3);
                    gVar.f49448m = null;
                }
                d dVar = gVar.f49437a;
                m5.k kVar2 = dVar.f38739c;
                dVar.l = null;
                byte[] bArr = dVar.f38745i;
                if (bArr != null && (dm0Var3 = (dm0) kVar2.f45903c) != null) {
                    dm0Var3.h(bArr);
                }
                int[] iArr = dVar.f38746j;
                if (iArr != null && (dm0Var2 = (dm0) kVar2.f45903c) != null) {
                    dm0Var2.h(iArr);
                }
                Bitmap bitmap2 = dVar.f38748m;
                if (bitmap2 != null) {
                    ((h6.a) kVar2.f45902b).b(bitmap2);
                }
                dVar.f38748m = null;
                dVar.f38740d = null;
                dVar.f38754s = null;
                byte[] bArr2 = dVar.f38741e;
                if (bArr2 != null && (dm0Var = (dm0) kVar2.f45903c) != null) {
                    dm0Var.h(bArr2);
                }
                gVar.f49446j = true;
                break;
        }
    }

    @Override // g6.a0
    public final Class c() {
        switch (this.f48258b) {
            case 0:
                return this.f48257a.getClass();
            default:
                return r6.c.class;
        }
    }

    @Override // g6.a0
    public final Object get() {
        Drawable drawable = this.f48257a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // g6.a0
    public final int getSize() {
        switch (this.f48258b) {
            case 0:
                Drawable drawable = this.f48257a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                g gVar = ((r6.c) this.f48257a).f49419a.f49418a;
                d dVar = gVar.f49437a;
                return (dVar.f38746j.length * 4) + dVar.f38740d.limit() + dVar.f38745i.length + gVar.f49449n;
        }
    }

    @Override // g6.x
    public void initialize() {
        switch (this.f48258b) {
            case 1:
                ((r6.c) this.f48257a).f49419a.f49418a.l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f48257a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof r6.c) {
                    ((r6.c) drawable).f49419a.f49418a.l.prepareToDraw();
                }
                break;
        }
    }

    private final void a() {
    }
}
