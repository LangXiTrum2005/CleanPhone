package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3147c80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4208a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        synchronized (b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j = jCurrentTimeMillis / 1000;
                Long.signum(j);
                long j2 = jCurrentTimeMillis - (j * 1000);
                long j3 = j + 2208988800L;
                bArr[40] = (byte) (j3 >> 24);
                bArr[41] = (byte) (j3 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long jD = d(24, bArr);
            long jD2 = d(32, bArr);
            long jD3 = d(40, bArr);
            b((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jD3);
            long j6 = (j5 + (((jD3 - j5) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j6;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(AbstractC3950lJ.p("SNTP: Untrusted mode: ", b3));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC3950lJ.p("SNTP: Untrusted stratum: ", i));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long d(int i, byte[] bArr) {
        long jC = c(i, bArr);
        long jC2 = c(i + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
