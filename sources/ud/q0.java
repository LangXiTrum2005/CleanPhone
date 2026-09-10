package ud;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f52137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f52138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o0 f52139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mb.g f52140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m0 f52141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xd.j f52142k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f52143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f52144n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, m0 m0Var, ak.f fVar) {
        super(2, fVar);
        this.f52143m = s0Var;
        this.f52144n = m0Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        return new q0(this.f52143m, this.f52144n, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        w wVar;
        o0 o0Var;
        mb.g firebaseApp;
        xd.j sessionsSettings;
        m0 m0Var;
        Object objB;
        m0 sessionDetails;
        zb.h hVar;
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        zb.h hVar2;
        int i10 = this.l;
        s0 s0Var = this.f52143m;
        bk.a aVar = bk.a.f5708a;
        if (i10 == 0) {
            t9.e.z(obj);
            this.l = 1;
            objA = s0.a(s0Var, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            t9.e.z(obj);
            objA = obj;
        } else {
            if (i10 == 2) {
                t9.e.z(obj);
                objA2 = obj;
                wVar = (w) objA2;
                o0Var = o0.f52132a;
                firebaseApp = s0Var.f52152a;
                sessionsSettings = s0Var.f52154c;
                vd.c cVar = vd.c.f52564a;
                this.f52137f = wVar;
                this.f52138g = s0Var;
                this.f52139h = o0Var;
                this.f52140i = firebaseApp;
                m0Var = this.f52144n;
                this.f52141j = m0Var;
                this.f52142k = sessionsSettings;
                this.l = 3;
                objB = cVar.b(this);
                if (objB != aVar) {
                    sessionDetails = m0Var;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xd.j jVar5 = this.f52142k;
            sessionDetails = this.f52141j;
            firebaseApp = this.f52140i;
            o0Var = this.f52139h;
            s0Var = this.f52138g;
            w wVar2 = this.f52137f;
            t9.e.z(obj);
            sessionsSettings = jVar5;
            wVar = wVar2;
            objB = obj;
        }
        Map subscribers = (Map) objB;
        String str = wVar.f52175a;
        String firebaseAuthenticationToken = wVar.f52176b;
        o0Var.getClass();
        kotlin.jvm.internal.n.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.f(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.n.f(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.n.f(subscribers, "subscribers");
        kotlin.jvm.internal.n.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        String str2 = sessionDetails.f52123a;
        String str3 = sessionDetails.f52124b;
        int i11 = sessionDetails.f52125c;
        long j10 = sessionDetails.f52126d;
        hVar = (zb.h) subscribers.get(vd.d.f52567b);
        jVar = j.COLLECTION_DISABLED;
        jVar2 = j.COLLECTION_ENABLED;
        jVar3 = j.COLLECTION_SDK_NOT_INSTALLED;
        if (hVar == null) {
            jVar4 = jVar3;
        } else if (hVar.f54690a.a()) {
            jVar4 = jVar2;
        } else {
            jVar4 = jVar;
        }
        hVar2 = (zb.h) subscribers.get(vd.d.f52566a);
        if (hVar2 == null) {
            jVar = jVar3;
        } else if (hVar2.f54690a.a()) {
            jVar = jVar2;
        }
        n0 n0Var = new n0(new v0(str2, str3, i11, j10, new k(jVar4, jVar, sessionsSettings.a()), str, firebaseAuthenticationToken), o0.a(firebaseApp));
        int i12 = s0.f52151g;
        s0Var.getClass();
        try {
            s0Var.f52155d.a(n0Var);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
        return wj.r.f53297a;
        if (((Boolean) objA).booleanValue()) {
            uc.d dVar = s0Var.f52153b;
            this.l = 2;
            objA2 = w.f52174c.a(dVar, this);
            if (objA2 != aVar) {
                wVar = (w) objA2;
                o0Var = o0.f52132a;
                firebaseApp = s0Var.f52152a;
                sessionsSettings = s0Var.f52154c;
                vd.c cVar2 = vd.c.f52564a;
                this.f52137f = wVar;
                this.f52138g = s0Var;
                this.f52139h = o0Var;
                this.f52140i = firebaseApp;
                m0Var = this.f52144n;
                this.f52141j = m0Var;
                this.f52142k = sessionsSettings;
                this.l = 3;
                objB = cVar2.b(this);
                if (objB != aVar) {
                    sessionDetails = m0Var;
                    Map subscribers2 = (Map) objB;
                    String str4 = wVar.f52175a;
                    String firebaseAuthenticationToken2 = wVar.f52176b;
                    o0Var.getClass();
                    kotlin.jvm.internal.n.f(firebaseApp, "firebaseApp");
                    kotlin.jvm.internal.n.f(sessionDetails, "sessionDetails");
                    kotlin.jvm.internal.n.f(sessionsSettings, "sessionsSettings");
                    kotlin.jvm.internal.n.f(subscribers2, "subscribers");
                    kotlin.jvm.internal.n.f(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
                    String str5 = sessionDetails.f52123a;
                    String str6 = sessionDetails.f52124b;
                    int i13 = sessionDetails.f52125c;
                    long j11 = sessionDetails.f52126d;
                    hVar = (zb.h) subscribers2.get(vd.d.f52567b);
                    jVar = j.COLLECTION_DISABLED;
                    jVar2 = j.COLLECTION_ENABLED;
                    jVar3 = j.COLLECTION_SDK_NOT_INSTALLED;
                    if (hVar == null) {
                        jVar4 = jVar3;
                    } else if (hVar.f54690a.a()) {
                        jVar4 = jVar2;
                    } else {
                        jVar4 = jVar;
                    }
                    hVar2 = (zb.h) subscribers2.get(vd.d.f52566a);
                    if (hVar2 == null) {
                        jVar = jVar3;
                    } else if (hVar2.f54690a.a()) {
                        jVar = jVar2;
                    }
                    n0 n0Var2 = new n0(new v0(str5, str6, i13, j11, new k(jVar4, jVar, sessionsSettings.a()), str4, firebaseAuthenticationToken2), o0.a(firebaseApp));
                    int i14 = s0.f52151g;
                    s0Var.getClass();
                    s0Var.f52155d.a(n0Var2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                }
            }
            return aVar;
        }
        return wj.r.f53297a;
    }
}
