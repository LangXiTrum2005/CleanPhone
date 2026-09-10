package top.canyie.pine.entry;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import top.canyie.pine.Pine;
import top.canyie.pine.PineConfig;
import top.canyie.pine.utils.Primitives;

/* JADX INFO: loaded from: classes7.dex */
public final class X86Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f48879a = new int[0];

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

    private static Object handleBridge(int i2, int i3, int i4) throws Throwable {
        Class cls;
        Class cls2;
        Object objC;
        int i5;
        Object[] objArr;
        Object objC2;
        int i6;
        Object objValueOf;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        Object[] objArr3 = Pine.f48852a;
        if (PineConfig.f48865b) {
            Log.i("Pine", String.format("handleBridge: artMethod=%#x extras=%#x ebx=%#x", objArr2));
        }
        Pine.HookRecord hookRecordB = Pine.b(i2);
        int i7 = !hookRecordB.f48862c ? 1 : 0;
        Class[] clsArr = hookRecordB.f48863e;
        int length = clsArr.length;
        int i8 = 0;
        while (true) {
            cls = Double.TYPE;
            cls2 = Long.TYPE;
            if (i8 >= length) {
                break;
            }
            Class cls3 = clsArr[i8];
            i7 += (cls3 == cls2 || cls3 == cls) ? 2 : 1;
            i8++;
        }
        int[] iArr = i7 != 0 ? new int[i7] : f48879a;
        Pine.getArgsX86(i3, iArr, i4);
        long jCurrentArtThread0 = Pine.currentArtThread0();
        if (hookRecordB.f48862c) {
            objC = null;
            i5 = 0;
        } else {
            objC = Pine.c(jCurrentArtThread0, iArr[0]);
            i5 = 1;
        }
        int i9 = hookRecordB.d;
        if (i9 > 0) {
            objArr = new Object[i9];
            for (int i10 = 0; i10 < hookRecordB.d; i10++) {
                Class cls4 = hookRecordB.f48863e[i10];
                if (!cls4.isPrimitive()) {
                    objC2 = Pine.c(jCurrentArtThread0, iArr[i5]);
                } else if (cls4 == Integer.TYPE) {
                    objC2 = Integer.valueOf(iArr[i5]);
                } else {
                    if (cls4 == cls2) {
                        i6 = i5 + 1;
                        objValueOf = Long.valueOf(Primitives.a(iArr[i5], iArr[i6]));
                    } else if (cls4 == cls) {
                        i6 = i5 + 1;
                        objValueOf = Double.valueOf(Double.longBitsToDouble(Primitives.a(iArr[i5], iArr[i6])));
                    } else if (cls4 == Float.TYPE) {
                        objC2 = Float.valueOf(Float.intBitsToFloat(iArr[i5]));
                    } else if (cls4 == Boolean.TYPE) {
                        objC2 = Boolean.valueOf(iArr[i5] != 0);
                    } else if (cls4 == Short.TYPE) {
                        objC2 = Short.valueOf((short) iArr[i5]);
                    } else if (cls4 == Character.TYPE) {
                        objC2 = Character.valueOf((char) iArr[i5]);
                    } else {
                        if (cls4 != Byte.TYPE) {
                            throw new AssertionError(a.j(cls4, "Unknown primitive type: "));
                        }
                        objC2 = Byte.valueOf((byte) iArr[i5]);
                    }
                    int i11 = i6;
                    objC2 = objValueOf;
                    i5 = i11;
                }
                objArr[i10] = objC2;
                i5++;
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
