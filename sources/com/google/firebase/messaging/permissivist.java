package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SyncTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class permissivist implements Runnable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PowerManager.WakeLock f22688arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final long f22689kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final FirebaseMessaging f22690monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ExecutorService f22691polloi = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* JADX INFO: compiled from: SyncTask.java */
    public static class attabal extends BroadcastReceiver {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public permissivist f22692attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Context f22693saneness;

        public attabal(permissivist permissivistVar) {
            this.f22692attabal = permissivistVar;
        }

        public void attabal() {
            permissivist.dern();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            permissivist permissivistVar = this.f22692attabal;
            if (permissivistVar != null) {
                Context contextSaneness = permissivistVar.saneness();
                this.f22693saneness = contextSaneness;
                contextSaneness.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            permissivist permissivistVar = this.f22692attabal;
            if (permissivistVar != null && permissivistVar.wireman()) {
                permissivist.dern();
                this.f22692attabal.f22690monoploid.triweekly(this.f22692attabal, 0L);
                Context context2 = this.f22693saneness;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f22692attabal = null;
            }
        }
    }

    public permissivist(FirebaseMessaging firebaseMessaging, long j) {
        this.f22690monoploid = firebaseMessaging;
        this.f22689kowloon = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) saneness().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f22688arytenoidectomy = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean dern() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public boolean marial() throws IOException {
        try {
            if (this.f22690monoploid.impassible() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            if (yemenite.impromptu(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (splinterproof.saneness().marial(saneness())) {
            this.f22688arytenoidectomy.acquire();
        }
        try {
            this.f22690monoploid.cuirassed(true);
            if (!this.f22690monoploid.cord()) {
                this.f22690monoploid.cuirassed(false);
            } else if (!splinterproof.saneness().wireman(saneness()) || wireman()) {
                if (marial()) {
                    this.f22690monoploid.cuirassed(false);
                } else {
                    this.f22690monoploid.sealless(this.f22689kowloon);
                }
            } else {
                new attabal(this).attabal();
            }
        } catch (IOException e) {
            e.getMessage();
            this.f22690monoploid.cuirassed(false);
        } finally {
            if (splinterproof.saneness().marial(saneness())) {
                this.f22688arytenoidectomy.release();
            }
        }
    }

    public Context saneness() {
        return this.f22690monoploid.kowloon();
    }

    public boolean wireman() {
        ConnectivityManager connectivityManager = (ConnectivityManager) saneness().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
