package decarock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: NetworkTypeObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class molybdenite {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static molybdenite f25116marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Handler f25117attabal = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<dern>> f25119saneness = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Object f25118dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25120wireman = 0;

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public interface dern {
        void attabal(int i);
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public static final class saneness {

        /* JADX INFO: compiled from: NetworkTypeObserver.java */
        public static final class attabal extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final molybdenite f25121attabal;

            public attabal(molybdenite molybdeniteVar) {
                this.f25121attabal = molybdeniteVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f25121attabal.cutely(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void attabal(Context context, molybdenite molybdeniteVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) decarock.attabal.marial((TelephonyManager) context.getSystemService("phone"));
                attabal attabalVar = new attabal(molybdeniteVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), attabalVar);
                telephonyManager.unregisterTelephonyCallback(attabalVar);
            } catch (RuntimeException unused) {
                molybdeniteVar.cutely(5);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public final class wireman extends BroadcastReceiver {
        public wireman() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iCompetently = molybdenite.competently(context);
            if (grimness.f25080attabal < 31 || iCompetently != 5) {
                molybdenite.this.cutely(iCompetently);
            } else {
                saneness.attabal(context, molybdenite.this);
            }
        }
    }

    public molybdenite(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new wireman(), intentFilter);
    }

    public static int competently(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return marial(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public static int marial(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return grimness.f25080attabal >= 29 ? 9 : 0;
        }
    }

    public static synchronized molybdenite wireman(Context context) {
        try {
            if (f25116marial == null) {
                f25116marial = new molybdenite(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25116marial;
    }

    public int beachfront() {
        int i;
        synchronized (this.f25118dern) {
            i = this.f25120wireman;
        }
        return i;
    }

    public final void cutely(int i) {
        synchronized (this.f25118dern) {
            try {
                if (this.f25120wireman == i) {
                    return;
                }
                this.f25120wireman = i;
                for (WeakReference<dern> weakReference : this.f25119saneness) {
                    dern dernVar = weakReference.get();
                    if (dernVar != null) {
                        dernVar.attabal(i);
                    } else {
                        this.f25119saneness.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void impromptu(final dern dernVar) {
        taiyuan();
        this.f25119saneness.add(new WeakReference<>(dernVar));
        this.f25117attabal.post(new Runnable() { // from class: decarock.polloi
            @Override // java.lang.Runnable
            public final void run() {
                dernVar.attabal(this.f25124kowloon.beachfront());
            }
        });
    }

    public final void taiyuan() {
        for (WeakReference<dern> weakReference : this.f25119saneness) {
            if (weakReference.get() == null) {
                this.f25119saneness.remove(weakReference);
            }
        }
    }
}
