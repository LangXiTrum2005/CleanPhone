package com.mbridge.msdk.config.component.common.express;

import com.ironsource.X3;
import com.mbridge.msdk.config.component.common.express.node.f;
import com.mbridge.msdk.config.component.common.express.node.g;
import com.mbridge.msdk.config.component.common.express.node.h;
import com.mbridge.msdk.config.component.common.express.node.i;
import com.mbridge.msdk.config.component.common.express.node.j;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f31851a = Map.ofEntries(Map.entry(X3.j.f27830b, 0), Map.entry("+=", 0), Map.entry("-=", 0), Map.entry("*=", 0), Map.entry("/=", 0), Map.entry("%=", 0), Map.entry(com.mbridge.msdk.config.component.common.util.c.c("883"), 1), Map.entry(com.mbridge.msdk.config.component.common.util.c.c("882"), 2), Map.entry("==", 3), Map.entry("!=", 3), Map.entry(">", 4), Map.entry("<", 4), Map.entry(">=", 4), Map.entry("<=", 4), Map.entry(ScarConstants.IN_SIGNAL_KEY, 4), Map.entry("IN", 4), Map.entry("+", 5), Map.entry("-", 5), Map.entry("*", 6), Map.entry("/", 6), Map.entry("%", 6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f31852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31853c;

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + X3.j.f27830b);
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f31852b.get(this.f31853c).equals("(")) {
            return a(dVar, z10);
        }
        this.f31853c++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f31853c + 1;
        this.f31853c = i10;
        return i10 > this.f31852b.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f31852b = b(str);
        this.f31853c = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f31853c < this.f31852b.size() && (num = this.f31851a.get((str = this.f31852b.get(this.f31853c)))) != null && num.intValue() >= i10) {
            int i11 = this.f31853c + 1;
            this.f31853c = i11;
            if (i11 > this.f31852b.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        com.mbridge.msdk.config.component.common.express.node.d jVar;
        com.mbridge.msdk.config.component.common.express.node.e eVar;
        com.mbridge.msdk.config.component.common.express.node.d aVar;
        int i10;
        if (dVar == null) {
            List<String> list = this.f31852b;
            int i11 = this.f31853c;
            this.f31853c = i11 + 1;
            dVar = new i(list.get(i11));
        }
        int i12 = this.f31853c;
        while (this.f31853c < this.f31852b.size()) {
            boolean z11 = true;
            String strH = "";
            if (this.f31852b.get(this.f31853c - 1).startsWith("$") && this.f31853c >= i12) {
                while (true) {
                    if (this.f31853c - 1 < this.f31852b.size()) {
                        String str = this.f31852b.get(this.f31853c - 1);
                        if (this.f31853c != this.f31852b.size() && (this.f31853c >= this.f31852b.size() || ("!><".indexOf(this.f31852b.get(this.f31853c).charAt(0)) < 0 && !this.f31852b.get(this.f31853c).equals(com.mbridge.msdk.config.component.common.util.c.c("883")) && !this.f31852b.get(this.f31853c).equals(com.mbridge.msdk.config.component.common.util.c.c("882")) && !this.f31852b.get(this.f31853c).equals("IN")))) {
                            String str2 = this.f31852b.get(this.f31853c);
                            if (this.f31851a.containsKey(this.f31852b.get(this.f31853c)) || "/".indexOf(str2.charAt(0)) == 0) {
                                break;
                            }
                            if ("{[(.".indexOf(str2.charAt(0)) >= 0) {
                                this.f31853c = i12;
                                i12++;
                            } else {
                                strH = wi.d.h(strH, str);
                                this.f31853c++;
                            }
                        } else {
                            dVar = new i(wi.d.h(strH, str));
                            break;
                        }
                    }
                    z11 = false;
                    break;
                }
                if (z11) {
                    this.f31853c = i12;
                    return dVar;
                }
            } else if (this.f31852b.get(this.f31853c).equals(".")) {
                i12 = this.f31853c;
                List<String> list2 = this.f31852b;
                this.f31853c = i12 + 2;
                String str3 = list2.get(i12 + 1);
                if (this.f31853c < this.f31852b.size() && this.f31852b.get(this.f31853c).equals("(")) {
                    this.f31853c++;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 1;
                    while (this.f31853c < this.f31852b.size() && i13 > 0) {
                        String str4 = this.f31852b.get(this.f31853c);
                        if (str4.equals("(")) {
                            i13++;
                        } else if (str4.equals(")")) {
                            i13--;
                        }
                        if (i13 > 0) {
                            if (str4.equals(",") && i13 == 1) {
                                arrayList.add(new a().a(String.join(" ", arrayList2)));
                                arrayList2.clear();
                            } else {
                                arrayList2.add(str4);
                            }
                        }
                        this.f31853c++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new a().a(String.join(" ", arrayList2)));
                    }
                    eVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, str3, arrayList);
                    dVar = eVar;
                } else {
                    jVar = new j(dVar, str3);
                    dVar = jVar;
                }
            } else if (!this.f31852b.get(this.f31853c - 1).equals(X3.j.f27834d) && !this.f31852b.get(this.f31853c).equals(X3.j.f27834d)) {
                if (!this.f31852b.get(this.f31853c - 1).equals("{") && !this.f31852b.get(this.f31853c).equals("{")) {
                    if (this.f31852b.get(this.f31853c).equals(":")) {
                        i12 = this.f31853c;
                        String str5 = this.f31852b.get(i12 - 1);
                        int i14 = this.f31853c;
                        List<String> list3 = this.f31852b;
                        this.f31853c = i14 + 2;
                        jVar = new g(new a().a(String.join(" ", str5)), new a().a(String.join(" ", list3.get(i14 + 1))));
                        dVar = jVar;
                    } else {
                        i12 = this.f31853c;
                        String str6 = this.f31852b.get(i12 - 1);
                        if (this.f31853c < this.f31852b.size() && this.f31852b.get(this.f31853c).equals("(")) {
                            i iVar = new i("");
                            this.f31853c++;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int i15 = 1;
                            while (this.f31853c < this.f31852b.size() && i15 > 0) {
                                String str7 = this.f31852b.get(this.f31853c);
                                if (str7.equals("(")) {
                                    i15++;
                                } else if (str7.equals(")")) {
                                    i15--;
                                }
                                if (i15 > 0) {
                                    if (str7.equals(",") && i15 == 1) {
                                        arrayList3.add(new a().a(String.join(" ", arrayList4)));
                                        arrayList4.clear();
                                    } else {
                                        arrayList4.add(str7);
                                    }
                                }
                                this.f31853c++;
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList3.add(new a().a(String.join(" ", arrayList4)));
                            }
                            eVar = new com.mbridge.msdk.config.component.common.express.node.e(iVar, str6, arrayList3);
                            dVar = eVar;
                        } else {
                            if (this.f31853c >= this.f31852b.size() || this.f31851a.containsKey(this.f31852b.get(this.f31853c)) || "/".indexOf(str6.charAt(0)) == 0 || (z10 && ")".indexOf(this.f31852b.get(this.f31853c).charAt(0)) >= 0)) {
                                break;
                            }
                            this.f31853c++;
                        }
                    }
                } else {
                    if (this.f31852b.get(this.f31853c).equals("{")) {
                        int i16 = this.f31853c;
                        this.f31853c = i16 + 1;
                        i12 = i16;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i17 = 1;
                    while (this.f31853c < this.f31852b.size() && i17 > 0) {
                        String str8 = this.f31852b.get(this.f31853c);
                        if (str8.equals("{")) {
                            i17++;
                        } else if (str8.equals("}")) {
                            i17--;
                        }
                        if (i17 > 0) {
                            if (str8.equals(",") && i17 == 1) {
                                arrayList5.add(new a().a(String.join(" ", arrayList6)));
                                arrayList6.clear();
                            } else {
                                arrayList6.add(str8);
                            }
                        }
                        this.f31853c++;
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList5.add(new a().a(String.join(" ", arrayList6)));
                    }
                    aVar = new h(arrayList5);
                    dVar = aVar;
                }
            } else {
                if (this.f31852b.get(this.f31853c).equals(X3.j.f27834d)) {
                    i12 = this.f31853c;
                    this.f31853c = i12 + 1;
                }
                if (this.f31853c < this.f31852b.size() && this.f31852b.get(this.f31853c).equals("?")) {
                    this.f31853c++;
                    ArrayList arrayList7 = new ArrayList();
                    int i18 = 1;
                    while (this.f31853c < this.f31852b.size() && i18 > 0) {
                        String str9 = this.f31852b.get(this.f31853c);
                        if (str9.equals(X3.j.f27834d)) {
                            i18++;
                        } else if (str9.equals(X3.j.f27836e)) {
                            i18--;
                        }
                        if (i18 > 0) {
                            arrayList7.add(str9);
                        }
                        this.f31853c++;
                    }
                    com.mbridge.msdk.config.component.common.express.node.d dVarA = new a().a(String.join(" ", arrayList7));
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(dVarA);
                    aVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, com.mbridge.msdk.config.component.common.util.c.c("877"), arrayList8);
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    int i19 = this.f31853c;
                    int i20 = i19 - 2;
                    if (i20 >= 0 && ((i19 <= 2 || !this.f31852b.get(i20).equals("(")) && ((i10 = this.f31853c) <= 2 || !this.f31851a.containsKey(this.f31852b.get(i10 - 2))))) {
                        int i21 = 1;
                        while (this.f31853c < this.f31852b.size() && i21 > 0) {
                            String str10 = this.f31852b.get(this.f31853c);
                            if (str10.equals(X3.j.f27834d)) {
                                i21++;
                            } else if (str10.equals(X3.j.f27836e)) {
                                i21--;
                            }
                            if (i21 > 0) {
                                arrayList9.add(str10);
                            }
                            this.f31853c++;
                        }
                        jVar = new f(dVar, new a().a(String.join(" ", arrayList9)));
                        dVar = jVar;
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i22 = 1;
                        while (this.f31853c < this.f31852b.size() && i22 > 0) {
                            String str11 = this.f31852b.get(this.f31853c);
                            if (str11.equals(X3.j.f27834d)) {
                                i22++;
                            } else if (str11.equals(X3.j.f27836e)) {
                                i22--;
                            }
                            if (i22 > 0) {
                                if (str11.equals(",") && i22 == 1) {
                                    arrayList10.add(new a().a(String.join(" ", arrayList11)));
                                    arrayList11.clear();
                                } else {
                                    arrayList11.add(str11);
                                }
                            }
                            this.f31853c++;
                        }
                        if (!arrayList11.isEmpty()) {
                            arrayList10.add(new a().a(String.join(" ", arrayList11)));
                        }
                        aVar = new com.mbridge.msdk.config.component.common.express.node.a(arrayList10);
                    }
                }
                dVar = aVar;
            }
        }
        return dVar;
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
