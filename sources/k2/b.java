package k2;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44264a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44265b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f44266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f44267d;

    public static long a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f44265b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i10], 123);
                bArr2[b10] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    bArr = bArr2;
                } else {
                    long j10 = jCurrentTimeMillis / 1000;
                    long j11 = jCurrentTimeMillis - (j10 * 1000);
                    long j12 = j10 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j12 >> 24);
                    bArr[41] = (byte) (j12 >> 16);
                    bArr[42] = (byte) (j12 >> 8);
                    bArr[43] = (byte) j12;
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j13 >> 24);
                    bArr[45] = (byte) (j13 >> 16);
                    bArr[46] = (byte) (j13 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b11 = bArr3[b10];
                    int i12 = bArr3[1] & 255;
                    long jD = d(24, bArr3);
                    long jD2 = d(32, bArr3);
                    long jD3 = d(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i12, jD3);
                    long j15 = (j14 + (((jD3 - j14) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j15;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e10;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e10);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i10++;
                    i11 = i13;
                    b10 = b10;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(d.e(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(d.e(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long d(int i10, byte[] bArr) {
        long jC = c(i10, bArr);
        long jC2 = c(i10 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
