package com.smartdigimkt.d4;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.p4.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34441a = "MediaCodecUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34443c = "OMX.MTK.AUDIO.DECODER.RAW";
    private static final SparseIntArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseIntArray f34445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34446i = "avc1";
    private static final String j = "avc2";
    private static final Map<String, Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f34447l = "hev1";
    private static final String m = "hvc1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34442b = "OMX.google.raw.decoder";
    private static final com.smartdigimkt.d4.a d = com.smartdigimkt.d4.a.d(f34442b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f34444e = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<b, List<com.smartdigimkt.d4.a>> f = new HashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f34448n = -1;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f34450b;

        public b(String str, boolean z2) {
            this.f34449a = str;
            this.f34450b = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f34449a, bVar.f34449a) && this.f34450b == bVar.f34450b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f34449a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f34450b ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.d4.d$d, reason: collision with other inner class name */
    public interface InterfaceC0457d {
        int a();

        MediaCodecInfo a(int i2);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    public static final class e implements InterfaceC0457d {
        private e() {
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public boolean b() {
            return false;
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public MediaCodecInfo a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f34445h = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, com.p004ironsource.mediationsdk.metadata.a.f25965n);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, Segment.SIZE);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        k = map;
        androidx.datastore.preferences.protobuf.a.v(1, map, "L30", 4, "L60");
        androidx.datastore.preferences.protobuf.a.v(16, map, "L63", 64, "L90");
        androidx.datastore.preferences.protobuf.a.v(256, map, "L93", 1024, "L120");
        androidx.datastore.preferences.protobuf.a.v(4096, map, "L123", 16384, "L150");
        androidx.datastore.preferences.protobuf.a.v(65536, map, "L153", 262144, "L156");
        androidx.datastore.preferences.protobuf.a.v(1048576, map, "L180", 4194304, "L183");
        androidx.datastore.preferences.protobuf.a.v(16777216, map, "L186", 2, "H30");
        androidx.datastore.preferences.protobuf.a.v(8, map, "H60", 32, "H63");
        androidx.datastore.preferences.protobuf.a.v(128, map, "H90", 512, "H93");
        androidx.datastore.preferences.protobuf.a.v(com.p004ironsource.mediationsdk.metadata.a.f25965n, map, "H120", Segment.SIZE, "H123");
        androidx.datastore.preferences.protobuf.a.v(32768, map, "H150", 131072, "H153");
        androidx.datastore.preferences.protobuf.a.v(524288, map, "H156", 2097152, "H180");
        androidx.datastore.preferences.protobuf.a.v(8388608, map, "H183", 33554432, "H186");
    }

    private d() {
    }

    private static int a(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case com.p004ironsource.mediationsdk.metadata.a.f25965n /* 2048 */:
            case 4096:
                return 2097152;
            case Segment.SIZE /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static synchronized List<com.smartdigimkt.d4.a> b(String str, boolean z2) throws c {
        try {
            b bVar = new b(str, z2);
            HashMap<b, List<com.smartdigimkt.d4.a>> map = f;
            List<com.smartdigimkt.d4.a> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i2 = f0.f37540a;
            InterfaceC0457d fVar = i2 >= 21 ? new f(z2) : new e();
            ArrayList<com.smartdigimkt.d4.a> arrayListA = a(bVar, fVar, str);
            if (z2 && arrayListA.isEmpty() && 21 <= i2 && i2 <= 23) {
                fVar = new e();
                arrayListA = a(bVar, fVar, str);
                if (!arrayListA.isEmpty()) {
                    Log.w(f34441a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f34432a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                arrayListA.addAll(a(new b("audio/eac3", bVar.f34450b), fVar, str));
            }
            a(arrayListA);
            List<com.smartdigimkt.d4.a> listUnmodifiableList = Collections.unmodifiableList(arrayListA);
            map.put(bVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void c(String str, boolean z2) {
        try {
            b(str, z2);
        } catch (c e2) {
            Log.e(f34441a, "Codec warming failed", e2);
        }
    }

    public static final class f implements InterfaceC0457d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f34451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f34452b;

        public f(boolean z2) {
            this.f34451a = z2 ? 1 : 0;
        }

        private void c() {
            if (this.f34452b == null) {
                this.f34452b = new MediaCodecList(this.f34451a).getCodecInfos();
            }
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public int a() {
            c();
            return this.f34452b.length;
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public boolean b() {
            return true;
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public MediaCodecInfo a(int i2) {
            c();
            return this.f34452b[i2];
        }

        @Override // com.smartdigimkt.d4.d.InterfaceC0457d
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }
    }

    public static com.smartdigimkt.d4.a a() {
        return d;
    }

    public static com.smartdigimkt.d4.a a(String str, boolean z2) throws c {
        List<com.smartdigimkt.d4.a> listB = b(str, z2);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[PHI: r16
  0x004b: PHI (r16v6 int) = (r16v5 int), (r16v7 int) binds: [B:23:0x0055, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    private static ArrayList<com.smartdigimkt.d4.a> a(b bVar, InterfaceC0457d interfaceC0457d, String str) throws c {
        int i2;
        InterfaceC0457d interfaceC0457d2 = interfaceC0457d;
        try {
            ArrayList<com.smartdigimkt.d4.a> arrayList = new ArrayList<>();
            String str2 = bVar.f34449a;
            int iA = interfaceC0457d2.a();
            boolean zB = interfaceC0457d2.b();
            int i3 = 0;
            loop0: while (i3 < iA) {
                MediaCodecInfo mediaCodecInfoA = interfaceC0457d2.a(i3);
                String name = mediaCodecInfoA.getName();
                if (a(mediaCodecInfoA, name, zB, str)) {
                    String[] supportedTypes = mediaCodecInfoA.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = supportedTypes[i4];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(str3);
                                boolean zA = interfaceC0457d2.a(str2, capabilitiesForType);
                                boolean zA2 = a(name);
                                if (zB) {
                                    i2 = iA;
                                    try {
                                        if (bVar.f34450b == zA) {
                                            arrayList.add(com.smartdigimkt.d4.a.a(name, str2, capabilitiesForType, zA2, false));
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (f0.f37540a > 23 && !arrayList.isEmpty()) {
                                            Log.e(f34441a, "Skipping codec " + name + " (failed to query capabilities)");
                                            i4++;
                                            interfaceC0457d2 = interfaceC0457d;
                                            iA = i2;
                                        } else {
                                            Log.e(f34441a, "Failed to query codec " + name + " (" + str3 + ")");
                                            throw e;
                                        }
                                    }
                                } else {
                                    i2 = iA;
                                }
                                if (!zB) {
                                    try {
                                        if (!bVar.f34450b) {
                                            arrayList.add(com.smartdigimkt.d4.a.a(name, str2, capabilitiesForType, zA2, false));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (f0.f37540a > 23) {
                                        }
                                        Log.e(f34441a, "Failed to query codec " + name + " (" + str3 + ")");
                                        throw e;
                                    }
                                }
                                if (!zB && zA) {
                                    arrayList.add(com.smartdigimkt.d4.a.a(name + ".secure", str2, capabilitiesForType, zA2, true));
                                    break loop0;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i2 = iA;
                            }
                        } else {
                            i2 = iA;
                        }
                        i4++;
                        interfaceC0457d2 = interfaceC0457d;
                        iA = i2;
                    }
                }
                i3++;
                interfaceC0457d2 = interfaceC0457d;
                iA = iA;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new c(e5);
        }
    }

    public static int b() throws c {
        if (f34448n == -1) {
            int iMax = 0;
            com.smartdigimkt.d4.a aVarA = a("video/avc", false);
            if (aVarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrB = aVarA.b();
                int length = codecProfileLevelArrB.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(a(codecProfileLevelArrB[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, f0.f37540a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f34448n = iMax;
        }
        return f34448n;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z2 && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = f0.f37540a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = f0.f37541b;
            if ("a70".equals(str3) || ("Xiaomi".equals(f0.f37542c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = f0.f37541b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = f0.f37541b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(f0.f37542c))) {
            String str6 = f0.f37541b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(f0.f37542c)) {
            String str7 = f0.f37541b;
            if (str7.startsWith(com.smartdigimkt.b0.a.S) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && f0.f37541b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static Pair<Integer, Integer> b(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "avc1":
            case "avc2":
                return a(str, strArrSplit);
            case "hev1":
            case "hvc1":
                return b(str, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        int i2;
        if (strArr.length < 4) {
            androidx.datastore.preferences.protobuf.a.x("Ignoring malformed HEVC codec string: ", str, f34441a);
            return null;
        }
        Matcher matcher = f34444e.matcher(strArr[1]);
        if (!matcher.matches()) {
            androidx.datastore.preferences.protobuf.a.x("Ignoring malformed HEVC codec string: ", str, f34441a);
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i2 = 1;
        } else {
            if (!"2".equals(strGroup)) {
                androidx.datastore.preferences.protobuf.a.x("Unknown HEVC profile string: ", strGroup, f34441a);
                return null;
            }
            i2 = 2;
        }
        Integer num = k.get(strArr[3]);
        if (num == null) {
            Log.w(f34441a, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i2), num);
    }

    private static void a(List<com.smartdigimkt.d4.a> list) {
        if (f0.f37540a < 26) {
            if (list.size() <= 1 || !f34443c.equals(list.get(0).f34432a)) {
                return;
            }
            for (int i2 = 1; i2 < list.size(); i2++) {
                com.smartdigimkt.d4.a aVar = list.get(i2);
                if (f34442b.equals(aVar.f34432a)) {
                    list.remove(i2);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static boolean a(String str) {
        if (f0.f37540a > 22) {
            return false;
        }
        String str2 = f0.d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        if (strArr.length < 2) {
            androidx.datastore.preferences.protobuf.a.x("Ignoring malformed AVC codec string: ", str, f34441a);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                numValueOf2 = numValueOf3;
            } else {
                Log.w(f34441a, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i2 = g.get(numValueOf2.intValue(), -1);
            if (i2 == -1) {
                Log.w(f34441a, "Unknown AVC profile: " + numValueOf2);
                return null;
            }
            int i3 = f34445h.get(numValueOf.intValue(), -1);
            if (i3 == -1) {
                Log.w(f34441a, "Unknown AVC level: " + numValueOf);
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (NumberFormatException unused) {
            androidx.datastore.preferences.protobuf.a.x("Ignoring malformed AVC codec string: ", str, f34441a);
            return null;
        }
    }
}
