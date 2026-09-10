package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o8.f;
import p8.a;
import r8.p;
import tb.b;
import tb.h;
import tb.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        p.b((Context) bVar.a(Context.class));
        return p.a().c(a.f48268f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        p.b((Context) bVar.a(Context.class));
        return p.a().c(a.f48268f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        p.b((Context) bVar.a(Context.class));
        return p.a().c(a.f48267e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<tb.a> getComponents() {
        em0 em0VarA = tb.a.a(f.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.b(Context.class));
        em0VarA.f14015f = new i0.a(8);
        tb.a aVarB = em0VarA.b();
        em0 em0VarB = tb.a.b(new q(kc.a.class, f.class));
        em0VarB.a(h.b(Context.class));
        em0VarB.f14015f = new i0.a(9);
        tb.a aVarB2 = em0VarB.b();
        em0 em0VarB2 = tb.a.b(new q(kc.b.class, f.class));
        em0VarB2.a(h.b(Context.class));
        em0VarB2.f14015f = new i0.a(10);
        return Arrays.asList(aVarB, aVarB2, em0VarB2.b(), i.f(LIBRARY_NAME, "19.0.0"));
    }
}
