package com.badlogic.gdx.math;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class MathUtils {
    private static final double BIG_ENOUGH_CEIL = 16384.999999999996d;
    private static final double BIG_ENOUGH_FLOOR = 16384.0d;
    private static final int BIG_ENOUGH_INT = 16384;
    private static final double BIG_ENOUGH_ROUND = 16384.5d;
    private static final double CEIL = 0.9999999d;
    public static final float E = 2.7182817f;
    public static final float FLOAT_ROUNDING_ERROR = 1.0E-6f;
    public static final float HALF_PI = 1.5707964f;
    public static final float PI = 3.1415927f;
    public static final float PI2 = 6.2831855f;
    private static final int SIN_BITS = 14;
    private static final int SIN_COUNT = 16384;
    private static final int SIN_MASK = 16383;
    private static final float degFull = 360.0f;
    public static final float degRad = 0.017453292f;
    private static final float degToIndex = 45.511112f;
    public static final float degreesToRadians = 0.017453292f;
    public static final float nanoToSec = 1.0E-9f;
    public static final float radDeg = 57.295776f;
    private static final float radFull = 6.2831855f;
    private static final float radToIndex = 2607.5945f;
    public static final float radiansToDegrees = 57.295776f;
    public static Random random = new RandomXS128();

    public static class Sin {
        static final float[] table = new float[16384];

        static {
            for (int i = 0; i < 16384; i++) {
                table[i] = (float) Math.sin(((i + 0.5f) / 16384.0f) * 6.2831855f);
            }
            float[] fArr = table;
            fArr[0] = 0.0f;
            fArr[4096] = 1.0f;
            fArr[8192] = 0.0f;
            fArr[12288] = -1.0f;
        }

        private Sin() {
        }
    }

    private MathUtils() {
    }

    public static float acos(float f) {
        float f2 = f * f;
        float f3 = f * f2;
        if (f >= 0.0f) {
            return (((f2 * 0.074261f) + (1.5707288f - (f * 0.2121144f))) - (f3 * 0.0187293f)) * ((float) Math.sqrt(1.0f - f));
        }
        return 3.1415927f - (((f3 * 0.0187293f) + ((f2 * 0.074261f) + ((f * 0.2121144f) + 1.5707288f))) * ((float) Math.sqrt(1.0f + f)));
    }

    public static float acosDeg(float f) {
        float f2 = f * f;
        float f3 = f * f2;
        if (f >= 0.0f) {
            return (((f2 * 4.254842f) + (89.99613f - (f * 12.153259f))) - (f3 * 1.0731097f)) * ((float) Math.sqrt(1.0f - f));
        }
        return 180.0f - (((f3 * 1.0731097f) + ((f2 * 4.254842f) + ((f * 12.153259f) + 89.99613f))) * ((float) Math.sqrt(1.0f + f)));
    }

    public static float asin(float f) {
        float f2 = f * f;
        float f3 = f * f2;
        if (f >= 0.0f) {
            return 1.5707964f - ((((f2 * 0.074261f) + (1.5707288f - (f * 0.2121144f))) - (f3 * 0.0187293f)) * ((float) Math.sqrt(1.0f - f)));
        }
        return (((f3 * 0.0187293f) + ((f2 * 0.074261f) + ((f * 0.2121144f) + 1.5707288f))) * ((float) Math.sqrt(1.0f + f))) - 1.5707964f;
    }

    public static float asinDeg(float f) {
        float f2 = f * f;
        float f3 = f * f2;
        if (f >= 0.0f) {
            return 90.0f - ((((f2 * 4.254842f) + (89.99613f - (f * 12.15326f))) - (f3 * 1.0731099f)) * ((float) Math.sqrt(1.0f - f)));
        }
        return (((f3 * 1.0731099f) + ((f2 * 4.254842f) + ((f * 12.15326f) + 89.99613f))) * ((float) Math.sqrt(1.0f + f))) - 90.0f;
    }

    public static float atan(float f) {
        double dMin = Math.min(Math.abs(f), Double.MAX_VALUE);
        double d = (dMin - 1.0d) / (dMin + 1.0d);
        double d2 = d * d;
        double d3 = d * d2;
        double d4 = d3 * d2;
        double d5 = d4 * d2;
        double d6 = d5 * d2;
        return Math.signum(f) * ((float) ((((d6 * 0.05265332d) + (((d4 * 0.19354346d) + ((d * 0.99997726d) - (d3 * 0.33262347d))) - (d5 * 0.11643287d))) - ((d2 * d6) * 0.0117212d)) + 0.7853981633974483d));
    }

    public static float atan2(float f, float f2) {
        float f3 = f / f2;
        if (f3 != f3) {
            f3 = f == f2 ? 1.0f : -1.0f;
        } else {
            float f4 = f3 - f3;
            if (f4 != f4) {
                f2 = 0.0f;
            }
        }
        if (f2 > 0.0f) {
            return atanUnchecked(f3);
        }
        if (f2 < 0.0f) {
            return f >= 0.0f ? atanUnchecked(f3) + 3.1415927f : atanUnchecked(f3) - 3.1415927f;
        }
        if (f > 0.0f) {
            return f2 + 1.5707964f;
        }
        return f < 0.0f ? f2 - 1.5707964f : f2 + f;
    }

    public static float atan2Deg(float f, float f2) {
        double dAtanUncheckedDeg;
        float f3 = f / f2;
        if (f3 != f3) {
            f3 = f == f2 ? 1.0f : -1.0f;
        } else {
            float f4 = f3 - f3;
            if (f4 != f4) {
                f2 = 0.0f;
            }
        }
        if (f2 > 0.0f) {
            dAtanUncheckedDeg = atanUncheckedDeg(f3);
        } else {
            if (f2 >= 0.0f) {
                if (f > 0.0f) {
                    return f2 + 90.0f;
                }
                return f < 0.0f ? f2 - 90.0f : f2 + f;
            }
            dAtanUncheckedDeg = f >= 0.0f ? atanUncheckedDeg(f3) + 180.0d : atanUncheckedDeg(f3) - 180.0d;
        }
        return (float) dAtanUncheckedDeg;
    }

    public static float atan2Deg360(float f, float f2) {
        float f3;
        double dAtanUncheckedDeg;
        double d;
        double dAtanUncheckedDeg2;
        float f4 = f / f2;
        if (f4 != f4) {
            f4 = f == f2 ? 1.0f : -1.0f;
        } else {
            float f5 = f4 - f4;
            if (f5 != f5) {
                f2 = 0.0f;
            }
        }
        if (f2 > 0.0f) {
            if (f >= 0.0f) {
                dAtanUncheckedDeg2 = atanUncheckedDeg(f4);
            } else {
                dAtanUncheckedDeg = atanUncheckedDeg(f4);
                d = 360.0d;
            }
            return (float) dAtanUncheckedDeg2;
        }
        if (f2 >= 0.0f) {
            if (f > 0.0f) {
                f3 = 90.0f;
            } else {
                if (f >= 0.0f) {
                    return f2 + f;
                }
                f3 = 270.0f;
            }
            return f2 + f3;
        }
        dAtanUncheckedDeg = atanUncheckedDeg(f4);
        d = 180.0d;
        dAtanUncheckedDeg2 = dAtanUncheckedDeg + d;
        return (float) dAtanUncheckedDeg2;
    }

    public static float atanDeg(float f) {
        double dMin = Math.min(Math.abs(f), Double.MAX_VALUE);
        double d = (dMin - 1.0d) / (dMin + 1.0d);
        double d2 = d * d;
        double d3 = d * d2;
        double d4 = d3 * d2;
        double d5 = d4 * d2;
        double d6 = d5 * d2;
        double d7 = d2 * d6;
        return (float) (((((d6 * 3.016813013351768d) + (((d4 * 11.089223410359068d) + ((d * 57.2944766070562d) - (d3 * 19.05792099799635d))) - (d5 * 6.6711120475953765d))) - (d7 * 0.6715752908287405d)) + 45.0d) * ((double) Math.signum(f)));
    }

    public static float atanUnchecked(double d) {
        double dAbs = Math.abs(d);
        double d2 = (dAbs - 1.0d) / (dAbs + 1.0d);
        double d3 = d2 * d2;
        double d4 = d2 * d3;
        double d5 = d4 * d3;
        double d6 = d5 * d3;
        double d7 = d6 * d3;
        double d8 = d3 * d7;
        double d9 = d7 * 0.05265332d;
        return (float) ((((d9 + (((d5 * 0.19354346d) + ((d2 * 0.99997726d) - (d4 * 0.33262347d))) - (d6 * 0.11643287d))) - (d8 * 0.0117212d)) + 0.7853981633974483d) * Math.signum(d));
    }

    public static double atanUncheckedDeg(double d) {
        double dAbs = Math.abs(d);
        double d2 = (dAbs - 1.0d) / (dAbs + 1.0d);
        double d3 = d2 * d2;
        double d4 = d2 * d3;
        double d5 = d4 * d3;
        double d6 = d5 * d3;
        double d7 = d6 * d3;
        double d8 = d3 * d7;
        double d9 = d7 * 3.016813013351768d;
        return (((d9 + (((d5 * 11.089223410359068d) + ((d2 * 57.2944766070562d) - (d4 * 19.05792099799635d))) - (d6 * 6.6711120475953765d))) - (d8 * 0.6715752908287405d)) + 45.0d) * Math.signum(d);
    }

    public static int ceil(float f) {
        return 16384 - ((int) (BIG_ENOUGH_FLOOR - ((double) f)));
    }

    public static int ceilPositive(float f) {
        return (int) (((double) f) + CEIL);
    }

    public static double clamp(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static float cos(float f) {
        return Sin.table[((int) ((f + 1.5707964f) * radToIndex)) & SIN_MASK];
    }

    public static float cosDeg(float f) {
        return Sin.table[((int) ((f + 90.0f) * degToIndex)) & SIN_MASK];
    }

    public static int floor(float f) {
        return ((int) (((double) f) + BIG_ENOUGH_FLOOR)) - 16384;
    }

    public static int floorPositive(float f) {
        return (int) f;
    }

    public static boolean isEqual(float f, float f2) {
        return Math.abs(f - f2) <= 1.0E-6f;
    }

    public static boolean isPowerOfTwo(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static boolean isZero(float f) {
        return Math.abs(f) <= 1.0E-6f;
    }

    public static float lerp(float f, float f2, float f3) {
        return AbstractC5044xl.w(f2, f, f3, f);
    }

    public static float lerpAngle(float f, float f2, float f3) {
        return ((((((((((f2 - f) % 6.2831855f) + 6.2831855f) + 3.1415927f) % 6.2831855f) - 3.1415927f) * f3) + f) % 6.2831855f) + 6.2831855f) % 6.2831855f;
    }

    public static float lerpAngleDeg(float f, float f2, float f3) {
        return ((((((((((f2 - f) % degFull) + degFull) + 180.0f) % degFull) - 180.0f) * f3) + f) % degFull) + degFull) % degFull;
    }

    public static float log(float f, float f2) {
        return (float) (Math.log(f2) / Math.log(f));
    }

    public static float log2(float f) {
        return log(2.0f, f);
    }

    public static float map(float f, float f2, float f3, float f4, float f5) {
        return (((f4 - f3) * (f5 - f)) / (f2 - f)) + f3;
    }

    public static int nextPowerOfTwo(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    public static float norm(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public static int random(int i) {
        return random.nextInt(i + 1);
    }

    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    public static int randomSign() {
        return (random.nextInt() >> 31) | 1;
    }

    public static float randomTriangular() {
        return random.nextFloat() - random.nextFloat();
    }

    public static int round(float f) {
        return ((int) (((double) f) + BIG_ENOUGH_ROUND)) - 16384;
    }

    public static int roundPositive(float f) {
        return (int) (f + 0.5f);
    }

    public static float sin(float f) {
        return Sin.table[((int) (f * radToIndex)) & SIN_MASK];
    }

    public static float sinDeg(float f) {
        return Sin.table[((int) (f * degToIndex)) & SIN_MASK];
    }

    public static float tan(float f) {
        double d = (f / 3.1415927f) + 0.5f;
        float fFloor = (((float) (d - Math.floor(d))) - 0.5f) * 3.1415927f;
        float f2 = fFloor * fFloor;
        float f3 = f2 * f2;
        return ((((0.0010582011f * f3) - (0.11111111f * f2)) + 1.0f) * fFloor) / (((f3 * 0.015873017f) - (f2 * 0.44444445f)) + 1.0f);
    }

    public static float tanDeg(float f) {
        double d = (f * 0.0055555557f) + 0.5f;
        float fFloor = (((float) (d - Math.floor(d))) - 0.5f) * 3.1415927f;
        float f2 = fFloor * fFloor;
        float f3 = f2 * f2;
        return ((((0.0010582011f * f3) - (0.11111111f * f2)) + 1.0f) * fFloor) / (((f3 * 0.015873017f) - (f2 * 0.44444445f)) + 1.0f);
    }

    public static float clamp(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static boolean isEqual(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3;
    }

    public static boolean isZero(float f, float f2) {
        return Math.abs(f) <= f2;
    }

    public static int random(int i, int i2) {
        return random.nextInt((i2 - i) + 1) + i;
    }

    public static boolean randomBoolean(float f) {
        return random() < f;
    }

    public static float randomTriangular(float f) {
        return (random.nextFloat() - random.nextFloat()) * f;
    }

    public static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long random(long j) {
        return random(0L, j);
    }

    public static float randomTriangular(float f, float f2) {
        return randomTriangular(f, f2, (f + f2) * 0.5f);
    }

    public static long clamp(long j, long j2, long j3) {
        if (j < j2) {
            return j2;
        }
        return j > j3 ? j3 : j;
    }

    public static long random(long j, long j2) {
        long jNextLong = random.nextLong();
        if (j2 >= j) {
            j = j2;
            j2 = j;
        }
        long j3 = (j - j2) + 1;
        long j4 = jNextLong & 4294967295L;
        long j5 = 4294967295L & j3;
        long j6 = jNextLong >>> 32;
        long j7 = j3 >>> 32;
        return (j6 * j7) + j2 + ((j5 * j6) >>> 32) + ((j4 * j7) >>> 32);
    }

    public static float randomTriangular(float f, float f2, float f3) {
        float fNextFloat = random.nextFloat();
        float f4 = f2 - f;
        float f5 = f3 - f;
        if (fNextFloat <= f5 / f4) {
            return f + ((float) Math.sqrt(fNextFloat * f4 * f5));
        }
        return f2 - ((float) Math.sqrt((f2 - f3) * ((1.0f - fNextFloat) * f4)));
    }

    public static short clamp(short s, short s2, short s3) {
        if (s < s2) {
            return s2;
        }
        return s > s3 ? s3 : s;
    }

    public static float random() {
        return random.nextFloat();
    }

    public static float random(float f) {
        return random.nextFloat() * f;
    }

    public static float random(float f, float f2) {
        return AbstractC5044xl.w(f2, f, random.nextFloat(), f);
    }
}
