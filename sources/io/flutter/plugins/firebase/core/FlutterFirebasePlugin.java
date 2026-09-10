package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mb.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    public static final Map<String, String> customAuthDomain = new HashMap();

    Task<Void> didReinitializeFirebaseCore();

    Task<Map<String, Object>> getPluginConstantsForFirebaseApp(g gVar);
}
