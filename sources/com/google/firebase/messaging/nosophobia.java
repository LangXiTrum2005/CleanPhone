package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: WithinAppServiceBinder.java */
/* JADX INFO: loaded from: classes3.dex */
public class nosophobia extends Binder {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f22683dern;

    /* JADX INFO: compiled from: WithinAppServiceBinder.java */
    public interface attabal {
        Task<Void> attabal(Intent intent);
    }

    public nosophobia(attabal attabalVar) {
        this.f22683dern = attabalVar;
    }

    public void saneness(final empress.attabal attabalVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        this.f22683dern.attabal(attabalVar.f22646attabal).addOnCompleteListener(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new OnCompleteListener() { // from class: com.google.firebase.messaging.lerp
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                attabalVar.wireman();
            }
        });
    }
}
