package com.smartdigimkt.m3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class m implements com.smartdigimkt.c7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.smartdigimkt.h7.c f36623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f36624b = com.smartdigimkt.m6.b.p().k();

    public class a extends com.smartdigimkt.k3.a {
        public a() {
        }

        @Override // com.smartdigimkt.k3.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            super.onActivityPaused(activity);
            com.smartdigimkt.h7.c cVar = m.this.f36623a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.k3.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            com.smartdigimkt.h7.c cVar = m.this.f36623a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.k3.a X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f36626Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;
        final /* synthetic */ long f0;
        final /* synthetic */ com.smartdigimkt.c7.c g0;

        public b(com.smartdigimkt.k3.a aVar, com.smartdigimkt.w6.f fVar, String str, String str2, long j, com.smartdigimkt.c7.c cVar) {
            this.X = aVar;
            this.f36626Y = fVar;
            this.Z = str;
            this.e0 = str2;
            this.f0 = j;
            this.g0 = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((Application) m.this.f36624b).unregisterActivityLifecycleCallbacks(this.X);
            boolean zB = f.b(m.this.f36624b, this.f36626Y);
            if (zB) {
                com.smartdigimkt.i7.d.a(this.Z, this.f36626Y.L(), this.e0, 6, (String) null, 0L, 0L, this.f36626Y, 0, this.f0);
            } else {
                com.smartdigimkt.i7.d.a(this.Z, this.f36626Y.L(), this.e0, 13, (String) null, 0L, 0L, this.f36626Y);
            }
            com.smartdigimkt.c7.c cVar = this.g0;
            if (cVar != null) {
                cVar.a(zB);
            }
        }
    }

    @Override // com.smartdigimkt.c7.b
    public void a(com.smartdigimkt.w6.f fVar, String str, String str2, boolean z2, com.smartdigimkt.c7.c cVar, long j) {
        if (z2) {
            boolean zB = f.b(this.f36624b, fVar);
            if (zB) {
                com.smartdigimkt.i7.d.a(str, fVar.L(), str2, 12, (String) null, 0L, 0L, fVar, 0, j);
            } else {
                com.smartdigimkt.i7.d.a(str, fVar.L(), str2, 13, (String) null, 0L, 0L, fVar);
            }
            if (cVar != null) {
                cVar.a(zB);
                return;
            }
            return;
        }
        com.smartdigimkt.w6.g gVarI = fVar.i();
        if (gVarI == null) {
            if (cVar != null) {
                cVar.a(false);
                return;
            }
            return;
        }
        int iN0 = gVarI.n0();
        int iO0 = gVarI.o0();
        if (iN0 == 1) {
            a aVar = new a();
            this.f36623a = new com.smartdigimkt.h7.c(iO0, new b(aVar, fVar, str, str2, j, cVar));
            try {
                ((Application) this.f36624b).registerActivityLifecycleCallbacks(aVar);
                return;
            } catch (Exception unused) {
                com.smartdigimkt.i7.d.a("Error", "Error, cannot registerActivityLifecycleCallbacks here!", com.smartdigimkt.m6.b.p().q());
                return;
            }
        }
        if (iN0 == 3) {
            com.smartdigimkt.m3.a.a().a("1", new com.smartdigimkt.v3.j(fVar, str2, str, cVar, j));
        } else if (cVar != null) {
            cVar.a(false);
        }
    }
}
