package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f11117b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f11116a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11118c = new Object();

    public static Integer[] a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    public static List zza(String str) {
        ArrayList arrayList;
        Object obj = f11118c;
        synchronized (obj) {
            HashMap map = f11116a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f11117b == null) {
                            f11117b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f11117b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    map2.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                                    map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    map2.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                                    map2.put("widths", a(videoCapabilities.getSupportedWidths()));
                                    map2.put("heights", a(videoCapabilities.getSupportedHeights()));
                                }
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        f11116a.put(str, arrayList);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e10) {
                HashMap map3 = new HashMap();
                map3.put("error", e10.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f11116a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
