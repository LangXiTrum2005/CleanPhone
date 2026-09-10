package A;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.inmobi.media.C2962c3;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class W implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3161Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ W(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f3161Y = obj;
        this.Z = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.X) {
            case 0:
                return C2962c3.a((OkHttpClient) this.f3161Y, (Request) this.Z);
            case 1:
                throw null;
            case 2:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.f3161Y;
                FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = (FirebaseRemoteConfigSettings) this.Z;
                ConfigSharedPrefsClient configSharedPrefsClient = firebaseRemoteConfig.f20915h;
                synchronized (configSharedPrefsClient.f20982b) {
                    configSharedPrefsClient.f20981a.edit().putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.f20917a).commit();
                    break;
                }
                return null;
            case 3:
                ConfigCacheClient configCacheClient = (ConfigCacheClient) this.f3161Y;
                ConfigContainer configContainer = (ConfigContainer) this.Z;
                ConfigStorageClient configStorageClient = configCacheClient.f20937b;
                synchronized (configStorageClient) {
                    FileOutputStream fileOutputStreamOpenFileOutput = configStorageClient.f20989a.openFileOutput(configStorageClient.f20990b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(configContainer.f20940a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            default:
                return VungleThreadPoolExecutor.Companion.m3213getWrappedCallableWithFallback$lambda0((Callable) this.f3161Y, (Function0) this.Z);
        }
    }
}
