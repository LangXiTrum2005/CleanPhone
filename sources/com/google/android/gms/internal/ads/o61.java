package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u61 f18179b;

    public o61(u61 u61Var, Set set) {
        this.f18178a = set;
        this.f18179b = u61Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.f18178a.iterator();
        while (it.hasNext()) {
            ((p61) it.next()).c(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f18178a.iterator();
        while (it.hasNext()) {
            ((p61) it.next()).a(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.f18178a.iterator();
        while (it.hasNext()) {
            ((p61) it.next()).b(map);
        }
        return map;
    }
}
