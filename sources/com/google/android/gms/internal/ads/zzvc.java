package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzuj zza() throws zzuu {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzuj) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z2, boolean z3) throws zzuu {
        try {
            zzut zzutVar = new zzut(str, z2, z3);
            HashMap map = zzb;
            List list = (List) map.get(zzutVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzutVar, new zzux(z2, z3, str.equals("video/mv-hevc")));
            if (z2) {
                arrayListZzh.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzuj) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzuj.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzuy.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzuj) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzuj) arrayListZzh.remove(0));
            }
            zzgtd zzgtdVarZzq = zzgtd.zzq(arrayListZzh);
            map.put(zzutVar, zzgtdVarZzq);
            return zzgtdVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    @RequiresNonNull
    public static List zzc(zzus zzusVar, zzv zzvVar, boolean z2, boolean z3) throws zzuu {
        List listZza = zzusVar.zza(zzvVar.zzo, z2, z3);
        List listZzd = zzd(zzusVar, zzvVar, z2, z3);
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        zzgtaVar.zzh(listZza);
        zzgtaVar.zzh(listZzd);
        return zzgtaVar.zzi();
    }

    public static List zzd(zzus zzusVar, zzv zzvVar, boolean z2, boolean z3) throws zzuu {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgtd.zzi() : zzusVar.zza(strZzg, z2, z3);
    }

    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvb() { // from class: com.google.android.gms.internal.ads.zzva
            @Override // com.google.android.gms.internal.ads.zzvb
            public final /* synthetic */ int zza(Object obj) {
                int i2 = zzvc.zza;
                return ((zzuj) obj).zzd(zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i2, int i3) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i2;
        codecProfileLevel.level = i3;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair pairZzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:101:0x0183 A[DONT_INVERT, PHI: r3
  0x0183: PHI (r3v7 boolean) = (r3v6 boolean), (r3v8 boolean) binds: [B:98:0x017d, B:100:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0202 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[EDGE_INSN: B:38:0x009c->B:62:0x00f4 BREAK  A[LOOP:1: B:23:0x0066->B:27:0x0074]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x00f8, B:71:0x0114, B:77:0x0128, B:79:0x0130, B:87:0x0149, B:89:0x0153, B:90:0x0158, B:92:0x0168, B:94:0x0170, B:83:0x013c), top: B:128:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f A[DONT_INVERT] */
    private static ArrayList zzh(zzut zzutVar, zzuv zzuvVar) throws zzuu {
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        boolean zZzd;
        boolean z2;
        int i4;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        boolean z3;
        String strZza;
        boolean zIsVendor;
        zzut zzutVar2 = zzutVar;
        zzuv zzuvVar2 = zzuvVar;
        String str5 = "secure-playback";
        String str6 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str7 = zzutVar2.zza;
            int iZza = zzuvVar2.zza();
            boolean zZzc = zzuvVar2.zzc();
            int i5 = 0;
            while (i5 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzuvVar2.zzb(i5);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i6 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str6;
                        i2 = i5;
                        i3 = i6;
                    } else {
                        String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                if (!str7.equals("video/dolby-vision")) {
                                    if (!str7.equals("video/mv-hevc")) {
                                        if (!str7.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str7.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str7.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str2 = null;
                                                    break;
                                                }
                                                str2 = "audio/lg-ac3";
                                                break;
                                            }
                                            str2 = "audio/x-lg-flac";
                                            break;
                                        }
                                        str2 = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str2 = null;
                                        break;
                                    }
                                    str2 = "video/dv_hevc";
                                    break;
                                }
                                str2 = "video/hevcdv";
                                break;
                            }
                            int i8 = i7;
                            str2 = supportedTypes[i8];
                            if (str2.equalsIgnoreCase(str7)) {
                                break;
                            }
                            i7 = i8 + 1;
                        }
                        if (str2 != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str2);
                                boolean zZzd2 = zzuvVar2.zzd(str6, str2, capabilitiesForType);
                                boolean zZze = zzuvVar2.zze(str6, str2, capabilitiesForType);
                                str = str6;
                                if (zzutVar2.zzc) {
                                    if (zZzd2) {
                                        zZzd = zzuvVar2.zzd(str5, str2, capabilitiesForType);
                                        boolean zZze2 = zzuvVar2.zze(str5, str2, capabilitiesForType);
                                        z2 = zzutVar2.zzb;
                                        if (z2) {
                                            if (z2) {
                                                if (zZzd) {
                                                    zZzd = true;
                                                }
                                            }
                                            i4 = Build.VERSION.SDK_INT;
                                            str5 = str5;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                codecCapabilities = capabilitiesForType;
                                            } else {
                                                codecCapabilities = capabilitiesForType;
                                                if (zzi(mediaCodecInfoZzb, str7)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str7);
                                            z3 = zIsHardwareAccelerated;
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzgpj.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!zZzc) {
                                                if (z2 != zZzd) {
                                                    zZzd = true;
                                                    if (zZzc) {
                                                    }
                                                    boolean z4 = zIsVendor;
                                                    i2 = i5;
                                                    i3 = i6;
                                                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
                                                    str3 = str2;
                                                    str4 = name;
                                                    if (!zZzc) {
                                                        continue;
                                                    }
                                                }
                                                boolean z5 = zIsVendor;
                                                i2 = i5;
                                                i3 = i6;
                                                str3 = str2;
                                                str4 = name;
                                                arrayList.add(zzuj.zza(name, str7, str3, codecCapabilities, z3, zZzi, z5, false, false));
                                            } else {
                                                if (zZzc) {
                                                }
                                                boolean z6 = zIsVendor;
                                                i2 = i5;
                                                i3 = i6;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities3 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                            sb.append("Failed to query codec ");
                                            sb.append(str4);
                                            sb.append(" (");
                                            sb.append(str3);
                                            sb.append(")");
                                            zzee.zze("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        if (z2) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i4 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str7);
                                        z3 = zIsHardwareAccelerated;
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgpj.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (zZzc) {
                                            }
                                            boolean z7 = zIsVendor;
                                            i2 = i5;
                                            i3 = i6;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities4 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc) {
                                                continue;
                                            }
                                        } else {
                                            if (z2 != zZzd) {
                                                zZzd = true;
                                                if (zZzc) {
                                                }
                                                boolean z8 = zIsVendor;
                                                i2 = i5;
                                                i3 = i6;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities5 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z9 = zIsVendor;
                                            i2 = i5;
                                            i3 = i6;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(zzuj.zza(name, str7, str3, codecCapabilities, z3, zZzi, z9, false, false));
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb2.append("Failed to query codec ");
                                        sb2.append(str4);
                                        sb2.append(" (");
                                        sb2.append(str3);
                                        sb2.append(")");
                                        zzee.zze("MediaCodecUtil", sb2.toString());
                                        throw e;
                                    }
                                } else if (!zZze) {
                                    zZzd = zzuvVar2.zzd(str5, str2, capabilitiesForType);
                                    boolean zZze3 = zzuvVar2.zze(str5, str2, capabilitiesForType);
                                    z2 = zzutVar2.zzb;
                                    if (z2 || !zZze3) {
                                        if (z2) {
                                            if (zZzd) {
                                                zZzd = true;
                                            }
                                        }
                                        i4 = Build.VERSION.SDK_INT;
                                        str5 = str5;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            if (zzi(mediaCodecInfoZzb, str7)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str7);
                                        z3 = zIsHardwareAccelerated;
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzgpj.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = true;
                                            }
                                        }
                                        if (!zZzc) {
                                            if (z2 != zZzd) {
                                                zZzd = true;
                                                if (zZzc) {
                                                }
                                                boolean z10 = zIsVendor;
                                                i2 = i5;
                                                i3 = i6;
                                                MediaCodecInfo.CodecCapabilities codecCapabilities6 = codecCapabilities;
                                                str3 = str2;
                                                str4 = name;
                                                if (!zZzc) {
                                                    continue;
                                                }
                                            }
                                            boolean z11 = zIsVendor;
                                            i2 = i5;
                                            i3 = i6;
                                            str3 = str2;
                                            str4 = name;
                                            arrayList.add(zzuj.zza(name, str7, str3, codecCapabilities, z3, zZzi, z11, false, false));
                                        } else if (!zZzc || z2) {
                                            boolean z12 = zIsVendor;
                                            i2 = i5;
                                            i3 = i6;
                                            MediaCodecInfo.CodecCapabilities codecCapabilities7 = codecCapabilities;
                                            str3 = str2;
                                            str4 = name;
                                            if (!zZzc && zZzd) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 7);
                                                sb3.append(str4);
                                                sb3.append(".secure");
                                                arrayList.add(zzuj.zza(sb3.toString(), str7, str3, codecCapabilities7, z3, zZzi, z12, false, true));
                                                return arrayList;
                                            }
                                        } else {
                                            boolean z13 = zIsVendor;
                                            i2 = i5;
                                            i3 = i6;
                                            str3 = str2;
                                            try {
                                                str4 = name;
                                                try {
                                                    arrayList.add(zzuj.zza(name, str7, str3, codecCapabilities, z3, zZzi, z13, false, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                str4 = name;
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                                sb4.append("Failed to query codec ");
                                                sb4.append(str4);
                                                sb4.append(" (");
                                                sb4.append(str3);
                                                sb4.append(")");
                                                zzee.zze("MediaCodecUtil", sb4.toString());
                                                throw e;
                                            }
                                        }
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 24 + str3.length() + 1);
                                        sb5.append("Failed to query codec ");
                                        sb5.append(str4);
                                        sb5.append(" (");
                                        sb5.append(str3);
                                        sb5.append(")");
                                        zzee.zze("MediaCodecUtil", sb5.toString());
                                        throw e;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str3 = str2;
                            }
                        } else {
                            str = str6;
                        }
                        i2 = i5;
                        i3 = i6;
                    }
                } else {
                    str5 = str5;
                    str = str6;
                    i3 = iZza;
                    i2 = i5;
                }
                i5 = i2 + 1;
                zzuvVar2 = zzuvVar;
                iZza = i3;
                str5 = str5;
                str6 = str;
                zzutVar2 = zzutVar;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zzuu(e5, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgpj.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvb zzvbVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzuz
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i2 = zzvc.zza;
                zzvb zzvbVar2 = zzvbVar;
                return zzvbVar2.zza(obj2) - zzvbVar2.zza(obj);
            }
        });
    }
}
