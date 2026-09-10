package b2;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.b0 f5395a = new n1.b0(com.bumptech.glide.c.c(8000));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0 f5396b;

    @Override // n1.h
    public final long C(n1.k kVar) {
        this.f5395a.C(kVar);
        return -1L;
    }

    @Override // b2.e
    public final String a() {
        int iF = f();
        go.k.t(iF != -1);
        String str = l1.y.f44830a;
        Locale locale = Locale.US;
        return defpackage.e.g(iF, iF + 1, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // n1.h
    public final void c(n1.z zVar) {
        this.f5395a.c(zVar);
    }

    @Override // n1.h
    public final void close() {
        this.f5395a.close();
        s0 s0Var = this.f5396b;
        if (s0Var != null) {
            s0Var.close();
        }
    }

    @Override // b2.e
    public final int f() {
        DatagramSocket datagramSocket = this.f5395a.f46344i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f5395a.f46343h;
    }

    @Override // b2.e
    public final boolean r() {
        return true;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws n1.a0 {
        try {
            return this.f5395a.read(bArr, i10, i11);
        } catch (n1.a0 e10) {
            if (e10.f46362a == 2002) {
                return -1;
            }
            throw e10;
        }
    }

    @Override // b2.e
    public final q0 s() {
        return null;
    }
}
