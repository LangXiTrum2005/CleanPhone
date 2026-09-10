package com.thinkup.core.common.oom.o.o;

import com.thinkup.core.common.on.m0m;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.o0mm;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o implements com.thinkup.core.common.oom.o.m.n {
    private static final String o = "o";
    private m0o m;

    @Override // com.thinkup.core.common.oom.o.m.m
    public final void m() {
        this.m = null;
    }

    @Override // com.thinkup.core.common.oom.o.m.n
    public final void o(m0o m0oVar) {
        this.m = m0oVar;
    }

    @Override // com.thinkup.core.common.oom.o.m.n
    public final m0o o() {
        return this.m;
    }

    @Override // com.thinkup.core.common.oom.o.m.n
    public final m0m o(o0mm o0mmVar) {
        m0o m0oVar = this.m;
        if (m0oVar == null || o0mmVar == null) {
            return null;
        }
        List<m0m> listO0 = m0oVar.o0();
        List<m0m> listOm = this.m.om();
        m0m m0mVarO = o(o0mmVar.m0o(), listO0);
        return (m0mVarO == null && this.m.m()) ? o(o0mmVar.m0o(), listOm) : m0mVarO;
    }

    private static m0m o(String str, List<m0m> list) {
        if (list != null && !list.isEmpty()) {
            for (m0m m0mVar : list) {
                if (str.equals(m0mVar.n())) {
                    if (m0mVar.o0() != com.thinkup.core.common.oom.o.o.C0687o.m || System.currentTimeMillis() <= m0mVar.o()) {
                        return m0mVar;
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
