package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2045nd implements C1D {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", ay.u, "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C1L A02;
    public final C1Y A04;
    public final AnonymousClass85 A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C1N A03 = new C1N();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE 
  (r10v1 ?? I:com.facebook.ads.redexgen.X.1Y)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.1J)
 INTERFACE call: com.facebook.ads.redexgen.X.1Y.AGc(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void (m)], block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE 
  (r10v0 ?? I:com.facebook.ads.redexgen.X.1Y)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.1J)
 INTERFACE call: com.facebook.ads.redexgen.X.1Y.AGc(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void (m)], block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C1J c1j, String str, String str2, int i, C1M c1m) throws Exception {
        C1J c1j2;
        String strAGc;
        C1J c1j3;
        String strAGc2;
        String strA03 = A03(EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 17);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C2039nW c2039nW = new C2039nW(file, new NP(C05789m.A0Q(this.A05)));
            if (c2039nW.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c2039nW.A00.getName();
                }
                this.A06.put(str3, file);
                c2039nW.A06();
                this.A04.AGd(str3, true, c1j);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c2039nW.A00.getName();
            }
            if (!c1m.A04()) {
                return null;
            }
            this.A04.AGd(str3, false, c1j);
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    AnonymousClass85 anonymousClass85 = this.A05;
                    if (A0A[3].charAt(31) != '9') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                    strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                    str3 = str3;
                    try {
                        A05(anonymousClass85, c2039nW, str3, i, i2, jCurrentTimeMillis);
                        break;
                    } catch (C1U e) {
                        e = e;
                        if (i2 == this.A00 - 1) {
                            A06(c2039nW);
                            if (e instanceof C2040nX) {
                                throw ((C2040nX) e);
                            }
                            if (e instanceof C2035nS) {
                                throw ((C2035nS) e);
                            }
                        }
                    }
                } catch (C1U e2) {
                    e = e2;
                }
            }
            int iA03 = c2039nW.A03();
            c2039nW.A06();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c1m.A00().A53(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AGc(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), c1j);
            return file;
        } catch (C2035nS e3) {
            this.A04.AGc(strAGc2, 2113, e3.toString(), null, null, c1j3);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e3);
            return null;
        } catch (C2040nX e4) {
            this.A04.AGc(strAGc, 2119, e4.toString(), null, null, c1j2);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e4);
            return null;
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, -128, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, cw.l, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, cw.n, 19, 23, cw.k, 18, 11, -60, 23, 19, 25, 22, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, cw.m, 18, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C2045nd.class.getSimpleName();
    }

    public C2045nd(AnonymousClass85 anonymousClass85, C1L c1l, C1Y c1y) {
        this.A05 = anonymousClass85;
        this.A08 = c1l.A02();
        this.A00 = c1l.A00();
        this.A04 = c1y;
        this.A01 = c1l.A01();
        this.A02 = c1l;
    }

    public static C2042na A00(Context context, String str) throws C1U {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return new C2042na(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e) {
            throw new C1U(A03(131, 18, 78), e);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[Catch: 1U -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {1U -> 0x015f, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:109:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    private void A05(Context context, C2039nW c2039nW, String str, int i, int i2, long j) throws Exception {
        C1X c2038nV;
        int iA06;
        int iA07;
        String[] strArr;
        String strA03 = A03(263, 20, 114);
        String strA04 = A03(342, 22, 27);
        if (str.startsWith(strA04)) {
            String localUrl = str.substring(strA04.length());
            c2038nV = A00(context, localUrl);
        } else {
            String strA05 = A03(333, 9, 59);
            if (str.startsWith(strA05)) {
                String localUrl2 = str.substring(strA05.length());
                c2038nV = A00(context, localUrl2);
            } else {
                c2038nV = new C2038nV(str, i);
            }
        }
        try {
            if (this.A08) {
                try {
                    try {
                        String str2 = A03(303, 15, 124) + str + A03(38, 11, 108) + i2;
                    } catch (C1U e) {
                        e = e;
                        iA06 = 0;
                        try {
                            if (c2038nV instanceof C2038nV) {
                                try {
                                    iA06 = ((C2038nV) c2038nV).A06();
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        c2038nV.close();
                                    } catch (C1U | IllegalArgumentException e2) {
                                        if (this.A08) {
                                            Log.e(A0B, strA03, e2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            try {
                                this.A05.A08().ABD(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                c2038nV.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (A0A[4].charAt(27) == 'R') {
                                A0A[3] = "p8aYiN6IujE52Q2p9R2WzRwMj4wd2wO9";
                            }
                            throw new RuntimeException();
                        }
                    }
                } catch (C1U e3) {
                    e = e3;
                    iA06 = 0;
                    if (c2038nV instanceof C2038nV) {
                        iA06 = ((C2038nV) c2038nV).A06();
                    }
                    this.A05.A08().ABD(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c2038nV.close();
                    throw th;
                }
            }
            int iA03 = c2039nW.A03();
            int length = c2038nV.length();
            boolean z = length < 0;
            if (A0A[3].charAt(31) == '9') {
                A0A[3] = "O2qol2VIPsSIkPIIN6kN5hssl2djupr9";
                if (z) {
                    boolean zA07 = A07(c2039nW);
                    if (this.A08) {
                        String str3 = A03(Input.Keys.NUMPAD_5, 21, 76) + str + A03(22, 16, 34) + zA07;
                    }
                }
                try {
                    try {
                        if (z || iA03 < length) {
                            c2038nV.AFr(iA03);
                            byte[] buffer = new byte[8192];
                            while (true) {
                                int i3 = c2038nV.read(buffer);
                                if (i3 == -1) {
                                    break;
                                } else {
                                    c2039nW.A08(buffer, i3);
                                }
                            }
                            if (!z || c2039nW.A03() == length) {
                                c2039nW.A07();
                                iA07 = 0;
                                if (c2038nV instanceof C2038nV) {
                                    iA07 = ((C2038nV) c2038nV).A06();
                                }
                                C8Z c8zA08 = this.A05.A08();
                                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                                long jA03 = c2039nW.A03();
                                strArr = A0A;
                                if (strArr[2].length() != strArr[5].length()) {
                                    A0A[0] = "LJMphR6GQubhlr";
                                } else {
                                    A0A[0] = "i3csCW72L1z7Bc";
                                }
                                c8zA08.ABD(j, jCurrentTimeMillis, jA03, 0L, iA07, null);
                                c2038nV.close();
                                return;
                            }
                            throw new C2040nX(A03(283, 20, 94));
                        }
                        c2038nV.close();
                        return;
                    } catch (C1U | IllegalArgumentException e4) {
                        if (this.A08) {
                            String str4 = A0B;
                            String[] strArr2 = A0A;
                            if (strArr2[2].length() != strArr2[5].length()) {
                                throw new RuntimeException();
                            }
                            A0A[1] = "AOKjIt2kEVzrEy7KBqss66";
                            Log.e(str4, strA03, e4);
                            return;
                        }
                        return;
                    }
                    if (!z) {
                        c2039nW.A07();
                    } else {
                        throw new C2040nX(A03(283, 20, 94));
                    }
                    iA07 = 0;
                    if (c2038nV instanceof C2038nV) {
                        iA07 = ((C2038nV) c2038nV).A06();
                    }
                    C8Z c8zA09 = this.A05.A08();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                    long jA04 = c2039nW.A03();
                    strArr = A0A;
                    if (strArr[2].length() != strArr[5].length()) {
                        A0A[0] = "LJMphR6GQubhlr";
                    } else {
                        A0A[0] = "i3csCW72L1z7Bc";
                    }
                    c8zA09.ABD(j, jCurrentTimeMillis2, jA04, 0L, iA07, null);
                } catch (C1U e5) {
                    e = e5;
                    iA06 = 0;
                    if (c2038nV instanceof C2038nV) {
                        iA06 = ((C2038nV) c2038nV).A06();
                    }
                    this.A05.A08().ABD(j, System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    c2038nV.close();
                    throw th;
                }
            }
            throw new RuntimeException();
        } catch (C1U e6) {
            e = e6;
            if (A0A[0].length() == 14) {
                String[] strArr3 = A0A;
                strArr3[2] = "7VHRmmesbfeDqucWLtEKLKcMBQJVNm";
                strArr3[5] = "oM47EpnTTF1S9ikTK6B0AzPGZuSKH0";
            }
        }
    }

    private void A06(C2039nW c2039nW) {
        try {
            File fileA04 = c2039nW.A04();
            if (fileA04.exists()) {
                c2039nW.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + zDelete);
                }
            }
        } catch (Exception e) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e);
            }
        }
    }

    private boolean A07(C2039nW c2039nW) {
        try {
            c2039nW.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C2035nS e) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C1F<T> A08(C1J c1j, C1M<T> c1m) {
        Semaphore semaphore;
        if (c1m.A03()) {
            File file = this.A06.get(c1j.A09);
            if (file != null) {
                this.A04.AGd(c1j.A09, true, c1j);
                return c1m.A00().A3n(file, this.A04);
            }
            this.A04.AGd(c1j.A09, false, c1j);
            return new C1F<>(false, null);
        }
        String str = c1j.A09;
        String str2 = c1j.A04;
        StringBuilder sb = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(c1j, str, extension, this.A01, c1m);
            if (fileA02 != null) {
                C1F<T> c1fA3n = c1m.A00().A3n(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return c1fA3n;
            }
            C1F<T> c1f = new C1F<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return c1f;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb2 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder sbAppend = sb2.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                sbAppend.append(baseUrl3).toString();
            }
            C1F<T> c1f2 = new C1F<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return c1f2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1D
    public final C1F<Bitmap> AHk(C1J c1j, boolean z) {
        return A08(c1j, new C1M(new C2048ng(c1j.A01, c1j.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.core.C1D
    public final File AHl(C1J c1j) {
        C1M c1m = new C1M(new C2047nf());
        c1m.A01(true);
        c1m.A02(false);
        return (File) A08(c1j, c1m).A00();
    }

    @Override // com.facebook.ads.redexgen.core.C1D
    public final String AHm(C1J c1j) {
        return (String) A08(c1j, new C1M(new C2046ne())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.C1D
    public final String AHn(C1J c1j) {
        C1M c1m = new C1M(new C2046ne());
        c1m.A01(true);
        c1m.A02(false);
        return (String) A08(c1j, c1m).A00();
    }
}
