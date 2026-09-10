package yk;

import dm.w;
import java.util.List;
import kotlin.jvm.internal.o;
import xj.b0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f54481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10) {
        super(0);
        this.f54480e = i10;
        this.f54481f = lVar;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10 = this.f54480e;
        l lVar = this.f54481f;
        switch (i10) {
            case 0:
                return lVar.f54483a.f6499d.e();
            default:
                wk.h hVar = lVar.f54483a.f6499d;
                yl.f fVar = al.g.f3640a;
                kotlin.jvm.internal.n.f(hVar, "<this>");
                List listC = j1.f.C(new al.m(hVar, wk.l.f53349m, b0.Q(new wj.f(al.g.f3640a, new w("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new wj.f(al.g.f3641b, new dm.a((Object) new al.m(hVar, wk.l.f53351o, b0.Q(new wj.f(al.g.f3643d, new w("")), new wj.f(al.g.f3644e, new dm.b(v.f53866a, new al.f(hVar, 0))))))), new wj.f(al.g.f3642c, new dm.i(yl.b.j(wk.l.f53350n), yl.f.e("WARNING"))))));
                return listC.isEmpty() ? al.i.f3645a : new al.k(listC, 0);
        }
    }
}
