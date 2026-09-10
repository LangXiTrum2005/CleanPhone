package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: TopicsSyncTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class treadless implements Runnable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static Boolean f22764adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static Boolean f22765dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final Object f22766graveside = new Object();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f22767arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f22768kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final long f22769molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PowerManager.WakeLock f22770monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final milliradian f22771polloi;

    /* JADX INFO: compiled from: TopicsSyncTask.java */
    public class attabal extends BroadcastReceiver {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public treadless f22772attabal;

        public attabal(treadless treadlessVar) {
            this.f22772attabal = treadlessVar;
        }

        public void attabal() {
            treadless.cutely();
            treadless.this.f22768kowloon.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            treadless treadlessVar = this.f22772attabal;
            if (treadlessVar == null) {
                return;
            }
            if (treadlessVar.taiyuan()) {
                treadless.cutely();
                this.f22772attabal.f22771polloi.formularize(this.f22772attabal, 0L);
                context.unregisterReceiver(this);
                this.f22772attabal = null;
            }
        }
    }

    public treadless(milliradian milliradianVar, Context context, merc mercVar, long j) {
        this.f22771polloi = milliradianVar;
        this.f22768kowloon = context;
        this.f22769molybdenite = j;
        this.f22767arytenoidectomy = mercVar;
        this.f22770monoploid = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean beachfront(Context context) {
        boolean zBooleanValue;
        synchronized (f22766graveside) {
            try {
                Boolean bool = f22765dovishness;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? competently(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f22765dovishness = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean competently(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            marial(str);
        }
        return z;
    }

    public static boolean cutely() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public static boolean impromptu(Context context) {
        boolean zBooleanValue;
        synchronized (f22766graveside) {
            try {
                Boolean bool = f22764adultoid;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? competently(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f22764adultoid = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static String marial(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (impromptu(this.f22768kowloon)) {
            this.f22770monoploid.acquire(marial.f22665attabal);
        }
        try {
            try {
                try {
                    this.f22771polloi.triweekly(true);
                    if (!this.f22767arytenoidectomy.competently()) {
                        this.f22771polloi.triweekly(false);
                        if (impromptu(this.f22768kowloon)) {
                            try {
                                this.f22770monoploid.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (beachfront(this.f22768kowloon) && !taiyuan()) {
                        new attabal(this).attabal();
                        if (impromptu(this.f22768kowloon)) {
                            try {
                                this.f22770monoploid.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f22771polloi.polloi()) {
                        this.f22771polloi.triweekly(false);
                    } else {
                        this.f22771polloi.molybdenite(this.f22769molybdenite);
                    }
                    if (impromptu(this.f22768kowloon)) {
                        this.f22770monoploid.release();
                    }
                } catch (IOException e) {
                    e.getMessage();
                    this.f22771polloi.triweekly(false);
                    if (impromptu(this.f22768kowloon)) {
                        this.f22770monoploid.release();
                    }
                }
            } catch (Throwable th) {
                if (impromptu(this.f22768kowloon)) {
                    try {
                        this.f22770monoploid.release();
                    } catch (RuntimeException unused3) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
        }
    }

    public final synchronized boolean taiyuan() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f22768kowloon.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
