package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2956a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f4104a;
    public final Uri b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:161:0x0281  */
    /* JADX WARN: Code duplicated, block: B:298:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:301:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:302:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:304:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:305:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C2956a10(QN qn, Uri uri) {
        byte b;
        String str;
        int i;
        C4531rw c4531rw;
        C4405qY c4405qYA;
        int i2;
        String str2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str3;
        Uri uri2;
        Uri uriBuild;
        FC fc = qn.i;
        FW.i(fc.containsKey("control"), "missing attribute control");
        C4531rw c4531rw2 = new C4531rw();
        int i5 = qn.e;
        if (i5 > 0) {
            c4531rw2.f = i5;
        }
        PN pn = qn.j;
        int i6 = pn.f3549a;
        String str4 = pn.b;
        String strJ0 = FW.j0(str4);
        strJ0.getClass();
        switch (strJ0.hashCode()) {
            case -1922091719:
                if (strJ0.equals("MPEG4-GENERIC")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 2412:
                if (strJ0.equals("L8")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 64593:
                if (strJ0.equals("AC3")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 64934:
                if (strJ0.equals("AMR")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 74609:
                if (strJ0.equals("L16")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 85182:
                if (strJ0.equals("VP8")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 85183:
                if (strJ0.equals("VP9")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 2194728:
                if (strJ0.equals("H264")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 2194729:
                if (strJ0.equals("H265")) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 2433087:
                if (strJ0.equals("OPUS")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 2450119:
                if (strJ0.equals("PCMA")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 2450139:
                if (strJ0.equals("PCMU")) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 1061166827:
                if (strJ0.equals("MP4A-LATM")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 1934494802:
                if (strJ0.equals("AMR-WB")) {
                    b = com.umeng.analytics.pro.cw.k;
                } else {
                    b = -1;
                }
                break;
            case 1959269366:
                if (strJ0.equals("MP4V-ES")) {
                    b = com.umeng.analytics.pro.cw.l;
                } else {
                    b = -1;
                }
                break;
            case 2137188397:
                if (strJ0.equals("H263-1998")) {
                    b = com.umeng.analytics.pro.cw.m;
                } else {
                    b = -1;
                }
                break;
            case 2137209252:
                if (strJ0.equals("H263-2000")) {
                    b = com.umeng.analytics.pro.cw.n;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 12:
                str = MimeTypes.AUDIO_AAC;
                break;
            case 1:
            case 4:
                str = MimeTypes.AUDIO_RAW;
                break;
            case 2:
                str = MimeTypes.AUDIO_AC3;
                break;
            case 3:
                str = MimeTypes.AUDIO_AMR_NB;
                break;
            case 5:
                str = MimeTypes.VIDEO_VP8;
                break;
            case 6:
                str = MimeTypes.VIDEO_VP9;
                break;
            case 7:
                str = "video/avc";
                break;
            case 8:
                str = "video/hevc";
                break;
            case 9:
                str = MimeTypes.AUDIO_OPUS;
                break;
            case 10:
                str = MimeTypes.AUDIO_ALAW;
                break;
            case 11:
                str = MimeTypes.AUDIO_MLAW;
                break;
            case 13:
                str = MimeTypes.AUDIO_AMR_WB;
                break;
            case 14:
                str = MimeTypes.VIDEO_MP4V;
                break;
            case 15:
            case 16:
                str = MimeTypes.VIDEO_H263;
                break;
            default:
                throw new IllegalArgumentException(str4);
        }
        c4531rw2.k = str;
        boolean zEquals = "audio".equals(qn.f3600a);
        int i7 = pn.c;
        if (zEquals) {
            int i8 = pn.d;
            i8 = i8 == -1 ? str.equals(MimeTypes.AUDIO_AC3) ? 6 : 1 : i8;
            c4531rw2.y = i7;
            c4531rw2.x = i8;
            i = i8;
        } else {
            i = -1;
        }
        String str5 = (String) fc.get("fmtp");
        if (str5 == null) {
            c4405qYA = C4405qY.g;
            c4531rw = c4531rw2;
        } else {
            int i9 = Ug0.f3833a;
            String[] strArrSplit = str5.split(" ", 2);
            FW.i(strArrSplit.length == 2, str5);
            String[] strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
            EC ec = new EC(4);
            int length = strArrSplit2.length;
            int i10 = 0;
            while (i10 < length) {
                String[] strArr = strArrSplit2;
                String[] strArrSplit3 = strArrSplit2[i10].split("=", 2);
                ec.b(strArrSplit3[0], strArrSplit3[1]);
                i10++;
                length = length;
                strArrSplit2 = strArr;
                c4531rw2 = c4531rw2;
            }
            c4531rw = c4531rw2;
            c4405qYA = ec.a();
        }
        switch (str) {
            case "audio/mp4a-latm":
                i2 = i7;
                str2 = str4;
                int i11 = i;
                c4531rw = c4531rw;
                FW.h(i11 != -1);
                FW.i(!c4405qYA.isEmpty(), "missing attribute fmtp");
                if (str2.equals("MP4A-LATM")) {
                    FW.i(c4405qYA.containsKey("cpresent") && ((String) c4405qYA.get("cpresent")).equals("0"), "Only supports cpresent=0 in AAC audio.");
                    String str6 = (String) c4405qYA.get("config");
                    FW.p(str6, "AAC audio stream must include config fmtp parameter");
                    FW.i(str6.length() % 2 == 0, "Malformat MPEG4 config: ".concat(str6));
                    Uh0 uh0 = new Uh0(Ug0.q(str6), 2, (Object) null);
                    z = true;
                    FW.i(uh0.i(1) == 0, "Only supports audio mux version 0.");
                    FW.i(uh0.i(1) == 1, "Only supports allStreamsSameTimeFraming.");
                    uh0.s(6);
                    FW.i(uh0.i(4) == 0, "Only supports one program.");
                    FW.i(uh0.i(3) == 0, "Only supports one numLayer.");
                    try {
                        C3129c c3129cA0 = AbstractC2845Vx.a0(uh0, false);
                        c4531rw.g(c3129cA0.b);
                        c4531rw.b(c3129cA0.c);
                        c4531rw.c(c3129cA0.f4197a);
                    } catch (KT e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    z = true;
                }
                FW.i(c4405qYA.containsKey("profile-level-id"), "missing profile-level-id param");
                String str7 = (String) c4405qYA.get("profile-level-id");
                str7.getClass();
                c4531rw.h = "mp4a.40.".concat(str7);
                c4531rw.m = AC.p(AbstractC2845Vx.L(i2, i11));
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i12 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "audio/3gpp":
            case "audio/amr-wb":
                i2 = i7;
                str2 = str4;
                c4531rw = c4531rw;
                FW.i(i == 1, "Multi channel AMR is not currently supported.");
                FW.i(!c4405qYA.isEmpty(), "fmtp parameters must include octet-align.");
                FW.i(c4405qYA.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                FW.i(!c4405qYA.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i13 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "audio/opus":
                str2 = str4;
                c4531rw = c4531rw;
                FW.h(i != -1);
                i2 = i7;
                FW.i(i2 == 48000, "Invalid OPUS clock rate.");
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i14 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/mp4v-es":
                str2 = str4;
                c4531rw = c4531rw;
                FW.h(!c4405qYA.isEmpty());
                String str8 = (String) c4405qYA.get("config");
                if (str8 != null) {
                    byte[] bArrQ = Ug0.q(str8);
                    c4531rw.m = AC.p(bArrQ);
                    JT jt = new JT(bArrQ);
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 3;
                        if (i16 >= bArrQ.length) {
                            i3 = 2;
                            z2 = false;
                        } else if (jt.v() == 1 && (bArrQ[i16] & 240) == 32) {
                            z2 = true;
                            i3 = 2;
                        } else {
                            jt.E(jt.b - 2);
                            i15++;
                        }
                    }
                    FW.i(z2, "Invalid input: VOL not found.");
                    Uh0 uh1 = new Uh0(bArrQ, i3, (Object) null);
                    uh1.s((i15 + 4) * 8);
                    uh1.s(1);
                    uh1.s(8);
                    if (uh1.h()) {
                        uh1.s(4);
                        uh1.s(3);
                    }
                    if (uh1.i(4) == 15) {
                        uh1.s(8);
                        uh1.s(8);
                    }
                    if (uh1.h()) {
                        i4 = 2;
                        uh1.s(2);
                        uh1.s(1);
                        if (uh1.h()) {
                            uh1.s(79);
                        }
                    } else {
                        i4 = 2;
                    }
                    FW.i(uh1.i(i4) == 0, "Only supports rectangular video object layer shape.");
                    FW.h(uh1.h());
                    int i17 = uh1.i(16);
                    FW.h(uh1.h());
                    if (uh1.h()) {
                        FW.h(i17 > 0);
                        int i18 = 0;
                        for (int i19 = i17 - 1; i19 > 0; i19 >>= 1) {
                            i18++;
                        }
                        uh1.s(i18);
                    }
                    FW.h(uh1.h());
                    int i20 = uh1.i(13);
                    FW.h(uh1.h());
                    int i21 = uh1.i(13);
                    FW.h(uh1.h());
                    uh1.s(1);
                    Pair pairCreate = Pair.create(Integer.valueOf(i20), Integer.valueOf(i21));
                    c4531rw.p = ((Integer) pairCreate.first).intValue();
                    c4531rw.q = ((Integer) pairCreate.second).intValue();
                } else {
                    c4531rw.p = 352;
                    c4531rw.q = 288;
                }
                String str9 = (String) c4405qYA.get("profile-level-id");
                c4531rw.h = "mp4v.".concat(str9 == null ? "1" : str9);
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i110 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/3gpp":
                str2 = str4;
                c4531rw = c4531rw;
                c4531rw.h(352);
                c4531rw.d(288);
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i111 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/avc":
                str2 = str4;
                c4531rw = c4531rw;
                FW.i(!c4405qYA.isEmpty(), "missing attribute fmtp");
                FW.i(c4405qYA.containsKey("sprop-parameter-sets"), "missing sprop parameter");
                String str10 = (String) c4405qYA.get("sprop-parameter-sets");
                FW.o(str10);
                String[] strArrT = Ug0.T(str10, ",");
                FW.i(strArrT.length == 2, "empty sprop value");
                C3965lY c3965lYQ = AC.q(a(strArrT[0]), a(strArrT[1]));
                c4531rw.e(c3965lYQ);
                byte[] bArr = (byte[]) c3965lYQ.get(0);
                C5100yQ c5100yQD = AbstractC5188zQ.d(bArr, 4, bArr.length);
                c4531rw.f(c5100yQD.g);
                c4531rw.d(c5100yQD.f);
                c4531rw.h(c5100yQD.e);
                String str11 = (String) c4405qYA.get("profile-level-id");
                if (str11 != null) {
                    c4531rw.c("avc1.".concat(str11));
                } else {
                    c4531rw.c(FW.d(c5100yQD.f5275a, c5100yQD.b, c5100yQD.c));
                }
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i112 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/hevc":
                str2 = str4;
                c4531rw = c4531rw;
                FW.i(!c4405qYA.isEmpty(), "missing attribute fmtp");
                if (c4405qYA.containsKey("sprop-max-don-diff")) {
                    String str12 = (String) c4405qYA.get("sprop-max-don-diff");
                    FW.o(str12);
                    int i22 = Integer.parseInt(str12);
                    FW.i(i22 == 0, "non-zero sprop-max-don-diff " + i22 + " is not supported");
                }
                FW.i(c4405qYA.containsKey("sprop-vps"), "missing sprop-vps parameter");
                String str13 = (String) c4405qYA.get("sprop-vps");
                FW.o(str13);
                FW.i(c4405qYA.containsKey("sprop-sps"), "missing sprop-sps parameter");
                String str14 = (String) c4405qYA.get("sprop-sps");
                FW.o(str14);
                FW.i(c4405qYA.containsKey("sprop-pps"), "missing sprop-pps parameter");
                String str15 = (String) c4405qYA.get("sprop-pps");
                FW.o(str15);
                C3965lY c3965lYR = AC.r(a(str13), a(str14), a(str15));
                c4531rw.e(c3965lYR);
                byte[] bArr2 = (byte[]) c3965lYR.get(1);
                C4924wQ c4924wQC = AbstractC5188zQ.c(bArr2, 4, bArr2.length);
                c4531rw.f(c4924wQC.i);
                c4531rw.d(c4924wQC.h);
                c4531rw.h(c4924wQC.g);
                c4531rw.c(FW.e(c4924wQC.f5178a, c4924wQC.b, c4924wQC.c, c4924wQC.d, c4924wQC.e, c4924wQC.f));
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i113 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/x-vnd.on2.vp8":
                str2 = str4;
                c4531rw = c4531rw;
                c4531rw.p = EnumC4719u30.WEBVIEW_ERROR_VALUE;
                c4531rw.q = PsExtractor.VIDEO_STREAM_MASK;
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i114 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "video/x-vnd.on2.vp9":
                str2 = str4;
                c4531rw = c4531rw;
                c4531rw.p = EnumC4719u30.WEBVIEW_ERROR_VALUE;
                c4531rw.q = PsExtractor.VIDEO_STREAM_MASK;
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i115 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "audio/raw":
                str2 = str4;
                FW.h(str2.equals("L8") || str2.equals("L16"));
                c4531rw.z = str2.equals("L8") ? 3 : 268435456;
                i2 = i7;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i116 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
            case "audio/g711-mlaw":
            case "audio/ac3":
            case "audio/g711-alaw":
            default:
                i2 = i7;
                str2 = str4;
                c4531rw = c4531rw;
                z = true;
                FW.h(i2 <= 0 ? false : z);
                this.f4104a = new J00(c4531rw.a(), i6, i2, c4405qYA, str2);
                str3 = (String) fc.get("control");
                int i117 = Ug0.f3833a;
                uri2 = Uri.parse(str3);
                if (uri2.isAbsolute()) {
                    uriBuild = uri2;
                } else if (str3.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    uriBuild = uri;
                } else {
                    uriBuild = uri.buildUpon().appendEncodedPath(str3).build();
                }
                this.b = uriBuild;
                return;
        }
    }

    public static byte[] a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(AbstractC5188zQ.f5325a, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2956a10.class != obj.getClass()) {
            return false;
        }
        C2956a10 c2956a10 = (C2956a10) obj;
        return this.f4104a.equals(c2956a10.f4104a) && this.b.equals(c2956a10.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f4104a.hashCode() + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE) * 31);
    }
}
