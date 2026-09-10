package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import mb.g;
import nb.c;
import ob.a;
import pd.j;
import tb.b;
import tb.h;
import tb.q;
import uc.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static j lambda$getComponents$0(q qVar, b bVar) {
        c cVar;
        Context context = (Context) bVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.g(qVar);
        g gVar = (g) bVar.a(g.class);
        d dVar = (d) bVar.a(d.class);
        a aVar = (a) bVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f47361a.containsKey("frc")) {
                    aVar.f47361a.put("frc", new c(aVar.f47362b));
                }
                cVar = (c) aVar.f47361a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new j(context, scheduledExecutorService, gVar, dVar, cVar, bVar.d(qb.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tb.a> getComponents() {
        q qVar = new q(sb.b.class, ScheduledExecutorService.class);
        em0 em0Var = new em0(j.class, new Class[]{sd.a.class});
        em0Var.f14010a = LIBRARY_NAME;
        em0Var.a(h.b(Context.class));
        em0Var.a(new h(qVar, 1, 0));
        em0Var.a(h.b(g.class));
        em0Var.a(h.b(d.class));
        em0Var.a(h.b(a.class));
        em0Var.a(h.a(qb.b.class));
        em0Var.f14015f = new bd.b(qVar, 1);
        em0Var.c(2);
        return Arrays.asList(em0Var.b(), i.f(LIBRARY_NAME, "23.1.0"));
    }
}
