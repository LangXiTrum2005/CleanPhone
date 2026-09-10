package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DvbParser implements SubtitleParser {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f7281h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f7282i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f7283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f7284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f7285c;
    public final DisplayDefinition d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClutDefinition f7286e;
    public final SubtitleService f;
    public Bitmap g;

    public static final class ClutDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f7289c;
        public final int[] d;

        public ClutDefinition(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7287a = i2;
            this.f7288b = iArr;
            this.f7289c = iArr2;
            this.d = iArr3;
        }
    }

    public static final class DisplayDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7292c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7293e;
        public final int f;

        public DisplayDefinition(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f7290a = i2;
            this.f7291b = i3;
            this.f7292c = i4;
            this.d = i5;
            this.f7293e = i6;
            this.f = i7;
        }
    }

    public static final class ObjectData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7296c;
        public final byte[] d;

        public ObjectData(int i2, boolean z2, byte[] bArr, byte[] bArr2) {
            this.f7294a = i2;
            this.f7295b = z2;
            this.f7296c = bArr;
            this.d = bArr2;
        }
    }

    public static final class PageComposition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f7299c;

        public PageComposition(int i2, int i3, SparseArray sparseArray) {
            this.f7297a = i2;
            this.f7298b = i3;
            this.f7299c = sparseArray;
        }
    }

    public static final class PageRegion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7301b;

        public PageRegion(int i2, int i3) {
            this.f7300a = i2;
            this.f7301b = i3;
        }
    }

    public static final class RegionComposition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7304c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7305e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7306h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f7307i;
        public final SparseArray j;

        public RegionComposition(int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f7302a = i2;
            this.f7303b = z2;
            this.f7304c = i3;
            this.d = i4;
            this.f7305e = i5;
            this.f = i6;
            this.g = i7;
            this.f7306h = i8;
            this.f7307i = i9;
            this.j = sparseArray;
        }
    }

    public static final class RegionObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7309b;

        public RegionObject(int i2, int i3) {
            this.f7308a = i2;
            this.f7309b = i3;
        }
    }

    public static final class SubtitleService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f7312c = new SparseArray();
        public final SparseArray d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f7313e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DisplayDefinition f7314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PageComposition f7315i;

        public SubtitleService(int i2, int i3) {
            this.f7310a = i2;
            this.f7311b = i3;
        }
    }

    public DvbParser(List list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray((byte[]) list.get(0));
        int iA = parsableByteArray.A();
        int iA2 = parsableByteArray.A();
        Paint paint = new Paint();
        this.f7283a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7284b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7285c = new Canvas();
        this.d = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.f7286e = new ClutDefinition(0, new int[]{0, -1, -16777216, -8421505}, e(), f());
        this.f = new SubtitleService(iA, iA2);
    }

    public static byte[] d(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.g(i3);
        }
        return bArr;
    }

    public static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = g(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int g(int i2, int i3, int i4, int i5) {
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
    public static void h(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
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
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        byte[] bArrD3 = null;
        while (parsableBitArray.b() != 0) {
            int iG9 = parsableBitArray.g(8);
            if (iG9 != 240) {
                int i9 = 3;
                int i10 = 4;
                switch (iG9) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrD == null ? f7282i : bArrD;
                        } else {
                            if (i2 == 2) {
                                bArr3 = bArrD3 == null ? f7281h : bArrD3;
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
                        byte[] bArr4 = i2 == 3 ? bArrD2 == null ? j : bArrD2 : null;
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
                                bArrD3 = d(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrD = d(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrD2 = d(16, 8, parsableBitArray);
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

    public static ClutDefinition i(ParsableBitArray parsableBitArray, int i2) {
        int[] iArr;
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = parsableBitArray.g(8);
        parsableBitArray.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrE = e();
        int[] iArrF = f();
        while (i6 > 0) {
            int iG6 = parsableBitArray.g(i4);
            int iG7 = parsableBitArray.g(i4);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrE : iArrF;
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
            iArr[iG6] = g((byte) (255 - (iG2 & 255)), Util.j((int) ((1.402d * d2) + d), 0, 255), Util.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.j((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrF = iArrF;
            i4 = 8;
            i5 = 2;
        }
        return new ClutDefinition(iG5, iArr2, iArrE, iArrF);
    }

    public static ObjectData j(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int iG = parsableBitArray.g(16);
        parsableBitArray.o(4);
        int iG2 = parsableBitArray.g(2);
        boolean zF = parsableBitArray.f();
        parsableBitArray.o(1);
        byte[] bArr2 = Util.f;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = parsableBitArray.g(16);
                int iG4 = parsableBitArray.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    parsableBitArray.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    parsableBitArray.j(iG4, bArr);
                }
            }
            return new ObjectData(iG, zF, bArr2, bArr);
        }
        parsableBitArray.o(parsableBitArray.g(8) * 16);
        bArr = bArr2;
        return new ObjectData(iG, zF, bArr2, bArr);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        boolean z2;
        SubtitleService subtitleService;
        CuesWithTiming cuesWithTiming;
        char c2;
        char c3;
        char c4;
        int i4;
        RegionComposition regionComposition;
        int i5;
        int i6;
        RegionComposition regionComposition2;
        int iG;
        int iG2;
        int i7;
        int iG3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i2 + i3);
        parsableBitArray.m(i2);
        while (true) {
            int iB = parsableBitArray.b();
            z2 = true;
            subtitleService = this.f;
            if (iB >= 48 && parsableBitArray.g(8) == 15) {
                int iG4 = parsableBitArray.g(8);
                int iG5 = parsableBitArray.g(16);
                int iG6 = parsableBitArray.g(16);
                int iD = parsableBitArray.d() + iG6;
                if (iG6 * 8 > parsableBitArray.b()) {
                    Log.g("DvbParser", "Data field length exceeds limit");
                    parsableBitArray.o(parsableBitArray.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == subtitleService.f7310a) {
                                PageComposition pageComposition = subtitleService.f7315i;
                                parsableBitArray.g(8);
                                int iG7 = parsableBitArray.g(4);
                                int iG8 = parsableBitArray.g(2);
                                parsableBitArray.o(2);
                                int i8 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i8 > 0) {
                                    int iG9 = parsableBitArray.g(8);
                                    parsableBitArray.o(8);
                                    i8 -= 6;
                                    sparseArray.put(iG9, new PageRegion(parsableBitArray.g(16), parsableBitArray.g(16)));
                                }
                                PageComposition pageComposition2 = new PageComposition(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    subtitleService.f7315i = pageComposition2;
                                    subtitleService.f7312c.clear();
                                    subtitleService.d.clear();
                                    subtitleService.f7313e.clear();
                                } else if (pageComposition != null && pageComposition.f7297a != iG7) {
                                    subtitleService.f7315i = pageComposition2;
                                }
                            }
                            break;
                        case 17:
                            PageComposition pageComposition3 = subtitleService.f7315i;
                            if (iG5 == subtitleService.f7310a && pageComposition3 != null) {
                                int iG10 = parsableBitArray.g(8);
                                parsableBitArray.o(4);
                                boolean zF = parsableBitArray.f();
                                parsableBitArray.o(3);
                                int iG11 = parsableBitArray.g(16);
                                int iG12 = parsableBitArray.g(16);
                                parsableBitArray.g(3);
                                int iG13 = parsableBitArray.g(3);
                                parsableBitArray.o(2);
                                int iG14 = parsableBitArray.g(8);
                                int iG15 = parsableBitArray.g(8);
                                int iG16 = parsableBitArray.g(4);
                                int iG17 = parsableBitArray.g(2);
                                parsableBitArray.o(2);
                                int i9 = iG6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i9 > 0) {
                                    int iG18 = parsableBitArray.g(16);
                                    int iG19 = parsableBitArray.g(2);
                                    parsableBitArray.g(2);
                                    int iG20 = parsableBitArray.g(12);
                                    parsableBitArray.o(4);
                                    int iG21 = parsableBitArray.g(12);
                                    int i10 = i9 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        parsableBitArray.g(8);
                                        parsableBitArray.g(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray2.put(iG18, new RegionObject(iG20, iG21));
                                }
                                RegionComposition regionComposition3 = new RegionComposition(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray2);
                                SparseArray sparseArray3 = subtitleService.f7312c;
                                if (pageComposition3.f7298b == 0 && (regionComposition2 = (RegionComposition) sparseArray3.get(iG10)) != null) {
                                    int i11 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = regionComposition2.j;
                                        if (i11 < sparseArray4.size()) {
                                            regionComposition3.j.put(sparseArray4.keyAt(i11), (RegionObject) sparseArray4.valueAt(i11));
                                            i11++;
                                        }
                                    }
                                }
                                sparseArray3.put(regionComposition3.f7302a, regionComposition3);
                            }
                            break;
                        case 18:
                            if (iG5 == subtitleService.f7310a) {
                                ClutDefinition clutDefinitionI = i(parsableBitArray, iG6);
                                subtitleService.d.put(clutDefinitionI.f7287a, clutDefinitionI);
                            } else if (iG5 == subtitleService.f7311b) {
                                ClutDefinition clutDefinitionI2 = i(parsableBitArray, iG6);
                                subtitleService.f.put(clutDefinitionI2.f7287a, clutDefinitionI2);
                            }
                            break;
                        case 19:
                            if (iG5 == subtitleService.f7310a) {
                                ObjectData objectDataJ = j(parsableBitArray);
                                subtitleService.f7313e.put(objectDataJ.f7294a, objectDataJ);
                            } else if (iG5 == subtitleService.f7311b) {
                                ObjectData objectDataJ2 = j(parsableBitArray);
                                subtitleService.g.put(objectDataJ2.f7294a, objectDataJ2);
                            }
                            break;
                        case 20:
                            if (iG5 == subtitleService.f7310a) {
                                parsableBitArray.o(4);
                                boolean zF2 = parsableBitArray.f();
                                parsableBitArray.o(3);
                                int iG22 = parsableBitArray.g(16);
                                int iG23 = parsableBitArray.g(16);
                                if (zF2) {
                                    int iG24 = parsableBitArray.g(16);
                                    iG = parsableBitArray.g(16);
                                    iG3 = parsableBitArray.g(16);
                                    iG2 = parsableBitArray.g(16);
                                    i7 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i7 = 0;
                                    iG3 = 0;
                                }
                                subtitleService.f7314h = new DisplayDefinition(iG22, iG23, i7, iG, iG3, iG2);
                            }
                            break;
                    }
                    parsableBitArray.p(iD - parsableBitArray.d());
                }
            }
        }
        PageComposition pageComposition4 = subtitleService.f7315i;
        if (pageComposition4 == null) {
            cuesWithTiming = new CuesWithTiming(ImmutableList.x(), -9223372036854775807L, -9223372036854775807L);
        } else {
            DisplayDefinition displayDefinition = subtitleService.f7314h;
            if (displayDefinition == null) {
                displayDefinition = this.d;
            }
            Bitmap bitmap = this.g;
            Canvas canvas = this.f7285c;
            if (bitmap == null || displayDefinition.f7290a + 1 != bitmap.getWidth() || displayDefinition.f7291b + 1 != this.g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayDefinition.f7290a + 1, displayDefinition.f7291b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            while (true) {
                SparseArray sparseArray5 = pageComposition4.f7299c;
                if (i12 < sparseArray5.size()) {
                    canvas.save();
                    PageRegion pageRegion = (PageRegion) sparseArray5.valueAt(i12);
                    RegionComposition regionComposition4 = (RegionComposition) subtitleService.f7312c.get(sparseArray5.keyAt(i12));
                    int i13 = pageRegion.f7300a + displayDefinition.f7292c;
                    int i14 = pageRegion.f7301b + displayDefinition.f7293e;
                    int iMin = Math.min(regionComposition4.f7304c + i13, displayDefinition.d);
                    int i15 = regionComposition4.d;
                    int i16 = i14 + i15;
                    boolean z3 = z2;
                    canvas.clipRect(i13, i14, iMin, Math.min(i16, displayDefinition.f));
                    SparseArray sparseArray6 = subtitleService.d;
                    int i17 = regionComposition4.f;
                    ClutDefinition clutDefinition = (ClutDefinition) sparseArray6.get(i17);
                    if (clutDefinition == null && (clutDefinition = (ClutDefinition) subtitleService.f.get(i17)) == null) {
                        clutDefinition = this.f7286e;
                    }
                    int i18 = 0;
                    while (true) {
                        SparseArray sparseArray7 = regionComposition4.j;
                        if (i18 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i18);
                            RegionObject regionObject = (RegionObject) sparseArray7.valueAt(i18);
                            PageComposition pageComposition5 = pageComposition4;
                            ObjectData objectData = (ObjectData) subtitleService.f7313e.get(iKeyAt);
                            if (objectData == null) {
                                objectData = (ObjectData) subtitleService.g.get(iKeyAt);
                            }
                            if (objectData != null) {
                                Paint paint = objectData.f7295b ? null : this.f7283a;
                                int i19 = regionObject.f7308a + i13;
                                int i20 = regionObject.f7309b + i14;
                                int i21 = i13;
                                int i22 = regionComposition4.f7305e;
                                int i23 = i14;
                                int[] iArr = i22 == 3 ? clutDefinition.d : i22 == 2 ? clutDefinition.f7289c : clutDefinition.f7288b;
                                regionComposition = regionComposition4;
                                i6 = i21;
                                i5 = i23;
                                h(objectData.f7296c, iArr, i22, i19, i20, paint, canvas);
                                h(objectData.d, iArr, i22, i19, i20 + 1, paint, canvas);
                            } else {
                                regionComposition = regionComposition4;
                                i5 = i14;
                                i6 = i13;
                            }
                            i18++;
                            regionComposition4 = regionComposition;
                            i16 = i16;
                            i13 = i6;
                            i14 = i5;
                            i15 = i15;
                            pageComposition4 = pageComposition5;
                            i12 = i12;
                            subtitleService = subtitleService;
                            arrayList = arrayList;
                        } else {
                            PageComposition pageComposition6 = pageComposition4;
                            ArrayList arrayList2 = arrayList;
                            int i24 = i12;
                            SubtitleService subtitleService2 = subtitleService;
                            RegionComposition regionComposition5 = regionComposition4;
                            int i25 = i14;
                            int i26 = i13;
                            int i27 = i15;
                            int i28 = i16;
                            boolean z4 = regionComposition5.f7303b;
                            int i29 = regionComposition5.f7304c;
                            if (z4) {
                                int i30 = regionComposition5.f7305e;
                                if (i30 == 3) {
                                    i4 = clutDefinition.d[regionComposition5.g];
                                    c4 = 2;
                                } else {
                                    c4 = 2;
                                    i4 = i30 == 2 ? clutDefinition.f7289c[regionComposition5.f7306h] : clutDefinition.f7288b[regionComposition5.f7307i];
                                }
                                Paint paint2 = this.f7284b;
                                paint2.setColor(i4);
                                c3 = 3;
                                c2 = c4;
                                canvas.drawRect(i26, i25, i26 + i29, i28, paint2);
                            } else {
                                c2 = 2;
                                c3 = 3;
                            }
                            Cue.Builder builder = new Cue.Builder();
                            builder.f5605b = Bitmap.createBitmap(this.g, i26, i25, i29, i27);
                            float f = displayDefinition.f7290a;
                            builder.f5608h = i26 / f;
                            builder.f5609i = 0;
                            float f2 = displayDefinition.f7291b;
                            builder.f5607e = i25 / f2;
                            builder.f = 0;
                            builder.g = 0;
                            builder.f5610l = i29 / f;
                            builder.m = i27 / f2;
                            arrayList2.add(builder.a());
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i12 = i24 + 1;
                            z2 = z3;
                            arrayList = arrayList2;
                            subtitleService = subtitleService2;
                            pageComposition4 = pageComposition6;
                        }
                    }
                } else {
                    cuesWithTiming = new CuesWithTiming(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        consumer.accept(cuesWithTiming);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void reset() {
        SubtitleService subtitleService = this.f;
        subtitleService.f7312c.clear();
        subtitleService.d.clear();
        subtitleService.f7313e.clear();
        subtitleService.f.clear();
        subtitleService.g.clear();
        subtitleService.f7314h = null;
        subtitleService.f7315i = null;
    }
}
