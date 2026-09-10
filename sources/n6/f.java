package n6;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f46586b;

    public f(int i10) {
        this.f46585a = i10;
        switch (i10) {
            case 1:
                this.f46586b = new c();
                break;
            default:
                this.f46586b = new c();
                break;
        }
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f46585a) {
            case 0:
                return this.f46586b.c(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, iVar);
            default:
                return this.f46586b.c(ImageDecoder.createSource(a7.c.b((InputStream) obj)), i10, i11, iVar);
        }
    }

    @Override // e6.k
    public final /* bridge */ /* synthetic */ boolean b(Object obj, e6.i iVar) {
        switch (this.f46585a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
