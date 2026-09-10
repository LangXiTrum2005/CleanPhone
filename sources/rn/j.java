package rn;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nn.a f49721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f49722b;

    public j(nn.a serializer) {
        kotlin.jvm.internal.n.f(serializer, "serializer");
        this.f49721a = serializer;
        this.f49722b = new o(serializer.d());
    }

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        if (obj != null) {
            aVar.i(this.f49721a, obj);
        } else {
            aVar.f();
        }
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        if (decoder.h()) {
            return decoder.k(this.f49721a);
        }
        return null;
    }

    @Override // nn.a
    public final pn.d d() {
        return this.f49722b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && kotlin.jvm.internal.n.a(this.f49721a, ((j) obj).f49721a);
    }

    public final int hashCode() {
        return this.f49721a.hashCode();
    }
}
