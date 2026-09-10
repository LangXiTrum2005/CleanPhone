package jh;

import android.util.Log;
import go.k;
import java.util.Iterator;
import s0.f1;
import s0.o0;
import wj.r;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f43875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f43876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, ak.f fVar, int i11) {
        super(i10, fVar);
        this.f43875f = i11;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f43875f) {
            case 0:
                f fVar2 = new f(2, fVar, 0);
                fVar2.f43876g = obj;
                return fVar2;
            case 1:
                f fVar3 = new f(2, fVar, 1);
                fVar3.f43876g = obj;
                return fVar3;
            default:
                f fVar4 = new f(2, fVar, 2);
                fVar4.f43876g = obj;
                return fVar4;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43875f) {
            case 0:
                f fVar = (f) create((w0.b) obj, (ak.f) obj2);
                r rVar = r.f53297a;
                fVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                return ((f) create((f1) obj, (ak.f) obj2)).invokeSuspend(r.f53297a);
            default:
                f fVar2 = (f) create((String) obj, (ak.f) obj2);
                r rVar2 = r.f53297a;
                fVar2.invokeSuspend(rVar2);
                return rVar2;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f43875f;
        r rVar = r.f53297a;
        switch (i10) {
            case 0:
                w0.b bVar = (w0.b) this.f43876g;
                t9.e.z(obj);
                Iterator it = o.Q(k.X("last_asset_date"), k.d("last_asset_date"), k.O("last_asset_date"), k.Q("last_asset_date"), new w0.d("last_asset_date"), k.Y("last_asset_date")).iterator();
                while (it.hasNext()) {
                    bVar.d((w0.d) it.next());
                }
                return rVar;
            case 1:
                t9.e.z(obj);
                return Boolean.valueOf(!(((f1) this.f43876g) instanceof o0));
            default:
                t9.e.z(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f43876g));
                return rVar;
        }
    }
}
