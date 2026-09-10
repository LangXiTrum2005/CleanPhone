package tg;

import ak.f;
import ck.i;
import cn.a0;
import java.util.List;
import java.util.Set;
import jk.c;
import oa.k0;
import oj.t;
import t9.e;
import wi.j;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f50751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0 f50752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f50753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f50754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Set f50755k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, k0 k0Var, boolean z10, int i10, Set set, f fVar) {
        super(2, fVar);
        this.f50751g = jVar;
        this.f50752h = k0Var;
        this.f50753i = z10;
        this.f50754j = i10;
        this.f50755k = set;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new a(this.f50751g, this.f50752h, this.f50753i, this.f50754j, this.f50755k, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f50750f;
        j jVar = this.f50751g;
        try {
            if (i10 == 0) {
                e.z(obj);
                t tVar = new t(this.f50752h, this.f50753i, this.f50754j, this.f50755k, null);
                this.f50750f = 1;
                obj = android.support.v4.media.session.a.f(tVar, this);
                bk.a aVar = bk.a.f5708a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
            }
            jVar.a((List) obj);
        } catch (Throwable th2) {
            jVar.b("NATIVE_ERR", th2.getMessage(), null);
        }
        return r.f53297a;
    }
}
