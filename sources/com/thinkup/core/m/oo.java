package com.thinkup.core.m;

import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.on.mm;
import com.thinkup.core.common.on.mo;
import com.thinkup.core.common.on.o0mm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    private static final String o = "AdSourceFltRuleHandler";
    private final com.thinkup.core.common.oo.o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Long> f42396n = new ConcurrentHashMap();
    private final Map<String, Pair<Integer, Long>> oo = new ConcurrentHashMap();
    private final Set<String> o0 = new CopyOnWriteArraySet();

    public oo(com.thinkup.core.common.oo.o oVar) {
        this.m = oVar;
    }

    public final mo m(o0mm o0mmVar) {
        com.thinkup.core.common.on.o0 o0VarO;
        try {
            String strM0o = o0mmVar.m0o();
            int iO = o0mmVar.m0m0().o();
            if (TextUtils.isEmpty(strM0o)) {
                return null;
            }
            Long l2 = this.f42396n.get(strM0o);
            boolean z2 = false;
            if (l2 == null ? !((o0VarO = o("4", strM0o, iO)) == null || o0VarO.nm() <= System.currentTimeMillis()) : l2.longValue() > System.currentTimeMillis()) {
                z2 = true;
            }
            if (z2) {
                if (iO == 1) {
                    return new mo(32, ErrorCode.getErrorCode(ErrorCode.noFillNcError, "", ""));
                }
                if (iO == 2) {
                    return new mo(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
                }
                if (iO != 3) {
                    return null;
                }
                return new mo(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final void n(o0mm o0mmVar) {
        try {
            mm mmVarM0m0 = o0mmVar.m0m0();
            if (mmVarM0m0 == null) {
                return;
            }
            int iO = mmVarM0m0.o();
            String strM0o = o0mmVar.m0o();
            if (iO == 1 && !TextUtils.isEmpty(strM0o)) {
                List<Pair<String, String>> listM = m("4", strM0o, iO);
                if (this.o0.contains(strM0o)) {
                    return;
                }
                this.o0.add(strM0o);
                this.f42396n.remove(strM0o);
                this.m.o(listM);
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(o0mm o0mmVar) {
        try {
            mm mmVarM0m0 = o0mmVar.m0m0();
            int iO = mmVarM0m0.o();
            if (iO != 3) {
                return;
            }
            String strM0o = o0mmVar.m0o();
            if (TextUtils.isEmpty(strM0o)) {
                return;
            }
            com.thinkup.core.common.on.o0 o0VarO = o("3", strM0o, iO);
            int i2 = 1;
            boolean z2 = o0VarO != null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z2) {
                long jMo = o0VarO.mo();
                if (jCurrentTimeMillis < mmVarM0m0.o0() + jMo) {
                    i2 = 1 + o0VarO.o;
                    jCurrentTimeMillis = jMo;
                }
            } else {
                o0VarO = new com.thinkup.core.common.on.o0("3");
                o0VarO.o(strM0o);
                o0VarO.o(iO);
            }
            o0VarO.o(jCurrentTimeMillis);
            o0VarO.o = i2;
            this.oo.put(strM0o, new Pair<>(Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis)));
            this.m.o(o0VarO, z2);
        } catch (Throwable unused) {
        }
    }

    public final void o0(o0mm o0mmVar) {
        com.thinkup.core.common.on.o0 o0VarO;
        long jOm;
        long j;
        try {
            mm mmVarM0m0 = o0mmVar.m0m0();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iO = mmVarM0m0.o();
            String strM0o = o0mmVar.m0o();
            if (TextUtils.isEmpty(strM0o)) {
                return;
            }
            o0mmVar.m0o();
            com.thinkup.core.common.on.o0 o0Var = new com.thinkup.core.common.on.o0("4");
            com.thinkup.core.common.on.o0 o0Var2 = null;
            if (iO == 3) {
                boolean zContainsKey = this.oo.containsKey(strM0o);
                Pair<Integer, Long> pair = this.oo.get(strM0o);
                if (!zContainsKey || pair == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.m0, d9.i.f24747b), strM0o));
                    arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.nn, d9.i.f24747b), String.valueOf(iO)));
                    o0VarO = null;
                    for (com.thinkup.core.common.on.o0 o0Var3 : this.m.o(arrayList, 2)) {
                        if ("4".equals(o0Var3.o())) {
                            o0VarO = o0Var3;
                        } else if ("3".equals(o0Var3.o())) {
                            o0Var2 = o0Var3;
                        }
                    }
                } else {
                    int iIntValue = ((Integer) pair.first).intValue();
                    long jLongValue = ((Long) pair.second).longValue();
                    o0Var2 = new com.thinkup.core.common.on.o0("3");
                    o0Var2.o = iIntValue;
                    o0Var2.o(jLongValue);
                    o0Var2.o(3);
                    o0VarO = o("4", strM0o, iO);
                }
            } else {
                o0VarO = o("4", strM0o, iO);
            }
            boolean z2 = o0VarO != null;
            if (z2) {
                o0VarO.oo();
                int iNo = o0VarO.no() + 1;
                long jMo = o0VarO.mo();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int iO2 = mmVarM0m0.o();
                if (iO2 != 1) {
                    if (iO2 != 2) {
                        if (iO2 == 3) {
                            if (jCurrentTimeMillis2 >= jMo + mmVarM0m0.o0()) {
                                o0VarO.o(jCurrentTimeMillis2);
                                iNo = 1;
                            } else {
                                int i2 = o0Var2 != null ? o0Var2.o : 0;
                                if (i2 > 0 && i2 >= mmVarM0m0.on() && (iNo * 100) / i2 >= mmVarM0m0.oo()) {
                                    jOm = mmVarM0m0.om();
                                    j = jCurrentTimeMillis2 + jOm;
                                }
                            }
                        }
                        j = 0;
                    } else {
                        if (jCurrentTimeMillis2 >= jMo + mmVarM0m0.o0()) {
                            o0VarO.o(jCurrentTimeMillis2);
                            iNo = 1;
                        } else if (iNo >= mmVarM0m0.n()) {
                            jOm = mmVarM0m0.om();
                            j = jCurrentTimeMillis2 + jOm;
                        }
                        j = 0;
                    }
                } else if (iNo >= mmVarM0m0.m()) {
                    jOm = mmVarM0m0.om();
                    j = jCurrentTimeMillis2 + jOm;
                } else {
                    j = 0;
                }
                if (j > 0) {
                    mmVarM0m0.o();
                }
                o0VarO.m(j);
                o0VarO.m(iNo);
                o0Var = o0VarO;
            } else {
                o0Var.o(strM0o);
                o0Var.o(iO);
                o0Var.o(jCurrentTimeMillis);
                o0Var.m(1);
                o0Var.m(0L);
            }
            if (iO == 1) {
                this.o0.remove(strM0o);
            }
            if (iO == 3 && o0Var2 != null) {
                o0Var.o(o0Var2.mo());
            }
            this.f42396n.put(strM0o, Long.valueOf(o0Var.nm()));
            this.m.o(o0Var, z2);
        } catch (Throwable unused) {
        }
    }

    private static List<Pair<String, String>> m(String str, String str2, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.m, d9.i.f24747b), str));
        arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.m0, d9.i.f24747b), str2));
        arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.nn, d9.i.f24747b), String.valueOf(i2)));
        return arrayList;
    }

    private static com.thinkup.core.common.on.o0 o(mm mmVar, com.thinkup.core.common.on.o0 o0Var, com.thinkup.core.common.on.o0 o0Var2) {
        long jOm;
        long j;
        o0Var2.oo();
        int iNo = o0Var2.no() + 1;
        long jMo = o0Var2.mo();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iO = mmVar.o();
        if (iO != 1) {
            if (iO != 2) {
                if (iO == 3) {
                    if (jCurrentTimeMillis >= mmVar.o0() + jMo) {
                        o0Var2.o(jCurrentTimeMillis);
                        iNo = 1;
                    } else {
                        int i2 = o0Var != null ? o0Var.o : 0;
                        if (i2 > 0 && i2 >= mmVar.on() && (iNo * 100) / i2 >= mmVar.oo()) {
                            jOm = mmVar.om();
                            j = jOm + jCurrentTimeMillis;
                        }
                    }
                }
                j = 0;
            } else {
                if (jCurrentTimeMillis >= mmVar.o0() + jMo) {
                    o0Var2.o(jCurrentTimeMillis);
                    iNo = 1;
                } else if (iNo >= mmVar.n()) {
                    jOm = mmVar.om();
                    j = jOm + jCurrentTimeMillis;
                }
                j = 0;
            }
        } else if (iNo >= mmVar.m()) {
            jOm = mmVar.om();
            j = jOm + jCurrentTimeMillis;
        } else {
            j = 0;
        }
        if (j > 0) {
            mmVar.o();
        }
        o0Var2.m(j);
        o0Var2.m(iNo);
        return o0Var2;
    }

    private static mo o(int i2) {
        if (i2 == 1) {
            return new mo(32, ErrorCode.getErrorCode(ErrorCode.noFillNcError, "", ""));
        }
        if (i2 == 2) {
            return new mo(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
        }
        if (i2 != 3) {
            return null;
        }
        return new mo(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
    }

    private static String o(String str) {
        return o(str, d9.i.f24747b);
    }

    private static String o(String str, String str2) {
        return a.n(str, " ", str2, " ?");
    }

    private com.thinkup.core.common.on.o0 o(String str, String str2, int i2) {
        List<com.thinkup.core.common.on.o0> listO = this.m.o(m(str, str2, i2), 1);
        if (listO.isEmpty()) {
            return null;
        }
        return listO.get(0);
    }

    private List<com.thinkup.core.common.on.o0> o(String str, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.m0, d9.i.f24747b), str));
        arrayList.add(new Pair(o(com.thinkup.core.common.oo.o.C0684o.nn, d9.i.f24747b), String.valueOf(i2)));
        return this.m.o(arrayList, 2);
    }
}
