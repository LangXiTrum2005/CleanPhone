package cj;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.applovin.impl.k5;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdError;
import io.flutter.view.FlutterCallbackInformation;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import l1.y;
import p1.b0;
import p1.v;
import xi.p;
import zb.r;
import zb.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6465d;

    public /* synthetic */ l(long j10, String str, Context context) {
        this.f6462a = 2;
        this.f6463b = j10;
        this.f6464c = str;
        this.f6465d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6462a;
        int i11 = 26;
        Object obj = this.f6465d;
        long j10 = this.f6463b;
        Object obj2 = this.f6464c;
        switch (i10) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((m) obj2).f6466a;
                    if (firebaseAnalytics == null) {
                        n.l("analytics");
                        throw null;
                    }
                    c8 c8Var = firebaseAnalytics.f24659a;
                    c8Var.getClass();
                    c8Var.c(new r7(c8Var, j10));
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 1:
                ((k5) obj2).a((Thread) obj, j10);
                return;
            case 2:
                ActivityLifecycleTracker.onActivityResumed$lambda$3(j10, (String) obj2, (Context) obj);
                return;
            case 3:
                Ya.a((Ya) obj2, j10, (LevelPlayAdError) obj);
                return;
            case 4:
                g9.k kVar = (g9.k) obj2;
                kVar.getClass();
                String str = (String) ((ri.d) obj).f49603d.f5778c;
                AssetManager assets = a.a.f3311a.getAssets();
                if (((AtomicBoolean) kVar.f41770b).get()) {
                    return;
                }
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                kVar.f41772d = new ni.c(a.a.f3311a);
                FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                if (flutterCallbackInformationLookupCallbackInformation == null) {
                    Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                    return;
                }
                n.j jVar = ((ni.c) kVar.f41772d).f46739c;
                p pVar = new p(jVar, "plugins.flutter.io/firebase_messaging_background");
                kVar.f41771c = pVar;
                pVar.b(kVar);
                jVar.c(new g9.k(assets, str, flutterCallbackInformationLookupCallbackInformation, i11));
                return;
            case 5:
                v vVar = ((l2.v) obj2).f44942b;
                String str2 = y.f44830a;
                b0 b0Var = vVar.f48170a;
                q1.f fVar = b0Var.f47953s;
                q1.a aVarH = fVar.H();
                fVar.I(aVarH, 26, new q1.e(aVarH, obj, j10));
                if (b0Var.S == obj) {
                    b0Var.f47947m.e(26, new ni.g(7));
                    return;
                }
                return;
            default:
                String str3 = (String) obj;
                zb.l lVar = ((r) obj2).f54743h;
                t tVar = lVar.f54716n;
                if (tVar == null || !tVar.f54762e.get()) {
                    ((bc.d) lVar.f54712i.f5548b).h(j10, str3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l(Object obj, long j10, Object obj2, int i10) {
        this.f6462a = i10;
        this.f6464c = obj;
        this.f6463b = j10;
        this.f6465d = obj2;
    }

    public /* synthetic */ l(Object obj, Object obj2, long j10, int i10) {
        this.f6462a = i10;
        this.f6464c = obj;
        this.f6465d = obj2;
        this.f6463b = j10;
    }
}
