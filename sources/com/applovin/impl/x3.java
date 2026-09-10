package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9991a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(a3 a3Var);
    }

    public void a(a aVar) {
        this.f9991a.add(aVar);
    }

    public void b(a aVar) {
        this.f9991a.remove(aVar);
    }

    public void a(a3 a3Var) {
        Iterator it = new ArrayList(this.f9991a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a3Var);
        }
    }
}
