package sg;

import ak.f;
import ck.i;
import cn.a0;
import com.google.android.gms.internal.play_billing.q1;
import org.json.JSONObject;
import t9.e;
import wj.r;
import xd.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f50239g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, f fVar, int i10) {
        super(2, fVar);
        this.f50238f = i10;
        this.f50239g = obj;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f50238f) {
            case 0:
                return new a((jk.a) this.f50239g, fVar, 0);
            case 1:
                return new a((g) this.f50239g, fVar, 1);
            default:
                return new a((JSONObject) this.f50239g, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50238f) {
            case 0:
                a aVar = (a) create((a0) obj, (f) obj2);
                r rVar = r.f53297a;
                aVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                return ((a) create((g) obj, (f) obj2)).invokeSuspend(r.f53297a);
            default:
                a aVar2 = (a) create((a0) obj, (f) obj2);
                r rVar2 = r.f53297a;
                aVar2.invokeSuspend(rVar2);
                return rVar2;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f50238f;
        r rVar = r.f53297a;
        Object obj2 = this.f50239g;
        switch (i10) {
            case 0:
                e.z(obj);
                try {
                    ((jk.a) obj2).invoke();
                    break;
                } catch (Throwable unused) {
                }
                return rVar;
            case 1:
                e.z(obj);
                return (g) obj2;
            default:
                e.z(obj);
                xi.g gVar = xg.a.f53794b;
                if (gVar != null) {
                    gVar.b(q1.G((JSONObject) obj2));
                }
                return rVar;
        }
    }
}
