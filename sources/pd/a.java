package pd;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import m5.k;
import org.json.JSONArray;
import org.json.JSONException;
import qd.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f48325a;

    public /* synthetic */ a(b bVar) {
        this.f48325a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        b bVar = this.f48325a;
        Task taskB = bVar.f48328c.b();
        Task taskB2 = bVar.f48329d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(bVar.f48327b, new ac.a(bVar, taskB, taskB2, 10));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        b bVar = this.f48325a;
        bVar.getClass();
        if (task.isSuccessful()) {
            qd.b bVar2 = bVar.f48328c;
            synchronized (bVar2) {
                bVar2.f48943c = Tasks.forResult(null);
            }
            n nVar = bVar2.f48942b;
            synchronized (nVar) {
                nVar.f49012a.deleteFile(nVar.f49013b);
            }
            qd.c cVar = (qd.c) task.getResult();
            if (cVar != null) {
                JSONArray jSONArray = cVar.f48948d;
                nb.c cVar2 = bVar.f48326a;
                if (cVar2 != null) {
                    try {
                        cVar2.c(b.d(jSONArray));
                    } catch (nb.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    } catch (JSONException e11) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
                    }
                }
                k5.g gVar = bVar.f48334i;
                try {
                    td.d dVarP = ((k) gVar.f44326b).p(cVar);
                    Iterator it = ((Set) gVar.f44328d).iterator();
                    while (it.hasNext()) {
                        ((Executor) gVar.f44327c).execute(new rd.a((wb.b) it.next(), dVarP, 0));
                    }
                } catch (d e12) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e12);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
