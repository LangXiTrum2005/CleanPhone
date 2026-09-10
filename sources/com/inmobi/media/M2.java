package com.inmobi.media;

import A.RunnableC0883c;
import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class M2 {
    public static void a() {
        if (O2.f23029c.getAndSet(true)) {
            return;
        }
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        b();
        a("root", Uc.b(), null);
    }

    public static void b() {
        ArrayList arrayList = new ArrayList();
        Q2 q2 = (Q2) O2.f.getX();
        q2.getClass();
        for (Config config : CollectionsKt.u(T1.a(q2, null, null, null, null, null, null, 63))) {
            ConcurrentHashMap concurrentHashMap = O2.f23030e;
            Intrinsics.f(config, "<this>");
            HashMap map = D3.f22758a;
            Config config2 = (Config) concurrentHashMap.put(D3.b(config.getAccountId$media_release(), config.getType()), config);
            if (config2 == null || config2.getLastUpdateTimeStamp() != config.getLastUpdateTimeStamp()) {
                arrayList.add(D3.b(config.getAccountId$media_release(), config.getType()));
            }
        }
        ((I2) O2.f23028b.getX()).post(new RunnableC0883c(arrayList, 6));
    }

    public static final void a(List changedConfigKeys) {
        Intrinsics.f(changedConfigKeys, "$changedConfigKeys");
        try {
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
            Iterator it = changedConfigKeys.iterator();
            while (it.hasNext()) {
                Config config = (Config) O2.f23030e.get((String) it.next());
                if (config != null) {
                    b(config);
                }
            }
        } catch (Exception unused) {
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0082  */
    public static Config a(String type, String str, N2 n2) {
        Config config;
        Intrinsics.f(type, "type");
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        Objects.toString(n2);
        Config configA = D3.a(str, type);
        if (str == null) {
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
            return configA;
        }
        Message messageObtainMessage = ((I2) O2.f23028b.getX()).obtainMessage();
        Intrinsics.e(messageObtainMessage, "obtainMessage(...)");
        messageObtainMessage.what = 0;
        messageObtainMessage.obj = new S2(configA, n2);
        ((I2) O2.f23028b.getX()).sendMessage(messageObtainMessage);
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        Objects.toString(configA);
        String accountId$media_release = configA.getAccountId$media_release();
        if (accountId$media_release != null) {
            String type2 = configA.getType();
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
            ConcurrentHashMap concurrentHashMap = O2.f23030e;
            Intrinsics.f(type2, "<this>");
            config = (Config) concurrentHashMap.get(D3.b(accountId$media_release, type2));
            if (config != null) {
                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                config.getLastUpdateTimeStamp();
            } else {
                config = null;
            }
        } else {
            config = null;
        }
        return config == null ? configA : config;
    }

    public static void b(Config config) {
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        ArrayList arrayList = (ArrayList) O2.f23027a.get(config);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            Intrinsics.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.e(next, "next(...)");
                if (((WeakReference) next).get() == null) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) O2.f23027a.get(config);
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                N2 n2 = (N2) ((WeakReference) it2.next()).get();
                if (n2 != null) {
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    n2.getClass().toString();
                    n2.a(config);
                }
            }
        }
    }

    public static Config a(String accountId, String type) {
        Intrinsics.f(accountId, "accountId");
        Intrinsics.f(type, "type");
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        ConcurrentHashMap concurrentHashMap = O2.f23030e;
        Config config = (Config) concurrentHashMap.get(D3.b(accountId, type));
        Config config2 = null;
        if (config != null) {
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
            config.getLastUpdateTimeStamp();
        } else {
            config = null;
        }
        if (config != null) {
            return config;
        }
        Q2 q2 = (Q2) O2.f.getX();
        q2.getClass();
        Config config3 = (Config) q2.b("account_id=? AND config_type=?", new String[]{accountId, type});
        if (config3 != null) {
            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
            config3.toString();
            if (B2.a(config3.getAccountId$media_release()) && config3.getType().length() > 0) {
                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                concurrentHashMap.put(D3.b(config3.getAccountId$media_release(), config3.getType()), config3);
                b(config3);
            }
            config2 = config3;
        }
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        if (config2 != null) {
            config2.getLastUpdateTimeStamp();
        }
        return config2;
    }

    public static Config a(String accountId) {
        Intrinsics.f(accountId, "accountId");
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        Config configA = a(accountId, "root");
        return configA == null ? D3.a(accountId, "root") : configA;
    }

    public static void a(Config config) {
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        Message messageObtainMessage = ((I2) O2.f23028b.getX()).obtainMessage();
        Intrinsics.e(messageObtainMessage, "obtainMessage(...)");
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = config;
        ((I2) O2.f23028b.getX()).sendMessage(messageObtainMessage);
    }
}
