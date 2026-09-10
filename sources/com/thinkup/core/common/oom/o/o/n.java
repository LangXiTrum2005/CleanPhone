package com.thinkup.core.common.oom.o.o;

import android.text.TextUtils;
import com.thinkup.core.common.on.m0m;
import com.thinkup.core.common.on.m0n;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.mo0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static final long m = 3600000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f42305n = 30000;
    private static final String o = "n";
    private volatile List<m0m> o0;

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    public final void o(mo0 mo0Var, m0n m0nVar, m0o m0oVar) {
        List<m0m> list;
        if (this.o0 == null) {
            synchronized (this) {
                try {
                    if (this.o0 == null) {
                        this.o0 = new CopyOnWriteArrayList();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String strO = mo0Var.o();
        int iO0 = mo0Var.o0();
        m0m m0mVarO = o(strO, this.o0);
        if (iO0 == com.thinkup.core.common.oom.o.o.m.m) {
            list = this.o0;
            if (m0mVarO != null && list != null) {
                list.remove(m0mVarO);
            }
        } else if (iO0 == com.thinkup.core.common.oom.o.o.m.f42302n) {
            String strO2 = com.thinkup.core.common.oom.o.o0.o.o(mo0Var.oo(), m0nVar);
            mo0Var.o(strO2);
            if (TextUtils.isEmpty(strO2)) {
                list = this.o0;
                if (m0mVarO != null) {
                    list.remove(m0mVarO);
                }
            } else {
                List<m0m> list2 = this.o0;
                if (m0mVarO != null) {
                    long jM = m0mVarO.m();
                    long j = jM > 0 ? jM * 2 : 30000L;
                    if (j >= 3600000) {
                        j = 3600000;
                    }
                    m0mVarO.o(j);
                } else {
                    m0m m0mVarO2 = m0m.o(strO, com.thinkup.core.common.oom.o.o.C0687o.m);
                    m0mVarO2.o(30000L);
                    if (list2 != null) {
                        list2.add(m0mVarO2);
                    }
                }
            }
        }
        m0oVar.m(this.o0);
    }

    public final void o() {
        if (this.o0 != null) {
            this.o0.clear();
        }
    }

    private static m0m o(String str, List<m0m> list) {
        if (list != null && !list.isEmpty()) {
            for (m0m m0mVar : list) {
                if (m0mVar.n().equals(str)) {
                    return m0mVar;
                }
            }
        }
        return null;
    }

    private static void o(String str, m0m m0mVar, List<m0m> list) {
        if (m0mVar != null) {
            long jM = m0mVar.m();
            long j = jM > 0 ? 2 * jM : 30000L;
            if (j >= 3600000) {
                j = 3600000;
            }
            m0mVar.o(j);
            return;
        }
        m0m m0mVarO = m0m.o(str, com.thinkup.core.common.oom.o.o.C0687o.m);
        m0mVarO.o(30000L);
        if (list != null) {
            list.add(m0mVarO);
        }
    }

    private static void o(m0m m0mVar, List<m0m> list) {
        if (m0mVar == null || list == null) {
            return;
        }
        list.remove(m0mVar);
    }
}
