package cj;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f6459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f6460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6461d;

    public /* synthetic */ k(m mVar, Map map, TaskCompletionSource taskCompletionSource) {
        this.f6458a = 0;
        this.f6460c = mVar;
        this.f6459b = map;
        this.f6461d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6458a) {
            case 0:
                m mVar = this.f6460c;
                Map map = this.f6459b;
                TaskCompletionSource taskCompletionSource = this.f6461d;
                try {
                    FirebaseAnalytics firebaseAnalytics = mVar.f6466a;
                    if (firebaseAnalytics == null) {
                        n.l("analytics");
                        throw null;
                    }
                    Bundle bundleA = m.a(map);
                    if (bundleA != null) {
                        bundleA = new Bundle(bundleA);
                    }
                    c8 c8Var = firebaseAnalytics.f24659a;
                    c8Var.getClass();
                    c8Var.c(new m7(c8Var, bundleA, 2));
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 1:
                Map map2 = this.f6459b;
                m mVar2 = this.f6460c;
                TaskCompletionSource taskCompletionSource2 = this.f6461d;
                try {
                    Boolean bool = (Boolean) map2.get("adStorageConsentGranted");
                    Boolean bool2 = (Boolean) map2.get("analyticsStorageConsentGranted");
                    Boolean bool3 = (Boolean) map2.get("adPersonalizationSignalsConsentGranted");
                    Boolean bool4 = (Boolean) map2.get("adUserDataConsentGranted");
                    HashMap map3 = new HashMap();
                    pb.a aVar = pb.a.f48297b;
                    pb.a aVar2 = pb.a.f48296a;
                    if (bool != null) {
                        map3.put(pb.b.f48299a, bool.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool2 != null) {
                        map3.put(pb.b.f48300b, bool2.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool3 != null) {
                        map3.put(pb.b.f48302d, bool3.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool4 != null) {
                        pb.b bVar = pb.b.f48301c;
                        if (bool4.booleanValue()) {
                            aVar = aVar2;
                        }
                        map3.put(bVar, aVar);
                    }
                    FirebaseAnalytics firebaseAnalytics2 = mVar2.f6466a;
                    if (firebaseAnalytics2 == null) {
                        n.l("analytics");
                        throw null;
                    }
                    firebaseAnalytics2.a(map3);
                    taskCompletionSource2.setResult(null);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            default:
                Map map4 = this.f6459b;
                m mVar3 = this.f6460c;
                TaskCompletionSource taskCompletionSource3 = this.f6461d;
                try {
                    Object obj = map4.get(X3.i.f27798j0);
                    Objects.requireNonNull(obj);
                    String str = (String) obj;
                    Map map5 = (Map) map4.get("parameters");
                    mVar3.getClass();
                    Bundle bundleA2 = m.a(map5);
                    FirebaseAnalytics firebaseAnalytics3 = mVar3.f6466a;
                    if (firebaseAnalytics3 == null) {
                        n.l("analytics");
                        throw null;
                    }
                    c8 c8Var2 = firebaseAnalytics3.f24659a;
                    c8Var2.getClass();
                    c8Var2.c(new l7(c8Var2, (String) null, str, bundleA2, false));
                    taskCompletionSource3.setResult(null);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource3.setException(e12);
                    return;
                }
        }
    }

    public /* synthetic */ k(Map map, m mVar, TaskCompletionSource taskCompletionSource, int i10) {
        this.f6458a = i10;
        this.f6459b = map;
        this.f6460c = mVar;
        this.f6461d = taskCompletionSource;
    }
}
