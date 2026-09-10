package zc;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.applovin.impl.da;
import com.google.android.gms.tasks.TaskCompletionSource;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54818a;

    public d0(f fVar) {
        this.f54818a = fVar;
    }

    public final void a(e0 e0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = e0Var.f54820a;
        g gVar = (g) this.f54818a.f54822a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f54829a.execute(new ld.f(gVar, intent, taskCompletionSource, 13));
        taskCompletionSource.getTask().addOnCompleteListener(new da(1), new i0(e0Var, 20));
    }
}
