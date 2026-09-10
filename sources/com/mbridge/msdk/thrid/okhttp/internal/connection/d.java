package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c0> f36309a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f36309a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f36309a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f36309a.contains(c0Var);
    }
}
