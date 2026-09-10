package dj;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f38937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38938d;

    public /* synthetic */ j(Context context, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f38936b = context;
        this.f38938d = taskCompletionSource;
        this.f38937c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<mb.g> arrayList;
        switch (this.f38935a) {
            case 0:
                Context context = this.f38936b;
                TaskCompletionSource taskCompletionSource = this.f38938d;
                l lVar = this.f38937c;
                try {
                    if (context == null) {
                        throw new IllegalStateException("FlutterFirebaseCorePlugin is not attached to an engine");
                    }
                    mb.i iVarA = mb.i.a(context);
                    if (iVarA == null) {
                        taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                        return;
                    } else {
                        lVar.getClass();
                        taskCompletionSource.setResult(l.a(iVarA));
                        return;
                    }
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                Context context2 = this.f38936b;
                l lVar2 = this.f38937c;
                TaskCompletionSource taskCompletionSource2 = this.f38938d;
                try {
                    if (context2 == null) {
                        throw new IllegalStateException("FlutterFirebaseCorePlugin is not attached to an engine");
                    }
                    if (lVar2.f38943b) {
                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                    } else {
                        lVar2.f38943b = true;
                    }
                    synchronized (mb.g.f45927k) {
                        arrayList = new ArrayList(mb.g.l.values());
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (mb.g gVar : arrayList) {
                        n.c(gVar);
                        TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                        FlutterFirebasePlugin.cachedThreadPool.execute(new k(gVar, taskCompletionSource3, lVar2));
                        Task task = taskCompletionSource3.getTask();
                        n.e(task, "getTask(...)");
                        arrayList2.add(Tasks.await(task));
                    }
                    taskCompletionSource2.setResult(arrayList2);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
        }
    }

    public /* synthetic */ j(Context context, l lVar, TaskCompletionSource taskCompletionSource) {
        this.f38936b = context;
        this.f38937c = lVar;
        this.f38938d = taskCompletionSource;
    }
}
