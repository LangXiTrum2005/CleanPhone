package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f23870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final di f23871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f23872h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Level f23874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f23875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final di f23876e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(eh.f23436a, uh.f24051a, vh.f24101a)));
        f23870f = setUnmodifiableSet;
        di diVar = new di(yg.a(setUnmodifiableSet));
        f23871g = diVar;
        f23872h = new o(Level.ALL, setUnmodifiableSet, diVar);
    }

    public /* synthetic */ q(String str, Level level, Set set, di diVar) {
        super(str);
        this.f23873b = h.c(str);
        this.f23874c = level;
        this.f23875d = set;
        this.f23876e = diVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:137:0x0240  */
    /* JADX WARN: Code duplicated, block: B:141:0x024c  */
    /* JADX WARN: Code duplicated, block: B:146:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x027a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0284  */
    /* JADX WARN: Code duplicated, block: B:157:0x0287  */
    /* JADX WARN: Code duplicated, block: B:163:0x0291  */
    /* JADX WARN: Code duplicated, block: B:168:0x029b  */
    /* JADX WARN: Code duplicated, block: B:170:0x029f  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0301  */
    /* JADX WARN: Code duplicated, block: B:199:0x0313  */
    /* JADX WARN: Code duplicated, block: B:202:0x0320  */
    /* JADX WARN: Code duplicated, block: B:205:0x033f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0343  */
    /* JADX WARN: Code duplicated, block: B:208:0x0347  */
    /* JADX WARN: Code duplicated, block: B:209:0x034d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0377  */
    /* JADX WARN: Code duplicated, block: B:219:0x0382  */
    /* JADX WARN: Code duplicated, block: B:221:0x038a A[LOOP:4: B:138:0x0242->B:221:0x038a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x03a2 A[LOOP:2: B:99:0x019d->B:228:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x03da  */
    /* JADX WARN: Code duplicated, block: B:255:0x0434  */
    /* JADX WARN: Code duplicated, block: B:257:0x043b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0442  */
    /* JADX WARN: Code duplicated, block: B:261:0x044c  */
    /* JADX WARN: Code duplicated, block: B:262:0x044f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0452  */
    /* JADX WARN: Code duplicated, block: B:266:0x0456  */
    /* JADX WARN: Code duplicated, block: B:269:0x0475  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:291:0x04be  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121 A[LOOP:1: B:63:0x00fd->B:69:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196  */
    public static void m(bh bhVar, String str, Level level, Set set, di diVar) {
        c giVar;
        StringBuilder sb2;
        ih ihVar;
        g gVar;
        c cVar;
        Level level2;
        boolean z10;
        Object[] objArr;
        StringBuilder sb3;
        yh yhVar;
        qg qgVar;
        boolean z11;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb4;
        b0 b0Var;
        String str4;
        int iG;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Level level3;
        int i17;
        char cCharAt;
        int i18;
        char c4;
        c cVar2;
        int i19;
        int i20;
        char cCharAt2;
        int i21;
        boolean z12;
        int i22;
        int i23;
        xh xhVar;
        int i24;
        char cCharAt3;
        StringBuilder sb5;
        String str5;
        String str6;
        int i25;
        xh xhVar2;
        int i26;
        char cCharAt4;
        char c5;
        int i27;
        wh whVar;
        int i28;
        int i29;
        x xVar;
        androidx.datastore.preferences.protobuf.m yVar;
        int i30;
        Object[] objArr3;
        int i31;
        Object obj;
        int i32;
        int i33;
        boolean z13;
        int i34;
        int i35;
        String string;
        h hVarC = bhVar.c();
        Level level4 = bhVar.f23325a;
        Boolean bool = (Boolean) hVarC.j(vh.f24101a);
        if (bool == null || !bool.booleanValue()) {
            ((i) d.f23368a).getClass();
            h hVarC2 = n.f23758b.c();
            h hVarC3 = bhVar.c();
            int iA = hVarC3.a();
            if (iA == 0) {
                giVar = c.f23334a;
            } else {
                giVar = iA <= 28 ? new gi(hVarC2, hVarC3) : new hi(hVarC2, hVarC3);
            }
            boolean z14 = level4.intValue() < level.intValue();
            if (z14) {
                sb2 = new StringBuilder();
                ihVar = bhVar.f23328d;
                if (ihVar != null) {
                    throw new IllegalStateException("cannot request log site information prior to postProcess()");
                }
                if (yg.e(2, ihVar, sb2)) {
                    sb2.append(" ");
                }
                if (z14) {
                    gVar = bhVar.f23330f;
                    if (gVar != null) {
                        if (gVar != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z11) {
                            throw new IllegalStateException("cannot get arguments unless a template context exists");
                        }
                        objArr2 = bhVar.f23331g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            throw new IllegalStateException("cannot get arguments before calling log()");
                        }
                        qgVar = new qg(gVar, objArr2, sb2);
                        sb4 = (StringBuilder) qgVar.f23909g;
                        g gVar2 = (g) qgVar.f23907e;
                        b0Var = gVar2.f23476a;
                        str4 = gVar2.f23477b;
                        b0Var.getClass();
                        iG = c0.g(0, str4);
                        i10 = -1;
                        i11 = 0;
                        while (true) {
                            i12 = 3;
                            if (iG < 0) {
                                cVar = giVar;
                                level2 = level4;
                                StringBuilder sb6 = sb2;
                                String str7 = str2;
                                String str8 = str3;
                                i13 = qgVar.f23904b;
                                if (((i13 + 1) & i13) == 0) {
                                }
                                throw new aa.b(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i13))), 10);
                            }
                            i14 = iG + 1;
                            i15 = i14;
                            i16 = 0;
                            while (true) {
                                level3 = level4;
                                if (i15 >= str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                i17 = i15 + 1;
                                cCharAt = str4.charAt(i15);
                                i18 = i15;
                                c4 = (char) (cCharAt - '0');
                                cVar2 = giVar;
                                if (c4 < '\n') {
                                    i35 = (i16 * 10) + c4;
                                    if (i35 >= 1000000) {
                                        throw aa.b.a(iG, i17, "index too large", str4);
                                    }
                                    i16 = i35;
                                    i15 = i17;
                                    level4 = level3;
                                    giVar = cVar2;
                                }
                            }
                            if (cCharAt != '$') {
                                i19 = -1;
                                if (cCharAt != '<') {
                                    i10 = i11;
                                    i11++;
                                } else {
                                    if (i10 == -1) {
                                        throw aa.b.a(iG, i17, "invalid relative parameter", str4);
                                    }
                                    if (i17 == str4.length()) {
                                        throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                    }
                                    str4.charAt(i17);
                                    i14 = i17;
                                    i17 = i18 + 2;
                                }
                            } else {
                                if (i18 - i14 == 0) {
                                    throw aa.b.a(iG, i17, "missing index", str4);
                                }
                                if (str4.charAt(i14) == '0') {
                                    throw aa.b.a(iG, i17, "index has leading zero", str4);
                                }
                                i34 = i16 - 1;
                                if (i17 == str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                str4.charAt(i17);
                                i14 = i17;
                                i10 = i34;
                                i19 = -1;
                                i17 = i18 + 2;
                            }
                            i20 = i17 + i19;
                            while (true) {
                                if (i20 >= str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                if (((char) ((str4.charAt(i20) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i20++;
                                i12 = 3;
                            }
                            cCharAt2 = str4.charAt(i20);
                            i21 = cCharAt2 & ' ';
                            if (i21 == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            xh xhVar3 = xh.f24157e;
                            if (i14 == i20) {
                                if (true != z12) {
                                    i22 = 0;
                                } else {
                                    i22 = 128;
                                }
                                while (true) {
                                    if (i14 == i20) {
                                        i23 = i21;
                                        xhVar = new xh(i22, -1, -1);
                                        sb5 = sb2;
                                        str5 = str2;
                                        str6 = str3;
                                        break;
                                    }
                                    i24 = i14 + 1;
                                    i23 = i21;
                                    cCharAt3 = str4.charAt(i14);
                                    sb5 = sb2;
                                    str5 = str2;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    str6 = str3;
                                    if (cCharAt3 > '9') {
                                        throw aa.b.b(i14, "invalid flag", str4);
                                    }
                                    i25 = cCharAt3 - '0';
                                    while (true) {
                                        if (i24 == i20) {
                                            xhVar2 = new xh(i22, i25, -1);
                                            break;
                                        }
                                        i26 = i24 + 1;
                                        cCharAt4 = str4.charAt(i24);
                                        if (cCharAt4 == '.') {
                                            xhVar2 = new xh(i22, i25, xh.e(i26, i20, str4));
                                            break;
                                        }
                                        c5 = (char) (cCharAt4 - '0');
                                        if (c5 >= '\n') {
                                            throw aa.b.b(i24, "invalid width character", str4);
                                        }
                                        i25 = (i25 * 10) + c5;
                                        if (i25 > 999999) {
                                            throw aa.b.a(i14, i20, "width too large", str4);
                                        }
                                        i24 = i26;
                                        i12 = 3;
                                    }
                                    xhVar = xhVar2;
                                    break;
                                    i22 |= i27;
                                    i14 = i24;
                                    str3 = str6;
                                    i21 = i23;
                                    sb2 = sb5;
                                    str2 = str5;
                                }
                            } else {
                                if (true != z12) {
                                    i22 = 0;
                                } else {
                                    i22 = 128;
                                }
                                while (true) {
                                    if (i14 == i20) {
                                        i23 = i21;
                                        xhVar = new xh(i22, -1, -1);
                                        sb5 = sb2;
                                        str5 = str2;
                                        str6 = str3;
                                        break;
                                    }
                                    i24 = i14 + 1;
                                    i23 = i21;
                                    cCharAt3 = str4.charAt(i14);
                                    sb5 = sb2;
                                    str5 = str2;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    str6 = str3;
                                    if (cCharAt3 > '9') {
                                        throw aa.b.b(i14, "invalid flag", str4);
                                    }
                                    i25 = cCharAt3 - '0';
                                    while (true) {
                                        if (i24 == i20) {
                                            xhVar2 = new xh(i22, i25, -1);
                                            break;
                                        }
                                        i26 = i24 + 1;
                                        cCharAt4 = str4.charAt(i24);
                                        if (cCharAt4 == '.') {
                                            xhVar2 = new xh(i22, i25, xh.e(i26, i20, str4));
                                            break;
                                        }
                                        c5 = (char) (cCharAt4 - '0');
                                        if (c5 >= '\n') {
                                            throw aa.b.b(i24, "invalid width character", str4);
                                        }
                                        i25 = (i25 * 10) + c5;
                                        if (i25 > 999999) {
                                            throw aa.b.a(i14, i20, "width too large", str4);
                                        }
                                        i24 = i26;
                                        i12 = 3;
                                    }
                                    xhVar = xhVar2;
                                    break;
                                    i22 |= i27;
                                    i14 = i24;
                                    str3 = str6;
                                    i21 = i23;
                                    sb2 = sb5;
                                    str2 = str5;
                                }
                            }
                            whVar = wh.f24128f[(cCharAt2 | ' ') - 97];
                            if (i23 == 0) {
                                whVar = null;
                            }
                            i28 = i20 + 1;
                            if (whVar != null) {
                                xhVar.getClass();
                                i32 = whVar.f24132c;
                                i33 = whVar.f24131b;
                                if (i33 == 1) {
                                    z13 = true;
                                } else {
                                    if (i33 != 2) {
                                    }
                                    z13 = false;
                                }
                                if (xhVar.b(i32, z13)) {
                                    throw aa.b.a(iG, i28, "invalid format specifier", str4);
                                }
                                if (i10 < 10) {
                                    Map map = z.f24187d;
                                    if (xhVar.a()) {
                                        androidx.datastore.preferences.protobuf.m[] mVarArr = (z[]) z.f24187d.get(whVar);
                                        gb.b(mVarArr, "default parameter");
                                        yVar = mVarArr[i10];
                                    } else {
                                        yVar = new z(i10, whVar, xhVar);
                                    }
                                } else {
                                    yVar = new z(i10, whVar, xhVar);
                                }
                            } else if (cCharAt2 != 't') {
                                if (!xhVar.b(160, false)) {
                                    throw aa.b.a(iG, i28, "invalid format specification", str4);
                                }
                                i29 = i20 + 2;
                                if (i29 > str4.length()) {
                                    throw aa.b.b(iG, "truncated format specifier", str4);
                                }
                                xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                if (xVar == null) {
                                    throw aa.b.b(i28, "illegal date/time conversion", str4);
                                }
                                yVar = new y(xhVar, i10, xVar);
                                i28 = i29;
                            } else {
                                if (!xhVar.b(160, false)) {
                                    throw aa.b.a(iG, i28, "invalid format specification", str4);
                                }
                                i29 = i20 + 2;
                                if (i29 > str4.length()) {
                                    throw aa.b.b(iG, "truncated format specifier", str4);
                                }
                                xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                if (xVar == null) {
                                    throw aa.b.b(i28, "illegal date/time conversion", str4);
                                }
                                yVar = new y(xhVar, i10, xVar);
                                i28 = i29;
                            }
                            i30 = yVar.f4130a;
                            if (i30 < 32) {
                                qgVar.f23904b |= 1 << i30;
                            }
                            qgVar.f23905c = Math.max(qgVar.f23905c, i30);
                            b0Var.f(qgVar.f23906d, iG, str4, sb4);
                            objArr3 = (Object[]) qgVar.f23908f;
                            i31 = yVar.f4130a;
                            if (i31 < objArr3.length) {
                                obj = objArr3[i31];
                                if (obj != null) {
                                    yVar.D(qgVar, obj);
                                } else {
                                    sb4.append("null");
                                }
                            } else {
                                sb4.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            qgVar.f23906d = i28;
                            iG = c0.g(i28, str4);
                            str3 = str6;
                            level4 = level3;
                            giVar = cVar2;
                            sb2 = sb5;
                            str2 = str5;
                        }
                    } else {
                        cVar = giVar;
                        level2 = level4;
                        if (gVar == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            throw new IllegalStateException("cannot get literal argument if a template context exists");
                        }
                        objArr = bhVar.f23331g;
                        if (objArr == null) {
                            throw new IllegalStateException("cannot get literal argument before calling log()");
                        }
                        sb3 = sb2;
                        sb3.append(zh.a(objArr[0]));
                    }
                    int i36 = f.f23445a;
                    yhVar = new yh(sb3);
                    cVar.a(diVar, yhVar);
                    if (yhVar.f24186b) {
                        sb3.append(" ]");
                    }
                } else {
                    gVar = bhVar.f23330f;
                    if (gVar != null) {
                        if (gVar != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z11) {
                            throw new IllegalStateException("cannot get arguments unless a template context exists");
                        }
                        objArr2 = bhVar.f23331g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            throw new IllegalStateException("cannot get arguments before calling log()");
                        }
                        qgVar = new qg(gVar, objArr2, sb2);
                        sb4 = (StringBuilder) qgVar.f23909g;
                        g gVar3 = (g) qgVar.f23907e;
                        b0Var = gVar3.f23476a;
                        str4 = gVar3.f23477b;
                        b0Var.getClass();
                        iG = c0.g(0, str4);
                        i10 = -1;
                        i11 = 0;
                        while (true) {
                            i12 = 3;
                            if (iG < 0) {
                                cVar = giVar;
                                level2 = level4;
                                StringBuilder sb7 = sb2;
                                String str9 = str2;
                                String str10 = str3;
                                i13 = qgVar.f23904b;
                                if (((i13 + 1) & i13) == 0) {
                                }
                                throw new aa.b(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i13))), 10);
                            }
                            i14 = iG + 1;
                            i15 = i14;
                            i16 = 0;
                            while (true) {
                                level3 = level4;
                                if (i15 >= str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                i17 = i15 + 1;
                                cCharAt = str4.charAt(i15);
                                i18 = i15;
                                c4 = (char) (cCharAt - '0');
                                cVar2 = giVar;
                                if (c4 < '\n') {
                                    i35 = (i16 * 10) + c4;
                                    if (i35 >= 1000000) {
                                        throw aa.b.a(iG, i17, "index too large", str4);
                                    }
                                    i16 = i35;
                                    i15 = i17;
                                    level4 = level3;
                                    giVar = cVar2;
                                }
                            }
                            if (cCharAt != '$') {
                                i19 = -1;
                                if (cCharAt != '<') {
                                    i10 = i11;
                                    i11++;
                                } else {
                                    if (i10 == -1) {
                                        throw aa.b.a(iG, i17, "invalid relative parameter", str4);
                                    }
                                    if (i17 == str4.length()) {
                                        throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                    }
                                    str4.charAt(i17);
                                    i14 = i17;
                                    i17 = i18 + 2;
                                }
                            } else {
                                if (i18 - i14 == 0) {
                                    throw aa.b.a(iG, i17, "missing index", str4);
                                }
                                if (str4.charAt(i14) == '0') {
                                    throw aa.b.a(iG, i17, "index has leading zero", str4);
                                }
                                i34 = i16 - 1;
                                if (i17 == str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                str4.charAt(i17);
                                i14 = i17;
                                i10 = i34;
                                i19 = -1;
                                i17 = i18 + 2;
                            }
                            i20 = i17 + i19;
                            while (true) {
                                if (i20 >= str4.length()) {
                                    throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                }
                                if (((char) ((str4.charAt(i20) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i20++;
                                i12 = 3;
                            }
                            cCharAt2 = str4.charAt(i20);
                            i21 = cCharAt2 & ' ';
                            if (i21 == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            xh xhVar4 = xh.f24157e;
                            if (i14 == i20) {
                                if (true != z12) {
                                    i22 = 0;
                                } else {
                                    i22 = 128;
                                }
                                while (true) {
                                    if (i14 == i20) {
                                        i23 = i21;
                                        xhVar = new xh(i22, -1, -1);
                                        sb5 = sb2;
                                        str5 = str2;
                                        str6 = str3;
                                        break;
                                    }
                                    i24 = i14 + 1;
                                    i23 = i21;
                                    cCharAt3 = str4.charAt(i14);
                                    sb5 = sb2;
                                    str5 = str2;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    str6 = str3;
                                    if (cCharAt3 > '9') {
                                        throw aa.b.b(i14, "invalid flag", str4);
                                    }
                                    i25 = cCharAt3 - '0';
                                    while (true) {
                                        if (i24 == i20) {
                                            xhVar2 = new xh(i22, i25, -1);
                                            break;
                                        }
                                        i26 = i24 + 1;
                                        cCharAt4 = str4.charAt(i24);
                                        if (cCharAt4 == '.') {
                                            xhVar2 = new xh(i22, i25, xh.e(i26, i20, str4));
                                            break;
                                        }
                                        c5 = (char) (cCharAt4 - '0');
                                        if (c5 >= '\n') {
                                            throw aa.b.b(i24, "invalid width character", str4);
                                        }
                                        i25 = (i25 * 10) + c5;
                                        if (i25 > 999999) {
                                            throw aa.b.a(i14, i20, "width too large", str4);
                                        }
                                        i24 = i26;
                                        i12 = 3;
                                    }
                                    xhVar = xhVar2;
                                    break;
                                    i22 |= i27;
                                    i14 = i24;
                                    str3 = str6;
                                    i21 = i23;
                                    sb2 = sb5;
                                    str2 = str5;
                                }
                            } else {
                                if (true != z12) {
                                    i22 = 0;
                                } else {
                                    i22 = 128;
                                }
                                while (true) {
                                    if (i14 == i20) {
                                        i23 = i21;
                                        xhVar = new xh(i22, -1, -1);
                                        sb5 = sb2;
                                        str5 = str2;
                                        str6 = str3;
                                        break;
                                    }
                                    i24 = i14 + 1;
                                    i23 = i21;
                                    cCharAt3 = str4.charAt(i14);
                                    sb5 = sb2;
                                    str5 = str2;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    str6 = str3;
                                    if (cCharAt3 > '9') {
                                        throw aa.b.b(i14, "invalid flag", str4);
                                    }
                                    i25 = cCharAt3 - '0';
                                    while (true) {
                                        if (i24 == i20) {
                                            xhVar2 = new xh(i22, i25, -1);
                                            break;
                                        }
                                        i26 = i24 + 1;
                                        cCharAt4 = str4.charAt(i24);
                                        if (cCharAt4 == '.') {
                                            xhVar2 = new xh(i22, i25, xh.e(i26, i20, str4));
                                            break;
                                        }
                                        c5 = (char) (cCharAt4 - '0');
                                        if (c5 >= '\n') {
                                            throw aa.b.b(i24, "invalid width character", str4);
                                        }
                                        i25 = (i25 * 10) + c5;
                                        if (i25 > 999999) {
                                            throw aa.b.a(i14, i20, "width too large", str4);
                                        }
                                        i24 = i26;
                                        i12 = 3;
                                    }
                                    xhVar = xhVar2;
                                    break;
                                    i22 |= i27;
                                    i14 = i24;
                                    str3 = str6;
                                    i21 = i23;
                                    sb2 = sb5;
                                    str2 = str5;
                                }
                            }
                            whVar = wh.f24128f[(cCharAt2 | ' ') - 97];
                            if (i23 == 0) {
                                whVar = null;
                            }
                            i28 = i20 + 1;
                            if (whVar != null) {
                                xhVar.getClass();
                                i32 = whVar.f24132c;
                                i33 = whVar.f24131b;
                                if (i33 == 1) {
                                    z13 = true;
                                } else {
                                    if (i33 != 2) {
                                    }
                                    z13 = false;
                                }
                                if (xhVar.b(i32, z13)) {
                                    throw aa.b.a(iG, i28, "invalid format specifier", str4);
                                }
                                if (i10 < 10) {
                                    Map map2 = z.f24187d;
                                    if (xhVar.a()) {
                                        androidx.datastore.preferences.protobuf.m[] mVarArr2 = (z[]) z.f24187d.get(whVar);
                                        gb.b(mVarArr2, "default parameter");
                                        yVar = mVarArr2[i10];
                                    } else {
                                        yVar = new z(i10, whVar, xhVar);
                                    }
                                } else {
                                    yVar = new z(i10, whVar, xhVar);
                                }
                            } else if (cCharAt2 != 't') {
                                if (!xhVar.b(160, false)) {
                                    throw aa.b.a(iG, i28, "invalid format specification", str4);
                                }
                                i29 = i20 + 2;
                                if (i29 > str4.length()) {
                                    throw aa.b.b(iG, "truncated format specifier", str4);
                                }
                                xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                if (xVar == null) {
                                    throw aa.b.b(i28, "illegal date/time conversion", str4);
                                }
                                yVar = new y(xhVar, i10, xVar);
                                i28 = i29;
                            } else {
                                if (!xhVar.b(160, false)) {
                                    throw aa.b.a(iG, i28, "invalid format specification", str4);
                                }
                                i29 = i20 + 2;
                                if (i29 > str4.length()) {
                                    throw aa.b.b(iG, "truncated format specifier", str4);
                                }
                                xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                if (xVar == null) {
                                    throw aa.b.b(i28, "illegal date/time conversion", str4);
                                }
                                yVar = new y(xhVar, i10, xVar);
                                i28 = i29;
                            }
                            i30 = yVar.f4130a;
                            if (i30 < 32) {
                                qgVar.f23904b |= 1 << i30;
                            }
                            qgVar.f23905c = Math.max(qgVar.f23905c, i30);
                            b0Var.f(qgVar.f23906d, iG, str4, sb4);
                            objArr3 = (Object[]) qgVar.f23908f;
                            i31 = yVar.f4130a;
                            if (i31 < objArr3.length) {
                                obj = objArr3[i31];
                                if (obj != null) {
                                    yVar.D(qgVar, obj);
                                } else {
                                    sb4.append("null");
                                }
                            } else {
                                sb4.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            qgVar.f23906d = i28;
                            iG = c0.g(i28, str4);
                            str3 = str6;
                            level4 = level3;
                            giVar = cVar2;
                            sb2 = sb5;
                            str2 = str5;
                        }
                    } else {
                        cVar = giVar;
                        level2 = level4;
                        if (gVar == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            throw new IllegalStateException("cannot get literal argument if a template context exists");
                        }
                        objArr = bhVar.f23331g;
                        if (objArr == null) {
                            throw new IllegalStateException("cannot get literal argument before calling log()");
                        }
                        sb3 = sb2;
                        sb3.append(zh.a(objArr[0]));
                    }
                    int i37 = f.f23445a;
                    yhVar = new yh(sb3);
                    cVar.a(diVar, yhVar);
                    if (yhVar.f24186b) {
                        sb3.append(" ]");
                    }
                }
                string = sb3.toString();
            } else {
                int i38 = f.f23445a;
                if (bhVar.f23330f == null && giVar.b() <= set.size() && set.containsAll(giVar.c())) {
                    if (!(bhVar.f23330f == null)) {
                        throw new IllegalStateException("cannot get literal argument if a template context exists");
                    }
                    Object[] objArr4 = bhVar.f23331g;
                    if (objArr4 == null) {
                        throw new IllegalStateException("cannot get literal argument before calling log()");
                    }
                    string = zh.a(objArr4[0]);
                    level2 = level4;
                } else {
                    sb2 = new StringBuilder();
                    ihVar = bhVar.f23328d;
                    if (ihVar != null) {
                        throw new IllegalStateException("cannot request log site information prior to postProcess()");
                    }
                    if (yg.e(2, ihVar, sb2)) {
                        sb2.append(" ");
                    }
                    if (z14 || bhVar.f23330f == null) {
                        gVar = bhVar.f23330f;
                        if (gVar != null) {
                            if (gVar != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z11) {
                                throw new IllegalStateException("cannot get arguments unless a template context exists");
                            }
                            objArr2 = bhVar.f23331g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                throw new IllegalStateException("cannot get arguments before calling log()");
                            }
                            qgVar = new qg(gVar, objArr2, sb2);
                            sb4 = (StringBuilder) qgVar.f23909g;
                            g gVar4 = (g) qgVar.f23907e;
                            b0Var = gVar4.f23476a;
                            str4 = gVar4.f23477b;
                            b0Var.getClass();
                            iG = c0.g(0, str4);
                            i10 = -1;
                            i11 = 0;
                            while (true) {
                                i12 = 3;
                                if (iG < 0) {
                                    cVar = giVar;
                                    level2 = level4;
                                    StringBuilder sb8 = sb2;
                                    String str11 = str2;
                                    String str12 = str3;
                                    i13 = qgVar.f23904b;
                                    if (((i13 + 1) & i13) == 0 || (qgVar.f23905c > 31 && i13 != -1)) {
                                        throw new aa.b(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i13))), 10);
                                    }
                                    b0Var.f(qgVar.f23906d, str4.length(), str4, sb4);
                                    if (!(bhVar.f23330f != null)) {
                                        throw new IllegalStateException(str11);
                                    }
                                    Object[] objArr5 = bhVar.f23331g;
                                    if (objArr5 == null) {
                                        throw new IllegalStateException(str12);
                                    }
                                    if (objArr5.length > qgVar.f23905c + 1) {
                                        sb4.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                    }
                                    sb3 = sb8;
                                    break;
                                }
                                i14 = iG + 1;
                                i15 = i14;
                                i16 = 0;
                                while (true) {
                                    level3 = level4;
                                    if (i15 >= str4.length()) {
                                        throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                    }
                                    i17 = i15 + 1;
                                    cCharAt = str4.charAt(i15);
                                    i18 = i15;
                                    c4 = (char) (cCharAt - '0');
                                    cVar2 = giVar;
                                    if (c4 < '\n') {
                                        i35 = (i16 * 10) + c4;
                                        if (i35 >= 1000000) {
                                            throw aa.b.a(iG, i17, "index too large", str4);
                                        }
                                        i16 = i35;
                                        i15 = i17;
                                        level4 = level3;
                                        giVar = cVar2;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i19 = -1;
                                    if (cCharAt != '<') {
                                        i10 = i11;
                                        i11++;
                                    } else {
                                        if (i10 == -1) {
                                            throw aa.b.a(iG, i17, "invalid relative parameter", str4);
                                        }
                                        if (i17 == str4.length()) {
                                            throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                        }
                                        str4.charAt(i17);
                                        i14 = i17;
                                        i17 = i18 + 2;
                                    }
                                } else {
                                    if (i18 - i14 == 0) {
                                        throw aa.b.a(iG, i17, "missing index", str4);
                                    }
                                    if (str4.charAt(i14) == '0') {
                                        throw aa.b.a(iG, i17, "index has leading zero", str4);
                                    }
                                    i34 = i16 - 1;
                                    if (i17 == str4.length()) {
                                        throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                    }
                                    str4.charAt(i17);
                                    i14 = i17;
                                    i10 = i34;
                                    i19 = -1;
                                    i17 = i18 + 2;
                                }
                                i20 = i17 + i19;
                                while (true) {
                                    if (i20 >= str4.length()) {
                                        throw new aa.b(aa.b.c(iG, -1, "unterminated parameter", str4), 10);
                                    }
                                    if (((char) ((str4.charAt(i20) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i20++;
                                    i12 = 3;
                                }
                                cCharAt2 = str4.charAt(i20);
                                i21 = cCharAt2 & ' ';
                                if (i21 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                xh xhVar5 = xh.f24157e;
                                if (i14 == i20 || z12) {
                                    if (true != z12) {
                                        i22 = 0;
                                    } else {
                                        i22 = 128;
                                    }
                                    while (true) {
                                        if (i14 == i20) {
                                            i23 = i21;
                                            xhVar = new xh(i22, -1, -1);
                                        } else {
                                            i24 = i14 + 1;
                                            i23 = i21;
                                            cCharAt3 = str4.charAt(i14);
                                            sb5 = sb2;
                                            str5 = str2;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                str6 = str3;
                                                if (cCharAt3 > '9') {
                                                    throw aa.b.b(i14, "invalid flag", str4);
                                                }
                                                i25 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i24 == i20) {
                                                        xhVar2 = new xh(i22, i25, -1);
                                                        break;
                                                    }
                                                    i26 = i24 + 1;
                                                    cCharAt4 = str4.charAt(i24);
                                                    if (cCharAt4 == '.') {
                                                        xhVar2 = new xh(i22, i25, xh.e(i26, i20, str4));
                                                        break;
                                                    }
                                                    c5 = (char) (cCharAt4 - '0');
                                                    if (c5 >= '\n') {
                                                        throw aa.b.b(i24, "invalid width character", str4);
                                                    }
                                                    i25 = (i25 * 10) + c5;
                                                    if (i25 > 999999) {
                                                        throw aa.b.a(i14, i20, "width too large", str4);
                                                    }
                                                    i24 = i26;
                                                    i12 = 3;
                                                }
                                                xhVar = xhVar2;
                                                break;
                                            }
                                            str6 = str3;
                                            int i39 = ((int) ((xh.f24156d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                            if (i39 < 0) {
                                                if (cCharAt3 != '.') {
                                                    throw aa.b.b(i14, "invalid flag", str4);
                                                }
                                                xhVar = new xh(i22, -1, xh.e(i24, i20, str4));
                                                break;
                                            }
                                            i27 = 1 << i39;
                                            if ((i22 & i27) != 0) {
                                                throw aa.b.b(i14, "repeated flag", str4);
                                            }
                                            i22 |= i27;
                                            i14 = i24;
                                            str3 = str6;
                                            i21 = i23;
                                            sb2 = sb5;
                                            str2 = str5;
                                        }
                                    }
                                    whVar = wh.f24128f[(cCharAt2 | ' ') - 97];
                                    if (i23 == 0 && (whVar == null || (whVar.f24132c & 128) == 0)) {
                                        whVar = null;
                                    }
                                    i28 = i20 + 1;
                                    if (whVar != null) {
                                        xhVar.getClass();
                                        i32 = whVar.f24132c;
                                        i33 = whVar.f24131b;
                                        if (i33 == 1) {
                                            z13 = true;
                                        } else if (i33 != 2 || i33 == i12 || i33 == 4) {
                                            z13 = false;
                                        } else {
                                            if (i33 != 5) {
                                                throw null;
                                            }
                                            z13 = true;
                                        }
                                        if (xhVar.b(i32, z13)) {
                                            throw aa.b.a(iG, i28, "invalid format specifier", str4);
                                        }
                                        if (i10 < 10) {
                                            Map map3 = z.f24187d;
                                            if (xhVar.a()) {
                                                androidx.datastore.preferences.protobuf.m[] mVarArr3 = (z[]) z.f24187d.get(whVar);
                                                gb.b(mVarArr3, "default parameter");
                                                yVar = mVarArr3[i10];
                                            } else {
                                                yVar = new z(i10, whVar, xhVar);
                                            }
                                        } else {
                                            yVar = new z(i10, whVar, xhVar);
                                        }
                                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                        if (!xhVar.b(160, false)) {
                                            throw aa.b.a(iG, i28, "invalid format specification", str4);
                                        }
                                        i29 = i20 + 2;
                                        if (i29 > str4.length()) {
                                            throw aa.b.b(iG, "truncated format specifier", str4);
                                        }
                                        xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                        if (xVar == null) {
                                            throw aa.b.b(i28, "illegal date/time conversion", str4);
                                        }
                                        yVar = new y(xhVar, i10, xVar);
                                        i28 = i29;
                                    } else {
                                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                            throw aa.b.a(iG, i28, "invalid format specification", str4);
                                        }
                                        if (!xhVar.b(160, false)) {
                                            throw aa.b.a(iG, i28, "invalid format specification", str4);
                                        }
                                        yVar = new a0(xhVar, i10);
                                    }
                                    i30 = yVar.f4130a;
                                    if (i30 < 32) {
                                        qgVar.f23904b |= 1 << i30;
                                    }
                                    qgVar.f23905c = Math.max(qgVar.f23905c, i30);
                                    b0Var.f(qgVar.f23906d, iG, str4, sb4);
                                    objArr3 = (Object[]) qgVar.f23908f;
                                    i31 = yVar.f4130a;
                                    if (i31 < objArr3.length) {
                                        obj = objArr3[i31];
                                        if (obj != null) {
                                            yVar.D(qgVar, obj);
                                        } else {
                                            sb4.append("null");
                                        }
                                    } else {
                                        sb4.append("[ERROR: MISSING LOG ARGUMENT]");
                                    }
                                    qgVar.f23906d = i28;
                                    iG = c0.g(i28, str4);
                                    str3 = str6;
                                    level4 = level3;
                                    giVar = cVar2;
                                    sb2 = sb5;
                                    str2 = str5;
                                } else {
                                    xhVar = xh.f24157e;
                                    i23 = i21;
                                }
                                sb5 = sb2;
                                str5 = str2;
                                str6 = str3;
                                whVar = wh.f24128f[(cCharAt2 | ' ') - 97];
                                if (i23 == 0) {
                                    whVar = null;
                                }
                                i28 = i20 + 1;
                                if (whVar != null) {
                                    xhVar.getClass();
                                    i32 = whVar.f24132c;
                                    i33 = whVar.f24131b;
                                    if (i33 == 1) {
                                        z13 = true;
                                    } else {
                                        if (i33 != 2) {
                                        }
                                        z13 = false;
                                    }
                                    if (xhVar.b(i32, z13)) {
                                        throw aa.b.a(iG, i28, "invalid format specifier", str4);
                                    }
                                    if (i10 < 10) {
                                        Map map4 = z.f24187d;
                                        if (xhVar.a()) {
                                            androidx.datastore.preferences.protobuf.m[] mVarArr4 = (z[]) z.f24187d.get(whVar);
                                            gb.b(mVarArr4, "default parameter");
                                            yVar = mVarArr4[i10];
                                        } else {
                                            yVar = new z(i10, whVar, xhVar);
                                        }
                                    } else {
                                        yVar = new z(i10, whVar, xhVar);
                                    }
                                } else if (cCharAt2 != 't') {
                                    if (!xhVar.b(160, false)) {
                                        throw aa.b.a(iG, i28, "invalid format specification", str4);
                                    }
                                    i29 = i20 + 2;
                                    if (i29 > str4.length()) {
                                        throw aa.b.b(iG, "truncated format specifier", str4);
                                    }
                                    xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                    if (xVar == null) {
                                        throw aa.b.b(i28, "illegal date/time conversion", str4);
                                    }
                                    yVar = new y(xhVar, i10, xVar);
                                    i28 = i29;
                                } else {
                                    if (!xhVar.b(160, false)) {
                                        throw aa.b.a(iG, i28, "invalid format specification", str4);
                                    }
                                    i29 = i20 + 2;
                                    if (i29 > str4.length()) {
                                        throw aa.b.b(iG, "truncated format specifier", str4);
                                    }
                                    xVar = (x) x.f24134b.get(Character.valueOf(str4.charAt(i28)));
                                    if (xVar == null) {
                                        throw aa.b.b(i28, "illegal date/time conversion", str4);
                                    }
                                    yVar = new y(xhVar, i10, xVar);
                                    i28 = i29;
                                }
                                i30 = yVar.f4130a;
                                if (i30 < 32) {
                                    qgVar.f23904b |= 1 << i30;
                                }
                                qgVar.f23905c = Math.max(qgVar.f23905c, i30);
                                b0Var.f(qgVar.f23906d, iG, str4, sb4);
                                objArr3 = (Object[]) qgVar.f23908f;
                                i31 = yVar.f4130a;
                                if (i31 < objArr3.length) {
                                    obj = objArr3[i31];
                                    if (obj != null) {
                                        yVar.D(qgVar, obj);
                                    } else {
                                        sb4.append("null");
                                    }
                                } else {
                                    sb4.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                qgVar.f23906d = i28;
                                iG = c0.g(i28, str4);
                                str3 = str6;
                                level4 = level3;
                                giVar = cVar2;
                                sb2 = sb5;
                                str2 = str5;
                            }
                        } else {
                            cVar = giVar;
                            level2 = level4;
                            if (gVar == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                throw new IllegalStateException("cannot get literal argument if a template context exists");
                            }
                            objArr = bhVar.f23331g;
                            if (objArr == null) {
                                throw new IllegalStateException("cannot get literal argument before calling log()");
                            }
                            sb3 = sb2;
                            sb3.append(zh.a(objArr[0]));
                        }
                        int i310 = f.f23445a;
                        yhVar = new yh(sb3);
                        cVar.a(diVar, yhVar);
                        if (yhVar.f24186b) {
                            sb3.append(" ]");
                        }
                    } else {
                        sb2.append("(REDACTED) ");
                        sb2.append(bhVar.f23330f.f23477b);
                        level2 = level4;
                        sb3 = sb2;
                    }
                    string = sb3.toString();
                }
            }
            Throwable th2 = (Throwable) bhVar.c().j(eh.f23436a);
            int iF = h.f(level2);
            if (iF == 2) {
                Log.v(str, string, th2);
                return;
            }
            if (iF == 3) {
                Log.d(str, string, th2);
                return;
            }
            if (iF == 4) {
                Log.i(str, string, th2);
            } else if (iF != 5) {
                Log.e(str, string, th2);
            } else {
                Log.w(str, string, th2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        int iF = h.f(level);
        return Log.isLoggable(this.f23873b, iF) || Log.isLoggable("all", iF);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(bh bhVar) {
        m(bhVar, this.f23873b, this.f23874c, this.f23875d, this.f23876e);
    }
}
