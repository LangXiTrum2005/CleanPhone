package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
final class zzagq implements zzagj {
    public final zzgtd zza;
    private final int zzb;

    private zzagq(int i2, zzgtd zzgtdVar) {
        this.zzb = i2;
        this.zza = zzgtdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzagq zzb(int i2, zzer zzerVar) {
        String str;
        zzagj zzagrVar;
        String str2;
        zzgta zzgtaVar = new zzgta();
        int iZze = zzerVar.zze();
        int iZzc = -2;
        while (zzerVar.zzd() > 8) {
            int iZzC = zzerVar.zzC();
            int iZzg = zzerVar.zzg() + zzerVar.zzC();
            zzerVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzagr zzagrVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzerVar.zzu();
                                if (iZzu == 1) {
                                    str = "audio/raw";
                                } else if (iZzu == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzu == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzu != 8192) {
                                    str = iZzu != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzu2 = zzerVar.zzu();
                                    int iZzC2 = zzerVar.zzC();
                                    zzerVar.zzk(6);
                                    int iZzz = zzfj.zzz(zzerVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzerVar.zzd() > 0 ? zzerVar.zzu() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.zzm(str);
                                    zztVar.zzE(iZzu2);
                                    zztVar.zzF(iZzC2);
                                    if (str.equals("audio/raw") && iZzz != 0) {
                                        zztVar.zzG(iZzz);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzerVar.zzm(bArr, 0, iZzu3);
                                        zztVar.zzp(zzgtd.zzj(bArr));
                                    }
                                    zzagrVar = new zzagr(zztVar.zzM());
                                } else {
                                    Z.w(new StringBuilder(String.valueOf(iZzu).length() + 43), "Ignoring track with unsupported format tag ", iZzu, "StreamFormatChunk");
                                }
                            } else {
                                zzee.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfj.zzP(iZzc)));
                            }
                            break;
                        } else {
                            zzerVar.zzk(4);
                            int iZzC3 = zzerVar.zzC();
                            int iZzC4 = zzerVar.zzC();
                            zzerVar.zzk(4);
                            int iZzC5 = zzerVar.zzC();
                            switch (iZzC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                Z.w(new StringBuilder(String.valueOf(iZzC5).length() + 44), "Ignoring track with unsupported compression ", iZzC5, "StreamFormatChunk");
                            } else {
                                zzt zztVar2 = new zzt();
                                zztVar2.zzt(iZzC3);
                                zztVar2.zzu(iZzC4);
                                zztVar2.zzm(str2);
                                zzagrVar2 = new zzagr(zztVar2.zzM());
                            }
                        }
                        zzagrVar = zzagrVar2;
                        break;
                    case 1751742049:
                        zzagrVar = zzagn.zzb(zzerVar);
                        break;
                    case 1752331379:
                        zzagrVar = zzago.zzb(zzerVar);
                        break;
                    case 1852994675:
                        zzagrVar = zzags.zzb(zzerVar);
                        break;
                    default:
                        zzagrVar = zzagrVar2;
                        break;
                }
            } else {
                zzagrVar = zzb(zzerVar.zzC(), zzerVar);
            }
            if (zzagrVar != null) {
                if (zzagrVar.zza() == 1752331379) {
                    iZzc = ((zzago) zzagrVar).zzc();
                }
                zzgtaVar.zzf(zzagrVar);
            }
            zzerVar.zzh(iZzg);
            zzerVar.zzf(iZze);
        }
        return new zzagq(i2, zzgtaVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final int zza() {
        return this.zzb;
    }

    public final zzagj zzc(Class cls) {
        zzgtd zzgtdVar = this.zza;
        int size = zzgtdVar.size();
        int i2 = 0;
        while (i2 < size) {
            zzagj zzagjVar = (zzagj) zzgtdVar.get(i2);
            i2++;
            if (zzagjVar.getClass() == cls) {
                return zzagjVar;
            }
        }
        return null;
    }
}
