package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f22480a = new HashMap();

    public static synchronized List a(String str, boolean z10, boolean z11) {
        try {
            t22 t22Var = new t22(str, z10, z11);
            HashMap map = f22480a;
            List list = (List) map.get(t22Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(t22Var, new w22(z10, z11, str.equals("video/mv-hevc"), 0));
            if (z10) {
                arrayListE.isEmpty();
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                Collections.sort(arrayListE, new x22(b02.f12592i));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListE.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((p22) arrayListE.get(0)).f18452a)) {
                arrayListE.add((p22) arrayListE.remove(0));
            }
            ca1 ca1VarY = ca1.y(arrayListE);
            map.put(t22Var, ca1VarY);
            return ca1VarY;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ya1 b(b02 b02Var, g22 g22Var, boolean z10, boolean z11) {
        Iterable iterableA;
        String str = g22Var.f14678o;
        b02Var.getClass();
        List listA = a(str, z10, z11);
        String strD = d(g22Var);
        if (strD == null) {
            iterableA = ya1.f22208e;
        } else {
            b02Var.getClass();
            iterableA = a(strD, z10, z11);
        }
        aa1 aa1Var = ca1.f13122b;
        z91 z91Var = new z91(4);
        z91Var.b(listA);
        z91Var.b(iterableA);
        return z91Var.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String d(g22 g22Var) {
        he0 he0VarC;
        boolean z10;
        String str = g22Var.f14678o;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (MimeTypes.AUDIO_DTS_HD.equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return MimeTypes.AUDIO_DTS;
        }
        if ("video/dolby-vision".equals(str) && (he0VarC = re0.c(g22Var)) != null && (z10 = he0VarC.f15268b)) {
            ps1.c0(z10);
            int i10 = he0VarC.f15267a;
            if (i10 == 16 || i10 == 256) {
                return "video/hevc";
            }
            if (i10 == 512) {
                return "video/avc";
            }
            if (i10 == 1024) {
                lq1 lq1Var = g22Var.E;
                if (lq1Var != null && lq1Var.f17104c == 6 && lq1Var.f17103b == 1) {
                    return null;
                }
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[EDGE_INSN: B:32:0x0095->B:56:0x00ed BREAK  A[LOOP:1: B:17:0x005e->B:21:0x006c]] */
    /* JADX WARN: Code duplicated, block: B:70:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    public static ArrayList e(t22 t22Var, w22 w22Var) throws v22 {
        int i10;
        String str;
        String str2;
        boolean zIsFeatureSupported;
        boolean z10;
        boolean z11;
        boolean zIsHardwareAccelerated;
        w22 w22Var2 = w22Var;
        int i11 = w22Var2.f21393a;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = t22Var.f20135a;
            if (w22Var2.f21394b == null) {
                w22Var2.f21394b = new MediaCodecList(i11).getCodecInfos();
            }
            int length = w22Var2.f21394b.length;
            int i12 = 0;
            while (i12 < length) {
                if (w22Var2.f21394b == null) {
                    w22Var2.f21394b = new MediaCodecList(i11).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = w22Var2.f21394b[i12];
                if (mediaCodecInfo.isAlias()) {
                    i10 = i12;
                } else {
                    int i13 = i12;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder()) {
                        i10 = i13;
                    } else {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length2 = supportedTypes.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                if (!str3.equals("video/dolby-vision")) {
                                    if (!str3.equals("video/mv-hevc")) {
                                        if (!str3.equals(MimeTypes.AUDIO_ALAC) || !"OMX.lge.alac.decoder".equals(name)) {
                                            if (!str3.equals(MimeTypes.AUDIO_FLAC) || !"OMX.lge.flac.decoder".equals(name)) {
                                                if (!str3.equals(MimeTypes.AUDIO_AC3) || !"OMX.lge.ac3.decoder".equals(name)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = "audio/lg-ac3";
                                                break;
                                            }
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            int i15 = i14;
                            str = supportedTypes[i15];
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                            i14 = i15 + 1;
                        }
                        if (str != null) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                String str4 = str;
                                try {
                                    if (t22Var.f20137c) {
                                        if (zIsFeatureSupported2) {
                                            zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                            boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                            z10 = t22Var.f20136b;
                                            if (z10) {
                                                if (!z10) {
                                                    z11 = zIsFeatureSupported;
                                                } else if (zIsFeatureSupported) {
                                                    z11 = true;
                                                }
                                                i10 = i13;
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                mediaCodecInfo.isSoftwareOnly();
                                                mediaCodecInfo.isVendor();
                                                if (z10 != z11) {
                                                    continue;
                                                } else {
                                                    str2 = str4;
                                                    arrayList.add(p22.a(name, str3, str2, capabilitiesForType, zIsHardwareAccelerated, false));
                                                }
                                            } else {
                                                if (!z10) {
                                                    z11 = zIsFeatureSupported;
                                                } else if (zIsFeatureSupported) {
                                                    z11 = true;
                                                }
                                                i10 = i13;
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                mediaCodecInfo.isSoftwareOnly();
                                                mediaCodecInfo.isVendor();
                                                if (z10 != z11) {
                                                    continue;
                                                } else {
                                                    str2 = str4;
                                                    arrayList.add(p22.a(name, str3, str2, capabilitiesForType, zIsHardwareAccelerated, false));
                                                }
                                            }
                                        }
                                    } else if (!zIsFeatureRequired) {
                                        zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                        boolean zIsFeatureRequired3 = capabilitiesForType.isFeatureRequired("secure-playback");
                                        z10 = t22Var.f20136b;
                                        if (z10 || !zIsFeatureRequired3) {
                                            if (!z10) {
                                                z11 = zIsFeatureSupported;
                                            } else if (zIsFeatureSupported) {
                                                z11 = true;
                                            }
                                            i10 = i13;
                                            zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            mediaCodecInfo.isSoftwareOnly();
                                            mediaCodecInfo.isVendor();
                                            if (z10 != z11) {
                                                continue;
                                            } else {
                                                str2 = str4;
                                                try {
                                                    arrayList.add(p22.a(name, str3, str2, capabilitiesForType, zIsHardwareAccelerated, false));
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 24 + str2.length() + 1);
                                                    sb2.append("Failed to query codec ");
                                                    sb2.append(name);
                                                    sb2.append(" (");
                                                    sb2.append(str2);
                                                    sb2.append(")");
                                                    v71.F("MediaCodecUtil", sb2.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                    }
                                    i10 = i13;
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = str4;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str2 = str;
                            }
                        } else {
                            i10 = i13;
                        }
                    }
                }
                i12 = i10 + 1;
                w22Var2 = w22Var;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new v22("Failed to query underlying media codecs", e13);
        }
    }
}
