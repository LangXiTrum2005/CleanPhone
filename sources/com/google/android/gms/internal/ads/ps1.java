package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ps1 implements p2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ei f18798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ei f18799g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qd0 f18801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qd0 f18802j;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f18811t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f18794b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f18795c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f18796d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final pb f18797e = new pb(4, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qd0 f18800h = new qd0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final qd0 f18803k = new qd0(24);
    public static final lr0 l = new lr0(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lr0 f18804m = new lr0(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lr0 f18805n = new lr0(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lr0 f18806o = new lr0(21);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f18807p = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f18808q = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f18809r = {67108863, 33554431};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f18810s = {26, 25};

    static {
        int i10 = 12;
        f18798f = new ei(i10);
        int i11 = 18;
        f18799g = new ei(i11);
        f18801i = new qd0(i10);
        f18802j = new qd0(i11);
    }

    public /* synthetic */ ps1(int i10) {
        this.f18812a = i10;
    }

    public static void A(int i10, Object obj) {
        if (obj == null) {
            throw new NullPointerException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 9), "at index ", i10));
        }
    }

    public static void B(ListenableFuture listenableFuture, fw0 fw0Var) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            vd1 vd1VarR = vd1.r(listenableFuture);
            at0 at0Var = new at0(fw0Var, 3);
            vd1VarR.addListener(new zd1(0, vd1VarR, at0Var), l00.f16615h);
        }
    }

    public static void C(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void D(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static byte[] F(String str, boolean z10) {
        pb1 pb1Var;
        if (z10) {
            pb1Var = rb1.f19514e;
            if (pb1Var.f19517b != null) {
                pb1Var = new pb1(pb1Var.f19516a, (Character) null);
            }
        } else {
            pb1Var = rb1.f19513d;
        }
        byte[] bArrH = pb1Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    public static String[] G(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        while (i10 < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i10);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z11) {
                        arrayList.add(new String(charArray, i11, i10 - i11));
                    }
                    arrayList.add(new String(charArray, i10, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z11) {
                            i11 = i10;
                        }
                    } else if (z10 && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z11) {
                            i11 = i10;
                        }
                    } else if (z11) {
                        arrayList.add(new String(charArray, i11, i10 - i11));
                    }
                    z11 = true;
                }
                z11 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z11) {
                        i11 = i10;
                    }
                } else if (true != z11) {
                    i11 = i10;
                }
                z11 = true;
            }
            i10 += iCharCount;
        }
        if (z11) {
            arrayList.add(new String(charArray, i11, i10 - i11));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static final ResolveInfo H(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th2) {
            zzt.zzh().d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th2);
            return resolveInfo;
        }
    }

    public static md0 I(np0 np0Var) {
        np0Var.G(1);
        int iO = np0Var.O();
        long j10 = np0Var.f17881b;
        long j11 = iO;
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jD = np0Var.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jD;
            jArrCopyOf2[i11] = np0Var.d();
            np0Var.G(2);
        }
        np0Var.G((int) ((j10 + j11) - ((long) np0Var.f17881b)));
        return new md0(3, jArrCopyOf, jArrCopyOf2);
    }

    public static ya1 J(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (dv.t(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strX = dv.x(xmlPullParser, strConcat2);
                String strX2 = dv.x(xmlPullParser, strConcat3);
                String strX3 = dv.x(xmlPullParser, strConcat4);
                String strX4 = dv.x(xmlPullParser, strConcat5);
                if (strX == null || strX2 == null) {
                    return ya1.f22208e;
                }
                j4 j4Var = new j4(strX, strX3 != null ? Long.parseLong(strX3) : 0L, strX4 != null ? Long.parseLong(strX4) : 0L);
                int length = objArrCopyOf.length;
                int i11 = i10 + 1;
                int iD = x91.d(length, i11);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i10] = j4Var;
                i10 = i11;
            }
        } while (!dv.k(xmlPullParser, str.concat(":Directory")));
        return ca1.A(i10, objArrCopyOf);
    }

    public static void K(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        O(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static final Intent L(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static c5 M(int i10, String str, np0 np0Var) {
        int iB = np0Var.b();
        if (np0Var.b() == 1684108385) {
            np0Var.G(8);
            return new c5(str, null, ca1.u(np0Var.l(iB - 16)));
        }
        v71.y("MetadataUtil", "Failed to parse text attribute: ".concat(z01.e(i10)));
        return null;
    }

    public static void N(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(dv.B(str, Integer.valueOf(i10)));
        }
    }

    public static void O(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static Pair P(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        U(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            int i13 = 0;
            while (true) {
                if (i13 >= iMin) {
                    i11 = -1;
                    break;
                }
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
                i13++;
            }
        } else {
            i11 = -1;
            break;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    public static x4 Q(int i10, String str, np0 np0Var, boolean z10, boolean z11) {
        int iT = T(np0Var);
        if (z11) {
            iT = Math.min(1, iT);
        }
        if (iT >= 0) {
            return z10 ? new c5(str, null, ca1.u(Integer.toString(iT))) : new v4(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iT));
        }
        v71.y("MetadataUtil", "Failed to parse uint8 attribute: ".concat(z01.e(i10)));
        return null;
    }

    public static void R(long j10, boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(dv.B(str, Long.valueOf(j10)));
        }
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[0];
        long j12 = j10 * j11;
        long j13 = jArr3[1];
        long j14 = jArr2[1];
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        long j18 = ((j14 + j14) * j13) + (j10 * j16) + (j17 * j11);
        long j19 = jArr3[3];
        long j20 = jArr2[3];
        long j21 = (j14 * j16) + (j17 * j13) + (j10 * j19) + (j20 * j11);
        long j22 = jArr3[4];
        long j23 = jArr2[4];
        long j24 = (j14 * j19) + (j20 * j13);
        long j25 = j24 + j24 + (j17 * j16) + (j10 * j22) + (j23 * j11);
        long j26 = jArr3[5];
        long j27 = jArr2[5];
        long j28 = (j17 * j19) + (j20 * j16) + (j14 * j22) + (j23 * j13) + (j10 * j26) + (j27 * j11);
        long j29 = jArr3[6];
        long j30 = jArr2[6];
        long j31 = (j20 * j19) + (j14 * j26) + (j27 * j13);
        long j32 = j31 + j31 + (j17 * j22) + (j23 * j16) + (j10 * j29) + (j30 * j11);
        long j33 = jArr3[7];
        long j34 = jArr2[7];
        long j35 = (j20 * j22) + (j23 * j19) + (j17 * j26) + (j27 * j16) + (j14 * j29) + (j30 * j13) + (j10 * j33) + (j34 * j11);
        long j36 = jArr3[8];
        long j37 = jArr2[8];
        long j38 = (j20 * j26) + (j27 * j19) + (j14 * j33) + (j34 * j13);
        long j39 = j38 + j38 + (j23 * j22) + (j17 * j29) + (j30 * j16) + (j10 * j36) + (j37 * j11);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = (j23 * j26) + (j27 * j22) + (j20 * j29) + (j30 * j19) + (j17 * j33) + (j34 * j16) + (j14 * j36) + (j37 * j13) + (j10 * j40) + (j11 * j41);
        long j43 = (j27 * j26) + (j20 * j33) + (j34 * j19) + (j14 * j40) + (j13 * j41);
        long j44 = (j27 * j33) + (j34 * j26) + (j20 * j40) + (j19 * j41);
        long j45 = (j34 * j33) + (j27 * j40) + (j26 * j41);
        long j46 = (j34 * j36) + (j37 * j33) + (j30 * j40) + (j29 * j41);
        long j47 = (j33 * j41) + (j34 * j40);
        K(new long[]{j12, j15, j18, j21, j25, j28, j32, j35, j39, j42, j43 + j43 + (j23 * j29) + (j30 * j22) + (j17 * j36) + (j37 * j16), (j27 * j29) + (j30 * j26) + (j23 * j33) + (j34 * j22) + (j20 * j36) + (j37 * j19) + (j17 * j40) + (j16 * j41), j44 + j44 + (j30 * j29) + (j23 * j36) + (j37 * j22), (j30 * j33) + (j34 * j29) + (j27 * j36) + (j37 * j26) + (j23 * j40) + (j22 * j41), j45 + j45 + (j30 * j36) + (j37 * j29), j46, j47 + j47 + (j37 * j36), (j36 * j41) + (j37 * j40), (j41 + j41) * j40}, jArr);
    }

    public static int T(np0 np0Var) {
        int iB = np0Var.b();
        if (np0Var.b() == 1684108385) {
            np0Var.G(8);
            int i10 = iB - 16;
            if (i10 == 1) {
                return np0Var.K();
            }
            if (i10 == 2) {
                return np0Var.L();
            }
            if (i10 == 3) {
                return np0Var.O();
            }
            if (i10 == 4 && (np0Var.I() & 128) == 0) {
                return np0Var.h();
            }
        }
        v71.y("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void U(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static void V(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(dv.B(str, obj));
        }
    }

    public static void W(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * j10;
        long j12 = jArr2[1];
        long j13 = (j10 + j10) * j12;
        long j14 = jArr2[2];
        long j15 = (j10 * j14) + (j12 * j12);
        long j16 = jArr2[3];
        long j17 = (j10 * j16) + (j12 * j14);
        long j18 = jArr2[4];
        long j19 = (j14 * j14) + (j12 * 4 * j16) + ((j10 + j10) * j18);
        long j20 = jArr2[5];
        long j21 = (j14 * j16) + (j12 * j18) + (j10 * j20);
        long j22 = jArr2[6];
        long j23 = (j16 * j16) + (j14 * j18) + (j10 * j22) + ((j12 + j12) * j20);
        long j24 = jArr2[7];
        long j25 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24);
        long j26 = jArr2[8];
        long j27 = (j16 * j20) + (j12 * j24);
        long j28 = j27 + j27 + (j14 * j22) + (j10 * j26);
        long j29 = j28 + j28 + (j18 * j18);
        long j30 = jArr2[9];
        long j31 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j26) + (j10 * j30);
        long j32 = (j12 * j30) + (j16 * j24);
        long j33 = j32 + j32 + (j20 * j20) + (j18 * j22) + (j14 * j26);
        long j34 = (j20 * j22) + (j18 * j24) + (j16 * j26) + (j14 * j30);
        long j35 = (j16 * j30) + (j20 * j24);
        long j36 = j35 + j35 + (j18 * j26);
        long j37 = j36 + j36 + (j22 * j22);
        long j38 = (j22 * j24) + (j20 * j26) + (j18 * j30);
        long j39 = (j24 * j24) + (j22 * j26) + ((j20 + j20) * j30);
        long j40 = (j22 * j30) + (j24 * j26);
        K(new long[]{j11, j13, j15 + j15, j17 + j17, j19, j21 + j21, j23 + j23, j25 + j25, j29, j31 + j31, j33 + j33, j34 + j34, j37, j38 + j38, j39 + j39, j40 + j40, (j24 * 4 * j30) + (j26 * j26), (j26 + j26) * j30, (j30 + j30) * j30}, jArr);
    }

    public static int X(ou0 ou0Var) {
        int iZzg = zzv.zzg(ou0Var) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    public static c5 Y(int i10, String str, np0 np0Var) {
        int iB = np0Var.b();
        if (np0Var.b() == 1684108385 && iB >= 22) {
            np0Var.G(10);
            int iL = np0Var.L();
            if (iL > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iL).length());
                sb2.append(iL);
                String string = sb2.toString();
                int iL2 = np0Var.L();
                if (iL2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iL2);
                    string = sb3.toString();
                }
                return new c5(str, null, ca1.u(string));
            }
        }
        v71.y("MetadataUtil", "Failed to parse index/count attribute: ".concat(z01.e(i10)));
        return null;
    }

    public static long[] Z(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f18807p[i10];
            int i12 = bArr[i11] & 255;
            int i13 = bArr[i11 + 1] & 255;
            long j10 = ((long) i12) | (((long) i13) << 8);
            jArr[i10] = (((j10 | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> f18808q[i10]) & ((long) f18809r[i10 & 1]);
        }
        return jArr;
    }

    public static void a0(ListenableFuture listenableFuture, jw0 jw0Var, fw0 fw0Var, boolean z10) {
        if (((Boolean) an.f12466c.o()).booleanValue()) {
            vd1 vd1VarR = vd1.r(listenableFuture);
            t6.l lVar = new t6.l(jw0Var, fw0Var, z10);
            vd1VarR.addListener(new zd1(0, vd1VarR, lVar), l00.f16615h);
        }
    }

    public static int b(String str) {
        int i10;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = length & (-4);
            if (i12 >= i10) {
                break;
            }
            int i14 = ((bytes[i12] & 255) | ((bytes[i12 + 1] & 255) << 8) | ((bytes[i12 + 2] & 255) << 16) | (bytes[i12 + 3] << 24)) * (-862048943);
            int i15 = i13 ^ (((i14 >>> 17) | (i14 << 15)) * 461845907);
            i13 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i12 += 4;
        }
        int i16 = length & 3;
        if (i16 == 1) {
            int i17 = ((bytes[i10] & 255) | i11) * (-862048943);
            i13 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        } else {
            if (i16 != 2) {
                i11 = i16 == 3 ? (bytes[i10 + 2] & 255) << 16 : 0;
            }
            i11 |= (bytes[i10 + 1] & 255) << 8;
            int i18 = ((bytes[i10] & 255) | i11) * (-862048943);
            i13 ^= ((i18 >>> 17) | (i18 << 15)) * 461845907;
        }
        int i19 = i13 ^ length;
        int i20 = (i19 ^ (i19 >>> 16)) * (-2048144789);
        int i21 = (i20 ^ (i20 >>> 13)) * (-1028477387);
        return i21 ^ (i21 >>> 16);
    }

    public static byte[] b0(long[] jArr) {
        long j10;
        int[] iArr;
        int i10;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = 19;
            iArr = f18810s;
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j11 = jArrCopyOf[i13];
                int i14 = iArr[i13 & 1];
                int i15 = -((int) (((j11 >> 31) & j11) >> i14));
                jArrCopyOf[i13] = j11 + ((long) (i15 << i14));
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) i15);
            }
            long j12 = jArrCopyOf[9];
            int i16 = -((int) (((j12 >> 31) & j12) >> 25));
            jArrCopyOf[9] = j12 + ((long) (i16 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i16) * 19);
            i12++;
        }
        long j13 = jArrCopyOf[0];
        int i17 = -((int) (((j13 >> 31) & j13) >> 26));
        jArrCopyOf[0] = j13 + ((long) (i17 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i17);
        int i18 = 0;
        while (true) {
            iArr2 = f18809r;
            if (i18 >= 2) {
                break;
            }
            int i19 = i11;
            while (i19 < 9) {
                long j14 = jArrCopyOf[i19];
                int i20 = i19 & 1;
                int i21 = i11;
                long j15 = j14 >> iArr[i20];
                jArrCopyOf[i19] = ((long) iArr2[i20]) & j14;
                i19++;
                jArrCopyOf[i19] = jArrCopyOf[i19] + ((long) ((int) j15));
                i11 = i21;
                i18 = i18;
                j10 = j10;
            }
            i18++;
        }
        int i22 = i11;
        long j16 = jArrCopyOf[9];
        jArrCopyOf[9] = j16 & 33554431;
        long j17 = (((long) ((int) (j16 >> 25))) * j10) + jArrCopyOf[i22];
        jArrCopyOf[i22] = j17;
        int i23 = ~((((int) j17) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) jArrCopyOf[i24]) ^ iArr2[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 + i29)) >> 31;
        }
        jArrCopyOf[i22] = jArrCopyOf[i22] - ((long) (67108845 & i23));
        long j18 = 33554431 & i23;
        jArrCopyOf[1] = jArrCopyOf[1] - j18;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) (67108863 & i23));
            int i30 = i10 + 1;
            jArrCopyOf[i30] = jArrCopyOf[i30] - j18;
        }
        for (int i31 = i22; i31 < 10; i31++) {
            jArrCopyOf[i31] = jArrCopyOf[i31] << f18808q[i31];
        }
        byte[] bArr = new byte[32];
        for (int i32 = i22; i32 < 10; i32++) {
            int i33 = f18807p[i32];
            long j19 = bArr[i33];
            long j20 = jArrCopyOf[i32];
            bArr[i33] = (byte) (j19 | (j20 & 255));
            int i34 = i33 + 1;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j20 >> 8) & 255));
            int i35 = i33 + 2;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j20 >> 16) & 255));
            int i36 = i33 + 3;
            bArr[i36] = (byte) (((long) bArr[i36]) | ((j20 >> 24) & 255));
        }
        return bArr;
    }

    public static void c0(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void d0(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void e0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f0(int i10, int i11) {
        String strB;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strB = dv.B("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
                }
                strB = dv.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void g0(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(i0(i10, i11, "index"));
        }
    }

    public static void h0(int i10, int i11, int i12) {
        String strI0;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strI0 = i0(i10, i12, "start index");
            } else {
                strI0 = (i11 < 0 || i11 > i12) ? i0(i11, i12, "end index") : dv.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strI0);
        }
    }

    public static String i0(int i10, int i11, String str) {
        if (i10 < 0) {
            return dv.B("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return dv.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 15), "negative size: ", i11));
    }

    public static long p(String str) {
        String str2 = uu0.f20901a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static je q(Context context, String str, String str2) {
        je jeVar;
        try {
            jeVar = (je) ((LinkedBlockingQueue) new o8(context, str, str2).f18184e).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            jeVar = null;
        }
        return jeVar == null ? o8.e() : jeVar;
    }

    public static void r(int i10, s8 s8Var, i12 i12Var, s8 s8Var2, s8... s8VarArr) {
        if (s8Var2 == null) {
            s8Var2 = new s8(new v7[0]);
        }
        if (s8Var != null) {
            aa1 aa1Var = ca1.f13122b;
            rb0.p(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i11 = 0;
            for (v7 v7Var : s8Var.f19891a) {
                if (jz0.class.isAssignableFrom(v7Var.getClass())) {
                    v7 v7Var2 = (v7) jz0.class.cast(v7Var);
                    v7Var2.getClass();
                    int length = objArrCopyOf.length;
                    int i12 = i11 + 1;
                    int iD = x91.d(length, i12);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i11] = v7Var2;
                    i11 = i12;
                }
            }
            ya1 ya1VarA = ca1.A(i11, objArrCopyOf);
            int i13 = ya1VarA.f22210d;
            for (int i14 = 0; i14 < i13; i14++) {
                jz0 jz0Var = (jz0) ya1VarA.get(i14);
                if (!jz0Var.f16222a.equals("com.android.capture.fps") || i10 == 2) {
                    s8Var2 = s8Var2.c(jz0Var);
                }
            }
        }
        for (s8 s8Var3 : s8VarArr) {
            s8Var2 = s8Var2.b(s8Var3);
        }
        if (s8Var2.f19891a.length > 0) {
            i12Var.f15509k = s8Var2;
        }
    }

    public static void s(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            A(i11, objArr[i11]);
        }
    }

    public static void t(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void u(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void v(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static float x(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static ks1 y() {
        ClassLoader classLoader = ps1.class.getClassLoader();
        if (ks1.class.equals(ks1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new ps1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e11) {
                    Logger.getLogger(is1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(ks1.class.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (ks1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (ks1) ks1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public String toString() {
        switch (this.f18812a) {
            case 27:
                return z().toString();
            default:
                return super.toString();
        }
    }

    public abstract Object z();
}
