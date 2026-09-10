package y1;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.internal.ads.w22;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import oa.e0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f54183a = new HashMap();

    public static void a(ArrayList arrayList, String str) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            Collections.sort(arrayList, new q(new g()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f54127a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i10, int i11) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i10;
        codecProfileLevel.level = i11;
        return codecProfileLevel;
    }

    public static String c(i1.p pVar) {
        Pair pairC;
        String str = pVar.f42643n;
        String str2 = pVar.f42643n;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(str2) && (pairC = l1.c.c(pVar)) != null) {
            int iIntValue = ((Integer) pairC.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        try {
            r rVar = new r(str, z10, z11);
            HashMap map = f54183a;
            List list = (List) map.get(rVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListF = f(rVar, new w22(z10, z11, str.equals("video/mv-hevc"), 1));
            if (z10) {
                arrayListF.isEmpty();
            }
            a(arrayListF, str);
            j0 j0VarX = j0.x(arrayListF);
            map.put(rVar, j0VarX);
            return j0VarX;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    public static ArrayList f(r rVar, w22 w22Var) throws s {
        int i10;
        String strD;
        String str;
        w22 w22Var2 = w22Var;
        int i11 = w22Var2.f21393a;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = rVar.f54180a;
            boolean z10 = rVar.f54181b;
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
                    if (mediaCodecInfo.isEncoder() || (strD = d(mediaCodecInfo, name, str2)) == null) {
                        i10 = i13;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strD);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z11 = rVar.f54182c;
                            if ((z11 || !zIsFeatureRequired) && (!z11 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z10 || !zIsFeatureRequired2) && (!z10 || zIsFeatureSupported2)) {
                                    str = strD;
                                    try {
                                        boolean zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                        boolean zIsSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                        boolean zIsVendor = mediaCodecInfo.isVendor();
                                        if (z10 != zIsFeatureSupported2) {
                                            i10 = i13;
                                        } else {
                                            i10 = i13;
                                            arrayList.add(m.i(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false));
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        l1.a.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                } else {
                                    i10 = i13;
                                }
                            } else {
                                i10 = i13;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = strD;
                        }
                    }
                }
                i12 = i10 + 1;
                w22Var2 = w22Var;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new s("Failed to query underlying media codecs", e12);
        }
    }

    public static n1 g(g gVar, i1.p pVar, boolean z10, boolean z11) {
        List listB = gVar.b(pVar.f42643n, z10, z11);
        String strC = c(pVar);
        List listB2 = strC == null ? n1.f47281e : gVar.b(strC, z10, z11);
        e0 e0VarU = j0.u();
        e0VarU.d(listB);
        e0VarU.d(listB2);
        return e0VarU.g();
    }
}
