package ni;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.component.AbtRegistrar;
import i1.i0;
import java.util.Set;
import l1.l;
import n2.n;
import p1.b0;
import tb.q;
import tb.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements n, tb.d, l1.k, l, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46765a;

    public /* synthetic */ g(int i10) {
        this.f46765a = i10;
    }

    @Override // l1.l
    public void a(Object obj, i1.n nVar) {
        ((i0) obj).k();
    }

    @Override // n2.n
    public n2.k[] createExtractors() {
        return new n2.k[]{new o2.a()};
    }

    @Override // tb.d
    public Object g(s sVar) {
        switch (this.f46765a) {
            case 3:
                return AbtRegistrar.lambda$getComponents$0(sVar);
            default:
                Set setF = sVar.f(q.a(od.a.class));
                od.c cVar = od.c.f47384c;
                if (cVar == null) {
                    synchronized (od.c.class) {
                        try {
                            cVar = od.c.f47384c;
                            if (cVar == null) {
                                cVar = new od.c(0);
                                od.c.f47384c = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return new od.b(setF, cVar);
        }
    }

    @Override // l1.k
    public void invoke(Object obj) {
        switch (this.f46765a) {
            case 5:
                ((i0) obj).p(new p1.h(2, new aa.b("Player release timed out.", 17), 1003));
                break;
            case 6:
            case 8:
            default:
                ((q1.b) obj).getClass();
                break;
            case 7:
                ((i0) obj).getClass();
                break;
            case 9:
                ((q1.b) obj).getClass();
                break;
            case 10:
                ((q1.b) obj).getClass();
                break;
            case 11:
                ((q1.b) obj).getClass();
                break;
            case 12:
                ((q1.b) obj).getClass();
                break;
            case 13:
                ((q1.b) obj).getClass();
                break;
            case 14:
                ((q1.b) obj).getClass();
                break;
            case 15:
                ((q1.b) obj).getClass();
                break;
            case 16:
                ((q1.b) obj).getClass();
                break;
            case 17:
                ((q1.b) obj).getClass();
                break;
            case 18:
                ((q1.b) obj).getClass();
                break;
            case 19:
                ((q1.b) obj).getClass();
                break;
            case 20:
                ((q1.b) obj).getClass();
                break;
            case 21:
                ((q1.b) obj).getClass();
                break;
            case 22:
                ((q1.b) obj).getClass();
                break;
            case 23:
                ((q1.b) obj).getClass();
                break;
            case 24:
                ((q1.b) obj).getClass();
                break;
            case 25:
                ((q1.b) obj).getClass();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((q1.b) obj).getClass();
                break;
            case 27:
                ((q1.b) obj).getClass();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((q1.b) obj).getClass();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }

    public /* synthetic */ g(b0 b0Var) {
        this.f46765a = 6;
    }
}
