package m1;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.h51;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.xd1;
import d5.u;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import m0.s1;
import oa.e0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45820a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f45821b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f45822c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f45823d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        go.k.t(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static String c(i1.p pVar) {
        String str = pVar.f42643n;
        String str2 = pVar.f42641k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return pVar.f42643n;
    }

    public static boolean d(byte[] bArr, int i10, i1.p pVar) {
        int i11;
        if (Objects.equals(pVar.f42643n, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(pVar.f42643n, "video/hevc")) {
            t0 t0VarF = f(new xd1(bArr, 4, i10 + 4));
            int i12 = t0VarF.f20103a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && t0VarF.f20105c == pVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(i1.p pVar) {
        String strC = c(pVar);
        if (Objects.equals(strC, "video/avc")) {
            return 1;
        }
        return Objects.equals(strC, "video/hevc") ? 2 : 0;
    }

    public static t0 f(xd1 xd1Var) {
        xd1Var.s();
        return new t0(xd1Var.i(6), xd1Var.i(6), xd1Var.i(3) - 1, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static h g(xd1 xd1Var, boolean z10, int i10, h hVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zH;
        int i14;
        int i15;
        int i16;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (hVar != null) {
                int i17 = hVar.f45784a;
                zH = hVar.f45785b;
                i14 = hVar.f45786c;
                i15 = hVar.f45787d;
                iArr2 = hVar.f45788e;
                i11 = i17;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int i18 = xd1Var.i(8);
            i16 = 0;
            for (int i19 = 0; i19 < i10; i19++) {
                if (xd1Var.h()) {
                    i16 += 88;
                }
                if (xd1Var.h()) {
                    i16 += 8;
                }
            }
            xd1Var.t(i16);
            if (i10 > 0) {
                xd1Var.t((8 - i10) * 2);
            }
            return new h(i11, z11, i12, i13, iArr, i18);
        }
        int i20 = xd1Var.i(2);
        zH = xd1Var.h();
        i14 = xd1Var.i(5);
        i15 = 0;
        for (int i21 = 0; i21 < 32; i21++) {
            if (xd1Var.h()) {
                i15 |= 1 << i21;
            }
        }
        for (int i22 = 0; i22 < 6; i22++) {
            iArr2[i22] = xd1Var.i(8);
        }
        i11 = i20;
        iArr = iArr2;
        z11 = zH;
        i12 = i14;
        i13 = i15;
        int i110 = xd1Var.i(8);
        i16 = 0;
        while (i19 < i10) {
            if (xd1Var.h()) {
                i16 += 88;
            }
            if (xd1Var.h()) {
                i16 += 8;
            }
        }
        xd1Var.t(i16);
        if (i10 > 0) {
            xd1Var.t((8 - i10) * 2);
        }
        return new h(i11, z11, i12, i13, iArr, i110);
    }

    public static d5.o h(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 == 0 || i11 <= i12) {
            return null;
        }
        xd1 xd1Var = new xd1(bArr, i12, i11 + 1);
        while (xd1Var.d(16)) {
            int i13 = xd1Var.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += 255;
                i13 = xd1Var.i(8);
            }
            int i15 = i14 + i13;
            int i16 = xd1Var.i(8);
            int i17 = 0;
            while (i16 == 255) {
                i17 += 255;
                i16 = xd1Var.i(8);
            }
            int i18 = i17 + i16;
            if (i18 == 0 || !xd1Var.d(i18)) {
                return null;
            }
            if (i15 == 176) {
                int iM = xd1Var.m();
                boolean zH = xd1Var.h();
                int iM2 = zH ? xd1Var.m() : 0;
                int iM3 = xd1Var.m();
                int iM4 = -1;
                for (int i19 = 0; i19 <= iM3; i19++) {
                    iM4 = xd1Var.m();
                    xd1Var.m();
                    int i20 = xd1Var.i(6);
                    if (i20 == 63) {
                        return null;
                    }
                    xd1Var.i(i20 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i20 + iM) - 31));
                    if (zH) {
                        int i21 = xd1Var.i(6);
                        if (i21 == 63) {
                            return null;
                        }
                        xd1Var.i(i21 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i21 + iM2) - 31));
                    }
                    if (xd1Var.h()) {
                        xd1Var.t(10);
                    }
                }
                return new d5.o(iM4, 12);
            }
            xd1Var.t(i18 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    public static h51 i(byte[] bArr, int i10, int i11, k5.g gVar) {
        int i12;
        int iB;
        int iB2;
        int iM;
        int i13;
        int i14;
        int iM2;
        int i15;
        int i16;
        int iMax;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        int iF;
        int iG;
        int i21;
        i iVar;
        s1 s1Var;
        t0 t0VarF = f(new xd1(bArr, i10, i11));
        int i22 = 2;
        xd1 xd1Var = new xd1(bArr, i10 + 2, i11);
        xd1Var.t(4);
        int i23 = xd1Var.i(3);
        int i24 = t0VarF.f20104b;
        int i25 = 1;
        boolean z10 = i24 != 0 && i23 == 7;
        if (gVar != null) {
            j0 j0Var = (j0) gVar.f44325a;
            if (j0Var.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((g) j0Var.get(Math.min(i24, j0Var.size() - 1))).f45782a;
            }
        } else {
            i12 = 0;
        }
        h hVarG = null;
        if (!z10) {
            xd1Var.s();
            hVarG = g(xd1Var, true, i23, null);
        } else if (gVar != null) {
            i iVar2 = (i) gVar.f44326b;
            int[] iArr = iVar2.f45791b;
            j0 j0Var2 = iVar2.f45790a;
            int i26 = iArr[i12];
            if (j0Var2.size() > i26) {
                hVarG = (h) j0Var2.get(i26);
            }
        }
        xd1Var.m();
        if (z10) {
            int i27 = xd1Var.h() ? xd1Var.i(8) : -1;
            if (gVar == null || (s1Var = (s1) gVar.f44327c) == null) {
                i14 = 0;
                i15 = 0;
                iM2 = 0;
                iM = 0;
                i16 = 0;
                i13 = 0;
            } else {
                j0 j0Var3 = (j0) s1Var.f45751b;
                if (i27 == -1) {
                    i27 = ((int[]) s1Var.f45752c)[i12];
                }
                if (i27 == -1 || j0Var3.size() <= i27) {
                    i14 = 0;
                    i15 = 0;
                    iM2 = 0;
                    iM = 0;
                    i16 = 0;
                    i13 = 0;
                } else {
                    j jVar = (j) j0Var3.get(i27);
                    int i28 = jVar.f45792a;
                    i16 = jVar.f45795d;
                    i13 = jVar.f45796e;
                    iM = jVar.f45793b;
                    iM2 = jVar.f45794c;
                    i15 = i16;
                    i14 = i13;
                }
            }
        } else {
            int iM3 = xd1Var.m();
            if (iM3 == 3) {
                xd1Var.s();
            }
            int iM4 = xd1Var.m();
            int iM5 = xd1Var.m();
            if (xd1Var.h()) {
                int iM6 = xd1Var.m();
                int iM7 = xd1Var.m();
                int iM8 = xd1Var.m();
                int iM9 = xd1Var.m();
                if (iM3 != 1 && iM3 != 2) {
                    i22 = 1;
                }
                iB = l1.d.b(iM6, iM7, i22, iM4);
                iB2 = l1.d.b(iM8, iM9, iM3 == 1 ? 2 : 1, iM5);
            } else {
                iB = iM4;
                iB2 = iM5;
            }
            iM = xd1Var.m();
            i13 = iB2;
            i14 = iM5;
            iM2 = xd1Var.m();
            i15 = iM4;
            i16 = iB;
        }
        int iM10 = xd1Var.m();
        if (z10) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i29 = xd1Var.h() ? 0 : i23; i29 <= i23; i29++) {
                xd1Var.m();
                iMax = Math.max(xd1Var.m(), iMax);
                xd1Var.m();
            }
        }
        xd1Var.m();
        xd1Var.m();
        xd1Var.m();
        xd1Var.m();
        xd1Var.m();
        xd1Var.m();
        if (xd1Var.h()) {
            boolean zH = z10 ? xd1Var.h() : false;
            int i30 = 6;
            if (zH) {
                xd1Var.t(6);
            } else if (xd1Var.h()) {
                int i31 = 0;
                int i32 = 4;
                while (i31 < i32) {
                    int i33 = i32;
                    int i34 = 0;
                    while (i34 < i30) {
                        if (xd1Var.h()) {
                            int iMin = Math.min(64, i25 << ((i31 << 1) + 4));
                            if (i31 > i25) {
                                xd1Var.n();
                            }
                            for (int i35 = 0; i35 < iMin; i35++) {
                                xd1Var.n();
                            }
                        } else {
                            xd1Var.m();
                        }
                        i34 += i31 == 3 ? 3 : 1;
                        i14 = i14;
                        i30 = 6;
                        i25 = 1;
                    }
                    i31++;
                    i32 = i33;
                    i30 = 6;
                    i25 = 1;
                }
            }
        }
        int i36 = i14;
        xd1Var.t(2);
        if (xd1Var.h()) {
            xd1Var.t(8);
            xd1Var.m();
            xd1Var.m();
            xd1Var.s();
        }
        int iM11 = xd1Var.m();
        int i37 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i38 = i12;
        int i39 = iMax;
        int i40 = -1;
        int i41 = -1;
        while (i37 < iM11) {
            if (i37 == 0 || !xd1Var.h()) {
                int iM12 = xd1Var.m();
                int iM13 = xd1Var.m();
                int[] iArr3 = new int[iM12];
                int i42 = 0;
                while (i42 < iM12) {
                    iArr3[i42] = (i42 > 0 ? iArr3[i42 - 1] : 0) - (xd1Var.m() + 1);
                    xd1Var.s();
                    i42++;
                }
                int[] iArr4 = new int[iM13];
                int i43 = 0;
                while (i43 < iM13) {
                    iArr4[i43] = xd1Var.m() + 1 + (i43 > 0 ? iArr4[i43 - 1] : 0);
                    xd1Var.s();
                    i43++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i41 = iM13;
                i40 = iM12;
            } else {
                int i44 = i40 + i41;
                int iM14 = (1 - ((xd1Var.h() ? 1 : 0) * 2)) * (xd1Var.m() + 1);
                int i45 = i44 + 1;
                boolean[] zArr = new boolean[i45];
                for (int i46 = 0; i46 <= i44; i46++) {
                    if (xd1Var.h()) {
                        zArr[i46] = true;
                    } else {
                        zArr[i46] = xd1Var.h();
                    }
                }
                int[] iArr5 = new int[i45];
                int[] iArr6 = new int[i45];
                int i47 = 0;
                for (int i48 = i41 - 1; i48 >= 0; i48--) {
                    int i49 = iArrCopyOf[i48] + iM14;
                    if (i49 < 0 && zArr[i40 + i48]) {
                        iArr5[i47] = i49;
                        i47++;
                    }
                }
                if (iM14 < 0 && zArr[i44]) {
                    iArr5[i47] = iM14;
                    i47++;
                }
                int i50 = i47;
                for (int i51 = 0; i51 < i40; i51++) {
                    int i52 = iArr2[i51] + iM14;
                    if (i52 < 0 && zArr[i51]) {
                        iArr5[i50] = i52;
                        i50++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i50);
                int i53 = 0;
                for (int i54 = i40 - 1; i54 >= 0; i54--) {
                    int i55 = iArr2[i54] + iM14;
                    if (i55 > 0 && zArr[i54]) {
                        iArr6[i53] = i55;
                        i53++;
                    }
                }
                if (iM14 > 0 && zArr[i44]) {
                    iArr6[i53] = iM14;
                    i53++;
                }
                int i56 = i53;
                for (int i57 = 0; i57 < i41; i57++) {
                    int i58 = iArrCopyOf[i57] + iM14;
                    if (i58 > 0 && zArr[i40 + i57]) {
                        iArr6[i56] = i58;
                        i56++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i56);
                iArr2 = iArrCopyOf2;
                i41 = i56;
                i40 = i50;
            }
            i37++;
            iM11 = iM11;
            iM10 = iM10;
            i15 = i15;
        }
        int i59 = iM10;
        int i60 = i15;
        if (xd1Var.h()) {
            int iM15 = xd1Var.m();
            for (int i61 = 0; i61 < iM15; i61++) {
                xd1Var.t(i59 + 5);
            }
        }
        xd1Var.t(2);
        float f11 = 1.0f;
        if (xd1Var.h()) {
            if (xd1Var.h()) {
                int i62 = xd1Var.i(8);
                if (i62 == 255) {
                    int i63 = xd1Var.i(16);
                    int i64 = xd1Var.i(16);
                    if (i63 != 0 && i64 != 0) {
                        f11 = i63 / i64;
                    }
                } else if (i62 < 17) {
                    f11 = f45821b[i62];
                } else {
                    u.v(i62, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (xd1Var.h()) {
                xd1Var.s();
            }
            if (xd1Var.h()) {
                xd1Var.t(3);
                i21 = xd1Var.h() ? 1 : 2;
                if (xd1Var.h()) {
                    int i65 = xd1Var.i(8);
                    int i66 = xd1Var.i(8);
                    xd1Var.t(8);
                    iF = i1.h.f(i65);
                    iG = i1.h.g(i66);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (gVar == null || (iVar = (i) gVar.f44328d) == null) {
                iF = -1;
                iG = -1;
                i21 = -1;
            } else {
                j0 j0Var4 = iVar.f45790a;
                int i67 = iVar.f45791b[i38];
                if (j0Var4.size() > i67) {
                    k kVar = (k) j0Var4.get(i67);
                    int i68 = kVar.f45797a;
                    int i69 = kVar.f45798b;
                    iG = kVar.f45799c;
                    iF = i68;
                    i21 = i69;
                } else {
                    iF = -1;
                    iG = -1;
                    i21 = -1;
                }
            }
            if (xd1Var.h()) {
                xd1Var.m();
                xd1Var.m();
            }
            xd1Var.s();
            if (xd1Var.h()) {
                i13 *= 2;
            }
            i18 = iF;
            f10 = f11;
            i19 = i21;
            i17 = i13;
            i20 = iG;
        } else {
            f10 = 1.0f;
            i17 = i13;
            i18 = -1;
            i19 = -1;
            i20 = -1;
        }
        return new h51(i23, hVarG, iM, iM2, i16, i17, i60, i36, f10, i39, i18, i19, i20);
    }

    /* JADX WARN: Code duplicated, block: B:475:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    public static k5.g j(byte[] bArr, int i10, int i11) {
        int[] iArr;
        i iVar;
        int i12;
        int i13;
        int i14;
        int i15;
        n1 n1Var;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z10;
        int i17;
        boolean zH;
        int i18;
        int i19;
        int i20;
        boolean zH2;
        boolean zH3;
        int iM;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        xd1 xd1Var = new xd1(bArr, i10, i11);
        f(xd1Var);
        xd1Var.t(4);
        boolean zH4 = xd1Var.h();
        boolean zH5 = xd1Var.h();
        int i24 = xd1Var.i(6);
        int i25 = i24 + 1;
        int i26 = xd1Var.i(3);
        xd1Var.t(17);
        h hVarG = g(xd1Var, true, i26, null);
        for (int i27 = xd1Var.h() ? 0 : i26; i27 <= i26; i27++) {
            xd1Var.m();
            xd1Var.m();
            xd1Var.m();
        }
        int i28 = xd1Var.i(6);
        int iM2 = xd1Var.m() + 1;
        int i29 = 6;
        int i30 = 1;
        i iVar2 = new i(j0.B(hVarG), new int[1], 0);
        boolean z13 = i25 >= 2 && iM2 >= 2;
        boolean z14 = zH4 && zH5;
        int i31 = i28 + 1;
        boolean z15 = i31 >= i25;
        if (!z13 || !z14 || !z15) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i31);
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i32 = 1; i32 < iM2; i32++) {
            int i33 = 0;
            for (int i34 = 0; i34 <= i28; i34++) {
                if (xd1Var.h()) {
                    iArr4[i32][i33] = i34;
                    iArr6[i32] = i34;
                    i33++;
                }
                iArr5[i32] = i33;
            }
        }
        if (xd1Var.h()) {
            xd1Var.t(64);
            if (xd1Var.h()) {
                xd1Var.m();
            }
            int iM3 = xd1Var.m();
            int i35 = 0;
            while (i35 < iM3) {
                xd1Var.m();
                if (i35 == 0 || xd1Var.h()) {
                    boolean zH6 = xd1Var.h();
                    boolean zH7 = xd1Var.h();
                    z12 = zH6;
                    z11 = zH7;
                    if (zH6 || zH7) {
                        zH = xd1Var.h();
                        if (zH) {
                            xd1Var.t(19);
                        }
                        xd1Var.t(8);
                        if (zH) {
                            xd1Var.t(4);
                        }
                        xd1Var.t(15);
                        i19 = zH6;
                        i18 = zH7;
                    }
                    i20 = 0;
                    while (i20 <= i26) {
                        zH2 = xd1Var.h();
                        if (!zH2) {
                            zH2 = xd1Var.h();
                        }
                        if (zH2) {
                            xd1Var.m();
                            zH3 = false;
                        } else {
                            zH3 = xd1Var.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = xd1Var.m();
                        }
                        int[][] iArr7 = iArr4;
                        i21 = i19 + i18;
                        int[] iArr8 = iArr6;
                        i22 = 0;
                        while (i22 < i21) {
                            int i36 = i21;
                            for (i23 = 0; i23 <= iM; i23++) {
                                xd1Var.m();
                                xd1Var.m();
                                if (zH) {
                                    xd1Var.m();
                                    xd1Var.m();
                                }
                                xd1Var.s();
                            }
                            i22++;
                            i21 = i36;
                        }
                        i20++;
                        i35 = i35;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i35++;
                } else {
                    z12 = false;
                    z11 = false;
                }
                zH = false;
                i19 = z12;
                i18 = z11;
                i20 = 0;
                while (i20 <= i26) {
                    zH2 = xd1Var.h();
                    if (!zH2) {
                        zH2 = xd1Var.h();
                    }
                    if (zH2) {
                        xd1Var.m();
                        zH3 = false;
                    } else {
                        zH3 = xd1Var.h();
                    }
                    if (zH3) {
                        iM = xd1Var.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i21 = i19 + i18;
                    int[] iArr10 = iArr6;
                    i22 = 0;
                    while (i22 < i21) {
                        int i37 = i21;
                        while (i23 <= iM) {
                            xd1Var.m();
                            xd1Var.m();
                            if (zH) {
                                xd1Var.m();
                                xd1Var.m();
                            }
                            xd1Var.s();
                        }
                        i22++;
                        i21 = i37;
                    }
                    i20++;
                    i35 = i35;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i35++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!xd1Var.h()) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int i38 = xd1Var.f21846e;
        if (i38 > 0) {
            xd1Var.t(8 - i38);
        }
        h hVarG2 = g(xd1Var, false, i26, hVarG);
        boolean zH8 = xd1Var.h();
        boolean[] zArr3 = new boolean[16];
        int i39 = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            boolean zH9 = xd1Var.h();
            zArr3[i40] = zH9;
            if (zH9) {
                i39++;
            }
        }
        if (i39 == 0 || !zArr3[1]) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int[] iArr13 = new int[i39];
        for (int i41 = 0; i41 < i39 - (zH8 ? 1 : 0); i41++) {
            iArr13[i41] = xd1Var.i(3);
        }
        int[] iArr14 = new int[i39 + 1];
        if (zH8) {
            int i42 = 1;
            while (i42 < i39) {
                int[] iArr15 = iArr14;
                for (int i43 = 0; i43 < i42; i43++) {
                    iArr15[i42] = iArr13[i43] + 1 + iArr15[i42];
                }
                i42++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i39] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i25, i39);
        int[] iArr17 = new int[i25];
        iArr17[0] = 0;
        boolean zH10 = xd1Var.h();
        int i44 = 1;
        while (i44 < i25) {
            if (zH10) {
                i17 = i44;
                iArr17[i17] = xd1Var.i(i29);
            } else {
                i17 = i44;
                iArr17[i17] = i17;
            }
            if (zH8) {
                int i45 = 0;
                while (i45 < i39) {
                    int i46 = i45 + 1;
                    iArr16[i17][i45] = (iArr17[i17] & ((1 << iArr[i46]) - 1)) >> iArr[i45];
                    i45 = i46;
                }
            } else {
                int i47 = 0;
                while (i47 < i39) {
                    int i48 = i47;
                    iArr16[i17][i48] = xd1Var.i(iArr13[i47] + 1);
                    i47 = i48 + 1;
                }
            }
            i44 = i17 + 1;
            i29 = 6;
        }
        int[] iArr18 = new int[i31];
        int i49 = 1;
        int i50 = 0;
        while (i50 < i25) {
            iArr18[iArr17[i50]] = -1;
            int[] iArr19 = iArr18;
            int i51 = 0;
            int i52 = 0;
            while (i51 < 16) {
                if (zArr3[i51]) {
                    if (i51 == i30) {
                        iArr19[iArr17[i50]] = iArr16[i50][i52];
                    }
                    i52++;
                }
                i51++;
                i30 = 1;
            }
            if (i50 > 0) {
                int i53 = 0;
                while (true) {
                    if (i53 >= i50) {
                        z10 = true;
                        break;
                    }
                    int i54 = i53;
                    if (iArr19[iArr17[i50]] == iArr19[iArr17[i53]]) {
                        z10 = false;
                        break;
                    }
                    i53 = i54 + 1;
                }
                if (z10) {
                    i49++;
                }
            }
            i50++;
            iArr18 = iArr19;
            i30 = 1;
        }
        int[] iArr20 = iArr18;
        int i55 = xd1Var.i(4);
        if (i49 < 2 || i55 == 0) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int[] iArr21 = new int[i49];
        for (int i56 = 0; i56 < i49; i56++) {
            iArr21[i56] = xd1Var.i(i55);
        }
        int[] iArr22 = new int[i31];
        int i57 = 0;
        while (i57 < i25) {
            iArr22[Math.min(iArr17[i57], i28)] = i57;
            i57++;
            iArr21 = iArr21;
        }
        int[] iArr23 = iArr21;
        e0 e0VarU = j0.u();
        int i58 = 0;
        while (i58 <= i28) {
            int i59 = i49;
            int[] iArr24 = iArr17;
            int iMin = Math.min(iArr20[i58], i59 - 1);
            int[] iArr25 = iArr22;
            e0VarU.b(new g(iArr25[i58], iMin >= 0 ? iArr23[iMin] : -1));
            i58++;
            i49 = i59;
            iArr22 = iArr25;
            iArr17 = iArr24;
        }
        int[] iArr26 = iArr17;
        n1 n1VarG = e0VarU.g();
        if (((g) n1VarG.get(0)).f45783b == -1) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int i60 = 1;
        while (true) {
            if (i60 > i28) {
                i60 = -1;
                break;
            }
            if (((g) n1VarG.get(i60)).f45783b != -1) {
                break;
            }
            i60++;
        }
        if (i60 == -1) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i25, i25);
        int i61 = 1;
        while (i61 < i25) {
            boolean[][] zArr6 = zArr5;
            for (int i62 = 0; i62 < i61; i62++) {
                boolean[] zArr7 = zArr4[i61];
                boolean[] zArr8 = zArr6[i61];
                boolean zH11 = xd1Var.h();
                zArr8[i62] = zH11;
                zArr7[i62] = zH11;
            }
            i61++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i63 = 1; i63 < i25; i63++) {
            int i64 = 0;
            while (i64 < i24) {
                boolean[][] zArr10 = zArr4;
                for (int i65 = 0; i65 < i63; i65++) {
                    boolean[] zArr11 = zArr9[i63];
                    if (zArr11[i65] && zArr9[i65][i64]) {
                        zArr11[i64] = true;
                        break;
                    }
                }
                i64++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = new int[i31];
        for (int i66 = 0; i66 < i25; i66++) {
            int i67 = 0;
            for (int i68 = 0; i68 < i66; i68++) {
                i67 += zArr12[i66][i68] ? 1 : 0;
            }
            iArr27[iArr26[i66]] = i67;
        }
        int i69 = 0;
        for (int i70 = 0; i70 < i25; i70++) {
            if (iArr27[iArr26[i70]] == 0) {
                i69++;
            }
        }
        if (i69 > 1) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int[] iArr28 = new int[i25];
        int[] iArr29 = new int[iM2];
        if (xd1Var.h()) {
            int i71 = 0;
            while (i71 < i25) {
                int i72 = i71;
                iArr28[i72] = xd1Var.i(3);
                i71 = i72 + 1;
            }
        } else {
            Arrays.fill(iArr28, 0, i25, i26);
        }
        int i73 = 0;
        while (i73 < iM2) {
            int i74 = i73;
            int[] iArr30 = iArr28;
            int[] iArr31 = iArr29;
            int iMax = 0;
            for (int i75 = 0; i75 < iArr5[i74]; i75++) {
                iMax = Math.max(iMax, iArr30[((g) n1VarG.get(iArr11[i74][i75])).f45782a]);
            }
            iArr31[i74] = iMax + 1;
            i73 = i74 + 1;
            iArr28 = iArr30;
            iArr29 = iArr31;
        }
        int[] iArr32 = iArr29;
        if (xd1Var.h()) {
            int i76 = 0;
            while (i76 < i24) {
                int i77 = i76 + 1;
                int i78 = i77;
                while (i78 < i25) {
                    if (zArr12[i78][i76]) {
                        xd1Var.t(3);
                    }
                    i78++;
                    i24 = i24;
                }
                i76 = i77;
            }
        }
        xd1Var.s();
        int iM4 = xd1Var.m() + 1;
        e0 e0VarU2 = j0.u();
        e0VarU2.b(hVarG);
        if (iM4 > 1) {
            e0VarU2.b(hVarG2);
            for (int i79 = 2; i79 < iM4; i79++) {
                hVarG2 = g(xd1Var, xd1Var.h(), i26, hVarG2);
                e0VarU2.b(hVarG2);
            }
        }
        n1 n1VarG2 = e0VarU2.g();
        int iM5 = xd1Var.m() + iM2;
        if (iM5 > iM2) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int i80 = xd1Var.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i31);
        int[] iArr33 = new int[iM5];
        int i81 = 0;
        int[] iArr34 = new int[iM5];
        int i82 = 0;
        while (i82 < iM2) {
            iArr33[i82] = i81;
            iArr34[i82] = iArr12[i82];
            if (i80 == 0) {
                i16 = i82;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                Arrays.fill(zArr13[i16], i81, iArr5[i16], true);
                iArr2[i16] = iArr3[i16];
            } else {
                i16 = i82;
                zArr2 = zArr13;
                iArr2 = iArr33;
                iArr3 = iArr5;
                if (i80 == 1) {
                    int i83 = iArr12[i16];
                    for (int i84 = 0; i84 < iArr3[i16]; i84++) {
                        zArr2[i16][i84] = iArr11[i16][i84] == i83;
                    }
                    iArr2[i16] = 1;
                } else {
                    i81 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i82 = i16 + 1;
                zArr13 = zArr2;
                iArr33 = iArr2;
                iArr5 = iArr3;
            }
            i81 = 0;
            i82 = i16 + 1;
            zArr13 = zArr2;
            iArr33 = iArr2;
            iArr5 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr35 = iArr33;
        int[] iArr36 = iArr5;
        int[] iArr37 = new int[i31];
        int i85 = 2;
        int[] iArr38 = new int[2];
        iArr38[1] = i31;
        iArr38[i81] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr38);
        int i86 = 1;
        int i87 = 0;
        while (i86 < iM5) {
            if (i80 == i85) {
                for (int i88 = 0; i88 < iArr36[i86]; i88++) {
                    zArr14[i86][i88] = xd1Var.h();
                    int i89 = iArr35[i86];
                    boolean z16 = zArr14[i86][i88];
                    iArr35[i86] = i89 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr34[i86] = iArr11[i86][i88];
                    }
                }
            }
            if (i87 == 0) {
                i15 = 0;
                if (iArr11[i86][0] == 0 && zArr14[i86][0]) {
                    for (int i90 = 1; i90 < iArr36[i86]; i90++) {
                        if (iArr11[i86][i90] == i60 && zArr14[i86][i60]) {
                            i87 = i86;
                        }
                    }
                }
            } else {
                i15 = 0;
            }
            int i91 = i15;
            while (i91 < iArr36[i86]) {
                if (iM4 > 1) {
                    zArr15[i86][i91] = zArr14[i86][i91];
                    n1Var = n1VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = ra.c.c(iM4);
                    if (!zArr[i86][i91]) {
                        int i92 = ((g) n1VarG.get(iArr11[i86][i91])).f45782a;
                        int i93 = i15;
                        while (i93 < i91) {
                            int i94 = i93;
                            if (zArr9[i92][((g) n1VarG.get(iArr11[i86][i94])).f45782a]) {
                                zArr[i86][i91] = true;
                                break;
                            }
                            i93 = i94 + 1;
                        }
                    }
                    if (zArr[i86][i91]) {
                        if (i87 <= 0 || i86 != i87) {
                            xd1Var.t(iC);
                        } else {
                            iArr37[i91] = xd1Var.i(iC);
                        }
                    }
                } else {
                    n1Var = n1VarG2;
                    zArr = zArr15;
                }
                i91++;
                n1VarG2 = n1Var;
                zArr15 = zArr;
            }
            n1 n1Var2 = n1VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr35[i86] == 1 && iArr27[iArr34[i86]] > 0) {
                xd1Var.s();
            }
            i86++;
            n1VarG2 = n1Var2;
            zArr15 = zArr16;
            i85 = 2;
        }
        n1 n1Var3 = n1VarG2;
        boolean[][] zArr17 = zArr15;
        if (i87 == 0) {
            return new k5.g((n1) null, iVar2, (s1) null, (i) null);
        }
        int iM6 = xd1Var.m();
        int i95 = iM6 + 1;
        e0 e0VarV = j0.v(i95);
        int[] iArr39 = new int[i25];
        int i96 = 0;
        while (i96 < i95) {
            int i97 = xd1Var.i(16);
            int i98 = xd1Var.i(16);
            if (xd1Var.h()) {
                i12 = xd1Var.i(2);
                if (i12 == 3) {
                    xd1Var.s();
                }
                i13 = xd1Var.i(4);
                i14 = xd1Var.i(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (xd1Var.h()) {
                int iM7 = xd1Var.m();
                int iM8 = xd1Var.m();
                int iM9 = xd1Var.m();
                int iM10 = xd1Var.m();
                i97 = l1.d.b(iM7, iM8, (i12 == 1 || i12 == 2) ? 2 : 1, i97);
                i98 = l1.d.b(iM9, iM10, i12 == 1 ? 2 : 1, i98);
            }
            e0VarV.b(new j(i12, i13, i14, i97, i98));
            i96++;
            n1Var3 = n1Var3;
            n1VarG = n1VarG;
            iArr37 = iArr37;
        }
        n1 n1Var4 = n1VarG;
        int[] iArr40 = iArr37;
        n1 n1Var5 = n1Var3;
        if (i95 <= 1 || !xd1Var.h()) {
            for (int i99 = 1; i99 < i25; i99++) {
                iArr39[i99] = Math.min(i99, iM6);
            }
        } else {
            double d10 = i95;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = ra.c.c(d10);
            for (int i100 = 1; i100 < i25; i100++) {
                iArr39[i100] = xd1Var.i(iC2);
            }
        }
        s1 s1Var = new s1(e0VarV.g(), iArr39);
        xd1Var.t(2);
        for (int i101 = 1; i101 < i25; i101++) {
            if (iArr27[iArr26[i101]] == 0) {
                xd1Var.s();
            }
        }
        for (int i102 = 1; i102 < iM5; i102++) {
            boolean zH12 = xd1Var.h();
            int i103 = 0;
            while (i103 < iArr32[i102]) {
                if ((i103 <= 0 || !zH12) ? i103 == 0 : xd1Var.h()) {
                    for (int i104 = 0; i104 < iArr36[i102]; i104++) {
                        if (zArr17[i102][i104]) {
                            xd1Var.m();
                        }
                    }
                    xd1Var.m();
                    xd1Var.m();
                }
                i103++;
            }
        }
        int iM11 = xd1Var.m() + 2;
        if (xd1Var.h()) {
            xd1Var.t(iM11);
        } else {
            for (int i105 = 1; i105 < i25; i105++) {
                for (int i106 = 0; i106 < i105; i106++) {
                    if (zArr12[i105][i106]) {
                        xd1Var.t(iM11);
                    }
                }
            }
        }
        int iM12 = xd1Var.m();
        for (int i107 = 1; i107 <= iM12; i107++) {
            xd1Var.t(8);
        }
        if (xd1Var.h()) {
            int i108 = xd1Var.f21846e;
            if (i108 > 0) {
                xd1Var.t(8 - i108);
            }
            if (!xd1Var.h() ? xd1Var.h() : true) {
                xd1Var.s();
            }
            boolean zH13 = xd1Var.h();
            boolean zH14 = xd1Var.h();
            if (zH13 || zH14) {
                for (int i109 = 0; i109 < iM2; i109++) {
                    for (int i110 = 0; i110 < iArr32[i109]; i110++) {
                        boolean zH15 = zH13 ? xd1Var.h() : false;
                        boolean zH16 = zH14 ? xd1Var.h() : false;
                        if (zH15) {
                            xd1Var.t(32);
                        }
                        if (zH16) {
                            xd1Var.t(18);
                        }
                    }
                }
            }
            boolean zH17 = xd1Var.h();
            int i111 = zH17 ? xd1Var.i(4) + 1 : i25;
            e0 e0VarV2 = j0.v(i111);
            int[] iArr41 = new int[i25];
            for (int i112 = 0; i112 < i111; i112++) {
                xd1Var.t(3);
                int i113 = xd1Var.h() ? 1 : 2;
                int iF = i1.h.f(xd1Var.i(8));
                int iG = i1.h.g(xd1Var.i(8));
                xd1Var.t(8);
                e0VarV2.b(new k(iF, i113, iG));
            }
            if (zH17 && i111 > 1) {
                for (int i114 = 0; i114 < i25; i114++) {
                    iArr41[i114] = xd1Var.i(4);
                }
            }
            iVar = new i(e0VarV2.g(), iArr41, 1);
        } else {
            iVar = null;
        }
        return new k5.g(n1Var4, new i(n1Var5, iArr40, 0), s1Var, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01be  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:120:0x0206  */
    /* JADX WARN: Code duplicated, block: B:121:0x0209  */
    /* JADX WARN: Code duplicated, block: B:124:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0229  */
    /* JADX WARN: Code duplicated, block: B:133:0x0232  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:139:0x0245  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a2  */
    public static m k(byte[] bArr, int i10, int i11) {
        int iM;
        int iM2;
        int i12;
        boolean z10;
        int i13;
        int iM3;
        boolean z11;
        boolean zH;
        int i14;
        int iB;
        int iB2;
        int i15;
        int iM4;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int iG;
        int iF;
        boolean zH2;
        boolean zH3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        xd1 xd1Var = new xd1(bArr, i10 + 1, i11);
        int i26 = xd1Var.i(8);
        int i27 = xd1Var.i(8);
        int i28 = xd1Var.i(8);
        int iM5 = xd1Var.m();
        if (i26 == 100 || i26 == 110 || i26 == 122 || i26 == 244 || i26 == 44 || i26 == 83 || i26 == 86 || i26 == 118 || i26 == 128 || i26 == 138) {
            iM = xd1Var.m();
            boolean zH4 = iM == 3 ? xd1Var.h() : false;
            int iM6 = xd1Var.m();
            iM2 = xd1Var.m();
            xd1Var.s();
            if (xd1Var.h()) {
                int i29 = iM != 3 ? 8 : 12;
                i12 = 16;
                int i30 = 0;
                while (i30 < i29) {
                    if (xd1Var.h()) {
                        int i31 = i30 < 6 ? 16 : 64;
                        int iN = 8;
                        int i32 = 8;
                        for (int i33 = 0; i33 < i31; i33++) {
                            if (iN != 0) {
                                iN = ((xd1Var.n() + i32) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            if (iN != 0) {
                                i32 = iN;
                            }
                        }
                    }
                    i30++;
                }
            } else {
                i12 = 16;
            }
            z10 = zH4;
            i13 = iM6;
        } else {
            iM = 1;
            i12 = 16;
            i13 = 0;
            z10 = false;
            iM2 = 0;
        }
        int iM7 = xd1Var.m() + 4;
        int iM8 = xd1Var.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = xd1Var.h();
                xd1Var.n();
                xd1Var.n();
                i26 = i26;
                long jM = xd1Var.m();
                iM8 = iM8;
                for (int i34 = 0; i34 < jM; i34++) {
                    xd1Var.m();
                }
                iM2 = iM2;
                z11 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            xd1Var.m();
            xd1Var.s();
            int iM9 = xd1Var.m() + 1;
            int iM10 = xd1Var.m() + 1;
            zH = xd1Var.h();
            i14 = 2 - (zH ? 1 : 0);
            int i35 = iM10 * i14;
            if (!zH) {
                xd1Var.s();
            }
            xd1Var.s();
            iB = iM9 * 16;
            iB2 = i35 * 16;
            if (xd1Var.h()) {
                int iM11 = xd1Var.m();
                int iM12 = xd1Var.m();
                int iM13 = xd1Var.m();
                int iM14 = xd1Var.m();
                if (iM == 0) {
                    i15 = 1;
                    i25 = 1;
                } else {
                    if (iM == 3) {
                        i23 = 1;
                    } else {
                        i23 = 2;
                    }
                    i15 = 1;
                    if (iM == 1) {
                        i24 = 2;
                    } else {
                        i24 = 1;
                    }
                    i14 *= i24;
                    i25 = i23;
                }
                iB = l1.d.b(iM11, iM12, i25, iB);
                iB2 = l1.d.b(iM13, iM14, i14, iB2);
            } else {
                i27 = i27;
                i15 = 1;
            }
            int i36 = iB2;
            int i37 = iB;
            int i38 = i26;
            iM4 = ((i38 != 44 || i38 == 86 || i38 == 100 || i38 == 110 || i38 == 122 || i38 == 244) && (i27 & 16) != 0) ? 0 : i12;
            f10 = 1.0f;
            if (xd1Var.h()) {
                if (xd1Var.h()) {
                    i20 = xd1Var.i(8);
                    if (i20 == 255) {
                        int i39 = i12;
                        i21 = xd1Var.i(i39);
                        i22 = xd1Var.i(i39);
                        if (i21 != 0 && i22 != 0) {
                            f10 = i21 / i22;
                        }
                    } else if (i20 < 17) {
                        f10 = f45821b[i20];
                    } else {
                        u.v(i20, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (xd1Var.h()) {
                    xd1Var.s();
                }
                if (xd1Var.h()) {
                    xd1Var.t(3);
                    if (!xd1Var.h()) {
                        i15 = 2;
                    }
                    if (xd1Var.h()) {
                        int i40 = xd1Var.i(8);
                        int i41 = xd1Var.i(8);
                        xd1Var.t(8);
                        iF = i1.h.f(i40);
                        iG = i1.h.g(i41);
                    } else {
                        iG = -1;
                        iF = -1;
                    }
                } else {
                    iG = -1;
                    iF = -1;
                    i15 = -1;
                }
                if (xd1Var.h()) {
                    xd1Var.m();
                    xd1Var.m();
                }
                if (xd1Var.h()) {
                    xd1Var.t(65);
                }
                zH2 = xd1Var.h();
                if (zH2) {
                    l(xd1Var);
                }
                zH3 = xd1Var.h();
                if (zH3) {
                    l(xd1Var);
                }
                if (zH2 || zH3) {
                    xd1Var.s();
                }
                xd1Var.s();
                if (xd1Var.h()) {
                    xd1Var.s();
                    xd1Var.m();
                    xd1Var.m();
                    xd1Var.m();
                    xd1Var.m();
                    iM4 = xd1Var.m();
                    xd1Var.m();
                }
                i16 = iM4;
                i19 = iG;
                i17 = iF;
                i18 = i15;
            } else {
                i16 = iM4;
                i17 = -1;
                i18 = -1;
                i19 = -1;
            }
            return new m(i38, i27, i28, iM5, i37, i36, f10, i13, iM2, z10, zH, iM7, iM8, iM3, z11, i17, i18, i19, i16);
        }
        iM3 = xd1Var.m() + 4;
        z11 = false;
        xd1Var.m();
        xd1Var.s();
        int iM15 = xd1Var.m() + 1;
        int iM16 = xd1Var.m() + 1;
        zH = xd1Var.h();
        i14 = 2 - (zH ? 1 : 0);
        int i310 = iM16 * i14;
        if (!zH) {
            xd1Var.s();
        }
        xd1Var.s();
        iB = iM15 * 16;
        iB2 = i310 * 16;
        if (xd1Var.h()) {
            int iM17 = xd1Var.m();
            int iM18 = xd1Var.m();
            int iM19 = xd1Var.m();
            int iM110 = xd1Var.m();
            if (iM == 0) {
                i15 = 1;
                i25 = 1;
            } else {
                if (iM == 3) {
                    i23 = 1;
                } else {
                    i23 = 2;
                }
                i15 = 1;
                if (iM == 1) {
                    i24 = 2;
                } else {
                    i24 = 1;
                }
                i14 *= i24;
                i25 = i23;
            }
            iB = l1.d.b(iM17, iM18, i25, iB);
            iB2 = l1.d.b(iM19, iM110, i14, iB2);
        } else {
            i27 = i27;
            i15 = 1;
        }
        int i311 = iB2;
        int i312 = iB;
        int i313 = i26;
        if (i313 != 44) {
        }
        f10 = 1.0f;
        if (xd1Var.h()) {
            if (xd1Var.h()) {
                i20 = xd1Var.i(8);
                if (i20 == 255) {
                    int i314 = i12;
                    i21 = xd1Var.i(i314);
                    i22 = xd1Var.i(i314);
                    if (i21 != 0) {
                        f10 = i21 / i22;
                    }
                } else if (i20 < 17) {
                    f10 = f45821b[i20];
                } else {
                    u.v(i20, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (xd1Var.h()) {
                xd1Var.s();
            }
            if (xd1Var.h()) {
                xd1Var.t(3);
                if (!xd1Var.h()) {
                    i15 = 2;
                }
                if (xd1Var.h()) {
                    int i42 = xd1Var.i(8);
                    int i43 = xd1Var.i(8);
                    xd1Var.t(8);
                    iF = i1.h.f(i42);
                    iG = i1.h.g(i43);
                } else {
                    iG = -1;
                    iF = -1;
                }
            } else {
                iG = -1;
                iF = -1;
                i15 = -1;
            }
            if (xd1Var.h()) {
                xd1Var.m();
                xd1Var.m();
            }
            if (xd1Var.h()) {
                xd1Var.t(65);
            }
            zH2 = xd1Var.h();
            if (zH2) {
                l(xd1Var);
            }
            zH3 = xd1Var.h();
            if (zH3) {
                l(xd1Var);
            }
            if (zH2) {
                xd1Var.s();
            } else {
                xd1Var.s();
            }
            xd1Var.s();
            if (xd1Var.h()) {
                xd1Var.s();
                xd1Var.m();
                xd1Var.m();
                xd1Var.m();
                xd1Var.m();
                iM4 = xd1Var.m();
                xd1Var.m();
            }
            i16 = iM4;
            i19 = iG;
            i17 = iF;
            i18 = i15;
        } else {
            i16 = iM4;
            i17 = -1;
            i18 = -1;
            i19 = -1;
        }
        return new m(i313, i27, i28, iM5, i312, i311, f10, i13, iM2, z10, zH, iM7, iM8, iM3, z11, i17, i18, i19, i16);
    }

    public static void l(xd1 xd1Var) {
        int iM = xd1Var.m() + 1;
        xd1Var.t(8);
        for (int i10 = 0; i10 < iM; i10++) {
            xd1Var.m();
            xd1Var.m();
            xd1Var.s();
        }
        xd1Var.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b10 = byteBufferAsReadOnlyBuffer.get();
                int i10 = (b10 >> 3) & 15;
                if (((b10 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b10 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b11 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b11 & 127) << (i11 * 7);
                        if ((b11 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new p(i10, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int n(byte[] bArr, int i10) {
        int i11;
        synchronized (f45822c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f45823d;
                    if (iArr.length <= i13) {
                        f45823d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f45823d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f45823d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
