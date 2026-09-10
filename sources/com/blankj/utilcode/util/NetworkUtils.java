package com.blankj.utilcode.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkUtils {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Set<adultoid.saneness<Object>> f17423attabal = new CopyOnWriteArraySet();

    public static final class NetworkChangedReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public NetworkType f17424attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Set<attabal> f17425saneness = new HashSet();

        public class attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ attabal f17427kowloon;

            public attabal(attabal attabalVar) {
                this.f17427kowloon = attabalVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = NetworkChangedReceiver.this.f17425saneness.size();
                NetworkChangedReceiver.this.f17425saneness.add(this.f17427kowloon);
                if (size == 0 && NetworkChangedReceiver.this.f17425saneness.size() == 1) {
                    NetworkChangedReceiver.this.f17424attabal = NetworkUtils.saneness();
                    adultoid.attabal().registerReceiver(NetworkChangedReceiver.marial(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        public static class dern {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final NetworkChangedReceiver f17428attabal = new NetworkChangedReceiver();
        }

        public class saneness implements Runnable {
            public saneness() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NetworkType networkTypeSaneness = NetworkUtils.saneness();
                if (NetworkChangedReceiver.this.f17424attabal == networkTypeSaneness) {
                    return;
                }
                NetworkChangedReceiver.this.f17424attabal = networkTypeSaneness;
                if (networkTypeSaneness == NetworkType.NETWORK_NO) {
                    Iterator it = NetworkChangedReceiver.this.f17425saneness.iterator();
                    while (it.hasNext()) {
                        ((attabal) it.next()).onDisconnected();
                    }
                } else {
                    Iterator it2 = NetworkChangedReceiver.this.f17425saneness.iterator();
                    while (it2.hasNext()) {
                        ((attabal) it2.next()).attabal(networkTypeSaneness);
                    }
                }
            }
        }

        public static NetworkChangedReceiver marial() {
            return dern.f17428attabal;
        }

        public void beachfront(attabal attabalVar) {
            if (attabalVar == null) {
                return;
            }
            rotuma.cord(new attabal(attabalVar));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                rotuma.cuirassed(new saneness(), 1000L);
            }
        }
    }

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    public interface attabal {
        void attabal(NetworkType networkType);

        void onDisconnected();
    }

    public static NetworkInfo attabal() {
        ConnectivityManager connectivityManager = (ConnectivityManager) adultoid.attabal().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static boolean dern() {
        NetworkInfo networkInfoAttabal = attabal();
        return networkInfoAttabal != null && networkInfoAttabal.isConnected();
    }

    public static void marial(attabal attabalVar) {
        NetworkChangedReceiver.marial().beachfront(attabalVar);
    }

    public static NetworkType saneness() {
        if (wireman()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo networkInfoAttabal = attabal();
        if (networkInfoAttabal == null || !networkInfoAttabal.isAvailable()) {
            return NetworkType.NETWORK_NO;
        }
        if (networkInfoAttabal.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (networkInfoAttabal.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (networkInfoAttabal.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            case 19:
            default:
                String subtypeName = networkInfoAttabal.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_5G;
        }
    }

    public static boolean wireman() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) adultoid.attabal().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        return state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING;
    }
}
