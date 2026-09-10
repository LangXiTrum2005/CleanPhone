package f9;

import android.content.Context;
import android.content.Intent;
import b2.p;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.b0;
import g9.h;
import g9.j;
import j9.i;
import j9.q;
import k9.c0;
import k9.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final b0 l = new b0(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f40701m = 1;

    public final Intent d() {
        int iG = g();
        int i10 = iG - 1;
        if (iG == 0) {
            throw null;
        }
        j9.b bVar = this.f43744e;
        Context context = this.f43740a;
        if (i10 == 2) {
            j.f41766a.d("getFallbackSignInIntent()", new Object[0]);
            Intent intentA = j.a(context, (GoogleSignInOptions) bVar);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return intentA;
        }
        if (i10 == 3) {
            return j.a(context, (GoogleSignInOptions) bVar);
        }
        j.f41766a.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentA2 = j.a(context, (GoogleSignInOptions) bVar);
        intentA2.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentA2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task e() {
        BasePendingResult basePendingResult;
        int i10 = 1;
        boolean z10 = g() == 3;
        j.f41766a.d("Revoking access", new Object[0]);
        Context context = this.f43740a;
        String strE = g9.b.a(context).e("refreshToken");
        j.b(context);
        int i11 = 4;
        if (!z10) {
            v vVar = this.f43748i;
            h hVar = new h(vVar, i10);
            vVar.f11773b.b(1, hVar);
            basePendingResult = hVar;
        } else if (strE == null) {
            p pVar = g9.c.f41748c;
            Status status = new Status(4, null, null, null);
            c0.a("Status code must not be SUCCESS", !status.b());
            q qVar = new q(status);
            qVar.J(status);
            basePendingResult = qVar;
        } else {
            g9.c cVar = new g9.c(strE);
            new Thread(cVar).start();
            basePendingResult = cVar.f41750b;
        }
        jj.d dVar = new jj.d(i11);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.F(new u(basePendingResult, taskCompletionSource, dVar));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task f() {
        BasePendingResult basePendingResult;
        boolean z10 = g() == 3;
        j.f41766a.d("Signing out", new Object[0]);
        j.b(this.f43740a);
        v vVar = this.f43748i;
        if (z10) {
            l lVar = new l(vVar, 0);
            lVar.J(Status.f11649e);
            basePendingResult = lVar;
        } else {
            h hVar = new h(vVar, 0);
            vVar.f11773b.b(1, hVar);
            basePendingResult = hVar;
        }
        jj.d dVar = new jj.d(4);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.F(new u(basePendingResult, taskCompletionSource, dVar));
        return taskCompletionSource.getTask();
    }

    public final synchronized int g() {
        int i10;
        try {
            i10 = f40701m;
            if (i10 == 1) {
                Context context = this.f43740a;
                i9.d dVar = i9.d.f42926e;
                int iC = dVar.c(context, 12451000);
                if (iC == 0) {
                    i10 = 4;
                    f40701m = 4;
                } else if (dVar.b(context, iC, null) != null || t9.d.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f40701m = 2;
                } else {
                    i10 = 3;
                    f40701m = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
