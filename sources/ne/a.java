package ne;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.h1;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.t0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import ea.e2;
import ea.f2;
import j2.p;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import l7.g0;
import l7.s;
import m0.s1;
import m5.k;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import pm.q0;
import pm.r0;
import pm.y;
import pm.y0;
import q7.x;
import s4.m;
import t6.j;
import v0.i;
import xi.w;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements d, xi.d, he.d, t8.b, p, t6.d, j, t9.b, t9.c, sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46712a;

    public /* synthetic */ a(int i10) {
        this.f46712a = i10;
    }

    public static ke.b e(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr[0].length + i11;
        int length2 = bArr.length + i11;
        ke.b bVar = new ke.b(length, length2);
        int[] iArr = bVar.f44617d;
        int length3 = iArr.length;
        for (int i12 = 0; i12 < length3; i12++) {
            iArr[i12] = 0;
        }
        int i13 = (length2 - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    bVar.b(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return bVar;
    }

    public static q0 f(m0 m0Var, nl.a typeAttr, k typeParameterUpperBoundEraser, y yVar) {
        n.f(typeAttr, "typeAttr");
        n.f(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!typeAttr.f46789c) {
            typeAttr = typeAttr.b(1);
        }
        int iC = i.c(typeAttr.f46788b);
        if (iC != 0 && iC != 1) {
            if (iC == 2) {
                return new r0(1, yVar);
            }
            throw new aa.b((byte) 0, 20);
        }
        int iV = m0Var.v();
        boolean z10 = true;
        if (iV != 1) {
            if (iV == 2) {
                z10 = false;
            } else if (iV != 3) {
                throw null;
            }
        }
        if (!z10) {
            return new r0(1, fm.e.e(m0Var).n());
        }
        List parameters = yVar.P().getParameters();
        n.e(parameters, "erasedUpperBound.constructor.parameters");
        return !parameters.isEmpty() ? new r0(3, yVar) : y0.k(m0Var, typeAttr);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0328  */
    /* JADX WARN: Code duplicated, block: B:216:0x0432 A[LOOP:12: B:215:0x0430->B:216:0x0432, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x044b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0454  */
    private final ke.b m(String str, int i10, EnumMap enumMap) throws he.e {
        int i11;
        ke.c cVar;
        boolean z10;
        String str2;
        char c4;
        char c5;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        String str3;
        int i19;
        int i20;
        int i21;
        if (i10 != 11) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(u.A(i10)));
        }
        he.a aVar = he.a.f42330g;
        boolean zBooleanValue = enumMap.containsKey(aVar) ? Boolean.valueOf(enumMap.get(aVar).toString()).booleanValue() : false;
        he.a aVar2 = he.a.f42331h;
        if (enumMap.containsKey(aVar2)) {
            String string = enumMap.get(aVar2).toString();
            if (string == null) {
                throw new NullPointerException("Name is null");
            }
            if (string.equals("AUTO")) {
                i11 = 1;
            } else if (string.equals("TEXT")) {
                i11 = 2;
            } else if (string.equals("BYTE")) {
                i11 = 3;
            } else {
                if (!string.equals("NUMERIC")) {
                    throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(string));
                }
                i11 = 4;
            }
        } else {
            i11 = 1;
        }
        he.a aVar3 = he.a.f42332i;
        if (enumMap.containsKey(aVar3)) {
            enumMap.get(aVar3).getClass();
            throw new ClassCastException();
        }
        he.a aVar4 = he.a.f42329f;
        int i22 = enumMap.containsKey(aVar4) ? Integer.parseInt(enumMap.get(aVar4).toString()) : 30;
        he.a aVar5 = he.a.f42324a;
        int i23 = enumMap.containsKey(aVar5) ? Integer.parseInt(enumMap.get(aVar5).toString()) : 2;
        he.a aVar6 = he.a.f42325b;
        Charset charsetForName = enumMap.containsKey(aVar6) ? Charset.forName(enumMap.get(aVar6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i23 < 0 || i23 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        int i24 = 1 << (i23 + 1);
        Charset charset = qe.b.f49022e;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (cVar = (ke.c) ke.c.f44619d.get(charsetForName.name())) != null) {
            int i25 = cVar.f44621a[0];
            if (i25 >= 0 && i25 < 900) {
                sb2.append((char) 927);
                sb2.append((char) i25);
            } else if (i25 < 810900) {
                sb2.append((char) 926);
                sb2.append((char) ((i25 / 900) - 1));
                sb2.append((char) (i25 % 900));
            } else {
                if (i25 >= 811800) {
                    throw new he.e("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i25)));
                }
                sb2.append((char) 925);
                sb2.append((char) (810900 - i25));
            }
        }
        int length = str.length();
        int iC = i.c(i11);
        if (iC == 1) {
            z10 = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            qe.b.c(str, 0, length, sb2, 0);
        } else if (iC == 2) {
            z10 = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            qe.b.a(bytes.length, 1, sb2, bytes);
        } else if (iC != 3) {
            int i26 = 0;
            int iC2 = 0;
            int i27 = 0;
            while (i27 < length) {
                int length2 = str.length();
                char c10 = '0';
                if (i27 < length2) {
                    int i28 = i27;
                    char cCharAt = str.charAt(i27);
                    int i29 = 0;
                    while (cCharAt >= '0' && cCharAt <= '9' && i28 < length2) {
                        i29++;
                        i28++;
                        if (i28 < length2) {
                            cCharAt = str.charAt(i28);
                        }
                    }
                    i18 = i29;
                } else {
                    i18 = 0;
                }
                if (i18 >= 13) {
                    sb2.append((char) 902);
                    qe.b.b(i27, i18, str, sb2);
                    i27 += i18;
                    i26 = 2;
                    iC2 = 0;
                } else {
                    int length3 = str.length();
                    int i30 = i27;
                    while (true) {
                        if (i30 < length3) {
                            str3 = str4;
                            char cCharAt2 = str.charAt(i30);
                            z12 = zBooleanValue;
                            int i31 = 0;
                            while (i31 < 13 && cCharAt2 >= c10 && cCharAt2 <= '9' && i30 < length3) {
                                i31++;
                                i30++;
                                if (i30 < length3) {
                                    cCharAt2 = str.charAt(i30);
                                }
                                c10 = '0';
                            }
                            if (i31 >= 13) {
                                i19 = (i30 - i27) - i31;
                                break;
                            }
                            if (i31 <= 0) {
                                char cCharAt3 = str.charAt(i30);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i30++;
                                }
                            }
                            zBooleanValue = z12;
                            str4 = str3;
                            c10 = '0';
                        } else {
                            z12 = zBooleanValue;
                            str3 = str4;
                        }
                        i19 = i30 - i27;
                        break;
                    }
                    if (i19 >= 5 || i18 == length) {
                        if (i26 != 0) {
                            sb2.append((char) 900);
                            i20 = 0;
                            i26 = 0;
                        } else {
                            i20 = iC2;
                        }
                        iC2 = qe.b.c(str, i27, i19, sb2, i20);
                        i27 += i19;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i32 = i27;
                        while (i32 < length4) {
                            char cCharAt4 = str.charAt(i32);
                            int i33 = 0;
                            while (true) {
                                if (i33 >= 13 || cCharAt4 < '0') {
                                    break;
                                }
                                if (cCharAt4 > '9' || (i21 = i32 + (i33 = i33 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i21);
                            }
                            if (i33 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i32);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new he.e("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i32++;
                        }
                        int i34 = i32 - i27;
                        if (i34 == 0) {
                            i34 = 1;
                        }
                        int i35 = i27 + i34;
                        byte[] bytes2 = str.substring(i27, i35).getBytes(charsetForName);
                        if (bytes2.length == 1 && i26 == 0) {
                            qe.b.a(1, 0, sb2, bytes2);
                        } else {
                            qe.b.a(bytes2.length, i26, sb2, bytes2);
                            i26 = 1;
                            iC2 = 0;
                        }
                        i27 = i35;
                    }
                    zBooleanValue = z12;
                    str4 = str3;
                }
            }
            z10 = zBooleanValue;
            str2 = str4;
        } else {
            z10 = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            sb2.append((char) 902);
            qe.b.b(0, length, str, sb2);
        }
        String string2 = sb2.toString();
        int length5 = string2.length();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int[] iArr = null;
        for (int i36 = 2; i36 <= 30; i36++) {
            int i37 = length5 + 1 + i24;
            int i38 = i37 / i36;
            int i39 = i38 + 1;
            if (i36 * i39 < i37 + i36) {
                i38 = i39;
            }
            if (i38 < 2) {
                break;
            }
            if (i38 <= 30) {
                float f11 = (((i36 * 17) + 69) * 0.357f) / (i38 * 2.0f);
                if (iArr == null || Math.abs(f11 - 3.0f) <= Math.abs(f10 - 3.0f)) {
                    f10 = f11;
                    iArr = new int[]{i36, i38};
                }
            }
        }
        if (iArr == null) {
            int i40 = length5 + 1 + i24;
            int i41 = i40 / 2;
            int i42 = i41 + 1;
            if (2 * i42 < i40 + 2) {
                i41 = i42;
            }
            if (i41 < 2) {
                c4 = 0;
                c5 = 1;
                iArr = new int[]{2, 2};
            } else {
                c4 = 0;
                c5 = 1;
            }
        } else {
            c4 = 0;
            c5 = 1;
        }
        if (iArr == null) {
            throw new he.e("Unable to fit message in columns");
        }
        int i43 = iArr[c4];
        int i44 = iArr[c5];
        int i45 = (i43 * i44) - i24;
        int i46 = i45 > length5 + 1 ? (i45 - length5) - 1 : 0;
        if (length5 + i24 + 1 > 929) {
            throw new he.e("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i47 = length5 + i46 + 1;
        StringBuilder sb3 = new StringBuilder(i47);
        sb3.append((char) i47);
        sb3.append(string2);
        for (int i48 = 0; i48 < i46; i48++) {
            sb3.append((char) 900);
        }
        String string3 = sb3.toString();
        int[][] iArr2 = qe.a.f49017b;
        if (i23 < 0 || i23 > 8) {
            throw new IllegalArgumentException(str2);
        }
        char[] cArr = new char[i24];
        int length6 = string3.length();
        for (int i49 = 0; i49 < length6; i49++) {
            int i50 = i24 - 1;
            int iCharAt = (string3.charAt(i49) + cArr[i50]) % 929;
            while (i50 > 0) {
                cArr[i50] = (char) ((cArr[i50 - 1] + (929 - ((iArr2[i23][i50] * iCharAt) % 929))) % 929);
                i50--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i23][0]) % 929)) % 929);
        }
        StringBuilder sb4 = new StringBuilder(i24);
        for (int i51 = i24 - 1; i51 >= 0; i51--) {
            char c11 = cArr[i51];
            if (c11 != 0) {
                cArr[i51] = (char) (929 - c11);
            }
            sb4.append(cArr[i51]);
        }
        String string4 = sb4.toString();
        androidx.datastore.preferences.protobuf.n nVar = new androidx.datastore.preferences.protobuf.n(i44, i43);
        String strH = wi.d.h(string3, string4);
        int[][] iArr3 = qe.a.f49016a;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i44) {
            int i54 = i52 % 3;
            nVar.f4134b++;
            qe.a.a(130728, 17, nVar.c());
            if (i54 == 0) {
                i14 = (i52 / 3) * 30;
                i12 = ((i44 - 1) / 3) + i14;
                i15 = i43 - 1;
            } else {
                if (i54 == 1) {
                    i14 = (i52 / 3) * 30;
                    int i55 = i44 - 1;
                    i12 = (i23 * 3) + i14 + (i55 % 3);
                    i15 = i55 / 3;
                } else {
                    int i56 = (i52 / 3) * 30;
                    i12 = (i43 - 1) + i56;
                    i13 = (i23 * 3) + i56 + ((i44 - 1) % 3);
                }
                qe.a.a(iArr3[i54][i12], 17, nVar.c());
                i16 = i53;
                for (i17 = 0; i17 < i43; i17++) {
                    qe.a.a(iArr3[i54][strH.charAt(i16)], 17, nVar.c());
                    i16++;
                }
                if (z10) {
                    qe.a.a(260649, 1, nVar.c());
                } else {
                    qe.a.a(iArr3[i54][i13], 17, nVar.c());
                    qe.a.a(260649, 18, nVar.c());
                }
                i52++;
                i53 = i16;
            }
            i13 = i15 + i14;
            qe.a.a(iArr3[i54][i12], 17, nVar.c());
            i16 = i53;
            while (i17 < i43) {
                qe.a.a(iArr3[i54][strH.charAt(i16)], 17, nVar.c());
                i16++;
            }
            if (z10) {
                qe.a.a(260649, 1, nVar.c());
            } else {
                qe.a.a(iArr3[i54][i13], 17, nVar.c());
                qe.a.a(260649, 18, nVar.c());
            }
            i52++;
            i53 = i16;
        }
        byte[][] bArrE = nVar.e(1, 4);
        if (bArrE[0].length < bArrE.length) {
            bArrE = v(bArrE);
            z11 = true;
        } else {
            z11 = false;
        }
        int length7 = 200 / bArrE[0].length;
        int length8 = 200 / bArrE.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return e(bArrE, i22);
        }
        byte[][] bArrE2 = nVar.e(length7, length7 << 2);
        if (z11) {
            bArrE2 = v(bArrE2);
        }
        return e(bArrE2, i22);
    }

    public static byte[][] v(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static void w(WebSettings webSettings, boolean z10) {
        na.g kVar;
        if (!m.f50124j.a()) {
            throw m.a();
        }
        int i10 = 12;
        try {
            kVar = new na.g((WebSettingsBoundaryInterface) no.b.e(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) s4.n.f50125a.f49529b).convertSettings(webSettings)), i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e10;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
            kVar = new s4.k(null, i10);
        }
        kVar.F(z10);
    }

    public static void x(b0.n nVar, StringBuilder sb2) {
        int iCharAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        ((StringBuilder) nVar.f5158f).append(new String(new char[]{(char) (iCharAt / NotificationCompat.FLAG_LOCAL_ONLY), (char) (iCharAt % NotificationCompat.FLAG_LOCAL_ONLY)}));
        sb2.delete(0, 3);
    }

    @Override // t9.b
    public int a(Context context, String str, boolean z10) {
        return t9.d.d(context, str, z10);
    }

    @Override // t6.d
    public void c(t6.f fVar) {
        fVar.onStart();
    }

    @Override // t9.b
    public int d(Context context, String str) {
        return t9.d.a(context, str);
    }

    @Override // xi.d
    public void g(ByteBuffer byteBuffer, oi.f fVar) {
        w.f53833b.getClass();
        w.c(byteBuffer);
    }

    @Override // vj.a
    public Object get() {
        return new e2(Executors.newSingleThreadExecutor(), 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:377:0x0699  */
    /* JADX WARN: Code duplicated, block: B:407:0x0711  */
    /* JADX WARN: Code duplicated, block: B:408:0x0714  */
    /* JADX WARN: Code duplicated, block: B:465:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) throws he.e {
        int i11;
        int i12;
        se.a aVar;
        int i13;
        int i14;
        se.b bVarA;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c4;
        int i18;
        ke.c cVar;
        int i19;
        int i20;
        int i21;
        char cCharAt;
        int i22;
        switch (this.f46712a) {
            case 7:
                return m(str, i10, enumMap);
            default:
                int[] iArr = te.b.f50745a;
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Found empty contents");
                }
                if (i10 != 12) {
                    throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(u.A(i10)));
                }
                he.a aVar2 = he.a.f42324a;
                if (enumMap.containsKey(aVar2)) {
                    String string = enumMap.get(aVar2).toString();
                    if (string == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string.equals("L")) {
                        i11 = 1;
                    } else if (string.equals("M")) {
                        i11 = 2;
                    } else if (string.equals("Q")) {
                        i11 = 3;
                    } else {
                        if (!string.equals("H")) {
                            throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
                        }
                        i11 = 4;
                    }
                } else {
                    i11 = 1;
                }
                he.a aVar3 = he.a.f42329f;
                int i23 = enumMap.containsKey(aVar3) ? Integer.parseInt(enumMap.get(aVar3).toString()) : 4;
                he.a aVar4 = he.a.f42325b;
                boolean zContainsKey = enumMap.containsKey(aVar4);
                String string2 = zContainsKey ? enumMap.get(aVar4).toString() : "ISO-8859-1";
                boolean zEquals = "Shift_JIS".equals(string2);
                se.a aVar5 = se.a.BYTE;
                if (zEquals) {
                    try {
                        byte[] bytes = str.getBytes("Shift_JIS");
                        i12 = 0;
                        int length = bytes.length;
                        if (length % 2 != 0) {
                            i19 = i12;
                            i20 = i19;
                            i21 = i20;
                            while (true) {
                                if (i19 < str.length()) {
                                    cCharAt = str.charAt(i19);
                                    if (cCharAt >= '0' || cCharAt > '9') {
                                        if (cCharAt < '`') {
                                            i22 = iArr[cCharAt];
                                        } else {
                                            i22 = -1;
                                        }
                                        if (i22 != -1) {
                                            i20 = 1;
                                        }
                                    } else {
                                        i21 = 1;
                                    }
                                    i19++;
                                } else if (i20 != 0) {
                                    aVar = se.a.ALPHANUMERIC;
                                } else if (i21 != 0) {
                                    aVar = se.a.NUMERIC;
                                }
                                aVar = aVar5;
                            }
                        } else {
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length) {
                                    aVar = se.a.KANJI;
                                } else {
                                    int i25 = bytes[i24] & 255;
                                    if ((i25 < 129 || i25 > 159) && (i25 < 224 || i25 > 235)) {
                                        i19 = i12;
                                        i20 = i19;
                                        i21 = i20;
                                        while (true) {
                                            if (i19 < str.length()) {
                                                cCharAt = str.charAt(i19);
                                                if (cCharAt >= '0') {
                                                    if (cCharAt < '`') {
                                                        i22 = iArr[cCharAt];
                                                    } else {
                                                        i22 = -1;
                                                    }
                                                    if (i22 != -1) {
                                                        i20 = 1;
                                                    }
                                                } else {
                                                    if (cCharAt < '`') {
                                                        i22 = iArr[cCharAt];
                                                    } else {
                                                        i22 = -1;
                                                    }
                                                    if (i22 != -1) {
                                                        i20 = 1;
                                                    }
                                                }
                                                i19++;
                                            } else if (i20 != 0) {
                                                aVar = se.a.ALPHANUMERIC;
                                            } else if (i21 != 0) {
                                                aVar = se.a.NUMERIC;
                                            }
                                            aVar = aVar5;
                                        }
                                    } else {
                                        i24 += 2;
                                    }
                                }
                            }
                        }
                    } catch (UnsupportedEncodingException unused) {
                        i12 = 0;
                    }
                } else {
                    i12 = 0;
                    i19 = i12;
                    i20 = i19;
                    i21 = i20;
                    while (true) {
                        if (i19 < str.length()) {
                            cCharAt = str.charAt(i19);
                            if (cCharAt >= '0') {
                                if (cCharAt < '`') {
                                    i22 = iArr[cCharAt];
                                } else {
                                    i22 = -1;
                                }
                                if (i22 != -1) {
                                    i20 = 1;
                                }
                            } else {
                                if (cCharAt < '`') {
                                    i22 = iArr[cCharAt];
                                } else {
                                    i22 = -1;
                                }
                                if (i22 != -1) {
                                    i20 = 1;
                                }
                            }
                            i19++;
                        } else if (i20 != 0) {
                            aVar = se.a.ALPHANUMERIC;
                        } else if (i21 != 0) {
                            aVar = se.a.NUMERIC;
                        }
                        aVar = aVar5;
                    }
                }
                int[] iArr2 = aVar.f50232a;
                ke.a aVar6 = new ke.a();
                if (aVar == aVar5 && zContainsKey && (cVar = (ke.c) ke.c.f44619d.get(string2)) != null) {
                    aVar6.b(7, 4);
                    aVar6.b(cVar.f44621a[i12], 8);
                }
                he.a aVar7 = he.a.l;
                if (enumMap.containsKey(aVar7) && Boolean.valueOf(enumMap.get(aVar7).toString()).booleanValue()) {
                    i13 = 4;
                    aVar6.b(5, 4);
                } else {
                    i13 = 4;
                }
                aVar6.b(aVar.f50233b, i13);
                ke.a aVar8 = new ke.a();
                int iOrdinal = aVar.ordinal();
                int i26 = 2;
                int i27 = 8;
                int i28 = 10;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        int length2 = str.length();
                        int i29 = i12;
                        while (i29 < length2) {
                            char cCharAt2 = str.charAt(i29);
                            int i30 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                            i26 = i26;
                            if (i30 == -1) {
                                throw new he.e();
                            }
                            int i31 = i29 + 1;
                            if (i31 < length2) {
                                char cCharAt3 = str.charAt(i31);
                                int i32 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                                if (i32 == -1) {
                                    throw new he.e();
                                }
                                aVar8.b((i30 * 45) + i32, 11);
                                i29 += 2;
                            } else {
                                aVar8.b(i30, 6);
                                i29 = i31;
                            }
                        }
                    } else if (iOrdinal == i13) {
                        try {
                            byte[] bytes2 = str.getBytes(string2);
                            int length3 = bytes2.length;
                            int i33 = i12;
                            while (i33 < length3) {
                                aVar8.b(bytes2[i33], i27);
                                i33++;
                                i27 = 8;
                            }
                        } catch (UnsupportedEncodingException e10) {
                            throw new he.e(e10);
                        }
                    } else {
                        if (iOrdinal != 6) {
                            throw new he.e("Invalid mode: ".concat(String.valueOf(aVar)));
                        }
                        try {
                            byte[] bytes3 = str.getBytes("Shift_JIS");
                            int length4 = bytes3.length;
                            for (int i34 = i12; i34 < length4; i34 += 2) {
                                int i35 = ((bytes3[i34] & 255) << 8) | (bytes3[i34 + 1] & 255);
                                int i36 = 33088;
                                if (i35 >= 33088 && i35 <= 40956) {
                                    i18 = i35 - i36;
                                } else if (i35 < 57408 || i35 > 60351) {
                                    i18 = -1;
                                } else {
                                    i36 = 49472;
                                    i18 = i35 - i36;
                                }
                                if (i18 == -1) {
                                    throw new he.e("Invalid byte sequence");
                                }
                                aVar8.b(((i18 >> 8) * PsExtractor.AUDIO_STREAM) + (i18 & 255), 13);
                            }
                        } catch (UnsupportedEncodingException e11) {
                            throw new he.e(e11);
                        }
                    }
                    i14 = i26;
                } else {
                    i14 = 2;
                    int length5 = str.length();
                    int i37 = i12;
                    while (i37 < length5) {
                        int iCharAt = str.charAt(i37) - '0';
                        int i38 = i37 + 2;
                        if (i38 < length5) {
                            aVar8.b(((str.charAt(i37 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i38) - '0'), i28);
                            i37 += 3;
                        } else {
                            i37++;
                            if (i37 < length5) {
                                aVar8.b((iCharAt * 10) + (str.charAt(i37) - '0'), 7);
                                i37 = i38;
                            } else {
                                aVar8.b(iCharAt, 4);
                            }
                        }
                        i28 = 10;
                    }
                }
                he.a aVar9 = he.a.f42334k;
                if (enumMap.containsKey(aVar9)) {
                    bVarA = se.b.a(Integer.parseInt(enumMap.get(aVar9).toString()));
                    int i39 = aVar6.f44613b;
                    int i40 = bVarA.f50235a;
                    int i41 = iArr2[i40 <= 9 ? i12 : i40 <= 26 ? 1 : i14] + i39 + aVar8.f44613b;
                    int i42 = bVarA.f50237c;
                    b2.w wVar = bVarA.f50236b[i.c(i11)];
                    int i43 = wVar.f5410b;
                    n3[] n3VarArr = (n3[]) wVar.f5411c;
                    int length6 = n3VarArr.length;
                    int i44 = i12;
                    int i45 = i44;
                    while (i44 < length6) {
                        i45 += n3VarArr[i44].f17624a;
                        i44++;
                    }
                    if ((i42 - (i45 * i43) >= (i41 + 7) / 8 ? 1 : i12) == 0) {
                        throw new he.e("Data too big for requested version");
                    }
                } else {
                    se.b bVarA2 = se.b.a(1);
                    int i46 = aVar6.f44613b;
                    int i47 = bVarA2.f50235a;
                    int i48 = iArr2[i47 <= 9 ? i12 : i47 <= 26 ? 1 : i14] + i46 + aVar8.f44613b;
                    int i49 = 1;
                    while (true) {
                        if (i49 > 40) {
                            throw new he.e("Data too big");
                        }
                        se.b bVarA3 = se.b.a(i49);
                        int i50 = bVarA3.f50237c;
                        b2.w wVar2 = bVarA3.f50236b[i.c(i11)];
                        int i51 = wVar2.f5410b;
                        n3[] n3VarArr2 = (n3[]) wVar2.f5411c;
                        int length7 = n3VarArr2.length;
                        int i52 = i12;
                        int i53 = i52;
                        while (i52 < length7) {
                            int i54 = i52;
                            i53 += n3VarArr2[i54].f17624a;
                            i52 = i54 + 1;
                        }
                        if (i50 - (i53 * i51) >= (i48 + 7) / 8) {
                            int i55 = aVar6.f44613b;
                            int i56 = bVarA3.f50235a;
                            int i57 = iArr2[i56 <= 9 ? i12 : i56 <= 26 ? 1 : i14] + i55 + aVar8.f44613b;
                            int i58 = 1;
                            while (true) {
                                if (i58 > 40) {
                                    throw new he.e("Data too big");
                                }
                                se.b bVarA4 = se.b.a(i58);
                                int i59 = bVarA4.f50237c;
                                b2.w wVar3 = bVarA4.f50236b[i.c(i11)];
                                int i60 = wVar3.f5410b;
                                n3[] n3VarArr3 = (n3[]) wVar3.f5411c;
                                int length8 = n3VarArr3.length;
                                int i61 = i12;
                                int i62 = i61;
                                while (i61 < length8) {
                                    int i63 = i61;
                                    i62 += n3VarArr3[i63].f17624a;
                                    i61 = i63 + 1;
                                }
                                if (i59 - (i62 * i60) >= (i57 + 7) / 8) {
                                    bVarA = bVarA4;
                                } else {
                                    i58++;
                                    i12 = 0;
                                }
                            }
                        } else {
                            i49++;
                            i12 = 0;
                        }
                    }
                }
                int i64 = bVarA.f50235a;
                int i65 = bVarA.f50237c;
                ke.a aVar10 = new ke.a();
                int i66 = aVar6.f44613b;
                aVar10.c(i66);
                for (int i67 = i12; i67 < i66; i67++) {
                    aVar10.a(aVar6.d(i67));
                }
                int iE = aVar == aVar5 ? aVar8.e() : str.length();
                int i68 = iArr2[i64 <= 9 ? i12 : i64 <= 26 ? 1 : i14];
                int i69 = 1 << i68;
                if (iE >= i69) {
                    throw new he.e(iE + " is bigger than " + (i69 - 1));
                }
                aVar10.b(iE, i68);
                int i70 = aVar8.f44613b;
                aVar10.c(aVar10.f44613b + i70);
                for (int i71 = i12; i71 < i70; i71++) {
                    aVar10.a(aVar8.d(i71));
                }
                b2.w wVar4 = bVarA.f50236b[i.c(i11)];
                int i72 = wVar4.f5410b;
                n3[] n3VarArr4 = (n3[]) wVar4.f5411c;
                int length9 = n3VarArr4.length;
                int i73 = i12;
                int i74 = i73;
                while (i73 < length9) {
                    i74 += n3VarArr4[i73].f17624a;
                    i73++;
                }
                int i75 = i65 - (i74 * i72);
                int i76 = i75 << 3;
                if (aVar10.f44613b > i76) {
                    throw new he.e("data bits cannot fit in the QR Code" + aVar10.f44613b + " > " + i76);
                }
                for (int i77 = i12; i77 < 4 && aVar10.f44613b < i76; i77++) {
                    aVar10.a(i12);
                }
                boolean z14 = i12;
                int i78 = aVar10.f44613b & 7;
                if (i78 > 0) {
                    while (i78 < 8) {
                        aVar10.a(z14);
                        i78++;
                        z14 = 0;
                    }
                }
                int iE2 = i75 - aVar10.e();
                for (int i79 = 0; i79 < iE2; i79++) {
                    aVar10.b((i79 & 1) == 0 ? 236 : 17, 8);
                }
                if (aVar10.f44613b != i76) {
                    throw new he.e("Bits size does not equal capacity");
                }
                int i80 = 0;
                for (n3 n3Var : n3VarArr4) {
                    i80 += n3Var.f17624a;
                }
                if (aVar10.e() != i75) {
                    throw new he.e("Number of bits and data bytes does not match");
                }
                ArrayList arrayList = new ArrayList(i80);
                int i81 = 0;
                int i82 = 0;
                int iMax = 0;
                int iMax2 = 0;
                while (i81 < i80) {
                    int[] iArr3 = new int[1];
                    int[] iArr4 = new int[1];
                    if (i81 >= i80) {
                        throw new he.e("Block ID too large");
                    }
                    int i83 = i65 % i80;
                    int i84 = i64;
                    int i85 = i80 - i83;
                    int i86 = i65 / i80;
                    int i87 = i75 / i80;
                    int i88 = i87 + 1;
                    int i89 = i23;
                    int i90 = i86 - i87;
                    int i91 = (i86 + 1) - i88;
                    if (i90 != i91) {
                        throw new he.e("EC bytes mismatch");
                    }
                    if (i80 != i85 + i83) {
                        throw new he.e("RS blocks mismatch");
                    }
                    if (i65 != ((i88 + i91) * i83) + ((i87 + i90) * i85)) {
                        throw new he.e("Total bytes mismatch");
                    }
                    if (i81 < i85) {
                        c4 = 0;
                        iArr3[0] = i87;
                        iArr4[0] = i90;
                    } else {
                        c4 = 0;
                        iArr3[0] = i88;
                        iArr4[0] = i91;
                    }
                    int i92 = iArr3[c4];
                    byte[] bArr = new byte[i92];
                    int i93 = i82 << 3;
                    int i94 = 0;
                    while (i94 < i92) {
                        int i95 = i81;
                        int i96 = i80;
                        int i97 = i94;
                        int i98 = i93;
                        int i99 = 0;
                        for (int i100 = 0; i100 < 8; i100++) {
                            if (aVar10.d(i98)) {
                                i99 |= 1 << (7 - i100);
                            }
                            i98++;
                        }
                        bArr[i97] = (byte) i99;
                        i94 = i97 + 1;
                        i93 = i98;
                        i81 = i95;
                        i80 = i96;
                    }
                    int i101 = i81;
                    int i102 = i80;
                    int i103 = iArr4[0];
                    int[] iArr5 = new int[i92 + i103];
                    for (int i104 = 0; i104 < i92; i104++) {
                        iArr5[i104] = bArr[i104] & 255;
                    }
                    new f2(le.a.f45322k).i(i103, iArr5);
                    byte[] bArr2 = new byte[i103];
                    int i105 = 0;
                    while (i105 < i103) {
                        int[] iArr6 = iArr5;
                        bArr2[i105] = (byte) iArr6[i92 + i105];
                        i105++;
                        iArr5 = iArr6;
                    }
                    arrayList.add(new te.a(bArr, bArr2));
                    iMax = Math.max(iMax, i92);
                    iMax2 = Math.max(iMax2, i103);
                    i82 += iArr3[0];
                    i81 = i101 + 1;
                    i80 = i102;
                    i64 = i84;
                    i23 = i89;
                }
                int i106 = i64;
                int i107 = i23;
                if (i75 != i82) {
                    throw new he.e("Data bytes does not match offset");
                }
                ke.a aVar11 = new ke.a();
                for (int i108 = 0; i108 < iMax; i108++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArr3 = ((te.a) it.next()).f50743a;
                        if (i108 < bArr3.length) {
                            aVar11.b(bArr3[i108], 8);
                        }
                    }
                }
                for (int i109 = 0; i109 < iMax2; i109++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] bArr4 = ((te.a) it2.next()).f50744b;
                        if (i109 < bArr4.length) {
                            aVar11.b(bArr4[i109], 8);
                        }
                    }
                }
                if (i65 != aVar11.e()) {
                    StringBuilder sbU = defpackage.e.u(i65, "Interleaving error: ", " and ");
                    sbU.append(aVar11.e());
                    sbU.append(" differ.");
                    throw new he.e(sbU.toString());
                }
                int i110 = (i106 * 4) + 17;
                a7.b bVar = new a7.b(i110, i110, 5);
                int i111 = bVar.f3416c;
                int i112 = bVar.f3415b;
                int i113 = Integer.MAX_VALUE;
                int i114 = 0;
                int i115 = -1;
                while (i114 < 8) {
                    te.b.b(aVar11, i11, bVarA, i114, bVar);
                    int iA = te.b.a(bVar, false) + te.b.a(bVar, true);
                    byte[][] bArr5 = (byte[][]) bVar.f3417d;
                    int i116 = 0;
                    int i117 = 0;
                    while (i116 < i111 - 1) {
                        byte[] bArr6 = bArr5[i116];
                        int i118 = i117;
                        int i119 = 0;
                        while (i119 < i112 - 1) {
                            byte b10 = bArr6[i119];
                            int i120 = i119 + 1;
                            int i121 = i116;
                            if (b10 == bArr6[i120]) {
                                byte[] bArr7 = bArr5[i121 + 1];
                                if (b10 == bArr7[i119] && b10 == bArr7[i120]) {
                                    i118++;
                                }
                            }
                            i119 = i120;
                            i116 = i121;
                        }
                        i116++;
                        i117 = i118;
                    }
                    int i122 = (i117 * 3) + iA;
                    int i123 = 0;
                    int i124 = 0;
                    while (i123 < i111) {
                        int i125 = 0;
                        while (i125 < i112) {
                            byte[] bArr8 = bArr5[i123];
                            int i126 = i125 + 6;
                            int i127 = i124;
                            if (i126 < i112) {
                                i15 = i114;
                                byte b11 = 1;
                                if (bArr8[i125] == 1 && bArr8[i125 + 1] == 0 && bArr8[i125 + 2] == 1 && bArr8[i125 + 3] == 1 && bArr8[i125 + 4] == 1 && bArr8[i125 + 5] == 0 && bArr8[i126] == 1) {
                                    int iMax3 = Math.max(i125 - 4, 0);
                                    int iMin = Math.min(i125, bArr8.length);
                                    while (true) {
                                        if (iMax3 < iMin) {
                                            int i128 = iMax3;
                                            if (bArr8[i128] == b11) {
                                                z12 = false;
                                            } else {
                                                iMax3 = i128 + 1;
                                                b11 = 1;
                                            }
                                        } else {
                                            z12 = true;
                                        }
                                    }
                                    if (!z12) {
                                        int iMax4 = Math.max(i125 + 7, 0);
                                        int iMin2 = Math.min(i125 + 11, bArr8.length);
                                        while (true) {
                                            if (iMax4 < iMin2) {
                                                int i129 = iMax4;
                                                if (bArr8[iMax4] == 1) {
                                                    z13 = false;
                                                } else {
                                                    iMax4 = i129 + 1;
                                                }
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                        if (z13) {
                                        }
                                    }
                                    i124 = i127 + 1;
                                }
                                i16 = i123 + 6;
                                if (i16 < i111) {
                                    byte b12 = 1;
                                    if (bArr5[i123][i125] != 1 && bArr5[i123 + 1][i125] == 0 && bArr5[i123 + 2][i125] == 1 && bArr5[i123 + 3][i125] == 1 && bArr5[i123 + 4][i125] == 1 && bArr5[i123 + 5][i125] == 0 && bArr5[i16][i125] == 1) {
                                        int iMax5 = Math.max(i123 - 4, 0);
                                        int iMin3 = Math.min(i123, bArr5.length);
                                        while (true) {
                                            if (iMax5 < iMin3) {
                                                i17 = i123;
                                                if (bArr5[iMax5][i125] == b12) {
                                                    z10 = false;
                                                } else {
                                                    iMax5++;
                                                    i123 = i17;
                                                    b12 = 1;
                                                }
                                            } else {
                                                i17 = i123;
                                                z10 = true;
                                            }
                                        }
                                        if (z10) {
                                            i124++;
                                        } else {
                                            int iMax6 = Math.max(i17 + 7, 0);
                                            int iMin4 = Math.min(i17 + 11, bArr5.length);
                                            while (true) {
                                                if (iMax6 >= iMin4) {
                                                    z11 = true;
                                                } else if (bArr5[iMax6][i125] == 1) {
                                                    z11 = false;
                                                } else {
                                                    iMax6++;
                                                }
                                            }
                                            if (z11) {
                                                i124++;
                                            }
                                        }
                                    } else {
                                        i17 = i123;
                                    }
                                } else {
                                    i17 = i123;
                                }
                                i125++;
                                i114 = i15;
                                i123 = i17;
                            } else {
                                i15 = i114;
                            }
                            i124 = i127;
                            i16 = i123 + 6;
                            if (i16 < i111) {
                                byte b13 = 1;
                                if (bArr5[i123][i125] != 1) {
                                    i17 = i123;
                                } else {
                                    i17 = i123;
                                }
                            } else {
                                i17 = i123;
                            }
                            i125++;
                            i114 = i15;
                            i123 = i17;
                        }
                        i123++;
                    }
                    int i130 = i114;
                    int i131 = (i124 * 40) + i122;
                    int i132 = 0;
                    for (int i133 = 0; i133 < i111; i133++) {
                        byte[] bArr9 = bArr5[i133];
                        for (int i134 = 0; i134 < i112; i134++) {
                            if (bArr9[i134] == 1) {
                                i132++;
                            }
                        }
                    }
                    int i135 = i111 * i112;
                    int iAbs = (((Math.abs((i132 << 1) - i135) * 10) / i135) * 10) + i131;
                    if (iAbs < i113) {
                        i113 = iAbs;
                        i115 = i130;
                    }
                    i114 = i130 + 1;
                }
                te.b.b(aVar11, i11, bVarA, i115, bVar);
                int i136 = i107 << 1;
                int i137 = i112 + i136;
                int i138 = i136 + i111;
                int iMax7 = Math.max(200, i137);
                int iMax8 = Math.max(200, i138);
                int iMin5 = Math.min(iMax7 / i137, iMax8 / i138);
                int i139 = (iMax7 - (i112 * iMin5)) / 2;
                int i140 = (iMax8 - (i111 * iMin5)) / 2;
                ke.b bVar2 = new ke.b(iMax7, iMax8);
                int i141 = 0;
                while (i141 < i111) {
                    int i142 = i139;
                    int i143 = 0;
                    while (i143 < i112) {
                        if (bVar.b(i143, i141) == 1) {
                            bVar2.c(i142, i140, iMin5, iMin5);
                        }
                        i143++;
                        i142 += iMin5;
                    }
                    i141++;
                    i140 += iMin5;
                }
                return bVar2;
        }
    }

    @Override // j2.p
    public Object j(Uri uri, n1.j jVar) {
        return Long.valueOf(l1.y.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // t9.c
    public t0 k(Context context, String str, t9.b bVar) {
        int iA;
        switch (this.f46712a) {
            case 19:
                t0 t0Var = new t0();
                int iD = bVar.d(context, str);
                t0Var.f20103a = iD;
                if (iD != 0) {
                    t0Var.f20105c = -1;
                } else {
                    int iA2 = bVar.a(context, str, true);
                    t0Var.f20104b = iA2;
                    if (iA2 != 0) {
                        t0Var.f20105c = 1;
                    }
                }
                return t0Var;
            default:
                t0 t0Var2 = new t0();
                int iD2 = bVar.d(context, str);
                t0Var2.f20103a = iD2;
                int i10 = 1;
                int i11 = 0;
                if (iD2 != 0) {
                    iA = bVar.a(context, str, false);
                    t0Var2.f20104b = iA;
                } else {
                    iA = bVar.a(context, str, true);
                    t0Var2.f20104b = iA;
                }
                int i12 = t0Var2.f20103a;
                if (i12 == 0) {
                    if (iA == 0) {
                        i10 = 0;
                    }
                    t0Var2.f20105c = i10;
                    return t0Var2;
                }
                i11 = i12;
                if (i11 >= iA) {
                    i10 = -1;
                }
                t0Var2.f20105c = i10;
                return t0Var2;
        }
    }

    public String l(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int n(char c4, StringBuilder sb2) {
        if (c4 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c4 >= '0' && c4 <= '9') {
            sb2.append((char) (c4 - ','));
            return 1;
        }
        if (c4 >= 'A' && c4 <= 'Z') {
            sb2.append((char) (c4 - '3'));
            return 1;
        }
        if (c4 < ' ') {
            sb2.append((char) 0);
            sb2.append(c4);
            return 2;
        }
        if (c4 >= '!' && c4 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c4 - '!'));
            return 2;
        }
        if (c4 >= ':' && c4 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c4 - '+'));
            return 2;
        }
        if (c4 >= '[' && c4 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c4 - 'E'));
            return 2;
        }
        if (c4 < '`' || c4 > 127) {
            sb2.append("\u0001\u001e");
            return n((char) (c4 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c4 - '`'));
        return 2;
    }

    @Override // ne.d
    public void o(b0.n nVar) {
        StringBuilder sb2 = new StringBuilder();
        while (nVar.b()) {
            char cA = nVar.a();
            nVar.f5154b++;
            int iN = n(cA, sb2);
            int length = ((StringBuilder) nVar.f5158f).length() + ((sb2.length() / 3) << 1);
            nVar.d(length);
            int i10 = ((f) nVar.f5159g).f46721b - length;
            if (!nVar.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i10 < 2 || i10 > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - iN, length2);
                    nVar.f5154b--;
                    iN = n(nVar.a(), sb3);
                    nVar.f5159g = null;
                }
                while (sb2.length() % 3 == 1 && ((iN <= 3 && i10 != 1) || iN > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - iN, length3);
                    nVar.f5154b--;
                    iN = n(nVar.a(), sb3);
                    nVar.f5159g = null;
                }
                break;
            }
            if (sb2.length() % 3 == 0 && r9.b.v(nVar.f5153a, nVar.f5154b, p()) != p()) {
                nVar.f5155c = 0;
                break;
            }
        }
        q(nVar, sb2);
    }

    public int p() {
        return 1;
    }

    public void q(b0.n nVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = ((StringBuilder) nVar.f5158f).length() + length;
        nVar.d(length3);
        int i10 = ((f) nVar.f5159g).f46721b - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                x(nVar, sb2);
            }
            if (nVar.b()) {
                nVar.e((char) 254);
            }
        } else if (i10 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                x(nVar, sb2);
            }
            if (nVar.b()) {
                nVar.e((char) 254);
            }
            nVar.f5154b--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                x(nVar, sb2);
            }
            if (i10 > 0 || nVar.b()) {
                nVar.e((char) 254);
            }
        }
        nVar.f5155c = 0;
    }

    public void r(g0 g0Var, int i10, String tag, String string) {
        n.f(tag, "tag");
        n.f(string, "string");
        if (s.i(g0Var)) {
            synchronized (this) {
                for (Map.Entry entry : x.f48793d.entrySet()) {
                    string = an.p.n0(string, (String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (!an.p.p0(tag, "FacebookSDK.", false)) {
                tag = "FacebookSDK.".concat(tag);
            }
            Log.println(i10, tag, string);
            if (g0Var == g0.f45137e) {
                new Exception().printStackTrace();
            }
        }
    }

    public void s(g0 g0Var, String tag, String string) {
        n.f(tag, "tag");
        n.f(string, "string");
        r(g0Var, 3, tag, string);
    }

    public void t(g0 g0Var, String tag, String str, Object... objArr) {
        n.f(tag, "tag");
        if (s.i(g0Var)) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            r(g0Var, 3, tag, String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        }
    }

    public synchronized void u(String accessToken) {
        n.f(accessToken, "accessToken");
        if (!s.i(g0.f45134b)) {
            synchronized (this) {
                x.f48793d.put(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public a(n.j jVar) {
        this.f46712a = 3;
    }

    public a(s1 s1Var, h1 h1Var) {
        this.f46712a = 17;
    }

    @Override // t6.d
    public void b(t6.f fVar) {
    }
}
