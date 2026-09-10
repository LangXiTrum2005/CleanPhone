package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2925Yz implements LT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2847Vz f4050a;
    public final C2743Rz b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern s = a("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern w = a("CAN-BLOCK-RELOAD");
    public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = a("AUTOSELECT");
    public static final Pattern U = a("DEFAULT");
    public static final Pattern V = a("FORCED");
    public static final Pattern W = a("INDEPENDENT");
    public static final Pattern X = a("GAP");
    public static final Pattern Y = a("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C2925Yz(C2847Vz c2847Vz, C2743Rz c2743Rz) {
        this.f4050a = c2847Vz;
        this.b = c2743Rz;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.uuid, schemeData.licenseServerUrl, schemeData.mimeType, null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap map) throws KT {
        String strI = i(str, J, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = K;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new DrmInitData.SchemeData(AbstractC4147nc.d, MimeTypes.VIDEO_MP4, Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC4147nc.d;
            int i2 = Ug0.f3833a;
            return new DrmInitData.SchemeData(uuid, "hls", str.getBytes(AbstractC2333Ce.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = AbstractC4147nc.e;
        return new DrmInitData.SchemeData(uuid2, MimeTypes.VIDEO_MP4, FW.f(uuid2, null, bArrDecode));
    }

    public static C2743Rz d(C2847Vz c2847Vz, C2743Rz c2743Rz, C4568sM c4568sM, String str) throws KT, C2899Xz {
        String str2;
        C2613Mz c2613Mz;
        ArrayList arrayList;
        String str3;
        C2613Mz c2613Mz2;
        int i2;
        String str4;
        HashMap map;
        int i3;
        long j2;
        long j3;
        HashMap map2;
        C2665Oz c2665Oz;
        DrmInitData drmInitData;
        c2847Vz = c2847Vz;
        c2743Rz = c2743Rz;
        boolean z2 = c2847Vz.c;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C2717Qz c2717Qz = new C2717Qz(false, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z3 = z2;
        C2717Qz c2717Qz2 = c2717Qz;
        String strI = "";
        long j4 = -1;
        int i4 = 0;
        boolean zF = false;
        long j5 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long jL = 0;
        boolean z4 = false;
        int i5 = 0;
        long j6 = 0;
        int i6 = 1;
        long j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long j8 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        boolean z5 = false;
        DrmInitData drmInitDataB = null;
        long j9 = 0;
        DrmInitData drmInitData2 = null;
        long j10 = 0;
        long j11 = 0;
        boolean z6 = false;
        String strJ = null;
        String strI2 = null;
        String str6 = null;
        int i7 = 0;
        long j12 = 0;
        boolean z7 = false;
        C2665Oz c2665Oz2 = null;
        long jLongValue = 0;
        long j13 = 0;
        ArrayList arrayList6 = arrayList3;
        C2613Mz c2613Mz3 = null;
        while (c4568sM.p()) {
            String strS = c4568sM.s();
            if (strS.startsWith("#EXT")) {
                arrayList5.add(strS);
            }
            if (strS.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strJ2 = j(strS, q, map3);
                if ("VOD".equals(strJ2)) {
                    i4 = 1;
                } else if ("EVENT".equals(strJ2)) {
                    i4 = 2;
                }
            } else if (strS.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strS.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j14 = (long) (Double.parseDouble(j(strS, C, Collections.emptyMap())) * 1000000.0d);
                    zF = f(strS, Y);
                    j5 = j14;
                } else {
                    str2 = str5;
                    if (strS.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dG = g(strS, r);
                        long j15 = dG == -9.223372036854776E18d ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : (long) (dG * 1000000.0d);
                        boolean zF2 = f(strS, s);
                        double dG2 = g(strS, u);
                        long j16 = dG2 == -9.223372036854776E18d ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : (long) (dG2 * 1000000.0d);
                        double dG3 = g(strS, v);
                        c2717Qz2 = new C2717Qz(zF2, j15, j16, dG3 == -9.223372036854776E18d ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : (long) (dG3 * 1000000.0d), f(strS, w));
                    } else if (strS.startsWith("#EXT-X-PART-INF")) {
                        j8 = (long) (Double.parseDouble(j(strS, o, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strS.startsWith("#EXT-X-MAP");
                        Pattern pattern = E;
                        boolean z8 = zF;
                        Pattern pattern2 = K;
                        if (zStartsWith) {
                            String strJ3 = j(strS, pattern2, map3);
                            String strI3 = i(strS, pattern, null, map3);
                            if (strI3 != null) {
                                int i8 = Ug0.f3833a;
                                String[] strArrSplit = strI3.split("@", -1);
                                j4 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j9 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j4 == -1) {
                                j9 = 0;
                            }
                            if (strJ != null && strI2 == null) {
                                throw KT.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c2665Oz2 = new C2665Oz(strJ3, j9, strJ, strI2, j4);
                            if (j4 != -1) {
                                j9 += j4;
                            }
                            j4 = -1;
                            str5 = str2;
                            zF = z8;
                        } else {
                            arrayList6 = arrayList6;
                            ArrayList arrayList7 = arrayList5;
                            if (strS.startsWith("#EXT-X-TARGETDURATION")) {
                                j7 = ((long) Integer.parseInt(j(strS, m, Collections.emptyMap()))) * 1000000;
                            } else if (strS.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j10 = Long.parseLong(j(strS, x, Collections.emptyMap()));
                                j6 = j10;
                            } else if (strS.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(j(strS, p, Collections.emptyMap()));
                            } else {
                                if (strS.startsWith("#EXT-X-DEFINE")) {
                                    String strI4 = i(strS, a0, null, map3);
                                    if (strI4 != null) {
                                        String str7 = (String) c2847Vz.l.get(strI4);
                                        if (str7 != null) {
                                            map3.put(strI4, str7);
                                        }
                                    } else {
                                        map3.put(j(strS, P, map3), j(strS, Z, map3));
                                    }
                                    map3 = map3;
                                    map4 = map4;
                                    c2613Mz = c2613Mz3;
                                    arrayList = arrayList6;
                                    str3 = str6;
                                } else if (strS.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(j(strS, y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strI = i(strS, z, str2, map3);
                                    str5 = str2;
                                    zF = z8;
                                    arrayList5 = arrayList7;
                                } else {
                                    String str8 = str2;
                                    if (strS.startsWith("#EXT-X-SKIP")) {
                                        int i9 = Integer.parseInt(j(strS, t, Collections.emptyMap()));
                                        FW.s(c2743Rz != null && arrayList2.isEmpty());
                                        int i10 = Ug0.f3833a;
                                        int i11 = (int) (j6 - c2743Rz.k);
                                        int i12 = i9 + i11;
                                        if (i11 >= 0) {
                                            AC ac = c2743Rz.r;
                                            if (i12 <= ac.size()) {
                                                while (i11 < i12) {
                                                    C2665Oz c2665Oz3 = (C2665Oz) ac.get(i11);
                                                    if (j6 != c2743Rz.k) {
                                                        int i13 = (c2743Rz.j - i5) + c2665Oz3.d;
                                                        ArrayList arrayList8 = new ArrayList();
                                                        long j17 = j12;
                                                        int i14 = 0;
                                                        while (true) {
                                                            AC ac2 = c2665Oz3.m;
                                                            i2 = i12;
                                                            if (i14 >= ac2.size()) {
                                                                break;
                                                            }
                                                            C2613Mz c2613Mz4 = (C2613Mz) ac2.get(i14);
                                                            arrayList8.add(new C2613Mz(c2613Mz4.f3582a, c2613Mz4.b, c2613Mz4.c, i13, j17, c2613Mz4.f, c2613Mz4.g, c2613Mz4.h, c2613Mz4.i, c2613Mz4.j, c2613Mz4.k, c2613Mz4.l, c2613Mz4.m));
                                                            j17 += c2613Mz4.c;
                                                            i14++;
                                                            map4 = map4;
                                                            i12 = i2;
                                                            str8 = str8;
                                                            c2613Mz3 = c2613Mz3;
                                                        }
                                                        c2613Mz2 = c2613Mz3;
                                                        str4 = str8;
                                                        map = map4;
                                                        c2665Oz3 = new C2665Oz(c2665Oz3.f3582a, c2665Oz3.b, c2665Oz3.l, c2665Oz3.c, i13, j12, c2665Oz3.f, c2665Oz3.g, c2665Oz3.h, c2665Oz3.i, c2665Oz3.j, c2665Oz3.k, arrayList8);
                                                    } else {
                                                        c2613Mz2 = c2613Mz3;
                                                        i2 = i12;
                                                        str4 = str8;
                                                        map = map4;
                                                    }
                                                    arrayList2.add(c2665Oz3);
                                                    j12 += c2665Oz3.c;
                                                    long j18 = c2665Oz3.j;
                                                    if (j18 != -1) {
                                                        j9 = c2665Oz3.i + j18;
                                                    }
                                                    String str9 = c2665Oz3.h;
                                                    if (str9 == null || !str9.equals(Long.toHexString(j10))) {
                                                        strI2 = str9;
                                                    }
                                                    j10++;
                                                    i11++;
                                                    i7 = c2665Oz3.d;
                                                    c2665Oz2 = c2665Oz3.b;
                                                    drmInitData2 = c2665Oz3.f;
                                                    strJ = c2665Oz3.g;
                                                    map4 = map;
                                                    i12 = i2;
                                                    j11 = j12;
                                                    str8 = str4;
                                                    c2613Mz3 = c2613Mz2;
                                                    c2743Rz = c2743Rz;
                                                }
                                                str2 = str8;
                                                c2847Vz = c2847Vz;
                                                c2743Rz = c2743Rz;
                                            }
                                        }
                                        throw new C2899Xz();
                                    }
                                    c2613Mz = c2613Mz3;
                                    str2 = str8;
                                    map4 = map4;
                                    if (strS.startsWith("#EXT-X-KEY")) {
                                        String strJ4 = j(strS, H, map3);
                                        String strI5 = i(strS, I, "identity", map3);
                                        if ("NONE".equals(strJ4)) {
                                            treeMap.clear();
                                            drmInitData2 = null;
                                            strJ = null;
                                            strI2 = null;
                                        } else {
                                            strI2 = i(strS, L, null, map3);
                                            if (!"identity".equals(strI5)) {
                                                String str10 = str6;
                                                str6 = str10 == null ? ("SAMPLE-AES-CENC".equals(strJ4) || "SAMPLE-AES-CTR".equals(strJ4)) ? com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc : com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs : str10;
                                                DrmInitData.SchemeData schemeDataC = c(strS, strI5, map3);
                                                if (schemeDataC != null) {
                                                    treeMap.put(strI5, schemeDataC);
                                                    drmInitData2 = null;
                                                }
                                                strJ = null;
                                            } else if ("AES-128".equals(strJ4)) {
                                                strJ = j(strS, pattern2, map3);
                                                strI2 = strI2;
                                            }
                                            strJ = null;
                                        }
                                    } else {
                                        str3 = str6;
                                        if (strS.startsWith("#EXT-X-BYTERANGE")) {
                                            String strJ5 = j(strS, D, map3);
                                            int i15 = Ug0.f3833a;
                                            String[] strArrSplit2 = strJ5.split("@", -1);
                                            j4 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j9 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strS.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(strS.substring(strS.indexOf(58) + 1));
                                            c2847Vz = c2847Vz;
                                            c2743Rz = c2743Rz;
                                            map4 = map4;
                                            str6 = str3;
                                            arrayList6 = arrayList6;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList7;
                                            c2613Mz3 = c2613Mz;
                                            z4 = true;
                                        } else if (strS.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else if (strS.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jL == 0) {
                                                jL = Ug0.L(Ug0.O(strS.substring(strS.indexOf(58) + 1))) - j12;
                                            } else {
                                                arrayList = arrayList6;
                                            }
                                        } else if (strS.equals("#EXT-X-GAP")) {
                                            c2847Vz = c2847Vz;
                                            c2743Rz = c2743Rz;
                                            map4 = map4;
                                            str6 = str3;
                                            arrayList6 = arrayList6;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList7;
                                            c2613Mz3 = c2613Mz;
                                            z6 = true;
                                        } else if (strS.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c2847Vz = c2847Vz;
                                            c2743Rz = c2743Rz;
                                            map4 = map4;
                                            str6 = str3;
                                            arrayList6 = arrayList6;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList7;
                                            c2613Mz3 = c2613Mz;
                                            z3 = true;
                                        } else if (strS.equals("#EXT-X-ENDLIST")) {
                                            c2847Vz = c2847Vz;
                                            c2743Rz = c2743Rz;
                                            map4 = map4;
                                            str6 = str3;
                                            arrayList6 = arrayList6;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList7;
                                            c2613Mz3 = c2613Mz;
                                            z5 = true;
                                        } else {
                                            if (strS.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jH = h(strS, A);
                                                Matcher matcher = B.matcher(strS);
                                                if (matcher.find()) {
                                                    String strGroup = matcher.group(1);
                                                    strGroup.getClass();
                                                    i3 = Integer.parseInt(strGroup);
                                                } else {
                                                    i3 = -1;
                                                }
                                                arrayList4.add(new C2639Nz(i3, jH, Uri.parse(FW.V(str, j(strS, pattern2, map3)))));
                                            } else if (strS.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (c2613Mz == null && "PART".equals(j(strS, N, map3))) {
                                                    String strJ6 = j(strS, pattern2, map3);
                                                    long jH2 = h(strS, F);
                                                    long jH3 = h(strS, G);
                                                    String hexString = strJ == null ? null : strI2 != null ? strI2 : Long.toHexString(j10);
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData3 = new DrmInitData(str3, schemeDataArr);
                                                        if (drmInitDataB == null) {
                                                            drmInitDataB = b(str3, schemeDataArr);
                                                        }
                                                        drmInitData2 = drmInitData3;
                                                    }
                                                    if (jH2 == -1 || jH3 != -1) {
                                                        c2613Mz = new C2613Mz(strJ6, c2665Oz2, 0L, i7, j11, drmInitData2, strJ, hexString, jH2 != -1 ? jH2 : 0L, jH3, false, false, true);
                                                    }
                                                }
                                            } else if (strS.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strJ == null ? null : strI2 != null ? strI2 : Long.toHexString(j10);
                                                String strJ7 = j(strS, pattern2, map3);
                                                long j19 = (long) (Double.parseDouble(j(strS, n, Collections.emptyMap())) * 1000000.0d);
                                                boolean zF3 = f(strS, W) | (z3 && arrayList6.isEmpty());
                                                boolean zF4 = f(strS, X);
                                                String strI6 = i(strS, pattern, null, map3);
                                                if (strI6 != null) {
                                                    int i16 = Ug0.f3833a;
                                                    String[] strArrSplit3 = strI6.split("@", -1);
                                                    j2 = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j13 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j2 = -1;
                                                }
                                                if (j2 == -1) {
                                                    j13 = 0;
                                                }
                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData4 = new DrmInitData(str3, schemeDataArr2);
                                                    if (drmInitDataB == null) {
                                                        drmInitDataB = b(str3, schemeDataArr2);
                                                    }
                                                    drmInitData2 = drmInitData4;
                                                }
                                                arrayList6.add(new C2613Mz(strJ7, c2665Oz2, j19, i7, j11, drmInitData2, strJ, hexString2, j13, j2, zF4, zF3, false));
                                                j11 += j19;
                                                if (j2 != -1) {
                                                    j13 += j2;
                                                }
                                                c2847Vz = c2847Vz;
                                                c2743Rz = c2743Rz;
                                                map4 = map4;
                                                str6 = str3;
                                                arrayList6 = arrayList6;
                                                str5 = str2;
                                                zF = z8;
                                                arrayList5 = arrayList7;
                                                c2613Mz3 = c2613Mz;
                                            } else {
                                                arrayList = arrayList6;
                                                if (!strS.startsWith("#")) {
                                                    String hexString3 = strJ == null ? null : strI2 != null ? strI2 : Long.toHexString(j10);
                                                    long j20 = j10 + 1;
                                                    String strK = k(strS, map3);
                                                    C2665Oz c2665Oz4 = (C2665Oz) map4.get(strK);
                                                    if (j4 == -1) {
                                                        j3 = 0;
                                                    } else {
                                                        if (z7 && c2665Oz2 == null && c2665Oz4 == null) {
                                                            c2665Oz4 = new C2665Oz(strK, 0L, null, null, j9);
                                                            map4.put(strK, c2665Oz4);
                                                        }
                                                        j3 = j9;
                                                    }
                                                    if (drmInitData2 != null || treeMap.isEmpty()) {
                                                        map2 = map3;
                                                        c2665Oz = c2665Oz4;
                                                        drmInitData = drmInitData2;
                                                    } else {
                                                        map2 = map3;
                                                        c2665Oz = c2665Oz4;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                        if (drmInitDataB == null) {
                                                            drmInitDataB = b(str3, schemeDataArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new C2665Oz(strK, c2665Oz2 != null ? c2665Oz2 : c2665Oz, strI, jLongValue, i7, j12, drmInitData, strJ, hexString3, j3, j4, z6, arrayList));
                                                    j11 = j12 + jLongValue;
                                                    ArrayList arrayList9 = new ArrayList();
                                                    if (j4 != -1) {
                                                        j3 += j4;
                                                    }
                                                    j9 = j3;
                                                    c2743Rz = c2743Rz;
                                                    arrayList6 = arrayList9;
                                                    map4 = map4;
                                                    str6 = str3;
                                                    drmInitData2 = drmInitData;
                                                    j4 = -1;
                                                    j12 = j11;
                                                    j10 = j20;
                                                    map3 = map2;
                                                    str5 = str2;
                                                    strI = str5;
                                                    zF = z8;
                                                    arrayList5 = arrayList7;
                                                    c2613Mz3 = c2613Mz;
                                                    z6 = false;
                                                    jLongValue = 0;
                                                    c2847Vz = c2847Vz;
                                                }
                                            }
                                            arrayList = arrayList6;
                                        }
                                        str6 = str3;
                                    }
                                    arrayList6 = arrayList6;
                                    str5 = str2;
                                    zF = z8;
                                    arrayList5 = arrayList7;
                                    c2613Mz3 = c2613Mz;
                                }
                                c2847Vz = c2847Vz;
                                c2743Rz = c2743Rz;
                                map4 = map4;
                                str6 = str3;
                                arrayList6 = arrayList;
                                map3 = map3;
                                str5 = str2;
                                zF = z8;
                                arrayList5 = arrayList7;
                                c2613Mz3 = c2613Mz;
                            }
                            str5 = str2;
                            zF = z8;
                            arrayList5 = arrayList7;
                        }
                    }
                }
                str5 = str2;
            }
        }
        C2613Mz c2613Mz5 = c2613Mz3;
        ArrayList arrayList10 = arrayList6;
        ArrayList arrayList11 = arrayList5;
        boolean z9 = zF;
        HashMap map5 = new HashMap();
        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
            C2639Nz c2639Nz = (C2639Nz) arrayList4.get(i17);
            long size = c2639Nz.b;
            if (size == -1) {
                size = (j6 + ((long) arrayList2.size())) - (arrayList10.isEmpty() ? 1L : 0L);
            }
            int size2 = c2639Nz.c;
            if (size2 == -1 && j8 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                size2 = (arrayList10.isEmpty() ? ((C2665Oz) FW.H(arrayList2)).m : arrayList10).size() - 1;
            }
            Uri uri = c2639Nz.f3485a;
            map5.put(uri, new C2639Nz(size2, size, uri));
        }
        if (c2613Mz5 != null) {
            arrayList10.add(c2613Mz5);
        }
        return new C2743Rz(i4, str, arrayList11, j5, z9, jL, z4, i5, j6, i6, j7, j8, z3, z5, jL != 0, drmInitDataB, arrayList2, arrayList10, c2717Qz2, map5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0388  */
    /* JADX WARN: Code duplicated, block: B:204:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0198  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f7  */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x03b5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static C2847Vz e(C4568sM c4568sM, String str) throws IOException {
        ?? r15;
        Pattern pattern;
        int i2;
        ArrayList arrayList;
        C2821Uz c2821Uz;
        String strE;
        int i3;
        String str2;
        int i4;
        int i5;
        C2821Uz c2821Uz2;
        String strE2;
        C2821Uz c2821Uz3;
        int i6;
        ArrayList arrayList2;
        int i7;
        int i8;
        String strI;
        float f2;
        Uri uriX;
        HashMap map;
        ArrayList arrayList3;
        String str3 = str;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z2 = false;
        boolean zContains = false;
        while (true) {
            boolean zP = c4568sM.p();
            String str4 = MimeTypes.APPLICATION_M3U8;
            Pattern pattern2 = K;
            Pattern pattern3 = P;
            if (!zP) {
                HashMap map4 = map2;
                ArrayList arrayList12 = arrayList5;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i9 = 0;
                while (i9 < arrayList4.size()) {
                    C2821Uz c2821Uz4 = (C2821Uz) arrayList4.get(i9);
                    if (hashSet.add(c2821Uz4.f3851a)) {
                        C4619sw c4619sw = c2821Uz4.b;
                        FW.s(c4619sw.j == null);
                        ArrayList arrayList20 = (ArrayList) map4.get(c2821Uz4.f3851a);
                        arrayList20.getClass();
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList20));
                        C4531rw c4531rwA = c4619sw.a();
                        c4531rwA.i = metadata;
                        arrayList19.add(new C2821Uz(c2821Uz4.f3851a, new C4619sw(c4531rwA), c2821Uz4.c, c2821Uz4.d, c2821Uz4.e, c2821Uz4.f));
                    }
                    i9++;
                    map4 = map4;
                }
                int i10 = 0;
                C4619sw c4619sw2 = null;
                List listEmptyList = null;
                while (i10 < arrayList16.size()) {
                    arrayList16 = arrayList16;
                    String str5 = (String) arrayList16.get(i10);
                    String strJ = j(str5, Q, map3);
                    String strJ2 = j(str5, pattern3, map3);
                    C4531rw c4531rw = new C4531rw();
                    c4531rw.f4954a = DM.i(strJ, ":", strJ2);
                    c4531rw.b = strJ2;
                    c4531rw.j = str4;
                    boolean zF = f(str5, U);
                    String str6 = str4;
                    if (f(str5, V)) {
                        r15 = zF;
                        r15 = (zF ? 1 : 0) | 2;
                    }
                    r15 = zF;
                    int i11 = r15;
                    if (f(str5, T)) {
                        i11 = (r15 == true ? 1 : 0) | 4;
                    }
                    c4531rw.d = i11;
                    String strI2 = i(str5, R, null, map3);
                    if (TextUtils.isEmpty(strI2)) {
                        pattern = pattern3;
                        i2 = 0;
                    } else {
                        int i12 = Ug0.f3833a;
                        pattern = pattern3;
                        String[] strArrSplit = strI2.split(",", -1);
                        i2 = Ug0.l(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        if (Ug0.l(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (Ug0.l(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (Ug0.l(strArrSplit, "public.easy-to-read")) {
                            i2 |= 8192;
                        }
                    }
                    c4531rw.e = i2;
                    c4531rw.c = i(str5, O, null, map3);
                    String strI3 = i(str5, pattern2, null, map3);
                    Uri uriX2 = strI3 == null ? null : FW.X(str3, strI3);
                    Pattern pattern4 = pattern2;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(strJ, strJ2, Collections.emptyList()));
                    String strJ3 = j(str5, M, map3);
                    strJ3.hashCode();
                    switch (strJ3) {
                        case "SUBTITLES":
                            arrayList16 = arrayList16;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList4.size()) {
                                    c2821Uz = (C2821Uz) arrayList4.get(i13);
                                    if (!strJ.equals(c2821Uz.e)) {
                                        i13++;
                                    }
                                } else {
                                    c2821Uz = null;
                                }
                            }
                            if (c2821Uz != null) {
                                String strS = Ug0.s(c2821Uz.b.i, 3);
                                c4531rw.h = strS;
                                strE = AbstractC5011xP.e(strS);
                            } else {
                                strE = null;
                            }
                            if (strE == null) {
                                strE = MimeTypes.TEXT_VTT;
                            }
                            c4531rw.k = strE;
                            c4531rw.i = metadata2;
                            if (uriX2 != null) {
                                arrayList14 = arrayList14;
                                arrayList14.add(new C2795Tz(uriX2, new C4619sw(c4531rw), strJ2));
                            } else {
                                arrayList14 = arrayList14;
                                AbstractC4038mJ.f();
                            }
                            i4 = 1;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList16 = arrayList16;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            String strJ4 = j(str5, S, map3);
                            if (strJ4.startsWith("CC")) {
                                i3 = Integer.parseInt(strJ4.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i3 = Integer.parseInt(strJ4.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (listEmptyList == null) {
                                listEmptyList = new ArrayList();
                            }
                            c4531rw.k = str2;
                            c4531rw.C = i3;
                            listEmptyList.add(new C4619sw(c4531rw));
                            arrayList14 = arrayList14;
                            i4 = 1;
                            break;
                        case "AUDIO":
                            arrayList = arrayList12;
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList4.size()) {
                                    C2821Uz c2821Uz5 = (C2821Uz) arrayList4.get(i14);
                                    arrayList16 = arrayList16;
                                    if (strJ.equals(c2821Uz5.d)) {
                                        c2821Uz2 = c2821Uz5;
                                        i5 = 1;
                                    } else {
                                        i14++;
                                        arrayList16 = arrayList16;
                                    }
                                } else {
                                    arrayList16 = arrayList16;
                                    i5 = 1;
                                    c2821Uz2 = null;
                                }
                            }
                            if (c2821Uz2 != null) {
                                String strS2 = Ug0.s(c2821Uz2.b.i, i5);
                                c4531rw.h = strS2;
                                strE2 = AbstractC5011xP.e(strS2);
                            } else {
                                strE2 = null;
                            }
                            String strI4 = i(str5, i, null, map3);
                            if (strI4 != null) {
                                int i15 = Ug0.f3833a;
                                c4531rw.x = Integer.parseInt(strI4.split("/", 2)[0]);
                                if (MimeTypes.AUDIO_E_AC3.equals(strE2) && strI4.endsWith("/JOC")) {
                                    c4531rw.h = "ec+3";
                                    strE2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            c4531rw.k = strE2;
                            if (uriX2 == null) {
                                arrayList13 = arrayList13;
                                if (c2821Uz2 != null) {
                                    c4619sw2 = new C4619sw(c4531rw);
                                    arrayList14 = arrayList14;
                                    i4 = 1;
                                }
                                break;
                            } else {
                                c4531rw.i = metadata2;
                                arrayList13 = arrayList13;
                                arrayList13.add(new C2795Tz(uriX2, new C4619sw(c4531rw), strJ2));
                            }
                            arrayList14 = arrayList14;
                            i4 = 1;
                            break;
                        case "VIDEO":
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList4.size()) {
                                    c2821Uz3 = (C2821Uz) arrayList4.get(i16);
                                    if (!strJ.equals(c2821Uz3.c)) {
                                        i16++;
                                    }
                                } else {
                                    c2821Uz3 = null;
                                }
                            }
                            if (c2821Uz3 != null) {
                                C4619sw c4619sw3 = c2821Uz3.b;
                                String strS3 = Ug0.s(c4619sw3.i, 2);
                                c4531rw.h = strS3;
                                c4531rw.k = AbstractC5011xP.e(strS3);
                                c4531rw.p = c4619sw3.q;
                                c4531rw.q = c4619sw3.r;
                                c4531rw.r = c4619sw3.s;
                            }
                            if (uriX2 != null) {
                                c4531rw.i = metadata2;
                                arrayList = arrayList12;
                                arrayList.add(new C2795Tz(uriX2, new C4619sw(c4531rw), strJ2));
                            }
                            i4 = 1;
                        default:
                            arrayList = arrayList12;
                            i4 = 1;
                            break;
                    }
                    i10 += i4;
                    str3 = str;
                    arrayList13 = arrayList13;
                    arrayList14 = arrayList14;
                    arrayList12 = arrayList;
                    str4 = str6;
                    pattern3 = pattern;
                    pattern2 = pattern4;
                }
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList12;
                if (zContains) {
                    listEmptyList = Collections.emptyList();
                }
                return new C2847Vz(str, arrayList18, arrayList19, arrayList23, arrayList22, arrayList21, arrayList15, c4619sw2, listEmptyList, z2, map3, arrayList17);
            }
            String strS4 = c4568sM.s();
            if (strS4.startsWith("#EXT")) {
                arrayList11.add(strS4);
            }
            boolean zStartsWith = strS4.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList24 = arrayList8;
            if (strS4.startsWith("#EXT-X-DEFINE")) {
                map3.put(j(strS4, pattern3, map3), j(strS4, Z, map3));
            } else {
                if (strS4.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    map = map2;
                    arrayList2 = arrayList5;
                    arrayList11 = arrayList11;
                    z2 = true;
                } else if (strS4.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strS4);
                } else if (strS4.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataC = c(strS4, i(strS4, I, "identity", map3), map3);
                    if (schemeDataC != null) {
                        String strJ5 = j(strS4, H, map3);
                        arrayList10.add(new DrmInitData(("SAMPLE-AES-CENC".equals(strJ5) || "SAMPLE-AES-CTR".equals(strJ5)) ? com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc : com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs, schemeDataC));
                    }
                } else if (strS4.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    zContains |= strS4.contains("CLOSED-CAPTIONS=NONE");
                    int i17 = zStartsWith ? 16384 : 0;
                    int i18 = Integer.parseInt(j(strS4, h, Collections.emptyMap()));
                    Matcher matcher = c.matcher(strS4);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i6 = Integer.parseInt(strGroup);
                    } else {
                        i6 = -1;
                    }
                    String strI5 = i(strS4, j, null, map3);
                    String strI6 = i(strS4, k, null, map3);
                    if (strI6 != null) {
                        int i19 = Ug0.f3833a;
                        arrayList2 = arrayList5;
                        String[] strArrSplit2 = strI6.split("x", -1);
                        i7 = Integer.parseInt(strArrSplit2[0]);
                        i8 = Integer.parseInt(strArrSplit2[1]);
                        if (i7 <= 0 || i8 <= 0) {
                        }
                        strI = i(strS4, l, null, map3);
                        if (strI != null) {
                            f2 = Float.parseFloat(strI);
                        } else {
                            f2 = -1.0f;
                        }
                        HashMap map5 = map2;
                        String strI7 = i(strS4, d, null, map3);
                        String strI8 = i(strS4, e, null, map3);
                        String strI9 = i(strS4, f, null, map3);
                        String strI10 = i(strS4, g, null, map3);
                        if (zStartsWith) {
                            uriX = FW.X(str3, j(strS4, pattern2, map3));
                        } else {
                            if (c4568sM.p()) {
                                throw KT.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriX = FW.X(str3, k(c4568sM.s(), map3));
                        }
                        C4531rw c4531rw2 = new C4531rw();
                        c4531rw2.f4954a = Integer.toString(arrayList4.size());
                        c4531rw2.j = MimeTypes.APPLICATION_M3U8;
                        c4531rw2.h = strI5;
                        c4531rw2.f = i6;
                        c4531rw2.g = i18;
                        c4531rw2.p = i7;
                        c4531rw2.q = i8;
                        c4531rw2.r = f2;
                        c4531rw2.e = i17;
                        arrayList4.add(new C2821Uz(uriX, new C4619sw(c4531rw2), strI7, strI8, strI9, strI10));
                        map = map5;
                        arrayList3 = (ArrayList) map.get(uriX);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uriX, arrayList3);
                        }
                        arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(i6, i18, strI7, strI8, strI9, strI10));
                    } else {
                        arrayList2 = arrayList5;
                    }
                    i7 = -1;
                    i8 = -1;
                    strI = i(strS4, l, null, map3);
                    if (strI != null) {
                        f2 = Float.parseFloat(strI);
                    } else {
                        f2 = -1.0f;
                    }
                    HashMap map6 = map2;
                    String strI11 = i(strS4, d, null, map3);
                    String strI12 = i(strS4, e, null, map3);
                    String strI13 = i(strS4, f, null, map3);
                    String strI14 = i(strS4, g, null, map3);
                    if (zStartsWith) {
                        uriX = FW.X(str3, j(strS4, pattern2, map3));
                    } else {
                        if (c4568sM.p()) {
                            throw KT.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriX = FW.X(str3, k(c4568sM.s(), map3));
                    }
                    C4531rw c4531rw3 = new C4531rw();
                    c4531rw3.f4954a = Integer.toString(arrayList4.size());
                    c4531rw3.j = MimeTypes.APPLICATION_M3U8;
                    c4531rw3.h = strI5;
                    c4531rw3.f = i6;
                    c4531rw3.g = i18;
                    c4531rw3.p = i7;
                    c4531rw3.q = i8;
                    c4531rw3.r = f2;
                    c4531rw3.e = i17;
                    arrayList4.add(new C2821Uz(uriX, new C4619sw(c4531rw3), strI11, strI12, strI13, strI14));
                    map = map6;
                    arrayList3 = (ArrayList) map.get(uriX);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uriX, arrayList3);
                    }
                    arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(i6, i18, strI11, strI12, strI13, strI14));
                }
                map2 = map;
                arrayList8 = arrayList24;
                arrayList10 = arrayList10;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList2;
                arrayList9 = arrayList9;
            }
            map = map2;
            arrayList2 = arrayList5;
            arrayList11 = arrayList11;
            map2 = map;
            arrayList8 = arrayList24;
            arrayList10 = arrayList10;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList2;
            arrayList9 = arrayList9;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws KT {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw KT.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:63:0x00fa, B:64:0x0100, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060, B:29:0x0066, B:31:0x006c, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:57:0x00d6, B:58:0x00da), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046 A[Catch: all -> 0x0093, LOOP:1: B:16:0x003b->B:20:0x0046, LOOP_END, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:63:0x00fa, B:64:0x0100, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060, B:29:0x0066, B:31:0x006c, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:57:0x00d6, B:58:0x00da), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: all -> 0x0093, LOOP:3: B:29:0x0066->B:88:0x0066, LOOP_START, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:63:0x00fa, B:64:0x0100, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060, B:29:0x0066, B:31:0x006c, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:57:0x00d6, B:58:0x00da), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:63:0x00fa, B:64:0x0100, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060, B:29:0x0066, B:31:0x006c, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:57:0x00d6, B:58:0x00da), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:63:0x00fa, B:64:0x0100, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060, B:29:0x0066, B:31:0x006c, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:57:0x00d6, B:58:0x00da), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x007f A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) throws KT {
        int i2;
        String line;
        String strTrim;
        Object objE;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c4692tl));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i3 = bufferedReader.read();
            if (i3 != 239) {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                for (i2 = 0; i2 < 7; i2++) {
                    if (i3 == "#EXTM3U".charAt(i2)) {
                        i3 = bufferedReader.read();
                    }
                }
                while (i3 != -1 && Character.isWhitespace(i3) && !Ug0.J(i3)) {
                    i3 = bufferedReader.read();
                }
                if (Ug0.J(i3)) {
                    while (true) {
                        line = bufferedReader.readLine();
                        if (line != null) {
                            Ug0.h(bufferedReader);
                            throw KT.b("Failed to parse the playlist, could not identify any tags.", null);
                        }
                        strTrim = line.trim();
                        if (!strTrim.isEmpty()) {
                            if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                                if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                                    arrayDeque.add(strTrim);
                                }
                                arrayDeque.add(strTrim);
                                objE = d(this.f4050a, this.b, new C4568sM(arrayDeque, bufferedReader), uri.toString());
                                break;
                            }
                            arrayDeque.add(strTrim);
                            objE = e(new C4568sM(arrayDeque, bufferedReader), uri.toString());
                            break;
                            Ug0.h(bufferedReader);
                            return objE;
                        }
                    }
                }
            } else if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                i3 = bufferedReader.read();
                while (i3 != -1) {
                    i3 = bufferedReader.read();
                }
                while (i2 < 7) {
                    if (i3 == "#EXTM3U".charAt(i2)) {
                        i3 = bufferedReader.read();
                    }
                }
                while (i3 != -1) {
                    i3 = bufferedReader.read();
                }
                if (Ug0.J(i3)) {
                    while (true) {
                        line = bufferedReader.readLine();
                        if (line != null) {
                            Ug0.h(bufferedReader);
                            throw KT.b("Failed to parse the playlist, could not identify any tags.", null);
                        }
                        strTrim = line.trim();
                        if (!strTrim.isEmpty()) {
                            if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                                if (!strTrim.startsWith("#EXT-X-TARGETDURATION")) {
                                    arrayDeque.add(strTrim);
                                }
                                arrayDeque.add(strTrim);
                                objE = d(this.f4050a, this.b, new C4568sM(arrayDeque, bufferedReader), uri.toString());
                                break;
                            }
                            arrayDeque.add(strTrim);
                            objE = e(new C4568sM(arrayDeque, bufferedReader), uri.toString());
                            break;
                        }
                    }
                    Ug0.h(bufferedReader);
                    return objE;
                }
            }
            throw KT.b("Input does not start with the #EXTM3U header.", null);
        } catch (Throwable th) {
            Ug0.h(bufferedReader);
            throw th;
        }
    }
}
