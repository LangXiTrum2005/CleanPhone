package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DisplayNotification.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ExecutorService f22609attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final polder f22610dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f22611saneness;

    public beachfront(Context context, polder polderVar, ExecutorService executorService) {
        this.f22609attabal = executorService;
        this.f22611saneness = context;
        this.f22610dern = polderVar;
    }

    public boolean attabal() {
        if (this.f22610dern.attabal("gcm.n.noui")) {
            return true;
        }
        if (saneness()) {
            return false;
        }
        kattegat kattegatVarWireman = wireman();
        wireman.attabal attabalVarMarial = wireman.marial(this.f22611saneness, this.f22610dern);
        marial(attabalVarMarial.f22776attabal, kattegatVarWireman);
        dern(attabalVarMarial);
        return true;
    }

    public final void dern(wireman.attabal attabalVar) {
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f22611saneness.getSystemService("notification")).notify(attabalVar.f22778saneness, attabalVar.f22777dern, attabalVar.f22776attabal.saneness());
    }

    public final void marial(NotificationCompat.impassible impassibleVar, kattegat kattegatVar) {
        if (kattegatVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(kattegatVar.cutely(), 5L, TimeUnit.SECONDS);
            impassibleVar.monoploid(bitmap);
            impassibleVar.stratoscope(new NotificationCompat.cutely().taiyuan(bitmap).impromptu(null));
        } catch (InterruptedException unused) {
            kattegatVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Objects.toString(e.getCause());
        } catch (TimeoutException unused2) {
            kattegatVar.close();
        }
    }

    public final boolean saneness() {
        if (((KeyguardManager) this.f22611saneness.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f22611saneness.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final kattegat wireman() {
        kattegat kattegatVarMarial = kattegat.marial(this.f22610dern.arytenoidectomy("gcm.n.image"));
        if (kattegatVarMarial != null) {
            kattegatVarMarial.formularize(this.f22609attabal);
        }
        return kattegatVarMarial;
    }
}
