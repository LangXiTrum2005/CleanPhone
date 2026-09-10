package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628hf0 extends AbstractC3763j9 {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public C3628hf0(int i) {
        super(true);
        this.e = i;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            h();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        Uri uri = c4868vl.f5150a;
        this.h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.h.getPort();
        i();
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            j(c4868vl);
            return -1L;
        } catch (IOException e) {
            throw new C3540gf0(e, 2001);
        } catch (SecurityException e2) {
            throw new C3540gf0(e2, 2006);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws C3540gf0 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.m;
        DatagramPacket datagramPacket = this.g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.m = length;
                g(length);
            } catch (SocketTimeoutException e) {
                throw new C3540gf0(e, 2002);
            } catch (IOException e2) {
                throw new C3540gf0(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.m;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f, length2 - i4, bArr, i, iMin);
        this.m -= iMin;
        return iMin;
    }
}
