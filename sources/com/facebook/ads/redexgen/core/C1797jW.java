package com.facebook.ads.redexgen.core;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1797jW implements C9C {
    public static PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"txu4RBo63YQ5Q7SoAp", "BY8ga9ljLbuWBmJa1ktUn6UmPorDtudq", "oIcH05TUMC1H4eRB0f575BffOzLV6s", "RDV9o0Xs0wR3bMJwiMoqv", "Drf", "fWBbnfM052TaJjbz2mNIhyXx2yjBcv", "vwrAcDNdoQtjOaT8FPnJSektvmYH0bUo", "A7bgPIcOUjT1m5u12vt0AimohlYQKPcw"};
    public static final EnumC03711i[] A06;
    public final C05257j A00;
    public final AnonymousClass85 A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A05[4].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "e8Iif6peCxlhmB6JTHauJ";
        strArr[0] = "U2Egyo0LhTV3FJWkcb";
        A04 = new byte[]{-98, -70, -85, -83, -83, -81, -67, -67, -77, -84, -77, -74, -77, -66, -61, -55, -81, -72, -85, -84, -74, -81, -82, -26, -13, -26, -15, -12, -20, -69, -54, -54, -39, -57, -61, -56, -39, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -38, -20, -31, -38, -20, -25, -7, -17, -22, -14, 5, 5, 3, -6, -13, 6, 5, -6, 0, -1, cw.n, -6, -11, -7, 0, -5, -5, -4, 9, 22, 11, 6, 2, -4, 5, 22, -4, cw.m, 11, 9, -8, 10, -124, -105, -112, -122, -114, -121, -25, -27, -25, -20, -23, -110, -112, -97, -97, -108, -109, -82, -104, -109, -94, -73, -75, -58, -58, -67, -71, -58, -95, -98, -79, -98, -68, -83, -81, -84, -96, -94, -80, -80, -90, -85, -92, -68, -84, -83, -79, -90, -84, -85, -80, -32, -35, -16, -35, -5, -20, -18, -21, -33, -31, -17, -17, -27, -22, -29, -5, -21, -20, -16, -27, -21, -22, -17, -5, -33, -21, -15, -22, -16, -18, -11, -120, -123, -104, -123, -93, -108, -106, -109, -121, -119, -105, -105, -115, -110, -117, -93, -109, -108, -104, -115, -109, -110, -105, -93, -105, -104, -123, -104, -119, -104, -103, -94, -89, -99, -88, -83, -69, -54, -61, -61, -70, -63, -44, -72, -60, -57, -70, -44, -70, -53, -70, -61, -55, -56, -41, -26, -33, -33, -42, -35, -16, -35, -32, -40, -40, -42, -43, -25, 2, 10, cw.k, 6, 5, -63, 21, cw.n, -63, 3, 22, 10, cw.k, 5, -63, 22, 20, 6, 19, -63, 21, cw.n, 12, 6, cw.m, -79, -86, -68, -56, -82, -63, -72, -71, -75, -86, -62, -82, -69, -95, -100, -98, -103, -6, -11, cw.n, -12, -14, -12, -7, -10, cw.n, 5, 4, cw.n, -2, 4, -57, -62, -35, -47, -51, -45, -48, -63, -61, -69, -64, -59, -58, -77, -66, -66, -73, -60, -21, -18, -30, -32, -21, -28, -103, -115, -105, -111, 1, -7, -8, -3, -11, 8, -3, 3, 2, 19, 7, -7, 6, 10, -3, -9, -7, -74, -83, -68, -65, -73, -70, -77, -57, -68, -63, -72, -83, -9, -21, -3, -12, -3, -5, 7, -3, -5, -19, -6, 7, -15, -20, -79, -82, -82, -77, -92, -93, -100, -100, -87, -115, -106, -109, -113, -104, -98, -87, -99, -114, -107, -87, -96, -113, -100, -99, -109, -103, -104, -74, -74, -61, -87, -68, -72, -74, -91, -73, 2, 2, cw.m, -7, 3, cw.m, -10, 2, -1, -3, cw.m, 3, -11, 2, 6, -7, -13, -11, -6, -6, 7, -5, -19, -6, -2, -15, -21, -19, 7, -5, -20, -13, 7, -2, -19, -6, -5, -15, -9, -10, -89, -87, -101, -76, -101, -105, -76, -106, -91, -91, -76, -98, -93, -88, -87, -106, -95, -95, -102, -103, -111, -109, -123, -98, -123, -127, -98, -128, -113, -113, -98, -107, -124, -111, -110, -120, -114, -115, -41, -57, -42, -55, -55, -46, -29, -52, -55, -51, -53, -52, -40, -108, -124, -109, -122, -122, -113, -96, -104, -118, -123, -107, -119, -17, -32, -25, -5, -33, -35, -20, -35, -34, -27, -24, -27, -16, -11, -10, -25, -18, 2, -16, -28, -15, -28, -22, -24, -25, 2, -26, -28, -26, -21, -24, -27, -41, -27, -27, -37, -31, -32, -15, -26, -37, -33, -41, -63, -70, -75, -64, -59, -7, -9, -23, -10, 3, -27, -21, -23, -14, -8, 18, -3, 8, 12, -3, cw.l, -3, 9, cw.m, -81, -74, -83, -83};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010c A[Catch: IOException -> 0x0114, TryCatch #2 {IOException -> 0x0114, blocks: (B:28:0x0107, B:30:0x010c, B:32:0x0111), top: B:40:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111 A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #2 {IOException -> 0x0114, blocks: (B:28:0x0107, B:30:0x010c, B:32:0x0111), top: B:40:0x0107 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A04(C9A c9a) {
        AnonymousClass98.A08(this.A01, true, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map mapA05 = A05();
                if (TextUtils.isEmpty(C7V.A00().A03())) {
                    C7V.A07(this.A01);
                }
                mapA05.put(A01(278, 4, 25), C7V.A00().A03());
                mapA05.put(A01(554, 10, 101), C9G.A06(new C05528l(this.A01), this.A01, false));
                if (C05789m.A1u(this.A01)) {
                    mapA05.put(A01(101, 10, 16), C2A.A01(this.A01).A0K());
                }
                Iterator it = mapA05.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c9a.A30((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA05).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 85), A01(0, 0, 46));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (Throwable th) {
                if (A05[4].length() != 3) {
                    throw new RuntimeException();
                }
                A05[1] = "YYekAclIzhra9Pv39zprUDIkOoogCrwo";
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                        if (base64OutputStream != null) {
                            base64OutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (IOException unused2) {
                        throw th;
                    }
                } else {
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(A01(239, 26, 98), e);
        }
    }

    public final /* synthetic */ Map A05() {
        return AnonymousClass99.A00(this);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x050d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0525  */
    /* JADX WARN: Code duplicated, block: B:105:0x053d  */
    /* JADX WARN: Code duplicated, block: B:108:0x054d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0402 A[EDGE_INSN: B:111:0x0402->B:70:0x0402 BREAK  A[LOOP:0: B:57:0x0396->B:62:0x03b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x030b  */
    /* JADX WARN: Code duplicated, block: B:59:0x039a  */
    /* JADX WARN: Code duplicated, block: B:61:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x042e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0442  */
    /* JADX WARN: Code duplicated, block: B:78:0x0455  */
    /* JADX WARN: Code duplicated, block: B:80:0x0463  */
    /* JADX WARN: Code duplicated, block: B:82:0x047c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0495  */
    /* JADX WARN: Code duplicated, block: B:87:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x04ba  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.C9C
    public final Map<String, String> A7o(AnonymousClass90 anonymousClass90) {
        String strA01;
        String strA02;
        String strA03;
        String strA04;
        StringBuilder sb;
        EnumC03711i[] enumC03711iArr;
        int i;
        PackageInfo packageInfoA00;
        Map<String, String> mapA02;
        String strA05;
        String strA06;
        String strA07;
        boolean zAAV;
        C8M c8mA07;
        String[] strArr;
        String strA7x;
        String strA6z = anonymousClass90 != null ? anonymousClass90.A6z() : null;
        String packageName = strA6z != null ? strA6z : this.A01.getPackageName();
        AnonymousClass98.A08(this.A01, ProcessUtils.isRemoteRenderingProcess() ? true : C05789m.A0m(this.A01), strA6z);
        C05518k.A0B(this.A01);
        C05518k.A08(this.A01);
        HashMap map = new HashMap();
        AnonymousClass95.A03(this.A01, map, strA6z);
        map.put(A01(314, 6, 96), Locale.getDefault().toString());
        float f = CP.A02;
        int i2 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i3 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A01(201, 7, 21), String.valueOf(f));
        map.put(A01(494, 12, 2), String.valueOf((int) (i2 / f)));
        map.put(A01(481, 13, 69), String.valueOf((int) (i3 / f)));
        map.put(A01(57, 14, 114), C7V.A03());
        map.put(A01(296, 9, 63), C7V.A00().A02().name());
        map.put(A01(282, 14, 114), String.valueOf(C7V.A00().A01()));
        C05528l c05528l = new C05528l(this.A01, strA6z);
        map.put(A01(90, 6, 3), C9G.A03(this.A01, c05528l));
        map.put(A01(111, 7, 53), c05528l.A08());
        map.put(A01(EnumC4719u30.WEBVIEW_ERROR_VALUE, 4, 13), c05528l.A09());
        map.put(A01(367, 6, 32), String.valueOf(AnonymousClass98.A00(this.A01).A00));
        map.put(A01(305, 9, 51), c05528l.A0B());
        map.put(A01(506, 14, 93), C9.A01());
        map.put(A01(341, 12, 41), String.valueOf(AbstractC0644Cs.A00(this.A01).A00));
        map.put(A01(537, 12, 83), C0646Cu.A03(this.A01.A09().A01()));
        AnonymousClass98.A06(this.A01, packageName, map);
        String strA08 = CN.A03(this.A01, packageName);
        if (strA08 != null) {
            map.put(A01(48, 5, 90), strA08);
        }
        String strA09 = A01(549, 5, 45);
        if (anonymousClass90 != null && anonymousClass90.AAZ() != null) {
            Boolean boolAAZ = anonymousClass90.AAZ();
            String[] strArr2 = A05;
            if (strArr2[7].charAt(0) != strArr2[6].charAt(0)) {
                String[] strArr3 = A05;
                strArr3[5] = "32RBgLNf778xvD9weLhwI46Snl5hrv";
                strArr3[2] = "IyuqHiwE4txdUinr9J2yO2mEn55tsE";
                map.put(strA09, String.valueOf(boolAAZ));
            }
            throw new RuntimeException();
        }
        map.put(strA09, String.valueOf(CQ.A05(this.A01)));
        String strA8L = (anonymousClass90 == null || anonymousClass90.A8M() == null) ? this.A01.A05().A8L() : anonymousClass90.A8M();
        if (strA8L != null) {
            String[] strArr4 = A05;
            if (strArr4[7].charAt(0) != strArr4[6].charAt(0)) {
                String[] strArr5 = A05;
                strArr5[5] = "lzJ4Ecl31LKhf9GNtdySIIM2KCn5d6";
                strArr5[2] = "MfUCKgpZ3l00IXdOSEBXHLe94uIrQG";
                map.put(A01(324, 17, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), strA8L);
            } else {
                map.put(A01(324, 17, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), strA8L);
            }
        }
        map.put(A01(2, 21, 43), String.valueOf(c05528l.A0C()));
        if (c05528l.A03() != -1) {
            map.put(A01(29, 19, 59), String.valueOf(c05528l.A03()));
        }
        map.put(A01(564, 9, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), AnonymousClass91.A05(this.A01, packageName));
        map.put(A01(23, 6, 102), CV.A01(C05518k.A02()));
        if (AbstractC05779l.A05(this.A01) && (strA7x = this.A01.A05().A7x()) != null) {
            map.put(A01(53, 4, 103), strA7x);
        }
        String strA8S = this.A01.A05().A8S();
        if (!TextUtils.isEmpty(strA8S)) {
            map.put(A01(353, 14, 105), strA8S);
        }
        C8J c8jA7a = null;
        if (anonymousClass90 == null) {
            if (c8jA7a == null) {
                c8mA07 = this.A01.A07();
                strArr = A05;
                if (strArr[3].length() != strArr[0].length()) {
                    String[] strArr6 = A05;
                    strArr6[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr6[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c8jA7a = c8mA07.A7a();
                }
            }
            strA01 = A01(172, 29, 5);
            strA02 = A01(Input.Keys.F11, 31, 93);
            strA03 = A01(EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 23, 30);
            if (c8jA7a != null) {
                map.put(strA03, c8jA7a.A08());
                map.put(strA02, String.valueOf(c8jA7a.A05()));
                map.put(strA01, String.valueOf(c8jA7a.A06()));
            } else {
                String strA010 = A01(573, 4, 2);
                map.put(strA03, strA010);
                map.put(strA02, strA010);
                map.put(strA01, strA010);
            }
            map.put(A01(101, 10, 16), C2A.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null) {
                map.put(A01(71, 19, 120), strA04);
            }
            map.put(A01(265, 13, 42), String.valueOf(this.A01.A04().A9c()));
            map.put(A01(226, 13, 82), String.valueOf(C8U.A0H(this.A01)));
            sb = new StringBuilder();
            enumC03711iArr = A06;
            i = 0;
            while (true) {
                if (i < enumC03711iArr.length) {
                    break;
                    break;
                }
                sb.append(enumC03711iArr[i].A03() + 4000);
                if (i != enumC03711iArr.length - 1) {
                    sb.append(A01(1, 1, 79));
                }
                i++;
            }
            map.put(A01(EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, 18, 54), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(443, 20, 22), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(463, 18, 0), String.valueOf(packageInfoA00.versionCode));
            }
            if (anonymousClass90 != null) {
                zAAV = anonymousClass90.AAV();
                if (A05[1].charAt(25) != 'o') {
                    String[] strArr7 = A05;
                    strArr7[7] = "inhOgc4FARMiG9OeOma42yd4Zw66nzWU";
                    strArr7[6] = "hLpLkv5ZkeLP8Nx8FR5P0NkpI1zrR6LC";
                    if (zAAV) {
                        map.put(A01(403, 18, 113), Boolean.TRUE.toString());
                        if (anonymousClass90.A7D() != null) {
                            map.put(A01(373, 21, 11), anonymousClass90.A7D());
                        }
                    }
                } else {
                    String[] strArr8 = A05;
                    strArr8[5] = "U30r1W401qlH7SB9R1I9aS2Ug2nIXm";
                    strArr8[2] = "M1qKCNLEAk1dKbuDQGvfG5gBfjM6hm";
                    if (zAAV) {
                        map.put(A01(403, 18, 113), Boolean.TRUE.toString());
                        if (anonymousClass90.A7D() != null) {
                            map.put(A01(373, 21, 11), anonymousClass90.A7D());
                        }
                    }
                }
            }
            if (AbstractC05819p.A07(this.A01)) {
                strA06 = AnonymousClass92.A02(this.A01.A02());
                if (strA06 != null) {
                    map.put(A01(TypedValues.CycleType.TYPE_WAVE_SHAPE, 22, 105), strA06);
                }
                strA07 = AnonymousClass92.A01(this.A01.A02());
                if (strA06 != null) {
                    map.put(A01(394, 9, 37), strA07);
                }
            }
            if (C05789m.A0w(this.A01)) {
                map.put(A01(96, 5, 101), strA05);
            }
            if (C05789m.A0x(this.A01)) {
                if (A05[4].length() != 3) {
                    String[] strArr9 = A05;
                    strArr9[3] = "7mVmErbGRyzhCcpOkogzT";
                    strArr9[0] = "GxggXk4A6DJke1qe5h";
                    map.put(A01(520, 17, 100), CV.A01(mapA02));
                } else {
                    String[] strArr10 = A05;
                    strArr10[7] = "CWQ3pJLT9KktQZtEqCB7QodFowscHy6b";
                    strArr10[6] = "JiMTUCC0GBJ7xNqWR2QBxq9gThZrGoNd";
                    map.put(A01(520, 17, 100), CV.A01(mapA02));
                }
            }
            return map;
        }
        AnonymousClass85 anonymousClass85 = this.A01;
        String[] strArr11 = A05;
        if (strArr11[7].charAt(0) != strArr11[6].charAt(0)) {
            String[] strArr12 = A05;
            strArr12[3] = "QL1vZoGO1wQ14zpGXE2Sg";
            strArr12[0] = "5V9s84iDx7Ocfd5gsL";
            c8jA7a = anonymousClass90.A7c(anonymousClass85);
            if (c8jA7a == null) {
                c8mA07 = this.A01.A07();
                strArr = A05;
                if (strArr[3].length() != strArr[0].length()) {
                    String[] strArr13 = A05;
                    strArr13[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr13[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c8jA7a = c8mA07.A7a();
                }
            }
            strA01 = A01(172, 29, 5);
            strA02 = A01(Input.Keys.F11, 31, 93);
            strA03 = A01(EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 23, 30);
            if (c8jA7a != null) {
                map.put(strA03, c8jA7a.A08());
                map.put(strA02, String.valueOf(c8jA7a.A05()));
                map.put(strA01, String.valueOf(c8jA7a.A06()));
            } else {
                String strA011 = A01(573, 4, 2);
                map.put(strA03, strA011);
                map.put(strA02, strA011);
                map.put(strA01, strA011);
            }
            map.put(A01(101, 10, 16), C2A.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null && !TextUtils.isEmpty(strA04)) {
                map.put(A01(71, 19, 120), strA04);
            }
            map.put(A01(265, 13, 42), String.valueOf(this.A01.A04().A9c()));
            map.put(A01(226, 13, 82), String.valueOf(C8U.A0H(this.A01)));
            sb = new StringBuilder();
            enumC03711iArr = A06;
            i = 0;
            while (true) {
                if (i < enumC03711iArr.length) {
                    break;
                }
                sb.append(enumC03711iArr[i].A03() + 4000);
                if (i != enumC03711iArr.length - 1) {
                    sb.append(A01(1, 1, 79));
                }
                i++;
            }
            map.put(A01(EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, 18, 54), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(443, 20, 22), String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(463, 18, 0), String.valueOf(packageInfoA00.versionCode));
            }
            if (anonymousClass90 != null) {
                zAAV = anonymousClass90.AAV();
                if (A05[1].charAt(25) != 'o') {
                    String[] strArr14 = A05;
                    strArr14[7] = "inhOgc4FARMiG9OeOma42yd4Zw66nzWU";
                    strArr14[6] = "hLpLkv5ZkeLP8Nx8FR5P0NkpI1zrR6LC";
                    if (zAAV) {
                        map.put(A01(403, 18, 113), Boolean.TRUE.toString());
                        if (anonymousClass90.A7D() != null) {
                            map.put(A01(373, 21, 11), anonymousClass90.A7D());
                        }
                    }
                } else {
                    String[] strArr15 = A05;
                    strArr15[5] = "U30r1W401qlH7SB9R1I9aS2Ug2nIXm";
                    strArr15[2] = "M1qKCNLEAk1dKbuDQGvfG5gBfjM6hm";
                    if (zAAV) {
                        map.put(A01(403, 18, 113), Boolean.TRUE.toString());
                        if (anonymousClass90.A7D() != null) {
                            map.put(A01(373, 21, 11), anonymousClass90.A7D());
                        }
                    }
                }
            }
            if (AbstractC05819p.A07(this.A01)) {
                strA06 = AnonymousClass92.A02(this.A01.A02());
                if (strA06 != null) {
                    map.put(A01(TypedValues.CycleType.TYPE_WAVE_SHAPE, 22, 105), strA06);
                }
                strA07 = AnonymousClass92.A01(this.A01.A02());
                if (strA06 != null) {
                    map.put(A01(394, 9, 37), strA07);
                }
            }
            if (C05789m.A0w(this.A01) && (strA05 = AnonymousClass93.A01(this.A01.A02())) != null) {
                map.put(A01(96, 5, 101), strA05);
            }
            if (C05789m.A0x(this.A01) && (mapA02 = AnonymousClass93.A02(this.A01.A02())) != null) {
                if (A05[4].length() != 3) {
                    String[] strArr16 = A05;
                    strArr16[3] = "7mVmErbGRyzhCcpOkogzT";
                    strArr16[0] = "GxggXk4A6DJke1qe5h";
                    map.put(A01(520, 17, 100), CV.A01(mapA02));
                } else {
                    String[] strArr17 = A05;
                    strArr17[7] = "CWQ3pJLT9KktQZtEqCB7QodFowscHy6b";
                    strArr17[6] = "JiMTUCC0GBJ7xNqWR2QBxq9gThZrGoNd";
                    map.put(A01(520, 17, 100), CV.A01(mapA02));
                }
            }
            return map;
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A03 = false;
        A06 = new EnumC03711i[]{EnumC03711i.A16, EnumC03711i.A0k, EnumC03711i.A17, EnumC03711i.A1F, EnumC03711i.A11, EnumC03711i.A13, EnumC03711i.A2O, EnumC03711i.A2P, EnumC03711i.A2Q};
    }

    public C1797jW(AnonymousClass85 anonymousClass85, boolean z, C05257j c05257j) {
        this.A01 = anonymousClass85;
        this.A00 = c05257j;
        AnonymousClass98.A08(anonymousClass85, z, null);
    }

    public static synchronized PackageInfo A00(AnonymousClass85 anonymousClass85) {
        if (!A03) {
            A02 = AbstractC0626Ca.A00(anonymousClass85);
            A03 = true;
        }
        return A02;
    }

    public final String A03() {
        return A04(C9B.A00());
    }
}
