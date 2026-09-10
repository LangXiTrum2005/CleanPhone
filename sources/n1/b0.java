package n1;

import android.net.Uri;
import com.ironsource.F9;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f46341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f46342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f46343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f46344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f46345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f46346k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46347m;

    public b0(int i10) {
        super(true);
        this.f46340e = i10;
        byte[] bArr = new byte[2000];
        this.f46341f = bArr;
        this.f46342g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // n1.h
    public final long C(k kVar) {
        Uri uri = kVar.f46369a;
        this.f46343h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f46343h.getPort();
        e();
        try {
            this.f46346k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f46346k, port);
            if (this.f46346k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f46345j = multicastSocket;
                multicastSocket.joinGroup(this.f46346k);
                this.f46344i = this.f46345j;
            } else {
                this.f46344i = new DatagramSocket(inetSocketAddress);
            }
            this.f46344i.setSoTimeout(this.f46340e);
            this.l = true;
            g(kVar);
            return -1L;
        } catch (IOException e10) {
            throw new a0(2001, e10);
        } catch (SecurityException e11) {
            throw new a0(F9.a.f26070f, e11);
        }
    }

    @Override // n1.h
    public final void close() {
        this.f46343h = null;
        MulticastSocket multicastSocket = this.f46345j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f46346k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f46345j = null;
        }
        DatagramSocket datagramSocket = this.f46344i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f46344i = null;
        }
        this.f46346k = null;
        this.f46347m = 0;
        if (this.l) {
            this.l = false;
            d();
        }
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f46343h;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws a0 {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f46347m;
        DatagramPacket datagramPacket = this.f46342g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f46344i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f46347m = length;
                b(length);
            } catch (SocketTimeoutException e10) {
                throw new a0(F9.b.f26076b, e10);
            } catch (IOException e11) {
                throw new a0(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f46347m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f46341f, length2 - i13, bArr, i10, iMin);
        this.f46347m -= iMin;
        return iMin;
    }
}
