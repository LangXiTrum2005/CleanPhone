package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3887ke implements GB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4606a;

    public /* synthetic */ C3887ke(int i) {
        this.f4606a = i;
    }

    public static final String h(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = Vg0.f3884a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = Vg0.f3884a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    z2 = true;
                    i11 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC2995aW.p(charset, "UTF_8");
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static final C5021xZ i(C5021xZ c5021xZ) {
        int i = C5202zc.b;
        if ((c5021xZ == null ? null : c5021xZ.g) == null) {
            return c5021xZ;
        }
        C4845vZ c4845vZM = c5021xZ.m();
        c4845vZM.g = null;
        return c4845vZM.a();
    }

    public static ArrayList j(List list) {
        AbstractC2995aW.q(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC5106yW) obj) != EnumC5106yW.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC5106yW) it.next()).f5279a);
        }
        return arrayList2;
    }

    public static byte[] k(List list) {
        AbstractC2995aW.q(list, "protocols");
        C4848vb c4848vb = new C4848vb();
        for (String str : j(list)) {
            c4848vb.R(str.length());
            c4848vb.Y(str);
        }
        return c4848vb.q(c4848vb.b);
    }

    public static C3657hz l(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = C2812Uq.f3846a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        if (AbstractC2995aW.i(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || AbstractC2995aW.i(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(AbstractC2995aW.v0(cipherSuite, "cipherSuite == "));
        }
        C2800Ue c2800UeI = C2800Ue.b.i(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (AbstractC2995aW.i("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        Oc0 oc0J = C3336eJ.j(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? Vg0.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = Vg0.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C3657hz(oc0J, c2800UeI, listK2, new C3569gz(listK, 1));
    }

    public static RO m(String str) {
        AbstractC2995aW.q(str, "<this>");
        Matcher matcher = RO.c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(AbstractC3950lJ.r("No subtype found for: \"", str, '\"').toString());
        }
        String strGroup = matcher.group(1);
        AbstractC2995aW.p(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC2995aW.p(locale, "US");
        AbstractC2995aW.p(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC2995aW.p(strGroup2, "typeSubtype.group(2)");
        AbstractC2995aW.p(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = RO.d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(DM.l(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC3089ba0.N0(strGroup4, "'", false) && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC2995aW.p(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new RO(str, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static EnumC5106yW n(String str) throws IOException {
        EnumC5106yW enumC5106yW = EnumC5106yW.HTTP_1_0;
        if (!AbstractC2995aW.i(str, "http/1.0")) {
            enumC5106yW = EnumC5106yW.HTTP_1_1;
            if (!AbstractC2995aW.i(str, "http/1.1")) {
                enumC5106yW = EnumC5106yW.H2_PRIOR_KNOWLEDGE;
                if (!AbstractC2995aW.i(str, "h2_prior_knowledge")) {
                    enumC5106yW = EnumC5106yW.HTTP_2;
                    if (!AbstractC2995aW.i(str, "h2")) {
                        enumC5106yW = EnumC5106yW.SPDY_3;
                        if (!AbstractC2995aW.i(str, "spdy/3.1")) {
                            enumC5106yW = EnumC5106yW.QUIC;
                            if (!AbstractC2995aW.i(str, "quic")) {
                                throw new IOException(AbstractC2995aW.v0(str, "Unexpected protocol: "));
                            }
                        }
                    }
                }
            }
        }
        return enumC5106yW;
    }

    public static boolean q(String str) {
        return (AbstractC3089ba0.o0("Connection", str) || AbstractC3089ba0.o0("Keep-Alive", str) || AbstractC3089ba0.o0(HttpResponseHeader.ProxyAuthenticate, str) || AbstractC3089ba0.o0(HttpRequestHeader.ProxyAuthorization, str) || AbstractC3089ba0.o0(HttpRequestHeader.TE, str) || AbstractC3089ba0.o0("Trailers", str) || AbstractC3089ba0.o0(HttpResponseHeader.TransferEncoding, str) || AbstractC3089ba0.o0("Upgrade", str)) ? false : true;
    }

    public static int s(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC3888ke0.h("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
    }

    public static RO u(String str) {
        AbstractC2995aW.q(str, "<this>");
        try {
            return m(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static C90 v(String str) throws ProtocolException {
        int i;
        String strSubstring;
        AbstractC2995aW.q(str, "statusLine");
        boolean zN0 = AbstractC3089ba0.N0(str, "HTTP/1.", false);
        EnumC5106yW enumC5106yW = EnumC5106yW.HTTP_1_0;
        if (zN0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
                }
                enumC5106yW = EnumC5106yW.HTTP_1_1;
            }
        } else {
            if (!AbstractC3089ba0.N0(str, "ICY ", false)) {
                throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
        }
        try {
            String strSubstring2 = str.substring(i, i2);
            AbstractC2995aW.p(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i3 = Integer.parseInt(strSubstring2);
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
                }
                strSubstring = str.substring(i + 4);
                AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new C90(enumC5106yW, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(AbstractC2995aW.v0(str, "Unexpected status line: "));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer a() {
        int i = this.f4606a;
        return Integer.valueOf(R.id.tv_native_ad_content);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public List b() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer c() {
        int i = this.f4606a;
        return Integer.valueOf(R.id.bt_download);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer d() {
        switch (this.f4606a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return o();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer e() {
        switch (this.f4606a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return p();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer f() {
        switch (this.f4606a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return t();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GB
    public /* bridge */ /* synthetic */ Integer g() {
        int i = this.f4606a;
        return Integer.valueOf(R.id.tv_native_ad_title);
    }

    public Integer o() {
        switch (this.f4606a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return -1;
            default:
                return Integer.valueOf(R.id.iv_ad_title);
        }
    }

    public Integer p() {
        Integer numValueOf = Integer.valueOf(R.id.iv_ad_title);
        switch (this.f4606a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return numValueOf;
            default:
                return Integer.valueOf(R.id.iv_ad_media_view);
        }
    }

    public boolean r() {
        switch (this.f4606a) {
            case 22:
                return C3753j4.e;
            default:
                return C4145nb.e;
        }
    }

    public Integer t() {
        Integer numValueOf = Integer.valueOf(R.layout.layout_native_ad_in_mainpage);
        switch (this.f4606a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return numValueOf;
            default:
                return Integer.valueOf(R.layout.layout_native_ad_in_reload_bullets);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3887ke(int i, int i2) {
        this(0);
        this.f4606a = i;
        switch (i) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
            default:
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
