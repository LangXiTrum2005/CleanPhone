package n6;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements e6.e {
    @Override // e6.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // e6.e
    public final int b(InputStream inputStream, dm0 dm0Var) {
        int iD = new a1.h(inputStream).d(1, "Orientation");
        if (iD == 0) {
            return -1;
        }
        return iD;
    }

    @Override // e6.e
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // e6.e
    public final int d(ByteBuffer byteBuffer, dm0 dm0Var) {
        AtomicReference atomicReference = a7.c.f3418a;
        return b(new a7.a(byteBuffer), dm0Var);
    }
}
