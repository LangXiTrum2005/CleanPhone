package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AFi1tSDK extends AFi1qSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFAdRevenueData() {
        Network[] allNetworks;
        Sequence sequenceSealless;
        Sequence sequenceMerc;
        Object next;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceSealless = p002kotlin.collections.polloi.sealless(allNetworks)) != null && (sequenceMerc = SequencesKt___SequencesKt.merc(sequenceSealless, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1tSDK.2
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1tSDK.this.getMonetizationNetwork;
                Intrinsics.beachfront(connectivityManager2);
                return connectivityManager2.getNetworkInfo(network);
            }
        })) != null) {
            Iterator it = sequenceMerc.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AFi1qSDK.v_((NetworkInfo) next));
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type != 0) {
                    return type != 1 ? "unknown" : "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMediationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                Intrinsics.beachfront(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (w_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }
}
