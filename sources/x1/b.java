package x1;

import android.content.Context;
import android.graphics.Point;
import com.google.android.gms.internal.ads.rx1;
import go.k;
import i1.e0;
import i1.p;
import java.io.IOException;
import java.nio.ByteBuffer;
import l1.y;
import o1.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f53555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f53556o;

    public b(Context context) {
        super(new o1.d[1], new a[1]);
        this.f53555n = context;
        this.f53556o = -1;
    }

    @Override // o1.g
    public final o1.d c() {
        return new o1.d(1);
    }

    @Override // o1.g
    public final o1.e d() {
        return new a(this);
    }

    @Override // o1.g
    public final rx1 e(Throwable th2) {
        return new c("Unexpected decode error", th2);
    }

    @Override // o1.g
    public final rx1 f(o1.d dVar, o1.e eVar, boolean z10) {
        a aVar = (a) eVar;
        ByteBuffer byteBuffer = dVar.f47035e;
        byteBuffer.getClass();
        k.t(byteBuffer.hasArray());
        k.i(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f53556o;
            if (iMax == -1) {
                Context context = this.f53555n;
                if (context != null) {
                    Point pointX = y.x(context);
                    int i10 = pointX.x;
                    int i11 = pointX.y;
                    p pVar = dVar.f47033c;
                    if (pVar != null) {
                        int i12 = pVar.M;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = pVar.N;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    iMax = (Math.max(i10, i11) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            aVar.f53553e = com.bumptech.glide.d.s(byteBuffer.array(), byteBuffer.remaining(), iMax);
            aVar.f47040c = dVar.f47037g;
            return null;
        } catch (e0 e10) {
            return new c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new c(e11);
        }
    }
}
