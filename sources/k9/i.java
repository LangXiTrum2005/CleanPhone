package k9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends f implements j9.c {
    public final Set F;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Context context, Looper looper, int i10, com.google.android.gms.internal.consent_sdk.x xVar, j9.j jVar, j9.k kVar, int i11) {
        o0 o0VarA = o0.a(context);
        i9.d dVar = i9.d.f42926e;
        c0.h(jVar);
        c0.h(kVar);
        super(context, looper, o0VarA, dVar, i10, new m(jVar), new m(kVar), (String) xVar.f23263d);
        Set set = (Set) xVar.f23261b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.F = set;
    }

    @Override // k9.f
    public final Executor b() {
        return null;
    }

    @Override // k9.f
    public final Set d() {
        return this.F;
    }

    @Override // k9.f
    public final Account getAccount() {
        return null;
    }
}
