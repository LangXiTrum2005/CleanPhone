package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f7327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f7328f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f7329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f7330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5 f7331c = new h5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f7332d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(l.p());
    }

    public void a(l lVar) {
        this.f7329a = lVar;
        this.f7330b = lVar.Q();
        a("Attached SDK instance: " + lVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f7332d;
    }

    public boolean hasSubscriber(String str) {
        return this.f7331c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f7329a.u().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f7329a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f7328f) {
            try {
                if (f7327e == null) {
                    f7327e = new AppLovinCommunicator();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f7327e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f7331c.a(appLovinCommunicatorSubscriber, str)) {
                this.f7332d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f7331c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f7330b == null || !p.a()) {
            return;
        }
        this.f7330b.a("AppLovinCommunicator", str);
    }
}
