package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ni.g;
import od.b;
import rc.c;
import rc.d;
import rc.e;
import rc.f;
import tb.a;
import tb.h;
import tb.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        em0 em0VarA = a.a(b.class);
        em0VarA.a(new h(2, 0, od.a.class));
        em0VarA.f14015f = new g(4);
        arrayList.add(em0VarA.b());
        q qVar = new q(sb.a.class, Executor.class);
        em0 em0Var = new em0(c.class, new Class[]{e.class, f.class});
        em0Var.a(h.b(Context.class));
        em0Var.a(h.b(mb.g.class));
        em0Var.a(new h(2, 0, d.class));
        em0Var.a(new h(1, 1, b.class));
        em0Var.a(new h(qVar, 1, 0));
        em0Var.f14015f = new bd.b(qVar, 2);
        arrayList.add(em0Var.b());
        arrayList.add(i.f("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(i.f("fire-core", "22.2.0"));
        arrayList.add(i.f("device-name", a(Build.PRODUCT)));
        arrayList.add(i.f("device-model", a(Build.DEVICE)));
        arrayList.add(i.f("device-brand", a(Build.BRAND)));
        arrayList.add(i.q("android-target-sdk", new i0.a(20)));
        arrayList.add(i.q("android-min-sdk", new i0.a(21)));
        arrayList.add(i.q("android-platform", new i0.a(22)));
        arrayList.add(i.q("android-installer", new i0.a(23)));
        try {
            string = wj.c.f53275e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(i.f("kotlin", string));
        }
        return arrayList;
    }
}
