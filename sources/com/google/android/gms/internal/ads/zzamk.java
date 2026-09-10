package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamk implements zzaly {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamd zzg;
    private final zzamc zzh;
    private final zzamj zzi;
    private Bitmap zzj;

    public zzamk(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamd(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamc(0, zzd(), zze(), zzf());
        this.zzi = new zzamj(iZzt, iZzt2);
    }

    private static zzamc zzb(zzeq zzeqVar, int i2) {
        int[] iArr;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i3 = 8;
        int iZzj5 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i4 = i2 - 2;
        while (i4 > 0) {
            int iZzj6 = zzeqVar.zzj(i3);
            int iZzj7 = zzeqVar.zzj(i3);
            if ((iZzj7 & 128) != 0) {
                iArr = iArrZzd;
            } else {
                iArr = (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            }
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeqVar.zzj(i3);
                iZzj4 = zzeqVar.zzj(i3);
                iZzj = zzeqVar.zzj(i3);
                iZzj2 = zzeqVar.zzj(i3);
                i4 -= 6;
            } else {
                int iZzj8 = zzeqVar.zzj(6) << 2;
                int iZzj9 = zzeqVar.zzj(4) << 4;
                i4 -= 4;
                iZzj = zzeqVar.zzj(4) << 4;
                iZzj2 = zzeqVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d = iZzj3;
            String str = zzfj.zza;
            double d2 = iZzj4 - 128;
            double d3 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            iZzj5 = iZzj5;
            i3 = 8;
        }
        return new zzamc(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzame zzc(zzeq zzeqVar) {
        byte[] bArr;
        int iZzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int iZzj2 = zzeqVar.zzj(2);
        boolean zZzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeqVar.zzj(16);
                int iZzj4 = zzeqVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeqVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeqVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzame(iZzj, zZzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzame(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = zzg(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = zzg(255, 1 != i5 ? 0 : 127, i4 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = zzg(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = zzg(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zzh(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c2;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i5;
        int iZzj4;
        int iZzj5;
        int i6;
        int i7;
        int iZzj6;
        int i8;
        Paint paint2 = paint;
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        int i9 = i3;
        int i10 = i4;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzeqVar.zzc() != 0) {
            int iZzj7 = zzeqVar.zzj(8);
            if (iZzj7 != 240) {
                int i11 = 4;
                int i12 = 1;
                int i13 = 2;
                switch (iZzj7) {
                    case 16:
                        if (i2 == 3) {
                            if (bArrZzi == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi;
                            }
                        } else if (i2 != 2) {
                            bArr2 = null;
                        } else if (bArrZzi3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzi3;
                        }
                        boolean z2 = false;
                        while (true) {
                            int iZzj8 = zzeqVar.zzj(2);
                            if (iZzj8 != 0) {
                                iZzj2 = 1;
                                iZzj = iZzj8;
                            } else {
                                if (zzeqVar.zzi()) {
                                    iZzj3 = zzeqVar.zzj(3) + 3;
                                    iZzj = zzeqVar.zzj(2);
                                } else {
                                    if (zzeqVar.zzi()) {
                                        iZzj2 = 1;
                                        iZzj = 0;
                                    } else {
                                        int iZzj9 = zzeqVar.zzj(2);
                                        if (iZzj9 == 0) {
                                            c2 = 4;
                                            z2 = true;
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else if (iZzj9 == 1) {
                                            c2 = 4;
                                            z2 = z2;
                                            iZzj2 = 2;
                                            iZzj = 0;
                                        } else if (iZzj9 == 2) {
                                            c2 = 4;
                                            z2 = z2;
                                            iZzj2 = zzeqVar.zzj(4) + 12;
                                            iZzj = zzeqVar.zzj(2);
                                        } else if (iZzj9 != 3) {
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else {
                                            iZzj3 = zzeqVar.zzj(8) + 29;
                                            iZzj = zzeqVar.zzj(2);
                                        }
                                        if (iZzj2 == 0 && paint2 != null) {
                                            int i14 = i10 + 1;
                                            float f = i10;
                                            if (bArr2 != 0) {
                                                iZzj = bArr2[iZzj];
                                            }
                                            paint2.setColor(iArr[iZzj]);
                                            canvas.drawRect(i9, f, i9 + iZzj2, i14, paint2);
                                        }
                                        i9 += iZzj2;
                                        if (z2) {
                                            zzeqVar.zzm();
                                        } else {
                                            paint2 = paint;
                                            z2 = z2;
                                        }
                                    }
                                    c2 = 4;
                                    if (iZzj2 == 0) {
                                    }
                                    i9 += iZzj2;
                                    if (z2) {
                                        zzeqVar.zzm();
                                    } else {
                                        paint2 = paint;
                                        z2 = z2;
                                    }
                                }
                                iZzj2 = iZzj3;
                            }
                            c2 = 4;
                            if (iZzj2 == 0) {
                            }
                            i9 += iZzj2;
                            if (z2) {
                                zzeqVar.zzm();
                            } else {
                                paint2 = paint;
                                z2 = z2;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z3 = false;
                        while (true) {
                            int iZzj10 = zzeqVar.zzj(i11);
                            if (iZzj10 != 0) {
                                i5 = 1;
                                z3 = z3;
                            } else if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    int iZzj11 = zzeqVar.zzj(i13);
                                    if (iZzj11 == 0) {
                                        i5 = 1;
                                    } else if (iZzj11 == 1) {
                                        i5 = i13;
                                    } else if (iZzj11 == i13) {
                                        iZzj4 = zzeqVar.zzj(i11) + 9;
                                        iZzj5 = zzeqVar.zzj(i11);
                                    } else if (iZzj11 != 3) {
                                        z3 = z3;
                                        iZzj10 = 0;
                                        i5 = 0;
                                    } else {
                                        iZzj4 = zzeqVar.zzj(8) + 25;
                                        iZzj5 = zzeqVar.zzj(i11);
                                    }
                                    iZzj10 = 0;
                                } else {
                                    iZzj4 = zzeqVar.zzj(i13) + i11;
                                    iZzj5 = zzeqVar.zzj(i11);
                                }
                                i5 = iZzj4;
                                z3 = z3;
                                iZzj10 = iZzj5;
                            } else {
                                int iZzj12 = zzeqVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i5 = iZzj12 + 2;
                                    iZzj10 = 0;
                                } else {
                                    z3 = true;
                                    iZzj10 = 0;
                                    i5 = 0;
                                }
                            }
                            if (i5 == 0 || paint2 == null) {
                                i6 = i13;
                            } else {
                                int i15 = i10 + 1;
                                float f2 = i10;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i6 = 2;
                                canvas.drawRect(i9, f2, i9 + i5, i15, paint2);
                            }
                            i9 += i5;
                            if (z3) {
                                zzeqVar.zzm();
                                continue;
                            } else {
                                i13 = i6;
                                z3 = z3;
                                i11 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i16 = i9;
                        int i17 = 0;
                        while (true) {
                            int iZzj13 = zzeqVar.zzj(8);
                            if (iZzj13 != 0) {
                                i7 = i17;
                                iZzj6 = i12;
                            } else if (zzeqVar.zzi()) {
                                i7 = i17;
                                iZzj6 = zzeqVar.zzj(7);
                                iZzj13 = zzeqVar.zzj(8);
                            } else {
                                int iZzj14 = zzeqVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i7 = i17;
                                    iZzj6 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i7 = i12;
                                    iZzj13 = 0;
                                    iZzj6 = 0;
                                }
                            }
                            if (iZzj6 == 0 || paint2 == null) {
                                i8 = i12;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i8 = i12;
                                canvas.drawRect(i16, i10, i16 + iZzj6, i10 + 1, paint2);
                            }
                            i16 += iZzj6;
                            if (i7 != 0) {
                                i9 = i16;
                                continue;
                            } else {
                                i12 = i8;
                                i17 = i7;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj7) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzeqVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzeqVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzeqVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i10 += 2;
                i9 = i3;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i2, int i3, zzeq zzeqVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zzeqVar.zzj(i3);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        boolean z2;
        zzalq zzalqVar;
        Canvas canvas;
        char c2;
        char c3;
        char c4;
        int i4;
        Canvas canvas2;
        int i5;
        zzamh zzamhVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i6;
        int iZzj5;
        zzeq zzeqVar = new zzeq(bArr, i2 + i3);
        zzeqVar.zzf(i2);
        while (true) {
            z2 = true;
            if (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
                zzamj zzamjVar = this.zzi;
                int iZzj6 = zzeqVar.zzj(8);
                int iZzj7 = zzeqVar.zzj(16);
                int iZzj8 = zzeqVar.zzj(16);
                int iZze = zzeqVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzeqVar.zzc()) {
                    zzee.zzc("DvbParser", "Data field length exceeds limit");
                    zzeqVar.zzh(zzeqVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzamjVar.zza) {
                                zzamf zzamfVar = zzamjVar.zzi;
                                int iZzj9 = zzeqVar.zzj(8);
                                int iZzj10 = zzeqVar.zzj(4);
                                int iZzj11 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i7 = iZzj8 - 2; i7 > 0; i7 -= 6) {
                                    int iZzj12 = zzeqVar.zzj(8);
                                    zzeqVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzamg(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                                }
                                zzamf zzamfVar2 = new zzamf(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzamfVar2.zzb != 0) {
                                    zzamjVar.zzi = zzamfVar2;
                                    zzamjVar.zzc.clear();
                                    zzamjVar.zzd.clear();
                                    zzamjVar.zze.clear();
                                } else if (zzamfVar != null) {
                                    if (zzamfVar.zza != zzamfVar2.zza) {
                                        zzamjVar.zzi = zzamfVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzamf zzamfVar3 = zzamjVar.zzi;
                            if (iZzj7 == zzamjVar.zza && zzamfVar3 != null) {
                                int iZzj13 = zzeqVar.zzj(8);
                                zzeqVar.zzh(4);
                                boolean zZzi = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj14 = zzeqVar.zzj(16);
                                int iZzj15 = zzeqVar.zzj(16);
                                int iZzj16 = zzeqVar.zzj(3);
                                int iZzj17 = zzeqVar.zzj(3);
                                zzeqVar.zzh(2);
                                int iZzj18 = zzeqVar.zzj(8);
                                int iZzj19 = zzeqVar.zzj(8);
                                int iZzj20 = zzeqVar.zzj(4);
                                int iZzj21 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                int i8 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i8 > 0) {
                                    int iZzj22 = zzeqVar.zzj(16);
                                    int iZzj23 = zzeqVar.zzj(2);
                                    int iZzj24 = zzeqVar.zzj(2);
                                    int iZzj25 = zzeqVar.zzj(12);
                                    zzeqVar.zzh(4);
                                    int iZzj26 = zzeqVar.zzj(12);
                                    int i9 = i8 - 6;
                                    if (iZzj23 == 1) {
                                        i8 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i8 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else {
                                        i8 = i9;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzami(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzamh zzamhVar2 = new zzamh(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzamfVar3.zzb == 0 && (zzamhVar = (zzamh) zzamjVar.zzc.get(zzamhVar2.zza)) != null) {
                                    int i10 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzamhVar.zzj;
                                        if (i10 < sparseArray3.size()) {
                                            zzamhVar2.zzj.put(sparseArray3.keyAt(i10), (zzami) sparseArray3.valueAt(i10));
                                            i10++;
                                        }
                                    }
                                }
                                zzamjVar.zzc.put(zzamhVar2.zza, zzamhVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzamjVar.zza) {
                                zzamc zzamcVarZzb = zzb(zzeqVar, iZzj8);
                                zzamjVar.zzd.put(zzamcVarZzb.zza, zzamcVarZzb);
                            } else if (iZzj7 == zzamjVar.zzb) {
                                zzamc zzamcVarZzb2 = zzb(zzeqVar, iZzj8);
                                zzamjVar.zzf.put(zzamcVarZzb2.zza, zzamcVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzamjVar.zza) {
                                zzame zzameVarZzc = zzc(zzeqVar);
                                zzamjVar.zze.put(zzameVarZzc.zza, zzameVarZzc);
                            } else if (iZzj7 == zzamjVar.zzb) {
                                zzame zzameVarZzc2 = zzc(zzeqVar);
                                zzamjVar.zzg.put(zzameVarZzc2.zza, zzameVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzamjVar.zza) {
                                zzeqVar.zzh(4);
                                boolean zZzi2 = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj27 = zzeqVar.zzj(16);
                                int iZzj28 = zzeqVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzeqVar.zzj(16);
                                    iZzj3 = zzeqVar.zzj(16);
                                    iZzj5 = zzeqVar.zzj(16);
                                    iZzj4 = zzeqVar.zzj(16);
                                    i6 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i6 = 0;
                                    iZzj5 = 0;
                                }
                                zzamjVar.zzh = new zzamd(iZzj27, iZzj28, i6, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzeqVar.zzo(iZze - zzeqVar.zze());
                }
            }
        }
        zzamj zzamjVar2 = this.zzi;
        zzamf zzamfVar4 = zzamjVar2.zzi;
        if (zzamfVar4 == null) {
            zzalqVar = new zzalq(zzgtd.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamd zzamdVar = zzamjVar2.zzh;
            if (zzamdVar == null) {
                zzamdVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamdVar.zza + 1 != bitmap.getWidth() || zzamdVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamdVar.zza + 1, zzamdVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzamfVar4.zzc;
            int i11 = 0;
            while (i11 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzamg zzamgVar = (zzamg) sparseArray4.valueAt(i11);
                zzamh zzamhVar3 = (zzamh) zzamjVar2.zzc.get(sparseArray4.keyAt(i11));
                int i12 = zzamgVar.zza + zzamdVar.zzc;
                int i13 = zzamgVar.zzb + zzamdVar.zze;
                int i14 = zzamhVar3.zzc;
                int i15 = i12 + i14;
                boolean z3 = z2;
                int iMin = Math.min(i15, zzamdVar.zzd);
                int i16 = zzamhVar3.zzd;
                int i17 = i13 + i16;
                canvas3.clipRect(i12, i13, iMin, Math.min(i17, zzamdVar.zzf));
                int i18 = zzamhVar3.zzf;
                zzamc zzamcVar = (zzamc) zzamjVar2.zzd.get(i18);
                if (zzamcVar == null && (zzamcVar = (zzamc) zzamjVar2.zzf.get(i18)) == null) {
                    zzamcVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamhVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i19 = i11;
                int i20 = 0;
                while (i20 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i20);
                    int i21 = i20;
                    zzami zzamiVar = (zzami) sparseArray5.valueAt(i20);
                    SparseArray sparseArray7 = sparseArray5;
                    zzame zzameVar = (zzame) zzamjVar2.zze.get(iKeyAt);
                    if (zzameVar == null) {
                        zzameVar = (zzame) zzamjVar2.zzg.get(iKeyAt);
                    }
                    if (zzameVar != null) {
                        Paint paint = zzameVar.zzb ? null : this.zzd;
                        int i22 = zzamhVar3.zze;
                        int i23 = zzamiVar.zza + i12;
                        int i24 = i13 + zzamiVar.zzb;
                        canvas2 = canvas3;
                        int[] iArr = i22 == 3 ? zzamcVar.zzd : i22 == 2 ? zzamcVar.zzc : zzamcVar.zzb;
                        i5 = i15;
                        zzh(zzameVar.zzc, iArr, i22, i23, i24, paint, canvas2);
                        zzh(zzameVar.zzd, iArr, i22, i23, i24 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i5 = i15;
                    }
                    i12 = i12;
                    i15 = i5;
                    i20 = i21 + 1;
                    i14 = i14;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzamjVar2 = zzamjVar2;
                }
                zzamj zzamjVar3 = zzamjVar2;
                Canvas canvas4 = canvas3;
                int i25 = i12;
                int i26 = i14;
                int i27 = i15;
                float f = i13;
                float f2 = i25;
                if (zzamhVar3.zzb) {
                    int i28 = zzamhVar3.zze;
                    if (i28 == 3) {
                        i4 = zzamcVar.zzd[zzamhVar3.zzg];
                        c4 = 2;
                    } else {
                        c4 = 2;
                        i4 = i28 == 2 ? zzamcVar.zzc[zzamhVar3.zzh] : zzamcVar.zzb[zzamhVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i4);
                    float f3 = i27;
                    c3 = c4;
                    c2 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i17, paint2);
                } else {
                    canvas = canvas4;
                    c2 = 3;
                    c3 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i25, i13, i26, i16));
                float f4 = zzamdVar.zza;
                zzcwVar.zzi(f2 / f4);
                zzcwVar.zzj(0);
                float f5 = zzamdVar.zzb;
                zzcwVar.zzf(f / f5, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i26 / f4);
                zzcwVar.zzn(i16 / f5);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i11 = i19 + 1;
                z2 = z3;
                zzamjVar2 = zzamjVar3;
                sparseArray4 = sparseArray6;
            }
            zzalqVar = new zzalq(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalqVar);
    }
}
