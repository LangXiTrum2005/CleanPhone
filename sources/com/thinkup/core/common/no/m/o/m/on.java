package com.thinkup.core.common.no.m.o.m;

import com.thinkup.core.common.no.m.m0m;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class on {
    private final Set<m0m> o = new LinkedHashSet();

    public final synchronized void m(m0m m0mVar) {
        this.o.remove(m0mVar);
    }

    public final synchronized boolean n(m0m m0mVar) {
        return this.o.contains(m0mVar);
    }

    public final synchronized void o(m0m m0mVar) {
        this.o.add(m0mVar);
    }
}
