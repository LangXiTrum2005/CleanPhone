package com.thinkup.core.common.no.m.o.n;

import com.p004ironsource.dc;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.nm;
import com.thinkup.core.common.no.m.no;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oom;
import com.thinkup.core.common.no.m.ooo;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    private static final com.thinkup.core.common.no.n.om o = com.thinkup.core.common.no.n.om.o("\"\\");
    private static final com.thinkup.core.common.no.n.om m = com.thinkup.core.common.no.n.om.o("\t ,=");

    private oo() {
    }

    public static boolean m(m00 m00Var) {
        return n(m00Var.om()).contains("*");
    }

    private static Set<String> n(ooo oooVar) {
        Set<String> treeSet = Collections.EMPTY_SET;
        int iO = oooVar.o();
        for (int i2 = 0; i2 < iO; i2++) {
            if ("Vary".equalsIgnoreCase(oooVar.o(i2))) {
                String strM = oooVar.m(i2);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    public static long o(m00 m00Var) {
        return o(m00Var.om().o("Content-Length"));
    }

    private static String o0(com.thinkup.core.common.no.n.n nVar) {
        try {
            long jN = nVar.n(m);
            if (jN == -1) {
                jN = nVar.m();
            }
            if (jN != 0) {
                return nVar.oo(jN);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static Set<String> oo(m00 m00Var) {
        return n(m00Var.om());
    }

    private static boolean m(ooo oooVar) {
        return n(oooVar).contains("*");
    }

    private static long o(ooo oooVar) {
        return o(oooVar.o("Content-Length"));
    }

    private static int m(com.thinkup.core.common.no.n.n nVar) {
        int i2 = 0;
        while (!nVar.on() && nVar.n(0L) == 61) {
            i2++;
            nVar.mn();
        }
        return i2;
    }

    private static long o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static ooo o(ooo oooVar, ooo oooVar2) {
        Set<String> setN = n(oooVar2);
        if (setN.isEmpty()) {
            return com.thinkup.core.common.no.m.o.n.f42026n;
        }
        ooo.o oVar = new ooo.o();
        int iO = oooVar.o();
        for (int i2 = 0; i2 < iO; i2++) {
            String strO = oooVar.o(i2);
            if (setN.contains(strO)) {
                oVar.o(strO, oooVar.m(i2));
            }
        }
        return oVar.o();
    }

    public static boolean o0(m00 m00Var) {
        if (m00Var.o().m().equals("HEAD")) {
            return false;
        }
        int iN = m00Var.n();
        return (((iN >= 100 && iN < 200) || iN == 204 || iN == 304) && o(m00Var) == -1 && !"chunked".equalsIgnoreCase(m00Var.o("Transfer-Encoding"))) ? false : true;
    }

    public static int m(String str, int i2) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static ooo n(m00 m00Var) {
        ooo oooVarN = m00Var.mo().o().n();
        Set<String> setN = n(m00Var.om());
        if (setN.isEmpty()) {
            return com.thinkup.core.common.no.m.o.n.f42026n;
        }
        ooo.o oVar = new ooo.o();
        int iO = oooVarN.o();
        for (int i2 = 0; i2 < iO; i2++) {
            String strO = oooVarN.o(i2);
            if (setN.contains(strO)) {
                oVar.o(strO, oooVarN.m(i2));
            }
        }
        return oVar.o();
    }

    public static List<com.thinkup.core.common.no.m.m0> o(ooo oooVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < oooVar.o(); i2++) {
            if (str.equalsIgnoreCase(oooVar.o(i2))) {
                o(arrayList, new com.thinkup.core.common.no.n.n().m(oooVar.m(i2)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[EDGE_INSN: B:61:0x00b6->B:50:0x00b6 BREAK  A[LOOP:2: B:22:0x0065->B:49:0x00b4], SYNTHETIC] */
    private static void o(List<com.thinkup.core.common.no.m.m0> list, com.thinkup.core.common.no.n.n nVar) {
        String strO0;
        while (true) {
            String strO1 = null;
            while (true) {
                if (strO1 == null) {
                    o(nVar);
                    strO1 = o0(nVar);
                    if (strO1 == null) {
                        return;
                    }
                }
                boolean zO = o(nVar);
                String strO2 = o0(nVar);
                if (strO2 == null) {
                    if (nVar.on()) {
                        list.add(new com.thinkup.core.common.no.m.m0(strO1, (Map<String, String>) Collections.EMPTY_MAP));
                        return;
                    }
                    return;
                }
                int iM = m(nVar);
                boolean zO2 = o(nVar);
                if (!zO && (zO2 || nVar.on())) {
                    char[] cArr = new char[iM];
                    Arrays.fill(cArr, dc.T);
                    list.add(new com.thinkup.core.common.no.m.m0(strO1, (Map<String, String>) Collections.singletonMap(null, strO2.concat(new String(cArr)))));
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iM2 = iM + m(nVar);
                    while (true) {
                        if (strO2 != null) {
                            if (iM2 != 0) {
                                break;
                                break;
                            }
                            if (iM2 <= 1) {
                                return;
                            }
                            if (nVar.on()) {
                                strO0 = o0(nVar);
                            } else {
                                strO0 = o0(nVar);
                            }
                            if (strO0 != null) {
                                return;
                            }
                            if (o(nVar)) {
                            }
                            strO2 = null;
                        } else {
                            strO2 = o0(nVar);
                            if (!o(nVar)) {
                                iM2 = m(nVar);
                                if (iM2 != 0) {
                                    break;
                                }
                                if (iM2 <= 1 || o(nVar)) {
                                    return;
                                }
                                if (nVar.on() && nVar.n(0L) == 34) {
                                    strO0 = n(nVar);
                                } else {
                                    strO0 = o0(nVar);
                                }
                                if (strO0 != null || ((String) linkedHashMap.put(strO2, strO0)) != null) {
                                    return;
                                }
                                if (o(nVar) && !nVar.on()) {
                                    return;
                                } else {
                                    strO2 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new com.thinkup.core.common.no.m.m0(strO1, linkedHashMap));
                    strO1 = strO2;
                }
            }
        }
    }

    private static String n(com.thinkup.core.common.no.n.n nVar) {
        if (nVar.mn() == 34) {
            com.thinkup.core.common.no.n.n nVar2 = new com.thinkup.core.common.no.n.n();
            while (true) {
                long jN = nVar.n(o);
                if (jN == -1) {
                    return null;
                }
                if (nVar.n(jN) == 34) {
                    nVar2.o(nVar, jN);
                    nVar.mn();
                    return nVar2.ooo();
                }
                if (nVar.m() == jN + 1) {
                    return null;
                }
                nVar2.o(nVar, jN);
                nVar.mn();
                nVar2.o(nVar, 1L);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static boolean o(com.thinkup.core.common.no.n.n nVar) {
        boolean z2 = false;
        while (!nVar.on()) {
            byte bN = nVar.n(0L);
            if (bN != 44) {
                if (bN != 32 && bN != 9) {
                    break;
                }
                nVar.mn();
            } else {
                nVar.mn();
                z2 = true;
            }
        }
        return z2;
    }

    private static String o(int i2) {
        char[] cArr = new char[i2];
        Arrays.fill(cArr, dc.T);
        return new String(cArr);
    }

    public static void o(nm nmVar, oom oomVar, ooo oooVar) {
        if (nmVar == nm.o) {
            return;
        }
        no.o(oomVar, oooVar).isEmpty();
    }

    public static int o(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static int o(String str, int i2) {
        char cCharAt;
        while (i2 < str.length() && ((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\t')) {
            i2++;
        }
        return i2;
    }

    public static boolean o(m00 m00Var, ooo oooVar, onm onmVar) {
        for (String str : n(m00Var.om())) {
            if (!Objects.equals(oooVar.m(str), onmVar.m(str))) {
                return false;
            }
        }
        return true;
    }
}
