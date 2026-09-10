package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mb.g;
import rc.e;
import sb.a;
import tb.b;
import tb.h;
import tb.q;
import tj.g0;
import ub.k;
import uc.c;
import uc.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((g) bVar.a(g.class), bVar.d(e.class), (ExecutorService) bVar.g(new q(a.class, ExecutorService.class)), new k((Executor) bVar.g(new q(sb.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tb.a> getComponents() {
        em0 em0VarA = tb.a.a(d.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.b(g.class));
        em0VarA.a(h.a(e.class));
        em0VarA.a(new h(new q(a.class, ExecutorService.class), 1, 0));
        em0VarA.a(new h(new q(sb.b.class, Executor.class), 1, 0));
        em0VarA.f14015f = new g0(28);
        tb.a aVarB = em0VarA.b();
        rc.d dVar = new rc.d(0);
        em0 em0VarA2 = tb.a.a(rc.d.class);
        em0VarA2.f14012c = 1;
        em0VarA2.f14015f = new q1.e(dVar);
        return Arrays.asList(aVarB, em0VarA2.b(), i.f(LIBRARY_NAME, "19.1.2"));
    }
}
