package n6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.ironsource.X3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.a f46572b;

    public c() {
        this.f46571a = 0;
        this.f46572b = new ea.a0(21);
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f46571a) {
            case 0:
                return c((ImageDecoder.Source) obj, i10, i11, iVar);
            default:
                Bitmap bitmapB = ((d6.d) obj).b();
                if (bitmapB == null) {
                    return null;
                }
                return new d(bitmapB, this.f46572b);
        }
    }

    @Override // e6.k
    public final /* bridge */ /* synthetic */ boolean b(Object obj, e6.i iVar) {
        switch (this.f46571a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    public d c(ImageDecoder.Source source, int i10, int i11, e6.i iVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new m6.b(i10, i11, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + X3.j.f27836e);
        }
        return new d(bitmapDecodeBitmap, (ea.a0) this.f46572b);
    }

    public c(h6.a aVar) {
        this.f46571a = 1;
        this.f46572b = aVar;
    }
}
