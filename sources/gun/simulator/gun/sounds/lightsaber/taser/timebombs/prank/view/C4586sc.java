package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4586sc {
    public static final String k;
    public static final String l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZA f4986a;
    public final C4447qz b;
    public final String c;
    public final EnumC5106yW d;
    public final int e;
    public final String f;
    public final C4447qz g;
    public final C3657hz h;
    public final long i;
    public final long j;

    static {
        C5104yU c5104yU = C5104yU.f5278a;
        C5104yU.f5278a.getClass();
        k = AbstractC2995aW.v0("-Sent-Millis", "OkHttp");
        C5104yU.f5278a.getClass();
        l = AbstractC2995aW.v0("-Received-Millis", "OkHttp");
    }

    public C4586sc(InterfaceC3588h80 interfaceC3588h80) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC2995aW.q(interfaceC3588h80, "rawSource");
        try {
            EX exF = AbstractC4496rb.f(interfaceC3588h80);
            String strJ = exF.j(Long.MAX_VALUE);
            char[] cArr = ZA.k;
            ZA zaR = C3336eJ.r(strJ);
            if (zaR == null) {
                IOException iOException = new IOException(AbstractC2995aW.v0(strJ, "Cache corruption for "));
                C5104yU c5104yU = C5104yU.f5278a;
                C5104yU.f5278a.getClass();
                C5104yU.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f4986a = zaR;
            this.c = exF.j(Long.MAX_VALUE);
            C5036xh c5036xh = new C5036xh();
            int iU = C3336eJ.u(exF);
            int i = 0;
            while (i < iU) {
                i++;
                c5036xh.b(exF.j(Long.MAX_VALUE));
            }
            this.b = c5036xh.e();
            C90 c90V = C3887ke.v(exF.j(Long.MAX_VALUE));
            this.d = c90V.f2913a;
            this.e = c90V.b;
            this.f = c90V.c;
            C5036xh c5036xh2 = new C5036xh();
            int iU2 = C3336eJ.u(exF);
            int i2 = 0;
            while (i2 < iU2) {
                i2++;
                c5036xh2.b(exF.j(Long.MAX_VALUE));
            }
            String str = k;
            String strH = c5036xh2.h(str);
            String str2 = l;
            String strH2 = c5036xh2.h(str2);
            c5036xh2.j(str);
            c5036xh2.j(str2);
            long j = 0;
            this.i = strH == null ? 0L : Long.parseLong(strH);
            if (strH2 != null) {
                j = Long.parseLong(strH2);
            }
            this.j = j;
            this.g = c5036xh2.e();
            if (AbstractC2995aW.i(this.f4986a.f4058a, "https")) {
                String strJ2 = exF.j(Long.MAX_VALUE);
                if (strJ2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strJ2 + '\"');
                }
                C2800Ue c2800UeI = C2800Ue.b.i(exF.j(Long.MAX_VALUE));
                List listA = a(exF);
                this.h = new C3657hz(!exF.K() ? C3336eJ.j(exF.j(Long.MAX_VALUE)) : Oc0.SSL_3_0, c2800UeI, Vg0.w(a(exF)), new C3569gz(Vg0.w(listA), 0));
            } else {
                this.h = null;
            }
            AbstractC3375el.n(interfaceC3588h80, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(interfaceC3588h80, th);
                throw th2;
            }
        }
    }

    public static List a(EX ex) throws IOException {
        int iU = C3336eJ.u(ex);
        if (iU == -1) {
            return C2812Uq.f3846a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            ArrayList arrayList = new ArrayList(iU);
            int i = 0;
            while (i < iU) {
                i++;
                String strJ = ex.j(Long.MAX_VALUE);
                C4848vb c4848vb = new C4848vb();
                C3971lc c3971lc = C3971lc.d;
                C3971lc c3971lcT = G7.t(strJ);
                AbstractC2995aW.n(c3971lcT);
                c4848vb.x(c3971lcT);
                arrayList.add(certificateFactory.generateCertificate(c4848vb.Q()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void b(DX dx, List list) throws IOException {
        try {
            dx.E(list.size());
            dx.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C3971lc c3971lc = C3971lc.d;
                AbstractC2995aW.p(encoded, "bytes");
                dx.A(G7.D(encoded).a());
                dx.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void c(C3877kY c3877kY) {
        ZA za = this.f4986a;
        C3657hz c3657hz = this.h;
        C4447qz c4447qz = this.g;
        C4447qz c4447qz2 = this.b;
        DX dxE = AbstractC4496rb.e(c3877kY.m(0));
        try {
            dxE.A(za.i);
            dxE.writeByte(10);
            dxE.A(this.c);
            dxE.writeByte(10);
            dxE.E(c4447qz2.size());
            dxE.writeByte(10);
            int size = c4447qz2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                dxE.A(c4447qz2.b(i));
                dxE.A(": ");
                dxE.A(c4447qz2.e(i));
                dxE.writeByte(10);
                i = i2;
            }
            EnumC5106yW enumC5106yW = this.d;
            int i3 = this.e;
            String str = this.f;
            AbstractC2995aW.q(enumC5106yW, "protocol");
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            StringBuilder sb = new StringBuilder();
            if (enumC5106yW == EnumC5106yW.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i3);
            sb.append(' ');
            sb.append(str);
            String string = sb.toString();
            AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
            dxE.A(string);
            dxE.writeByte(10);
            dxE.E(c4447qz.size() + 2);
            dxE.writeByte(10);
            int size2 = c4447qz.size();
            for (int i4 = 0; i4 < size2; i4++) {
                dxE.A(c4447qz.b(i4));
                dxE.A(": ");
                dxE.A(c4447qz.e(i4));
                dxE.writeByte(10);
            }
            dxE.A(k);
            dxE.A(": ");
            dxE.E(this.i);
            dxE.writeByte(10);
            dxE.A(l);
            dxE.A(": ");
            dxE.E(this.j);
            dxE.writeByte(10);
            if (AbstractC2995aW.i(za.f4058a, "https")) {
                dxE.writeByte(10);
                AbstractC2995aW.n(c3657hz);
                dxE.A(c3657hz.b.f3830a);
                dxE.writeByte(10);
                b(dxE, c3657hz.a());
                b(dxE, c3657hz.c);
                dxE.A(c3657hz.f4481a.f3509a);
                dxE.writeByte(10);
            }
            AbstractC3375el.n(dxE, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(dxE, th);
                throw th2;
            }
        }
    }

    public C4586sc(C5021xZ c5021xZ) {
        C4447qz c4447qzE;
        HY hy = c5021xZ.f5227a;
        this.f4986a = hy.f3175a;
        C5021xZ c5021xZ2 = c5021xZ.h;
        AbstractC2995aW.n(c5021xZ2);
        C4447qz c4447qz = c5021xZ2.f5227a.c;
        C4447qz c4447qz2 = c5021xZ.f;
        Set setX = C3336eJ.x(c4447qz2);
        if (setX.isEmpty()) {
            c4447qzE = Vg0.b;
        } else {
            C5036xh c5036xh = new C5036xh();
            int size = c4447qz.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String strB = c4447qz.b(i);
                if (setX.contains(strB)) {
                    c5036xh.a(strB, c4447qz.e(i));
                }
                i = i2;
            }
            c4447qzE = c5036xh.e();
        }
        this.b = c4447qzE;
        this.c = hy.b;
        this.d = c5021xZ.b;
        this.e = c5021xZ.d;
        this.f = c5021xZ.c;
        this.g = c4447qz2;
        this.h = c5021xZ.e;
        this.i = c5021xZ.k;
        this.j = c5021xZ.l;
    }
}
