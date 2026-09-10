package s5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import androidx.core.app.NotificationCompat;
import cn.a0;
import java.util.List;
import java.util.Map;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xi.m f50165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi.j f50166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(xi.m mVar, wi.j jVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50164f = i10;
        this.f50165g = mVar;
        this.f50166h = jVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50164f) {
            case 0:
                return new j(this.f50165g, this.f50166h, fVar, 0);
            case 1:
                return new j(this.f50165g, this.f50166h, fVar, 1);
            default:
                return new j(this.f50165g, this.f50166h, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50164f) {
            case 0:
                j jVar = (j) create(a0Var, fVar);
                r rVar = r.f53297a;
                jVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                j jVar2 = (j) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                jVar2.invokeSuspend(rVar2);
                return rVar2;
            default:
                j jVar3 = (j) create(a0Var, fVar);
                r rVar3 = r.f53297a;
                jVar3.invokeSuspend(rVar3);
                return rVar3;
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f50164f;
        r rVar = r.f53297a;
        wi.j jVar = this.f50166h;
        xi.m mVar = this.f50165g;
        switch (i10) {
            case 0:
                t9.e.z(obj);
                Object obj2 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object obj3 = ((List) obj2).get(0);
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                Map map = (Map) obj3;
                an.g gVar = h.f50155a;
                Activity activity = o.f50179c;
                Context context = o.f50180d;
                if (activity != null || context != null) {
                    Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                    a aVarL = t9.e.l(map);
                    String string = aVarL.f50129b;
                    if (string.length() == 0) {
                        t5.f fVar = aVarL.f50133f;
                        string = an.h.T0(fVar.f50508a + " " + fVar.f50509b).toString();
                    }
                    if (string.length() > 0) {
                        intent.putExtra("name", string);
                    }
                    if (!aVarL.f50134g.isEmpty()) {
                        intent.putExtra("phone", ((t5.i) xj.n.o0(aVarL.f50134g)).f50525a);
                    }
                    if (!aVarL.f50135h.isEmpty()) {
                        intent.putExtra(NotificationCompat.CATEGORY_EMAIL, ((t5.c) xj.n.o0(aVarL.f50135h)).f50497a);
                    }
                    if (!aVarL.f50136i.isEmpty()) {
                        intent.putExtra("postal", ((t5.b) xj.n.o0(aVarL.f50136i)).f50485a);
                    }
                    if (!aVarL.f50137j.isEmpty()) {
                        intent.putExtra("company", ((t5.h) xj.n.o0(aVarL.f50137j)).f50518a);
                        intent.putExtra("job_title", ((t5.h) xj.n.o0(aVarL.f50137j)).f50519b);
                    }
                    if (!aVarL.f50140n.isEmpty()) {
                        intent.putExtra("notes", ((t5.g) xj.n.o0(aVarL.f50140n)).f50517a);
                    }
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    if (activity != null) {
                        activity.startActivityForResult(intent, h.f50161g);
                    } else {
                        intent.setFlags(268435456);
                        kotlin.jvm.internal.n.c(context);
                        context.startActivity(intent);
                    }
                }
                o.f50187k = jVar;
                break;
            case 1:
                t9.e.z(obj);
                Object obj4 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object obj5 = ((List) obj4).get(0);
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<*>");
                String strValueOf = String.valueOf(((List) obj5).get(0));
                an.g gVar2 = h.f50155a;
                x7.a.H(o.f50179c, o.f50180d, strValueOf, false);
                o.f50183g = jVar;
                break;
            default:
                t9.e.z(obj);
                Object obj6 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                String string2 = ((List) obj6).get(0).toString();
                an.g gVar3 = h.f50155a;
                x7.a.H(o.f50179c, o.f50180d, string2, true);
                o.f50184h = jVar;
                break;
        }
        return rVar;
    }
}
