package top.canyie.pine.entry;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import top.canyie.pine.Pine;
import top.canyie.pine.PineConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Arm64Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f48873a = new boolean[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f48874b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f48875c = new double[0];

    public static class ParamTypesCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48878c;
        public boolean[] d;
    }

    public static boolean booleanBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Boolean) handleBridge(j, j2, j3, j4, j5, j6, j7)).booleanValue();
    }

    public static byte byteBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Byte) handleBridge(j, j2, j3, j4, j5, j6, j7)).byteValue();
    }

    public static char charBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Character) handleBridge(j, j2, j3, j4, j5, j6, j7)).charValue();
    }

    public static double doubleBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Double) handleBridge(j, j2, j3, j4, j5, j6, j7)).doubleValue();
    }

    public static float floatBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Float) handleBridge(j, j2, j3, j4, j5, j6, j7)).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    private static Object handleBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        Object objC;
        int i5;
        int i6;
        Object[] objArr;
        long[] jArr;
        int i7;
        long j8;
        Object objC2;
        int i8;
        Object objValueOf;
        long jDoubleToLongBits;
        boolean z2;
        boolean z3;
        long jCloneExtras = Pine.cloneExtras(j2);
        Object[] objArr2 = {Long.valueOf(j), Long.valueOf(j2), Long.valueOf(jCloneExtras), Long.valueOf(j3)};
        if (PineConfig.f48865b) {
            Log.i("Pine", String.format("handleBridge: artMethod=%#x originExtras=%#x extras=%#x sp=%#x", objArr2));
        }
        Pine.HookRecord hookRecordB = Pine.b(j);
        Object obj = hookRecordB.g;
        Class cls = Long.TYPE;
        Class cls2 = Float.TYPE;
        Class cls3 = Double.TYPE;
        int i9 = 0;
        if (obj == null) {
            int i10 = hookRecordB.d;
            boolean z4 = hookRecordB.f48862c;
            if (z4) {
                i2 = 0;
                i3 = 0;
            } else {
                i10++;
                i2 = 1;
                i3 = 1;
            }
            if (i10 != 0) {
                zArr = new boolean[i10];
                if (!z4) {
                    zArr[0] = false;
                }
                i4 = 0;
                for (int i11 = 0; i11 < hookRecordB.d; i11++) {
                    Class cls4 = hookRecordB.f48863e[i11];
                    if (cls4 == cls3) {
                        z2 = true;
                    } else {
                        if (cls4 == cls2) {
                            z3 = false;
                            z2 = true;
                        } else if (cls4 == cls) {
                            z2 = false;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z2) {
                            if (i4 < 8) {
                                i4++;
                            }
                        } else if (i2 < 7) {
                            i2++;
                        }
                        i3 += z3 ? 8 : 4;
                        if (hookRecordB.f48862c) {
                            zArr[i11] = z3;
                        } else {
                            zArr[i11 + 1] = z3;
                        }
                    }
                    z3 = true;
                    if (z2) {
                        if (i4 < 8) {
                            i4++;
                        }
                    } else if (i2 < 7) {
                        i2++;
                    }
                    i3 += z3 ? 8 : 4;
                    if (hookRecordB.f48862c) {
                        zArr[i11] = z3;
                    } else {
                        zArr[i11 + 1] = z3;
                    }
                }
            } else {
                zArr = f48873a;
                i4 = 0;
            }
            ParamTypesCache paramTypesCache = new ParamTypesCache();
            paramTypesCache.f48876a = i2;
            paramTypesCache.f48877b = i3;
            paramTypesCache.f48878c = i4;
            paramTypesCache.d = (boolean[]) zArr.clone();
            hookRecordB.g = paramTypesCache;
        } else {
            ParamTypesCache paramTypesCache2 = (ParamTypesCache) hookRecordB.g;
            i2 = paramTypesCache2.f48876a;
            i3 = paramTypesCache2.f48877b;
            i4 = paramTypesCache2.f48878c;
            zArr = (boolean[]) paramTypesCache2.d.clone();
        }
        int i12 = i2;
        boolean[] zArr2 = zArr;
        if (j3 == 0) {
            i3 = 0;
        }
        long[] jArr2 = f48874b;
        long[] jArr3 = i12 != 0 ? new long[i12] : jArr2;
        if (i3 != 0) {
            jArr2 = new long[i3];
        }
        double[] dArr = i4 != 0 ? new double[i4] : f48875c;
        long[] jArr4 = jArr2;
        double[] dArr2 = dArr;
        long[] jArr5 = jArr3;
        Pine.getArgsArm64(jCloneExtras, j3, zArr2, jArr5, jArr4, dArr2);
        if (i12 >= 4) {
            jArr5[3] = j4;
            if (i12 != 4) {
                jArr5[4] = j5;
                if (i12 != 5) {
                    jArr5[5] = j6;
                    if (i12 != 6) {
                        jArr5[6] = j7;
                    }
                }
            }
        }
        long jCurrentArtThread0 = Pine.currentArtThread0();
        if (hookRecordB.f48862c) {
            objC = null;
            i5 = 0;
            i6 = 0;
        } else {
            objC = Pine.c(jCurrentArtThread0, jArr5[0]);
            i5 = 1;
            i6 = 1;
        }
        int i13 = hookRecordB.d;
        if (i13 > 0) {
            objArr = new Object[i13];
            int i14 = 0;
            while (i14 < hookRecordB.d) {
                Class cls5 = hookRecordB.f48863e[i14];
                if (cls5 == cls3) {
                    if (i9 < dArr2.length) {
                        i8 = i9 + 1;
                        objValueOf = Double.valueOf(dArr2[i9]);
                    } else {
                        i8 = i9;
                        objValueOf = Double.valueOf(Double.longBitsToDouble(jArr4[i6]));
                    }
                    jArr = jArr4;
                    i7 = i6;
                } else {
                    if (cls5 == cls2) {
                        if (i9 < dArr2.length) {
                            jDoubleToLongBits = Double.doubleToLongBits(dArr2[i9]);
                            i9++;
                        } else {
                            jDoubleToLongBits = jArr4[i6];
                        }
                        jArr = jArr4;
                        i7 = i6;
                        objC2 = Float.valueOf(Float.intBitsToFloat((int) (jDoubleToLongBits & 4294967295L)));
                    } else {
                        jArr = jArr4;
                        i7 = i6;
                        if (i5 < jArr5.length) {
                            j8 = jArr5[i5];
                            i5++;
                        } else {
                            j8 = jArr[i7];
                        }
                        if (!cls5.isPrimitive()) {
                            objC2 = Pine.c(jCurrentArtThread0, j8 & 4294967295L);
                        } else if (cls5 == Integer.TYPE) {
                            objC2 = Integer.valueOf((int) (j8 & 4294967295L));
                        } else if (cls5 == cls) {
                            objC2 = Long.valueOf(j8);
                        } else if (cls5 == Boolean.TYPE) {
                            objC2 = Boolean.valueOf((j8 & 4294967295L) != 0);
                        } else if (cls5 == Short.TYPE) {
                            objC2 = Short.valueOf((short) (j8 & 65535));
                        } else if (cls5 == Character.TYPE) {
                            objC2 = Character.valueOf((char) (j8 & 65535));
                        } else {
                            if (cls5 != Byte.TYPE) {
                                throw new AssertionError(a.j(cls5, "Unknown primitive type: "));
                            }
                            objC2 = Byte.valueOf((byte) (j8 & 255));
                        }
                    }
                    i8 = i9;
                    objValueOf = objC2;
                }
                objArr[i14] = objValueOf;
                i6 = i7 + 1;
                i14++;
                jArr4 = jArr;
                i9 = i8;
            }
        } else {
            objArr = Pine.f48852a;
        }
        return Pine.d(hookRecordB, objC, objArr);
    }

    public static int intBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Integer) handleBridge(j, j2, j3, j4, j5, j6, j7)).intValue();
    }

    public static long longBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Long) handleBridge(j, j2, j3, j4, j5, j6, j7)).longValue();
    }

    public static Object objectBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return handleBridge(j, j2, j3, j4, j5, j6, j7);
    }

    public static short shortBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        return ((Short) handleBridge(j, j2, j3, j4, j5, j6, j7)).shortValue();
    }

    public static void voidBridge(long j, long j2, long j3, long j4, long j5, long j6, long j7) throws Throwable {
        handleBridge(j, j2, j3, j4, j5, j6, j7);
    }
}
