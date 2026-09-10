package androidx.datastore.preferences.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: ByteBufferWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<byte[]>> f9690attabal = new ThreadLocal<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long f9691dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Class<?> f9692saneness;

    static {
        Class<?> clsMarial = marial("java.io.FileOutputStream");
        f9692saneness = clsMarial;
        f9691dern = saneness(clsMarial);
    }

    public static byte[] attabal() {
        SoftReference<byte[]> softReference = f9690attabal.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static void beachfront(byte[] bArr) {
        f9690attabal.set(new SoftReference<>(bArr));
    }

    public static void competently(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!impromptu(byteBuffer, outputStream)) {
                byte[] bArrDern = dern(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrDern.length);
                    byteBuffer.get(bArrDern, 0, iMin);
                    outputStream.write(bArrDern, 0, iMin);
                }
            }
        } finally {
            preprohormone.dern(byteBuffer, iPosition);
        }
    }

    public static byte[] dern(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrAttabal = attabal();
        if (bArrAttabal != null && !wireman(iMax, bArrAttabal.length)) {
            return bArrAttabal;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            beachfront(bArr);
        }
        return bArr;
    }

    public static boolean impromptu(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f9691dern;
        if (j < 0 || !f9692saneness.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) sayid.sealless(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }

    public static Class<?> marial(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static long saneness(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (sayid.supplicat()) {
                return sayid.polder(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static boolean wireman(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }
}
