package ch;

import ck.i;
import cn.a0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f6417i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(jk.c cVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f6414f = i10;
        switch (i10) {
            case 1:
                this.f6417i = (i) cVar;
                super(2, fVar);
                break;
            case 2:
                this.f6417i = (i) cVar;
                super(2, fVar);
                break;
            case 3:
                this.f6417i = (i) cVar;
                super(2, fVar);
                break;
            case 4:
                this.f6417i = (i) cVar;
                super(2, fVar);
                break;
            default:
                this.f6417i = (i) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ck.i, jk.c] */
    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f6414f) {
            case 0:
                a aVar = new a(this.f6417i, fVar, 0);
                aVar.f6416h = obj;
                return aVar;
            case 1:
                a aVar2 = new a(this.f6417i, fVar, 1);
                aVar2.f6416h = obj;
                return aVar2;
            case 2:
                a aVar3 = new a(this.f6417i, fVar, 2);
                aVar3.f6416h = obj;
                return aVar3;
            case 3:
                a aVar4 = new a(this.f6417i, fVar, 3);
                aVar4.f6416h = obj;
                return aVar4;
            default:
                a aVar5 = new a(this.f6417i, fVar, 4);
                aVar5.f6416h = obj;
                return aVar5;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6414f) {
            case 0:
                return ((a) create((a0) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
            case 1:
                return ((a) create((a0) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
            case 2:
                return ((a) create((a0) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
            case 3:
                return ((a) create((w0.b) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
            default:
                return ((a) create((w0.b) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r4v12, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r4v29, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ck.i, jk.c] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6414f) {
            case 0:
                a0 a0Var = (a0) this.f6416h;
                int i10 = this.f6415g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    this.f6416h = null;
                    this.f6415g = 1;
                    Object objInvoke = this.f6417i.invoke(a0Var, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            case 1:
                a0 a0Var2 = (a0) this.f6416h;
                int i11 = this.f6415g;
                if (i11 == 0) {
                    t9.e.z(obj);
                    this.f6416h = null;
                    this.f6415g = 1;
                    Object objInvoke2 = this.f6417i.invoke(a0Var2, this);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objInvoke2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            case 2:
                a0 a0Var3 = (a0) this.f6416h;
                int i12 = this.f6415g;
                if (i12 == 0) {
                    t9.e.z(obj);
                    this.f6416h = null;
                    this.f6415g = 1;
                    Object objInvoke3 = this.f6417i.invoke(a0Var3, this);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objInvoke3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            case 3:
                int i13 = this.f6415g;
                if (i13 == 0) {
                    t9.e.z(obj);
                    w0.b bVar = (w0.b) this.f6416h;
                    this.f6415g = 1;
                    obj = this.f6417i.invoke(bVar, this);
                    bk.a aVar4 = bk.a.f5708a;
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                w0.b bVar2 = (w0.b) obj;
                n.d(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f52736b.f46631b).set(true);
                return bVar2;
            default:
                int i14 = this.f6415g;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w0.b bVar3 = (w0.b) this.f6416h;
                    t9.e.z(obj);
                    return bVar3;
                }
                t9.e.z(obj);
                w0.b bVar4 = new w0.b(b0.Y(((w0.b) this.f6416h).a()), false);
                this.f6416h = bVar4;
                this.f6415g = 1;
                Object objInvoke4 = this.f6417i.invoke(bVar4, this);
                bk.a aVar5 = bk.a.f5708a;
                return objInvoke4 == aVar5 ? aVar5 : bVar4;
        }
    }
}
