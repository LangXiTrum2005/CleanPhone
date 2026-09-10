package i3;

import android.app.Activity;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Window;
import b2.p;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.if1;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.measurement.nf;
import fl.b0;
import j0.h;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.n;
import l1.q;
import l1.x;
import l1.y;
import m0.s1;
import m0.t1;
import ml.g0;
import n2.m;
import om.j;
import om.l;
import u3.r;
import u3.t;
import u3.u;
import u3.v;
import v0.i;
import zk.k;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f implements ll.e, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f42854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f42856f;

    public f(nf c4, k kVar, pl.e typeParameterOwner, int i10) {
        this.f42851a = 2;
        n.f(c4, "c");
        n.f(typeParameterOwner, "typeParameterOwner");
        this.f42853c = c4;
        this.f42854d = kVar;
        this.f42852b = i10;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f42855e = linkedHashMap;
        this.f42856f = ((l) ((ll.a) ((nf) this.f42853c).f23782b).f45485a).c(new al.f(this, 13));
    }

    public static /* synthetic */ void n(f fVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = fVar.f42852b;
        }
        fVar.m(i10, str, (i11 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0145  */
    @Override // u3.r
    public void b(q qVar) {
        x xVar;
        x xVar2;
        SparseArray sparseArray;
        int i10;
        int i11;
        SparseArray sparseArray2 = (SparseArray) this.f42854d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f42855e;
        xd1 xd1Var = (xd1) this.f42853c;
        t tVar = (t) this.f42856f;
        SparseArray sparseArray3 = tVar.f51864h;
        SparseBooleanArray sparseBooleanArray = tVar.f51865i;
        h hVar = tVar.f51862f;
        List list = tVar.f51859c;
        int i12 = tVar.f51857a;
        if (qVar.z() != 2) {
            return;
        }
        if (i12 == 1 || i12 == 2 || tVar.f51869n == 1) {
            xVar = (x) list.get(0);
        } else {
            xVar = new x(((x) list.get(0)).d());
            list.add(xVar);
        }
        if ((qVar.z() & 128) == 0) {
            return;
        }
        qVar.N(1);
        int iG = qVar.G();
        qVar.N(3);
        qVar.k(xd1Var.f21843b, 0, 2);
        xd1Var.q(0);
        xd1Var.t(3);
        tVar.f51875t = xd1Var.i(13);
        qVar.k(xd1Var.f21843b, 0, 2);
        xd1Var.q(0);
        xd1Var.t(4);
        qVar.N(xd1Var.i(12));
        if (i12 == 2 && tVar.f51873r == null) {
            v vVarA = hVar.a(21, new h9.k(21, null, 0, null, y.f44831b));
            tVar.f51873r = vVarA;
            if (vVarA != null) {
                vVarA.a(xVar, tVar.f51868m, new ga(iG, 21, Segment.SIZE, 1));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = qVar.a();
        while (iA > 0) {
            qVar.k(xd1Var.f21843b, 0, 5);
            xd1Var.q(0);
            int i13 = xd1Var.i(8);
            xd1Var.t(3);
            int i14 = xd1Var.i(13);
            xd1Var.t(4);
            int i15 = xd1Var.i(12);
            int i16 = qVar.f44814b;
            int i17 = i16 + i15;
            int i18 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iZ = 0;
            while (true) {
                if (qVar.f44814b >= i17) {
                    i11 = iA;
                    break;
                }
                int iZ2 = qVar.z();
                i11 = iA;
                int iZ3 = qVar.f44814b + qVar.z();
                if (iZ3 > i17) {
                    break;
                }
                xd1 xd1Var2 = xd1Var;
                if (iZ2 == 5) {
                    long jB = qVar.B();
                    if (jB == 1094921523) {
                        i18 = 129;
                    } else if (jB == 1161904947) {
                        i18 = 135;
                    } else if (jB == 1094921524) {
                        i18 = 172;
                    } else if (jB == 1212503619) {
                        i18 = 36;
                    }
                } else if (iZ2 == 106) {
                    iZ3 = iZ3;
                    iG = iG;
                    i18 = 129;
                } else if (iZ2 == 122) {
                    iG = iG;
                    i18 = 135;
                    iZ3 = iZ3;
                } else if (iZ2 == 127) {
                    int iZ4 = qVar.z();
                    if (iZ4 == 21) {
                        i18 = 172;
                    } else if (iZ4 == 14) {
                        i18 = 136;
                    } else if (iZ4 == 33) {
                        i18 = 139;
                    }
                } else if (iZ2 == 123) {
                    i18 = 138;
                } else if (iZ2 == 10) {
                    iZ3 = iZ3;
                    strTrim = qVar.x(3, StandardCharsets.UTF_8).trim();
                    iZ = qVar.z();
                } else if (iZ2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (qVar.f44814b < iZ3) {
                        String strTrim2 = qVar.x(3, StandardCharsets.UTF_8).trim();
                        qVar.z();
                        x xVar3 = xVar;
                        byte[] bArr = new byte[4];
                        qVar.k(bArr, 0, 4);
                        arrayList2.add(new u(strTrim2, bArr));
                        xVar = xVar3;
                        iZ3 = iZ3;
                        iG = iG;
                    }
                    iZ3 = iZ3;
                    iG = iG;
                    xVar = xVar;
                    arrayList = arrayList2;
                    i18 = 89;
                } else {
                    iZ3 = iZ3;
                    iG = iG;
                    xVar = xVar;
                    if (iZ2 == 111) {
                        i18 = 257;
                    }
                }
                qVar.N(iZ3 - qVar.f44814b);
                xVar = xVar;
                iA = i11;
                xd1Var = xd1Var2;
                iG = iG;
            }
            xd1 xd1Var3 = xd1Var;
            int i19 = iG;
            x xVar4 = xVar;
            qVar.M(i17);
            h9.k kVar = new h9.k(i18, strTrim, iZ, arrayList, Arrays.copyOfRange(qVar.f44813a, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i18;
            }
            int i20 = i11 - (i15 + 5);
            int i21 = i12 == 2 ? i13 : i14;
            if (!sparseBooleanArray.get(i21)) {
                v vVarA2 = (i12 == 2 && i13 == 21) ? tVar.f51873r : hVar.a(i13, kVar);
                if (i12 != 2 || i14 < sparseIntArray.get(i21, Segment.SIZE)) {
                    sparseIntArray.put(i21, i14);
                    sparseArray2.put(i21, vVarA2);
                }
            }
            iA = i20;
            xVar = xVar4;
            xd1Var = xd1Var3;
            iG = i19;
        }
        int i22 = iG;
        x xVar5 = xVar;
        int size = sparseIntArray.size();
        int i23 = 0;
        while (i23 < size) {
            int iKeyAt = sparseIntArray.keyAt(i23);
            int iValueAt = sparseIntArray.valueAt(i23);
            sparseBooleanArray.put(iKeyAt, true);
            tVar.f51866j.put(iValueAt, true);
            v vVar = (v) sparseArray2.valueAt(i23);
            if (vVar != null) {
                if (vVar != tVar.f51873r) {
                    i10 = i22;
                    xVar2 = xVar5;
                    vVar.a(xVar2, tVar.f51868m, new ga(i10, iKeyAt, Segment.SIZE, 1));
                } else {
                    xVar2 = xVar5;
                    i10 = i22;
                }
                sparseArray = sparseArray3;
                sparseArray.put(iValueAt, vVar);
            } else {
                xVar2 = xVar5;
                sparseArray = sparseArray3;
                i10 = i22;
            }
            i23++;
            sparseArray3 = sparseArray;
            i22 = i10;
            xVar5 = xVar2;
        }
        SparseArray sparseArray4 = sparseArray3;
        if (i12 == 2) {
            if (tVar.f51870o) {
                return;
            }
            tVar.f51868m.endTracks();
            tVar.f51869n = 0;
            tVar.f51870o = true;
            return;
        }
        sparseArray4.remove(this.f42852b);
        int i24 = i12 == 1 ? 0 : tVar.f51869n - 1;
        tVar.f51869n = i24;
        if (i24 == 0) {
            tVar.f51868m.endTracks();
            tVar.f51870o = true;
        }
    }

    @Override // ll.e
    public m0 c(b0 javaTypeParameter) {
        n.f(javaTypeParameter, "javaTypeParameter");
        g0 g0Var = (g0) ((j) this.f42856f).invoke(javaTypeParameter);
        return g0Var != null ? g0Var : ((ll.e) ((nf) this.f42853c).f23783c).c(javaTypeParameter);
    }

    public int d(int i10, CharSequence charSequence) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f42855e).append((char) (p(i10 + 3, charSequence) + (p(i10, charSequence) << 12) + (p(i10 + 1, charSequence) << 8) + (p(i10 + 2, charSequence) << 4)));
            return i11;
        }
        this.f42852b = i10;
        if (i11 < charSequence.length()) {
            return d(this.f42852b, charSequence);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean e() {
        int i10 = this.f42852b;
        if (i10 == -1) {
            return false;
        }
        String str = (String) this.f42856f;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f42852b = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
        this.f42852b = i10;
        return false;
    }

    public void f(int i10, String str) {
        String str2 = (String) this.f42856f;
        if (str2.length() - i10 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (str2.charAt(i10 + i11) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.f42852b = str.length() + i10;
    }

    public String g() {
        StringBuilder sb2 = (StringBuilder) this.f42855e;
        String str = (String) this.f42856f;
        h('\"');
        int i10 = this.f42852b;
        int iV0 = an.h.v0(str, '\"', i10, 4);
        if (iV0 == -1) {
            k();
            o((byte) 1, false);
            throw null;
        }
        int i11 = i10;
        while (i11 < iV0) {
            if (str.charAt(i11) == '\\') {
                int iQ = this.f42852b;
                char cCharAt = str.charAt(i11);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iQ, i11);
                        int iQ2 = q(i11 + 1);
                        if (iQ2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iD = iQ2 + 1;
                        char cCharAt2 = str.charAt(iQ2);
                        if (cCharAt2 == 'u') {
                            iD = d(iD, str);
                        } else {
                            char c4 = cCharAt2 < 'u' ? tn.c.f51593a[cCharAt2] : (char) 0;
                            if (c4 == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb2.append(c4);
                        }
                        iQ = q(iD);
                        if (iQ == -1) {
                            n(this, "Unexpected EOF", iQ, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            sb2.append((CharSequence) str, iQ, i11);
                            iQ = q(i11);
                            if (iQ == -1) {
                                n(this, "Unexpected EOF", iQ, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i11);
                    }
                    i11 = iQ;
                    z10 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z10 ? str.subSequence(iQ, i11).toString() : l(iQ, i11);
                this.f42852b = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f42852b = iV0 + 1;
        String strSubstring = str.substring(i10, iV0);
        n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public void h(char c4) {
        int i10 = this.f42852b;
        if (i10 == -1) {
            u(c4);
            throw null;
        }
        String str = (String) this.f42856f;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f42852b = i11;
                if (cCharAt == c4) {
                    return;
                }
                u(c4);
                throw null;
            }
            i10 = i11;
        }
        this.f42852b = -1;
        u(c4);
        throw null;
    }

    public long i() {
        boolean z10;
        long j10;
        double dPow;
        int iQ = q(s());
        String str = (String) this.f42856f;
        int i10 = 6;
        int i11 = 0;
        if (iQ >= str.length() || iQ == -1) {
            n(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iQ) == '\"') {
            iQ++;
            if (iQ == str.length()) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = iQ;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            j12 = j12;
            if (i12 == str.length()) {
                break;
            }
            char cCharAt = str.charAt(i12);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z11) {
                if (i12 == iQ) {
                    n(this, "Unexpected symbol " + cCharAt + " in numeric literal", i11, i10);
                    throw null;
                }
                i12++;
                j12 = j12;
                i13 = 1;
                z11 = true;
            } else if (cCharAt == '-' && z11) {
                if (i12 == iQ) {
                    n(this, "Unexpected symbol '-' in numeric literal", i11, 6);
                    throw null;
                }
                i12++;
                i13 = i11;
                i10 = 6;
            } else if (cCharAt != '+' || !z11) {
                if (cCharAt != '-') {
                    if (tn.g.b(cCharAt) != 0) {
                        break;
                    }
                    i12++;
                    int i14 = cCharAt - '0';
                    if (i14 < 0 || i14 >= 10) {
                        n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i11, 6);
                        throw null;
                    }
                    if (z11) {
                        j11 = (j11 * ((long) 10)) + ((long) i14);
                    } else {
                        j13 = (j13 * ((long) 10)) - ((long) i14);
                        if (j13 > j12) {
                            n(this, "Numeric value overflow", 0, 6);
                            throw null;
                        }
                    }
                    i10 = 6;
                    i11 = 0;
                } else {
                    if (i12 != iQ) {
                        n(this, "Unexpected symbol '-' in numeric literal", i11, 6);
                        throw null;
                    }
                    i12++;
                    j12 = j12;
                    i10 = 6;
                    z12 = true;
                }
            } else {
                if (i12 == iQ) {
                    n(this, "Unexpected symbol '+' in numeric literal", i11, 6);
                    throw null;
                }
                i12++;
                j12 = j12;
                i10 = 6;
                i13 = 1;
            }
        }
        boolean z13 = i12 != iQ;
        if (iQ == i12 || (z12 && iQ == i12 - 1)) {
            n(this, "Expected numeric literal", 0, 6);
            throw null;
        }
        if (z10) {
            if (!z13) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i12) != '\"') {
                n(this, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            i12++;
        }
        this.f42852b = i12;
        long j14 = j13;
        if (z11) {
            double d10 = j14;
            if (i13 == 0) {
                dPow = Math.pow(10.0d, -j11);
            } else {
                if (i13 != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                dPow = Math.pow(10.0d, j11);
            }
            double d11 = d10 * dPow;
            if (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d11) != d11) {
                n(this, "Can't convert " + d11 + " to Long", 0, 6);
                throw null;
            }
            j10 = (long) d11;
        } else {
            j10 = j14;
        }
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        n(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.f42854d;
        if (str == null) {
            return g();
        }
        n.c(str);
        this.f42854d = null;
        return str;
    }

    public String k() {
        String str = (String) this.f42856f;
        String str2 = (String) this.f42854d;
        if (str2 != null) {
            n.c(str2);
            this.f42854d = null;
            return str2;
        }
        int iS = s();
        if (iS >= str.length() || iS == -1) {
            n(this, "EOF", iS, 4);
            throw null;
        }
        byte b10 = tn.g.b(str.charAt(iS));
        if (b10 == 1) {
            return j();
        }
        if (b10 != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(iS), 0, 6);
            throw null;
        }
        boolean z10 = false;
        while (tn.g.b(str.charAt(iS)) == 0) {
            iS++;
            if (iS >= str.length()) {
                ((StringBuilder) this.f42855e).append((CharSequence) str, this.f42852b, iS);
                int iQ = q(iS);
                if (iQ == -1) {
                    this.f42852b = iS;
                    return l(0, 0);
                }
                iS = iQ;
                z10 = true;
            }
        }
        String string = !z10 ? str.subSequence(this.f42852b, iS).toString() : l(this.f42852b, iS);
        this.f42852b = iS;
        return string;
    }

    public String l(int i10, int i11) {
        StringBuilder sb2 = (StringBuilder) this.f42855e;
        sb2.append((CharSequence) this.f42856f, i10, i11);
        String string = sb2.toString();
        n.e(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void m(int i10, String message, String hint) {
        n.f(message, "message");
        n.f(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbJ = d5.u.j(message, " at path: ");
        sbJ.append(((p) this.f42853c).j());
        sbJ.append(strConcat);
        String message2 = sbJ.toString();
        String input = (String) this.f42856f;
        n.f(message2, "message");
        n.f(input, "input");
        String message3 = message2 + "\nJSON input: " + ((Object) tn.g.d(i10, input));
        n.f(message3, "message");
        if (i10 >= 0) {
            message3 = "Unexpected JSON token at offset " + i10 + ": " + message3;
        }
        n.f(message3, "message");
        throw new tn.d(message3);
    }

    public void o(byte b10, boolean z10) {
        String str;
        String str2 = (String) this.f42856f;
        if (b10 == 1) {
            str = "quotation mark '\"'";
        } else if (b10 == 2) {
            str = "string escape sequence '\\'";
        } else if (b10 == 4) {
            str = "comma ','";
        } else if (b10 == 5) {
            str = "colon ':'";
        } else if (b10 == 6) {
            str = "start of the object '{'";
        } else if (b10 == 7) {
            str = "end of the object '}'";
        } else if (b10 == 8) {
            str = "start of the array '['";
        } else if (b10 == 9) {
            str = "end of the array ']'";
        } else if (b10 == 10) {
            str = "end of the input";
        } else {
            str = b10 == 127 ? "invalid token" : "valid token";
        }
        int i10 = z10 ? this.f42852b - 1 : this.f42852b;
        n(this, l1.d.h("Expected ", str, ", but had '", (this.f42852b == str2.length() || i10 < 0) ? "EOF" : String.valueOf(str2.charAt(i10)), "' instead"), i10, 4);
        throw null;
    }

    public int p(int i10, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public int q(int i10) {
        if (i10 < ((String) this.f42856f).length()) {
            return i10;
        }
        return -1;
    }

    public void r(em0 em0Var) {
        Window window = ((Activity) this.f42853c).getWindow();
        window.getDecorView();
        s1 t1Var = Build.VERSION.SDK_INT >= 35 ? new t1(window) : new s1(window);
        int i10 = em0Var.f14011b;
        if (i10 != 0) {
            int iC = i.c(i10);
            if (iC == 0) {
                t1Var.r(false);
            } else if (iC == 1) {
                t1Var.r(true);
            }
        }
        Integer num = (Integer) em0Var.f14010a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) em0Var.f14013d;
        if (bool != null) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        int i11 = em0Var.f14012c;
        if (i11 != 0) {
            int iC2 = i.c(i11);
            if (iC2 == 0) {
                t1Var.q(false);
            } else if (iC2 == 1) {
                t1Var.q(true);
            }
        }
        Integer num2 = (Integer) em0Var.f14014e;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        Integer num3 = (Integer) em0Var.f14015f;
        if (num3 != null) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) em0Var.f14016g;
        if (bool2 != null) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f42856f = em0Var;
    }

    public int s() {
        char cCharAt;
        int i10 = this.f42852b;
        if (i10 == -1) {
            return i10;
        }
        String str = (String) this.f42856f;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f42852b = i10;
        return i10;
    }

    public boolean t() {
        int iS = s();
        String str = (String) this.f42856f;
        if (iS >= str.length() || iS == -1 || str.charAt(iS) != ',') {
            return false;
        }
        this.f42852b++;
        return true;
    }

    public String toString() {
        switch (this.f42851a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f42856f);
                sb2.append("', currentPosition=");
                return d5.u.g(sb2, this.f42852b, ')');
            default:
                return super.toString();
        }
    }

    public void u(char c4) {
        int i10 = this.f42852b;
        if (i10 > 0 && c4 == '\"') {
            try {
                this.f42852b = i10 - 1;
                String strK = k();
                this.f42852b = i10;
                if (n.a(strK, "null")) {
                    m(this.f42852b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f42852b = i10;
                throw th2;
            }
        }
        o(tn.g.b(c4), true);
        throw null;
    }

    public void v() {
        ((Activity) this.f42853c).getWindow().getDecorView().setSystemUiVisibility(this.f42852b);
        em0 em0Var = (em0) this.f42856f;
        if (em0Var != null) {
            r(em0Var);
        }
    }

    public f(String source) {
        this.f42851a = 3;
        n.f(source, "source");
        p pVar = new p((byte) 0, 13);
        pVar.f5364c = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        pVar.f5365d = iArr;
        pVar.f5363b = -1;
        this.f42853c = pVar;
        this.f42855e = new StringBuilder();
        this.f42856f = source;
    }

    public f(Activity activity, v6.c cVar, mi.d dVar) {
        this.f42851a = 1;
        io.flutter.plugin.platform.l lVar = new io.flutter.plugin.platform.l(this, 1);
        this.f42853c = activity;
        this.f42854d = cVar;
        cVar.f52488b = lVar;
        this.f42855e = dVar;
        this.f42852b = 1280;
    }

    public f(if1 if1Var, od.c cVar, byte[] bArr, mb.b[] bVarArr, int i10) {
        this.f42851a = 0;
        this.f42853c = if1Var;
        this.f42854d = cVar;
        this.f42855e = bArr;
        this.f42856f = bVarArr;
        this.f42852b = i10;
    }

    public f(t tVar, int i10) {
        this.f42851a = 4;
        this.f42856f = tVar;
        this.f42853c = new xd1(new byte[5], 5);
        this.f42854d = new SparseArray();
        this.f42855e = new SparseIntArray();
        this.f42852b = i10;
    }

    @Override // u3.r
    public void a(x xVar, m mVar, ga gaVar) {
    }
}
