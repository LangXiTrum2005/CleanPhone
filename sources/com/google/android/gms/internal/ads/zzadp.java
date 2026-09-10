package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.v0.p;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzadp {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, p.e.f39014a, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, com.smartdigimkt.b0.a.W0, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) {
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int i2 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(8);
        int i3 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i3++;
        }
        int i4 = zzf[zzeqVar.zzj(5)] * 1000;
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm("audio/ac3");
        zztVar.zzE(i3);
        zztVar.zzF(i2);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzh(i4);
        zztVar.zzi(i4);
        return zztVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzv zzb(zzer zzerVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int iZzj = zzeqVar.zzj(13) * 1000;
        zzeqVar.zzh(3);
        int i2 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(10);
        int i3 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i3++;
        }
        zzeqVar.zzh(3);
        int iZzj2 = zzeqVar.zzj(4);
        zzeqVar.zzh(1);
        if (iZzj2 > 0) {
            zzeqVar.zzh(6);
            if (zzeqVar.zzj(1) != 0) {
                i3 += 2;
            }
            zzeqVar.zzh(1);
        }
        if (zzeqVar.zzc() > 7) {
            zzeqVar.zzh(7);
            if (zzeqVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm(str3);
        zztVar.zzE(i3);
        zztVar.zzF(i2);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(iZzj);
        return zztVar.zzM();
    }

    public static zzado zzc(zzeq zzeqVar) {
        int iZzf;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzd = zzeqVar.zzd();
        zzeqVar.zzh(40);
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzf(iZzd);
        int i10 = -1;
        if (iZzj > 10) {
            zzeqVar.zzh(16);
            int iZzj2 = zzeqVar.zzj(2);
            if (iZzj2 == 0) {
                i10 = 0;
            } else if (iZzj2 == 1) {
                i10 = 1;
            } else if (iZzj2 == 2) {
                i10 = 2;
            }
            zzeqVar.zzh(3);
            int iZzj3 = zzeqVar.zzj(11) + 1;
            int iZzj4 = zzeqVar.zzj(2);
            if (iZzj4 == 3) {
                i2 = zzd[zzeqVar.zzj(2)];
                i7 = 6;
                i6 = 3;
            } else {
                int iZzj5 = zzeqVar.zzj(2);
                int i11 = zzb[iZzj5];
                i6 = iZzj5;
                i2 = zzc[iZzj4];
                i7 = i11;
            }
            iZzf = iZzj3 + iZzj3;
            int i12 = (iZzf * i2) / (i7 * 32);
            int iZzj6 = zzeqVar.zzj(3);
            boolean zZzi = zzeqVar.zzi();
            i3 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzeqVar.zzh(10);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzeqVar.zzh(5);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                i8 = 0;
                iZzj6 = 0;
            } else {
                i8 = iZzj6;
            }
            if (i10 == 1) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(16);
                }
                i9 = 1;
            } else {
                i9 = i10;
            }
            if (zzeqVar.zzi()) {
                if (i8 > 2) {
                    zzeqVar.zzh(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    zzeqVar.zzh(6);
                }
                if ((i8 & 4) != 0) {
                    zzeqVar.zzh(6);
                }
                if (zZzi && zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                if (i9 == 0) {
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (i8 == 0 && zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    int iZzj7 = zzeqVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzeqVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzeqVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzeqVar.zzj(5);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                            }
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(7);
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(8);
                                }
                            }
                        }
                        zzeqVar.zzh((iZzj8 + 2) * 8);
                        zzeqVar.zzm();
                    }
                    if (i8 < 2) {
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                    }
                    if (!zzeqVar.zzi()) {
                        i9 = 0;
                    } else if (i6 == 0) {
                        zzeqVar.zzh(5);
                        i9 = 0;
                        i6 = 0;
                    } else {
                        for (int i13 = 0; i13 < i7; i13++) {
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(5);
                            }
                        }
                        i9 = 0;
                    }
                }
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
                if (i8 == 2) {
                    zzeqVar.zzh(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    zzeqVar.zzh(2);
                }
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (i8 == 0 && zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzeqVar.zzg();
                }
            }
            if (i9 == 0 && i6 != 3) {
                zzeqVar.zzg();
            }
            if (i9 == 2 && (i6 == 3 || zzeqVar.zzi())) {
                zzeqVar.zzh(6);
            }
            i4 = i7 * 256;
            str = (zzeqVar.zzi() && zzeqVar.zzj(6) == 1 && zzeqVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
        } else {
            zzeqVar.zzh(32);
            int iZzj9 = zzeqVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzeqVar.zzj(6);
            int i14 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzeqVar.zzh(8);
            int iZzj11 = zzeqVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzeqVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzeqVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzeqVar.zzh(2);
            }
            i2 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i3 = zze[iZzj11] + (zzeqVar.zzi() ? 1 : 0);
            i4 = 1536;
            str = str2;
            i5 = i14;
        }
        return new zzado(str, i10, i3, i2, iZzf, i4, i5, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return zzf((b2 & 192) >> 6, b2 & 63);
        }
        int i2 = bArr[2] & 7;
        int i3 = ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i2 << 8)) + 1;
        return i3 + i3;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = zzc[i2];
        if (i5 == 44100) {
            int i6 = zzg[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = zzf[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
