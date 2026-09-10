package n6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements e6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46622a;

    public /* synthetic */ z(int i10) {
        this.f46622a = i10;
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f46622a) {
            case 0:
                return new y((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new p6.b(drawable, 0);
                }
                return null;
            default:
                return new y((File) obj);
        }
    }

    @Override // e6.k
    public final /* bridge */ /* synthetic */ boolean b(Object obj, e6.i iVar) {
        switch (this.f46622a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
