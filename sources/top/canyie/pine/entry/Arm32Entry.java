package top.canyie.pine.entry;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import top.canyie.pine.Pine;
import top.canyie.pine.PineConfig;
import top.canyie.pine.utils.Primitives;

/* JADX INFO: loaded from: classes7.dex */
public final class Arm32Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f48867a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f48868b = new float[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f48869c;
    public static final boolean d;

    public static class ParamTypesCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48872c;
    }

    static {
        int i2 = PineConfig.f48864a;
        f48869c = i2 >= 23;
        d = i2 >= 31;
    }

    private static boolean booleanBridge(int i2, int i3, int i4) throws Throwable {
        return ((Boolean) handleBridge(i2, i3, i4)).booleanValue();
    }

    private static byte byteBridge(int i2, int i3, int i4) throws Throwable {
        return ((Byte) handleBridge(i2, i3, i4)).byteValue();
    }

    private static char charBridge(int i2, int i3, int i4) throws Throwable {
        return ((Character) handleBridge(i2, i3, i4)).charValue();
    }

    private static double doubleBridge(int i2, int i3, int i4) throws Throwable {
        return ((Double) handleBridge(i2, i3, i4)).doubleValue();
    }

    private static float floatBridge(int i2, int i3, int i4) throws Throwable {
        return ((Float) handleBridge(i2, i3, i4)).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object handleBridge(int i2, int i3, int i4) throws Throwable {
        int i5;
        int i6;
        int i7;
        int iMin;
        Object objC;
        int i8;
        Object[] objArr;
        Class cls;
        int i9;
        Object objC2;
        Object objValueOf;
        int i10;
        int i11;
        int i12;
        Object objValueOf2;
        int i13;
        int i14;
        int i15;
        int iCloneExtras = (int) Pine.cloneExtras(i3);
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(iCloneExtras), Integer.valueOf(i4)};
        if (PineConfig.f48865b) {
            Log.i("Pine", String.format("handleBridge: artMethod=%#x originExtras=%#x extras=%#x sp=%#x", objArr2));
        }
        Pine.HookRecord hookRecordB = Pine.b(i2);
        Object obj = hookRecordB.g;
        Class cls2 = Long.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (obj == null) {
            iMin = !hookRecordB.f48862c ? 1 : 0;
            i6 = iMin;
            int i16 = 0;
            int i17 = 0;
            for (Class cls5 : hookRecordB.f48863e) {
                if (cls5 == cls4) {
                    i16++;
                    i6++;
                } else if (cls5 == cls3) {
                    i17++;
                } else {
                    if (cls5 == cls2) {
                        if (iMin == 0) {
                            iMin++;
                        }
                        if (iMin < 3) {
                            iMin++;
                        }
                        i6++;
                    }
                    if (iMin < 3) {
                        iMin++;
                    }
                }
                i6++;
            }
            i5 = 0;
            i7 = (i16 * 2) + i17;
            ParamTypesCache paramTypesCache = new ParamTypesCache();
            paramTypesCache.f48870a = iMin;
            paramTypesCache.f48871b = i6;
            paramTypesCache.f48872c = i7;
            hookRecordB.g = paramTypesCache;
        } else {
            i5 = 0;
            ParamTypesCache paramTypesCache2 = (ParamTypesCache) hookRecordB.g;
            int i18 = paramTypesCache2.f48870a;
            i6 = paramTypesCache2.f48871b;
            i7 = paramTypesCache2.f48872c;
            iMin = i18;
        }
        float[] fArr = f48868b;
        if (!f48869c) {
            iMin = Math.min(iMin + i7, 3);
        } else if (i7 != 0) {
            if ((i7 & 1) == 1) {
                i7++;
            }
            fArr = new float[Math.min(i7, 16)];
        }
        int[] iArr = f48867a;
        int[] iArr2 = iMin != 0 ? new int[iMin] : iArr;
        if (i6 != 0) {
            iArr = new int[i6];
        }
        Pine.getArgsArm32(iCloneExtras, i4, iArr2, iArr, fArr);
        long jCurrentArtThread0 = Pine.currentArtThread0();
        if (hookRecordB.f48862c) {
            objC = null;
            i8 = i5;
        } else {
            objC = Pine.c(jCurrentArtThread0, iArr2[i5]);
            i8 = 1;
        }
        int i19 = i8;
        int i20 = hookRecordB.d;
        if (i20 > 0) {
            objArr = new Object[i20];
            int iMax = i5;
            int i21 = iMax;
            int i22 = 2;
            int[] iArr3 = iArr;
            int iMax2 = i21;
            while (i21 < hookRecordB.d) {
                Class cls6 = hookRecordB.f48863e[i21];
                if (cls6 == cls4) {
                    cls = cls4;
                    iMax2 = Math.max(iMax2, (iMax & 1) == 1 ? iMax + 1 : iMax);
                    if (iMax2 < fArr.length) {
                        int i23 = iMax2 + 1;
                        float f = fArr[iMax2];
                        iMax2 += 2;
                        objValueOf = Double.valueOf(Double.longBitsToDouble(Primitives.a(Float.floatToIntBits(f), Float.floatToIntBits(fArr[i23]))));
                        i19++;
                        iArr2 = iArr2;
                        objArr[i21] = objValueOf;
                        i19++;
                    } else {
                        if (i8 >= iArr2.length || f48869c) {
                            i14 = iArr3[i19];
                        } else {
                            i14 = iArr2[i8];
                            i8++;
                        }
                        i19++;
                        if (i8 >= iArr2.length || f48869c) {
                            int i24 = i8;
                            i15 = iArr3[i19];
                            i12 = i24;
                        } else {
                            i12 = i8 + 1;
                            i15 = iArr2[i8];
                        }
                        objValueOf2 = Double.valueOf(Double.longBitsToDouble(Primitives.a(i14, i15)));
                        iArr2 = iArr2;
                        i8 = i12;
                        objValueOf = objValueOf2;
                        objArr[i21] = objValueOf;
                        i19++;
                    }
                } else {
                    cls = cls4;
                    if (cls6 == cls3) {
                        if (iMax % 2 == 0) {
                            iMax = Math.max(iMax2, iMax);
                        }
                        if (iMax < fArr.length) {
                            objValueOf = Float.valueOf(fArr[iMax]);
                            iMax++;
                        } else {
                            if (i8 >= iArr2.length || f48869c) {
                                i13 = iArr3[i19];
                            } else {
                                i13 = iArr2[i8];
                                i8++;
                            }
                            objValueOf = Float.valueOf(Float.intBitsToFloat(i13));
                        }
                        iArr2 = iArr2;
                        objArr[i21] = objValueOf;
                        i19++;
                    } else if (cls6 != cls2) {
                        if (i8 < iArr2.length) {
                            i8++;
                            i9 = iArr2[i8];
                        } else {
                            int i25 = i8;
                            i9 = iArr3[i19];
                            i8 = i25;
                        }
                        if (!cls6.isPrimitive()) {
                            objC2 = Pine.c(jCurrentArtThread0, i9);
                            iMax2 = iMax2;
                        } else if (cls6 == Integer.TYPE) {
                            objC2 = Integer.valueOf(i9);
                        } else if (cls6 == Boolean.TYPE) {
                            objC2 = Boolean.valueOf(i9 != 0 ? 1 : i5);
                        } else if (cls6 == Short.TYPE) {
                            objC2 = Short.valueOf((short) i9);
                        } else if (cls6 == Character.TYPE) {
                            objC2 = Character.valueOf((char) i9);
                        } else {
                            if (cls6 != Byte.TYPE) {
                                throw new AssertionError(a.j(cls6, "Unknown primitive type: "));
                            }
                            objC2 = Byte.valueOf((byte) i9);
                        }
                        objValueOf = objC2;
                        objArr[i21] = objValueOf;
                        i19++;
                    } else if (i8 == 0 && hookRecordB.f48862c && f48869c) {
                        objArr[i21] = Long.valueOf(Primitives.a(iArr2[1], iArr2[i22]));
                        i19 += 2;
                        iArr2 = iArr2;
                        i8 = 3;
                    } else {
                        if (i8 == i22 && d) {
                            i8 = 3;
                        }
                        if (i8 < iArr2.length) {
                            int i26 = i8 + 1;
                            int i27 = iArr2[i8];
                            i8 = i26;
                            i10 = i27;
                        } else {
                            i10 = iArr3[i19];
                        }
                        i19++;
                        if (i8 < iArr2.length) {
                            i12 = i8 + 1;
                            i11 = iArr2[i8];
                        } else {
                            int i28 = i8;
                            i11 = iArr3[i19];
                            i12 = i28;
                        }
                        objValueOf2 = Long.valueOf(Primitives.a(i10, i11));
                        iArr2 = iArr2;
                        i8 = i12;
                        objValueOf = objValueOf2;
                        objArr[i21] = objValueOf;
                        i19++;
                    }
                }
                i21++;
                cls4 = cls;
                iArr2 = iArr2;
                i22 = 2;
            }
        } else {
            objArr = Pine.f48852a;
        }
        return Pine.d(hookRecordB, objC, objArr);
    }

    private static int intBridge(int i2, int i3, int i4) throws Throwable {
        return ((Integer) handleBridge(i2, i3, i4)).intValue();
    }

    private static long longBridge(int i2, int i3, int i4) throws Throwable {
        return ((Long) handleBridge(i2, i3, i4)).longValue();
    }

    private static Object objectBridge(int i2, int i3, int i4) throws Throwable {
        return handleBridge(i2, i3, i4);
    }

    private static short shortBridge(int i2, int i3, int i4) throws Throwable {
        return ((Short) handleBridge(i2, i3, i4)).shortValue();
    }

    private static void voidBridge(int i2, int i3, int i4) throws Throwable {
        handleBridge(i2, i3, i4);
    }
}
