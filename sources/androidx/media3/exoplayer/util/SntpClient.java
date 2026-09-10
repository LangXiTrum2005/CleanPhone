package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import android.support.v4.media.a;
import androidx.media3.exoplayer.upstream.Loader;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SntpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6595a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6596b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6597c;

    public interface InitializationCallback {
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final Loader.LoadErrorAction b(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
            return Loader.d;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final void g(Loader.Loadable loadable, long j, long j2) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final void h(Loader.Loadable loadable, long j, long j2, boolean z2) {
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void load() {
            synchronized (SntpClient.f6595a) {
                Object obj = SntpClient.f6596b;
                synchronized (obj) {
                    if (SntpClient.f6597c) {
                        return;
                    }
                    SntpClient.a();
                    synchronized (obj) {
                        SntpClient.f6597c = true;
                    }
                }
            }
        }
    }

    public static void a() throws UnknownHostException {
        synchronized (f6596b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j = jCurrentTimeMillis / 1000;
                long j2 = jCurrentTimeMillis - (j * 1000);
                long j3 = j + 2208988800L;
                bArr[40] = (byte) (j3 >> 24);
                bArr[41] = (byte) (j3 >> 16);
                bArr[42] = (byte) (j3 >> 8);
                bArr[43] = (byte) j3;
                long j4 = (j2 * 4294967296L) / 1000;
                bArr[44] = (byte) (j4 >> 24);
                bArr[45] = (byte) (j4 >> 16);
                bArr[46] = (byte) (j4 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            SystemClock.elapsedRealtime();
            byte b2 = bArr[0];
            int i2 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            d(24, bArr);
            d(32, bArr);
            b((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i2, d(40, bArr));
            datagramSocket.close();
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void b(byte b2, byte b3, int i2, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(a.h(b3, "SNTP: Untrusted mode: "));
        }
        if (i2 == 0 || i2 > 15) {
            throw new IOException(a.h(i2, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (((long) i3) << 24) + (((long) i4) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    public static long d(int i2, byte[] bArr) {
        long jC = c(i2, bArr);
        long jC2 = c(i2 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
