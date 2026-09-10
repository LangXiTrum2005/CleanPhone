package androidx.core.graphics;

import android.graphics.Path;
import android.support.v4.media.a;
import android.util.Log;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PathParser {

    public static class ExtractFloatResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4300a;
    }

    public static boolean a(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            PathDataNode pathDataNode = pathDataNodeArr[i2];
            char c2 = pathDataNode.f4301a;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i2];
            if (c2 != pathDataNode2.f4301a || pathDataNode.f4302b.length != pathDataNode2.f4302b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4 A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[Catch: NumberFormatException -> 0x00b2, TryCatch #0 {NumberFormatException -> 0x00b2, blocks: (B:22:0x0054, B:24:0x0067, B:25:0x006e, B:27:0x0074, B:31:0x0080, B:45:0x009f, B:35:0x0089, B:40:0x0095, B:47:0x00a4, B:50:0x00b4, B:54:0x00bb, B:55:0x00be), top: B:70:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static PathDataNode[] c(String str) {
        int i2;
        String strTrim;
        float[] fArrB;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < str.length()) {
            while (i6 < str.length()) {
                char cCharAt = str.charAt(i6);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i5, i6).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i4) != 'z' || strTrim.charAt(i4) == 'Z') {
                                fArrB = new float[i4];
                                i3 = i4;
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    ExtractFloatResult extractFloatResult = new ExtractFloatResult();
                                    int length = strTrim.length();
                                    int i7 = i4;
                                    int i8 = 1;
                                    boolean z6 = i4;
                                    while (i8 < length) {
                                        extractFloatResult.f4300a = z6;
                                        boolean z7 = z6;
                                        boolean z8 = z7 ? 1 : 0;
                                        boolean z9 = z8 ? 1 : 0;
                                        int i9 = i8;
                                        boolean z10 = z7;
                                        boolean z11 = z8;
                                        while (i9 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i9);
                                            if (cCharAt2 == ' ') {
                                                z2 = false;
                                                z3 = true;
                                                z4 = z11;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case '-':
                                                        z5 = z9;
                                                        z5 = z9;
                                                        if (i9 != i8 && !z10) {
                                                            extractFloatResult.f4300a = true;
                                                            break;
                                                        } else {
                                                            z2 = false;
                                                            z4 = z11;
                                                            z3 = z5;
                                                            break;
                                                        }
                                                    case ',':
                                                        z2 = false;
                                                        z3 = true;
                                                        z4 = z11;
                                                        break;
                                                    case '.':
                                                        if (!z11) {
                                                            z2 = false;
                                                            z4 = true;
                                                        } else {
                                                            extractFloatResult.f4300a = true;
                                                            z5 = true;
                                                            z2 = false;
                                                            z4 = z11;
                                                            z3 = z5;
                                                        }
                                                        break;
                                                    default:
                                                        z5 = z9;
                                                        z2 = false;
                                                        z4 = z11;
                                                        z3 = z5;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                                z4 = z11;
                                                z3 = z9;
                                            }
                                            if (z3) {
                                                z3 = z9;
                                                if (i8 < i9) {
                                                    int i10 = (i7 == true ? 1 : 0) + 1;
                                                    fArr[i7 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i8, i9));
                                                    i7 = i10;
                                                }
                                                if (extractFloatResult.f4300a) {
                                                    i8 = i9;
                                                } else {
                                                    i8 = i9 + 1;
                                                }
                                                z6 = 0;
                                                i7 = i7;
                                            } else {
                                                z3 = z9;
                                                i9++;
                                                z10 = z2;
                                                z11 = z4;
                                                z9 = z3;
                                            }
                                        }
                                        if (i8 < i9) {
                                            int i11 = (i7 == true ? 1 : 0) + 1;
                                            fArr[i7 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i8, i9));
                                            i7 = i11;
                                        }
                                        if (extractFloatResult.f4300a) {
                                            i8 = i9;
                                        } else {
                                            i8 = i9 + 1;
                                        }
                                        z6 = 0;
                                        i7 = i7;
                                    }
                                    fArrB = b(fArr, i7 == true ? 1 : 0);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    throw new RuntimeException(a.n("error in parsing \"", strTrim, "\""), e2);
                                }
                            }
                            arrayList.add(new PathDataNode(strTrim.charAt(i3), fArrB));
                        }
                        i5 = i6;
                        i6++;
                        i4 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i6++;
            }
            strTrim = str.substring(i5, i6).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i4) != 'z') {
                    fArrB = new float[i4];
                    i3 = i4;
                } else {
                    fArrB = new float[i4];
                    i3 = i4;
                }
                arrayList.add(new PathDataNode(strTrim.charAt(i3), fArrB));
            }
            i5 = i6;
            i6++;
            i4 = 0;
        }
        if (i6 - i5 != 1 || i5 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new PathDataNode(str.charAt(i5), new float[0]));
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[i2]);
    }

    public static PathDataNode[] d(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    public static class PathDataNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f4301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f4302b;

        public PathDataNode(char c2, float[] fArr) {
            this.f4301a = c2;
            this.f4302b = fArr;
        }

        public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
            double d7 = f6;
            double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
            double d9 = f4;
            double d10 = ((d9 * dSin) + (((double) f3) * dCos)) / d5;
            double d11 = ((d9 * dCos) + (((double) (-f3)) * dSin)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d13 * d13) + (d12 * d12);
            if (d16 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d16);
                float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z2, z3);
                return;
            }
            double dSqrt = Math.sqrt(d17);
            double d18 = dSqrt * d12;
            double d19 = dSqrt * d13;
            if (z2 == z3) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double dAtan2 = Math.atan2(d8 - d2, d6 - d);
            double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
            if (z3 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            double d22 = (d20 * dCos) - (d21 * dSin);
            double d23 = (d21 * dCos) + (d20 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d24 = -d5;
            double d25 = d24 * dCos2;
            double d26 = d7 * dSin2;
            double d27 = (d25 * dSin3) - (d26 * dCos3);
            double d28 = d24 * dSin2;
            double d29 = d7 * dCos2;
            double d30 = dAtan3 / ((double) iCeil);
            double d31 = (dCos3 * d29) + (dSin3 * d28);
            double d32 = d3;
            double d33 = d4;
            int i2 = 0;
            double d34 = dAtan2;
            while (i2 < iCeil) {
                double d35 = d34 + d30;
                double dSin4 = Math.sin(d35);
                double dCos4 = Math.cos(d35);
                int i3 = iCeil;
                double d36 = (((d5 * dCos2) * dCos4) + d22) - (d26 * dSin4);
                double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + d23;
                double d38 = (d25 * dSin4) - (d26 * dCos4);
                double d39 = (dCos4 * d29) + (dSin4 * d28);
                double d40 = d35 - d34;
                double dTan = Math.tan(d40 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d27 * dSqrt2) + d32), (float) ((d31 * dSqrt2) + d33), (float) (d36 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d36, (float) d37);
                i2++;
                d33 = d37;
                dCos2 = dCos2;
                d28 = d28;
                d34 = d35;
                d31 = d39;
                d32 = d36;
                iCeil = i3;
                d27 = d38;
                d30 = d30;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void b(PathDataNode[] pathDataNodeArr, Path path) {
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float[] fArr = new float[6];
            int length = pathDataNodeArr.length;
            char c2 = 'm';
            int i4 = 0;
            char c3 = 'm';
            int i5 = 0;
            while (i5 < length) {
                PathDataNode pathDataNode = pathDataNodeArr[i5];
                char c4 = pathDataNode.f4301a;
                float f13 = fArr[i4];
                float f14 = fArr[1];
                float f15 = fArr[2];
                float f16 = fArr[3];
                float f17 = fArr[4];
                float f18 = fArr[5];
                switch (c4) {
                    case 'A':
                    case 'a':
                        i2 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i2 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i2 = 1;
                        break;
                    case mo.oom.m00 /* 81 */:
                    case 'S':
                    case 'q':
                    case 's':
                        i2 = 4;
                        break;
                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                    case 'z':
                        path.close();
                        path.moveTo(f17, f18);
                        f13 = f17;
                        f15 = f13;
                        f14 = f18;
                        f16 = f14;
                    default:
                        i2 = 2;
                        break;
                }
                float f19 = f14;
                float f20 = f17;
                float f21 = f18;
                float f22 = f13;
                int i6 = i4;
                while (true) {
                    float[] fArr2 = pathDataNode.f4302b;
                    if (i6 < fArr2.length) {
                        int i7 = i4;
                        if (c4 == 'A') {
                            i3 = i6;
                            pathDataNode = pathDataNode;
                            float f23 = f22;
                            float f24 = f19;
                            i5 = i5;
                            c4 = c4;
                            int i8 = i3 + 5;
                            int i9 = i3 + 6;
                            a(path, f23, f24, fArr2[i8], fArr2[i9], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f ? 1 : i7, fArr2[i3 + 4] != 0.0f ? 1 : i7);
                            f15 = fArr2[i8];
                            f = fArr2[i9];
                            f16 = f;
                            f2 = f15;
                        } else if (c4 == 'C') {
                            i3 = i6;
                            i5 = i5;
                            pathDataNode = pathDataNode;
                            c4 = c4;
                            int i10 = i3 + 2;
                            int i11 = i3 + 3;
                            int i12 = i3 + 4;
                            int i13 = i3 + 5;
                            path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                            float f25 = fArr2[i12];
                            float f26 = fArr2[i13];
                            f15 = fArr2[i10];
                            f16 = fArr2[i11];
                            f = f26;
                            f2 = f25;
                        } else if (c4 != 'H') {
                            if (c4 == 'Q') {
                                i3 = i6;
                                int i14 = i3 + 1;
                                int i15 = i3 + 2;
                                int i16 = i3 + 3;
                                path.quadTo(fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                f3 = fArr2[i3];
                                float f27 = fArr2[i14];
                                f4 = fArr2[i15];
                                f16 = f27;
                                f = fArr2[i16];
                            } else if (c4 == 'V') {
                                i3 = i6;
                                i5 = i5;
                                pathDataNode = pathDataNode;
                                f2 = f22;
                                c4 = c4;
                                path.lineTo(f2, fArr2[i3]);
                                f = fArr2[i3];
                            } else if (c4 != 'a') {
                                if (c4 == 'c') {
                                    i3 = i6;
                                    int i17 = i3 + 2;
                                    int i18 = i3 + 3;
                                    int i19 = i3 + 4;
                                    int i20 = i3 + 5;
                                    path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    float f28 = fArr2[i17] + f22;
                                    float f29 = f19 + fArr2[i18];
                                    f22 += fArr2[i19];
                                    f19 += fArr2[i20];
                                    f15 = f28;
                                    f16 = f29;
                                } else if (c4 != 'h') {
                                    if (c4 != 'q') {
                                        if (c4 != 'v') {
                                            if (c4 != 'L') {
                                                if (c4 == 'M') {
                                                    i3 = i6;
                                                    f2 = fArr2[i3];
                                                    f = fArr2[i3 + 1];
                                                    if (i3 > 0) {
                                                        path.lineTo(f2, f);
                                                    } else {
                                                        path.moveTo(f2, f);
                                                        f20 = f2;
                                                        f21 = f;
                                                    }
                                                } else if (c4 == 'S') {
                                                    i3 = i6;
                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                        f22 = (f22 * 2.0f) - f15;
                                                        f19 = (f19 * 2.0f) - f16;
                                                    }
                                                    float f30 = f22;
                                                    float f31 = f19;
                                                    int i21 = i3 + 1;
                                                    int i22 = i3 + 2;
                                                    int i23 = i3 + 3;
                                                    path.cubicTo(f30, f31, fArr2[i3], fArr2[i21], fArr2[i22], fArr2[i23]);
                                                    f3 = fArr2[i3];
                                                    float f32 = fArr2[i21];
                                                    f4 = fArr2[i22];
                                                    f16 = f32;
                                                    f = fArr2[i23];
                                                } else if (c4 == 'T') {
                                                    i3 = i6;
                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                        f22 = (f22 * 2.0f) - f15;
                                                        f19 = (f19 * 2.0f) - f16;
                                                    }
                                                    float f33 = f19;
                                                    float f34 = fArr2[i3];
                                                    int i24 = i3 + 1;
                                                    path.quadTo(f22, f33, f34, fArr2[i24]);
                                                    f16 = f33;
                                                    f2 = fArr2[i3];
                                                    f = fArr2[i24];
                                                    pathDataNode = pathDataNode;
                                                    f15 = f22;
                                                } else if (c4 == 'l') {
                                                    i3 = i6;
                                                    int i25 = i3 + 1;
                                                    path.rLineTo(fArr2[i3], fArr2[i25]);
                                                    f22 += fArr2[i3];
                                                    f8 = fArr2[i25];
                                                } else if (c4 != c2) {
                                                    if (c4 == 's') {
                                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                            f9 = f19 - f16;
                                                            f10 = f22 - f15;
                                                        } else {
                                                            f10 = 0.0f;
                                                            f9 = 0.0f;
                                                        }
                                                        int i26 = i6 + 1;
                                                        int i27 = i6 + 2;
                                                        int i28 = i6 + 3;
                                                        i3 = i6;
                                                        path.rCubicTo(f10, f9, fArr2[i6], fArr2[i26], fArr2[i27], fArr2[i28]);
                                                        f5 = fArr2[i3] + f22;
                                                        f6 = f19 + fArr2[i26];
                                                        f22 += fArr2[i27];
                                                        f7 = fArr2[i28];
                                                    } else if (c4 != 't') {
                                                        i3 = i6;
                                                    } else {
                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                            f11 = f22 - f15;
                                                            f12 = f19 - f16;
                                                        } else {
                                                            f12 = 0.0f;
                                                            f11 = 0.0f;
                                                        }
                                                        int i29 = i6 + 1;
                                                        path.rQuadTo(f11, f12, fArr2[i6], fArr2[i29]);
                                                        float f35 = f11 + f22;
                                                        float f36 = f19 + f12;
                                                        float f37 = f22 + fArr2[i6];
                                                        f19 += fArr2[i29];
                                                        f16 = f36;
                                                        i3 = i6;
                                                        f2 = f37;
                                                        f15 = f35;
                                                    }
                                                    f = f19;
                                                } else {
                                                    i3 = i6;
                                                    float f38 = fArr2[i3];
                                                    f22 += f38;
                                                    float f39 = fArr2[i3 + 1];
                                                    f19 += f39;
                                                    if (i3 > 0) {
                                                        path.rLineTo(f38, f39);
                                                    } else {
                                                        path.rMoveTo(f38, f39);
                                                        pathDataNode = pathDataNode;
                                                        f2 = f22;
                                                        f20 = f2;
                                                        f = f19;
                                                        f21 = f;
                                                    }
                                                }
                                                c4 = c4;
                                            } else {
                                                i3 = i6;
                                                int i30 = i3 + 1;
                                                path.lineTo(fArr2[i3], fArr2[i30]);
                                                f2 = fArr2[i3];
                                                f = fArr2[i30];
                                            }
                                            pathDataNode = pathDataNode;
                                            c4 = c4;
                                        } else {
                                            i3 = i6;
                                            path.rLineTo(0.0f, fArr2[i3]);
                                            f8 = fArr2[i3];
                                        }
                                        f19 += f8;
                                    } else {
                                        i3 = i6;
                                        int i31 = i3 + 1;
                                        int i32 = i3 + 2;
                                        int i33 = i3 + 3;
                                        path.rQuadTo(fArr2[i3], fArr2[i31], fArr2[i32], fArr2[i33]);
                                        f5 = fArr2[i3] + f22;
                                        f6 = f19 + fArr2[i31];
                                        f22 += fArr2[i32];
                                        f7 = fArr2[i33];
                                    }
                                    f19 += f7;
                                    f15 = f5;
                                    f16 = f6;
                                } else {
                                    i3 = i6;
                                    path.rLineTo(fArr2[i3], 0.0f);
                                    f22 += fArr2[i3];
                                }
                                f2 = f22;
                                f = f19;
                                c4 = c4;
                            } else {
                                i3 = i6;
                                int i34 = i3 + 5;
                                float f40 = fArr2[i34] + f22;
                                int i35 = i3 + 6;
                                float f41 = fArr2[i35] + f19;
                                pathDataNode = pathDataNode;
                                float f42 = f22;
                                c4 = c4;
                                float f43 = f19;
                                i5 = i5;
                                a(path, f42, f43, f40, f41, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f ? 1 : i7, fArr2[i3 + 4] != 0.0f ? 1 : i7);
                                f2 = f42 + fArr2[i34];
                                f = f43 + fArr2[i35];
                                f15 = f2;
                                f16 = f;
                            }
                            f15 = f3;
                            f2 = f4;
                        } else {
                            i3 = i6;
                            pathDataNode = pathDataNode;
                            c4 = c4;
                            f = f19;
                            i5 = i5;
                            path.lineTo(fArr2[i3], f);
                            f2 = fArr2[i3];
                        }
                        c4 = c4;
                        pathDataNode = pathDataNode;
                        i5 = i5;
                        i4 = i7;
                        c2 = 'm';
                        f22 = f2;
                        f19 = f;
                        c3 = c4;
                        i6 = i3 + i2;
                        path = path;
                    }
                }
                int i36 = i4;
                fArr[i36] = f22;
                fArr[1] = f19;
                fArr[2] = f15;
                fArr[3] = f16;
                fArr[4] = f20;
                fArr[5] = f21;
                c3 = pathDataNode.f4301a;
                i5++;
                i4 = i36;
                c2 = 'm';
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.f4301a = pathDataNode.f4301a;
            float[] fArr = pathDataNode.f4302b;
            this.f4302b = PathParser.b(fArr, fArr.length);
        }
    }
}
