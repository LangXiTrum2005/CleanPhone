package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2293Aq {
    public static final byte[] h = {0, 7, 8, com.umeng.analytics.pro.cw.m};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2839a;
    public final Paint b;
    public final Canvas c;
    public final C2341Cm d;
    public final C4789uq e;
    public final C5229zq f;
    public Bitmap g;

    public C2293Aq(int i2, int i3) {
        Paint paint = new Paint();
        this.f2839a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new C2341Cm(719, 575, 0, 719, 0, 575);
        this.e = new C4789uq(0, new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505}, b(), c());
        this.f = new C5229zq(i2, i3);
    }

    public static byte[] a(int i2, int i3, Uh0 uh0) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) uh0.i(i3);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = i2 & 1;
                int i4 = EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i5 = i3 != 0 ? EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : 0;
                int i6 = (i2 & 2) != 0 ? EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : 0;
                if ((i2 & 4) == 0) {
                    i4 = 0;
                }
                iArr[i2] = d(255, i5, i6, i4);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = d(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0220  */
    /* JADX WARN: Code duplicated, block: B:119:0x022f A[LOOP:3: B:89:0x0179->B:119:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157 A[LOOP:2: B:41:0x00b7->B:76:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    public static void e(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        Uh0 uh0 = new Uh0(bArr, 2, (Object) null);
        int i13 = i3;
        int i14 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (uh0.b() != 0) {
            int i15 = 8;
            int i16 = uh0.i(8);
            if (i16 != 240) {
                int i17 = 3;
                int i18 = 4;
                switch (i16) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrA == null ? i : bArrA;
                        } else {
                            if (i2 == 2) {
                                bArr3 = bArrA3 == null ? h : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            i5 = i13;
                            z = false;
                            while (true) {
                                i6 = uh0.i(2);
                                if (i6 == 0) {
                                    if (uh0.h()) {
                                        z = z;
                                        i8 = uh0.i(3) + 3;
                                        i6 = uh0.i(2);
                                    } else if (uh0.h()) {
                                        i6 = 0;
                                    } else {
                                        i7 = uh0.i(2);
                                        if (i7 != 0) {
                                            i6 = 0;
                                            z = true;
                                        } else if (i7 != 1) {
                                            z = z;
                                            i6 = 0;
                                            i8 = 2;
                                        } else if (i7 != 2) {
                                            z = z;
                                            i8 = uh0.i(4) + 12;
                                            i6 = uh0.i(2);
                                        } else if (i7 != 3) {
                                            z = z;
                                            i6 = 0;
                                        } else {
                                            z = z;
                                            i8 = uh0.i(8) + 29;
                                            i6 = uh0.i(2);
                                        }
                                        i8 = 0;
                                    }
                                    if (i8 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            i6 = bArr2[i6];
                                        }
                                        paint.setColor(iArr[i6]);
                                        canvas.drawRect(i5, i14, i5 + i8, i14 + 1, paint);
                                    }
                                    i5 += i8;
                                    if (z) {
                                        uh0.c();
                                    } else {
                                        z = z;
                                    }
                                    break;
                                }
                                i8 = 1;
                                if (i8 == 0) {
                                }
                                i5 += i8;
                                if (z) {
                                    uh0.c();
                                } else {
                                    z = z;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i5 = i13;
                        z = false;
                        while (true) {
                            i6 = uh0.i(2);
                            if (i6 == 0) {
                                if (uh0.h()) {
                                    z = z;
                                    i8 = uh0.i(3) + 3;
                                    i6 = uh0.i(2);
                                } else if (uh0.h()) {
                                    i6 = 0;
                                } else {
                                    i7 = uh0.i(2);
                                    if (i7 != 0) {
                                        i6 = 0;
                                        z = true;
                                    } else if (i7 != 1) {
                                        z = z;
                                        i6 = 0;
                                        i8 = 2;
                                    } else if (i7 != 2) {
                                        z = z;
                                        i8 = uh0.i(4) + 12;
                                        i6 = uh0.i(2);
                                    } else if (i7 != 3) {
                                        z = z;
                                        i6 = 0;
                                    } else {
                                        z = z;
                                        i8 = uh0.i(8) + 29;
                                        i6 = uh0.i(2);
                                    }
                                    i8 = 0;
                                }
                                if (i8 == 0) {
                                }
                                i5 += i8;
                                if (z) {
                                    uh0.c();
                                } else {
                                    z = z;
                                }
                                break;
                            }
                            i8 = 1;
                            if (i8 == 0) {
                            }
                            i5 += i8;
                            if (z) {
                                uh0.c();
                            } else {
                                z = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrA2 == null ? j : bArrA2 : null;
                        i5 = i13;
                        boolean z3 = false;
                        while (true) {
                            int i19 = uh0.i(i18);
                            if (i19 == 0) {
                                if (uh0.h()) {
                                    if (uh0.h()) {
                                        int i20 = uh0.i(2);
                                        if (i20 == 0) {
                                            i19 = 0;
                                        } else if (i20 == 1) {
                                            z3 = z3;
                                            i19 = 0;
                                            i9 = 2;
                                        } else if (i20 == 2) {
                                            i10 = uh0.i(i18) + 9;
                                            i11 = uh0.i(i18);
                                        } else if (i20 != i17) {
                                            z3 = z3;
                                            i19 = 0;
                                            i9 = 0;
                                        } else {
                                            i10 = uh0.i(i15) + 25;
                                            i11 = uh0.i(i18);
                                        }
                                    } else {
                                        i10 = uh0.i(2) + i18;
                                        i11 = uh0.i(i18);
                                    }
                                    z3 = z3;
                                    i9 = i10;
                                    i19 = i11;
                                } else {
                                    int i21 = uh0.i(i17);
                                    if (i21 != 0) {
                                        z3 = z3;
                                        i9 = i21 + 2;
                                        i19 = 0;
                                    } else {
                                        i19 = 0;
                                        z3 = true;
                                        i9 = 0;
                                    }
                                }
                                if (i9 == 0 && paint != null) {
                                    if (bArr4 != 0) {
                                        i19 = bArr4[i19];
                                    }
                                    paint.setColor(iArr[i19]);
                                    canvas.drawRect(i5, i14, i5 + i9, i14 + 1, paint);
                                }
                                i5 += i9;
                                if (z3) {
                                    uh0.c();
                                } else {
                                    z3 = z3;
                                    i18 = 4;
                                    i17 = 3;
                                    i15 = 8;
                                }
                                break;
                            }
                            i9 = 1;
                            if (i9 == 0) {
                            }
                            i5 += i9;
                            if (z3) {
                                uh0.c();
                            } else {
                                z3 = z3;
                                i18 = 4;
                                i17 = 3;
                                i15 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i22 = i13;
                        boolean z4 = false;
                        while (true) {
                            int i23 = uh0.i(8);
                            if (i23 != 0) {
                                z2 = z4;
                                i12 = 1;
                            } else if (uh0.h()) {
                                z2 = z4;
                                i12 = uh0.i(7);
                                i23 = uh0.i(8);
                            } else {
                                int i24 = uh0.i(7);
                                if (i24 != 0) {
                                    z2 = z4;
                                    i12 = i24;
                                    i23 = 0;
                                } else {
                                    i23 = 0;
                                    z2 = true;
                                    i12 = 0;
                                }
                            }
                            if (i12 != 0 && paint != null) {
                                paint.setColor(iArr[i23]);
                                canvas.drawRect(i22, i14, i22 + i12, i14 + 1, paint);
                            }
                            i22 += i12;
                            if (z2) {
                                i13 = i22;
                                continue;
                            } else {
                                z4 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i16) {
                            case 32:
                                bArrA3 = a(4, 4, uh0);
                                break;
                            case 33:
                                bArrA = a(4, 8, uh0);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, uh0);
                                continue;
                        }
                        break;
                }
                i13 = i5;
            } else {
                i14 += 2;
                i13 = i3;
            }
        }
    }

    public static C4789uq f(int i2, Uh0 uh0) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = uh0.i(8);
        uh0.s(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int[] iArr2 = {0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i11 > 0) {
            int i12 = uh0.i(i8);
            int i13 = uh0.i(i8);
            if ((i13 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i13 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i13 & 1) != 0) {
                i6 = uh0.i(i8);
                i7 = uh0.i(i8);
                i3 = uh0.i(i8);
                i5 = uh0.i(i8);
                i4 = i11 - 6;
            } else {
                int i14 = uh0.i(6) << i10;
                int i15 = uh0.i(4) << 4;
                i3 = uh0.i(4) << 4;
                i4 = i11 - 4;
                i5 = uh0.i(i10) << 6;
                i6 = i14;
                i7 = i15;
            }
            if (i6 == 0) {
                i7 = 0;
                i3 = 0;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr[i12] = d((byte) (255 - (i5 & 255)), Ug0.j((int) ((1.402d * d2) + d), 0, 255), Ug0.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Ug0.j((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i9 = i9;
            iArrC = iArrC;
            i8 = 8;
            i10 = 2;
        }
        return new C4789uq(i9, iArr2, iArrB, iArrC);
    }

    public static C4877vq g(Uh0 uh0) {
        byte[] bArr;
        int i2 = uh0.i(16);
        uh0.s(4);
        int i3 = uh0.i(2);
        boolean zH = uh0.h();
        uh0.s(1);
        byte[] bArr2 = Ug0.e;
        if (i3 != 1) {
            if (i3 == 0) {
                int i4 = uh0.i(16);
                int i5 = uh0.i(16);
                if (i4 > 0) {
                    bArr2 = new byte[i4];
                    uh0.k(bArr2, i4);
                }
                if (i5 > 0) {
                    bArr = new byte[i5];
                    uh0.k(bArr, i5);
                }
            }
            return new C4877vq(i2, zH, bArr2, bArr);
        }
        uh0.s(uh0.i(8) * 16);
        bArr = bArr2;
        return new C4877vq(i2, zH, bArr2, bArr);
    }
}
