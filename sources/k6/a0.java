package k6;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements s, e6.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f44329b = new a0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44330a;

    public /* synthetic */ a0(int i10) {
        this.f44330a = i10;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // k6.s
    public r M(x xVar) {
        switch (this.f44330a) {
            case 0:
                return b0.f44334b;
            case 2:
                return new c(new a0(1), 0);
            case 4:
                return new c(new a0(3), 0);
            case 6:
                return new b0(1);
            case 11:
                return new z(xVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new z(xVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new z(xVar.b(Uri.class, InputStream.class), 0);
            default:
                return new e0(xVar.b(h.class, InputStream.class));
        }
    }

    public Class b() {
        switch (this.f44330a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // e6.b
    public boolean d(Object obj, File file, e6.i iVar) throws Throwable {
        try {
            a7.c.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e10);
            return false;
        }
    }
}
