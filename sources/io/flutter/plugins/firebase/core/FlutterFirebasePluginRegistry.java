package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import cj.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dj.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(mb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(gVar, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        HashMap map;
        try {
            Map<String, FlutterFirebasePlugin> map2 = registeredPlugins;
            synchronized (map2) {
                map = new HashMap(map2);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Tasks.await(((FlutterFirebasePlugin) ((Map.Entry) it.next()).getValue()).didReinitializeFirebaseCore());
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(mb.g gVar, TaskCompletionSource taskCompletionSource) {
        HashMap map;
        try {
            Map<String, FlutterFirebasePlugin> map2 = registeredPlugins;
            synchronized (map2) {
                map = new HashMap(map2);
            }
            HashMap map3 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                map3.put((String) entry.getKey(), Tasks.await(((FlutterFirebasePlugin) entry.getValue()).getPluginConstantsForFirebaseApp(gVar)));
            }
            taskCompletionSource.setResult(map3);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        Map<String, FlutterFirebasePlugin> map = registeredPlugins;
        synchronized (map) {
            map.put(str, flutterFirebasePlugin);
        }
    }
}
