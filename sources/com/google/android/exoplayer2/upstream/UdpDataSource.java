package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class UdpDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18822e;
    public final byte[] f;
    public final DatagramPacket g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f18823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f18824i;
    public MulticastSocket j;
    public InetAddress k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18825l;
    public int m;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.f18822e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f18742a;
        this.f18823h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f18823h.getPort();
        e(dataSpec);
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.f18824i = this.j;
            } else {
                this.f18824i = new DatagramSocket(inetSocketAddress);
            }
            this.f18824i.setSoTimeout(this.f18822e);
            this.f18825l = true;
            f(dataSpec);
            return -1L;
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2, 2001);
        } catch (SecurityException e3) {
            throw new UdpDataSourceException(e3, 2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f18823h = null;
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
        DatagramSocket datagramSocket = this.f18824i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f18824i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.f18825l) {
            this.f18825l = false;
            d();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18823h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws UdpDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.m;
        DatagramPacket datagramPacket = this.g;
        if (i4 == 0) {
            try {
                DatagramSocket datagramSocket = this.f18824i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.m = length;
                c(length);
            } catch (SocketTimeoutException e2) {
                throw new UdpDataSourceException(e2, 2002);
            } catch (IOException e3) {
                throw new UdpDataSourceException(e3, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i5 = this.m;
        int iMin = Math.min(i5, i3);
        System.arraycopy(this.f, length2 - i5, bArr, i2, iMin);
        this.m -= iMin;
        return iMin;
    }
}
