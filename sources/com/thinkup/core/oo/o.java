package com.thinkup.core.oo;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private final int o;

    public o(m mVar) {
        this.o = mVar != null ? mVar.ooom() : 2;
    }

    public final void o(com.thinkup.core.common.n0.o0o o0oVar) {
        int i2 = this.o;
        if (i2 == 1) {
            new com.thinkup.core.common.n0.mn().o(0, o0oVar);
        } else {
            if (i2 == 2) {
                new com.thinkup.core.common.n0.o0.m().o(o0oVar);
                return;
            }
            com.thinkup.core.common.n0.nm nmVar = new com.thinkup.core.common.n0.nm(o0oVar);
            new com.thinkup.core.common.n0.mn().o(0, (com.thinkup.core.common.n0.o0o) nmVar);
            new com.thinkup.core.common.n0.o0.m().o(nmVar);
        }
    }

    public final int o() {
        return this.o;
    }
}
