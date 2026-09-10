package b2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.internal.ads.h51;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import oa.n1;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f5243b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x019b  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e7 A[LOOP:2: B:114:0x01e5->B:115:0x01e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0220  */
    /* JADX WARN: Code duplicated, block: B:121:0x0225  */
    /* JADX WARN: Code duplicated, block: B:122:0x022a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0230  */
    /* JADX WARN: Code duplicated, block: B:125:0x0236  */
    /* JADX WARN: Code duplicated, block: B:126:0x0238 A[PHI: r1
  0x0238: PHI (r1v9 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String), (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:125:0x0236, B:217:0x0490, B:215:0x047c, B:214:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x0239 A[PHI: r0 r1
  0x0239: PHI (r0v33 boolean) = (r0v3 boolean), (r0v6 boolean), (r0v34 boolean) binds: [B:269:0x0591, B:267:0x0567, B:126:0x0238] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:269:0x0591, B:267:0x0567, B:126:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x023c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0244  */
    /* JADX WARN: Code duplicated, block: B:131:0x0249  */
    /* JADX WARN: Code duplicated, block: B:133:0x024f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0252  */
    /* JADX WARN: Code duplicated, block: B:136:0x0254  */
    /* JADX WARN: Code duplicated, block: B:139:0x025d  */
    /* JADX WARN: Code duplicated, block: B:140:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266  */
    /* JADX WARN: Code duplicated, block: B:144:0x026c  */
    /* JADX WARN: Code duplicated, block: B:145:0x026f A[PHI: r0 r1
  0x026f: PHI (r0v96 boolean) = (r0v3 boolean), (r0v98 boolean) binds: [B:269:0x0591, B:144:0x026c] A[DONT_GENERATE, DONT_INLINE]
  0x026f: PHI (r1v46 java.lang.String) = (r1v4 java.lang.String), (r1v47 java.lang.String) binds: [B:269:0x0591, B:144:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0272  */
    /* JADX WARN: Code duplicated, block: B:148:0x0278  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x0301  */
    /* JADX WARN: Code duplicated, block: B:156:0x030f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0315  */
    /* JADX WARN: Code duplicated, block: B:160:0x032a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0341  */
    /* JADX WARN: Code duplicated, block: B:165:0x0348  */
    /* JADX WARN: Code duplicated, block: B:173:0x0380  */
    /* JADX WARN: Code duplicated, block: B:176:0x038f  */
    /* JADX WARN: Code duplicated, block: B:179:0x039c  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03da  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e5 A[LOOP:1: B:192:0x03e3->B:193:0x03e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x0431  */
    /* JADX WARN: Code duplicated, block: B:199:0x0441  */
    /* JADX WARN: Code duplicated, block: B:201:0x044d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0455  */
    /* JADX WARN: Code duplicated, block: B:205:0x045f  */
    /* JADX WARN: Code duplicated, block: B:209:0x046a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0474  */
    /* JADX WARN: Code duplicated, block: B:213:0x0476  */
    /* JADX WARN: Code duplicated, block: B:215:0x047c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0486  */
    /* JADX WARN: Code duplicated, block: B:218:0x0492  */
    /* JADX WARN: Code duplicated, block: B:220:0x0495  */
    /* JADX WARN: Code duplicated, block: B:221:0x0497  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:229:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:233:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:237:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:240:0x0508  */
    /* JADX WARN: Code duplicated, block: B:241:0x050a  */
    /* JADX WARN: Code duplicated, block: B:244:0x051b  */
    /* JADX WARN: Code duplicated, block: B:245:0x051d  */
    /* JADX WARN: Code duplicated, block: B:248:0x052a  */
    /* JADX WARN: Code duplicated, block: B:249:0x052c  */
    /* JADX WARN: Code duplicated, block: B:256:0x054b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0554  */
    /* JADX WARN: Code duplicated, block: B:263:0x055e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0566  */
    /* JADX WARN: Code duplicated, block: B:268:0x0588  */
    /* JADX WARN: Code duplicated, block: B:272:0x0597  */
    /* JADX WARN: Code duplicated, block: B:273:0x0599  */
    /* JADX WARN: Code duplicated, block: B:275:0x05c0 A[PHI: r0 r1 r6
  0x05c0: PHI (r0v95 boolean) = (r0v2 boolean), (r0v96 boolean) binds: [B:277:0x05cd, B:274:0x059a] A[DONT_GENERATE, DONT_INLINE]
  0x05c0: PHI (r1v45 java.lang.String) = (r1v3 java.lang.String), (r1v46 java.lang.String) binds: [B:277:0x05cd, B:274:0x059a] A[DONT_GENERATE, DONT_INLINE]
  0x05c0: PHI (r6v48 boolean) = (r6v39 boolean), (r6v49 boolean) binds: [B:277:0x05cd, B:274:0x059a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:278:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:280:0x05df  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:283:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:287:0x0684  */
    /* JADX WARN: Code duplicated, block: B:288:0x0697  */
    /* JADX WARN: Code duplicated, block: B:290:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:292:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:293:0x06af  */
    /* JADX WARN: Code duplicated, block: B:297:0x06db  */
    /* JADX WARN: Code duplicated, block: B:299:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:300:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:302:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:303:0x0707  */
    /* JADX WARN: Code duplicated, block: B:307:0x0712  */
    /* JADX WARN: Code duplicated, block: B:312:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0352 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    public c0(r rVar, c cVar, Uri uri) {
        String str;
        int i10;
        String str2;
        int i11;
        String str3;
        String[] strArrSplit;
        boolean z10;
        int i12;
        String[] strArrSplit2;
        p pVar;
        int length;
        char c4;
        s1 s1VarC;
        String str4;
        boolean z11;
        boolean z12;
        boolean z13;
        m1.h hVar;
        int i13;
        boolean z14;
        boolean z15;
        String str5;
        boolean z16;
        boolean z17;
        String str6;
        boolean z18;
        xd1 xd1Var;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i14;
        String str7;
        byte[] bArrU;
        l1.q qVar;
        int i15;
        int i16;
        boolean z24;
        xd1 xd1Var2;
        boolean z25;
        int i17;
        boolean z26;
        int i18;
        int i19;
        String[] strArrSplit3;
        boolean z27;
        m1.m mVarK;
        String str8;
        boolean z28;
        String str9;
        Uri uriBuild;
        boolean z29;
        boolean z30;
        boolean z31;
        int i20;
        oa.o0 o0Var = cVar.f5240i;
        go.k.h("missing attribute control", o0Var.containsKey("control"));
        i1.o oVar = new i1.o();
        int i21 = cVar.f5236e;
        b bVar = cVar.f5241j;
        if (i21 > 0) {
            oVar.f42596h = i21;
        }
        int i22 = bVar.f5220a;
        String str10 = bVar.f5221b;
        String strH = q1.H(str10);
        strH.getClass();
        switch (strH) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                str = MimeTypes.AUDIO_AAC;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str11 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr = strArrSplit2;
                        String[] strArrSplit4 = strArr[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit4[c4], strArrSplit4[1]);
                        i12++;
                        strArrSplit2 = strArr;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = uri;
                            } else {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str12 = (String) s1VarC.get("sprop-max-don-diff");
                                str12.getClass();
                                i13 = Integer.parseInt(str12);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str13 = (String) s1VarC.get("sprop-vps");
                            str13.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str14 = (String) s1VarC.get("sprop-sps");
                            str14.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str15 = (String) s1VarC.get("sprop-pps");
                            str15.getClass();
                            Object[] objArr = {a(str13), a(str14), a(str15)};
                            oa.q.b(3, objArr);
                            n1 n1VarT = oa.j0.t(3, objArr);
                            oVar.f42603p = n1VarT;
                            z12 = true;
                            byte[] bArr = (byte[]) n1VarT.get(1);
                            h51 h51VarI = m1.n.i(bArr, 4, bArr.length, null);
                            oVar.f42613z = h51VarI.f15174h;
                            oVar.f42608u = h51VarI.f15171e;
                            oVar.f42607t = h51VarI.f15170d;
                            oVar.C = new i1.h(h51VarI.f15176j, h51VarI.f15177k, h51VarI.l, h51VarI.f15168b + 8, h51VarI.f15169c + 8, null);
                            hVar = (m1.h) h51VarI.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent") || !((String) s1VarC.get("cpresent")).equals("0")) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU2 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU2, bArrU2.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                try {
                                    n2.a aVarS = n2.b.s(xd1Var, false);
                                    oVar.F = aVarS.f46421b;
                                    oVar.E = aVarS.f46422c;
                                    oVar.f42598j = aVarS.f46420a;
                                } catch (i1.e0 e10) {
                                    throw new IllegalArgumentException(e10);
                                }
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null && str4.equals("MP4A-LATM")) {
                                str5 = "30";
                            }
                            if (str5 != null || str5.isEmpty()) {
                                z16 = z11;
                            } else {
                                z16 = true;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (!str4.equals("L8") || str4.equals("L16")) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr2 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        z24 = false;
                                    } else if (qVar.C() == 1 || (bArrU[i16] & 240) != 32) {
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = true;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    for (i18 = i17 - 1; i18 > 0; i18 >>= 1) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i23 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i24 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate = Pair.create(Integer.valueOf(i23), Integer.valueOf(i24));
                                oVar.f42607t = ((Integer) pairCreate.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str16 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str16 == null ? "1" : str16);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str17 = (String) s1VarC.get("sprop-parameter-sets");
                            str17.getClass();
                            String str18 = l1.y.f44830a;
                            strArrSplit3 = str17.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC;
                            byte[] bArr3 = (byte[]) n1VarC.get(0);
                            mVarK = m1.n.k(bArr3, 4, bArr3.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "L8":
            case "L16":
                str = MimeTypes.AUDIO_RAW;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str19 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr2 = strArrSplit2;
                        String[] strArrSplit5 = strArr2[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit5[c4], strArrSplit5[1]);
                        i12++;
                        strArrSplit2 = strArr2;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str110 = (String) s1VarC.get("sprop-max-don-diff");
                                str110.getClass();
                                i13 = Integer.parseInt(str110);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str111 = (String) s1VarC.get("sprop-vps");
                            str111.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str112 = (String) s1VarC.get("sprop-sps");
                            str112.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str113 = (String) s1VarC.get("sprop-pps");
                            str113.getClass();
                            Object[] objArr2 = {a(str111), a(str112), a(str113)};
                            oa.q.b(3, objArr2);
                            n1 n1VarT2 = oa.j0.t(3, objArr2);
                            oVar.f42603p = n1VarT2;
                            z12 = true;
                            byte[] bArr4 = (byte[]) n1VarT2.get(1);
                            h51 h51VarI2 = m1.n.i(bArr4, 4, bArr4.length, null);
                            oVar.f42613z = h51VarI2.f15174h;
                            oVar.f42608u = h51VarI2.f15171e;
                            oVar.f42607t = h51VarI2.f15170d;
                            oVar.C = new i1.h(h51VarI2.f15176j, h51VarI2.f15177k, h51VarI2.l, h51VarI2.f15168b + 8, h51VarI2.f15169c + 8, null);
                            hVar = (m1.h) h51VarI2.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU3 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU3, bArrU3.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS2 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS2.f46421b;
                                oVar.E = aVarS2.f46422c;
                                oVar.f42598j = aVarS2.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr5 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i25 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i26 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate2 = Pair.create(Integer.valueOf(i25), Integer.valueOf(i26));
                                oVar.f42607t = ((Integer) pairCreate2.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate2.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str114 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str114 == null ? "1" : str114);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str115 = (String) s1VarC.get("sprop-parameter-sets");
                            str115.getClass();
                            String str116 = l1.y.f44830a;
                            strArrSplit3 = str115.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC2 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC2;
                            byte[] bArr6 = (byte[]) n1VarC2.get(0);
                            mVarK = m1.n.k(bArr6, 4, bArr6.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "AC3":
                str = MimeTypes.AUDIO_AC3;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str117 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr3 = strArrSplit2;
                        String[] strArrSplit6 = strArr3[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit6[c4], strArrSplit6[1]);
                        i12++;
                        strArrSplit2 = strArr3;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str118 = (String) s1VarC.get("sprop-max-don-diff");
                                str118.getClass();
                                i13 = Integer.parseInt(str118);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str119 = (String) s1VarC.get("sprop-vps");
                            str119.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str1110 = (String) s1VarC.get("sprop-sps");
                            str1110.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str1111 = (String) s1VarC.get("sprop-pps");
                            str1111.getClass();
                            Object[] objArr3 = {a(str119), a(str1110), a(str1111)};
                            oa.q.b(3, objArr3);
                            n1 n1VarT3 = oa.j0.t(3, objArr3);
                            oVar.f42603p = n1VarT3;
                            z12 = true;
                            byte[] bArr7 = (byte[]) n1VarT3.get(1);
                            h51 h51VarI3 = m1.n.i(bArr7, 4, bArr7.length, null);
                            oVar.f42613z = h51VarI3.f15174h;
                            oVar.f42608u = h51VarI3.f15171e;
                            oVar.f42607t = h51VarI3.f15170d;
                            oVar.C = new i1.h(h51VarI3.f15176j, h51VarI3.f15177k, h51VarI3.l, h51VarI3.f15168b + 8, h51VarI3.f15169c + 8, null);
                            hVar = (m1.h) h51VarI3.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU4 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU4, bArrU4.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS3 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS3.f46421b;
                                oVar.E = aVarS3.f46422c;
                                oVar.f42598j = aVarS3.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr8 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i27 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i28 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate3 = Pair.create(Integer.valueOf(i27), Integer.valueOf(i28));
                                oVar.f42607t = ((Integer) pairCreate3.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate3.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str1112 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str1112 == null ? "1" : str1112);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str1113 = (String) s1VarC.get("sprop-parameter-sets");
                            str1113.getClass();
                            String str1114 = l1.y.f44830a;
                            strArrSplit3 = str1113.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC3 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC3;
                            byte[] bArr9 = (byte[]) n1VarC3.get(0);
                            mVarK = m1.n.k(bArr9, 4, bArr9.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "AMR":
                str = MimeTypes.AUDIO_AMR_NB;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str1115 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr4 = strArrSplit2;
                        String[] strArrSplit7 = strArr4[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit7[c4], strArrSplit7[1]);
                        i12++;
                        strArrSplit2 = strArr4;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str1116 = (String) s1VarC.get("sprop-max-don-diff");
                                str1116.getClass();
                                i13 = Integer.parseInt(str1116);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str1117 = (String) s1VarC.get("sprop-vps");
                            str1117.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str1118 = (String) s1VarC.get("sprop-sps");
                            str1118.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str1119 = (String) s1VarC.get("sprop-pps");
                            str1119.getClass();
                            Object[] objArr4 = {a(str1117), a(str1118), a(str1119)};
                            oa.q.b(3, objArr4);
                            n1 n1VarT4 = oa.j0.t(3, objArr4);
                            oVar.f42603p = n1VarT4;
                            z12 = true;
                            byte[] bArr10 = (byte[]) n1VarT4.get(1);
                            h51 h51VarI4 = m1.n.i(bArr10, 4, bArr10.length, null);
                            oVar.f42613z = h51VarI4.f15174h;
                            oVar.f42608u = h51VarI4.f15171e;
                            oVar.f42607t = h51VarI4.f15170d;
                            oVar.C = new i1.h(h51VarI4.f15176j, h51VarI4.f15177k, h51VarI4.l, h51VarI4.f15168b + 8, h51VarI4.f15169c + 8, null);
                            hVar = (m1.h) h51VarI4.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU5 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU5, bArrU5.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS4 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS4.f46421b;
                                oVar.E = aVarS4.f46422c;
                                oVar.f42598j = aVarS4.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr11 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i29 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i210 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate4 = Pair.create(Integer.valueOf(i29), Integer.valueOf(i210));
                                oVar.f42607t = ((Integer) pairCreate4.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate4.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str11110 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str11110 == null ? "1" : str11110);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str11111 = (String) s1VarC.get("sprop-parameter-sets");
                            str11111.getClass();
                            String str11112 = l1.y.f44830a;
                            strArrSplit3 = str11111.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC4 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC4;
                            byte[] bArr12 = (byte[]) n1VarC4.get(0);
                            mVarK = m1.n.k(bArr12, 4, bArr12.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "VP8":
                str = MimeTypes.VIDEO_VP8;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str11113 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr5 = strArrSplit2;
                        String[] strArrSplit8 = strArr5[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit8[c4], strArrSplit8[1]);
                        i12++;
                        strArrSplit2 = strArr5;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str11114 = (String) s1VarC.get("sprop-max-don-diff");
                                str11114.getClass();
                                i13 = Integer.parseInt(str11114);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str11115 = (String) s1VarC.get("sprop-vps");
                            str11115.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str11116 = (String) s1VarC.get("sprop-sps");
                            str11116.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str11117 = (String) s1VarC.get("sprop-pps");
                            str11117.getClass();
                            Object[] objArr5 = {a(str11115), a(str11116), a(str11117)};
                            oa.q.b(3, objArr5);
                            n1 n1VarT5 = oa.j0.t(3, objArr5);
                            oVar.f42603p = n1VarT5;
                            z12 = true;
                            byte[] bArr13 = (byte[]) n1VarT5.get(1);
                            h51 h51VarI5 = m1.n.i(bArr13, 4, bArr13.length, null);
                            oVar.f42613z = h51VarI5.f15174h;
                            oVar.f42608u = h51VarI5.f15171e;
                            oVar.f42607t = h51VarI5.f15170d;
                            oVar.C = new i1.h(h51VarI5.f15176j, h51VarI5.f15177k, h51VarI5.l, h51VarI5.f15168b + 8, h51VarI5.f15169c + 8, null);
                            hVar = (m1.h) h51VarI5.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU6 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU6, bArrU6.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS5 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS5.f46421b;
                                oVar.E = aVarS5.f46422c;
                                oVar.f42598j = aVarS5.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr14 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i211 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i212 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate5 = Pair.create(Integer.valueOf(i211), Integer.valueOf(i212));
                                oVar.f42607t = ((Integer) pairCreate5.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate5.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str11118 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str11118 == null ? "1" : str11118);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str11119 = (String) s1VarC.get("sprop-parameter-sets");
                            str11119.getClass();
                            String str111110 = l1.y.f44830a;
                            strArrSplit3 = str11119.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC5 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC5;
                            byte[] bArr15 = (byte[]) n1VarC5.get(0);
                            mVarK = m1.n.k(bArr15, 4, bArr15.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "VP9":
                str = MimeTypes.VIDEO_VP9;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str111111 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr6 = strArrSplit2;
                        String[] strArrSplit9 = strArr6[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit9[c4], strArrSplit9[1]);
                        i12++;
                        strArrSplit2 = strArr6;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str111112 = (String) s1VarC.get("sprop-max-don-diff");
                                str111112.getClass();
                                i13 = Integer.parseInt(str111112);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str111113 = (String) s1VarC.get("sprop-vps");
                            str111113.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str111114 = (String) s1VarC.get("sprop-sps");
                            str111114.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str111115 = (String) s1VarC.get("sprop-pps");
                            str111115.getClass();
                            Object[] objArr6 = {a(str111113), a(str111114), a(str111115)};
                            oa.q.b(3, objArr6);
                            n1 n1VarT6 = oa.j0.t(3, objArr6);
                            oVar.f42603p = n1VarT6;
                            z12 = true;
                            byte[] bArr16 = (byte[]) n1VarT6.get(1);
                            h51 h51VarI6 = m1.n.i(bArr16, 4, bArr16.length, null);
                            oVar.f42613z = h51VarI6.f15174h;
                            oVar.f42608u = h51VarI6.f15171e;
                            oVar.f42607t = h51VarI6.f15170d;
                            oVar.C = new i1.h(h51VarI6.f15176j, h51VarI6.f15177k, h51VarI6.l, h51VarI6.f15168b + 8, h51VarI6.f15169c + 8, null);
                            hVar = (m1.h) h51VarI6.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU7 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU7, bArrU7.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS6 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS6.f46421b;
                                oVar.E = aVarS6.f46422c;
                                oVar.f42598j = aVarS6.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr17 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i213 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i214 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate6 = Pair.create(Integer.valueOf(i213), Integer.valueOf(i214));
                                oVar.f42607t = ((Integer) pairCreate6.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate6.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str111116 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str111116 == null ? "1" : str111116);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str111117 = (String) s1VarC.get("sprop-parameter-sets");
                            str111117.getClass();
                            String str111118 = l1.y.f44830a;
                            strArrSplit3 = str111117.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC6 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC6;
                            byte[] bArr18 = (byte[]) n1VarC6.get(0);
                            mVarK = m1.n.k(bArr18, 4, bArr18.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "H264":
                str = "video/avc";
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str111119 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr7 = strArrSplit2;
                        String[] strArrSplit10 = strArr7[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit10[c4], strArrSplit10[1]);
                        i12++;
                        strArrSplit2 = strArr7;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str1111110 = (String) s1VarC.get("sprop-max-don-diff");
                                str1111110.getClass();
                                i13 = Integer.parseInt(str1111110);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str1111111 = (String) s1VarC.get("sprop-vps");
                            str1111111.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str1111112 = (String) s1VarC.get("sprop-sps");
                            str1111112.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str1111113 = (String) s1VarC.get("sprop-pps");
                            str1111113.getClass();
                            Object[] objArr7 = {a(str1111111), a(str1111112), a(str1111113)};
                            oa.q.b(3, objArr7);
                            n1 n1VarT7 = oa.j0.t(3, objArr7);
                            oVar.f42603p = n1VarT7;
                            z12 = true;
                            byte[] bArr19 = (byte[]) n1VarT7.get(1);
                            h51 h51VarI7 = m1.n.i(bArr19, 4, bArr19.length, null);
                            oVar.f42613z = h51VarI7.f15174h;
                            oVar.f42608u = h51VarI7.f15171e;
                            oVar.f42607t = h51VarI7.f15170d;
                            oVar.C = new i1.h(h51VarI7.f15176j, h51VarI7.f15177k, h51VarI7.l, h51VarI7.f15168b + 8, h51VarI7.f15169c + 8, null);
                            hVar = (m1.h) h51VarI7.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU8 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU8, bArrU8.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS7 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS7.f46421b;
                                oVar.E = aVarS7.f46422c;
                                oVar.f42598j = aVarS7.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr110 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i215 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i216 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate7 = Pair.create(Integer.valueOf(i215), Integer.valueOf(i216));
                                oVar.f42607t = ((Integer) pairCreate7.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate7.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str1111114 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str1111114 == null ? "1" : str1111114);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str1111115 = (String) s1VarC.get("sprop-parameter-sets");
                            str1111115.getClass();
                            String str1111116 = l1.y.f44830a;
                            strArrSplit3 = str1111115.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC7 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC7;
                            byte[] bArr111 = (byte[]) n1VarC7.get(0);
                            mVarK = m1.n.k(bArr111, 4, bArr111.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "H265":
                str = "video/hevc";
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str1111117 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr8 = strArrSplit2;
                        String[] strArrSplit11 = strArr8[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit11[c4], strArrSplit11[1]);
                        i12++;
                        strArrSplit2 = strArr8;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str1111118 = (String) s1VarC.get("sprop-max-don-diff");
                                str1111118.getClass();
                                i13 = Integer.parseInt(str1111118);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str1111119 = (String) s1VarC.get("sprop-vps");
                            str1111119.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str11111110 = (String) s1VarC.get("sprop-sps");
                            str11111110.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str11111111 = (String) s1VarC.get("sprop-pps");
                            str11111111.getClass();
                            Object[] objArr8 = {a(str1111119), a(str11111110), a(str11111111)};
                            oa.q.b(3, objArr8);
                            n1 n1VarT8 = oa.j0.t(3, objArr8);
                            oVar.f42603p = n1VarT8;
                            z12 = true;
                            byte[] bArr112 = (byte[]) n1VarT8.get(1);
                            h51 h51VarI8 = m1.n.i(bArr112, 4, bArr112.length, null);
                            oVar.f42613z = h51VarI8.f15174h;
                            oVar.f42608u = h51VarI8.f15171e;
                            oVar.f42607t = h51VarI8.f15170d;
                            oVar.C = new i1.h(h51VarI8.f15176j, h51VarI8.f15177k, h51VarI8.l, h51VarI8.f15168b + 8, h51VarI8.f15169c + 8, null);
                            hVar = (m1.h) h51VarI8.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU9 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU9, bArrU9.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS8 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS8.f46421b;
                                oVar.E = aVarS8.f46422c;
                                oVar.f42598j = aVarS8.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr113 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i217 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i218 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate8 = Pair.create(Integer.valueOf(i217), Integer.valueOf(i218));
                                oVar.f42607t = ((Integer) pairCreate8.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate8.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str11111112 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str11111112 == null ? "1" : str11111112);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str11111113 = (String) s1VarC.get("sprop-parameter-sets");
                            str11111113.getClass();
                            String str11111114 = l1.y.f44830a;
                            strArrSplit3 = str11111113.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC8 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC8;
                            byte[] bArr114 = (byte[]) n1VarC8.get(0);
                            mVarK = m1.n.k(bArr114, 4, bArr114.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "OPUS":
                str = MimeTypes.AUDIO_OPUS;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str11111115 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr9 = strArrSplit2;
                        String[] strArrSplit12 = strArr9[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit12[c4], strArrSplit12[1]);
                        i12++;
                        strArrSplit2 = strArr9;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str11111116 = (String) s1VarC.get("sprop-max-don-diff");
                                str11111116.getClass();
                                i13 = Integer.parseInt(str11111116);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str11111117 = (String) s1VarC.get("sprop-vps");
                            str11111117.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str11111118 = (String) s1VarC.get("sprop-sps");
                            str11111118.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str11111119 = (String) s1VarC.get("sprop-pps");
                            str11111119.getClass();
                            Object[] objArr9 = {a(str11111117), a(str11111118), a(str11111119)};
                            oa.q.b(3, objArr9);
                            n1 n1VarT9 = oa.j0.t(3, objArr9);
                            oVar.f42603p = n1VarT9;
                            z12 = true;
                            byte[] bArr115 = (byte[]) n1VarT9.get(1);
                            h51 h51VarI9 = m1.n.i(bArr115, 4, bArr115.length, null);
                            oVar.f42613z = h51VarI9.f15174h;
                            oVar.f42608u = h51VarI9.f15171e;
                            oVar.f42607t = h51VarI9.f15170d;
                            oVar.C = new i1.h(h51VarI9.f15176j, h51VarI9.f15177k, h51VarI9.l, h51VarI9.f15168b + 8, h51VarI9.f15169c + 8, null);
                            hVar = (m1.h) h51VarI9.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU10 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU10, bArrU10.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS9 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS9.f46421b;
                                oVar.E = aVarS9.f46422c;
                                oVar.f42598j = aVarS9.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr116 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i219 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i2110 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate9 = Pair.create(Integer.valueOf(i219), Integer.valueOf(i2110));
                                oVar.f42607t = ((Integer) pairCreate9.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate9.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str111111110 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str111111110 == null ? "1" : str111111110);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str111111111 = (String) s1VarC.get("sprop-parameter-sets");
                            str111111111.getClass();
                            String str111111112 = l1.y.f44830a;
                            strArrSplit3 = str111111111.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC9 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC9;
                            byte[] bArr117 = (byte[]) n1VarC9.get(0);
                            mVarK = m1.n.k(bArr117, 4, bArr117.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "PCMA":
                str = MimeTypes.AUDIO_ALAW;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str111111113 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr10 = strArrSplit2;
                        String[] strArrSplit13 = strArr10[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit13[c4], strArrSplit13[1]);
                        i12++;
                        strArrSplit2 = strArr10;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str111111114 = (String) s1VarC.get("sprop-max-don-diff");
                                str111111114.getClass();
                                i13 = Integer.parseInt(str111111114);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str111111115 = (String) s1VarC.get("sprop-vps");
                            str111111115.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str111111116 = (String) s1VarC.get("sprop-sps");
                            str111111116.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str111111117 = (String) s1VarC.get("sprop-pps");
                            str111111117.getClass();
                            Object[] objArr10 = {a(str111111115), a(str111111116), a(str111111117)};
                            oa.q.b(3, objArr10);
                            n1 n1VarT10 = oa.j0.t(3, objArr10);
                            oVar.f42603p = n1VarT10;
                            z12 = true;
                            byte[] bArr118 = (byte[]) n1VarT10.get(1);
                            h51 h51VarI10 = m1.n.i(bArr118, 4, bArr118.length, null);
                            oVar.f42613z = h51VarI10.f15174h;
                            oVar.f42608u = h51VarI10.f15171e;
                            oVar.f42607t = h51VarI10.f15170d;
                            oVar.C = new i1.h(h51VarI10.f15176j, h51VarI10.f15177k, h51VarI10.l, h51VarI10.f15168b + 8, h51VarI10.f15169c + 8, null);
                            hVar = (m1.h) h51VarI10.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU11 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU11, bArrU11.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS10 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS10.f46421b;
                                oVar.E = aVarS10.f46422c;
                                oVar.f42598j = aVarS10.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr119 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i2111 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i2112 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate10 = Pair.create(Integer.valueOf(i2111), Integer.valueOf(i2112));
                                oVar.f42607t = ((Integer) pairCreate10.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate10.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str111111118 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str111111118 == null ? "1" : str111111118);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str111111119 = (String) s1VarC.get("sprop-parameter-sets");
                            str111111119.getClass();
                            String str1111111110 = l1.y.f44830a;
                            strArrSplit3 = str111111119.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC10 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC10;
                            byte[] bArr1110 = (byte[]) n1VarC10.get(0);
                            mVarK = m1.n.k(bArr1110, 4, bArr1110.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "PCMU":
                str = MimeTypes.AUDIO_MLAW;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str1111111111 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr11 = strArrSplit2;
                        String[] strArrSplit14 = strArr11[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit14[c4], strArrSplit14[1]);
                        i12++;
                        strArrSplit2 = strArr11;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str1111111112 = (String) s1VarC.get("sprop-max-don-diff");
                                str1111111112.getClass();
                                i13 = Integer.parseInt(str1111111112);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str1111111113 = (String) s1VarC.get("sprop-vps");
                            str1111111113.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str1111111114 = (String) s1VarC.get("sprop-sps");
                            str1111111114.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str1111111115 = (String) s1VarC.get("sprop-pps");
                            str1111111115.getClass();
                            Object[] objArr11 = {a(str1111111113), a(str1111111114), a(str1111111115)};
                            oa.q.b(3, objArr11);
                            n1 n1VarT11 = oa.j0.t(3, objArr11);
                            oVar.f42603p = n1VarT11;
                            z12 = true;
                            byte[] bArr1111 = (byte[]) n1VarT11.get(1);
                            h51 h51VarI11 = m1.n.i(bArr1111, 4, bArr1111.length, null);
                            oVar.f42613z = h51VarI11.f15174h;
                            oVar.f42608u = h51VarI11.f15171e;
                            oVar.f42607t = h51VarI11.f15170d;
                            oVar.C = new i1.h(h51VarI11.f15176j, h51VarI11.f15177k, h51VarI11.l, h51VarI11.f15168b + 8, h51VarI11.f15169c + 8, null);
                            hVar = (m1.h) h51VarI11.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU12 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU12, bArrU12.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS11 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS11.f46421b;
                                oVar.E = aVarS11.f46422c;
                                oVar.f42598j = aVarS11.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr1112 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i2113 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i2114 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate11 = Pair.create(Integer.valueOf(i2113), Integer.valueOf(i2114));
                                oVar.f42607t = ((Integer) pairCreate11.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate11.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str1111111116 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str1111111116 == null ? "1" : str1111111116);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str1111111117 = (String) s1VarC.get("sprop-parameter-sets");
                            str1111111117.getClass();
                            String str1111111118 = l1.y.f44830a;
                            strArrSplit3 = str1111111117.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC11 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC11;
                            byte[] bArr1113 = (byte[]) n1VarC11.get(0);
                            mVarK = m1.n.k(bArr1113, 4, bArr1113.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "AMR-WB":
                str = MimeTypes.AUDIO_AMR_WB;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str1111111119 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr12 = strArrSplit2;
                        String[] strArrSplit15 = strArr12[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit15[c4], strArrSplit15[1]);
                        i12++;
                        strArrSplit2 = strArr12;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str11111111110 = (String) s1VarC.get("sprop-max-don-diff");
                                str11111111110.getClass();
                                i13 = Integer.parseInt(str11111111110);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str11111111111 = (String) s1VarC.get("sprop-vps");
                            str11111111111.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str11111111112 = (String) s1VarC.get("sprop-sps");
                            str11111111112.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str11111111113 = (String) s1VarC.get("sprop-pps");
                            str11111111113.getClass();
                            Object[] objArr12 = {a(str11111111111), a(str11111111112), a(str11111111113)};
                            oa.q.b(3, objArr12);
                            n1 n1VarT12 = oa.j0.t(3, objArr12);
                            oVar.f42603p = n1VarT12;
                            z12 = true;
                            byte[] bArr1114 = (byte[]) n1VarT12.get(1);
                            h51 h51VarI12 = m1.n.i(bArr1114, 4, bArr1114.length, null);
                            oVar.f42613z = h51VarI12.f15174h;
                            oVar.f42608u = h51VarI12.f15171e;
                            oVar.f42607t = h51VarI12.f15170d;
                            oVar.C = new i1.h(h51VarI12.f15176j, h51VarI12.f15177k, h51VarI12.l, h51VarI12.f15168b + 8, h51VarI12.f15169c + 8, null);
                            hVar = (m1.h) h51VarI12.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU13 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU13, bArrU13.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS12 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS12.f46421b;
                                oVar.E = aVarS12.f46422c;
                                oVar.f42598j = aVarS12.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr1115 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i2115 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i2116 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate12 = Pair.create(Integer.valueOf(i2115), Integer.valueOf(i2116));
                                oVar.f42607t = ((Integer) pairCreate12.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate12.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str11111111114 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str11111111114 == null ? "1" : str11111111114);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str11111111115 = (String) s1VarC.get("sprop-parameter-sets");
                            str11111111115.getClass();
                            String str11111111116 = l1.y.f44830a;
                            strArrSplit3 = str11111111115.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC12 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC12;
                            byte[] bArr1116 = (byte[]) n1VarC12.get(0);
                            mVarK = m1.n.k(bArr1116, 4, bArr1116.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "MP4V-ES":
                str = MimeTypes.VIDEO_MP4V;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str11111111117 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr13 = strArrSplit2;
                        String[] strArrSplit16 = strArr13[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit16[c4], strArrSplit16[1]);
                        i12++;
                        strArrSplit2 = strArr13;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str11111111118 = (String) s1VarC.get("sprop-max-don-diff");
                                str11111111118.getClass();
                                i13 = Integer.parseInt(str11111111118);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str11111111119 = (String) s1VarC.get("sprop-vps");
                            str11111111119.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str111111111110 = (String) s1VarC.get("sprop-sps");
                            str111111111110.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str111111111111 = (String) s1VarC.get("sprop-pps");
                            str111111111111.getClass();
                            Object[] objArr13 = {a(str11111111119), a(str111111111110), a(str111111111111)};
                            oa.q.b(3, objArr13);
                            n1 n1VarT13 = oa.j0.t(3, objArr13);
                            oVar.f42603p = n1VarT13;
                            z12 = true;
                            byte[] bArr1117 = (byte[]) n1VarT13.get(1);
                            h51 h51VarI13 = m1.n.i(bArr1117, 4, bArr1117.length, null);
                            oVar.f42613z = h51VarI13.f15174h;
                            oVar.f42608u = h51VarI13.f15171e;
                            oVar.f42607t = h51VarI13.f15170d;
                            oVar.C = new i1.h(h51VarI13.f15176j, h51VarI13.f15177k, h51VarI13.l, h51VarI13.f15168b + 8, h51VarI13.f15169c + 8, null);
                            hVar = (m1.h) h51VarI13.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU14 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU14, bArrU14.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS13 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS13.f46421b;
                                oVar.E = aVarS13.f46422c;
                                oVar.f42598j = aVarS13.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr1118 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i2117 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i2118 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate13 = Pair.create(Integer.valueOf(i2117), Integer.valueOf(i2118));
                                oVar.f42607t = ((Integer) pairCreate13.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate13.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str111111111112 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str111111111112 == null ? "1" : str111111111112);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str111111111113 = (String) s1VarC.get("sprop-parameter-sets");
                            str111111111113.getClass();
                            String str111111111114 = l1.y.f44830a;
                            strArrSplit3 = str111111111113.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC13 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC13;
                            byte[] bArr1119 = (byte[]) n1VarC13.get(0);
                            mVarK = m1.n.k(bArr1119, 4, bArr1119.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            case "H263-1998":
            case "H263-2000":
                str = MimeTypes.VIDEO_H263;
                oVar.f42600m = i1.d0.n(str);
                i10 = bVar.f5222c;
                if ("audio".equals(cVar.f5232a)) {
                    i20 = bVar.f5223d;
                    if (i20 != -1) {
                        i11 = i20;
                        str2 = str;
                    } else {
                        str2 = str;
                        if (str2.equals(MimeTypes.AUDIO_AC3)) {
                            i11 = 6;
                        } else {
                            i11 = 1;
                        }
                    }
                    oVar.F = i10;
                    oVar.E = i11;
                } else {
                    str2 = str;
                    i11 = -1;
                }
                str3 = (String) o0Var.get("fmtp");
                if (str3 == null) {
                    s1VarC = s1.f47307g;
                } else {
                    String str111111111115 = l1.y.f44830a;
                    strArrSplit = str3.split(" ", 2);
                    if (strArrSplit.length == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    go.k.h(str3, z10);
                    i12 = 0;
                    strArrSplit2 = strArrSplit[1].split(";\\s?", 0);
                    pVar = new p(4);
                    length = strArrSplit2.length;
                    c4 = 0;
                    while (i12 < length) {
                        String[] strArr14 = strArrSplit2;
                        String[] strArrSplit17 = strArr14[i12].split(X3.j.f27830b, 2);
                        pVar.l(strArrSplit17[c4], strArrSplit17[1]);
                        i12++;
                        strArrSplit2 = strArr14;
                        length = length;
                        c4 = 0;
                    }
                    s1VarC = pVar.c(true);
                }
                switch (str2.hashCode()) {
                    case -1664118616:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (str2.equals(MimeTypes.VIDEO_H263)) {
                            oVar.f42607t = 352;
                            oVar.f42608u = 288;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1662541442:
                        str4 = str10;
                        z11 = false;
                        z13 = true;
                        if (str2.equals("video/hevc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (s1VarC.containsKey("sprop-max-don-diff")) {
                                String str111111111116 = (String) s1VarC.get("sprop-max-don-diff");
                                str111111111116.getClass();
                                i13 = Integer.parseInt(str111111111116);
                                if (i13 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                go.k.e(i13, "non-zero sprop-max-don-diff %s is not supported", z14);
                            }
                            go.k.h("missing sprop-vps parameter", s1VarC.containsKey("sprop-vps"));
                            String str111111111117 = (String) s1VarC.get("sprop-vps");
                            str111111111117.getClass();
                            go.k.h("missing sprop-sps parameter", s1VarC.containsKey("sprop-sps"));
                            String str111111111118 = (String) s1VarC.get("sprop-sps");
                            str111111111118.getClass();
                            go.k.h("missing sprop-pps parameter", s1VarC.containsKey("sprop-pps"));
                            String str111111111119 = (String) s1VarC.get("sprop-pps");
                            str111111111119.getClass();
                            Object[] objArr14 = {a(str111111111117), a(str111111111118), a(str111111111119)};
                            oa.q.b(3, objArr14);
                            n1 n1VarT14 = oa.j0.t(3, objArr14);
                            oVar.f42603p = n1VarT14;
                            z12 = true;
                            byte[] bArr11110 = (byte[]) n1VarT14.get(1);
                            h51 h51VarI14 = m1.n.i(bArr11110, 4, bArr11110.length, null);
                            oVar.f42613z = h51VarI14.f15174h;
                            oVar.f42608u = h51VarI14.f15171e;
                            oVar.f42607t = h51VarI14.f15170d;
                            oVar.C = new i1.h(h51VarI14.f15176j, h51VarI14.f15177k, h51VarI14.l, h51VarI14.f15168b + 8, h51VarI14.f15169c + 8, null);
                            hVar = (m1.h) h51VarI14.f15178m;
                            if (hVar != null) {
                                oVar.f42598j = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -1606874997:
                        str4 = str10;
                        z11 = false;
                        if (str2.equals(MimeTypes.AUDIO_AMR_WB)) {
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                        } else {
                            z12 = true;
                        }
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case -53558318:
                        str4 = str10;
                        if (str2.equals(MimeTypes.AUDIO_AAC)) {
                            if (i11 != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            go.k.i(z15);
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            if (str4.equals("MP4A-LATM")) {
                                if (s1VarC.containsKey("cpresent")) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                go.k.h("Only supports cpresent=0 in AAC audio.", z17);
                                str6 = (String) s1VarC.get("config");
                                go.k.o(str6, "AAC audio stream must include config fmtp parameter");
                                if (str6.length() % 2 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                go.k.k(z18, "Malformat MPEG4 config: %s", str6);
                                byte[] bArrU15 = l1.y.u(str6);
                                xd1Var = new xd1(bArrU15, bArrU15.length);
                                if (xd1Var.i(1) == 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                go.k.h("Only supports audio mux version 0.", z19);
                                if (xd1Var.i(1) == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                go.k.h("Only supports allStreamsSameTimeFraming.", z20);
                                xd1Var.t(6);
                                if (xd1Var.i(4) == 0) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                go.k.h("Only supports one program.", z21);
                                if (xd1Var.i(3) == 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                go.k.h("Only supports one numLayer.", z22);
                                z11 = false;
                                n2.a aVarS14 = n2.b.s(xd1Var, false);
                                oVar.F = aVarS14.f46421b;
                                oVar.E = aVarS14.f46422c;
                                oVar.f42598j = aVarS14.f46420a;
                            } else {
                                z11 = false;
                            }
                            str5 = (String) s1VarC.get("profile-level-id");
                            if (str5 == null) {
                                str5 = "30";
                            }
                            if (str5 != null) {
                                z16 = z11;
                            } else {
                                z16 = z11;
                            }
                            go.k.h("missing profile-level-id param", z16);
                            oVar.f42598j = "mp4a.40." + str5;
                            oVar.f42603p = oa.j0.B(n2.b.a(i10, i11));
                        } else {
                            z11 = false;
                        }
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187078296:
                        str4 = str10;
                        str2.equals(MimeTypes.AUDIO_AC3);
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 187094639:
                        if (str2.equals(MimeTypes.AUDIO_RAW)) {
                            str4 = str10;
                            if (str4.equals("L8")) {
                                z23 = true;
                            } else {
                                z23 = true;
                            }
                            go.k.i(z23);
                            if (str4.equals("L8")) {
                                i14 = 3;
                            } else {
                                i14 = 268435456;
                            }
                            oVar.G = i14;
                        } else {
                            str4 = str10;
                        }
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1187890754:
                        if (str2.equals(MimeTypes.VIDEO_MP4V)) {
                            go.k.i(!s1VarC.isEmpty());
                            str7 = (String) s1VarC.get("config");
                            if (str7 != null) {
                                bArrU = l1.y.u(str7);
                                oVar.f42603p = oa.j0.B(bArrU);
                                byte[] bArr11111 = l1.c.f44778a;
                                qVar = new l1.q(bArrU);
                                i15 = 0;
                                while (true) {
                                    i16 = i15 + 3;
                                    if (i16 >= bArrU.length) {
                                        if (qVar.C() == 1) {
                                        }
                                        qVar.M(qVar.f44814b - 2);
                                        i15++;
                                    } else {
                                        z24 = false;
                                    }
                                }
                                go.k.h("Invalid input: VOL not found.", z24);
                                xd1Var2 = new xd1(bArrU, bArrU.length);
                                xd1Var2.t((i15 + 4) * 8);
                                xd1Var2.t(1);
                                xd1Var2.t(8);
                                if (xd1Var2.h()) {
                                    xd1Var2.t(4);
                                    xd1Var2.t(3);
                                }
                                if (xd1Var2.i(4) == 15) {
                                    xd1Var2.t(8);
                                    xd1Var2.t(8);
                                }
                                if (xd1Var2.h()) {
                                    xd1Var2.t(2);
                                    xd1Var2.t(1);
                                    if (xd1Var2.h()) {
                                        xd1Var2.t(79);
                                    }
                                }
                                if (xd1Var2.i(2) == 0) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                go.k.h("Only supports rectangular video object layer shape.", z25);
                                go.k.i(xd1Var2.h());
                                i17 = xd1Var2.i(16);
                                go.k.i(xd1Var2.h());
                                if (xd1Var2.h()) {
                                    if (i17 > 0) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    go.k.i(z26);
                                    i19 = 0;
                                    while (i18 > 0) {
                                        i19++;
                                    }
                                    xd1Var2.t(i19);
                                }
                                go.k.i(xd1Var2.h());
                                int i2119 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                int i21110 = xd1Var2.i(13);
                                go.k.i(xd1Var2.h());
                                xd1Var2.t(1);
                                Pair pairCreate14 = Pair.create(Integer.valueOf(i2119), Integer.valueOf(i21110));
                                oVar.f42607t = ((Integer) pairCreate14.first).intValue();
                                oVar.f42608u = ((Integer) pairCreate14.second).intValue();
                            } else {
                                oVar.f42607t = 352;
                                oVar.f42608u = 288;
                            }
                            String str1111111111110 = (String) s1VarC.get("profile-level-id");
                            oVar.f42598j = "mp4v.".concat(str1111111111110 == null ? "1" : str1111111111110);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1331836730:
                        if (str2.equals("video/avc")) {
                            go.k.h("missing attribute fmtp", !s1VarC.isEmpty());
                            go.k.h("missing sprop parameter", s1VarC.containsKey("sprop-parameter-sets"));
                            String str1111111111111 = (String) s1VarC.get("sprop-parameter-sets");
                            str1111111111111.getClass();
                            String str1111111111112 = l1.y.f44830a;
                            strArrSplit3 = str1111111111111.split(",", -1);
                            if (strArrSplit3.length == 2) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            go.k.h("empty sprop value", z27);
                            n1 n1VarC14 = oa.j0.C(a(strArrSplit3[0]), a(strArrSplit3[1]));
                            oVar.f42603p = n1VarC14;
                            byte[] bArr11112 = (byte[]) n1VarC14.get(0);
                            mVarK = m1.n.k(bArr11112, 4, bArr11112.length);
                            oVar.f42613z = mVarK.f45808g;
                            oVar.f42608u = mVarK.f45807f;
                            oVar.f42607t = mVarK.f45806e;
                            oVar.C = new i1.h(mVarK.f45816p, mVarK.f45817q, mVarK.f45818r, mVarK.f45809h + 8, mVarK.f45810i + 8, null);
                            str8 = (String) s1VarC.get("profile-level-id");
                            if (str8 != null) {
                                oVar.f42598j = "avc1.".concat(str8);
                            } else {
                                oVar.f42598j = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                            }
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1503095341:
                        if (str2.equals(MimeTypes.AUDIO_AMR_NB)) {
                            str4 = str10;
                            z11 = false;
                            z13 = true;
                            if (i11 == 1) {
                                z29 = true;
                            } else {
                                z29 = z11;
                            }
                            go.k.h("Multi channel AMR is not currently supported.", z29);
                            go.k.h("fmtp parameters must include octet-align.", !s1VarC.isEmpty());
                            go.k.h("Only octet aligned mode is currently supported.", s1VarC.containsKey("octet-align"));
                            go.k.h("Interleaving mode is not currently supported.", !s1VarC.containsKey("interleaving"));
                            z12 = z13;
                            if (i10 > 0) {
                                z28 = z12;
                            } else {
                                z28 = z11;
                            }
                            go.k.i(z28);
                            this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                            str9 = (String) o0Var.get("control");
                            uriBuild = Uri.parse(str9);
                            if (!uriBuild.isAbsolute()) {
                                if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Base"));
                                } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                    uriBuild = Uri.parse(rVar.b("Content-Location"));
                                } else {
                                    uriBuild = uri;
                                }
                                if (!str9.equals("*")) {
                                    uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                                }
                            }
                            this.f5243b = uriBuild;
                            return;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1504891608:
                        if (str2.equals(MimeTypes.AUDIO_OPUS)) {
                            if (i11 != -1) {
                                z30 = true;
                            } else {
                                z30 = false;
                            }
                            go.k.i(z30);
                            if (i10 == 48000) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            go.k.h("Invalid OPUS clock rate.", z31);
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127256:
                        if (str2.equals(MimeTypes.VIDEO_VP8)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1599127257:
                        if (str2.equals(MimeTypes.VIDEO_VP9)) {
                            oVar.f42607t = 320;
                            oVar.f42608u = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903231877:
                        str2.equals(MimeTypes.AUDIO_ALAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    case 1903589369:
                        str2.equals(MimeTypes.AUDIO_MLAW);
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                    default:
                        str4 = str10;
                        z11 = false;
                        z12 = true;
                        if (i10 > 0) {
                            z28 = z12;
                        } else {
                            z28 = z11;
                        }
                        go.k.i(z28);
                        this.f5242a = new m(new i1.p(oVar), i22, i10, s1VarC, str4);
                        str9 = (String) o0Var.get("control");
                        uriBuild = Uri.parse(str9);
                        if (!uriBuild.isAbsolute()) {
                            if (!TextUtils.isEmpty(rVar.b("Content-Base"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Base"));
                            } else if (TextUtils.isEmpty(rVar.b("Content-Location"))) {
                                uriBuild = Uri.parse(rVar.b("Content-Location"));
                            } else {
                                uriBuild = uri;
                            }
                            if (!str9.equals("*")) {
                                uriBuild = uriBuild.buildUpon().appendEncodedPath(str9).build();
                            }
                        }
                        this.f5243b = uriBuild;
                        return;
                }
            default:
                throw new IllegalArgumentException(str10);
        }
    }

    public static byte[] a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(m1.n.f45820a, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f5242a.equals(c0Var.f5242a) && this.f5243b.equals(c0Var.f5243b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5243b.hashCode() + ((this.f5242a.hashCode() + 217) * 31);
    }
}
