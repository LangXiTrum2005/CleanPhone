package rn;

import com.google.android.gms.internal.ads.kj1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements nn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f49713a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49714b = new n("kotlin.Int", pn.b.f48498g);

    @Override // nn.a
    public final void a(f4.a aVar, Object obj) {
        aVar.c(((Number) obj).intValue());
    }

    @Override // nn.a
    public final Object b(kj1 decoder) {
        kotlin.jvm.internal.n.f(decoder, "decoder");
        return Integer.valueOf(decoder.d());
    }

    @Override // nn.a
    public final pn.d d() {
        return f49714b;
    }
}
