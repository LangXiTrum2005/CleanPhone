package j0;

import ea.f2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43560b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f43559a = i10;
        this.f43560b = obj;
    }

    @Override // l0.a
    public final void accept(Object obj) {
        switch (this.f43559a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((f2) this.f43560b).x(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f43565c) {
                    try {
                        x.i iVar = g.f43566d;
                        ArrayList arrayList = (ArrayList) iVar.get((String) this.f43560b);
                        if (arrayList == null) {
                            return;
                        }
                        iVar.remove((String) this.f43560b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((l0.a) arrayList.get(i10)).accept(fVar2);
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
