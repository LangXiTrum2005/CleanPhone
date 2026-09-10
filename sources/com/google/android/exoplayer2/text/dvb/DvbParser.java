package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
final class DvbParser {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f18525h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f18526i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f18527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f18528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f18529c;
    public final DisplayDefinition d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClutDefinition f18530e;
    public final SubtitleService f;
    public Bitmap g;

    public static final class ClutDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f18532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f18533c;
        public final int[] d;

        public ClutDefinition(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f18531a = i2;
            this.f18532b = iArr;
            this.f18533c = iArr2;
            this.d = iArr3;
        }
    }

    public static final class DisplayDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18536c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18537e;
        public final int f;

        public DisplayDefinition(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f18534a = i2;
            this.f18535b = i3;
            this.f18536c = i4;
            this.d = i5;
            this.f18537e = i6;
            this.f = i7;
        }
    }

    public static final class ObjectData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f18540c;
        public final byte[] d;

        public ObjectData(int i2, boolean z2, byte[] bArr, byte[] bArr2) {
            this.f18538a = i2;
            this.f18539b = z2;
            this.f18540c = bArr;
            this.d = bArr2;
        }
    }

    public static final class PageComposition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f18543c;

        public PageComposition(int i2, int i3, SparseArray sparseArray) {
            this.f18541a = i2;
            this.f18542b = i3;
            this.f18543c = sparseArray;
        }
    }

    public static final class PageRegion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18545b;

        public PageRegion(int i2, int i3) {
            this.f18544a = i2;
            this.f18545b = i3;
        }
    }

    public static final class RegionComposition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18548c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18549e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f18551i;
        public final SparseArray j;

        public RegionComposition(int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f18546a = i2;
            this.f18547b = z2;
            this.f18548c = i3;
            this.d = i4;
            this.f18549e = i5;
            this.f = i6;
            this.g = i7;
            this.f18550h = i8;
            this.f18551i = i9;
            this.j = sparseArray;
        }
    }

    public static final class RegionObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18553b;

        public RegionObject(int i2, int i3) {
            this.f18552a = i2;
            this.f18553b = i3;
        }
    }

    public static final class SubtitleService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f18556c = new SparseArray();
        public final SparseArray d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f18557e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DisplayDefinition f18558h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PageComposition f18559i;

        public SubtitleService(int i2, int i3) {
            this.f18554a = i2;
            this.f18555b = i3;
        }
    }

    public DvbParser(int i2, int i3) {
        Paint paint = new Paint();
        this.f18527a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f18528b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f18529c = new Canvas();
        this.d = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.f18530e = new ClutDefinition(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new SubtitleService(i2, i3);
    }

    public static byte[] a(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.g(i3);
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
                iArr[i2] = d(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
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
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = d(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
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

    /* JADX WARN: Code duplicated, block: B:100:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe A[LOOP:3: B:86:0x0166->B:116:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x019b A[DONT_INVERT] */
    public static void e(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z2;
        int iG;
        int iG2;
        char c2;
        int iG3;
        int iG4;
        int iG5;
        int i5;
        int iG6;
        int iG7;
        int i6;
        boolean z3;
        int iG8;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
        int i7 = i3;
        int i8 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (parsableBitArray.b() != 0) {
            int iG9 = parsableBitArray.g(8);
            if (iG9 != 240) {
                int i9 = 3;
                int i10 = 4;
                switch (iG9) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrA == null ? f18526i : bArrA;
                        } else {
                            if (i2 == 2) {
                                bArr3 = bArrA3 == null ? f18525h : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            z2 = false;
                            while (true) {
                                iG = parsableBitArray.g(2);
                                if (iG != 0) {
                                    iG3 = iG;
                                    iG4 = 1;
                                } else {
                                    if (parsableBitArray.f()) {
                                        iG5 = parsableBitArray.g(3) + 3;
                                        iG3 = parsableBitArray.g(2);
                                    } else if (parsableBitArray.f()) {
                                        iG4 = 1;
                                        iG3 = 0;
                                    } else {
                                        iG2 = parsableBitArray.g(2);
                                        if (iG2 != 0) {
                                            c2 = 4;
                                            z2 = true;
                                            iG3 = 0;
                                            iG4 = 0;
                                        } else if (iG2 != 1) {
                                            c2 = 4;
                                            z2 = z2;
                                            iG4 = 2;
                                            iG3 = 0;
                                        } else if (iG2 != 2) {
                                            c2 = 4;
                                            z2 = z2;
                                            iG4 = parsableBitArray.g(4) + 12;
                                            iG3 = parsableBitArray.g(2);
                                        } else if (iG2 != 3) {
                                            iG3 = 0;
                                            iG4 = 0;
                                        } else {
                                            iG5 = parsableBitArray.g(8) + 29;
                                            iG3 = parsableBitArray.g(2);
                                        }
                                        if (iG4 == 0 && paint != null) {
                                            if (bArr2 != 0) {
                                                iG3 = bArr2[iG3];
                                            }
                                            paint.setColor(iArr[iG3]);
                                            canvas.drawRect(i7, i8, i7 + iG4, i8 + 1, paint);
                                        }
                                        i7 += iG4;
                                        if (z2) {
                                            parsableBitArray.c();
                                        } else {
                                            paint = paint;
                                            z2 = z2;
                                        }
                                    }
                                    iG4 = iG5;
                                }
                                c2 = 4;
                                if (iG4 == 0) {
                                }
                                i7 += iG4;
                                if (z2) {
                                    parsableBitArray.c();
                                } else {
                                    paint = paint;
                                    z2 = z2;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z2 = false;
                        while (true) {
                            iG = parsableBitArray.g(2);
                            if (iG != 0) {
                                iG3 = iG;
                                iG4 = 1;
                            } else {
                                if (parsableBitArray.f()) {
                                    iG5 = parsableBitArray.g(3) + 3;
                                    iG3 = parsableBitArray.g(2);
                                } else if (parsableBitArray.f()) {
                                    iG4 = 1;
                                    iG3 = 0;
                                } else {
                                    iG2 = parsableBitArray.g(2);
                                    if (iG2 != 0) {
                                        c2 = 4;
                                        z2 = true;
                                        iG3 = 0;
                                        iG4 = 0;
                                    } else if (iG2 != 1) {
                                        c2 = 4;
                                        z2 = z2;
                                        iG4 = 2;
                                        iG3 = 0;
                                    } else if (iG2 != 2) {
                                        c2 = 4;
                                        z2 = z2;
                                        iG4 = parsableBitArray.g(4) + 12;
                                        iG3 = parsableBitArray.g(2);
                                    } else if (iG2 != 3) {
                                        iG3 = 0;
                                        iG4 = 0;
                                    } else {
                                        iG5 = parsableBitArray.g(8) + 29;
                                        iG3 = parsableBitArray.g(2);
                                    }
                                    if (iG4 == 0) {
                                    }
                                    i7 += iG4;
                                    if (z2) {
                                        parsableBitArray.c();
                                    } else {
                                        paint = paint;
                                        z2 = z2;
                                    }
                                }
                                iG4 = iG5;
                            }
                            c2 = 4;
                            if (iG4 == 0) {
                            }
                            i7 += iG4;
                            if (z2) {
                                parsableBitArray.c();
                            } else {
                                paint = paint;
                                z2 = z2;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrA2 == null ? j : bArrA2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iG10 = parsableBitArray.g(i10);
                            if (iG10 != 0) {
                                z4 = z4;
                                i5 = 1;
                            } else if (parsableBitArray.f()) {
                                if (parsableBitArray.f()) {
                                    int iG11 = parsableBitArray.g(2);
                                    if (iG11 == 0) {
                                        i5 = 1;
                                    } else if (iG11 == 1) {
                                        i5 = 2;
                                    } else if (iG11 == 2) {
                                        iG6 = parsableBitArray.g(i10) + 9;
                                        iG7 = parsableBitArray.g(i10);
                                    } else if (iG11 != i9) {
                                        z4 = z4;
                                        iG10 = 0;
                                        i5 = 0;
                                    } else {
                                        iG6 = parsableBitArray.g(8) + 25;
                                        iG7 = parsableBitArray.g(i10);
                                    }
                                    iG10 = 0;
                                } else {
                                    iG6 = parsableBitArray.g(2) + i10;
                                    iG7 = parsableBitArray.g(i10);
                                }
                                i5 = iG6;
                                iG10 = iG7;
                                z4 = z4;
                            } else {
                                int iG12 = parsableBitArray.g(i9);
                                if (iG12 != 0) {
                                    i5 = iG12 + 2;
                                    iG10 = 0;
                                } else {
                                    z4 = true;
                                    iG10 = 0;
                                    i5 = 0;
                                }
                            }
                            if (i5 == 0 || paint == 0) {
                                i6 = i9;
                            } else {
                                if (bArr4 != 0) {
                                    iG10 = bArr4[iG10];
                                }
                                paint.setColor(iArr[iG10]);
                                i6 = i9;
                                canvas.drawRect(i7, i8, i7 + i5, i8 + 1, paint);
                            }
                            i7 += i5;
                            if (z4) {
                                parsableBitArray.c();
                            } else {
                                i9 = i6;
                                z4 = z4;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i11 = i7;
                        boolean z5 = false;
                        while (true) {
                            int iG13 = parsableBitArray.g(8);
                            if (iG13 != 0) {
                                z3 = z5;
                                iG8 = 1;
                            } else if (parsableBitArray.f()) {
                                z3 = z5;
                                iG8 = parsableBitArray.g(7);
                                iG13 = parsableBitArray.g(8);
                            } else {
                                int iG14 = parsableBitArray.g(7);
                                if (iG14 != 0) {
                                    z3 = z5;
                                    iG8 = iG14;
                                    iG13 = 0;
                                } else {
                                    z3 = true;
                                    iG13 = 0;
                                    iG8 = 0;
                                }
                            }
                            if (iG8 != 0 && paint != 0) {
                                paint.setColor(iArr[iG13]);
                                canvas.drawRect(i11, i8, i11 + iG8, i8 + 1, paint);
                            }
                            i11 += iG8;
                            if (z3) {
                                i7 = i11;
                            } else {
                                z5 = z3;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG9) {
                            case 32:
                                bArrA3 = a(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrA = a(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, parsableBitArray);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i3;
            }
        }
    }

    public static ClutDefinition f(ParsableBitArray parsableBitArray, int i2) {
        int[] iArr;
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = parsableBitArray.g(8);
        parsableBitArray.n(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i6 > 0) {
            int iG6 = parsableBitArray.g(i4);
            int iG7 = parsableBitArray.g(i4);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iG7 & 1) != 0) {
                iG3 = parsableBitArray.g(i4);
                iG4 = parsableBitArray.g(i4);
                iG = parsableBitArray.g(i4);
                iG2 = parsableBitArray.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = parsableBitArray.g(6) << i5;
                int iG9 = parsableBitArray.g(4) << 4;
                iG = parsableBitArray.g(4) << 4;
                i3 = i6 - 4;
                iG2 = parsableBitArray.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr[iG6] = d((byte) (255 - (iG2 & 255)), Util.j((int) ((1.402d * d2) + d), 0, 255), Util.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.j((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrC = iArrC;
            i4 = 8;
            i5 = 2;
        }
        return new ClutDefinition(iG5, iArr2, iArrB, iArrC);
    }

    public static ObjectData g(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int iG = parsableBitArray.g(16);
        parsableBitArray.n(4);
        int iG2 = parsableBitArray.g(2);
        boolean zF = parsableBitArray.f();
        parsableBitArray.n(1);
        byte[] bArr2 = Util.f;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = parsableBitArray.g(16);
                int iG4 = parsableBitArray.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    parsableBitArray.i(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    parsableBitArray.i(iG4, bArr);
                }
            }
            return new ObjectData(iG, zF, bArr2, bArr);
        }
        parsableBitArray.n(parsableBitArray.g(8) * 16);
        bArr = bArr2;
        return new ObjectData(iG, zF, bArr2, bArr);
    }
}
