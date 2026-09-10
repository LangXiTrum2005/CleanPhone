package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2725Rh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3671a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C2751Sh c;

    public RunnableC2725Rh(C2751Sh c2751Sh, int i, long j) {
        this.c = c2751Sh;
        this.f3671a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C2751Sh c2751Sh = this.c;
        int i = this.f3671a;
        final long j = this.b;
        synchronized (c2751Sh) {
            final int i2 = i - 1;
            final Task taskC = c2751Sh.c.c(3 - i2);
            final Task taskB = c2751Sh.d.b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask(c2751Sh.f, new Continuation() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qh
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    JSONObject jSONObject;
                    C2751Sh c2751Sh2 = c2751Sh;
                    Task task2 = taskC;
                    Task task3 = taskB;
                    long j2 = j;
                    int i3 = i2;
                    c2751Sh2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new C2401Eu("Failed to auto-fetch config update.", task2.getException(), 1));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new C2401Eu("Failed to get activated config for auto-fetch", task3.getException(), 1));
                    }
                    C2855Wh c2855Wh = (C2855Wh) task2.getResult();
                    C2803Uh c2803Uh = (C2803Uh) task3.getResult();
                    C2803Uh c2803Uh2 = c2855Wh.b;
                    if (c2803Uh2 != null) {
                        boolValueOf = Boolean.valueOf(c2803Uh2.f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(c2855Wh.f3933a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        c2751Sh2.a(i3, j2);
                        return Tasks.forResult(null);
                    }
                    if (c2855Wh.b == null) {
                        return Tasks.forResult(null);
                    }
                    if (c2803Uh == null) {
                        C3647hp c3647hpB = C2803Uh.b();
                        c2803Uh = new C2803Uh((JSONObject) c3647hpB.c, (Date) c3647hpB.d, (JSONArray) c3647hpB.e, (JSONObject) c3647hpB.b, c3647hpB.f4473a);
                    }
                    C2803Uh c2803Uh3 = c2855Wh.b;
                    C2803Uh c2803UhA = C2803Uh.a(new JSONObject(c2803Uh3.f3834a.toString()));
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = c2803Uh.b;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (true) {
                        boolean zHasNext = itKeys.hasNext();
                        jSONObject = c2803UhA.b;
                        if (!zHasNext) {
                            break;
                        }
                        String next = itKeys.next();
                        JSONObject jSONObject3 = c2803Uh3.b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = c2803Uh.e;
                            boolean zHas = jSONObject4.has(next);
                            JSONObject jSONObject5 = c2803Uh3.e;
                            if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return Tasks.forResult(null);
                    }
                    synchronized (c2751Sh2) {
                        Iterator it = c2751Sh2.f3727a.iterator();
                        while (it.hasNext()) {
                            ((C2674Pi) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
