package com.google.firebase.remoteconfig;

import android.util.Log;
import androidx.media3.exoplayer.analytics.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {
    public final /* synthetic */ FirebaseRemoteConfig X;

    public /* synthetic */ a(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.X = firebaseRemoteConfig;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseRemoteConfig firebaseRemoteConfig = this.X;
        Task taskB = firebaseRemoteConfig.d.b();
        Task taskB2 = firebaseRemoteConfig.f20914e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(firebaseRemoteConfig.f20913c, new o(firebaseRemoteConfig, taskB, taskB2, 8));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z2;
        FirebaseRemoteConfig firebaseRemoteConfig = this.X;
        firebaseRemoteConfig.getClass();
        if (task.isSuccessful()) {
            ConfigCacheClient configCacheClient = firebaseRemoteConfig.d;
            synchronized (configCacheClient) {
                configCacheClient.f20938c = Tasks.forResult(null);
            }
            ConfigStorageClient configStorageClient = configCacheClient.f20937b;
            synchronized (configStorageClient) {
                configStorageClient.f20989a.deleteFile(configStorageClient.f20990b);
            }
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (configContainer != null) {
                JSONArray jSONArray = configContainer.d;
                FirebaseABTesting firebaseABTesting = firebaseRemoteConfig.f20912b;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.b(FirebaseRemoteConfig.c(jSONArray));
                    } catch (AbtException e2) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    } catch (JSONException e3) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
                    }
                }
                RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = firebaseRemoteConfig.k;
                try {
                    RolloutsState rolloutsStateA = rolloutsStateSubscriptionsHandler.f21000b.a(configContainer);
                    Iterator it = rolloutsStateSubscriptionsHandler.d.iterator();
                    while (it.hasNext()) {
                        rolloutsStateSubscriptionsHandler.f21001c.execute(new w.a((RolloutsStateSubscriber) it.next(), rolloutsStateA, 0));
                    }
                } catch (FirebaseRemoteConfigException e4) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e4);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
