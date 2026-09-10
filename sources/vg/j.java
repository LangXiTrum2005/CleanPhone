package vg;

import cn.a0;
import java.util.ArrayList;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f52616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f52617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, ArrayList arrayList, ak.f fVar, int i11) {
        super(2, fVar);
        this.f52615f = i11;
        this.f52616g = i10;
        this.f52617h = arrayList;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f52615f) {
            case 0:
                return new j(this.f52616g, this.f52617h, fVar, 0);
            default:
                return new j(this.f52616g, this.f52617h, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f52615f) {
            case 0:
                j jVar = (j) create(a0Var, fVar);
                r rVar = r.f53297a;
                jVar.invokeSuspend(rVar);
                return rVar;
            default:
                j jVar2 = (j) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                jVar2.invokeSuspend(rVar2);
                return rVar2;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f52615f) {
            case 0:
                t9.e.z(obj);
                android.support.v4.media.session.a.B(new b4.a(new e(this.f52616g, this.f52617h.size(), 0), null, 10));
                break;
            default:
                t9.e.z(obj);
                e eVar = new e(this.f52616g, this.f52617h.size(), 2);
                android.support.v4.media.session.a.B(new b4.a(eVar, null, 10));
                android.support.v4.media.session.a.B(new b4.a(new e(eVar.f52594b, eVar.f52595c, 1), null, 10));
                break;
        }
        return r.f53297a;
    }
}
