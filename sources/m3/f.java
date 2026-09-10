package m3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.z7;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import k3.l;
import k3.m;
import l1.g;
import l1.q;
import l1.y;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f45854h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f45855i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f45856j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f45857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f45858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f45859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t7 f45860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f45861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z7 f45862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f45863g;

    public f(List list) {
        q qVar = new q((byte[]) list.get(0));
        int iG = qVar.G();
        int iG2 = qVar.G();
        Paint paint = new Paint();
        this.f45857a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f45858b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f45859c = new Canvas();
        this.f45860d = new t7(719, 575, 0, 719, 0, 575);
        this.f45861e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f45862f = new z7(iG, iG2, 1);
    }

    public static byte[] a(int i10, int i11, xd1 xd1Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xd1Var.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void f(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c4;
        char c5;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20;
        xd1 xd1Var = new xd1(bArr, bArr.length);
        int i21 = i11;
        int i22 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (xd1Var.b() != 0) {
            int i23 = 8;
            int i24 = xd1Var.i(8);
            if (i24 != 240) {
                int i25 = 3;
                int i26 = 2;
                int i27 = 4;
                switch (i24) {
                    case 16:
                        if (i10 == 3) {
                            bArr2 = bArrA == null ? f45855i : bArrA;
                        } else if (i10 == 2) {
                            bArr2 = bArrA3 == null ? f45854h : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z12 = false;
                        while (true) {
                            int i28 = xd1Var.i(2);
                            if (i28 != 0) {
                                i13 = i28;
                                i14 = 1;
                            } else {
                                if (xd1Var.h()) {
                                    int i29 = xd1Var.i(3) + 3;
                                    i13 = xd1Var.i(2);
                                    i14 = i29;
                                } else {
                                    if (xd1Var.h()) {
                                        i14 = 1;
                                        c4 = '\b';
                                        c5 = 4;
                                    } else {
                                        int i30 = xd1Var.i(2);
                                        if (i30 == 0) {
                                            c4 = '\b';
                                            c5 = 4;
                                            z12 = true;
                                        } else if (i30 == 1) {
                                            c4 = '\b';
                                            c5 = 4;
                                            i14 = 2;
                                        } else if (i30 == 2) {
                                            c4 = '\b';
                                            c5 = 4;
                                            i14 = xd1Var.i(4) + 12;
                                            i13 = xd1Var.i(2);
                                            z12 = z12;
                                        } else if (i30 != 3) {
                                            z12 = z12;
                                            c4 = '\b';
                                            c5 = 4;
                                        } else {
                                            c4 = '\b';
                                            int i31 = xd1Var.i(8) + 29;
                                            i13 = xd1Var.i(2);
                                            z12 = z12;
                                            i14 = i31;
                                            c5 = 4;
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                    i13 = 0;
                                }
                                if (i14 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i13 = bArr2[i13];
                                    }
                                    paint.setColor(iArr[i13]);
                                    canvas.drawRect(i21, i22, i21 + i14, i22 + 1, paint);
                                }
                                i21 += i14;
                                if (z12) {
                                    xd1Var.c();
                                } else {
                                    paint = paint;
                                    z12 = z12;
                                }
                            }
                            c4 = '\b';
                            c5 = 4;
                            if (i14 == 0) {
                            }
                            i21 += i14;
                            if (z12) {
                                xd1Var.c();
                            } else {
                                paint = paint;
                                z12 = z12;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i10 == 3 ? bArrA2 == null ? f45856j : bArrA2 : null;
                        boolean z13 = false;
                        while (true) {
                            int i32 = xd1Var.i(i27);
                            if (i32 != 0) {
                                z10 = z13;
                                i17 = i32;
                                i15 = 1;
                            } else if (xd1Var.h()) {
                                if (xd1Var.h()) {
                                    int i33 = xd1Var.i(i26);
                                    if (i33 == 0) {
                                        z10 = z13;
                                        i15 = 1;
                                    } else if (i33 != 1) {
                                        if (i33 == i26) {
                                            i15 = xd1Var.i(i27) + 9;
                                            i16 = xd1Var.i(i27);
                                        } else if (i33 != i25) {
                                            z10 = z13;
                                            i15 = 0;
                                        } else {
                                            i15 = xd1Var.i(i23) + 25;
                                            i16 = xd1Var.i(i27);
                                        }
                                        i17 = i16;
                                    } else {
                                        z10 = z13;
                                        i15 = i26;
                                    }
                                    i17 = 0;
                                } else {
                                    i15 = xd1Var.i(i26) + 4;
                                    i17 = xd1Var.i(i27);
                                }
                                z10 = z13;
                            } else {
                                int i34 = xd1Var.i(i25);
                                if (i34 != 0) {
                                    i15 = i34 + 2;
                                    z10 = z13;
                                } else {
                                    z10 = true;
                                    i15 = 0;
                                }
                                i17 = 0;
                            }
                            if (i15 == 0 || paint == 0) {
                                i18 = i25;
                                i19 = i26;
                            } else {
                                if (bArr3 != 0) {
                                    i17 = bArr3[i17];
                                }
                                paint.setColor(iArr[i17]);
                                i18 = i25;
                                i19 = 2;
                                canvas.drawRect(i21, i22, i21 + i15, i22 + 1, paint);
                            }
                            i21 += i15;
                            if (z10) {
                                xd1Var.c();
                            } else {
                                z13 = z10;
                                i25 = i18;
                                i26 = i19;
                                i27 = 4;
                                i23 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z14 = false;
                        while (true) {
                            int i35 = xd1Var.i(8);
                            if (i35 != 0) {
                                z11 = z14;
                                i20 = 1;
                            } else if (xd1Var.h()) {
                                z11 = z14;
                                i20 = xd1Var.i(7);
                                i35 = xd1Var.i(8);
                            } else {
                                int i36 = xd1Var.i(7);
                                if (i36 != 0) {
                                    z11 = z14;
                                    i20 = i36;
                                    i35 = 0;
                                } else {
                                    z11 = true;
                                    i35 = 0;
                                    i20 = 0;
                                }
                            }
                            if (i20 != 0 && paint != 0) {
                                paint.setColor(iArr[i35]);
                                canvas.drawRect(i21, i22, i21 + i20, i22 + 1, paint);
                            }
                            i21 += i20;
                            if (!z11) {
                                z14 = z11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i24) {
                            case 32:
                                bArrA3 = a(4, 4, xd1Var);
                                break;
                            case 33:
                                bArrA = a(4, 8, xd1Var);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, xd1Var);
                                break;
                        }
                        break;
                }
            } else {
                i22 += 2;
                i21 = i11;
            }
        }
    }

    public static a h(xd1 xd1Var, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = xd1Var.i(8);
        xd1Var.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i21 = xd1Var.i(i16);
            int i22 = xd1Var.i(i16);
            if ((i22 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i22 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i22 & 1) != 0) {
                i14 = xd1Var.i(i16);
                i15 = xd1Var.i(i16);
                i11 = xd1Var.i(i16);
                i13 = xd1Var.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = xd1Var.i(6) << i18;
                int i24 = xd1Var.i(4) << 4;
                i11 = xd1Var.i(4) << 4;
                i12 = i19 - 4;
                i13 = xd1Var.i(i18) << 6;
                i14 = i23;
                i15 = i24;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d10 = i14;
            double d11 = i15 - 128;
            double d12 = i11 - 128;
            iArr[i21] = d((byte) (255 - (i13 & 255)), y.j((int) ((1.402d * d11) + d10), 0, 255), y.j((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), y.j((int) ((d12 * 1.772d) + d10), 0, 255));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr2, iArrB, iArrC);
    }

    public static b j(xd1 xd1Var) {
        byte[] bArr;
        int i10 = xd1Var.i(16);
        xd1Var.t(4);
        int i11 = xd1Var.i(2);
        boolean zH = xd1Var.h();
        xd1Var.t(1);
        byte[] bArr2 = y.f44831b;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = xd1Var.i(16);
                int i13 = xd1Var.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    xd1Var.l(i12, bArr2);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    xd1Var.l(i13, bArr);
                }
            }
            return new b(i10, zH, bArr2, bArr);
        }
        xd1Var.t(xd1Var.i(8) * 16);
        bArr = bArr2;
        return new b(i10, zH, bArr2, bArr);
    }

    @Override // k3.m
    public final void e(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        z7 z7Var;
        boolean z10;
        k3.a aVar;
        char c4;
        char c5;
        char c10;
        int i12;
        int i13;
        d dVar;
        int i14;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        xd1 xd1Var = new xd1(bArr, i10 + i11);
        xd1Var.q(i10);
        while (true) {
            int iB = xd1Var.b();
            z7Var = this.f45862f;
            z10 = true;
            if (iB >= 48 && xd1Var.i(8) == 15) {
                int i20 = xd1Var.i(8);
                int i21 = xd1Var.i(16);
                int i22 = xd1Var.i(16);
                int iF = xd1Var.f() + i22;
                if (i22 * 8 > xd1Var.b()) {
                    l1.a.s("DvbParser", "Data field length exceeds limit");
                    xd1Var.t(xd1Var.b());
                } else {
                    switch (i20) {
                        case 16:
                            if (i21 == z7Var.f22524a) {
                                a7.b bVar = (a7.b) z7Var.f22532i;
                                xd1Var.i(8);
                                int i23 = xd1Var.i(4);
                                int i24 = xd1Var.i(2);
                                xd1Var.t(2);
                                int i25 = i22 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i25 > 0) {
                                    int i26 = xd1Var.i(8);
                                    xd1Var.t(8);
                                    i25 -= 6;
                                    sparseArray.put(i26, new c(xd1Var.i(16), xd1Var.i(16)));
                                }
                                a7.b bVar2 = new a7.b(i23, i24, sparseArray);
                                if (i24 != 0) {
                                    z7Var.f22532i = bVar2;
                                    z7Var.f22526c.clear();
                                    z7Var.f22527d.clear();
                                    z7Var.f22528e.clear();
                                } else if (bVar != null && bVar.f3415b != i23) {
                                    z7Var.f22532i = bVar2;
                                }
                            }
                            break;
                        case 17:
                            a7.b bVar3 = (a7.b) z7Var.f22532i;
                            SparseArray sparseArray2 = z7Var.f22526c;
                            if (i21 == z7Var.f22524a && bVar3 != null) {
                                int i27 = xd1Var.i(8);
                                xd1Var.t(4);
                                boolean zH = xd1Var.h();
                                xd1Var.t(3);
                                int i28 = xd1Var.i(16);
                                int i29 = xd1Var.i(16);
                                xd1Var.i(3);
                                int i30 = xd1Var.i(3);
                                xd1Var.t(2);
                                int i31 = xd1Var.i(8);
                                int i32 = xd1Var.i(8);
                                int i33 = xd1Var.i(4);
                                int i34 = xd1Var.i(2);
                                xd1Var.t(2);
                                int i35 = i22 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i35 > 0) {
                                    int i36 = xd1Var.i(16);
                                    int i37 = xd1Var.i(2);
                                    xd1Var.i(2);
                                    int i38 = xd1Var.i(12);
                                    xd1Var.t(4);
                                    int i39 = xd1Var.i(12);
                                    int i40 = i35 - 6;
                                    if (i37 == 1 || i37 == 2) {
                                        xd1Var.i(8);
                                        xd1Var.i(8);
                                        i35 -= 8;
                                    } else {
                                        i35 = i40;
                                    }
                                    sparseArray3.put(i36, new e(i38, i39));
                                }
                                d dVar3 = new d(i27, zH, i28, i29, i30, i31, i32, i33, i34, sparseArray3);
                                if (bVar3.f3416c == 0 && (dVar2 = (d) sparseArray2.get(i27)) != null) {
                                    SparseArray sparseArray4 = dVar2.f45851j;
                                    for (int i41 = 0; i41 < sparseArray4.size(); i41++) {
                                        dVar3.f45851j.put(sparseArray4.keyAt(i41), (e) sparseArray4.valueAt(i41));
                                    }
                                }
                                sparseArray2.put(dVar3.f45842a, dVar3);
                            }
                            break;
                        case 18:
                            if (i21 == z7Var.f22524a) {
                                a aVarH = h(xd1Var, i22);
                                z7Var.f22527d.put(aVarH.f45832a, aVarH);
                            } else if (i21 == z7Var.f22525b) {
                                a aVarH2 = h(xd1Var, i22);
                                z7Var.f22529f.put(aVarH2.f45832a, aVarH2);
                            }
                            break;
                        case 19:
                            if (i21 == z7Var.f22524a) {
                                b bVarJ = j(xd1Var);
                                z7Var.f22528e.put(bVarJ.f45836a, bVarJ);
                            } else if (i21 == z7Var.f22525b) {
                                b bVarJ2 = j(xd1Var);
                                z7Var.f22530g.put(bVarJ2.f45836a, bVarJ2);
                            }
                            break;
                        case 20:
                            if (i21 == z7Var.f22524a) {
                                xd1Var.t(4);
                                boolean zH2 = xd1Var.h();
                                xd1Var.t(3);
                                int i42 = xd1Var.i(16);
                                int i43 = xd1Var.i(16);
                                if (zH2) {
                                    int i44 = xd1Var.i(16);
                                    i16 = xd1Var.i(16);
                                    i19 = xd1Var.i(16);
                                    i17 = xd1Var.i(16);
                                    i18 = i44;
                                } else {
                                    i16 = i42;
                                    i17 = i43;
                                    i18 = 0;
                                    i19 = 0;
                                }
                                z7Var.f22531h = new t7(i42, i43, i18, i16, i19, i17);
                            }
                            break;
                    }
                    xd1Var.u(iF - xd1Var.f());
                }
            }
        }
        a7.b bVar4 = (a7.b) z7Var.f22532i;
        if (bVar4 == null) {
            f0 f0Var = j0.f47265b;
            aVar = new k3.a(n1.f47281e, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            t7 t7Var = (t7) z7Var.f22531h;
            if (t7Var == null) {
                t7Var = this.f45860d;
            }
            Bitmap bitmap = this.f45863g;
            Canvas canvas = this.f45859c;
            if (bitmap == null || t7Var.f20227a + 1 != bitmap.getWidth() || t7Var.f20228b + 1 != this.f45863g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(t7Var.f20227a + 1, t7Var.f20228b + 1, Bitmap.Config.ARGB_8888);
                this.f45863g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) bVar4.f3417d;
            int i45 = 0;
            while (i45 < sparseArray5.size()) {
                canvas.save();
                c cVar = (c) sparseArray5.valueAt(i45);
                d dVar4 = (d) z7Var.f22526c.get(sparseArray5.keyAt(i45));
                int i46 = cVar.f45840a + t7Var.f20229c;
                int i47 = cVar.f45841b + t7Var.f20231e;
                int i48 = dVar4.f45844c;
                int i49 = dVar4.f45847f;
                int i50 = dVar4.f45845d;
                boolean z11 = z10;
                int i51 = i46 + i48;
                int i52 = i47 + i50;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i46, i47, Math.min(i51, t7Var.f20230d), Math.min(i52, t7Var.f20232f));
                a aVar2 = (a) z7Var.f22527d.get(i49);
                if (aVar2 == null && (aVar2 = (a) z7Var.f22529f.get(i49)) == null) {
                    aVar2 = this.f45861e;
                }
                SparseArray sparseArray7 = dVar4.f45851j;
                int i53 = i45;
                int i54 = 0;
                while (i54 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i54);
                    SparseArray sparseArray8 = sparseArray7;
                    e eVar = (e) sparseArray7.valueAt(i54);
                    int i55 = i47;
                    b bVar5 = (b) z7Var.f22528e.get(iKeyAt);
                    if (bVar5 == null) {
                        bVar5 = (b) z7Var.f22530g.get(iKeyAt);
                    }
                    b bVar6 = bVar5;
                    if (bVar6 != null) {
                        Paint paint = bVar6.f45837b ? null : this.f45857a;
                        int i56 = i46;
                        int i57 = dVar4.f45846e;
                        int i58 = i56 + eVar.f45852a;
                        int i59 = i55 + eVar.f45853b;
                        int i60 = i50;
                        Paint paint2 = paint;
                        i14 = i56;
                        i13 = i55;
                        d dVar5 = dVar4;
                        int[] iArr = i57 == 3 ? aVar2.f45835d : i57 == 2 ? aVar2.f45834c : aVar2.f45833b;
                        dVar = dVar5;
                        i15 = i60;
                        f(bVar6.f45838c, iArr, i57, i58, i59, paint2, canvas);
                        f(bVar6.f45839d, iArr, i57, i58, i59 + 1, paint2, canvas);
                    } else {
                        i13 = i55;
                        dVar = dVar4;
                        i14 = i46;
                        i15 = i50;
                    }
                    i54++;
                    i48 = i48;
                    i47 = i13;
                    dVar4 = dVar;
                    i46 = i14;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    t7Var = t7Var;
                    z7Var = z7Var;
                    i50 = i15;
                }
                t7 t7Var2 = t7Var;
                ArrayList arrayList2 = arrayList;
                z7 z7Var2 = z7Var;
                int i61 = i47;
                d dVar6 = dVar4;
                int i62 = i46;
                int i63 = i48;
                int i64 = i50;
                if (dVar6.f45843b) {
                    int i65 = dVar6.f45846e;
                    if (i65 == 3) {
                        i12 = aVar2.f45835d[dVar6.f45848g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i65 == 2 ? aVar2.f45834c[dVar6.f45849h] : aVar2.f45833b[dVar6.f45850i];
                    }
                    Paint paint3 = this.f45858b;
                    paint3.setColor(i12);
                    c4 = c10;
                    c5 = 3;
                    canvas.drawRect(i62, i61, i51, i52, paint3);
                } else {
                    c4 = 2;
                    c5 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f45863g, i62, i61, i63, i64);
                float f10 = t7Var2.f20227a;
                float f11 = t7Var2.f20228b;
                arrayList2.add(new k1.b(null, null, null, bitmapCreateBitmap2, i61 / f11, 0, 0, i62 / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, i63 / f10, i64 / f11, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i45 = i53 + 1;
                z10 = z11;
                t7Var = t7Var2;
                arrayList = arrayList2;
                z7Var = z7Var2;
                sparseArray5 = sparseArray6;
            }
            aVar = new k3.a(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        gVar.accept(aVar);
    }

    @Override // k3.m
    public final int i() {
        return 2;
    }

    @Override // k3.m
    public final void reset() {
        z7 z7Var = this.f45862f;
        z7Var.f22526c.clear();
        z7Var.f22527d.clear();
        z7Var.f22528e.clear();
        z7Var.f22529f.clear();
        z7Var.f22530g.clear();
        z7Var.f22531h = null;
        z7Var.f22532i = null;
    }
}
