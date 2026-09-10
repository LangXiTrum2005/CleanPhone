package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8071a = new HashSet(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8072b = new Object();

    public boolean a(String str) {
        synchronized (this.f8072b) {
            try {
                Iterator it = this.f8071a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((i5) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        i5 i5VarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f8072b) {
                i5VarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (i5VarA != null) {
                i5VarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(i5VarA);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f8072b) {
                try {
                    i5 i5VarA = a(str, appLovinCommunicatorSubscriber);
                    if (i5VarA != null) {
                        com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!i5VarA.c()) {
                            i5VarA.a(true);
                            AppLovinBroadcastManager.registerReceiver(i5VarA, new IntentFilter(str));
                        }
                        return true;
                    }
                    i5 i5Var = new i5(str, appLovinCommunicatorSubscriber);
                    this.f8071a.add(i5Var);
                    AppLovinBroadcastManager.registerReceiver(i5Var, new IntentFilter(str));
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private i5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (i5 i5Var : this.f8071a) {
            if (str.equals(i5Var.b()) && appLovinCommunicatorSubscriber.equals(i5Var.a())) {
                return i5Var;
            }
        }
        return null;
    }
}
