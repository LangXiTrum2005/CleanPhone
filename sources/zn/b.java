package zn;

import an.h;
import an.p;
import co.g;
import java.util.ArrayList;
import xn.c;
import xn.l;
import xn.n;
import xn.r;
import xn.s;
import xn.v;
import xn.w;
import xn.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements n {
    /* JADX WARN: Code duplicated, block: B:171:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0082 A[EDGE_INSN: B:174:0x0082->B:24:0x0082 BREAK  A[LOOP:2: B:18:0x0060->B:22:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[LOOP:2: B:18:0x0060->B:22:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x017b  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    @Override // xn.n
    public final w a(g gVar) {
        wi.b bVar;
        wi.b bVar2;
        int i10;
        int i11;
        int length;
        int length2;
        wi.b bVar3;
        l lVar;
        String string;
        int i12;
        String string2;
        System.currentTimeMillis();
        s sVar = gVar.f6799e;
        wi.b bVar4 = new wi.b(false, sVar, null);
        c cVar = sVar.f54065f;
        if (cVar == null) {
            int i13 = c.f53930n;
            l lVar2 = sVar.f54062c;
            int size = lVar2.size();
            int i14 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            String str = null;
            boolean z18 = true;
            int iW = -1;
            int iW2 = -1;
            int iW3 = -1;
            int iW4 = -1;
            while (i14 < size) {
                String strH = lVar2.h(i14);
                String strQ = lVar2.q(i14);
                if (p.i0(strH, "Cache-Control")) {
                    if (str == null) {
                        str = strQ;
                    }
                    i11 = 0;
                    while (i11 < strQ.length()) {
                        length = strQ.length();
                        length2 = i11;
                        while (true) {
                            if (length2 < length) {
                                bVar3 = bVar4;
                                lVar = lVar2;
                                length2 = strQ.length();
                                break;
                            }
                            bVar3 = bVar4;
                            lVar = lVar2;
                            if (h.r0("=,;", strQ.charAt(length2))) {
                                break;
                            }
                            length2++;
                            bVar4 = bVar3;
                            lVar2 = lVar;
                        }
                        String strSubstring = strQ.substring(i11, length2);
                        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = h.T0(strSubstring).toString();
                        if (length2 != strQ.length() || strQ.charAt(length2) == ',' || strQ.charAt(length2) == ';') {
                            i12 = size;
                            i11 = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = yn.a.f54560a;
                            int length4 = strQ.length();
                            while (true) {
                                if (length3 >= length4) {
                                    length3 = strQ.length();
                                    break;
                                }
                                char cCharAt = strQ.charAt(length3);
                                int i15 = length4;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                                length4 = i15;
                            }
                            if (length3 >= strQ.length() || strQ.charAt(length3) != '\"') {
                                int length5 = strQ.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        i12 = size;
                                        length6 = strQ.length();
                                        break;
                                    }
                                    int i16 = length5;
                                    i12 = size;
                                    if (h.r0(",;", strQ.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    length5 = i16;
                                    size = i12;
                                }
                                String strSubstring2 = strQ.substring(length3, length6);
                                kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                int i17 = length6;
                                string2 = h.T0(strSubstring2).toString();
                                i11 = i17;
                            } else {
                                int i18 = length3 + 1;
                                int iV0 = h.v0(strQ, '\"', i18, 4);
                                string2 = strQ.substring(i18, iV0);
                                kotlin.jvm.internal.n.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i11 = iV0 + 1;
                                i12 = size;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z10 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z11 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iW = yn.a.w(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iW2 = yn.a.w(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iW3 = yn.a.w(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iW4 = yn.a.w(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z17 = true;
                        }
                        bVar4 = bVar3;
                        lVar2 = lVar;
                        size = i12;
                    }
                    i14++;
                    bVar4 = bVar4;
                    lVar2 = lVar2;
                    size = size;
                } else {
                    if (p.i0(strH, "Pragma")) {
                    }
                    i14++;
                    bVar4 = bVar4;
                    lVar2 = lVar2;
                    size = size;
                }
                z18 = false;
                i11 = 0;
                while (i11 < strQ.length()) {
                    length = strQ.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            bVar3 = bVar4;
                            lVar = lVar2;
                            length2 = strQ.length();
                            break;
                        }
                        bVar3 = bVar4;
                        lVar = lVar2;
                        if (h.r0("=,;", strQ.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        bVar4 = bVar3;
                        lVar2 = lVar;
                    }
                    String strSubstring3 = strQ.substring(i11, length2);
                    kotlin.jvm.internal.n.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = h.T0(strSubstring3).toString();
                    if (length2 != strQ.length()) {
                        i12 = size;
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        i12 = size;
                        i11 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z10 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iW = yn.a.w(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iW2 = yn.a.w(string2, -1);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iW3 = yn.a.w(string2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iW4 = yn.a.w(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z17 = true;
                    }
                    bVar4 = bVar3;
                    lVar2 = lVar;
                    size = i12;
                }
                i14++;
                bVar4 = bVar4;
                lVar2 = lVar2;
                size = size;
            }
            bVar = bVar4;
            c cVar2 = new c(z10, z11, iW, iW2, z12, z13, z14, iW3, iW4, z15, z16, z17, !z18 ? null : str);
            sVar.f54065f = cVar2;
            cVar = cVar2;
        } else {
            bVar = bVar4;
        }
        if (cVar.f53940j) {
            Object obj = null;
            bVar2 = new wi.b(false, obj, obj);
        } else {
            bVar2 = bVar;
        }
        s sVar2 = (s) bVar2.f53211a;
        w wVar = (w) bVar2.f53212b;
        if (sVar2 == null && wVar == null) {
            return new w(sVar, r.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), yn.a.f54562c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (sVar2 == null) {
            kotlin.jvm.internal.n.c(wVar);
            v vVarD = wVar.d();
            w wVarA = a.a(wVar);
            v.b("cacheResponse", wVarA);
            vVarD.f54077i = wVarA;
            return vVarD.a();
        }
        w wVarB = gVar.b(sVar2);
        if (wVar != null) {
            if (wVarB.f54084d == 304) {
                v vVarD2 = wVar.d();
                l lVar3 = wVar.f54086f;
                l lVar4 = wVarB.f54086f;
                ArrayList arrayList = new ArrayList(20);
                int size2 = lVar3.size();
                int i19 = 0;
                while (i19 < size2) {
                    String name = lVar3.h(i19);
                    int i20 = size2;
                    String value = lVar3.q(i19);
                    l lVar5 = lVar3;
                    if ("Warning".equalsIgnoreCase(name)) {
                        i10 = i19;
                        if (p.p0(value, "1", false)) {
                        }
                        i19 = i10 + 1;
                        size2 = i20;
                        lVar3 = lVar5;
                    } else {
                        i10 = i19;
                    }
                    if ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || "Content-Type".equalsIgnoreCase(name) || !a.b(name) || lVar4.b(name) == null) {
                        kotlin.jvm.internal.n.f(name, "name");
                        kotlin.jvm.internal.n.f(value, "value");
                        arrayList.add(name);
                        arrayList.add(h.T0(value).toString());
                    }
                    i19 = i10 + 1;
                    size2 = i20;
                    lVar3 = lVar5;
                }
                int size3 = lVar4.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    String name2 = lVar4.h(i21);
                    if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !"Content-Type".equalsIgnoreCase(name2) && a.b(name2)) {
                        String value2 = lVar4.q(i21);
                        kotlin.jvm.internal.n.f(name2, "name");
                        kotlin.jvm.internal.n.f(value2, "value");
                        arrayList.add(name2);
                        arrayList.add(h.T0(value2).toString());
                    }
                }
                vVarD2.f54074f = new l((String[]) arrayList.toArray(new String[0])).m();
                vVarD2.f54079k = wVarB.f54091k;
                vVarD2.l = wVarB.l;
                w wVarA2 = a.a(wVar);
                v.b("cacheResponse", wVarA2);
                vVarD2.f54077i = wVarA2;
                w wVarA3 = a.a(wVarB);
                v.b("networkResponse", wVarA3);
                vVarD2.f54076h = wVarA3;
                vVarD2.a();
                y yVar = wVarB.f54087g;
                kotlin.jvm.internal.n.c(yVar);
                yVar.close();
                kotlin.jvm.internal.n.c(null);
                throw null;
            }
            y yVar2 = wVar.f54087g;
            if (yVar2 != null) {
                yn.a.d(yVar2);
            }
        }
        v vVarD3 = wVarB.d();
        w wVarA4 = a.a(wVar);
        v.b("cacheResponse", wVarA4);
        vVarD3.f54077i = wVarA4;
        w wVarA5 = a.a(wVarB);
        v.b("networkResponse", wVarA5);
        vVarD3.f54076h = wVarA5;
        return vVarD3.a();
    }
}
