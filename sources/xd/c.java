package xd;

import android.os.Build;
import android.util.Log;
import cn.d0;
import com.google.android.gms.internal.ads.u71;
import java.util.Map;
import ud.g1;
import ud.q;
import ud.w;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final an.g f53738h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f53739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.d f53740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ud.b f53741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f53742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f53743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ln.c f53744f;

    static {
        int i10 = bn.a.f5743d;
        f53737g = (int) bn.a.h(d0.c.O(24, bn.c.HOURS), bn.c.SECONDS);
        f53738h = new an.g("com/google/firebase/sessions//");
    }

    public c(g1 timeProvider, uc.d firebaseInstallationsApi, ud.b appInfo, d configsFetcher, n settingsCache) {
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.n.f(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.n.f(appInfo, "appInfo");
        kotlin.jvm.internal.n.f(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.n.f(settingsCache, "settingsCache");
        this.f53739a = timeProvider;
        this.f53740b = firebaseInstallationsApi;
        this.f53741c = appInfo;
        this.f53742d = configsFetcher;
        this.f53743e = settingsCache;
        this.f53744f = new ln.c();
    }

    @Override // xd.o
    public final Boolean a() {
        return this.f53743e.a().f53748a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:45:0x00a3, B:47:0x00ad, B:50:0x00b8), top: B:61:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:45:0x00a3, B:47:0x00ad, B:50:0x00b8), top: B:61:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b8, please report this as an issue */
    @Override // xd.o
    public final Object b(ak.f fVar) throws Throwable {
        b bVar;
        ln.a aVar;
        ln.a aVar2;
        ln.a aVar3;
        String str;
        Object objJ;
        ln.a aVar4;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f53736i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f53736i = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (ck.c) fVar);
            }
        } else {
            bVar = new b(this, (ck.c) fVar);
        }
        Object obj = bVar.f53734g;
        int i11 = bVar.f53736i;
        n nVar = this.f53743e;
        int i12 = 2;
        r rVar = r.f53297a;
        ak.f fVar2 = null;
        bk.a aVar5 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                ln.c cVar = this.f53744f;
                if (!cVar.d() && !nVar.b()) {
                    return rVar;
                }
                bVar.f53733f = cVar;
                bVar.f53736i = 1;
                Object objE = cVar.e(bVar);
                aVar = cVar;
                if (objE != aVar5) {
                }
                return aVar5;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    ln.a aVar6 = bVar.f53733f;
                    try {
                        t9.e.z(obj);
                        aVar3 = aVar6;
                        str = ((w) obj).f52175a;
                        if (str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ln.c) aVar3).g(null);
                            return rVar;
                        }
                        wj.f fVar3 = new wj.f("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        an.g gVar = f53738h;
                        wj.f fVar4 = new wj.f("X-Crashlytics-Device-Model", gVar.b(str2, ""));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.n.e(INCREMENTAL, "INCREMENTAL");
                        wj.f fVar5 = new wj.f("X-Crashlytics-OS-Build-Version", gVar.b(INCREMENTAL, ""));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.n.e(RELEASE, "RELEASE");
                        wj.f fVar6 = new wj.f("X-Crashlytics-OS-Display-Version", gVar.b(RELEASE, ""));
                        this.f53741c.getClass();
                        Map mapQ = b0.Q(fVar3, fVar4, fVar5, fVar6, new wj.f("X-Crashlytics-API-Client-Version", "3.0.7"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        d dVar = this.f53742d;
                        b4.c cVar2 = new b4.c(this, fVar2, 16);
                        jh.f fVar7 = new jh.f(i12, fVar2, 2);
                        bVar.f53733f = aVar3;
                        bVar.f53736i = 3;
                        objJ = d0.J(dVar.f53746b, new u71(dVar, mapQ, cVar2, fVar7, null), bVar);
                        if (objJ != aVar5) {
                            objJ = rVar;
                        }
                        if (objJ != aVar5) {
                            aVar4 = aVar3;
                            ((ln.c) aVar4).g(null);
                            return rVar;
                        }
                        return aVar5;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar6;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = bVar.f53733f;
                    try {
                        t9.e.z(obj);
                        aVar4 = aVar2;
                        ((ln.c) aVar4).g(null);
                        return rVar;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                ((ln.c) aVar2).g(null);
                throw th;
            }
            ln.a aVar7 = bVar.f53733f;
            t9.e.z(obj);
            aVar = aVar7;
            if (!nVar.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                ((ln.c) aVar).g(null);
                return rVar;
            }
            q qVar = w.f52174c;
            uc.d dVar2 = this.f53740b;
            bVar.f53733f = aVar;
            bVar.f53736i = 2;
            Object objA = qVar.a(dVar2, bVar);
            if (objA != aVar5) {
                aVar3 = aVar;
                obj = objA;
                str = ((w) obj).f52175a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    ((ln.c) aVar3).g(null);
                    return rVar;
                }
                wj.f fVar8 = new wj.f("X-Crashlytics-Installation-ID", str);
                String str3 = Build.MANUFACTURER + Build.MODEL;
                an.g gVar2 = f53738h;
                wj.f fVar9 = new wj.f("X-Crashlytics-Device-Model", gVar2.b(str3, ""));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                kotlin.jvm.internal.n.e(INCREMENTAL2, "INCREMENTAL");
                wj.f fVar10 = new wj.f("X-Crashlytics-OS-Build-Version", gVar2.b(INCREMENTAL2, ""));
                String RELEASE2 = Build.VERSION.RELEASE;
                kotlin.jvm.internal.n.e(RELEASE2, "RELEASE");
                wj.f fVar11 = new wj.f("X-Crashlytics-OS-Display-Version", gVar2.b(RELEASE2, ""));
                this.f53741c.getClass();
                Map mapQ2 = b0.Q(fVar8, fVar9, fVar10, fVar11, new wj.f("X-Crashlytics-API-Client-Version", "3.0.7"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                d dVar3 = this.f53742d;
                b4.c cVar3 = new b4.c(this, fVar2, 16);
                jh.f fVar12 = new jh.f(i12, fVar2, 2);
                bVar.f53733f = aVar3;
                bVar.f53736i = 3;
                objJ = d0.J(dVar3.f53746b, new u71(dVar3, mapQ2, cVar3, fVar12, null), bVar);
                if (objJ != aVar5) {
                    objJ = rVar;
                }
                if (objJ != aVar5) {
                    aVar4 = aVar3;
                    ((ln.c) aVar4).g(null);
                    return rVar;
                }
            }
            return aVar5;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
        }
    }

    @Override // xd.o
    public final bn.a c() {
        Integer num = this.f53743e.a().f53750c;
        if (num == null) {
            return null;
        }
        int i10 = bn.a.f5743d;
        return new bn.a(d0.c.O(num.intValue(), bn.c.SECONDS));
    }

    @Override // xd.o
    public final Double d() {
        return this.f53743e.a().f53749b;
    }
}
