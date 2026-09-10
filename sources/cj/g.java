package cj;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6447b;

    public /* synthetic */ g(int i10, TaskCompletionSource taskCompletionSource) {
        this.f6446a = i10;
        this.f6447b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task;
        int i10 = this.f6446a;
        TaskCompletionSource taskCompletionSource = this.f6447b;
        switch (i10) {
            case 0:
                try {
                    taskCompletionSource.setResult(new HashMap());
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
                break;
            case 1:
                try {
                    taskCompletionSource.setResult(null);
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
                break;
            case 2:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
                break;
            case 3:
                try {
                    taskCompletionSource.setResult(null);
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
                break;
            case 4:
                taskCompletionSource.setResult(null);
                break;
            case 5:
                try {
                    FirebaseMessaging firebaseMessagingD = FirebaseMessaging.d();
                    if (firebaseMessagingD.f24678d.q()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        firebaseMessagingD.f24681g.execute(new zc.j(firebaseMessagingD, taskCompletionSource2, 1));
                        task = taskCompletionSource2.getTask();
                    }
                    String str = (String) Tasks.await(task);
                    dd.f fVar = new dd.f();
                    fVar.put("token", str);
                    taskCompletionSource.setResult(fVar);
                } catch (Exception e13) {
                    taskCompletionSource.setException(e13);
                    return;
                }
                break;
            case 6:
                try {
                    Tasks.await(FirebaseMessaging.d().b());
                    taskCompletionSource.setResult(null);
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
                break;
            case 7:
                HashMap map = hj.f.f42368a;
                HashMap map2 = hj.f.f42369b;
                try {
                    for (Object obj : map2.values()) {
                        n.e(obj, "next(...)");
                        ((Trace) obj).stop();
                    }
                    map2.clear();
                    for (Object obj2 : map.values()) {
                        n.e(obj2, "next(...)");
                        ((gd.e) obj2).b();
                    }
                    map.clear();
                    taskCompletionSource.setResult(null);
                } catch (Exception e15) {
                    taskCompletionSource.setException(e15);
                    return;
                }
                break;
            default:
                HashMap map3 = hj.f.f42368a;
                try {
                    taskCompletionSource.setResult(new HashMap());
                } catch (Exception e16) {
                    taskCompletionSource.setException(e16);
                }
                break;
        }
    }

    public /* synthetic */ g(gj.f fVar, TaskCompletionSource taskCompletionSource) {
        this.f6446a = 5;
        this.f6447b = taskCompletionSource;
    }
}
