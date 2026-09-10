package d6;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.dm0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38737a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f38739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f38740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f38742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f38743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f38744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f38745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f38746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38747k;
    public b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f38748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f38749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f38750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f38751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f38752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f38753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f38754s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f38738b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f38755t = Bitmap.Config.ARGB_8888;

    public d(k kVar, b bVar, ByteBuffer byteBuffer, int i10) {
        this.f38739c = kVar;
        this.l = new b();
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f38750o = 0;
                this.l = bVar;
                this.f38747k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f38740d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f38740d.order(ByteOrder.LITTLE_ENDIAN);
                this.f38749n = false;
                Iterator it = bVar.f38726e.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f38717g == 3) {
                        this.f38749n = true;
                        break;
                    }
                }
                this.f38751p = iHighestOneBit;
                int i11 = bVar.f38727f;
                this.f38753r = i11 / iHighestOneBit;
                int i12 = bVar.f38728g;
                this.f38752q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                dm0 dm0Var = (dm0) this.f38739c.f45903c;
                this.f38745i = dm0Var == null ? new byte[i13] : (byte[]) dm0Var.d(byte[].class, i13);
                k kVar2 = this.f38739c;
                int i14 = this.f38753r * this.f38752q;
                dm0 dm0Var2 = (dm0) kVar2.f45903c;
                this.f38746j = dm0Var2 == null ? new int[i14] : (int[]) dm0Var2.d(int[].class, i14);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f38754s;
        Bitmap bitmapA = ((h6.a) this.f38739c.f45902b).a(this.f38753r, this.f38752q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f38755t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.l.f38724c <= 0 || this.f38747k < 0) {
                if (Log.isLoggable(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 3)) {
                    Log.d(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Unable to decode frame, frameCount=" + this.l.f38724c + ", framePointer=" + this.f38747k);
                }
                this.f38750o = 1;
            }
            int i10 = this.f38750o;
            if (i10 != 1 && i10 != 2) {
                this.f38750o = 0;
                if (this.f38741e == null) {
                    dm0 dm0Var = (dm0) this.f38739c.f45903c;
                    this.f38741e = dm0Var == null ? new byte[255] : (byte[]) dm0Var.d(byte[].class, 255);
                }
                a aVar = (a) this.l.f38726e.get(this.f38747k);
                int i11 = this.f38747k - 1;
                a aVar2 = i11 >= 0 ? (a) this.l.f38726e.get(i11) : null;
                int[] iArr = aVar.f38721k;
                if (iArr == null) {
                    iArr = this.l.f38722a;
                }
                this.f38737a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 3)) {
                        Log.d(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "No valid color table found for frame #" + this.f38747k);
                    }
                    this.f38750o = 1;
                    return null;
                }
                if (aVar.f38716f) {
                    System.arraycopy(iArr, 0, this.f38738b, 0, iArr.length);
                    int[] iArr2 = this.f38738b;
                    this.f38737a = iArr2;
                    iArr2[aVar.f38718h] = 0;
                    if (aVar.f38717g == 2 && this.f38747k == 0) {
                        this.f38754s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            if (Log.isLoggable(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 3)) {
                Log.d(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Unable to decode frame, status=" + this.f38750o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f38755t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc A[PHI: r5
  0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    public final Bitmap d(a aVar, a aVar2) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        short s10;
        int i15;
        Bitmap bitmap;
        int i16;
        k kVar = this.f38739c;
        byte b11 = 0;
        int[] iArr2 = this.f38746j;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f38748m;
            if (bitmap2 != null) {
                ((h6.a) kVar.f45902b).b(bitmap2);
            }
            this.f38748m = null;
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && aVar2.f38717g == 3 && this.f38748m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && (i15 = aVar2.f38717g) > 0) {
            if (i15 == 2) {
                if (aVar.f38716f) {
                    i16 = 0;
                } else {
                    b bVar = this.l;
                    i16 = bVar.f38732k;
                    if (aVar.f38721k != null && bVar.f38731j == aVar.f38718h) {
                        i16 = 0;
                    }
                }
                int i17 = aVar2.f38714d;
                int i18 = this.f38751p;
                int i19 = i17 / i18;
                int i20 = aVar2.f38712b / i18;
                int i21 = aVar2.f38713c / i18;
                int i22 = aVar2.f38711a / i18;
                int i23 = this.f38753r;
                int i24 = (i20 * i23) + i22;
                int i25 = (i19 * i23) + i24;
                while (i24 < i25) {
                    int i26 = i24 + i21;
                    for (int i27 = i24; i27 < i26; i27++) {
                        iArr2[i27] = i16;
                    }
                    i24 += this.f38753r;
                }
            } else if (i15 == 3 && (bitmap = this.f38748m) != null) {
                int i28 = this.f38752q;
                int i29 = this.f38753r;
                bitmap.getPixels(iArr2, 0, i29, 0, 0, i29, i28);
            }
        }
        this.f38740d.position(aVar.f38720j);
        int i30 = aVar.f38713c * aVar.f38714d;
        byte[] bArr = this.f38745i;
        if (bArr == null || bArr.length < i30) {
            dm0 dm0Var = (dm0) kVar.f45903c;
            this.f38745i = dm0Var == null ? new byte[i30] : (byte[]) dm0Var.d(byte[].class, i30);
        }
        byte[] bArr2 = this.f38745i;
        if (this.f38742f == null) {
            this.f38742f = new short[4096];
        }
        short[] sArr = this.f38742f;
        if (this.f38743g == null) {
            this.f38743g = new byte[4096];
        }
        byte[] bArr3 = this.f38743g;
        if (this.f38744h == null) {
            this.f38744h = new byte[4097];
        }
        byte[] bArr4 = this.f38744h;
        int i31 = this.f38740d.get() & 255;
        int i32 = 1;
        int i33 = 1 << i31;
        int i34 = i33 + 1;
        int i35 = i33 + 2;
        int i36 = i31 + 1;
        int i37 = (1 << i36) - 1;
        int i38 = 0;
        while (i38 < i33) {
            sArr[i38] = 0;
            bArr3[i38] = (byte) i38;
            i38++;
            i32 = i32;
        }
        int i39 = i32;
        byte[] bArr5 = this.f38741e;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = i36;
        int i49 = i35;
        int i50 = i37;
        int i51 = -1;
        while (true) {
            if (i40 >= i30) {
                iArr2 = iArr2;
                b10 = b11;
                break;
            }
            if (i41 == 0) {
                i14 = -1;
                int i52 = this.f38740d.get() & 255;
                if (i52 > 0) {
                    ByteBuffer byteBuffer = this.f38740d;
                    byteBuffer.get(this.f38741e, 0, Math.min(i52, byteBuffer.remaining()));
                }
                if (i52 <= 0) {
                    this.f38750o = 3;
                    b10 = 0;
                    break;
                }
                i41 = i52;
                i42 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i14 = -1;
            }
            i44 += (bArr5[i42] & 255) << i43;
            i42++;
            i41--;
            i43 += 8;
            i49 = i49;
            int i53 = i48;
            i51 = i51;
            i46 = i46;
            while (true) {
                i43 = i43;
                if (i43 < i53) {
                    i48 = i53;
                    b11 = 0;
                    break;
                }
                int i54 = i44 & i50;
                i44 >>= i53;
                i43 -= i53;
                if (i54 == i33) {
                    i53 = i36;
                    i49 = i35;
                    i50 = i37;
                    i43 = i43;
                    i51 = i14;
                } else {
                    if (i54 == i34) {
                        i48 = i53;
                        b11 = 0;
                        break;
                    }
                    int i55 = i53;
                    if (i51 == i14) {
                        bArr2[i45] = bArr3[i54];
                        i45++;
                        i40++;
                        i51 = i54;
                        i46 = i51;
                        i53 = i55;
                    } else {
                        if (i54 >= i49) {
                            bArr4[i47] = (byte) i46;
                            i47++;
                            s10 = i51;
                        } else {
                            s10 = i54;
                        }
                        while (s10 >= i33) {
                            bArr4[i47] = bArr3[s10];
                            i47++;
                            s10 = sArr[s10];
                        }
                        i46 = bArr3[s10] & 255;
                        byte b12 = (byte) i46;
                        bArr2[i45] = b12;
                        while (true) {
                            i45++;
                            i40++;
                            if (i47 <= 0) {
                                break;
                            }
                            i47--;
                            bArr2[i45] = bArr4[i47];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = (short) i51;
                            bArr3[i49] = b12;
                            i49++;
                            if ((i49 & i50) != 0 || i49 >= 4096) {
                                i53 = i55;
                            } else {
                                i53 = i55 + 1;
                                i50 += i49;
                            }
                        } else {
                            i53 = i55;
                        }
                        i51 = i54;
                    }
                    i14 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i45, i30, b10);
        if (aVar.f38715e || this.f38751p != i39) {
            int i56 = aVar.f38714d;
            int i57 = this.f38751p;
            int i58 = i56 / i57;
            int i59 = aVar.f38712b / i57;
            int i60 = aVar.f38713c / i57;
            int i61 = aVar.f38711a / i57;
            boolean z10 = this.f38747k == 0;
            byte[] bArr6 = this.f38745i;
            int[] iArr3 = this.f38737a;
            Boolean bool = this.f38754s;
            int i62 = 8;
            int i63 = 0;
            int i64 = 1;
            int i65 = 0;
            while (i65 < i58) {
                if (aVar.f38715e) {
                    if (i63 >= i58) {
                        i64++;
                        if (i64 == 2) {
                            i63 = 4;
                        } else if (i64 == 3) {
                            i62 = 4;
                            i63 = 2;
                        } else if (i64 == 4) {
                            i63 = 1;
                            i62 = 2;
                        }
                    }
                    i10 = i63 + i62;
                } else {
                    i10 = i63;
                    i63 = i65;
                }
                int i66 = i63 + i59;
                int i67 = i58;
                boolean z11 = i57 == 1;
                if (i66 < this.f38752q) {
                    int i68 = this.f38753r;
                    int i69 = i66 * i68;
                    int i70 = i69 + i61;
                    int i71 = i70 + i60;
                    int i72 = i69 + i68;
                    if (i72 < i71) {
                        i71 = i72;
                    }
                    i11 = i57;
                    int i73 = i65 * i57 * aVar.f38713c;
                    int[] iArr4 = this.f38746j;
                    if (z11) {
                        int i74 = i70;
                        while (i74 < i71) {
                            int i75 = i74;
                            int i76 = iArr3[bArr6[i73] & 255];
                            if (i76 != 0) {
                                iArr4[i75] = i76;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i11;
                            i74 = i75 + 1;
                        }
                    } else {
                        int i77 = ((i71 - i70) * i11) + i73;
                        int i78 = i70;
                        while (i78 < i71) {
                            int i79 = i71;
                            int i80 = aVar.f38713c;
                            int i81 = i78;
                            int i82 = i73;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            while (true) {
                                if (i82 >= this.f38751p + i73) {
                                    i12 = i60;
                                    break;
                                }
                                byte[] bArr7 = this.f38745i;
                                i12 = i60;
                                if (i82 >= bArr7.length || i82 >= i77) {
                                    break;
                                }
                                int i88 = this.f38737a[bArr7[i82] & 255];
                                if (i88 != 0) {
                                    i83 += (i88 >> 24) & 255;
                                    i84 += (i88 >> 16) & 255;
                                    i85 += (i88 >> 8) & 255;
                                    i86 += i88 & 255;
                                    i87++;
                                }
                                i82++;
                                i60 = i12;
                            }
                            int i89 = i73 + i80;
                            int i90 = i89;
                            while (i90 < this.f38751p + i89) {
                                byte[] bArr8 = this.f38745i;
                                int i91 = i89;
                                if (i90 >= bArr8.length || i90 >= i77) {
                                    break;
                                }
                                int i92 = this.f38737a[bArr8[i90] & 255];
                                if (i92 != 0) {
                                    i83 += (i92 >> 24) & 255;
                                    i84 += (i92 >> 16) & 255;
                                    i85 += (i92 >> 8) & 255;
                                    i86 += i92 & 255;
                                    i87++;
                                }
                                i90++;
                                i89 = i91;
                            }
                            int i93 = i87 == 0 ? 0 : ((i83 / i87) << 24) | ((i84 / i87) << 16) | ((i85 / i87) << 8) | (i86 / i87);
                            if (i93 != 0) {
                                iArr4[i81] = i93;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i11;
                            i78 = i81 + 1;
                            i71 = i79;
                            i60 = i12;
                        }
                    }
                    i65++;
                    i63 = i10;
                    i58 = i67;
                    i59 = i59;
                    i57 = i11;
                    i60 = i60;
                } else {
                    i11 = i57;
                }
                i65++;
                i63 = i10;
                i58 = i67;
                i59 = i59;
                i57 = i11;
                i60 = i60;
            }
            if (this.f38754s == null) {
                this.f38754s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i94 = aVar.f38714d;
            int i95 = aVar.f38712b;
            int i96 = aVar.f38713c;
            int i97 = aVar.f38711a;
            byte b13 = this.f38747k == 0 ? (byte) 1 : b10;
            byte[] bArr9 = this.f38745i;
            int[] iArr5 = this.f38737a;
            byte b14 = -1;
            for (int i98 = b10; i98 < i94; i98++) {
                int i99 = this.f38753r;
                int i100 = (i98 + i95) * i99;
                int i101 = i100 + i97;
                int i102 = i101 + i96;
                int i103 = i100 + i99;
                if (i103 < i102) {
                    i102 = i103;
                }
                int i104 = aVar.f38713c * i98;
                while (i101 < i102) {
                    byte b15 = bArr9[i104];
                    int i105 = b15 & 255;
                    if (i105 != b14) {
                        int i106 = iArr5[i105];
                        if (i106 != 0) {
                            this.f38746j[i101] = i106;
                        } else {
                            b14 = b15;
                        }
                    }
                    i104++;
                    i101++;
                }
            }
            Boolean bool2 = this.f38754s;
            this.f38754s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f38754s != null || b13 == 0 || b14 == -1));
        }
        if (this.f38749n && ((i13 = aVar.f38717g) == 0 || i13 == 1)) {
            if (this.f38748m == null) {
                this.f38748m = a();
            }
            Bitmap bitmap3 = this.f38748m;
            int i107 = this.f38752q;
            int i108 = this.f38753r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i108, 0, 0, i108, i107);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapA = a();
        int i109 = this.f38752q;
        int i110 = this.f38753r;
        bitmapA.setPixels(iArr, 0, i110, 0, 0, i110, i109);
        return bitmapA;
    }
}
