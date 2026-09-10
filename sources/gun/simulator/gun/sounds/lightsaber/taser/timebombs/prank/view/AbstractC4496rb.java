package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4496rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5 f4935a = new C5("funny.sounds.prank.airhorn.fartsounds.haircut.simulator", Integer.valueOf(R.drawable.ad_funnysounds), Integer.valueOf(R.drawable.ad_funnysound_dialog), Integer.valueOf(R.string.FunnySounds), Integer.valueOf(R.string.Enjoy_Haircut_Prank));
    public static final EnumC4602sk b = EnumC4602sk.f4993a;
    public static final String[] c = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    public static final int[] d = {44100, 48000, 32000};
    public static final int[] e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final C4710tz j = new C4710tz(26);
    public static QG k = null;
    public static int l = 10;
    public static int m = 10;
    public static int n = 10;
    public static int o = 10;
    public static int p = 2;

    public static final int A(D40 d40, VE ve) {
        AbstractC2995aW.q(ve, "<this>");
        AbstractC2995aW.q(d40, CampaignEx.JSON_KEY_DESC);
        L40 kind = d40.getKind();
        if (kind instanceof AbstractC3786jV) {
            return 4;
        }
        if (!AbstractC2995aW.i(kind, C3442fa0.b)) {
            if (!AbstractC2995aW.i(kind, C3442fa0.c)) {
                return 1;
            }
            D40 d40G = g(d40.g(0), ve.b);
            L40 kind2 = d40G.getKind();
            if ((kind2 instanceof DV) || AbstractC2995aW.i(kind2, K40.f3299a)) {
                return 3;
            }
            if (!ve.f3865a.d) {
                throw AbstractC2871Wx.H(d40G);
            }
        }
        return 2;
    }

    public static final void B(int i2, int i3, D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(d40.e(i5));
            }
            i4 >>>= 1;
        }
        String strH = d40.h();
        AbstractC2995aW.q(strH, "serialName");
        throw new BP(arrayList, arrayList.size() == 1 ? DM.n(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strH, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strH + "', but they were missing", null);
    }

    public static final String C(String str) {
        AbstractC2995aW.q(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!AbstractC3089ba0.l0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC2995aW.p(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC2995aW.p(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char cCharAt = lowerCase.charAt(i4);
                    if (AbstractC2995aW.s(cCharAt, 31) <= 0 || AbstractC2995aW.s(cCharAt, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) >= 0 || AbstractC3089ba0.s0(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                    i4 = i5;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressL = (AbstractC3089ba0.N0(str, "[", false) && str.endsWith("]")) ? l(1, str.length() - 1, str) : l(0, str.length(), str);
        if (inetAddressL == null) {
            return null;
        }
        byte[] address = inetAddressL.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressL.getHostAddress();
            }
            throw new AssertionError(AbstractC3950lJ.r("Invalid IPv6 address: '", str, '\''));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i3 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C4848vb c4848vb = new C4848vb();
        while (i2 < address.length) {
            if (i2 == i3) {
                c4848vb.R(58);
                i2 += i7;
                if (i2 == 16) {
                    c4848vb.R(58);
                }
            } else {
                if (i2 > 0) {
                    c4848vb.R(58);
                }
                byte b2 = address[i2];
                byte[] bArr = Vg0.f3884a;
                c4848vb.T(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c4848vb.t();
    }

    public static String D(int i2) {
        WD.k(16);
        String string = Integer.toString(i2, 16);
        AbstractC2995aW.p(string, "toString(this, checkRadix(radix))");
        String upperCase = AbstractC3089ba0.z0(string, 2).toUpperCase(Locale.ROOT);
        AbstractC2995aW.p(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static final C4120nD a(String str, InterfaceC4123nG interfaceC4123nG) {
        return new C4120nD(str, new C4208oD(interfaceC4123nG));
    }

    public static final IF b(Number number) {
        return new C5001xF(number, false);
    }

    public static final IF c(String str) {
        return str == null ? DF.f2962a : new C5001xF(str, true);
    }

    public static final C5076y6 d(File file) {
        Logger logger = AbstractC4926wS.f5180a;
        return u(new FileOutputStream(file, true));
    }

    public static final DX e(InterfaceC4463r70 interfaceC4463r70) {
        AbstractC2995aW.q(interfaceC4463r70, "<this>");
        return new DX(interfaceC4463r70);
    }

    public static final EX f(InterfaceC3588h80 interfaceC3588h80) {
        AbstractC2995aW.q(interfaceC3588h80, "<this>");
        return new EX(interfaceC3588h80);
    }

    public static final D40 g(D40 d40, M40 m40) {
        AbstractC2995aW.q(d40, "<this>");
        AbstractC2995aW.q(m40, com.umeng.analytics.pro.bc.e);
        if (!AbstractC2995aW.i(d40.getKind(), J40.f3253a)) {
            return d40.isInline() ? g(d40.g(0), m40) : d40;
        }
        InterfaceC3156cG interfaceC3156cGC = AbstractC3375el.C(d40);
        if (interfaceC3156cGC == null) {
            return d40;
        }
        m40.a(interfaceC3156cGC, C2812Uq.f3846a);
        return d40;
    }

    public static Object h(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC4496rb.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final void i(L40 l40) {
        AbstractC2995aW.q(l40, "kind");
        if (l40 instanceof K40) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (l40 instanceof DV) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (l40 instanceof AbstractC3786jV) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String j(D40 d40, VE ve) {
        AbstractC2995aW.q(d40, "<this>");
        AbstractC2995aW.q(ve, "json");
        for (Annotation annotation : d40.getAnnotations()) {
            if (annotation instanceof InterfaceC2978aF) {
                return ((InterfaceC2978aF) annotation).discriminator();
            }
        }
        return ve.f3865a.j;
    }

    public static Color k(int i2) {
        return new Color(((i2 >> 16) & 255) / 255.0f, ((i2 >> 8) & 255) / 255.0f, (i2 & 255) / 255.0f, ((i2 >> 24) & 255) / 255.0f);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[LOOP:1: B:56:0x00a3->B:60:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b6 A[EDGE_INSN: B:82:0x00b6->B:61:0x00b6 BREAK  A[LOOP:1: B:56:0x00a3->B:60:0x00b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a0 A[SYNTHETIC] */
    public static final InetAddress l(int i2, int i3, String str) {
        int i4;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int iQ;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z = false;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = i2;
        while (i12 < i3) {
            if (i9 == i8) {
                return null;
            }
            int i13 = i12 + 2;
            if (i13 <= i3 && AbstractC3089ba0.M0(str, "::", i12, z)) {
                if (i10 != -1) {
                    return null;
                }
                i9 += 2;
                i10 = i9;
                if (i13 == i3) {
                    break;
                }
                i11 = i13;
                i12 = i11;
                i6 = 0;
                while (i12 < i3) {
                    iQ = Vg0.q(str.charAt(i12));
                    if (iQ == -1) {
                        break;
                        break;
                    }
                    i6 = (i6 << 4) + iQ;
                    i12++;
                }
                i7 = i12 - i11;
                if (i7 != 0) {
                }
                return null;
            }
            if (i9 != 0) {
                if (!AbstractC3089ba0.M0(str, ":", i12, z)) {
                    if (AbstractC3089ba0.M0(str, ".", i12, z)) {
                        int i14 = i9 - 2;
                        int i15 = i14;
                        while (i11 < i3) {
                            if (i15 != i8) {
                                if (i15 == i14) {
                                    i4 = i11;
                                    i5 = 0;
                                    while (i4 < i3) {
                                        cCharAt = str.charAt(i4);
                                        if (AbstractC2995aW.s(cCharAt, 48) < 0 || AbstractC2995aW.s(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((i5 != 0 || i11 == i4) && (i5 = ((i5 * 10) + cCharAt) - 48) <= 255) {
                                            i4++;
                                        }
                                    }
                                    if (i4 - i11 == 0) {
                                        bArr[i15] = (byte) i5;
                                        i15++;
                                        i11 = i4;
                                        i8 = 16;
                                    }
                                } else if (str.charAt(i11) == '.') {
                                    i11++;
                                    i4 = i11;
                                    i5 = 0;
                                    while (i4 < i3) {
                                        cCharAt = str.charAt(i4);
                                        if (AbstractC2995aW.s(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i4 - i11 == 0) {
                                        bArr[i15] = (byte) i5;
                                        i15++;
                                        i11 = i4;
                                        i8 = 16;
                                    }
                                }
                            }
                        }
                        if (i15 == i9 + 2) {
                            i9 += 2;
                            break;
                        }
                    }
                    return null;
                }
                i12++;
            }
            i11 = i12;
            i12 = i11;
            i6 = 0;
            while (i12 < i3) {
                iQ = Vg0.q(str.charAt(i12));
                if (iQ == -1) {
                    break;
                }
                i6 = (i6 << 4) + iQ;
                i12++;
            }
            i7 = i12 - i11;
            if (i7 != 0 || i7 > 4) {
                return null;
            }
            int i16 = i9 + 1;
            bArr[i9] = (byte) ((i6 >>> 8) & 255);
            i9 += 2;
            bArr[i16] = (byte) (i6 & 255);
            i8 = 16;
            z = false;
        }
        if (i9 != 16) {
            if (i10 == -1) {
                return null;
            }
            int i17 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final Object m(InterfaceC3858kF interfaceC3858kF, InterfaceC2369Do interfaceC2369Do) {
        AbstractC2995aW.q(interfaceC3858kF, "<this>");
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        if (!(interfaceC2369Do instanceof U) || interfaceC3858kF.d().f3865a.i) {
            return interfaceC2369Do.deserialize(interfaceC3858kF);
        }
        String strJ = j(interfaceC2369Do.getDescriptor(), interfaceC3858kF.d());
        AbstractC4122nF abstractC4122nFG = interfaceC3858kF.g();
        D40 descriptor = interfaceC2369Do.getDescriptor();
        if (!(abstractC4122nFG instanceof FF)) {
            throw AbstractC2871Wx.I(-1, "Expected " + AbstractC3263dY.a(FF.class) + " as the serialized body of " + descriptor.h() + ", but had " + AbstractC3263dY.a(abstractC4122nFG.getClass()));
        }
        FF ff = (FF) abstractC4122nFG;
        AbstractC4122nF abstractC4122nF = (AbstractC4122nF) ff.get(strJ);
        String strA = null;
        if (abstractC4122nF != null) {
            IF r6 = abstractC4122nF instanceof IF ? (IF) abstractC4122nF : null;
            if (r6 == null) {
                o("JsonPrimitive", abstractC4122nF);
                throw null;
            }
            strA = r6.a();
        }
        InterfaceC2369Do interfaceC2369DoA = ((U) interfaceC2369Do).a(interfaceC3858kF, strA);
        if (interfaceC2369DoA == null) {
            throw AbstractC2871Wx.J(-1, ff.toString(), AbstractC3888ke0.i("Polymorphic serializer was not found for ", strA == null ? "missing class discriminator ('null')" : AbstractC3950lJ.r("class discriminator '", strA, '\'')));
        }
        VE veD = interfaceC3858kF.d();
        AbstractC2995aW.q(veD, "<this>");
        AbstractC2995aW.q(strJ, "discriminator");
        return m(new PF(veD, ff, strJ, interfaceC2369DoA.getDescriptor()), interfaceC2369DoA);
    }

    public static void n(InterfaceC3385er interfaceC3385er, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        if (interfaceC4123nG.getDescriptor().b()) {
            interfaceC3385er.x(interfaceC4123nG, obj);
        } else if (obj == null) {
            interfaceC3385er.t();
        } else {
            interfaceC3385er.getClass();
            interfaceC3385er.x(interfaceC4123nG, obj);
        }
    }

    public static final void o(String str, AbstractC4122nF abstractC4122nF) {
        throw new IllegalArgumentException("Element " + AbstractC3263dY.a(abstractC4122nF.getClass()) + " is not a " + str);
    }

    public static final Boolean p(IF r2) {
        AbstractC2995aW.q(r2, "<this>");
        String strA = r2.a();
        String[] strArr = V90.f3862a;
        AbstractC2995aW.q(strA, "<this>");
        if (AbstractC3089ba0.o0(strA, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC3089ba0.o0(strA, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static int q(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = d[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? e[i5 - 1] : f[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? g[i5 - 1] : h[i5 - 1];
        } else {
            i7 = i[i5 - 1];
        }
        int i10 = Input.Keys.NUMPAD_0;
        if (i3 == 3) {
            return AbstractC3950lJ.D(i7, Input.Keys.NUMPAD_0, i8, i9);
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return AbstractC3950lJ.D(i10, i7, i8, i9);
    }

    public static String r(int i2) {
        return AbstractC5044xl.m("#", D((i2 >> 16) & 255), D((i2 >> 8) & 255), D(i2 & 255));
    }

    public static final boolean s(AssertionError assertionError) {
        String message;
        Logger logger = AbstractC4926wS.f5180a;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !AbstractC3089ba0.l0(message, "getsockname failed")) ? false : true;
    }

    public static int t(int i2) {
        int i3;
        int i4;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 == 1) {
            return i3 == 3 ? 1152 : 576;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static final C5076y6 u(OutputStream outputStream) {
        Logger logger = AbstractC4926wS.f5180a;
        return new C5076y6(outputStream, new Ic0());
    }

    public static final C5076y6 v(Socket socket) throws IOException {
        Logger logger = AbstractC4926wS.f5180a;
        HX hx = new HX(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC2995aW.p(outputStream, "getOutputStream()");
        return new C5076y6(hx, new C5076y6(outputStream, hx));
    }

    public static C5076y6 w(File file) {
        Logger logger = AbstractC4926wS.f5180a;
        AbstractC2995aW.q(file, "<this>");
        return u(new FileOutputStream(file, false));
    }

    public static final C5164z6 x(InputStream inputStream) {
        Logger logger = AbstractC4926wS.f5180a;
        AbstractC2995aW.q(inputStream, "<this>");
        return new C5164z6(inputStream, new Ic0());
    }

    public static final C5164z6 y(Socket socket) throws IOException {
        Logger logger = AbstractC4926wS.f5180a;
        HX hx = new HX(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC2995aW.p(inputStream, "getInputStream()");
        return new C5164z6(hx, new C5164z6(inputStream, hx));
    }

    public static int z(String str) {
        String strL = AbstractC5044xl.l(str, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
        WD.k(16);
        return (int) Long.parseLong(strL, 16);
    }
}
