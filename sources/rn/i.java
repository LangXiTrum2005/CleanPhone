package rn;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49719a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49720b = new n("kotlin.Long", pn.b.f48499h);

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        aVar.d(((Number) obj).longValue());
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        return Long.valueOf(decoder.f());
    }

    @Override // nn.a
    public final pn.d d() {
        return f49720b;
    }
}
