package bd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;
import ld.e;
import mb.g;
import mb.i;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.a f5586d = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5587a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dd.a f5588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f5589c;

    public c(g gVar, tc.b bVar, uc.d dVar, tc.b bVar2, RemoteConfigManager remoteConfigManager, dd.a aVar, SessionManager sessionManager) {
        Bundle bundle = null;
        this.f5589c = null;
        if (gVar == null) {
            this.f5589c = Boolean.FALSE;
            this.f5588b = aVar;
            new md.c(new Bundle());
            return;
        }
        i iVar = gVar.f45930c;
        ld.g gVar2 = ld.g.f45301s;
        gVar2.f45305d = gVar;
        gVar.a();
        gVar2.f45316p = iVar.f45950h;
        gVar2.f45307f = dVar;
        gVar2.f45308g = bVar2;
        gVar2.f45310i.execute(new e(gVar2, 1));
        gVar.a();
        Context context = gVar.f45928a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
        }
        md.c cVar = bundle != null ? new md.c(bundle) : new md.c();
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f5588b = aVar;
        aVar.f38807b = cVar;
        dd.a.f38804d.f40789b = i0.R(context);
        aVar.f38808c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = aVar.g();
        this.f5589c = boolG;
        fd.a aVar2 = f5586d;
        if (aVar2.f40789b) {
            if (boolG != null ? boolG.booleanValue() : g.e().k()) {
                gVar.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(com.bumptech.glide.c.u(iVar.f45950h, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (aVar2.f40789b) {
                    aVar2.f40788a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }

    public static c a() {
        return (c) g.e().c(c.class);
    }

    public final void b(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        synchronized (this) {
            try {
                g.e();
                if (this.f5588b.f().booleanValue()) {
                    fd.a aVar = f5586d;
                    if (aVar.f40789b) {
                        aVar.f40788a.getClass();
                        Log.i("FirebasePerformance", "Firebase Performance is permanently disabled");
                    }
                    return;
                }
                dd.a aVar2 = this.f5588b;
                if (!aVar2.f().booleanValue()) {
                    dd.c.V().getClass();
                    aVar2.f38808c.g("isEnabled", Boolean.TRUE.equals(boolValueOf));
                }
                this.f5589c = boolValueOf;
                if (Boolean.TRUE.equals(boolValueOf)) {
                    fd.a aVar3 = f5586d;
                    if (aVar3.f40789b) {
                        aVar3.f40788a.getClass();
                        Log.i("FirebasePerformance", "Firebase Performance is Enabled");
                    }
                } else if (Boolean.FALSE.equals(this.f5589c)) {
                    fd.a aVar4 = f5586d;
                    if (aVar4.f40789b) {
                        aVar4.f40788a.getClass();
                        Log.i("FirebasePerformance", "Firebase Performance is Disabled");
                    }
                }
            } catch (IllegalStateException unused) {
            }
        }
    }
}
