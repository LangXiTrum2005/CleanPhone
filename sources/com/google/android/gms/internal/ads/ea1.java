package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends mb1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa1 f13918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mb1 f13920d;

    public ea1(ka1 ka1Var) {
        super(0);
        Objects.requireNonNull(ka1Var);
        this.f13918b = ka1Var.f16399d.entrySet().q().listIterator(0);
        this.f13919c = null;
        this.f13920d = ma1.f17367e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13920d.hasNext() || this.f13918b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.mb1, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f13920d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13918b.next();
            this.f13919c = entry.getKey();
            this.f13920d = ((y91) entry.getValue()).h();
        }
        Object obj = this.f13919c;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f13920d.next());
    }
}
