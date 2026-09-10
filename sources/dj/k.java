package dj;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mb.g f38940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38941c;

    public /* synthetic */ k(mb.g gVar, TaskCompletionSource taskCompletionSource, int i10) {
        this.f38939a = i10;
        this.f38940b = gVar;
        this.f38941c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38939a) {
            case 0:
                mb.g gVar = this.f38940b;
                TaskCompletionSource taskCompletionSource = this.f38941c;
                try {
                    Map map = (Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar));
                    if (map == null) {
                        map = w.f53867a;
                    }
                    HashMap map2 = new HashMap(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        map2.put((String) entry.getKey(), entry.getValue());
                    }
                    gVar.a();
                    String str = gVar.f45929b;
                    n.e(str, "getName(...)");
                    gVar.a();
                    mb.i iVar = gVar.f45930c;
                    n.e(iVar, "getOptions(...)");
                    taskCompletionSource.setResult(new b(str, l.a(iVar), Boolean.valueOf(gVar.k()), map2));
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
                break;
            case 1:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f38940b, this.f38941c);
                break;
            case 2:
                mb.g gVar2 = this.f38940b;
                TaskCompletionSource taskCompletionSource2 = this.f38941c;
                try {
                    HashMap map3 = new HashMap();
                    gVar2.a();
                    if (n.a(gVar2.f45929b, "[DEFAULT]")) {
                        map3.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(ej.d.b(mb.g.e())));
                    }
                    taskCompletionSource2.setResult(map3);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
                break;
            default:
                mb.g gVar3 = this.f38940b;
                TaskCompletionSource taskCompletionSource3 = this.f38941c;
                try {
                    HashMap map4 = new HashMap();
                    gVar3.a();
                    if (gVar3.f45929b.equals("[DEFAULT]")) {
                        map4.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.d().f24680f.c()));
                    }
                    taskCompletionSource3.setResult(map4);
                } catch (Exception e12) {
                    taskCompletionSource3.setException(e12);
                }
                break;
        }
    }

    public /* synthetic */ k(mb.g gVar, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f38939a = 0;
        this.f38940b = gVar;
        this.f38941c = taskCompletionSource;
    }

    public /* synthetic */ k(mb.g gVar, ej.d dVar, TaskCompletionSource taskCompletionSource) {
        this.f38939a = 2;
        this.f38940b = gVar;
        this.f38941c = taskCompletionSource;
    }
}
