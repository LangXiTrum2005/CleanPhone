package com.thinkup.core.common.o0m.m;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private final om m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42144n;
    private final n o;

    public o(n nVar, om omVar) {
        this.o = nVar;
        this.m = omVar;
    }

    public final void o() {
        if (this.f42144n) {
            return;
        }
        n nVar = this.o;
        if (nVar == null || !nVar.n()) {
            this.f42144n = true;
            om omVar = this.m;
            if (omVar == null || this.o == null) {
                return;
            }
            Map<String, Object> mapO = omVar.o();
            if (mapO == null || mapO.isEmpty()) {
                this.o.o0();
                return;
            }
            this.m.n();
            for (String str : mapO.keySet()) {
                com.thinkup.core.common.o0m.m.o();
                if (!com.thinkup.core.common.o0m.m.o(str) && !this.o.o(str)) {
                    this.o.o(str, mapO.get(str));
                }
            }
            this.o.o0();
            this.m.m();
        }
    }
}
