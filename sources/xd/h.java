package xd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import s0.a1;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f53753a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f53754b = new g(null, null, null, null, null);

    @Override // s0.a1
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return f53754b;
    }

    @Override // s0.a1
    public final Object readFrom(InputStream inputStream, ak.f fVar) throws s0.b {
        try {
            sn.b bVar = sn.b.f50282d;
            String str = new String(no.b.E(inputStream), an.a.f3768a);
            bVar.getClass();
            return (g) bVar.a(g.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new s0.b("Cannot parse session configs", e10);
        }
    }

    @Override // s0.a1
    public final Object writeTo(Object obj, OutputStream outputStream, ak.f fVar) throws IOException {
        byte[] bytes = sn.b.f50282d.b(g.Companion.serializer(), (g) obj).getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return r.f53297a;
    }
}
