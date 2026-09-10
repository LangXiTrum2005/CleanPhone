package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import mb.g;
import rc.f;
import sc.a;
import tb.b;
import tb.h;
import tb.q;
import uc.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.d(od.b.class), bVar.d(f.class), (d) bVar.a(d.class), bVar.b(qVar), (qc.d) bVar.a(qc.d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<tb.a> getComponents() {
        q qVar = new q(kc.b.class, o8.f.class);
        em0 em0VarA = tb.a.a(FirebaseMessaging.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.b(g.class));
        em0VarA.a(new h(0, 0, a.class));
        em0VarA.a(h.a(od.b.class));
        em0VarA.a(h.a(f.class));
        em0VarA.a(h.b(d.class));
        em0VarA.a(new h(qVar, 0, 1));
        em0VarA.a(h.b(qc.d.class));
        em0VarA.f14015f = new bd.b(qVar, 3);
        em0VarA.c(1);
        return Arrays.asList(em0VarA.b(), i.f(LIBRARY_NAME, "25.1.2"));
    }
}
