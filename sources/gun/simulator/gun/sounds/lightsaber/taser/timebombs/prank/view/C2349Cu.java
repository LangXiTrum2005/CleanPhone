package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2349Cu implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2375Du f2947a;

    public /* synthetic */ C2349Cu(C2375Du c2375Du) {
        this.f2947a = c2375Du;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        C2375Du c2375Du = this.f2947a;
        Task taskB = c2375Du.d.b();
        Task taskB2 = c2375Du.e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(c2375Du.c, new C2351Cw(c2375Du, taskB, taskB2, 6));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        C2375Du c2375Du = this.f2947a;
        c2375Du.getClass();
        if (task.isSuccessful()) {
            C2777Th c2777Th = c2375Du.d;
            synchronized (c2777Th) {
                c2777Th.c = Tasks.forResult(null);
            }
            c2777Th.b.a();
            if (task.getResult() != null) {
                JSONArray jSONArray = ((C2803Uh) task.getResult()).d;
                C3826ju c3826ju = c2375Du.b;
                if (c3826ju != null) {
                    try {
                        c3826ju.c(C2375Du.e(jSONArray));
                    } catch (Y | JSONException unused) {
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
