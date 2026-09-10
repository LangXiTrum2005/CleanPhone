package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.android.gms.internal.measurement.c8;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k9.c0;
import mb.g;
import qb.b;
import qb.c;
import qc.d;
import tb.a;
import tb.h;
import tb.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(tb.b bVar) {
        g gVar = (g) bVar.a(g.class);
        Context context = (Context) bVar.a(Context.class);
        d dVar = (d) bVar.a(d.class);
        c0.h(gVar);
        c0.h(context);
        c0.h(dVar);
        c0.h(context.getApplicationContext());
        if (c.f48929c == null) {
            synchronized (c.class) {
                try {
                    if (c.f48929c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f45929b)) {
                            ((j) dVar).b(a7.g.f3427d, qb.d.f48932a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.k());
                        }
                        c.f48929c = new c(c8.e(context, bundle).f23354b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c.f48929c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<a> getComponents() {
        em0 em0VarA = a.a(b.class);
        em0VarA.a(h.b(g.class));
        em0VarA.a(h.b(Context.class));
        em0VarA.a(h.b(d.class));
        em0VarA.f14015f = ne.c.f46713b;
        em0VarA.c(2);
        return Arrays.asList(em0VarA.b(), i.f("fire-analytics", "23.2.0"));
    }
}
