package p6;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.auth.o;
import e6.i;
import e6.k;
import g6.a0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.k f48256b;

    public /* synthetic */ a(m5.k kVar, int i10) {
        this.f48255a = i10;
        this.f48256b = kVar;
    }

    @Override // e6.k
    public final a0 a(Object obj, int i10, int i11, i iVar) {
        switch (this.f48255a) {
            case 0:
                return m5.k.n(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, iVar);
            default:
                return m5.k.n(ImageDecoder.createSource(a7.c.b((InputStream) obj)), i10, i11, iVar);
        }
    }

    @Override // e6.k
    public final boolean b(Object obj, i iVar) throws IOException {
        switch (this.f48255a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeP = o.p((ArrayList) this.f48256b.f45902b, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeP == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeP == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                m5.k kVar = this.f48256b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeO = o.o((ArrayList) kVar.f45902b, (InputStream) obj, (dm0) kVar.f45903c);
                return imageHeaderParser$ImageTypeO == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeO == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }
}
