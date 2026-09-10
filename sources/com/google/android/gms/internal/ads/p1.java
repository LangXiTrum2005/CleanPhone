package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.k42;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18427d;

    public /* synthetic */ p1(Object obj, int i10, long j10, int i11) {
        this.f18424a = i11;
        this.f18427d = obj;
        this.f18425b = i10;
        this.f18426c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18424a) {
            case 0:
                md0 md0Var = (md0) this.f18427d;
                int i10 = this.f18425b;
                long j10 = this.f18426c;
                md0Var.getClass();
                String str = uu0.f20901a;
                d02 d02Var = ((jy1) md0Var.f17400c).f16219a.f19727s;
                zz1 zz1VarI = d02Var.i((r32) d02Var.f13329d.f21139e);
                d02Var.f(zz1VarI, 1018, new d5.o(zz1VarI, i10, j10));
                return;
            default:
                final ln0 ln0Var = (ln0) this.f18427d;
                int i11 = this.f18425b;
                final long j11 = this.f18426c;
                synchronized (ln0Var) {
                    final int i12 = i11 - 1;
                    final Task taskC = ((qd.g) ln0Var.f17073d).c(3 - i12);
                    final Task taskB = ((qd.b) ln0Var.f17074e).b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask((ScheduledExecutorService) ln0Var.f17076g, new Continuation() { // from class: qd.a
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            ln0 ln0Var2 = ln0Var;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j12 = j11;
                            int i13 = i12;
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new pd.c("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new pd.c("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            f fVar = (f) task2.getResult();
                            c cVar = (c) task3.getResult();
                            c cVar2 = fVar.f48961b;
                            if (cVar2 != null) {
                                boolValueOf = Boolean.valueOf(cVar2.f48950f >= j12);
                            } else {
                                boolValueOf = Boolean.valueOf(fVar.f48960a == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                ln0Var2.a(i13, j12);
                                return Tasks.forResult(null);
                            }
                            if (fVar.f48961b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult(null);
                            }
                            if (cVar == null) {
                                k42 k42VarD = c.d();
                                cVar = new c((JSONObject) k42VarD.f16312b, (Date) k42VarD.f16313c, (JSONArray) k42VarD.f16314d, (JSONObject) k42VarD.f16315e, k42VarD.f16311a, (JSONArray) k42VarD.f16316f);
                            }
                            c cVar3 = fVar.f48961b;
                            JSONObject jSONObject = cVar.f48949e;
                            JSONObject jSONObject2 = cVar3.f48945a;
                            JSONObject jSONObject3 = cVar3.f48946b;
                            JSONObject jSONObject4 = cVar3.f48949e;
                            JSONObject jSONObject5 = c.a(new JSONObject(jSONObject2.toString())).f48946b;
                            HashMap mapC = cVar.c();
                            HashMap mapC2 = cVar3.c();
                            HashMap mapB = cVar.b();
                            HashMap mapB2 = cVar3.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = cVar.f48946b;
                            Iterator<String> itKeys = jSONObject6.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject5.remove(next);
                                }
                            }
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return Tasks.forResult(null);
                            }
                            synchronized (ln0Var2) {
                                Iterator it = ((LinkedHashSet) ln0Var2.f17071b).iterator();
                                while (it.hasNext()) {
                                    ((j) it.next()).getClass();
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
                return;
        }
    }
}
