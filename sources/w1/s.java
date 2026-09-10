package w1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.c0;
import i1.d0;
import i1.e0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.y;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements j2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f52919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f52920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f52876c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f52878d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f52880e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f52882f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f52884g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f52885h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f52887i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f52889j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f52891k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f52894m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f52896n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f52898o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f52900p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f52902q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f52904r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f52905s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f52907t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f52908u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f52910v = a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f52912w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f52914x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f52916y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f52918z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Pattern f52874a0 = a("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f52875b0 = a("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Pattern f52877c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f52879d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f52881e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f52883f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f52886h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f52888i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Pattern f52890j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Pattern f52892k0 = a("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Pattern f52893l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Pattern f52895m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Pattern f52897n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Pattern f52899o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Pattern f52901p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Pattern f52903q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f52906s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f52909u0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f52911v0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f52913w0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Pattern f52915x0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f52917y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public s(p pVar, m mVar) {
        this.f52919a = pVar;
        this.f52920b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static i1.m b(String str, i1.l[] lVarArr) {
        i1.l[] lVarArr2 = new i1.l[lVarArr.length];
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            i1.l lVar = lVarArr[i10];
            lVarArr2[i10] = new i1.l(lVar.f42570b, lVar.f42571c, lVar.f42572d, null);
        }
        return new i1.m(str, true, lVarArr2);
    }

    public static i1.l c(String str, String str2, HashMap map) throws e0 {
        String strI = i(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new i1.l(i1.g.f42541d, null, MimeTypes.VIDEO_MP4, Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = i1.g.f42541d;
            String str3 = y.f44830a;
            return new i1.l(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = i1.g.f42542e;
        return new i1.l(uuid2, null, MimeTypes.VIDEO_MP4, h3.o.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Code duplicated, block: B:274:0x07a3 A[PHI: r51
  0x07a3: PHI (r51v18 int) = (r51v14 int), (r51v15 int), (r51v16 int), (r51v19 int) binds: [B:284:0x07c8, B:280:0x07bb, B:276:0x07ad, B:273:0x07a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:353:0x090e  */
    /* JADX WARN: Code duplicated, block: B:368:0x0969 A[PHI: r29
  0x0969: PHI (r29v17 java.util.regex.Matcher) = 
  (r29v4 java.util.regex.Matcher)
  (r29v5 java.util.regex.Matcher)
  (r29v6 java.util.regex.Matcher)
  (r29v7 java.util.regex.Matcher)
  (r29v8 java.util.regex.Matcher)
  (r29v9 java.util.regex.Matcher)
  (r29v10 java.util.regex.Matcher)
  (r29v11 java.util.regex.Matcher)
  (r29v12 java.util.regex.Matcher)
  (r29v13 java.util.regex.Matcher)
  (r29v14 java.util.regex.Matcher)
  (r29v15 java.util.regex.Matcher)
  (r29v18 java.util.regex.Matcher)
 binds: [B:414:0x0a12, B:410:0x0a05, B:406:0x09f7, B:402:0x09ea, B:398:0x09dd, B:394:0x09d0, B:390:0x09c3, B:386:0x09b4, B:382:0x09a4, B:378:0x0994, B:374:0x0984, B:370:0x0974, B:367:0x0967] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:630:0x0e31  */
    /* JADX WARN: Code duplicated, block: B:632:0x0e4a  */
    /* JADX WARN: Code duplicated, block: B:635:0x0e62  */
    /* JADX WARN: Code duplicated, block: B:636:0x0e65  */
    /* JADX WARN: Code duplicated, block: B:687:0x0fc8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static m d(p pVar, m mVar, r1.s sVar, String str) throws r, e0 {
        g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        String str2;
        j jVar;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap;
        int i12;
        int i13;
        i1.m mVar2;
        int i14;
        ArrayList arrayList3;
        String str3;
        j jVar2;
        int i15;
        i1.m mVarB;
        j jVar3;
        long j10;
        String str4;
        String str5;
        Matcher matcher;
        byte b10;
        e eVar;
        int i16;
        byte b11;
        long j11;
        i1.m mVar3;
        p pVar2 = pVar;
        m mVar4 = mVar;
        boolean z10 = pVar2.f52873c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l lVar = new l(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap2 = new TreeMap();
        String str6 = "";
        boolean z11 = z10;
        String strI = "";
        long j12 = -9223372036854775807L;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long jM = 0;
        long j16 = 0;
        long jLongValue = 0;
        long j17 = 0;
        long j18 = -1;
        h hVar = null;
        String str7 = null;
        i1.m mVarB2 = null;
        String str8 = null;
        i1.m mVar5 = null;
        int i17 = 0;
        int i18 = 1;
        boolean z12 = false;
        boolean z13 = false;
        int i19 = 0;
        j jVar4 = null;
        int i20 = 0;
        String strK = null;
        int i21 = 0;
        boolean z14 = false;
        int i22 = 0;
        long j19 = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        long j21 = 0;
        boolean zF = false;
        while (true) {
            lVar = lVar;
            if (!sVar.j()) {
                h hVar2 = hVar;
                ArrayList arrayList8 = arrayList4;
                ArrayList arrayList9 = arrayList6;
                ArrayList arrayList10 = arrayList7;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                HashMap map3 = new HashMap();
                int i23 = i21;
                while (i23 < arrayList9.size()) {
                    ArrayList arrayList11 = arrayList9;
                    i iVar = (i) arrayList11.get(i23);
                    long size = iVar.f52814b;
                    if (size == -1) {
                        size = (j21 + ((long) arrayList8.size())) - (arrayList5.isEmpty() ? 1L : 0L);
                    }
                    int size2 = iVar.f52815c;
                    if (size2 == -1 && j20 != C.TIME_UNSET) {
                        size2 = (arrayList5.isEmpty() ? ((j) oa.q.k(arrayList8)).f52816m : arrayList5).size() - 1;
                    }
                    Uri uri = iVar.f52813a;
                    map3.put(uri, new i(size2, size, uri));
                    i23++;
                    arrayList9 = arrayList11;
                }
                if (hVar2 != null) {
                    arrayList5.add(hVar2);
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it = linkedHashMap3.values().iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    Uri uri2 = fVar.f52777d;
                    if ((uri2 != null || fVar.f52776c == null) && (uri2 == null || fVar.f52776c != null)) {
                        gVar = null;
                    } else {
                        long j22 = fVar.f52778e;
                        if (j22 != C.TIME_UNSET) {
                            String str9 = fVar.f52774a;
                            Uri uri3 = fVar.f52776c;
                            long j23 = fVar.f52779f;
                            long j24 = fVar.f52780g;
                            long j25 = fVar.f52781h;
                            ArrayList arrayList13 = fVar.f52782i;
                            boolean z15 = fVar.f52783j;
                            long j26 = fVar.f52784k;
                            long j27 = fVar.l;
                            ArrayList arrayList14 = fVar.f52785m;
                            ArrayList arrayList15 = fVar.f52786n;
                            ArrayList arrayList16 = new ArrayList(fVar.f52775b.values());
                            Boolean bool = fVar.f52787o;
                            boolean z16 = bool == null || bool.booleanValue();
                            String str10 = fVar.f52788p;
                            String str11 = str10 != null ? str10 : "POINT";
                            String str12 = fVar.f52789q;
                            gVar = new g(str9, uri3, uri2, j22, j23, j24, j25, arrayList13, z15, j26, j27, arrayList14, arrayList15, arrayList16, z16, str11, str12 != null ? str12 : "HIGHLIGHT", fVar.f52790r, fVar.f52791s, fVar.f52792t);
                        } else {
                            gVar = null;
                        }
                    }
                    if (gVar != null) {
                        arrayList12.add(gVar);
                    }
                    it = it;
                    map3 = map3;
                    arrayList8 = arrayList8;
                }
                HashMap map4 = map3;
                ArrayList arrayList17 = arrayList8;
                long j28 = (jM == 0 && mVar != null && mVar.f52844p) ? mVar.f52837h : jM;
                return new m(i17, str, arrayList10, j12, zF, j28, z13, i19, j21, i18, j19, j20, z11, z12, j28 != 0, mVarB2, arrayList17, arrayList5, lVar, map4, arrayList12);
            }
            String strK2 = sVar.k();
            hVar = hVar;
            if (strK2.startsWith("#EXT")) {
                arrayList7.add(strK2);
            }
            if (strK2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK3 = k(strK2, f52907t, map);
                if ("VOD".equals(strK3)) {
                    i17 = 1;
                } else if ("EVENT".equals(strK3)) {
                    i17 = 2;
                }
            } else if (strK2.equals("#EXT-X-I-FRAMES-ONLY")) {
                lVar = lVar;
                hVar = hVar;
                z14 = true;
            } else if (strK2.startsWith("#EXT-X-START")) {
                long j29 = (long) (Double.parseDouble(k(strK2, F, Collections.EMPTY_MAP)) * 1000000.0d);
                zF = f(strK2, f52875b0);
                j12 = j29;
            } else if (strK2.startsWith("#EXT-X-SERVER-CONTROL")) {
                double dG = g(strK2, f52908u, -9.223372036854776E18d);
                long j30 = dG == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG * 1000000.0d);
                boolean zF2 = f(strK2, f52910v);
                double dG2 = g(strK2, f52914x, -9.223372036854776E18d);
                long j31 = dG2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG2 * 1000000.0d);
                double dG3 = g(strK2, f52916y, -9.223372036854776E18d);
                hVar = hVar;
                lVar = new l(j30, zF2, j31, dG3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG3 * 1000000.0d), f(strK2, f52918z));
            } else if (strK2.startsWith("#EXT-X-PART-INF")) {
                j20 = (long) (Double.parseDouble(k(strK2, f52904r, Collections.EMPTY_MAP)) * 1000000.0d);
            } else {
                boolean zStartsWith = strK2.startsWith("#EXT-X-MAP");
                Pattern pattern = H;
                arrayList7 = arrayList7;
                map2 = map2;
                Pattern pattern2 = N;
                if (zStartsWith) {
                    String strK4 = k(strK2, pattern2, map);
                    String strI2 = i(strK2, pattern, null, map);
                    if (strI2 != null) {
                        String str13 = y.f44830a;
                        String[] strArrSplit = strI2.split("@", -1);
                        j18 = Long.parseLong(strArrSplit[i21]);
                        if (strArrSplit.length > 1) {
                            j13 = Long.parseLong(strArrSplit[1]);
                        }
                    }
                    long j32 = j18;
                    long j33 = j32 == -1 ? 0L : j13;
                    if (strK != null && str8 == null) {
                        throw e0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                    }
                    j jVar5 = new j(strK4, j33, j32, strK, str8);
                    String str14 = str8;
                    if (j32 != -1) {
                        j33 += j32;
                    }
                    j13 = j33;
                    jVar4 = jVar5;
                    j18 = -1;
                    lVar = lVar;
                    hVar = hVar;
                    arrayList7 = arrayList7;
                    map2 = map2;
                    str8 = str14;
                } else {
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String str15 = str8;
                    if (strK2.startsWith("#EXT-X-TARGETDURATION")) {
                        j19 = ((long) Integer.parseInt(k(strK2, f52898o, Collections.EMPTY_MAP))) * 1000000;
                    } else if (strK2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j15 = Long.parseLong(k(strK2, A, Collections.EMPTY_MAP));
                        j21 = j15;
                    } else if (strK2.startsWith("#EXT-X-VERSION")) {
                        i18 = Integer.parseInt(k(strK2, f52905s, Collections.EMPTY_MAP));
                    } else {
                        if (strK2.startsWith("#EXT-X-DEFINE")) {
                            String strI3 = i(strK2, f52879d0, null, map);
                            if (strI3 != null) {
                                String str16 = (String) pVar2.l.get(strI3);
                                if (str16 != null) {
                                    map.put(strI3, str16);
                                }
                            } else {
                                map.put(k(strK2, S, map), k(strK2, f52877c0, map));
                            }
                        } else if (strK2.startsWith("#EXTINF")) {
                            jLongValue = new BigDecimal(k(strK2, B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                            strI = i(strK2, C, str6, map);
                        } else {
                            if (strK2.startsWith("#EXT-X-SKIP")) {
                                int i24 = Integer.parseInt(k(strK2, f52912w, Collections.EMPTY_MAP));
                                go.k.t((mVar4 == null || !arrayList4.isEmpty()) ? i21 : 1);
                                String str17 = y.f44830a;
                                long j34 = mVar4.f52840k;
                                j0 j0Var = mVar4.f52846r;
                                int i25 = (int) (j21 - j34);
                                int i26 = i24 + i25;
                                if (i25 < 0 || i26 > j0Var.size()) {
                                    throw new r();
                                }
                                long j35 = j16;
                                str8 = str15;
                                long j36 = j14;
                                while (i25 < i26) {
                                    j jVar6 = (j) j0Var.get(i25);
                                    if (j21 != mVar4.f52840k) {
                                        int i27 = (mVar4.f52839j - i19) + jVar6.f52820d;
                                        j0 j0Var2 = jVar6.f52816m;
                                        ArrayList arrayList18 = new ArrayList();
                                        long j37 = j36;
                                        int i28 = i21;
                                        while (i28 < j0Var2.size()) {
                                            h hVar3 = (h) j0Var2.get(i28);
                                            arrayList18.add(new h(hVar3.f52817a, hVar3.f52818b, hVar3.f52819c, i27, j37, hVar3.f52822f, hVar3.f52823g, hVar3.f52824h, hVar3.f52825i, hVar3.f52826j, hVar3.f52827k, hVar3.l, hVar3.f52812m));
                                            j37 += hVar3.f52819c;
                                            i28++;
                                            i26 = i26;
                                        }
                                        i12 = i26;
                                        jVar6 = new j(jVar6.f52817a, jVar6.f52818b, jVar6.l, jVar6.f52819c, i27, j36, jVar6.f52822f, jVar6.f52823g, jVar6.f52824h, jVar6.f52825i, jVar6.f52826j, jVar6.f52827k, arrayList18);
                                    } else {
                                        i12 = i26;
                                    }
                                    arrayList4.add(jVar6);
                                    long j38 = jVar6.f52819c;
                                    String str18 = jVar6.f52824h;
                                    long j39 = j36 + j38;
                                    long j40 = jVar6.f52826j;
                                    if (j40 != -1) {
                                        j13 = jVar6.f52825i + j40;
                                    }
                                    int i29 = jVar6.f52820d;
                                    j jVar7 = jVar6.f52818b;
                                    i1.m mVar6 = jVar6.f52822f;
                                    String str19 = jVar6.f52823g;
                                    if (str18 == null || !str18.equals(Long.toHexString(j15))) {
                                        str8 = str18;
                                    }
                                    j15++;
                                    i25++;
                                    i20 = i29;
                                    jVar4 = jVar7;
                                    strK = str19;
                                    mVar5 = mVar6;
                                    i26 = i12;
                                    j35 = j39;
                                    j36 = j35;
                                    mVar4 = mVar;
                                }
                                pVar2 = pVar;
                                mVar4 = mVar;
                                j14 = j36;
                                j16 = j35;
                            } else if (strK2.startsWith("#EXT-X-KEY")) {
                                String strK5 = k(strK2, K, map);
                                String strI4 = i(strK2, L, "identity", map);
                                if ("NONE".equals(strK5)) {
                                    treeMap2.clear();
                                    str8 = null;
                                } else {
                                    String strI5 = i(strK2, O, null, map);
                                    if ("identity".equals(strI4)) {
                                        if ("AES-128".equals(strK5)) {
                                            strK = k(strK2, pattern2, map);
                                            str8 = strI5;
                                        }
                                        pVar2 = pVar;
                                        mVar4 = mVar;
                                    } else {
                                        if (str7 == null) {
                                            str7 = ("SAMPLE-AES-CENC".equals(strK5) || "SAMPLE-AES-CTR".equals(strK5)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
                                        }
                                        i1.l lVarC = c(strK2, strI4, map);
                                        if (lVarC != null) {
                                            treeMap2.put(strI4, lVarC);
                                            str8 = strI5;
                                        }
                                        strK = null;
                                        pVar2 = pVar;
                                        mVar4 = mVar;
                                    }
                                    str8 = strI5;
                                    strK = null;
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                }
                                mVar5 = null;
                                strK = null;
                                pVar2 = pVar;
                                mVar4 = mVar;
                            } else {
                                if (strK2.startsWith("#EXT-X-BYTERANGE")) {
                                    String strK6 = k(strK2, G, map);
                                    String str20 = y.f44830a;
                                    String[] strArrSplit2 = strK6.split("@", -1);
                                    j18 = Long.parseLong(strArrSplit2[i21]);
                                    if (strArrSplit2.length > 1) {
                                        j13 = Long.parseLong(strArrSplit2[1]);
                                    }
                                } else if (strK2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i19 = Integer.parseInt(strK2.substring(strK2.indexOf(58) + 1));
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                    lVar = lVar;
                                    hVar = hVar;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str8 = str15;
                                    linkedHashMap2 = linkedHashMap4;
                                    z13 = true;
                                } else if (strK2.equals("#EXT-X-DISCONTINUITY")) {
                                    i20++;
                                } else if (strK2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jM == 0) {
                                        jM = y.M(y.P(strK2.substring(strK2.indexOf(58) + 1))) - j14;
                                    }
                                } else if (strK2.equals("#EXT-X-GAP")) {
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                    lVar = lVar;
                                    hVar = hVar;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str8 = str15;
                                    linkedHashMap2 = linkedHashMap4;
                                    i22 = 1;
                                } else if (strK2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                    lVar = lVar;
                                    hVar = hVar;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str8 = str15;
                                    linkedHashMap2 = linkedHashMap4;
                                    z11 = true;
                                } else if (strK2.equals("#EXT-X-ENDLIST")) {
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                    lVar = lVar;
                                    hVar = hVar;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str8 = str15;
                                    linkedHashMap2 = linkedHashMap4;
                                    z12 = true;
                                } else if (strK2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long jH = h(strK2, D);
                                    Matcher matcher2 = E.matcher(strK2);
                                    if (matcher2.find()) {
                                        String strGroup = matcher2.group(1);
                                        strGroup.getClass();
                                        i13 = Integer.parseInt(strGroup);
                                    } else {
                                        i13 = -1;
                                    }
                                    arrayList6.add(new i(i13, jH, Uri.parse(l1.a.p(str, k(strK2, pattern2, map)))));
                                } else if (strK2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                    if (hVar == null && "PART".equals(k(strK2, Q, map))) {
                                        String strK7 = k(strK2, pattern2, map);
                                        long jH2 = h(strK2, I);
                                        long jH3 = h(strK2, J);
                                        String hexString = strK == null ? null : str15 != null ? str15 : Long.toHexString(j15);
                                        if (mVar5 != null || treeMap2.isEmpty()) {
                                            mVar2 = mVar5;
                                        } else {
                                            i1.l[] lVarArr = (i1.l[]) treeMap2.values().toArray(new i1.l[i21]);
                                            i1.m mVar7 = new i1.m(str7, true, lVarArr);
                                            if (mVarB2 == null) {
                                                mVarB2 = b(str7, lVarArr);
                                            }
                                            mVar2 = mVar7;
                                        }
                                        hVar = (jH2 == -1 || jH3 != -1) ? new h(strK7, jVar4, 0L, i20, j16, mVar2, strK, hexString, jH2 != -1 ? jH2 : 0L, jH3, false, false, true) : hVar;
                                        pVar2 = pVar;
                                        mVar4 = mVar;
                                        mVar5 = mVar2;
                                        lVar = lVar;
                                        arrayList7 = arrayList7;
                                        map2 = map2;
                                        str8 = str15;
                                        linkedHashMap2 = linkedHashMap4;
                                        i21 = 0;
                                    }
                                } else if (strK2.startsWith("#EXT-X-PART")) {
                                    String hexString2 = strK == null ? null : str15 != null ? str15 : Long.toHexString(j15);
                                    String strK8 = k(strK2, pattern2, map);
                                    long j41 = (long) (Double.parseDouble(k(strK2, f52900p, Collections.EMPTY_MAP)) * 1000000.0d);
                                    boolean zF3 = f(strK2, Z) | (z11 && arrayList5.isEmpty());
                                    boolean zF4 = f(strK2, f52874a0);
                                    String strI6 = i(strK2, pattern, null, map);
                                    if (strI6 != null) {
                                        String str21 = y.f44830a;
                                        String[] strArrSplit3 = strI6.split("@", -1);
                                        long j42 = Long.parseLong(strArrSplit3[0]);
                                        if (strArrSplit3.length > 1) {
                                            j17 = Long.parseLong(strArrSplit3[1]);
                                        }
                                        j11 = j42;
                                    } else {
                                        j11 = -1;
                                    }
                                    long j43 = j11 == -1 ? 0L : j17;
                                    if (mVar5 != null || treeMap2.isEmpty()) {
                                        mVar3 = mVar5;
                                    } else {
                                        i1.l[] lVarArr2 = (i1.l[]) treeMap2.values().toArray(new i1.l[0]);
                                        i1.m mVar8 = new i1.m(str7, true, lVarArr2);
                                        if (mVarB2 == null) {
                                            mVarB2 = b(str7, lVarArr2);
                                        }
                                        mVar3 = mVar8;
                                    }
                                    h hVar4 = new h(strK8, jVar4, j41, i20, j16, mVar3, strK, hexString2, j43, j11, zF4, zF3, false);
                                    j jVar8 = jVar4;
                                    int i30 = i20;
                                    arrayList5.add(hVar4);
                                    j16 += j41;
                                    if (j11 != -1) {
                                        j43 += j11;
                                    }
                                    j17 = j43;
                                    mVar4 = mVar;
                                    i20 = i30;
                                    jVar4 = jVar8;
                                    mVar5 = mVar3;
                                    lVar = lVar;
                                    hVar = hVar;
                                    arrayList7 = arrayList7;
                                    map2 = map2;
                                    str8 = str15;
                                    linkedHashMap2 = linkedHashMap4;
                                    i21 = 0;
                                    pVar2 = pVar;
                                } else {
                                    j jVar9 = jVar4;
                                    int i31 = i20;
                                    if (strK2.startsWith("#EXT-X-DATERANGE") && i(strK2, f52883f0, str6, map).equals("com.apple.hls.interstitial")) {
                                        String strK9 = k(strK2, f52881e0, map);
                                        String strI7 = i(strK2, f52893l0, null, map);
                                        Uri uri4 = strI7 != null ? Uri.parse(strI7) : null;
                                        String strI8 = i(strK2, f52895m0, null, map);
                                        Uri uri5 = strI8 != null ? Uri.parse(strI8) : null;
                                        String strI9 = i(strK2, g0, null, map);
                                        long jM2 = strI9 != null ? y.M(y.P(strI9)) : -9223372036854775807L;
                                        String strI10 = i(strK2, f52888i0, null, map);
                                        long jM3 = strI10 != null ? y.M(y.P(strI10)) : -9223372036854775807L;
                                        ArrayList arrayList19 = new ArrayList();
                                        i14 = i31;
                                        String strI11 = i(strK2, f52886h0, null, map);
                                        if (strI11 != null) {
                                            String str22 = y.f44830a;
                                            String[] strArrSplit4 = strI11.split(",", -1);
                                            int length = strArrSplit4.length;
                                            int i32 = 0;
                                            while (i32 < length) {
                                                int i33 = i32;
                                                String strTrim = strArrSplit4[i32].trim();
                                                strTrim.getClass();
                                                switch (strTrim.hashCode()) {
                                                    case 79491:
                                                        i16 = length;
                                                        if (!strTrim.equals("PRE")) {
                                                            b11 = -1;
                                                        } else {
                                                            b11 = 0;
                                                        }
                                                        break;
                                                    case 2430593:
                                                        i16 = length;
                                                        if (!strTrim.equals("ONCE")) {
                                                            b11 = -1;
                                                        } else {
                                                            b11 = 1;
                                                        }
                                                        break;
                                                    case 2461856:
                                                        i16 = length;
                                                        if (!strTrim.equals(C0375hc.f28789b)) {
                                                            b11 = -1;
                                                        } else {
                                                            b11 = 2;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = length;
                                                        b11 = -1;
                                                        break;
                                                }
                                                switch (b11) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                        arrayList19.add(strTrim);
                                                        break;
                                                }
                                                i32 = i33 + 1;
                                                length = i16;
                                            }
                                        }
                                        jVar = jVar9;
                                        String str23 = str6;
                                        double dG4 = g(strK2, f52902q, -1.0d);
                                        long j44 = dG4 >= 0.0d ? (long) (dG4 * 1000000.0d) : -9223372036854775807L;
                                        double dG5 = g(strK2, f52890j0, -1.0d);
                                        long j45 = dG5 >= 0.0d ? (long) (dG5 * 1000000.0d) : -9223372036854775807L;
                                        boolean zF5 = f(strK2, f52892k0);
                                        str2 = str23;
                                        ArrayList arrayList20 = arrayList6;
                                        double dG6 = g(strK2, f52897n0, Double.MIN_VALUE);
                                        long j46 = dG6 != Double.MIN_VALUE ? (long) (dG6 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList21 = arrayList20;
                                        double dG7 = g(strK2, f52899o0, -1.0d);
                                        long j47 = dG7 >= 0.0d ? (long) (dG7 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList22 = new ArrayList();
                                        String strI12 = i(strK2, f52901p0, null, map);
                                        if (strI12 != null) {
                                            String str24 = y.f44830a;
                                            String[] strArrSplit5 = strI12.split(",", -1);
                                            int length2 = strArrSplit5.length;
                                            int i34 = 0;
                                            while (i34 < length2) {
                                                int i35 = i34;
                                                String strTrim2 = strArrSplit5[i34].trim();
                                                strTrim2.getClass();
                                                ArrayList arrayList23 = arrayList21;
                                                if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                    arrayList22.add(strTrim2);
                                                }
                                                i34 = i35 + 1;
                                                arrayList21 = arrayList23;
                                            }
                                        }
                                        arrayList2 = arrayList21;
                                        ArrayList arrayList24 = new ArrayList();
                                        String strI13 = i(strK2, f52903q0, null, map);
                                        if (strI13 != null) {
                                            String str25 = y.f44830a;
                                            String[] strArrSplit6 = strI13.split(",", -1);
                                            int length3 = strArrSplit6.length;
                                            int i36 = 0;
                                            while (i36 < length3) {
                                                String strTrim3 = strArrSplit6[i36].trim();
                                                strTrim3.getClass();
                                                String[] strArr = strArrSplit6;
                                                if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                    arrayList24.add(strTrim3);
                                                }
                                                i36++;
                                                strArrSplit6 = strArr;
                                            }
                                        }
                                        String strI14 = i(strK2, r0, null, map);
                                        Boolean boolValueOf = strI14 != null ? Boolean.valueOf(!strI14.equals("NO")) : null;
                                        String strI15 = i(strK2, f52906s0, null, map);
                                        if (strI15 != null) {
                                            str4 = "RANGE";
                                            if (!strI15.equals("RANGE")) {
                                                str4 = "POINT";
                                                if (!strI15.equals(str4)) {
                                                    str4 = null;
                                                }
                                            }
                                        } else {
                                            str4 = null;
                                        }
                                        String strI16 = i(strK2, t0, null, map);
                                        if (strI16 != null) {
                                            str5 = "PRIMARY";
                                            if (!strI16.equals("PRIMARY")) {
                                                str5 = "HIGHLIGHT";
                                                if (!strI16.equals(str5)) {
                                                    str5 = null;
                                                }
                                            }
                                        } else {
                                            str5 = null;
                                        }
                                        treeMap = treeMap2;
                                        str3 = str7;
                                        double dG8 = g(strK2, f52909u0, -1.0d);
                                        long j48 = dG8 >= 0.0d ? (long) (dG8 * 1000000.0d) : -9223372036854775807L;
                                        double dG9 = g(strK2, f52911v0, -1.0d);
                                        long j49 = dG9 >= 0.0d ? (long) (dG9 * 1000000.0d) : -9223372036854775807L;
                                        String strI17 = i(strK2, f52913w0, null, map);
                                        ArrayList arrayList25 = new ArrayList();
                                        String strSubstring = strK2.substring(17);
                                        Matcher matcher3 = f52917y0.matcher(strSubstring);
                                        while (matcher3.find()) {
                                            String strGroup2 = matcher3.group();
                                            strGroup2.getClass();
                                            switch (strGroup2.hashCode()) {
                                                case -2136701954:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-SNAP=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 0;
                                                    }
                                                    break;
                                                case -1843050726:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-CONTENT-MAY-VARY=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 1;
                                                    }
                                                    break;
                                                case -148960310:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-PLAYOUT-LIMIT=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 2;
                                                    }
                                                    break;
                                                case -36345757:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-TIMELINE-STYLE=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 3;
                                                    }
                                                    break;
                                                case 397239341:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-ASSET-LIST=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 4;
                                                    }
                                                    break;
                                                case 850193465:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-TIMELINE-OCCUPIES=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 5;
                                                    }
                                                    break;
                                                case 1065650400:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 6;
                                                    }
                                                    break;
                                                case 1274498945:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 7;
                                                    }
                                                    break;
                                                case 1472528844:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-RESTRICT=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 8;
                                                    }
                                                    break;
                                                case 1748487807:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-RESUME-OFFSET=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 9;
                                                    }
                                                    break;
                                                case 1814205923:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-ASSET-URI=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 10;
                                                    }
                                                    break;
                                                case 2080546752:
                                                    matcher = matcher3;
                                                    if (!strGroup2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                        b10 = -1;
                                                    } else {
                                                        b10 = 11;
                                                    }
                                                    break;
                                                default:
                                                    matcher = matcher3;
                                                    b10 = -1;
                                                    break;
                                            }
                                            switch (b10) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                    str4 = str4;
                                                    str5 = str5;
                                                    break;
                                                default:
                                                    String strSubstring2 = strGroup2.substring(0, strGroup2.length() - 1);
                                                    String strH = wi.d.h(strSubstring2, X3.j.f27830b);
                                                    int length4 = strH.length() + strSubstring.indexOf(strH);
                                                    String strSubstring3 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                    if (strSubstring3.startsWith("\"")) {
                                                        eVar = new e(strSubstring2, k(strSubstring, Pattern.compile(strSubstring2 + "=\"((?:.|\f)+?)\""), map), 0);
                                                    } else if (strSubstring3.equals("0x") || strSubstring3.equals("0X")) {
                                                        eVar = new e(strSubstring2, k(strSubstring, Pattern.compile(strSubstring2 + "=(0[xX][A-F0-9]+)"), map), 1);
                                                    } else {
                                                        eVar = new e(strSubstring2, Double.parseDouble(k(strSubstring, Pattern.compile(strSubstring2 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                    }
                                                    arrayList25.add(eVar);
                                                    break;
                                            }
                                            str4 = str4;
                                            matcher3 = matcher;
                                            strI17 = strI17;
                                            str5 = str5;
                                            arrayList4 = arrayList4;
                                        }
                                        arrayList3 = arrayList4;
                                        String str26 = strI17;
                                        String str27 = str4;
                                        String str28 = str5;
                                        linkedHashMap = linkedHashMap4;
                                        f fVar2 = linkedHashMap.containsKey(strK9) ? (f) linkedHashMap.get(strK9) : new f(strK9);
                                        if (uri4 == null) {
                                            fVar2.getClass();
                                        } else {
                                            Uri uri6 = fVar2.f52776c;
                                            if (uri6 != null) {
                                                go.k.l(uri6.equals(uri4), "Can't change assetUri from %s to %s", fVar2.f52776c, uri4);
                                            }
                                            fVar2.f52776c = uri4;
                                        }
                                        if (uri5 != null) {
                                            Uri uri7 = fVar2.f52777d;
                                            if (uri7 != null) {
                                                go.k.l(uri7.equals(uri5), "Can't change assetListUri from %s to %s", fVar2.f52777d, uri5);
                                            }
                                            fVar2.f52777d = uri5;
                                        }
                                        if (jM2 != C.TIME_UNSET) {
                                            long j50 = fVar2.f52778e;
                                            if (j50 != C.TIME_UNSET) {
                                                go.k.j(j50 == jM2, "Can't change startDateUnixUs from %s to %s", j50, jM2);
                                            }
                                            fVar2.f52778e = jM2;
                                        }
                                        if (jM3 != C.TIME_UNSET) {
                                            long j51 = fVar2.f52779f;
                                            if (j51 != C.TIME_UNSET) {
                                                go.k.j(j51 == jM3, "Can't change endDateUnixUs from %s to %s", j51, jM3);
                                            }
                                            fVar2.f52779f = jM3;
                                        }
                                        if (j44 != C.TIME_UNSET) {
                                            long j52 = fVar2.f52780g;
                                            if (j52 != C.TIME_UNSET) {
                                                go.k.j(j52 == j44, "Can't change durationUs from %s to %s", j52, j44);
                                            }
                                            fVar2.f52780g = j44;
                                        }
                                        if (j45 != C.TIME_UNSET) {
                                            long j53 = fVar2.f52781h;
                                            if (j53 != C.TIME_UNSET) {
                                                go.k.j(j53 == j45, "Can't change plannedDurationUs from %s to %s", j53, j45);
                                            }
                                            fVar2.f52781h = j45;
                                        }
                                        if (!arrayList19.isEmpty()) {
                                            if (!fVar2.f52782i.isEmpty()) {
                                                go.k.h("Can't change cue from " + String.join(", ", fVar2.f52782i) + " to " + String.join(", ", arrayList19), fVar2.f52782i.equals(arrayList19));
                                            }
                                            fVar2.f52782i = arrayList19;
                                        }
                                        if (zF5) {
                                            fVar2.f52783j = true;
                                        }
                                        if (j46 != C.TIME_UNSET) {
                                            long j54 = fVar2.f52784k;
                                            if (j54 != C.TIME_UNSET) {
                                                go.k.j(j54 == j46, "Can't change resumeOffsetUs from %s to %s", j54, j46);
                                            }
                                            fVar2.f52784k = j46;
                                        }
                                        if (j47 != C.TIME_UNSET) {
                                            long j55 = fVar2.l;
                                            if (j55 != C.TIME_UNSET) {
                                                go.k.j(j55 == j47, "Can't change playoutLimitUs from %s to %s", j55, j47);
                                            }
                                            fVar2.l = j47;
                                        }
                                        if (!arrayList22.isEmpty()) {
                                            if (!fVar2.f52785m.isEmpty()) {
                                                go.k.h("Can't change snapTypes from " + String.join(", ", fVar2.f52785m) + " to " + String.join(", ", arrayList22), fVar2.f52785m.equals(arrayList22));
                                            }
                                            fVar2.f52785m = arrayList22;
                                        }
                                        if (!arrayList24.isEmpty()) {
                                            if (!fVar2.f52786n.isEmpty()) {
                                                go.k.h("Can't change restrictions from " + String.join(", ", fVar2.f52786n) + " to " + String.join(", ", arrayList24), fVar2.f52786n.equals(arrayList24));
                                            }
                                            fVar2.f52786n = arrayList24;
                                        }
                                        HashMap map5 = fVar2.f52775b;
                                        if (!arrayList25.isEmpty()) {
                                            int i37 = 0;
                                            while (i37 < arrayList25.size()) {
                                                e eVar2 = (e) arrayList25.get(i37);
                                                String str29 = eVar2.f52770a;
                                                e eVar3 = (e) map5.get(str29);
                                                if (eVar3 != null) {
                                                    boolean zEquals = eVar3.equals(eVar2);
                                                    Object[] objArr = {str29, eVar3.f52773d, Double.valueOf(eVar3.f52772c), eVar2.f52773d, Double.valueOf(eVar2.f52772c)};
                                                    if (!zEquals) {
                                                        throw new IllegalArgumentException(j1.f.B("Can't change %s from %s %s to %s %s", objArr));
                                                    }
                                                }
                                                map5.put(str29, eVar2);
                                                i37++;
                                                str27 = str27;
                                            }
                                        }
                                        String str30 = str27;
                                        if (boolValueOf != null) {
                                            Boolean bool2 = fVar2.f52787o;
                                            if (bool2 != null) {
                                                go.k.l(bool2.equals(boolValueOf), "Can't change contentMayVary from %s to %s", fVar2.f52787o, boolValueOf);
                                            }
                                            fVar2.f52787o = boolValueOf;
                                        }
                                        if (str30 != null) {
                                            String str31 = fVar2.f52788p;
                                            if (str31 != null) {
                                                go.k.l(str31.equals(str30), "Can't change timelineOccupies from %s to %s", fVar2.f52788p, str30);
                                            }
                                            fVar2.f52788p = str30;
                                        }
                                        if (str28 != null) {
                                            String str32 = fVar2.f52789q;
                                            if (str32 != null) {
                                                go.k.l(str32.equals(str28), "Can't change timelineStyle from %s to %s", fVar2.f52789q, str28);
                                            }
                                            fVar2.f52789q = str28;
                                        }
                                        if (j48 != C.TIME_UNSET) {
                                            long j56 = fVar2.f52790r;
                                            if (j56 != C.TIME_UNSET) {
                                                go.k.j(j56 == j48, "Can't change skipControlOffsetUs from %s to %s", j56, j48);
                                            }
                                            fVar2.f52790r = j48;
                                        }
                                        if (j49 != C.TIME_UNSET) {
                                            long j57 = fVar2.f52791s;
                                            if (j57 != C.TIME_UNSET) {
                                                go.k.j(j57 == j49, "Can't change skipControlDurationUs from %s to %s", j57, j49);
                                            }
                                            fVar2.f52791s = j49;
                                        }
                                        if (str26 != null) {
                                            String str33 = fVar2.f52792t;
                                            if (str33 != null) {
                                                go.k.l(str33.equals(str26), "Can't change skipControlLabelId from %s to %s", fVar2.f52792t, str26);
                                            }
                                            fVar2.f52792t = str26;
                                        }
                                        linkedHashMap.put(strK9, fVar2);
                                    } else {
                                        i14 = i31;
                                        arrayList3 = arrayList4;
                                        arrayList5 = arrayList5;
                                        arrayList2 = arrayList6;
                                        treeMap = treeMap2;
                                        str3 = str7;
                                        jVar = jVar9;
                                        str2 = str6;
                                        linkedHashMap = linkedHashMap4;
                                        if (!strK2.startsWith("#")) {
                                            String hexString3 = strK == null ? null : str15 != null ? str15 : Long.toHexString(j15);
                                            long j58 = j15 + 1;
                                            String strL = l(strK2, map);
                                            map2 = map2;
                                            j jVar10 = (j) map2.get(strL);
                                            if (j18 == -1) {
                                                jVar2 = jVar10;
                                                j13 = 0;
                                            } else if (z14 && jVar == null && jVar10 == null) {
                                                j jVar11 = new j(strL, 0L, j13, null, null);
                                                map2.put(strL, jVar11);
                                                jVar2 = jVar11;
                                            } else {
                                                jVar2 = jVar10;
                                                j13 = j13;
                                            }
                                            if (mVar5 != null || treeMap.isEmpty()) {
                                                str7 = str3;
                                                i15 = 0;
                                            } else {
                                                i15 = 0;
                                                i1.l[] lVarArr3 = (i1.l[]) treeMap.values().toArray(new i1.l[0]);
                                                str7 = str3;
                                                i1.m mVar9 = new i1.m(str7, true, lVarArr3);
                                                if (mVarB2 == null) {
                                                    mVarB = b(str7, lVarArr3);
                                                    mVar5 = mVar9;
                                                } else {
                                                    mVar5 = mVar9;
                                                }
                                                if (jVar != null) {
                                                    jVar3 = jVar;
                                                } else {
                                                    jVar3 = jVar2;
                                                }
                                                long j59 = j14;
                                                i1.m mVar10 = mVar5;
                                                j10 = j13;
                                                long j60 = jLongValue;
                                                String str34 = hexString3;
                                                String str35 = strK;
                                                strK = str35;
                                                arrayList3.add(new j(strL, jVar3, strI, j60, i14, j59, mVar10, str35, str34, j10, j18, i22, arrayList5));
                                                j16 = j59 + j60;
                                                ArrayList arrayList26 = new ArrayList();
                                                if (j18 != -1) {
                                                    j13 = j10 + j18;
                                                } else {
                                                    j13 = j10;
                                                }
                                                j15 = j58;
                                                mVarB2 = mVarB;
                                                i21 = i15;
                                                i22 = i21;
                                                arrayList5 = arrayList26;
                                                i20 = i14;
                                                mVar5 = mVar10;
                                                j14 = j16;
                                                jVar4 = jVar;
                                                str6 = str2;
                                                strI = str6;
                                                jLongValue = 0;
                                                j18 = -1;
                                                arrayList7 = arrayList7;
                                                str8 = str15;
                                                arrayList6 = arrayList2;
                                                treeMap2 = treeMap;
                                                pVar2 = pVar;
                                                mVar4 = mVar;
                                                linkedHashMap2 = linkedHashMap;
                                                arrayList4 = arrayList3;
                                            }
                                            mVarB = mVarB2;
                                            if (jVar != null) {
                                                jVar3 = jVar;
                                            } else {
                                                jVar3 = jVar2;
                                            }
                                            long j510 = j14;
                                            i1.m mVar11 = mVar5;
                                            j10 = j13;
                                            long j61 = jLongValue;
                                            String str36 = hexString3;
                                            String str37 = strK;
                                            strK = str37;
                                            arrayList3.add(new j(strL, jVar3, strI, j61, i14, j510, mVar11, str37, str36, j10, j18, i22, arrayList5));
                                            j16 = j510 + j61;
                                            ArrayList arrayList27 = new ArrayList();
                                            if (j18 != -1) {
                                                j13 = j10 + j18;
                                            } else {
                                                j13 = j10;
                                            }
                                            j15 = j58;
                                            mVarB2 = mVarB;
                                            i21 = i15;
                                            i22 = i21;
                                            arrayList5 = arrayList27;
                                            i20 = i14;
                                            mVar5 = mVar11;
                                            j14 = j16;
                                            jVar4 = jVar;
                                            str6 = str2;
                                            strI = str6;
                                            jLongValue = 0;
                                            j18 = -1;
                                            arrayList7 = arrayList7;
                                            str8 = str15;
                                            arrayList6 = arrayList2;
                                            treeMap2 = treeMap;
                                            pVar2 = pVar;
                                            mVar4 = mVar;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList4 = arrayList3;
                                        }
                                        hVar = hVar;
                                    }
                                    i10 = i14;
                                    arrayList5 = arrayList5;
                                    str7 = str3;
                                    arrayList = arrayList3;
                                    i11 = 0;
                                    pVar2 = pVar;
                                    mVar4 = mVar;
                                    linkedHashMap2 = linkedHashMap;
                                    i21 = i11;
                                    strI = strI;
                                    jLongValue = jLongValue;
                                    j14 = j14;
                                    j13 = j13;
                                    jVar4 = jVar;
                                    str6 = str2;
                                    arrayList7 = arrayList7;
                                    str8 = str15;
                                    arrayList6 = arrayList2;
                                    treeMap2 = treeMap;
                                    arrayList4 = arrayList;
                                    i20 = i10;
                                    hVar = hVar;
                                }
                                pVar2 = pVar;
                                mVar4 = mVar;
                            }
                            linkedHashMap2 = linkedHashMap4;
                        }
                        arrayList = arrayList4;
                        arrayList2 = arrayList6;
                        treeMap = treeMap2;
                        str2 = str6;
                        jVar = jVar4;
                        i10 = i20;
                        i11 = i21;
                        linkedHashMap = linkedHashMap4;
                        pVar2 = pVar;
                        mVar4 = mVar;
                        linkedHashMap2 = linkedHashMap;
                        i21 = i11;
                        strI = strI;
                        jLongValue = jLongValue;
                        j14 = j14;
                        j13 = j13;
                        jVar4 = jVar;
                        str6 = str2;
                        arrayList7 = arrayList7;
                        str8 = str15;
                        arrayList6 = arrayList2;
                        treeMap2 = treeMap;
                        arrayList4 = arrayList;
                        i20 = i10;
                        hVar = hVar;
                    }
                    str8 = str15;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            hVar = hVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x023e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0243  */
    /* JADX WARN: Code duplicated, block: B:106:0x025f  */
    /* JADX WARN: Code duplicated, block: B:108:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:163:0x0456  */
    /* JADX WARN: Code duplicated, block: B:252:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0204  */
    /* JADX WARN: Code duplicated, block: B:92:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    public static p e(r1.s sVar, String str) throws IOException {
        ?? r43;
        int i10;
        ArrayList arrayList;
        o oVar;
        String strD;
        ArrayList arrayList2;
        int i11;
        String str2;
        o oVar2;
        String strD2;
        o oVar3;
        int i12;
        int i13;
        String str3;
        String str4;
        String strW;
        String strI;
        int i14;
        int i15;
        String strI2;
        float f10;
        Uri uriQ;
        Uri uri;
        ArrayList arrayList3;
        String[] strArrW;
        StringBuilder sb2;
        int length;
        int i16;
        String string;
        String str5;
        String str6 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean zJ = sVar.j();
            Pattern pattern = N;
            ArrayList arrayList12 = arrayList8;
            boolean z12 = z10;
            Pattern pattern2 = S;
            boolean z13 = z11;
            if (!zJ) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i17 = 0;
                HashMap map3 = map;
                while (i17 < arrayList4.size()) {
                    o oVar4 = (o) arrayList4.get(i17);
                    Uri uri2 = oVar4.f52855a;
                    i1.p pVar = oVar4.f52856b;
                    if (hashSet.add(uri2)) {
                        go.k.t(pVar.l == null);
                        ArrayList arrayList20 = (ArrayList) map3.get(oVar4.f52855a);
                        arrayList20.getClass();
                        c0 c0Var = new c0(new v1.t(null, null, arrayList20));
                        i1.o oVarA = pVar.a();
                        oVarA.f42599k = c0Var;
                        arrayList19.add(new o(oVar4.f52855a, new i1.p(oVarA), oVar4.f52857c, oVar4.f52858d, oVar4.f52859e, oVar4.f52860f));
                    }
                    i17++;
                    map3 = map3;
                }
                int i18 = 0;
                List arrayList21 = null;
                i1.p pVar2 = null;
                while (i18 < arrayList13.size()) {
                    ArrayList arrayList22 = arrayList13;
                    String str7 = (String) arrayList22.get(i18);
                    String strK = k(str7, T, map2);
                    String strK2 = k(str7, pattern2, map2);
                    i1.o oVar5 = new i1.o();
                    int i19 = i18;
                    oVar5.f42589a = wi.d.i(strK, ":", strK2);
                    oVar5.f42590b = strK2;
                    oVar5.l = d0.n(MimeTypes.APPLICATION_M3U8);
                    boolean zF = f(str7, X);
                    if (f(str7, Y)) {
                        r43 = zF;
                        r43 = (zF ? 1 : 0) | 2;
                    }
                    r43 = zF;
                    oVar5.f42593e = f(str7, W) ? r43 | 4 : r43;
                    ArrayList arrayList23 = arrayList19;
                    String strI3 = i(str7, U, null, map2);
                    if (TextUtils.isEmpty(strI3)) {
                        arrayList13 = arrayList22;
                        i10 = 0;
                    } else {
                        String str8 = y.f44830a;
                        String[] strArrSplit = strI3.split(",", -1);
                        i10 = y.m(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList13 = arrayList22;
                        if (y.m(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (y.m(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (y.m(strArrSplit, "public.easy-to-read")) {
                            i10 |= Segment.SIZE;
                        }
                    }
                    oVar5.f42594f = i10;
                    oVar5.f42592d = i(str7, R, null, map2);
                    String strI4 = i(str7, pattern, null, map2);
                    Uri uriQ2 = strI4 == null ? null : l1.a.q(str6, strI4);
                    c0 c0Var2 = new c0(new v1.t(strK, strK2, Collections.EMPTY_LIST));
                    switch (k(str7, P, map2)) {
                        case "SUBTITLES":
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList4.size()) {
                                    oVar = (o) arrayList4.get(i20);
                                    if (!strK.equals(oVar.f52859e)) {
                                        i20++;
                                    }
                                } else {
                                    oVar = null;
                                }
                            }
                            if (oVar != null) {
                                String strW2 = y.w(oVar.f52856b.f42641k, 3);
                                oVar5.f42598j = strW2;
                                strD = d0.d(strW2);
                            } else {
                                strD = null;
                            }
                            if (strD == null) {
                                strD = MimeTypes.TEXT_VTT;
                            }
                            oVar5.f42600m = d0.n(strD);
                            oVar5.f42599k = c0Var2;
                            if (uriQ2 == null) {
                                arrayList = arrayList16;
                                l1.a.s("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                n nVar = new n(uriQ2, new i1.p(oVar5), strK2);
                                arrayList = arrayList16;
                                arrayList.add(nVar);
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList2 = arrayList15;
                            String strK3 = k(str7, V, map2);
                            if (strK3.startsWith("CC")) {
                                i11 = Integer.parseInt(strK3.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i11 = Integer.parseInt(strK3.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                            }
                            oVar5.f42600m = d0.n(str2);
                            oVar5.J = i11;
                            arrayList21.add(new i1.p(oVar5));
                            arrayList15 = arrayList2;
                            arrayList = arrayList16;
                            break;
                        case "AUDIO":
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList4.size()) {
                                    oVar2 = (o) arrayList4.get(i21);
                                    int i22 = i21;
                                    if (!strK.equals(oVar2.f52858d)) {
                                        i21 = i22 + 1;
                                    }
                                } else {
                                    oVar2 = null;
                                }
                            }
                            if (oVar2 != null) {
                                String strW3 = y.w(oVar2.f52856b.f42641k, 1);
                                oVar5.f42598j = strW3;
                                strD2 = d0.d(strW3);
                            } else {
                                strD2 = null;
                            }
                            o oVar6 = oVar2;
                            String strI5 = i(str7, f52887i, null, map2);
                            if (strI5 != null) {
                                String str9 = y.f44830a;
                                oVar5.E = Integer.parseInt(strI5.split("/", 2)[0]);
                                if (MimeTypes.AUDIO_E_AC3.equals(strD2) && strI5.endsWith("/JOC")) {
                                    oVar5.f42598j = "ec+3";
                                    strD2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            oVar5.f42600m = d0.n(strD2);
                            if (uriQ2 != null) {
                                oVar5.f42599k = c0Var2;
                                arrayList15.add(new n(uriQ2, new i1.p(oVar5), strK2));
                            } else {
                                arrayList2 = arrayList15;
                                if (oVar6 != null) {
                                    arrayList15 = arrayList2;
                                    pVar2 = new i1.p(oVar5);
                                } else {
                                    arrayList15 = arrayList2;
                                }
                            }
                            arrayList = arrayList16;
                            break;
                        case "VIDEO":
                            int i23 = 0;
                            while (true) {
                                if (i23 < arrayList4.size()) {
                                    oVar3 = (o) arrayList4.get(i23);
                                    if (!strK.equals(oVar3.f52857c)) {
                                        i23++;
                                    }
                                } else {
                                    oVar3 = null;
                                }
                            }
                            if (oVar3 != null) {
                                i1.p pVar3 = oVar3.f52856b;
                                String strW4 = y.w(pVar3.f42641k, 2);
                                oVar5.f42598j = strW4;
                                oVar5.f42600m = d0.n(d0.d(strW4));
                                oVar5.f42607t = pVar3.f42650u;
                                oVar5.f42608u = pVar3.f42651v;
                                oVar5.f42611x = pVar3.f42654y;
                            }
                            if (uriQ2 != null) {
                                oVar5.f42599k = c0Var2;
                                arrayList14.add(new n(uriQ2, new i1.p(oVar5), strK2));
                            }
                            arrayList = arrayList16;
                            break;
                        default:
                            arrayList = arrayList16;
                            break;
                    }
                    arrayList19 = arrayList23;
                    arrayList16 = arrayList;
                    i18 = i19 + 1;
                    str6 = str;
                }
                ArrayList arrayList24 = arrayList19;
                ArrayList arrayList25 = arrayList16;
                if (z12) {
                    arrayList21 = Collections.EMPTY_LIST;
                }
                return new p(str, arrayList17, arrayList24, arrayList14, arrayList15, arrayList25, arrayList12, pVar2, arrayList21, z13, map2, arrayList18);
            }
            String strK4 = sVar.k();
            if (strK4.startsWith("#EXT")) {
                arrayList11.add(strK4);
            }
            boolean zStartsWith = strK4.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList26 = arrayList11;
            if (strK4.startsWith("#EXT-X-DEFINE")) {
                map2.put(k(strK4, pattern2, map2), k(strK4, f52877c0, map2));
            } else {
                if (strK4.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList10 = arrayList10;
                    z10 = z12;
                    z11 = true;
                } else if (strK4.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strK4);
                } else if (strK4.startsWith("#EXT-X-SESSION-KEY")) {
                    i1.l lVarC = c(strK4, i(strK4, L, "identity", map2), map2);
                    if (lVarC != null) {
                        String strK5 = k(strK4, K, map2);
                        arrayList10.add(new i1.m(("SAMPLE-AES-CENC".equals(strK5) || "SAMPLE-AES-CTR".equals(strK5)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs, true, lVarC));
                    }
                } else {
                    if (strK4.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z12 | strK4.contains("CLOSED-CAPTIONS=NONE");
                        int i24 = zStartsWith ? Http2.INITIAL_MAX_FRAME_SIZE : 0;
                        z12 = zContains;
                        int i25 = Integer.parseInt(k(strK4, f52885h, Collections.EMPTY_MAP));
                        Matcher matcher = f52876c.matcher(strK4);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i12 = Integer.parseInt(strGroup);
                        } else {
                            i12 = -1;
                        }
                        String strI6 = i(strK4, f52889j, null, map2);
                        String strI7 = i(strK4, f52891k, null, map2);
                        String strI8 = i(strK4, l, null, map2);
                        if (strI8 != null) {
                            String str10 = y.f44830a;
                            String[] strArrSplit2 = strI8.split(",", 2)[0].split("/", -1);
                            str3 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str4 = strArrSplit2[1];
                                arrayList9 = arrayList9;
                                i13 = 2;
                            } else {
                                i13 = 2;
                            }
                            strW = y.w(strI7, i13);
                            if (d0.j(strW, str3) && (str3 == null || (strI6 != null && str4 != null && ((!strI6.equals("PQ") || str4.equals("db1p")) && ((!strI6.equals("SDR") || str4.equals("db2g")) && (!strI6.equals("HLG") || str4.startsWith("db4"))))))) {
                                if (str3 == null) {
                                    str3 = strW;
                                }
                                strArrW = y.W(strI7);
                                if (strArrW.length == 0) {
                                    string = null;
                                } else {
                                    sb2 = new StringBuilder();
                                    length = strArrW.length;
                                    i16 = 0;
                                    while (i16 < length) {
                                        str5 = strArrW[i16];
                                        String[] strArr = strArrW;
                                        int i26 = length;
                                        if (2 == d0.h(d0.d(str5))) {
                                            if (sb2.length() > 0) {
                                                sb2.append(",");
                                            }
                                            sb2.append(str5);
                                        }
                                        i16++;
                                        length = i26;
                                        strArrW = strArr;
                                    }
                                    if (sb2.length() > 0) {
                                        string = sb2.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strI7 = wi.d.i(str3, ",", string);
                                } else {
                                    strI7 = str3;
                                }
                            }
                            strI = i(strK4, f52894m, null, map2);
                            if (strI != null) {
                                String[] strArrSplit3 = strI.split("x", -1);
                                i15 = Integer.parseInt(strArrSplit3[0]);
                                i14 = Integer.parseInt(strArrSplit3[1]);
                                if (i15 > 0 || i14 <= 0) {
                                    i14 = -1;
                                    i15 = -1;
                                }
                            } else {
                                i14 = -1;
                                i15 = -1;
                            }
                            strI2 = i(strK4, f52896n, null, map2);
                            if (strI2 != null) {
                                f10 = Float.parseFloat(strI2);
                            } else {
                                f10 = -1.0f;
                            }
                            String strI9 = i(strK4, f52878d, null, map2);
                            String strI10 = i(strK4, f52880e, null, map2);
                            String strI11 = i(strK4, f52882f, null, map2);
                            String strI12 = i(strK4, f52884g, null, map2);
                            if (zStartsWith) {
                                uriQ = l1.a.q(str6, k(strK4, pattern, map2));
                            } else {
                                if (sVar.j()) {
                                    throw e0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                uriQ = l1.a.q(str6, l(sVar.k(), map2));
                            }
                            uri = uriQ;
                            i1.o oVar7 = new i1.o();
                            oVar7.f42589a = Integer.toString(arrayList4.size());
                            oVar7.l = d0.n(MimeTypes.APPLICATION_M3U8);
                            oVar7.f42598j = strI7;
                            oVar7.f42596h = i12;
                            oVar7.f42597i = i25;
                            oVar7.f42607t = i15;
                            oVar7.f42608u = i14;
                            oVar7.f42611x = f10;
                            oVar7.f42594f = i24;
                            arrayList4.add(new o(uri, new i1.p(oVar7), strI9, strI10, strI11, strI12));
                            arrayList3 = (ArrayList) map.get(uri);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                map.put(uri, arrayList3);
                            }
                            arrayList3.add(new v1.s(i12, i25, strI9, strI10, strI11, strI12));
                        } else {
                            i13 = 2;
                            str3 = null;
                        }
                        str4 = null;
                        strW = y.w(strI7, i13);
                        if (d0.j(strW, str3)) {
                            if (str3 == null) {
                                str3 = strW;
                            }
                            strArrW = y.W(strI7);
                            if (strArrW.length == 0) {
                                string = null;
                            } else {
                                sb2 = new StringBuilder();
                                length = strArrW.length;
                                i16 = 0;
                                while (i16 < length) {
                                    str5 = strArrW[i16];
                                    String[] strArr2 = strArrW;
                                    int i27 = length;
                                    if (2 == d0.h(d0.d(str5))) {
                                        if (sb2.length() > 0) {
                                            sb2.append(",");
                                        }
                                        sb2.append(str5);
                                    }
                                    i16++;
                                    length = i27;
                                    strArrW = strArr2;
                                }
                                if (sb2.length() > 0) {
                                    string = sb2.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strI7 = wi.d.i(str3, ",", string);
                            } else {
                                strI7 = str3;
                            }
                        }
                        strI = i(strK4, f52894m, null, map2);
                        if (strI != null) {
                            String[] strArrSplit4 = strI.split("x", -1);
                            i15 = Integer.parseInt(strArrSplit4[0]);
                            i14 = Integer.parseInt(strArrSplit4[1]);
                            if (i15 > 0) {
                                i14 = -1;
                                i15 = -1;
                            } else {
                                i14 = -1;
                                i15 = -1;
                            }
                        } else {
                            i14 = -1;
                            i15 = -1;
                        }
                        strI2 = i(strK4, f52896n, null, map2);
                        if (strI2 != null) {
                            f10 = Float.parseFloat(strI2);
                        } else {
                            f10 = -1.0f;
                        }
                        String strI13 = i(strK4, f52878d, null, map2);
                        String strI14 = i(strK4, f52880e, null, map2);
                        String strI15 = i(strK4, f52882f, null, map2);
                        String strI16 = i(strK4, f52884g, null, map2);
                        if (zStartsWith) {
                            uriQ = l1.a.q(str6, k(strK4, pattern, map2));
                        } else {
                            if (sVar.j()) {
                                throw e0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriQ = l1.a.q(str6, l(sVar.k(), map2));
                        }
                        uri = uriQ;
                        i1.o oVar8 = new i1.o();
                        oVar8.f42589a = Integer.toString(arrayList4.size());
                        oVar8.l = d0.n(MimeTypes.APPLICATION_M3U8);
                        oVar8.f42598j = strI7;
                        oVar8.f42596h = i12;
                        oVar8.f42597i = i25;
                        oVar8.f42607t = i15;
                        oVar8.f42608u = i14;
                        oVar8.f42611x = f10;
                        oVar8.f42594f = i24;
                        arrayList4.add(new o(uri, new i1.p(oVar8), strI13, strI14, strI15, strI16));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new v1.s(i12, i25, strI13, strI14, strI15, strI16));
                    }
                    z10 = z12;
                    z11 = z13;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList26;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            arrayList9 = arrayList9;
            z10 = z12;
            z11 = z13;
            arrayList8 = arrayList12;
            arrayList11 = arrayList26;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
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

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d10;
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
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws e0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw e0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f52915x0.matcher(str);
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

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0096, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0047 A[SYNTHETIC] */
    @Override // j2.p
    public final Object j(Uri uri, n1.j jVar) throws e0 {
        int i10;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i11 = bufferedReader.read();
            boolean zJ = false;
            if (i11 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i11 = bufferedReader.read();
                    while (i11 != -1) {
                        i11 = bufferedReader.read();
                    }
                    i10 = 0;
                    while (true) {
                        if (i10 < 7) {
                            while (i11 != -1) {
                                i11 = bufferedReader.read();
                            }
                            zJ = y.J(i11);
                            break;
                        }
                        if (i11 != "#EXTM3U".charAt(i10)) {
                            break;
                            break;
                        }
                        i11 = bufferedReader.read();
                        i10++;
                    }
                }
            } else {
                while (i11 != -1 && Character.isWhitespace(i11)) {
                    i11 = bufferedReader.read();
                }
                i10 = 0;
                while (true) {
                    if (i10 < 7) {
                        while (i11 != -1 && Character.isWhitespace(i11) && !y.J(i11)) {
                            i11 = bufferedReader.read();
                        }
                        zJ = y.J(i11);
                        break;
                    }
                    if (i11 != "#EXTM3U".charAt(i10)) {
                        break;
                    }
                    i11 = bufferedReader.read();
                    i10++;
                }
            }
            if (!zJ) {
                throw e0.b("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    y.h(bufferedReader);
                    throw e0.b("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        p pVarE = e(new r1.s(arrayDeque, bufferedReader), uri.toString());
                        y.h(bufferedReader);
                        return pVarE;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    m mVarD = d(this.f52919a, this.f52920b, new r1.s(arrayDeque, bufferedReader), uri.toString());
                    y.h(bufferedReader);
                    return mVarD;
                }
            }
        } catch (Throwable th2) {
            y.h(bufferedReader);
            throw th2;
        }
    }
}
