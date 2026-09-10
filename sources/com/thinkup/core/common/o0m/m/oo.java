package com.thinkup.core.common.o0m.m;

import com.thinkup.core.common.n.oo0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class oo implements com.thinkup.core.common.o0m.o {
    private static final String o = "oo";
    private n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private om f42146n;
    private o o0;
    private String om;
    private int on;
    private final com.thinkup.core.common.o0m.n oo;

    public oo(com.thinkup.core.common.o0m.n nVar) {
        this.oo = nVar;
        this.om = nVar.m();
        this.on = nVar.n();
        this.m = o0.o(nVar);
        om omVarM = o0.m(nVar);
        this.f42146n = omVarM;
        this.o0 = new o(this.m, omVarM);
        nVar.o0();
    }

    private n o0() {
        com.thinkup.core.common.o0m.n nVar = this.oo;
        if (nVar != null) {
            return o(nVar.o0());
        }
        return null;
    }

    private boolean oo(String str) {
        n nVarO0 = o0();
        return nVarO0 != null && nVarO0.o(str);
    }

    @Override // com.thinkup.core.common.o0m.o
    public final <V> V m(String str, V v) {
        om omVar;
        if (n(str)) {
            n nVarO0 = o0();
            return nVarO0 != null ? (V) nVarO0.m(str, v) : v;
        }
        if (this.on == 0 && (omVar = this.f42146n) != null) {
            return (V) omVar.m(str, v);
        }
        n nVar = this.m;
        if (nVar == null) {
            return v;
        }
        V v2 = (V) nVar.m(str, v);
        if ((v2 != null && v2 != v) || this.m.n()) {
            return v2;
        }
        om omVar2 = this.f42146n;
        return (V) (omVar2 != null ? omVar2.m(str, v) : null);
    }

    public final void n() {
        o oVar = this.o0;
        if (oVar == null || this.on != 1) {
            return;
        }
        oVar.o();
    }

    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v) {
        com.thinkup.core.common.o0m.n nVar = this.oo;
        if (nVar != null) {
            o(str, v, nVar.o0());
        } else {
            o(str, v, 1);
        }
    }

    private void o0(String str) {
        n nVarO0 = o0();
        if (nVarO0 != null) {
            nVarO0.m(str);
        }
    }

    private boolean n(String str) {
        com.thinkup.core.common.o0m.m.o();
        return com.thinkup.core.common.o0m.m.o(str) && oo0.m.o.equals(this.om);
    }

    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v, int i2) {
        n nVar;
        if (n(str)) {
            m(str, v, i2);
            return;
        }
        if (this.on == 1 && (nVar = this.m) != null) {
            nVar.o(str, v, i2);
            return;
        }
        om omVar = this.f42146n;
        if (omVar != null) {
            omVar.o(str, v, i2);
        }
    }

    private <V> V n(String str, V v) {
        n nVarO0 = o0();
        return nVarO0 != null ? (V) nVarO0.m(str, v) : v;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m(String str) {
        n nVar;
        if (n(str)) {
            n nVarO0 = o0();
            if (nVarO0 != null) {
                nVarO0.m(str);
                return;
            }
            return;
        }
        if (this.on == 1 && (nVar = this.m) != null && nVar.n()) {
            this.m.m(str);
            return;
        }
        om omVar = this.f42146n;
        if (omVar != null) {
            omVar.m(str);
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final Map<String, Object> o() {
        n nVar;
        if (this.on == 1 && (nVar = this.m) != null && nVar.n()) {
            return this.m.o();
        }
        om omVar = this.f42146n;
        if (omVar != null) {
            return omVar.o();
        }
        return null;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final boolean o(String str) {
        n nVar;
        if (n(str)) {
            n nVarO0 = o0();
            return nVarO0 != null && nVarO0.o(str);
        }
        if (this.on == 1 && (nVar = this.m) != null && nVar.n()) {
            return this.m.o(str);
        }
        om omVar = this.f42146n;
        if (omVar != null) {
            return omVar.o(str);
        }
        return false;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m() {
        n nVar;
        if (this.on == 1 && (nVar = this.m) != null && nVar.n()) {
            this.m.m();
            return;
        }
        om omVar = this.f42146n;
        if (omVar != null) {
            omVar.m();
        }
    }

    private <V> void m(String str, V v, int i2) {
        n nVarO = o(i2);
        if (nVarO != null) {
            nVarO.o(str, v);
        }
    }

    private void o(com.thinkup.core.common.o0m.n nVar) {
        this.om = nVar.m();
        this.on = nVar.n();
        this.m = o0.o(nVar);
        om omVarM = o0.m(nVar);
        this.f42146n = omVarM;
        this.o0 = new o(this.m, omVarM);
    }

    private n o(int i2) {
        if (this.oo == null) {
            return null;
        }
        return o0.o(new com.thinkup.core.common.o0m.n.o().o(this.oo.o()).o(oo0.m.o0m).o(this.oo.n()).m(i2).o());
    }
}
