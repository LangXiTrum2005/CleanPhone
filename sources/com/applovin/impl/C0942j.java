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

/* JADX INFO: renamed from: com.applovin.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0942j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10977b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f10978c = new a();
    private final Set d = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.applovin.impl.j$a */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.j$b */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C0942j(com.applovin.impl.sdk.k kVar) {
        this.f10976a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.d.remove(bVar);
    }

    public void c(String str) {
        this.f10976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            androidx.media3.extractor.text.ttml.a.y("Removing ad info for serve id: ", str, this.f10976a.O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f10977b) {
            this.f10978c.remove(str);
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
                this.f10976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10976a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f10976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10976a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f10976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10976a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f10976a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10976a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f10977b) {
                try {
                    this.f10976a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f10976a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f10978c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f10976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                androidx.media3.extractor.text.ttml.a.y("Received SafeDK ad info with Ad Review creative id: ", string2, this.f10976a.O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.d);
            this.f10976a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10976a.O().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f10976a.q0().a((i5) new r6(this.f10976a, "creativeIdGenerated", new A.F(this, (b) it.next(), string, string2, 11)), d6.b.OTHER);
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
        synchronized (this.f10977b) {
            bundle = (Bundle) this.f10978c.get(str);
        }
        this.f10976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10976a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
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
        this.d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f10976a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10976a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}
