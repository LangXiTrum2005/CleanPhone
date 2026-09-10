package com.thinkup.core.common.oom.o.o;

import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.m0n;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.mo0;
import com.thinkup.core.common.on.moo;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.oo.mm;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m implements com.thinkup.core.common.oom.o.m.o0 {
    private static final String o = "m";
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.oom.o.m.n f42303n;
    private final n o0 = new n();
    private mm oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.oom.o.o.m$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42304n;
        final /* synthetic */ n0 o;

        public AnonymousClass2(n0 n0Var, boolean z2, String str) {
            this.o = n0Var;
            this.m = z2;
            this.f42304n = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.o.nm0(this.m ? 1 : 2);
            this.o.omn(this.f42304n);
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(3, this.o);
        }
    }

    public m(String str, com.thinkup.core.common.oom.o.m.n nVar) {
        this.m = str;
        this.f42303n = nVar;
        try {
            this.oo = mm.o(o0n.m().on());
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.oom.o.m.o0
    public final void m(String str) {
        mm mmVar = this.oo;
        if (mmVar != null) {
            mmVar.m(str);
        }
    }

    @Override // com.thinkup.core.common.oom.o.m.o0
    public final moo o(String str) {
        mm mmVar = this.oo;
        if (mmVar != null) {
            return mmVar.o(str);
        }
        return null;
    }

    @Override // com.thinkup.core.common.oom.o.m.m
    public final void m() {
        n nVar = this.o0;
        if (nVar != null) {
            nVar.o();
        }
    }

    @Override // com.thinkup.core.common.oom.o.m.o0
    public final void o(final mo0 mo0Var) {
        n nVar;
        n0 n0VarMo;
        String strO;
        com.thinkup.core.common.oom.o.m.n nVar2 = this.f42303n;
        m0o m0oVarO = nVar2 != null ? nVar2.o() : null;
        if (m0oVarO == null || m0oVarO.o() || mo0Var == null || !mo0Var.m().equals(this.m)) {
            return;
        }
        if (mo0Var.o0() == com.thinkup.core.common.oom.o.o.m.f42302n && (n0VarMo = mo0Var.mo()) != null) {
            if (m0oVarO.oo() != null) {
                strO = com.thinkup.core.common.oom.o.o0.o.o(mo0Var.oo(), m0oVarO.oo().get(Integer.valueOf(mo0Var.n())));
            } else {
                strO = "";
            }
            boolean zMm = mo0Var.mm();
            if (!TextUtils.isEmpty(strO)) {
                com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass2(n0VarMo, zMm, strO));
            }
        }
        Map<Integer, m0n> mapOo = m0oVarO.oo();
        m0n m0nVar = mapOo != null ? mapOo.get(Integer.valueOf(mo0Var.n())) : null;
        if (m0nVar == null) {
            mo0Var.o();
            mo0Var.n();
            return;
        }
        mo0Var.o(m0nVar.m());
        if (m0oVarO.m() && (nVar = this.o0) != null) {
            nVar.o(mo0Var, m0nVar, m0oVarO);
        }
        com.thinkup.core.common.ooo.m.m.o().n(new Runnable() { // from class: com.thinkup.core.common.oom.o.o.m.1
            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.oo != null) {
                    m.this.oo.o(mo0Var);
                }
            }
        }, 13);
    }

    private void o(mo0 mo0Var, m0o m0oVar) {
        n0 n0VarMo;
        String strO;
        if (mo0Var == null || mo0Var.o0() != com.thinkup.core.common.oom.o.o.m.f42302n || (n0VarMo = mo0Var.mo()) == null) {
            return;
        }
        if (m0oVar != null && m0oVar.oo() != null) {
            strO = com.thinkup.core.common.oom.o.o0.o.o(mo0Var.oo(), m0oVar.oo().get(Integer.valueOf(mo0Var.n())));
        } else {
            strO = "";
        }
        boolean zMm = mo0Var.mm();
        if (TextUtils.isEmpty(strO)) {
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass2(n0VarMo, zMm, strO));
    }
}
