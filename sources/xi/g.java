package xi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f53816a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.s f53817b;

    public g(r1.s sVar) {
        this.f53817b = sVar;
    }

    public final void a(String str, String str2) {
        if (this.f53816a.get()) {
            return;
        }
        r1.s sVar = this.f53817b;
        if (((AtomicReference) sVar.f49339c).get() != this) {
            return;
        }
        qd.i iVar = (qd.i) sVar.f49340d;
        ((f) iVar.f48980b).i((String) iVar.f48981c, ((q) iVar.f48982d).f(str, str2, null));
    }

    public final void b(Object obj) {
        if (this.f53816a.get()) {
            return;
        }
        r1.s sVar = this.f53817b;
        if (((AtomicReference) sVar.f49339c).get() != this) {
            return;
        }
        qd.i iVar = (qd.i) sVar.f49340d;
        ((f) iVar.f48980b).i((String) iVar.f48981c, ((q) iVar.f48982d).b(obj));
    }
}
