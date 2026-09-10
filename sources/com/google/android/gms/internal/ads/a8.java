package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 implements q7 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f11922h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f11923i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f11924j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11931g;

    public a8(Context context, ft ftVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.f11925a = new Object();
        this.f11930f = new AtomicBoolean(false);
        this.f11926b = context.getApplicationContext();
        this.f11929e = versionInfoParcel;
        this.f11928d = ftVar;
        this.f11931g = executor;
    }

    public static s7 c(gp0 gp0Var, int i10) {
        int[] iArr;
        int iH;
        int iH2;
        int iH3;
        int iH4;
        int i11 = 8;
        int iH5 = gp0Var.h(8);
        gp0Var.f(8);
        int i12 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrF = f();
        int[] iArrI = i();
        int i13 = i10 - 2;
        while (i13 > 0) {
            int iH6 = gp0Var.h(i11);
            int iH7 = gp0Var.h(i11);
            if ((iH7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrF : iArrI;
            }
            if ((iH7 & 1) != 0) {
                iH3 = gp0Var.h(i11);
                iH4 = gp0Var.h(i11);
                iH = gp0Var.h(i11);
                iH2 = gp0Var.h(i11);
                i13 -= 6;
            } else {
                int iH8 = gp0Var.h(6) << 2;
                int iH9 = gp0Var.h(4) << 4;
                i13 -= 4;
                iH = gp0Var.h(4) << 4;
                iH2 = gp0Var.h(2) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
            }
            if (iH3 == 0) {
                iH = i12;
            }
            if (iH3 == 0) {
                iH4 = i12;
            }
            double d10 = iH3;
            String str = uu0.f20901a;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = j((byte) (255 - (iH2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            i12 = 0;
            iH5 = iH5;
            iArrI = iArrI;
            i11 = 8;
        }
        return new s7(iH5, iArr2, iArrF, iArrI);
    }

    public static u7 d(gp0 gp0Var) {
        byte[] bArr;
        int iH = gp0Var.h(16);
        gp0Var.f(4);
        int iH2 = gp0Var.h(2);
        boolean zG = gp0Var.g();
        gp0Var.f(1);
        byte[] bArr2 = uu0.f20902b;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = gp0Var.h(16);
                int iH4 = gp0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    ps1.c0(gp0Var.f14923c == 0);
                    System.arraycopy(gp0Var.f14921a, gp0Var.f14922b, bArr2, 0, iH3);
                    gp0Var.f14922b += iH3;
                    gp0Var.m();
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    ps1.c0(gp0Var.f14923c == 0);
                    System.arraycopy(gp0Var.f14921a, gp0Var.f14922b, bArr, 0, iH4);
                    gp0Var.f14922b += iH4;
                    gp0Var.m();
                }
            }
            return new u7(iH, zG, bArr2, bArr);
        }
        gp0Var.f(gp0Var.h(8) * 16);
        bArr = bArr2;
        return new u7(iH, zG, bArr2, bArr);
    }

    public static JSONObject e(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) fn.f14468f.o()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", fn.f14469g.o());
            jSONObject.put("cl", "910357297");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", t9.d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = j(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = j(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = j(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = j(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = j(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = j(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = j(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int j(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    public static void k(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c4;
        int iH;
        int iH2;
        int iH3;
        int i13;
        int iH4;
        int iH5;
        int i14;
        int i15;
        int iH6;
        int i16;
        Paint paint2 = paint;
        gp0 gp0Var = new gp0(bArr, bArr.length);
        int i17 = i11;
        int i18 = i12;
        byte[] bArrL = null;
        byte[] bArrL2 = null;
        byte[] bArrL3 = null;
        while (gp0Var.b() != 0) {
            int iH7 = gp0Var.h(8);
            if (iH7 != 240) {
                int i19 = 4;
                int i20 = 1;
                int i21 = 2;
                switch (iH7) {
                    case 16:
                        int i22 = 1;
                        if (i10 == 3) {
                            if (bArrL == null) {
                                bArr3 = f11923i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrL;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArrL3 == null) {
                            bArr3 = f11922h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrL3;
                        }
                        int i23 = 0;
                        while (true) {
                            int iH8 = gp0Var.h(2);
                            if (iH8 != 0) {
                                iH2 = i22;
                                iH = iH8;
                            } else {
                                if (gp0Var.g()) {
                                    iH3 = gp0Var.h(3) + 3;
                                    iH = gp0Var.h(2);
                                } else {
                                    if (gp0Var.g()) {
                                        iH2 = i22;
                                        iH = 0;
                                    } else {
                                        int iH9 = gp0Var.h(2);
                                        if (iH9 == 0) {
                                            c4 = 4;
                                            i23 = i22;
                                            iH = 0;
                                            iH2 = 0;
                                        } else if (iH9 == i22) {
                                            c4 = 4;
                                            i23 = i23;
                                            iH2 = 2;
                                            iH = 0;
                                        } else if (iH9 == 2) {
                                            c4 = 4;
                                            i23 = i23;
                                            iH2 = gp0Var.h(4) + 12;
                                            iH = gp0Var.h(2);
                                        } else if (iH9 != 3) {
                                            iH = 0;
                                            iH2 = 0;
                                        } else {
                                            iH3 = gp0Var.h(8) + 29;
                                            iH = gp0Var.h(2);
                                        }
                                        if (iH2 == 0 && paint2 != null) {
                                            int i24 = i18 + 1;
                                            float f10 = i18;
                                            if (bArr2 != 0) {
                                                iH = bArr2[iH];
                                            }
                                            paint2.setColor(iArr[iH]);
                                            canvas.drawRect(i17, f10, i17 + iH2, i24, paint2);
                                        }
                                        i17 += iH2;
                                        if (i23 != 0) {
                                            gp0Var.k();
                                        } else {
                                            paint2 = paint;
                                            i23 = i23;
                                            i22 = 1;
                                        }
                                    }
                                    c4 = 4;
                                    if (iH2 == 0) {
                                    }
                                    i17 += iH2;
                                    if (i23 != 0) {
                                        gp0Var.k();
                                    } else {
                                        paint2 = paint;
                                        i23 = i23;
                                        i22 = 1;
                                    }
                                }
                                iH2 = iH3;
                            }
                            c4 = 4;
                            if (iH2 == 0) {
                            }
                            i17 += iH2;
                            if (i23 != 0) {
                                gp0Var.k();
                            } else {
                                paint2 = paint;
                                i23 = i23;
                                i22 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? bArrL2 == null ? f11924j : bArrL2 : null;
                        boolean z10 = false;
                        while (true) {
                            int iH10 = gp0Var.h(i19);
                            if (iH10 != 0) {
                                i13 = 1;
                                z10 = z10;
                            } else if (gp0Var.g()) {
                                if (gp0Var.g()) {
                                    int iH11 = gp0Var.h(i21);
                                    if (iH11 == 0) {
                                        i13 = 1;
                                    } else if (iH11 == 1) {
                                        i13 = i21;
                                    } else if (iH11 == i21) {
                                        iH4 = gp0Var.h(i19) + 9;
                                        iH5 = gp0Var.h(i19);
                                    } else if (iH11 != 3) {
                                        z10 = z10;
                                        iH10 = 0;
                                        i13 = 0;
                                    } else {
                                        iH4 = gp0Var.h(8) + 25;
                                        iH5 = gp0Var.h(i19);
                                    }
                                    iH10 = 0;
                                } else {
                                    iH4 = gp0Var.h(i21) + i19;
                                    iH5 = gp0Var.h(i19);
                                }
                                i13 = iH4;
                                z10 = z10;
                                iH10 = iH5;
                            } else {
                                int iH12 = gp0Var.h(3);
                                if (iH12 != 0) {
                                    i13 = iH12 + 2;
                                    iH10 = 0;
                                } else {
                                    z10 = true;
                                    iH10 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i21;
                            } else {
                                int i25 = i18 + 1;
                                float f11 = i18;
                                if (bArr4 != 0) {
                                    iH10 = bArr4[iH10];
                                }
                                paint2.setColor(iArr[iH10]);
                                i14 = 2;
                                canvas.drawRect(i17, f11, i17 + i13, i25, paint2);
                            }
                            i17 += i13;
                            if (z10) {
                                gp0Var.k();
                                continue;
                            } else {
                                i21 = i14;
                                z10 = z10;
                                i19 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i26 = i17;
                        int i27 = 0;
                        while (true) {
                            int iH13 = gp0Var.h(8);
                            if (iH13 != 0) {
                                i15 = i27;
                                iH6 = i20;
                            } else if (gp0Var.g()) {
                                i15 = i27;
                                iH6 = gp0Var.h(7);
                                iH13 = gp0Var.h(8);
                            } else {
                                int iH14 = gp0Var.h(7);
                                if (iH14 != 0) {
                                    i15 = i27;
                                    iH6 = iH14;
                                    iH13 = 0;
                                } else {
                                    i15 = i20;
                                    iH13 = 0;
                                    iH6 = 0;
                                }
                            }
                            if (iH6 == 0 || paint2 == null) {
                                i16 = i20;
                            } else {
                                paint2.setColor(iArr[iH13]);
                                i16 = i20;
                                canvas.drawRect(i26, i18, i26 + iH6, i18 + 1, paint2);
                            }
                            i26 += iH6;
                            if (i15 != 0) {
                                i17 = i26;
                                continue;
                            } else {
                                i20 = i16;
                                i27 = i15;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iH7) {
                            case 32:
                                bArrL3 = l(4, 4, gp0Var);
                                break;
                            case 33:
                                bArrL = l(4, 8, gp0Var);
                                break;
                            case 34:
                                bArrL2 = l(16, 8, gp0Var);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i18 += 2;
                i17 = i11;
            }
            paint2 = paint;
        }
    }

    public static byte[] l(int i10, int i11, gp0 gp0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gp0Var.h(i11);
        }
        return bArr;
    }

    public ListenableFuture a() {
        synchronized (this.f11925a) {
            try {
                if (((SharedPreferences) this.f11927c) == null) {
                    this.f11927c = ((Context) this.f11926b).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f11927c;
        long j10 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        ((p9.b) zzt.zzk()).getClass();
        if (System.currentTimeMillis() - j10 < ((Long) fn.f14470h.o()).longValue()) {
            return be1.f12743b;
        }
        return zw1.z(((ft) this.f11928d).a(e((Context) this.f11926b, (VersionInfoParcel) this.f11929e)), new lx(this, 0), ((Boolean) fn.f14474m.o()).booleanValue() ? (Executor) this.f11931g : l00.f16615h);
    }

    @Override // com.google.android.gms.internal.ads.q7
    public void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        boolean z10;
        m7 m7Var;
        char c4;
        char c5;
        char c10;
        int i12;
        int i13;
        x7 x7Var;
        int i14;
        x7 x7Var2;
        int iH;
        int iH2;
        int i15;
        int iH3;
        Canvas canvas = (Canvas) this.f11927c;
        z7 z7Var = (z7) this.f11930f;
        gp0 gp0Var = new gp0(bArr, i10 + i11);
        gp0Var.d(i10);
        while (true) {
            z10 = true;
            if (gp0Var.b() >= 48 && gp0Var.h(8) == 15) {
                int iH4 = gp0Var.h(8);
                int i16 = 16;
                int iH5 = gp0Var.h(16);
                int iH6 = gp0Var.h(16);
                int iC = gp0Var.c() + iH6;
                if (iH6 * 8 > gp0Var.b()) {
                    v71.y("DvbParser", "Data field length exceeds limit");
                    gp0Var.f(gp0Var.b());
                } else {
                    switch (iH4) {
                        case 16:
                            if (iH5 == z7Var.f22524a) {
                                q5 q5Var = (q5) z7Var.f22532i;
                                gp0Var.h(8);
                                int iH7 = gp0Var.h(4);
                                int iH8 = gp0Var.h(2);
                                gp0Var.f(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = iH6 - 2; i17 > 0; i17 -= 6) {
                                    int iH9 = gp0Var.h(8);
                                    gp0Var.f(8);
                                    sparseArray.put(iH9, new w7(gp0Var.h(16), gp0Var.h(16)));
                                }
                                q5 q5Var2 = new q5();
                                q5Var2.f18932a = iH7;
                                q5Var2.f18933b = iH8;
                                q5Var2.f18934c = sparseArray;
                                if (iH8 != 0) {
                                    z7Var.f22532i = q5Var2;
                                    z7Var.f22526c.clear();
                                    z7Var.f22527d.clear();
                                    z7Var.f22528e.clear();
                                } else if (q5Var != null && q5Var.f18932a != iH7) {
                                    z7Var.f22532i = q5Var2;
                                }
                            }
                            break;
                        case 17:
                            q5 q5Var3 = (q5) z7Var.f22532i;
                            SparseArray sparseArray2 = z7Var.f22526c;
                            if (iH5 == z7Var.f22524a && q5Var3 != null) {
                                int iH10 = gp0Var.h(8);
                                gp0Var.f(4);
                                boolean zG = gp0Var.g();
                                gp0Var.f(3);
                                int iH11 = gp0Var.h(16);
                                int iH12 = gp0Var.h(16);
                                gp0Var.h(3);
                                int iH13 = gp0Var.h(3);
                                gp0Var.f(2);
                                int iH14 = gp0Var.h(8);
                                int iH15 = gp0Var.h(8);
                                int iH16 = gp0Var.h(4);
                                int iH17 = gp0Var.h(2);
                                gp0Var.f(2);
                                int i18 = iH6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i18 > 0) {
                                    int iH18 = gp0Var.h(i16);
                                    int iH19 = gp0Var.h(2);
                                    gp0Var.h(2);
                                    int iH20 = gp0Var.h(12);
                                    gp0Var.f(4);
                                    int iH21 = gp0Var.h(12);
                                    int i19 = i18 - 6;
                                    if (iH19 == 1 || iH19 == 2) {
                                        gp0Var.h(8);
                                        gp0Var.h(8);
                                        i18 -= 8;
                                    } else {
                                        i18 = i19;
                                    }
                                    sparseArray3.put(iH18, new y7(iH20, iH21));
                                    i16 = 16;
                                }
                                x7 x7Var3 = new x7(iH10, zG, iH11, iH12, iH13, iH14, iH15, iH16, iH17, sparseArray3);
                                if (q5Var3.f18933b == 0 && (x7Var2 = (x7) sparseArray2.get(iH10)) != null) {
                                    int i20 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = x7Var2.f21772j;
                                        if (i20 < sparseArray4.size()) {
                                            x7Var3.f21772j.put(sparseArray4.keyAt(i20), (y7) sparseArray4.valueAt(i20));
                                            i20++;
                                        }
                                    }
                                }
                                sparseArray2.put(x7Var3.f21763a, x7Var3);
                            }
                            break;
                        case 18:
                            if (iH5 == z7Var.f22524a) {
                                s7 s7VarC = c(gp0Var, iH6);
                                z7Var.f22527d.put(s7VarC.f19881a, s7VarC);
                            } else if (iH5 == z7Var.f22525b) {
                                s7 s7VarC2 = c(gp0Var, iH6);
                                z7Var.f22529f.put(s7VarC2.f19881a, s7VarC2);
                            }
                            break;
                        case 19:
                            if (iH5 == z7Var.f22524a) {
                                u7 u7VarD = d(gp0Var);
                                z7Var.f22528e.put(u7VarD.f20667a, u7VarD);
                            } else if (iH5 == z7Var.f22525b) {
                                u7 u7VarD2 = d(gp0Var);
                                z7Var.f22530g.put(u7VarD2.f20667a, u7VarD2);
                            }
                            break;
                        case 20:
                            if (iH5 == z7Var.f22524a) {
                                gp0Var.f(4);
                                boolean zG2 = gp0Var.g();
                                gp0Var.f(3);
                                int iH22 = gp0Var.h(16);
                                int iH23 = gp0Var.h(16);
                                if (zG2) {
                                    int iH24 = gp0Var.h(16);
                                    iH = gp0Var.h(16);
                                    iH3 = gp0Var.h(16);
                                    iH2 = gp0Var.h(16);
                                    i15 = iH24;
                                } else {
                                    iH = iH22;
                                    iH2 = iH23;
                                    i15 = 0;
                                    iH3 = 0;
                                }
                                z7Var.f22531h = new t7(iH22, iH23, i15, iH, iH3, iH2);
                            }
                            break;
                    }
                    gp0Var.l(iC - gp0Var.c());
                }
            }
        }
        q5 q5Var4 = (q5) z7Var.f22532i;
        if (q5Var4 == null) {
            aa1 aa1Var = ca1.f13122b;
            m7Var = new m7(ya1.f22208e, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            t7 t7Var = (t7) z7Var.f22531h;
            if (t7Var == null) {
                t7Var = (t7) this.f11928d;
            }
            t7 t7Var2 = t7Var;
            Bitmap bitmap = (Bitmap) this.f11931g;
            if (bitmap == null || t7Var2.f20227a + 1 != bitmap.getWidth() || t7Var2.f20228b + 1 != ((Bitmap) this.f11931g).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(t7Var2.f20227a + 1, t7Var2.f20228b + 1, Bitmap.Config.ARGB_8888);
                this.f11931g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) q5Var4.f18934c;
            int i21 = 0;
            while (i21 < sparseArray5.size()) {
                canvas.save();
                w7 w7Var = (w7) sparseArray5.valueAt(i21);
                x7 x7Var4 = (x7) z7Var.f22526c.get(sparseArray5.keyAt(i21));
                int i22 = w7Var.f21434a + t7Var2.f20229c;
                int i23 = w7Var.f21435b + t7Var2.f20231e;
                int i24 = x7Var4.f21765c;
                int i25 = i22 + i24;
                int iMin = Math.min(i25, t7Var2.f20230d);
                boolean z11 = z10;
                int i26 = x7Var4.f21766d;
                int i27 = i23 + i26;
                canvas.clipRect(i22, i23, iMin, Math.min(i27, t7Var2.f20232f));
                int i28 = x7Var4.f21768f;
                s7 s7Var = (s7) z7Var.f22527d.get(i28);
                if (s7Var == null && (s7Var = (s7) z7Var.f22529f.get(i28)) == null) {
                    s7Var = (s7) this.f11929e;
                }
                SparseArray sparseArray6 = x7Var4.f21772j;
                SparseArray sparseArray7 = sparseArray5;
                int i29 = i23;
                int i30 = 0;
                while (i30 < sparseArray6.size()) {
                    int iKeyAt = sparseArray6.keyAt(i30);
                    int i31 = i30;
                    y7 y7Var = (y7) sparseArray6.valueAt(i30);
                    int i32 = i22;
                    u7 u7Var = (u7) z7Var.f22528e.get(iKeyAt);
                    if (u7Var == null) {
                        u7Var = (u7) z7Var.f22530g.get(iKeyAt);
                    }
                    u7 u7Var2 = u7Var;
                    if (u7Var2 != null) {
                        Paint paint = u7Var2.f20668b ? null : (Paint) this.f11925a;
                        int i33 = x7Var4.f21767e;
                        x7 x7Var5 = x7Var4;
                        int i34 = i32 + y7Var.f22188a;
                        int i35 = i29 + y7Var.f22189b;
                        int[] iArr = i33 == 3 ? s7Var.f19884d : i33 == 2 ? s7Var.f19883c : s7Var.f19882b;
                        x7Var = x7Var5;
                        Paint paint2 = paint;
                        i14 = i26;
                        i13 = i29;
                        k(u7Var2.f20669c, iArr, i33, i34, i35, paint2, canvas);
                        k(u7Var2.f20670d, iArr, i33, i34, i35 + 1, paint2, canvas);
                    } else {
                        i13 = i29;
                        x7Var = x7Var4;
                        i14 = i26;
                    }
                    i29 = i13;
                    i21 = i21;
                    x7Var4 = x7Var;
                    i22 = i32;
                    i30 = i31 + 1;
                    i25 = i25;
                    i24 = i24;
                    arrayList = arrayList;
                    z7Var = z7Var;
                    t7Var2 = t7Var2;
                    sparseArray6 = sparseArray6;
                    i26 = i14;
                }
                int i36 = i29;
                int i37 = i21;
                z7 z7Var2 = z7Var;
                x7 x7Var6 = x7Var4;
                int i38 = i22;
                t7 t7Var3 = t7Var2;
                int i39 = i26;
                ArrayList arrayList2 = arrayList;
                int i40 = i24;
                int i41 = i25;
                float f10 = i36;
                float f11 = i38;
                if (x7Var6.f21764b) {
                    int i42 = x7Var6.f21767e;
                    c5 = 3;
                    if (i42 == 3) {
                        i12 = s7Var.f19884d[x7Var6.f21769g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i42 == 2 ? s7Var.f19883c[x7Var6.f21770h] : s7Var.f19882b[x7Var6.f21771i];
                    }
                    Paint paint3 = (Paint) this.f11926b;
                    paint3.setColor(i12);
                    c4 = c10;
                    canvas.drawRect(f11, f10, i41, i27, paint3);
                } else {
                    c4 = 2;
                    c5 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.f11931g, i38, i36, i40, i39);
                float f12 = t7Var3.f20227a;
                float f13 = f11 / f12;
                float f14 = t7Var3.f20228b;
                l80 l80Var = new l80(null, null, null, bitmapCreateBitmap2, f10 / f14, 0, 0, f13, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f12, i39 / f14, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                arrayList = arrayList2;
                arrayList.add(l80Var);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i21 = i37 + 1;
                t7Var2 = t7Var3;
                sparseArray5 = sparseArray7;
                z7Var = z7Var2;
                z10 = z11;
            }
            m7Var = new m7(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        d0Var.mo161zza(m7Var);
    }

    public hp1 g() throws GeneralSecurityException {
        wv0 wv0Var;
        wv0 wv0Var2;
        ip1 ip1Var = (ip1) this.f11925a;
        if (ip1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        wv0 wv0Var3 = (wv0) this.f11927c;
        if (wv0Var3 == null || (wv0Var = (wv0) this.f11928d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        wv0 wv0Var4 = (wv0) this.f11926b;
        if (wv0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        wv0 wv0Var5 = (wv0) this.f11929e;
        if (wv0Var5 == null || (wv0Var2 = (wv0) this.f11930f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        wv0 wv0Var6 = (wv0) this.f11931g;
        if (wv0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = ip1Var.f15813b.f14927b;
        BigInteger bigInteger2 = ip1Var.f15814c;
        BigInteger bigInteger3 = (BigInteger) wv0Var3.f21612b;
        BigInteger bigInteger4 = (BigInteger) wv0Var.f21612b;
        BigInteger bigInteger5 = (BigInteger) wv0Var4.f21612b;
        BigInteger bigInteger6 = (BigInteger) wv0Var5.f21612b;
        BigInteger bigInteger7 = (BigInteger) wv0Var2.f21612b;
        BigInteger bigInteger8 = (BigInteger) wv0Var6.f21612b;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new hp1((ip1) this.f11925a, (wv0) this.f11927c, (wv0) this.f11928d, (wv0) this.f11926b, (wv0) this.f11929e, (wv0) this.f11930f, (wv0) this.f11931g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public op1 h() throws GeneralSecurityException {
        wv0 wv0Var;
        wv0 wv0Var2;
        pp1 pp1Var = (pp1) this.f11925a;
        if (pp1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        wv0 wv0Var3 = (wv0) this.f11927c;
        if (wv0Var3 == null || (wv0Var = (wv0) this.f11928d) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        wv0 wv0Var4 = (wv0) this.f11926b;
        if (wv0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        wv0 wv0Var5 = (wv0) this.f11929e;
        if (wv0Var5 == null || (wv0Var2 = (wv0) this.f11930f) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        wv0 wv0Var6 = (wv0) this.f11931g;
        if (wv0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = pp1Var.f18757b.f17885b;
        BigInteger bigInteger2 = pp1Var.f18758c;
        BigInteger bigInteger3 = (BigInteger) wv0Var3.f21612b;
        BigInteger bigInteger4 = (BigInteger) wv0Var.f21612b;
        BigInteger bigInteger5 = (BigInteger) wv0Var4.f21612b;
        BigInteger bigInteger6 = (BigInteger) wv0Var5.f21612b;
        BigInteger bigInteger7 = (BigInteger) wv0Var2.f21612b;
        BigInteger bigInteger8 = (BigInteger) wv0Var6.f21612b;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new op1((pp1) this.f11925a, (wv0) this.f11927c, (wv0) this.f11928d, (wv0) this.f11926b, (wv0) this.f11929e, (wv0) this.f11930f, (wv0) this.f11931g);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ a8(boolean z10) {
        this.f11925a = null;
        this.f11926b = null;
        this.f11927c = null;
        this.f11928d = null;
        this.f11929e = null;
        this.f11930f = null;
        this.f11931g = null;
    }

    public a8() {
        this.f11930f = new x.i(0);
        this.f11931g = new x.i(0);
    }

    public a8(fm fmVar, WebView webView, String str, String str2, jy0 jy0Var) {
        this.f11927c = new ArrayList();
        this.f11928d = new HashMap();
        this.f11925a = fmVar;
        this.f11926b = webView;
        this.f11931g = jy0Var;
        this.f11930f = str;
        this.f11929e = str2;
    }
}
