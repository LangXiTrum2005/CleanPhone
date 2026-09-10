package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import ni.g;
import ob.a;
import tb.b;
import tb.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.d(qb.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tb.a> getComponents() {
        em0 em0VarA = tb.a.a(a.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.b(Context.class));
        em0VarA.a(h.a(qb.b.class));
        em0VarA.f14015f = new g(3);
        return Arrays.asList(em0VarA.b(), i.f(LIBRARY_NAME, "21.1.1"));
    }
}
