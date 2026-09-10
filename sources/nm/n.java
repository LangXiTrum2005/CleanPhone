package nm;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f46849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(jk.a aVar, int i10) {
        super(0);
        this.f46848e = i10;
        switch (i10) {
            case 1:
                this.f46849f = (kotlin.jvm.internal.o) aVar;
                super(0);
                break;
            default:
                this.f46849f = (kotlin.jvm.internal.o) aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [jk.a, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r1v5, types: [jk.a, kotlin.jvm.internal.o] */
    @Override // jk.a
    public final Object invoke() {
        switch (this.f46848e) {
            case 0:
                return xj.n.R0((Iterable) this.f46849f.invoke());
            default:
                try {
                    return (List) this.f46849f.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return v.f53866a;
                }
        }
    }
}
