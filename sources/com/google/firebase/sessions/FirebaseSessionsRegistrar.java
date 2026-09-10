package com.google.firebase.sessions;

import ak.k;
import android.content.Context;
import androidx.annotation.Keep;
import cn.w;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.measurement.nf;
import com.google.firebase.components.ComponentRegistrar;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import m0.s1;
import mb.g;
import o8.f;
import oa.k0;
import qj.x;
import rb.c;
import sb.a;
import sb.b;
import tb.h;
import tb.q;
import uc.d;
import ud.d0;
import ud.i;
import ud.o;
import ud.r;
import ud.s;
import ud.t;
import ud.u;
import ud.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ltb/a;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "ud/u", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final u Companion = new u();
    private static final q appContext = q.a(Context.class);
    private static final q firebaseApp = q.a(g.class);
    private static final q firebaseInstallationsApi = q.a(d.class);
    private static final q backgroundDispatcher = new q(a.class, w.class);
    private static final q blockingDispatcher = new q(b.class, w.class);
    private static final q transportFactory = q.a(f.class);
    private static final q firebaseSessionsComponent = q.a(r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(tb.b bVar) {
        return (o) ((i) ((r) bVar.g(firebaseSessionsComponent))).f52104p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getComponents$lambda$1(tb.b bVar) {
        Object objG = bVar.g(appContext);
        n.e(objG, "get(...)");
        Object objG2 = bVar.g(backgroundDispatcher);
        n.e(objG2, "get(...)");
        Object objG3 = bVar.g(blockingDispatcher);
        n.e(objG3, "get(...)");
        Object objG4 = bVar.g(firebaseApp);
        n.e(objG4, "get(...)");
        Object objG5 = bVar.g(firebaseInstallationsApi);
        n.e(objG5, "get(...)");
        tc.b bVarB = bVar.b(transportFactory);
        n.e(bVarB, "getProvider(...)");
        i iVar = new i();
        iVar.f52090a = c.n((g) objG4);
        c cVarN = c.n((Context) objG);
        iVar.f52091b = cVarN;
        iVar.f52092c = wd.a.a(new x(cVarN, 22));
        iVar.f52093d = wd.a.a(s.f52148a);
        iVar.f52094e = c.n((d) objG5);
        iVar.f52095f = wd.a.a(new na.g(iVar.f52090a, 19));
        c cVarN2 = c.n((k) objG3);
        iVar.f52096g = cVarN2;
        iVar.f52097h = wd.a.a(new d0(iVar.f52095f, cVarN2));
        iVar.f52098i = c.n((k) objG2);
        iVar.f52099j = wd.a.a(new u0(iVar.f52092c, wd.a.a(new nf(iVar.f52093d, iVar.f52094e, iVar.f52095f, iVar.f52097h, wd.a.a(new r1.s(iVar.f52098i, iVar.f52093d, wd.a.a(new s1(29, iVar.f52091b, iVar.f52096g)), 11)), 9)), 1));
        wd.c cVarA = wd.a.a(s.f52149b);
        iVar.f52100k = cVarA;
        iVar.l = wd.a.a(new u0(iVar.f52093d, cVarA, 0));
        iVar.f52101m = wd.a.a(new nf(iVar.f52090a, iVar.f52094e, iVar.f52099j, wd.a.a(new k0(c.n(bVarB), 17)), iVar.f52098i, 7));
        iVar.f52102n = wd.a.a(new r1.s(iVar.f52091b, iVar.f52096g, wd.a.a(new x(iVar.l, 12)), 5));
        wd.c cVarA2 = wd.a.a(new fc.f(iVar.f52099j, iVar.l, iVar.f52101m, iVar.f52093d, iVar.f52102n, wd.a.a(new d0(iVar.f52091b, iVar.f52100k)), iVar.f52098i, 10));
        iVar.f52103o = cVarA2;
        iVar.f52104p = wd.a.a(new zc.u(iVar.f52090a, iVar.f52099j, iVar.f52098i, wd.a.a(new c(cVarA2, 11)), 18));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tb.a> getComponents() {
        em0 em0VarA = tb.a.a(o.class);
        em0VarA.f14010a = LIBRARY_NAME;
        em0VarA.a(h.c(firebaseSessionsComponent));
        em0VarA.f14015f = new t(0);
        em0VarA.c(2);
        tb.a aVarB = em0VarA.b();
        em0 em0VarA2 = tb.a.a(r.class);
        em0VarA2.f14010a = "fire-sessions-component";
        em0VarA2.a(h.c(appContext));
        em0VarA2.a(h.c(backgroundDispatcher));
        em0VarA2.a(h.c(blockingDispatcher));
        em0VarA2.a(h.c(firebaseApp));
        em0VarA2.a(h.c(firebaseInstallationsApi));
        em0VarA2.a(new h(transportFactory, 1, 1));
        em0VarA2.f14015f = new t(1);
        return xj.o.Q(aVarB, em0VarA2.b(), com.google.android.gms.internal.auth.i.f(LIBRARY_NAME, "3.0.7"));
    }
}
