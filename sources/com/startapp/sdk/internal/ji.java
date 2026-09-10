package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ji implements Runnable, i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f41161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41163c;
    public final e9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t8 f41164e;
    public Throwable f;

    public ji(lb lbVar, lb lbVar2, String str, e9 e9Var) {
        this.f41161a = lbVar;
        this.f41162b = lbVar2;
        this.f41163c = str;
        this.d = e9Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        this.f = (Throwable) obj;
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hf hfVar = (hf) this.f41161a.a();
            q8 q8Var = (q8) this.f41162b.a();
            String str = this.f41163c;
            ki kiVar = new ki();
            kiVar.f41733J = hfVar.a(kiVar);
            p8 p8Var = new p8(q8Var, kiVar.a(str));
            p8Var.f41356e = this;
            p8Var.d = ((HttpClientConfig) q8Var.f.a()).a(kiVar.Z);
            t8 t8VarA = p8Var.a();
            this.f41164e = t8VarA;
            e9 e9Var = this.d;
            if (e9Var != null) {
                e9Var.a(this.f41163c, t8VarA, this.f);
            }
        } catch (Throwable th) {
            try {
                this.f = th;
                g9.a(th);
            } finally {
                e9 e9Var2 = this.d;
                if (e9Var2 != null) {
                    e9Var2.a(this.f41163c, this.f41164e, this.f);
                }
            }
        }
    }

    public static boolean a(Context context, String str, e9 e9Var) {
        try {
            com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
            ((Executor) aVarA.f40724A.a()).execute(new ji(aVarA.f40739i, aVarA.f40741n, str, e9Var));
            return true;
        } catch (Throwable th) {
            g9.a(th);
            if (e9Var == null) {
                return false;
            }
            e9Var.a(str, (Object) null, th);
            return false;
        }
    }
}
