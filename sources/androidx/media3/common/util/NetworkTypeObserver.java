package androidx.media3.common.util;

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

/* JADX INFO: loaded from: classes.dex */
public final class NetworkTypeObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static NetworkTypeObserver f5657e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5658a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5659b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5660c = new Object();
    public int d = 0;

    public static final class Api31 {

        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NetworkTypeObserver f5661a;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.f5661a = networkTypeObserver;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                NetworkTypeObserver.a(this.f5661a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }

    public interface Listener {
        void a(int i2);
    }

    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0033  */
        /* JADX WARN: Code duplicated, block: B:22:0x003a  */
        /* JADX WARN: Code duplicated, block: B:23:0x003c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0042  */
        /* JADX WARN: Code duplicated, block: B:26:0x0044  */
        /* JADX WARN: Code duplicated, block: B:27:0x0046  */
        /* JADX WARN: Code duplicated, block: B:28:0x0048  */
        /* JADX WARN: Code duplicated, block: B:29:0x004a  */
        /* JADX WARN: Code duplicated, block: B:30:0x004c  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i2;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                i2 = 0;
            } else {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i2 = 1;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i2 = 3;
                                    break;
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
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i2 = 6;
                                    break;
                                case 18:
                                    i2 = 2;
                                    break;
                                case 20:
                                    if (Util.f5683a >= 29) {
                                        i2 = 0;
                                    } else {
                                        i2 = 9;
                                    }
                                    break;
                            }
                        } else if (type == 1) {
                            i2 = 2;
                        } else if (type == 4 || type == 5) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i2 = 3;
                                    break;
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
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i2 = 6;
                                    break;
                                case 18:
                                    i2 = 2;
                                    break;
                                case 20:
                                    if (Util.f5683a >= 29) {
                                        i2 = 0;
                                    } else {
                                        i2 = 9;
                                    }
                                    break;
                            }
                        } else if (type != 6) {
                            i2 = type != 9 ? 8 : 7;
                        } else {
                            i2 = 5;
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            int i3 = Util.f5683a;
            NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.this;
            if (i3 < 31 || i2 != 5) {
                NetworkTypeObserver.a(networkTypeObserver, i2);
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                Api31.DisplayInfoCallback displayInfoCallback = new Api31.DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (RuntimeException unused2) {
                NetworkTypeObserver.a(networkTypeObserver, 5);
            }
        }
    }

    public NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(), intentFilter);
    }

    public static void a(NetworkTypeObserver networkTypeObserver, int i2) {
        synchronized (networkTypeObserver.f5660c) {
            try {
                if (networkTypeObserver.d == i2) {
                    return;
                }
                networkTypeObserver.d = i2;
                for (WeakReference weakReference : networkTypeObserver.f5659b) {
                    Listener listener = (Listener) weakReference.get();
                    if (listener != null) {
                        listener.a(i2);
                    } else {
                        networkTypeObserver.f5659b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized NetworkTypeObserver b(Context context) {
        try {
            if (f5657e == null) {
                f5657e = new NetworkTypeObserver(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5657e;
    }

    public final int c() {
        int i2;
        synchronized (this.f5660c) {
            i2 = this.d;
        }
        return i2;
    }
}
