package com.facebook.ads.redexgen.core;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C9Y {
    public static String[] A0M = {"T7VAgrMlNjunoCY92EX", "RGUT9owbnhx8phDbzrCYMg", "CVNC8QX", "fBdqcrRV46KfIZmPA23V4p", "8FvZMHzhr", "kMgSgwu", "1eJdCrNjGcKHTUWf60z", "EzFxZEW8JHF4ThmiFQVxs9z"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C9Y(int i2, int i3, float f, float f2, int i4) {
        this.A0H = i2;
        this.A0G = i3;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i2 / i4;
        this.A0K = i2 / 400;
        this.A0I = i2 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i3];
        this.A0B = new short[this.A0J * i3];
        this.A0C = new short[this.A0J * i3];
    }

    private int A00(int i2) {
        int iMin = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i2, iMin);
        int frameCount = this.A09;
        this.A09 = frameCount - iMin;
        return iMin;
    }

    private int A01(short[] sArr, int i2) {
        int minP;
        int maxP;
        int i3 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int i4 = this.A0G;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[5] = "ihqHcMR";
        if (i4 == 1 && i3 == 1) {
            int i5 = this.A0K;
            int skip = this.A0I;
            minP = A04(sArr, i2, i5, skip);
        } else {
            A0E(sArr, i2, i3);
            short[] sArr2 = this.A0L;
            int i6 = this.A0K / i3;
            int skip2 = this.A0I;
            minP = A04(sArr2, 0, i6, skip2 / i3);
            if (i3 != 1) {
                int minP2 = minP * i3;
                int skip3 = i3 * 4;
                int period = minP2 - skip3;
                int i7 = (i3 * 4) + minP2;
                int skip4 = this.A0K;
                if (period < skip4) {
                    period = this.A0K;
                }
                int skip5 = this.A0I;
                if (i7 > skip5) {
                    i7 = this.A0I;
                }
                int skip6 = this.A0G;
                if (skip6 == 1) {
                    minP = A04(sArr, i2, period, i7);
                } else {
                    A0E(sArr, i2, 1);
                    minP = A04(this.A0L, 0, period, i7);
                }
            }
        }
        int period2 = this.A02;
        int skip7 = this.A01;
        if (A0F(period2, skip7)) {
            maxP = this.A08;
        } else {
            maxP = minP;
        }
        int skip8 = this.A02;
        this.A07 = skip8;
        if (A0M[5].length() != 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[6] = "cTOoGT7MMdDrVmklJ8r";
        strArr[0] = "keLDEQoIXNVpWb6w58r";
        this.A08 = minP;
        return maxP;
    }

    private int A02(short[] sArr, int i2, float f, int i3) {
        int i4;
        if (f < 0.5f) {
            i4 = (int) ((i3 * f) / (1.0f - f));
        } else {
            i4 = i3;
            int newFrameCount = (int) ((i3 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i3 + i4;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount2);
        int i5 = this.A0G * i2;
        short[] sArr2 = this.A0B;
        int i6 = this.A05;
        int newFrameCount3 = this.A0G;
        int i7 = i6 * newFrameCount3;
        int newFrameCount4 = this.A0G;
        System.arraycopy(sArr, i5, sArr2, i7, newFrameCount4 * i3);
        A0C(i4, this.A0G, this.A0B, this.A05 + i3, sArr, i2 + i3, sArr, i2);
        int newFrameCount5 = this.A05;
        this.A05 = newFrameCount5 + i3 + i4;
        return i4;
    }

    private int A03(short[] sArr, int i2, float f, int i3) {
        int newFrameCount;
        if (f >= 2.0f) {
            newFrameCount = (int) (i3 / (f - 1.0f));
        } else {
            this.A09 = (int) ((i3 * (2.0f - f)) / (f - 1.0f));
            newFrameCount = i3;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i2, sArr, i2 + i3);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i7 = i2 * bestPeriod;
        while (i3 <= i4) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i3; minDiff++) {
                int bestPeriod2 = i7 + minDiff;
                short s = sArr[bestPeriod2];
                int bestPeriod3 = i7 + i3;
                int worstPeriod = s - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i5;
            int bestPeriod5 = period * i3;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i5 = i3;
            }
            int worstPeriod3 = diff * i6;
            int bestPeriod6 = maxDiff * i3;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i6 = i3;
            }
            i3++;
        }
        this.A02 = period / i5;
        this.A01 = maxDiff / i6;
        return i5;
    }

    private short A05(short[] sArr, int i2, int i3, int i4) {
        short s = sArr[i2];
        short s2 = sArr[this.A0G + i2];
        int leftPosition = this.A03 * i3;
        int i5 = this.A04 * i4;
        int position = (this.A04 + 1) * i4;
        int i6 = position - leftPosition;
        int position2 = position - i5;
        short left = (short) (((i6 * s) + ((position2 - i6) * s2)) / position2);
        return left;
    }

    private void A06() {
        int i2 = this.A05;
        float f = this.A0F / this.A0D;
        float f2 = this.A0E * this.A0D;
        if (f > 1.00001d || f < 0.99999d) {
            A07(f);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f2 != 1.0f) {
            A08(f2, i2);
        }
    }

    private void A07(float f) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i2 = this.A00;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[4] = "1EAucAhfj";
        int i3 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i3);
                i3 += frameCount3;
            } else {
                int iA01 = A01(this.A0A, i3);
                if (f > 1.0d) {
                    int frameCount4 = A03(this.A0A, i3, f, iA01);
                    i3 += frameCount4 + iA01;
                } else {
                    int iA02 = A02(this.A0A, i3, f, iA01);
                    int positionFrames = A0M[4].length();
                    if (positionFrames != 9) {
                        i3 += iA02;
                    } else {
                        String[] strArr = A0M;
                        strArr[7] = "LI3iTvxeiLHfC3eQqEyHhGd";
                        strArr[2] = "DQqtHf8";
                        i3 += iA02;
                    }
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i3 <= i2);
        A0B(i3);
    }

    private void A08(float f, int i2) {
        if (this.A05 == i2) {
            return;
        }
        int i3 = (int) (this.A0H / f);
        int i4 = this.A0H;
        while (true) {
            if (i3 > 16384 || i4 > 16384) {
                i3 /= 2;
                int oldSampleRate = A0M[4].length();
                if (oldSampleRate != 9) {
                    break;
                }
                A0M[4] = "8yLWj9SnB";
                i4 /= 2;
            } else {
                A09(i2);
                String[] strArr = A0M;
                String str = strArr[3];
                String str2 = strArr[1];
                int oldSampleRate2 = str.length();
                int newSampleRate = str2.length();
                if (oldSampleRate2 != newSampleRate) {
                    break;
                }
                String[] strArr2 = A0M;
                strArr2[3] = "6iwvuS4pXw8rJ8Q1q7RXek";
                strArr2[1] = "P2j6LGlMYimVuvOXYheyMm";
                int newSampleRate2 = 0;
                while (true) {
                    int oldSampleRate3 = this.A06;
                    if (newSampleRate2 < oldSampleRate3 - 1) {
                        while (true) {
                            int position = this.A04;
                            int position2 = (position + 1) * i3;
                            int oldSampleRate4 = this.A03;
                            if (position2 <= oldSampleRate4 * i4) {
                                break;
                            }
                            short[] sArr = this.A0B;
                            int oldSampleRate5 = this.A05;
                            this.A0B = A0G(sArr, oldSampleRate5, 1);
                            for (int i5 = 0; i5 < oldSampleRate; i5++) {
                                short[] sArr2 = this.A0B;
                                int i6 = this.A05;
                                int oldSampleRate6 = this.A0G;
                                int i7 = (i6 * oldSampleRate6) + i5;
                                short[] sArr3 = this.A0C;
                                int oldSampleRate7 = this.A0G;
                                sArr2[i7] = A05(sArr3, (oldSampleRate7 * newSampleRate2) + i5, i4, i3);
                            }
                            int oldSampleRate8 = this.A03;
                            this.A03 = oldSampleRate8 + 1;
                            int oldSampleRate9 = this.A05;
                            this.A05 = oldSampleRate9 + 1;
                        }
                        int oldSampleRate10 = this.A04;
                        this.A04 = oldSampleRate10 + 1;
                        int oldSampleRate11 = this.A04;
                        if (oldSampleRate11 == i4) {
                            this.A04 = 0;
                            int oldSampleRate12 = this.A03;
                            AbstractC10843y.A08(oldSampleRate12 == i3);
                            this.A03 = 0;
                        }
                        newSampleRate2++;
                    } else {
                        int newSampleRate3 = this.A06;
                        A0A(newSampleRate3 - 1);
                        return;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i2) {
        int i3 = this.A05 - i2;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i3);
        short[] sArr2 = this.A0B;
        int i4 = this.A0G * i2;
        short[] sArr3 = this.A0C;
        int i5 = this.A06;
        int frameCount2 = this.A0G;
        int i6 = i5 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(sArr2, i4, sArr3, i6, frameCount3 * i3);
        this.A05 = i2;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i3;
    }

    private void A0A(int i2) {
        if (i2 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i2, this.A0C, 0, (this.A06 - i2) * this.A0G);
        this.A06 -= i2;
    }

    private void A0B(int i2) {
        int i3 = this.A00 - i2;
        System.arraycopy(this.A0A, this.A0G * i2, this.A0A, 0, this.A0G * i3);
        this.A00 = i3;
    }

    public static void A0C(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int t = (i6 * i3) + i7;
            int d = (i5 * i3) + i7;
            for (int u2 = 0; u2 < i2; u2++) {
                int i9 = i2 - u2;
                int o = sArr2[d] * i9;
                int i10 = sArr3[t] * u2;
                sArr[i8] = (short) ((o + i10) / i2);
                i8 += i3;
                d += i3;
                t += i3;
            }
        }
    }

    private void A0D(short[] sArr, int i2, int i3) {
        this.A0B = A0G(this.A0B, this.A05, i3);
        System.arraycopy(sArr, this.A0G * i2, this.A0B, this.A05 * this.A0G, this.A0G * i3);
        this.A05 += i3;
    }

    private void A0E(short[] sArr, int i2, int i3) {
        int i4 = this.A0J / i3;
        int value = this.A0G * i3;
        int frameCount = this.A0G;
        int i5 = i2 * frameCount;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            for (int samplesPerValue = 0; samplesPerValue < value; samplesPerValue++) {
                int frameCount2 = i6 * value;
                i7 += sArr[frameCount2 + i5 + samplesPerValue];
            }
            int i8 = i7 / value;
            String[] strArr = A0M;
            String str = strArr[6];
            String str2 = strArr[0];
            int samplesPerValue2 = str.length();
            int frameCount3 = str2.length();
            if (samplesPerValue2 != frameCount3) {
                throw new RuntimeException();
            }
            A0M[4] = "fFYg0yxzP";
            this.A0L[i6] = (short) i8;
        }
    }

    private boolean A0F(int i2, int i3) {
        if (i2 == 0 || this.A08 == 0 || i3 > i2 * 3 || i2 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i2, int i3) {
        int length = sArr.length / this.A0G;
        if (i2 + i3 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i3;
        int currentCapacityFrames2 = this.A0G;
        return Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
    }

    public final int A0H() {
        return this.A05 * this.A0G * 2;
    }

    public final int A0I() {
        return this.A00 * this.A0G * 2;
    }

    public final void A0J() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0K() {
        int i2 = this.A00;
        float f = this.A0F / this.A0D;
        float r = this.A0E * this.A0D;
        int i3 = this.A05;
        float s = i2;
        int remainingFrameCount = this.A06;
        int i4 = i3 + ((int) ((((s / f) + remainingFrameCount) / r) + 0.5f));
        short[] sArr = this.A0A;
        int i5 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i5, (remainingFrameCount2 * 2) + i2);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i6 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i6 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i2) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i7 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i7 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i4) {
            this.A05 = i4;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * iMin);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - iMin;
        short[] sArr2 = this.A0B;
        int i2 = this.A0G * iMin;
        short[] sArr3 = this.A0B;
        int i3 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i2, sArr3, 0, i3 * framesToRead3);
    }

    public final void A0M(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i2 = framesToWrite * iRemaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, iRemaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i2 / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + iRemaining;
        A06();
    }
}
