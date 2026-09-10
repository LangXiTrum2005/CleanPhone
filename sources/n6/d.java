package n6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g6.a0, g6.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46573a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46575c;

    public d(Bitmap bitmap, h6.a aVar) {
        a7.h.c(bitmap, "Bitmap must not be null");
        this.f46574b = bitmap;
        a7.h.c(aVar, "BitmapPool must not be null");
        this.f46575c = aVar;
    }

    @Override // g6.a0
    public final void b() {
        switch (this.f46573a) {
            case 0:
                ((h6.a) this.f46575c).b((Bitmap) this.f46574b);
                break;
            default:
                ((g6.a0) this.f46575c).b();
                break;
        }
    }

    @Override // g6.a0
    public final Class c() {
        switch (this.f46573a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // g6.a0
    public final Object get() {
        switch (this.f46573a) {
            case 0:
                return (Bitmap) this.f46574b;
            default:
                return new BitmapDrawable((Resources) this.f46574b, (Bitmap) ((g6.a0) this.f46575c).get());
        }
    }

    @Override // g6.a0
    public final int getSize() {
        switch (this.f46573a) {
            case 0:
                return a7.p.c((Bitmap) this.f46574b);
            default:
                return ((g6.a0) this.f46575c).getSize();
        }
    }

    @Override // g6.x
    public final void initialize() {
        switch (this.f46573a) {
            case 0:
                ((Bitmap) this.f46574b).prepareToDraw();
                break;
            default:
                g6.a0 a0Var = (g6.a0) this.f46575c;
                if (a0Var instanceof g6.x) {
                    ((g6.x) a0Var).initialize();
                }
                break;
        }
    }

    public d(Resources resources, g6.a0 a0Var) {
        a7.h.c(resources, "Argument must not be null");
        this.f46574b = resources;
        a7.h.c(a0Var, "Argument must not be null");
        this.f46575c = a0Var;
    }
}
