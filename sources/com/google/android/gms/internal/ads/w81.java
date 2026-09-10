package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f21453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f21454b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f21455c = na1.f17728a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua1 f21456d;

    public w81(ua1 ua1Var) {
        this.f21456d = ua1Var;
        this.f21453a = ua1Var.f20713d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21453a.hasNext() || this.f21455c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21455c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f21453a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f21454b = collection;
            this.f21455c = collection.iterator();
        }
        return this.f21455c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21455c.remove();
        Collection collection = this.f21454b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f21453a.remove();
        }
        this.f21456d.f20714e--;
    }
}
