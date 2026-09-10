package androidx.core.net;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public final class TrafficStatsCompat {

    public static class Api24Impl {
        public static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        public static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }
}
