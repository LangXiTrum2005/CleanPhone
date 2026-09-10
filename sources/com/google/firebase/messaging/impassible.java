package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: FcmBroadcastProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public class impassible {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f22650dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static empress f22651wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f22652attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f22653saneness = new androidx.privacysandbox.ads.adservices.measurement.cutely();

    public impassible(Context context) {
        this.f22652attabal = context;
    }

    public static /* synthetic */ Task attabal(Context context, Intent intent, boolean z, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? marial(context, intent, z).continueWith(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new Continuation() { // from class: com.google.firebase.messaging.apical
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return impassible.wireman(task2);
            }
        }) : task;
    }

    public static empress beachfront(Context context, String str) {
        empress empressVar;
        synchronized (f22650dern) {
            try {
                if (f22651wireman == null) {
                    f22651wireman = new empress(context, str);
                }
                empressVar = f22651wireman;
            } catch (Throwable th) {
                throw th;
            }
        }
        return empressVar;
    }

    public static /* synthetic */ Integer dern(Task task) {
        return -1;
    }

    public static Task<Integer> marial(Context context, Intent intent, boolean z) {
        Log.isLoggable("FirebaseMessaging", 3);
        empress empressVarBeachfront = beachfront(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return empressVarBeachfront.wireman(intent).continueWith(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new Continuation() { // from class: com.google.firebase.messaging.formularize
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return impassible.dern(task);
                }
            });
        }
        if (splinterproof.saneness().marial(context)) {
            coffeecake.marial(context, empressVarBeachfront, intent);
        } else {
            empressVarBeachfront.wireman(intent);
        }
        return Tasks.forResult(-1);
    }

    public static /* synthetic */ Integer wireman(Task task) {
        return 403;
    }

    public Task<Integer> competently(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return impromptu(this.f22652attabal, intent);
    }

    public Task<Integer> impromptu(final Context context, final Intent intent) {
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(this.f22653saneness, new Callable() { // from class: com.google.firebase.messaging.taiyuan
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(splinterproof.saneness().competently(context, intent));
            }
        }).continueWithTask(this.f22653saneness, new Continuation() { // from class: com.google.firebase.messaging.cutely
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return impassible.attabal(context, intent, z2, task);
            }
        }) : marial(context, intent, z2);
    }
}
