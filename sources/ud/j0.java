package ud;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements s0.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f52114a;

    public j0(t0 sessionGenerator) {
        kotlin.jvm.internal.n.f(sessionGenerator, "sessionGenerator");
        this.f52114a = sessionGenerator;
    }

    @Override // s0.a1
    public final Object getDefaultValue() {
        return new i0(this.f52114a.a(null), null, null);
    }

    @Override // s0.a1
    public final Object readFrom(InputStream inputStream, ak.f fVar) throws s0.b {
        try {
            sn.b bVar = sn.b.f50282d;
            String str = new String(no.b.E(inputStream), an.a.f3768a);
            bVar.getClass();
            return (i0) bVar.a(i0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new s0.b("Cannot parse session data", e10);
        }
    }

    @Override // s0.a1
    public final Object writeTo(Object obj, OutputStream outputStream, ak.f fVar) throws IOException {
        byte[] bytes = sn.b.f50282d.b(i0.Companion.serializer(), (i0) obj).getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return wj.r.f53297a;
    }
}
