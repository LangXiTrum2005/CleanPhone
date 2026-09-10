package oa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends m implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47240b;

    public d0(Object obj, Object obj2) {
        this.f47239a = obj;
        this.f47240b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f47239a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f47240b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
