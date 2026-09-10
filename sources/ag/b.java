package ag;

import cg.l;
import cg.n;
import cg.o;
import cg.p;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends cg.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eg.b f3563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf.c f3564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cg.b f3565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2.e f3566g;

    public b(eg.b bVar, vf.c cVar) {
        super("Reader");
        this.f3563d = bVar;
        this.f3564e = cVar;
        this.f3565f = cg.b.f6383a;
        this.f3566g = new f2.e();
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        eg.b bVar = this.f3563d;
        boolean zF = bVar.f();
        f2.e eVar = this.f3566g;
        ec.a aVar = this.f6381b;
        if (zF) {
            aVar.a("Source is drained! Returning Eos as soon as possible.");
            wj.f fVarBuffer = ((c) e()).buffer();
            if (fVarBuffer == null) {
                aVar.c("Returning State.Wait because buffer is null.");
                return new o(true);
            }
            Object obj = fVarBuffer.f53283a;
            int iIntValue = ((Number) fVarBuffer.f53284b).intValue();
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            byteBuffer.limit(0);
            eVar.f40323d = byteBuffer;
            eVar.f40320a = false;
            eVar.f40322c = true;
            return new l(new d(eVar, iIntValue));
        }
        vf.c cVar = this.f3564e;
        if (!bVar.a(cVar)) {
            aVar.a("Returning State.Wait because source can't read " + cVar + " right now.");
            return new o(false);
        }
        wj.f fVarBuffer2 = ((c) e()).buffer();
        if (fVarBuffer2 == null) {
            aVar.c("Returning State.Wait because buffer is null.");
            return new o(true);
        }
        Object obj2 = fVarBuffer2.f53283a;
        int iIntValue2 = ((Number) fVarBuffer2.f53284b).intValue();
        eVar.f40323d = (ByteBuffer) obj2;
        bVar.e(eVar);
        return new n(new d(eVar, iIntValue2));
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f3565f;
    }
}
