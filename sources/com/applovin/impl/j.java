package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8185b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f8186c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8187d = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.l lVar) {
        this.f8184a = lVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.l.p()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f8187d.remove(bVar);
    }

    public void c(String str) {
        this.f8184a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Removing ad info for serve id: ", str, this.f8184a.Q(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8185b) {
            this.f8186c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f8184a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8184a.Q().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f8184a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8184a.Q().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f8184a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8184a.Q().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f8184a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8184a.Q().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f8185b) {
                try {
                    this.f8184a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8184a.Q().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f8186c.put(string, bundle);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f8184a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Received SafeDK ad info with Ad Review creative id: ", string2, this.f8184a.Q(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f8187d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f8187d);
            this.f8184a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8184a.Q().a("AdReviewManager", "Notifying listeners: " + this.f8187d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f8184a.s0().a((k5) new u6(this.f8184a, "creativeIdGenerated", new bc.r(this, (b) it.next(), string, string2)), f6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f8185b) {
            bundle = (Bundle) this.f8186c.get(str);
        }
        this.f8184a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8184a.Q().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void a(b bVar) {
        this.f8187d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f8184a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8184a.Q().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}
