package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
public final class C2616m7 implements H9 {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final HD A0b;
    public static final C2860qI A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C11074v A0D;
    public HA A0E;
    public JA A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC1407Hd[] A0I;
    public InterfaceC1407Hd[] A0J;
    public final int A0K;
    public final SparseArray<JA> A0L;
    public final C11074v A0M;
    public final C11074v A0N;
    public final C11074v A0O;
    public final C11074v A0P;
    public final C11074v A0Q;
    public final AnonymousClass53 A0R;
    public final InterfaceC1407Hd A0S;
    public final I0 A0T;
    public final JO A0U;
    public final ArrayDeque<C2623mE> A0V;
    public final ArrayDeque<J9> A0W;
    public final List<C2860qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(JA ja, int i2, int i3, C11074v c11074v, int i4) throws C3K {
        int iA0C;
        int iA0C2;
        int i5 = i4;
        c11074v.A0f(8);
        int iA00 = AbstractC1449Iu.A00(c11074v.A0C());
        JO jo = ja.A05.A03;
        JQ jq = ja.A09;
        J1 j1 = (J1) C5C.A0f(jq.A06);
        jq.A0C[i2] = c11074v.A0L();
        jq.A0E[i2] = jq.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = jq.A0E;
            jArr[i2] = jArr[i2] + ((long) c11074v.A0C());
        }
        boolean z2 = (iA00 & 4) != 0;
        int iA0C3 = j1.A01;
        if (z2) {
            iA0C3 = c11074v.A0C();
        }
        boolean z3 = (iA00 & 256) != 0;
        boolean z4 = (iA00 & 512) != 0;
        boolean z5 = (iA00 & 1024) != 0;
        boolean z6 = (iA00 & a.f25965n) != 0;
        long j = A0a(jo) ? ((long[]) C5C.A0f(jo.A09))[0] : 0L;
        int[] iArr = jq.A0B;
        long[] jArr2 = jq.A0D;
        boolean[] zArr = jq.A0G;
        boolean z7 = jo.A03 == 2 && (i3 & 1) != 0;
        int i6 = i5 + jq.A0C[i2];
        long j2 = jo.A06;
        long j3 = jq.A05;
        while (i5 < i6) {
            if (z3) {
                iA0C = c11074v.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = j1.A00;
            }
            int iA01 = A00(iA0C);
            int iA02 = A00(z4 ? c11074v.A0C() : j1.A03);
            if (z5) {
                iA0C2 = c11074v.A0C();
            } else {
                iA0C2 = (i5 == 0 && z2) ? iA0C3 : j1.A01;
            }
            jArr2[i5] = C5C.A0U((((long) (z6 ? c11074v.A0C() : 0)) + j3) - j, 1000000L, j2);
            if (!jq.A09) {
                jArr2[i5] = jArr2[i5] + ja.A05.A02;
            }
            iArr[i5] = iA02;
            zArr[i5] = ((iA0C2 >> 16) & 1) == 0 && (!z7 || i5 == 0);
            j3 += (long) iA01;
            i5++;
        }
        jq.A05 = j3;
        return i6;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2656my> A05(C11074v c11074v, long j) throws C3K {
        long jA0R;
        long jA0R2;
        c11074v.A0f(8);
        int iA01 = AbstractC1449Iu.A01(c11074v.A0C());
        c11074v.A0g(4);
        long jA0Q = c11074v.A0Q();
        if (iA01 == 0) {
            jA0R = c11074v.A0Q();
            jA0R2 = j + c11074v.A0Q();
        } else {
            jA0R = c11074v.A0R();
            jA0R2 = j + c11074v.A0R();
        }
        long jA0U = C5C.A0U(jA0R, 1000000L, jA0Q);
        c11074v.A0g(2);
        int iA0M = c11074v.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i2 = 0; i2 < iA0M; i2++) {
            int iA0C = c11074v.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw C3K.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c11074v.A0Q();
            iArr[i2] = Integer.MAX_VALUE & iA0C;
            jArr[i2] = jA0R2;
            jArr3[i2] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = C5C.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i2] = jA0U2 - jArr3[i2];
            c11074v.A0g(4);
            jA0R2 += (long) iArr[i2];
        }
        return Pair.create(Long.valueOf(jA0U), new C2656my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JA A09(C11074v c11074v, SparseArray<JA> sparseArray, boolean z2) {
        c11074v.A0f(8);
        int iA00 = AbstractC1449Iu.A00(c11074v.A0C());
        JA jaValueAt = z2 ? sparseArray.valueAt(0) : sparseArray.get(c11074v.A0C());
        if (jaValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c11074v.A0R();
            jaValueAt.A09.A04 = jA0R;
            jaValueAt.A09.A03 = jA0R;
        }
        J1 j1 = jaValueAt.A04;
        jaValueAt.A09.A06 = new J1((iA00 & 2) != 0 ? c11074v.A0C() - 1 : j1.A02, (iA00 & 8) != 0 ? c11074v.A0C() : j1.A00, (iA00 & 16) != 0 ? c11074v.A0C() : j1.A03, (iA00 & 32) != 0 ? c11074v.A0C() : j1.A01);
        return jaValueAt;
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
            i5++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, 11, 78, 2, 11, 29, 29, 78, 26, 6, 15, 0, 78, 6, 11, 15, 10, 11, 28, 78, 2, 11, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, 29, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, 64, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, AbstractJsonLexerKt.TC_INVALID, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, AbstractJsonLexerKt.TC_INVALID, 108, 41, AbstractJsonLexerKt.TC_INVALID, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, AbstractJsonLexerKt.TC_INVALID, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C11074v c11074v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c11074v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = AbstractC1449Iu.A01(c11074v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC10843y.A01(c11074v.A0U());
                str2 = (String) AbstractC10843y.A01(c11074v.A0U());
                long jA0Q2 = c11074v.A0Q();
                jA0U2 = C5C.A0U(c11074v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = C5C.A0U(c11074v.A0Q(), 1000L, jA0Q2);
                jA0Q = c11074v.A0Q();
                break;
            case 1:
                long jA0Q3 = c11074v.A0Q();
                jA05 = C5C.A0U(c11074v.A0R(), 1000000L, jA0Q3);
                jA0U = C5C.A0U(c11074v.A0Q(), 1000L, jA0Q3);
                jA0Q = c11074v.A0Q();
                str = (String) AbstractC10843y.A01(c11074v.A0U());
                str2 = (String) AbstractC10843y.A01(c11074v.A0U());
                break;
            default:
                AbstractC10924g.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c11074v.A07()];
        c11074v.A0k(bArr, 0, c11074v.A07());
        int i2 = 0;
        C11074v c11074v2 = new C11074v(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c11074v2.A07();
        InterfaceC1407Hd[] interfaceC1407HdArr = this.A0J;
        int length = interfaceC1407HdArr.length;
        int i3 = 0;
        while (i3 < length) {
            InterfaceC1407Hd interfaceC1407Hd = interfaceC1407HdArr[i3];
            c11074v2.A0f(i2);
            interfaceC1407Hd.AKf(uri);
            interfaceC1407Hd.AIr(c11074v2, iA07);
            i3++;
            i2 = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0W.addLast(new J9(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new J9(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            AnonymousClass53 anonymousClass53 = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = anonymousClass53.A05(jA05);
            } else {
                jA05 = anonymousClass53.A05(jA05);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC2460jX.A11)) {
            jA05 = this.A0A;
        }
        InterfaceC1407Hd[] interfaceC1407HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (InterfaceC1407Hd interfaceC1407Hd2 : interfaceC1407HdArr2) {
            interfaceC1407Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C2623mE c2623mE, SparseArray<JA> sparseArray, boolean z2, int i2, byte[] bArr) throws C3K {
        JA jaA09 = A09(((C2622mD) AbstractC10843y.A01(c2623mE.A07(1952868452))).A00, sparseArray, z2);
        if (jaA09 == null) {
            return;
        }
        JQ jq = jaA09.A09;
        long j = jq.A05;
        boolean z3 = jq.A09;
        jaA09.A08();
        jaA09.A06 = true;
        C2622mD c2622mDA07 = c2623mE.A07(1952867444);
        if (c2622mDA07 == null || (i2 & 2) != 0) {
            jq.A05 = j;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            jq.A09 = z3;
        } else {
            jq.A05 = A03(c2622mDA07.A00);
            jq.A09 = true;
        }
        A0S(c2623mE, jaA09, i2);
        JO jo = jaA09.A05.A03;
        Object objA01 = AbstractC10843y.A01(jq.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        JP jpA00 = jo.A00(((J1) objA01).A02);
        C2622mD c2622mDA08 = c2623mE.A07(1935763834);
        if (c2622mDA08 != null) {
            A0V((JP) AbstractC10843y.A01(jpA00), c2622mDA08.A00, jq);
        }
        C2622mD c2622mDA09 = c2623mE.A07(1935763823);
        if (c2622mDA09 != null) {
            A0I(c2622mDA09.A00, jq);
        }
        C2622mD c2622mDA010 = c2623mE.A07(1936027235);
        if (c2622mDA010 != null) {
            A0J(c2622mDA010.A00, jq);
        }
        A0T(c2623mE, jpA00 != null ? jpA00.A02 : null, jq);
        int size = c2623mE.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2622mD c2622mD = c2623mE.A02.get(i3);
            if (((AbstractC1449Iu) c2622mD).A00 == 1970628964) {
                A0K(c2622mD.A00, jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C2623mE c2623mE, String str, JQ jq) throws C3K {
        C11074v c11074v = null;
        C11074v c11074v2 = null;
        for (int i2 = 0; i2 < c2623mE.A02.size(); i2++) {
            C2622mD c2622mD = c2623mE.A02.get(i2);
            C11074v c11074v3 = c2622mD.A00;
            if (((AbstractC1449Iu) c2622mD).A00 == 1935828848) {
                c11074v3.A0f(12);
                if (c11074v3.A0C() == 1936025959) {
                    c11074v = c11074v3;
                }
            } else if (((AbstractC1449Iu) c2622mD).A00 == 1936158820) {
                c11074v3.A0f(12);
                if (c11074v3.A0C() == 1936025959) {
                    c11074v2 = c11074v3;
                }
            }
        }
        if (c11074v == null || c11074v2 == null) {
            return;
        }
        c11074v.A0f(8);
        int iA01 = AbstractC1449Iu.A01(c11074v.A0C());
        c11074v.A0g(4);
        if (iA01 == 1) {
            c11074v.A0g(4);
        }
        if (c11074v.A0C() != 1) {
            throw C3K.A00(A0A(126, 39, 73));
        }
        c11074v2.A0f(8);
        int iA02 = AbstractC1449Iu.A01(c11074v2.A0C());
        c11074v2.A0g(4);
        if (iA02 == 1) {
            if (c11074v2.A0Q() == 0) {
                throw C3K.A00(A0A(784, 55, 110));
            }
        } else if (iA02 >= 2) {
            c11074v2.A0g(4);
        }
        if (c11074v2.A0Q() != 1) {
            throw C3K.A00(A0A(165, 39, 18));
        }
        c11074v2.A0g(1);
        int iA0I = c11074v2.A0I();
        int i3 = (iA0I & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i4 = iA0I & 15;
        boolean z2 = c11074v2.A0I() == 1;
        if (z2) {
            int iA0I2 = c11074v2.A0I();
            byte[] bArr = new byte[16];
            c11074v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c11074v2.A0I();
                bArr2 = new byte[iA0I3];
                c11074v2.A0k(bArr2, 0, iA0I3);
            }
            jq.A08 = true;
            jq.A07 = new JP(z2, str, iA0I2, bArr, i3, i4, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(JP jp, C11074v c11074v, JQ jq) throws C3K {
        int i2 = jp.A00;
        c11074v.A0f(8);
        if ((AbstractC1449Iu.A00(c11074v.A0C()) & 1) == 1) {
            c11074v.A0g(8);
        }
        int iA0I = c11074v.A0I();
        int iA0L = c11074v.A0L();
        if (iA0L > jq.A00) {
            throw C3K.A01(A0A(514, 18, 58) + iA0L + A0A(40, 38, 7) + jq.A00, null);
        }
        int i3 = 0;
        if (iA0I == 0) {
            boolean[] zArr = jq.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i4 = 0; i4 < iA0L; i4++) {
                int iA0I2 = c11074v.A0I();
                i3 += iA0I2;
                zArr[i4] = iA0I2 > i2;
            }
        } else {
            i3 = 0 + (iA0I * iA0L);
            Arrays.fill(jq.A0F, 0, iA0L, iA0I > i2);
        }
        Arrays.fill(jq.A0F, iA0L, jq.A00, false);
        if (i3 > 0) {
            jq.A02(i3);
        }
    }

    static {
        A0D();
        A0b = new HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.facebook.ads.redexgen.core.HD
            public final H9[] A5N() {
                return C2616m7.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C10512p().A11(A0A(839, 18, 77)).A14();
    }

    public C2616m7() {
        this(0);
    }

    public C2616m7(int i2) {
        this(i2, null);
    }

    public C2616m7(int i2, AnonymousClass53 anonymousClass53) {
        this(i2, anonymousClass53, null, Collections.emptyList());
    }

    public C2616m7(int i2, AnonymousClass53 anonymousClass53, JO jo, List<C2860qI> list) {
        this(i2, anonymousClass53, jo, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C2616m7(int i2, AnonymousClass53 anonymousClass53, JO jo, List<C2860qI> list, InterfaceC1407Hd interfaceC1407Hd) {
        this.A0A = -9223372036854775807L;
        this.A0K = i2;
        this.A0R = anonymousClass53;
        this.A0U = jo;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = interfaceC1407Hd;
        this.A0T = new I0();
        this.A0M = new C11074v(16);
        this.A0P = new C11074v(HS.A03);
        this.A0O = new C11074v(5);
        this.A0N = new C11074v();
        this.A0Y = new byte[16];
        this.A0Q = new C11074v(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = HA.A00;
        this.A0J = new InterfaceC1407Hd[0];
        this.A0I = new InterfaceC1407Hd[0];
    }

    public static int A00(int i2) throws C3K {
        if (i2 >= 0) {
            return i2;
        }
        throw C3K.A01(A0A(700, 27, 67) + i2, null);
    }

    public static long A02(C11074v c11074v) {
        c11074v.A0f(8);
        int fullAtom = c11074v.A0C();
        return AbstractC1449Iu.A01(fullAtom) == 0 ? c11074v.A0Q() : c11074v.A0R();
    }

    public static long A03(C11074v c11074v) {
        c11074v.A0f(8);
        int fullAtom = c11074v.A0C();
        int version = AbstractC1449Iu.A01(fullAtom);
        return version == 1 ? c11074v.A0R() : c11074v.A0Q();
    }

    public static Pair<Integer, J1> A04(C11074v c11074v) {
        c11074v.A0f(12);
        int defaultSampleDescriptionIndex = c11074v.A0C();
        int trackId = c11074v.A0C();
        int defaultSampleFlags = c11074v.A0C();
        int defaultSampleSize = c11074v.A0C();
        int defaultSampleDuration = c11074v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C2622mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2622mD c2622mD = list.get(i2);
            int leafChildrenSize = ((AbstractC1449Iu) c2622mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c2622mD.A00.A0l();
                UUID uuidA02 = JH.A02(bArrA0l);
                if (uuidA02 == null) {
                    AbstractC10924g.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 66), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private J1 A07(SparseArray<J1> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (J1) AbstractC10843y.A01(sparseArray.get(i2));
    }

    public static JA A08(SparseArray<JA> sparseArray) {
        JA ja = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JA jaValueAt = sparseArray.valueAt(i2);
            if (jaValueAt.A06 || jaValueAt.A01 != jaValueAt.A05.A01) {
                boolean z2 = jaValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z2 || jaValueAt.A02 != jaValueAt.A09.A01) {
                    long nextSampleOffset = jaValueAt.A05();
                    if (nextSampleOffset < j) {
                        ja = jaValueAt;
                        j = nextSampleOffset;
                    }
                }
            }
        }
        return ja;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new InterfaceC1407Hd[2];
        int i2 = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i2 = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i2 + 1;
            this.A0J[i2] = this.A0E.AKS(100, 5);
            i2 = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (InterfaceC1407Hd[]) C5C.A1I(this.A0J, i2);
        for (InterfaceC1407Hd interfaceC1407Hd : this.A0J) {
            interfaceC1407Hd.A6e(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new InterfaceC1407Hd[nextExtraTrackId3];
        int i3 = 0;
        while (i3 < nextExtraTrackId) {
            int i4 = nextExtraTrackId + 1;
            InterfaceC1407Hd interfaceC1407HdAKS = this.A0E.AKS(nextExtraTrackId, 3);
            interfaceC1407HdAKS.A6e(this.A0X.get(i3));
            this.A0I[i3] = interfaceC1407HdAKS;
            i3++;
            nextExtraTrackId = i4;
        }
    }

    private void A0E(long j) {
        while (!this.A0W.isEmpty()) {
            J9 j9RemoveFirst = this.A0W.removeFirst();
            this.A03 -= j9RemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = j9RemoveFirst.A01;
            if (j9RemoveFirst.A02) {
                jA05 += j;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (InterfaceC1407Hd interfaceC1407Hd : this.A0J) {
                interfaceC1407Hd.AIu(jA05, 1, j9RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C3K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C11074v c11074v, int i2, JQ jq) throws C3K {
        c11074v.A0f(i2 + 8);
        int fullAtom = c11074v.A0C();
        int flags = AbstractC1449Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z2 = fullAtom3 != 0;
            int sampleCount = c11074v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = jq.A0F;
                int fullAtom4 = jq.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = jq.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(jq.A0F, 0, sampleCount, z2);
                int fullAtom6 = c11074v.A07();
                jq.A02(fullAtom6);
                jq.A04(c11074v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = jq.A00;
            throw C3K.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw C3K.A00(A0A(458, 56, 30));
    }

    public static void A0I(C11074v c11074v, JQ jq) throws C3K {
        c11074v.A0f(8);
        int flags = c11074v.A0C();
        int fullAtom = AbstractC1449Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c11074v.A0g(8);
        }
        int iA0L = c11074v.A0L();
        if (iA0L == 1) {
            int entryCount = AbstractC1449Iu.A01(flags);
            jq.A03 += entryCount == 0 ? c11074v.A0Q() : c11074v.A0R();
            return;
        }
        throw C3K.A01(A0A(727, 29, 60) + iA0L, null);
    }

    public static void A0J(C11074v c11074v, JQ jq) throws C3K {
        A0G(c11074v, 0, jq);
    }

    public static void A0K(C11074v c11074v, JQ jq, byte[] bArr) throws C3K {
        c11074v.A0f(8);
        c11074v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c11074v, 16, jq);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC2651ms interfaceC2651ms) throws IOException {
        int i2 = ((int) this.A07) - this.A00;
        C11074v c11074v = this.A0D;
        if (c11074v != null) {
            interfaceC2651ms.readFully(c11074v.A0l(), 8, i2);
            A0U(new C2622mD(this.A01, c11074v), interfaceC2651ms.A8n(), interfaceC2651ms.A9P());
        } else {
            interfaceC2651ms.AK3(i2);
        }
        A0F(interfaceC2651ms.A8n());
    }

    private void A0M(InterfaceC2651ms interfaceC2651ms) throws IOException {
        JA jaValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i2 = 0; i2 < size; i2++) {
            JA nextTrackBundle = this.A0L.valueAt(i2);
            JQ jq = nextTrackBundle.A09;
            if (jq.A0A && jq.A03 < j) {
                j = jq.A03;
                jaValueAt = this.A0L.valueAt(i2);
            }
        }
        if (jaValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8n = (int) (j - interfaceC2651ms.A8n());
        if (iA8n >= 0) {
            interfaceC2651ms.AK3(iA8n);
            jaValueAt.A09.A05(interfaceC2651ms);
            return;
        }
        throw C3K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C2623mE c2623mE) throws C3K {
        if (((AbstractC1449Iu) c2623mE).A00 == 1836019574) {
            A0P(c2623mE);
            return;
        }
        if (((AbstractC1449Iu) c2623mE).A00 == 1836019558) {
            A0O(c2623mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C2623mE c2623mEPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c2623mEPeek.A08(c2623mE);
    }

    private void A0O(C2623mE c2623mE) throws C3K {
        A0Q(c2623mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c2623mE.A02);
        if (drmInitDataA06 != null) {
            int i2 = this.A0L.size();
            for (int trackCount = 0; trackCount < i2; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        long j = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i3 = 0; i3 < size; i3++) {
                    JA jaValueAt = this.A0L.valueAt(i3);
                    long j2 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        jaValueAt.A0A(j2);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C2623mE c2623mE) throws C3K {
        AbstractC10843y.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c2623mE.A02);
        C2623mE c2623mE2 = (C2623mE) AbstractC10843y.A01(c2623mE.A06(1836475768));
        SparseArray<J1> sparseArray = new SparseArray<>();
        long jA02 = -9223372036854775807L;
        int size = c2623mE2.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2622mD c2622mD = c2623mE2.A02.get(i2);
            if (((AbstractC1449Iu) c2622mD).A00 == 1953654136) {
                Pair<Integer, J1> pairA04 = A04(c2622mD.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (J1) pairA04.second);
            } else if (((AbstractC1449Iu) c2622mD).A00 == 1835362404) {
                jA02 = A02(c2622mD.A00);
            }
        }
        List<JR> listA0O = J0.A0O(c2623mE, new HK(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC2511kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.facebook.ads.redexgen.core.InterfaceC2511kO
            public final Object A4B(Object obj2) {
                return this.A00.A0c((JO) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i3 = 0; i3 < size2; i3++) {
                JR jr = listA0O.get(i3);
                JO jo = jr.A03;
                this.A0L.put(jo.A00, new JA(this.A0E.AKS(i3, jo.A03), jr, A07(sparseArray, jo.A00)));
                this.A08 = Math.max(this.A08, jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        AbstractC10843y.A08(this.A0L.size() == size2);
        for (int i4 = 0; i4 < size2; i4++) {
            JR jr2 = listA0O.get(i4);
            JO jo2 = jr2.A03;
            this.A0L.get(jo2.A00).A0C(jr2, A07(sparseArray, jo2.A00));
        }
    }

    public static void A0Q(C2623mE c2623mE, SparseArray<JA> sparseArray, boolean z2, int i2, byte[] bArr) throws C3K {
        int size = c2623mE.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2623mE child = c2623mE.A01.get(i3);
            int i4 = ((AbstractC1449Iu) child).A00;
            if (i4 == 1953653094) {
                A0R(child, sparseArray, z2, i2, bArr);
            }
        }
    }

    public static void A0S(C2623mE c2623mE, JA ja, int i2) throws C3K {
        int i3 = 0;
        int leafChildrenSize = 0;
        List<C2622mD> list = c2623mE.A02;
        int i4 = list.size();
        int i5 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i5 < i4) {
                C2622mD c2622mD = list.get(i5);
                int trunCount = ((AbstractC1449Iu) c2622mD).A00;
                if (trunCount == 1953658222) {
                    C11074v c11074v = c2622mD.A00;
                    c11074v.A0f(12);
                    int trunCount2 = c11074v.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i3++;
                    }
                }
                i5++;
            } else {
                ja.A02 = 0;
                ja.A00 = 0;
                ja.A01 = 0;
                ja.A09.A03(i3, leafChildrenSize);
                int i6 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i4; trunIndex++) {
                    C2622mD c2622mD2 = list.get(trunIndex);
                    int totalSampleCount = ((AbstractC1449Iu) c2622mD2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(ja, i6, i2, c2622mD2.A00, trunCount3);
                        i6++;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C2622mD c2622mD, long j, Uri uri) throws C3K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c2622mD);
            return;
        }
        if (((AbstractC1449Iu) c2622mD).A00 == 1936286840) {
            Pair<Long, C2656my> pairA05 = A05(c2622mD.A00, j);
            Long l2 = (Long) pairA05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l2.longValue();
            this.A0E.AJ7((HY) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((AbstractC1449Iu) c2622mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c2622mD.A00, uri);
    }

    public static boolean A0W(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    public static boolean A0X(int i2) {
        if (i2 != 1751411826 && i2 != 1835296868 && i2 != 1836476516 && i2 != 1936286840 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1668576371 && i2 != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i2 != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                    if (i2 != 1937013298) {
                        if (i2 == 1937007471 && i2 != 1668232756 && i2 != 1937011571 && i2 != 1952867444 && i2 != 1952868452 && i2 != 1953196132 && i2 != 1953654136 && i2 != 1953658222 && i2 != 1886614376 && i2 != 1935763834 && i2 != 1935763823 && i2 != 1936027235 && i2 != 1970628964 && i2 != 1935828848 && i2 != 1936158820 && i2 != 1701606260 && i2 != 1835362404 && i2 != 1701671783) {
                            return false;
                        }
                    }
                } else {
                    A0a[0] = "AuC";
                    if (i2 != 1937013298) {
                        if (i2 == 1937007471) {
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean A0Y(InterfaceC2651ms interfaceC2651ms) throws IOException {
        int trackCount;
        int i2;
        if (this.A00 == 0) {
            C11074v c11074v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC2651ms.AHR(c11074v.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int iA0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = iA0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC2651ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC2651ms.A8O();
            if (jA8O == -1 && !this.A0V.isEmpty()) {
                jA8O = this.A0V.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC2651ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = jA8n + ((long) trackCount2);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC2651ms.A8n() - ((long) this.A00);
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new C2646mn(this.A08, jA8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i2 = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i2 = 0;
                }
                while (i2 < trackCount) {
                    JQ jq = this.A0L.valueAt(i2).A09;
                    jq.A02 = jA8n2;
                    jq.A03 = jA8n2;
                    jq.A04 = jA8n2;
                    i2++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + jA8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA8n3 = (interfaceC2651ms.A8n() + this.A07) - 8;
                this.A0V.push(new C2623mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0F(jA8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C3K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C11074v c11074v2 = new C11074v((int) this.A07);
                    C11074v atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c11074v2.A0l(), 0, 8);
                    this.A0D = c11074v2;
                    this.A02 = 1;
                } else {
                    throw C3K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C3K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C3K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:68:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:79:0x0262 A[LOOP:1: B:77:0x025c->B:79:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x027c  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f0  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.facebook.ads.redexgen.core.C3K.A01(A0A(423, 35, 125), null);
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC2651ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2616m7.A0Z(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static boolean A0a(JO jo) {
        if (jo.A08 == null || jo.A08.length != 1 || jo.A09 == null) {
            return false;
        }
        if (jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = C5C.A0U(jo.A08[0] + jo.A09[0], 1000000L, jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= jo.A04;
    }

    public static /* synthetic */ H9[] A0b() {
        return new H9[]{new C2615m6()};
    }

    public final JO A0c(JO jo) {
        return jo;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A0E = ha;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new JA(ha.AKS(0, this.A0U.A03), new JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC2651ms)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0L(interfaceC2651ms);
                    break;
                case 2:
                    A0M(interfaceC2651ms);
                    break;
                default:
                    if (A0Z(interfaceC2651ms)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        int size = this.A0L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0L.valueAt(i2).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2651ms interfaceC2651ms) throws IOException {
        return JM.A01(interfaceC2651ms);
    }
}
