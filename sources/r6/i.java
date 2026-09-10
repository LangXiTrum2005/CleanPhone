package r6;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.auth.o;
import e6.k;
import g6.a0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f49455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm0 f49456c;

    public i(ArrayList arrayList, a aVar, dm0 dm0Var) {
        this.f49454a = arrayList;
        this.f49455b = aVar;
        this.f49456c = dm0Var;
    }

    @Override // e6.k
    public final a0 a(Object obj, int i10, int i11, e6.i iVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f49455b.a(ByteBuffer.wrap(byteArray), i10, i11, iVar);
    }

    @Override // e6.k
    public final boolean b(Object obj, e6.i iVar) {
        return !((Boolean) iVar.c(h.f49453b)).booleanValue() && o.o(this.f49454a, (InputStream) obj, this.f49456c) == ImageHeaderParser$ImageType.GIF;
    }
}
