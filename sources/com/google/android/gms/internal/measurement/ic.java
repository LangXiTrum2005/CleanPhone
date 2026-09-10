package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb f23582a;

    public ic(bb bbVar) {
        this.f23582a = bbVar;
    }

    public static ta.a b(Task task) {
        hb hbVar = new hb();
        hbVar.f23543h = task;
        q6 q6Var = new q6(hbVar, 10);
        ta.c0 c0Var = ta.c0.f50592a;
        task.addOnCompleteListener(c0Var, q6Var);
        return ta.k0.a(hbVar, j9.e.class, hc.f23544b, c0Var);
    }

    public final ta.a a(h6 h6Var) {
        String string;
        bb bbVar = this.f23582a;
        String simpleName = db.class.getSimpleName();
        Looper looper = bbVar.f43746g;
        k9.c0.i(looper, "Looper must not be null");
        i9.i iVar = new i9.i();
        iVar.f42938b = new ea.e2(looper);
        k9.c0.e(simpleName);
        iVar.f42937a = new com.google.android.gms.common.api.internal.i(h6Var, simpleName);
        if (p9.c.f48287i == null) {
            p9.c.f48287i = Application.getProcessName();
        }
        String str = p9.c.f48287i;
        if (str == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = str.length() + 1;
            int iIdentityHashCode = System.identityHashCode(db.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb2.append(str);
            sb2.append("|");
            sb2.append(iIdentityHashCode);
            string = sb2.toString();
        }
        v9.e eVar = new v9.e(bbVar, string, iVar, false, 6);
        f1 f1Var = f1.f23449e;
        bo.e eVar2 = new bo.e();
        eVar2.f5779d = iVar;
        eVar2.f5777b = eVar;
        eVar2.f5778c = f1Var;
        eVar2.f5780e = new i9.c[]{h.f23523b};
        eVar2.f5776a = false;
        com.google.android.gms.common.api.internal.i iVar2 = (com.google.android.gms.common.api.internal.i) ((i9.i) eVar2.f5779d).f42937a;
        k9.c0.i(iVar2, "Key must not be null");
        i9.i iVar3 = (i9.i) eVar2.f5779d;
        bc.s sVar = new bc.s(eVar2, iVar3, (i9.c[]) eVar2.f5780e, eVar2.f5776a);
        n5.f fVar = new n5.f(eVar2, iVar2);
        k9.c0.i((com.google.android.gms.common.api.internal.i) iVar3.f42937a, "Listener has already been released.");
        com.google.android.gms.common.api.internal.e eVar3 = bbVar.f43750k;
        eVar3.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        eVar3.b(taskCompletionSource, 0, bbVar);
        com.google.android.gms.common.api.internal.z zVar = new com.google.android.gms.common.api.internal.z(new com.google.android.gms.common.api.internal.e0(new com.google.android.gms.common.api.internal.a0(sVar, fVar), taskCompletionSource), eVar3.f11701i.get(), bbVar);
        u6 u6Var = eVar3.f11705n;
        u6Var.sendMessage(u6Var.obtainMessage(8, zVar));
        return b(taskCompletionSource.getTask());
    }
}
