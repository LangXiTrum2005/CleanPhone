package com.google.android.gms.internal.ads;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16296d;

    public k3(int i10, ArrayList arrayList, int i11, ub ubVar) {
        this.f16293a = i10;
        this.f16295c = arrayList;
        this.f16294b = i11;
        this.f16296d = ubVar;
    }

    public static k3 C(np0 np0Var) throws ab {
        int iK;
        int iK2;
        int i10;
        int i11;
        int i12;
        try {
            if (np0Var.b() != 0) {
                throw ab.a(null, "Unsupported VVC version");
            }
            int iK3 = np0Var.K();
            int i13 = iK3 >> 1;
            int i14 = 1;
            String str = "L";
            if ((iK3 & 1) != 0) {
                np0Var.G(1);
                int iK4 = np0Var.K() >> 4;
                iK = np0Var.K() >> 5;
                int iK5 = np0Var.K() & 63;
                int iK6 = np0Var.K();
                i10 = iK6 >> 1;
                str = (iK6 & 1) != 0 ? "H" : "L";
                iK2 = np0Var.K();
                np0Var.G(iK5);
                int i15 = iK4 & 7;
                if (i15 > 1) {
                    int iK7 = np0Var.K();
                    for (int i16 = 0; i16 < i15 - 1; i16++) {
                        if (((iK7 >> (7 - i16)) & 1) != 0) {
                            np0Var.G(1);
                        }
                    }
                }
                np0Var.G(np0Var.K() * 4);
                np0Var.G(6);
            } else {
                iK = 0;
                iK2 = 0;
                i10 = 0;
            }
            int iK8 = np0Var.K();
            int i17 = np0Var.f17881b;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                i11 = 12;
                i12 = 13;
                if (i18 >= iK8) {
                    break;
                }
                int iK9 = np0Var.K() & 31;
                int iL = (iK9 == 13 || iK9 == 12) ? 1 : np0Var.L();
                for (int i20 = 0; i20 < iL; i20++) {
                    int iL2 = np0Var.L();
                    i19 = iL2 + 4 + i19;
                    np0Var.G(iL2);
                }
                i18++;
            }
            np0Var.E(i17);
            byte[] bArr = new byte[i19];
            int i21 = 0;
            int i22 = 0;
            while (i21 < iK8) {
                int iK10 = np0Var.K() & 31;
                int iL3 = (iK10 == i12 || iK10 == i11) ? i14 : np0Var.L();
                int i23 = i14;
                for (int i24 = 0; i24 < iL3; i24++) {
                    int iL4 = np0Var.L();
                    System.arraycopy(dv.f13741n, 0, bArr, i22, 4);
                    int i25 = i22 + 4;
                    np0Var.H(bArr, i25, iL4);
                    i22 = i25 + iL4;
                }
                i21++;
                i14 = i23;
                i11 = 12;
                i12 = 13;
            }
            Locale locale = Locale.US;
            return new k3(ca1.u(bArr), (i13 & 3) + 1, "vvc1." + i10 + "." + str + iK2, iK + 8);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ab.a(e10, "Error parsing VVC configuration");
        }
    }

    public static int b(int i10, int i11) {
        return d(i11) + i(i10);
    }

    public static int c(int i10, int i11) {
        return d(i11) + i(i10);
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            return g(i10);
        }
        return 10;
    }

    public static int e(int i10, zl.a aVar) {
        return f(aVar) + i(i10);
    }

    public static int f(zl.a aVar) {
        int iD = aVar.d();
        return g(iD) + iD;
    }

    public static int g(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int h(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int i(int i10) {
        return g(i10 << 3);
    }

    public static k3 l(OutputStream outputStream, int i10) {
        return new k3(outputStream, new byte[i10]);
    }

    public void A(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            u((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        u((int) j10);
    }

    public void B(int i10, int i11) throws IOException {
        z((i10 << 3) | i11);
    }

    public synchronized void D() {
        try {
            q01 q01Var = (q01) this.f16296d;
            if (q01Var.f18850b) {
                s01 s01Var = q01Var.f18849a;
                s01Var.R((byte[]) this.f16295c);
                s01Var.e(this.f16293a);
                s01Var.j(this.f16294b);
                s01Var.h0();
                s01Var.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 12));
    }

    public void j() throws IOException {
        if (((OutputStream) this.f16296d) != null) {
            n();
        }
    }

    public void k(int i10, int i11, int i12, int i13) {
        int i14 = this.f16294b;
        if (i10 < 0) {
            int i15 = this.f16293a;
            i10 += i15;
            i11 += 4 - ((i15 + 4) % 8);
        }
        if (i11 < 0) {
            i11 += i14;
            i10 += 4 - ((i14 + 4) % 8);
        }
        ((byte[]) this.f16296d)[(i10 * i14) + i11] = (byte) ((((CharSequence) this.f16295c).charAt(i12) & (1 << (8 - i13))) == 0 ? 0 : 1);
    }

    public void m(Typeface typeface) {
        int i10 = this.f16293a;
        if (i10 != -1) {
            typeface = p.t0.a(typeface, i10, (this.f16294b & 2) != 0);
        }
        p.u0 u0Var = (p.u0) this.f16296d;
        WeakReference weakReference = (WeakReference) this.f16295c;
        if (u0Var.f47819b) {
            u0Var.f47829m = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new g5.g(u0Var.f47818a, 2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, u0Var.f47818a);
                }
            }
        }
    }

    public void n() throws IOException {
        OutputStream outputStream = (OutputStream) this.f16296d;
        if (outputStream == null) {
            throw new b2.z("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f16295c, 0, this.f16294b);
        this.f16294b = 0;
    }

    public void o(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        k(i13, i14, i12, 1);
        int i15 = i11 - 1;
        k(i13, i15, i12, 2);
        int i16 = i10 - 1;
        k(i16, i14, i12, 3);
        k(i16, i15, i12, 4);
        k(i16, i11, i12, 5);
        k(i10, i14, i12, 6);
        k(i10, i15, i12, 7);
        k(i10, i11, i12, 8);
    }

    public void p(int i10, int i11) throws IOException {
        B(i10, 0);
        r(i11);
    }

    public void q(int i10, int i11) throws IOException {
        B(i10, 0);
        r(i11);
    }

    public void r(int i10) throws IOException {
        if (i10 >= 0) {
            z(i10);
        } else {
            A(i10);
        }
    }

    public void s(int i10, zl.a aVar) throws IOException {
        B(i10, 2);
        t(aVar);
    }

    public void t(zl.a aVar) throws IOException {
        z(aVar.d());
        aVar.i(this);
    }

    public void u(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (this.f16294b == this.f16293a) {
            n();
        }
        byte[] bArr = (byte[]) this.f16295c;
        int i11 = this.f16294b;
        this.f16294b = i11 + 1;
        bArr[i11] = b10;
    }

    public void v(zl.d dVar) throws IOException {
        int size = dVar.size();
        byte[] bArr = (byte[]) this.f16295c;
        int i10 = this.f16293a;
        int i11 = this.f16294b;
        int i12 = i10 - i11;
        if (i12 >= size) {
            dVar.m(bArr, 0, i11, size);
            this.f16294b += size;
            return;
        }
        dVar.m(bArr, 0, i11, i12);
        int i13 = size - i12;
        this.f16294b = i10;
        n();
        if (i13 <= i10) {
            dVar.m(bArr, i12, 0, i13);
            this.f16294b = i13;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f16296d;
        if (i12 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i12);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i14 = i12 + i13;
        if (i14 <= dVar.size()) {
            if (i13 > 0) {
                dVar.y(outputStream, i12, i13);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public void w(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f16295c;
        int i10 = this.f16293a;
        int i11 = this.f16294b;
        int i12 = i10 - i11;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i11, length);
            this.f16294b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i11, i12);
        int i13 = length - i12;
        this.f16294b = i10;
        n();
        if (i13 > i10) {
            ((OutputStream) this.f16296d).write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f16294b = i13;
        }
    }

    public void x(int i10) throws IOException {
        u(i10 & 255);
        u((i10 >> 8) & 255);
        u((i10 >> 16) & 255);
        u((i10 >> 24) & 255);
    }

    public void y(long j10) throws IOException {
        u(((int) j10) & 255);
        u(((int) (j10 >> 8)) & 255);
        u(((int) (j10 >> 16)) & 255);
        u(((int) (j10 >> 24)) & 255);
        u(((int) (j10 >> 32)) & 255);
        u(((int) (j10 >> 40)) & 255);
        u(((int) (j10 >> 48)) & 255);
        u(((int) (j10 >> 56)) & 255);
    }

    public void z(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    public k3(ya1 ya1Var, int i10, String str, int i11) {
        this.f16295c = ya1Var;
        this.f16293a = i10;
        this.f16296d = str;
        this.f16294b = i11;
    }

    public k3(int i10, int i11) {
        switch (i11) {
            case 4:
                this.f16295c = new h3.q[i10];
                this.f16294b = 0;
                break;
            default:
                this.f16295c = new x6[i10];
                this.f16294b = 0;
                break;
        }
    }

    public /* synthetic */ k3(q01 q01Var, byte[] bArr) {
        this.f16296d = q01Var;
        this.f16295c = bArr;
    }

    public k3(String str, int i10, int i11) {
        this.f16295c = str;
        this.f16294b = i10;
        this.f16293a = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f16296d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public k3(OutputStream outputStream, byte[] bArr) {
        this.f16296d = outputStream;
        this.f16295c = bArr;
        this.f16294b = 0;
        this.f16293a = bArr.length;
    }

    public k3(p.u0 u0Var, int i10, int i11, WeakReference weakReference) {
        this.f16296d = u0Var;
        this.f16293a = i10;
        this.f16294b = i11;
        this.f16295c = weakReference;
    }
}
