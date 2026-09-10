package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class I2 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f22878c;
    public ThreadPoolExecutor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(Looper looper) {
        super(looper);
        Intrinsics.f(looper, "looper");
        this.f22876a = new ArrayList();
        this.f22877b = new LinkedHashMap();
        this.f22878c = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x028e  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z2;
        Map map;
        boolean z3;
        U2 u2;
        boolean zBooleanValue;
        ThreadPoolExecutor threadPoolExecutor;
        Intrinsics.f(message, "message");
        if (O2.d.get()) {
            int i2 = message.what;
            Unit unit = Unit.f43263a;
            boolean zBooleanValue2 = false;
            ThreadPoolExecutor threadPoolExecutor2 = null;
            switch (i2) {
                case 0:
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    Object obj = message.obj;
                    Intrinsics.d(obj, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigFetchInputs");
                    S2 s2 = (S2) obj;
                    Config config = s2.f23150a;
                    N2 n2 = s2.f23151b;
                    if (n2 != null) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        n2.toString();
                        ArrayList arrayList = (ArrayList) O2.f23027a.get(config);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new WeakReference(n2));
                        O2.f23027a.put(config, arrayList);
                    }
                    if (O2.f23029c.get()) {
                        String accountId$media_release = config.getAccountId$media_release();
                        if (accountId$media_release != null) {
                            String type = config.getType();
                            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                            Config configA = D3.a(accountId$media_release, type);
                            if (((Q2) O2.f.getX()).b("root", accountId$media_release)) {
                                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                M2.a(D3.a(accountId$media_release, "root"));
                            } else {
                                Config configA2 = M2.a(accountId$media_release);
                                Intrinsics.d(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                                RootConfig rootConfig = (RootConfig) configA2;
                                long lastUpdateTimeStamp = rootConfig.getLastUpdateTimeStamp();
                                long expiryForType = rootConfig.getExpiryForType(rootConfig.getType());
                                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                long jCurrentTimeMillis = System.currentTimeMillis() - lastUpdateTimeStamp;
                                long j = 1000;
                                boolean z4 = jCurrentTimeMillis > expiryForType * j;
                                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                if (z4) {
                                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                    M2.a(D3.a(accountId$media_release, "root"));
                                }
                                if (!"root".equals(type)) {
                                    if (((Q2) O2.f.getX()).b(type, accountId$media_release)) {
                                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                        M2.a(configA);
                                    } else {
                                        Config configA3 = M2.a(accountId$media_release, type);
                                        long lastUpdateTimeStamp2 = configA3 != null ? configA3.getLastUpdateTimeStamp() : 0L;
                                        long expiryForType2 = rootConfig.getExpiryForType(type);
                                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                        zBooleanValue2 = System.currentTimeMillis() - lastUpdateTimeStamp2 > expiryForType2 * j;
                                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                        if (zBooleanValue2) {
                                            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                            M2.a(configA);
                                        }
                                    }
                                }
                            }
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                            config.getType();
                        }
                    } else {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        config.getType();
                    }
                    break;
                case 1:
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    Object obj2 = message.obj;
                    Intrinsics.d(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.Config");
                    Config config2 = (Config) obj2;
                    String accountId$media_release2 = config2.getAccountId$media_release();
                    if (accountId$media_release2 != null) {
                        String type2 = config2.getType();
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        Config configA4 = M2.a(accountId$media_release2);
                        Intrinsics.d(configA4, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        Map map2 = (Map) this.f22877b.get(new J2(((RootConfig) configA4).getUrlForType(type2), accountId$media_release2));
                        if (map2 != null && map2.containsKey(type2)) {
                            zBooleanValue2 = true;
                        }
                        Map map3 = this.f22878c;
                        boolean z5 = (map3 == null || !map3.containsKey(type2)) ? zBooleanValue2 : true;
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        config2.getType();
                        if (z5) {
                            Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                            config2.getType();
                        } else {
                            this.f22876a.add(config2);
                            if (!hasMessages(2)) {
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 2;
                                messageObtain.obj = accountId$media_release2;
                                sendMessage(messageObtain);
                            }
                        }
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        config2.getType();
                    }
                    break;
                case 2:
                    Object obj3 = message.obj;
                    Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
                    Config configA5 = M2.a((String) obj3);
                    Intrinsics.d(configA5, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    sendEmptyMessageDelayed(3, ((RootConfig) configA5).getWaitTime() * 1000);
                    break;
                case 3:
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    for (Config config3 : this.f22876a) {
                        String accountId$media_release3 = config3.getAccountId$media_release();
                        if (accountId$media_release3 != null) {
                            LinkedHashMap linkedHashMap = O2.f23027a;
                            Config configA6 = M2.a(accountId$media_release3);
                            Intrinsics.d(configA6, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                            J2 j2 = new J2(((RootConfig) configA6).getUrlForType(config3.getType()), accountId$media_release3);
                            Map map4 = (Map) this.f22877b.get(j2);
                            if (map4 == null) {
                                map4 = new HashMap();
                                this.f22877b.put(j2, map4);
                            }
                            map4.put(config3.getType(), config3);
                        }
                    }
                    this.f22876a.clear();
                    ThreadPoolExecutor threadPoolExecutor3 = this.d;
                    if (threadPoolExecutor3 == null || !threadPoolExecutor3.isShutdown()) {
                        threadPoolExecutor2 = this.d;
                    } else {
                        this.d = null;
                    }
                    if (threadPoolExecutor2 == null) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        int i3 = AbstractC3332z4.f24143a;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                        String strF = O2.f();
                        Intrinsics.e(strF, "access$getTAG$cp(...)");
                        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5L, timeUnit, linkedBlockingDeque, new K5(strF));
                        threadPoolExecutor4.allowCoreThreadTimeOut(true);
                        this.d = threadPoolExecutor4;
                        sendEmptyMessage(4);
                    }
                    break;
                case 4:
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    if (this.f22877b.isEmpty()) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        sendEmptyMessage(5);
                    } else {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        Map.Entry entry = (Map.Entry) this.f22877b.entrySet().iterator().next();
                        this.f22878c = (Map) entry.getValue();
                        this.f22877b.remove(entry.getKey());
                        J2 j3 = (J2) entry.getKey();
                        Map map5 = this.f22878c;
                        Intrinsics.c(map5);
                        String str = ((J2) entry.getKey()).f22896b;
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        Objects.toString(j3);
                        Config configA7 = M2.a(str);
                        Intrinsics.d(configA7, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        RootConfig rootConfig2 = (RootConfig) configA7;
                        int retryInterval = rootConfig2.getRetryInterval();
                        int maxRetries = rootConfig2.getMaxRetries();
                        C3262ue c3262ue = new C3262ue(rootConfig2.getIncludeIds());
                        if (rootConfig2.getIpAddrTPSupport().isEmpty()) {
                            z2 = false;
                        } else {
                            Boolean bool = AbstractC2936ab.f23444b;
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                Context contextD = Uc.d();
                                if (contextD != null) {
                                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                                    AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
                                }
                                Boolean bool2 = AbstractC2936ab.f23444b;
                                zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                            }
                            if (zBooleanValue) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                        boolean zA = G4.a(G4.f22837a, false, 1, null);
                        if (zA || !map5.containsKey("root")) {
                            map = map5;
                            z3 = zA;
                        } else {
                            HashMap map6 = new HashMap(1);
                            Object obj4 = map5.get("root");
                            Intrinsics.c(obj4);
                            map6.put("root", obj4);
                            map = map6;
                            z3 = true;
                        }
                        U2 u3 = new U2(map, c3262ue, j3.f22895a, maxRetries, retryInterval, z3, str, z2);
                        if (map5.containsKey("root")) {
                            String fallbackUrlForRootType = rootConfig2.getFallbackUrlForRootType();
                            HashMap map7 = new HashMap(1);
                            Object obj5 = map5.get("root");
                            Intrinsics.c(obj5);
                            map7.put("root", obj5);
                            u2 = new U2(map7, c3262ue, fallbackUrlForRootType, maxRetries, retryInterval, z3, str, z2);
                        } else {
                            u2 = null;
                        }
                        T2 t2 = new T2(this, u3, u2);
                        try {
                            ThreadPoolExecutor threadPoolExecutor5 = this.d;
                            if (threadPoolExecutor5 == null || !threadPoolExecutor5.isShutdown()) {
                                threadPoolExecutor2 = this.d;
                            } else {
                                this.d = null;
                            }
                            if (threadPoolExecutor2 != null) {
                                threadPoolExecutor2.execute(t2);
                            }
                        } catch (OutOfMemoryError unused) {
                            O2.f();
                            if (this.f22877b.isEmpty()) {
                                Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                                sendEmptyMessage(5);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 5:
                    ThreadPoolExecutor threadPoolExecutor6 = this.d;
                    if (threadPoolExecutor6 == null || !threadPoolExecutor6.isShutdown()) {
                        threadPoolExecutor = this.d;
                    } else {
                        this.d = null;
                        threadPoolExecutor = null;
                    }
                    if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                        this.f22878c = null;
                        this.f22877b.clear();
                        removeMessages(3);
                        threadPoolExecutor.shutdownNow();
                        break;
                    }
                    break;
                case 6:
                    Object obj6 = message.obj;
                    Intrinsics.d(obj6, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigNetworkResponse.ConfigResponse");
                    W2 w2 = (W2) obj6;
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    if (w2.f23315c != null) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        w2.f23313a.getType();
                    } else if (w2.f23314b == 304) {
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        w2.f23313a.getType();
                        Config config4 = w2.f23313a;
                        if (config4.getAccountId$media_release() != null) {
                            Q2 q2 = (Q2) O2.f.getX();
                            String type3 = config4.getType();
                            String accountId$media_release4 = config4.getAccountId$media_release();
                            Intrinsics.c(accountId$media_release4);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            q2.getClass();
                            Intrinsics.f(type3, "type");
                            Config config5 = (Config) q2.b("account_id=? AND config_type=?", new String[]{accountId$media_release4, type3});
                            if (config5 != null) {
                                config5.setLastUpdateTimeStamp(jCurrentTimeMillis2);
                                q2.a(config5, "account_id=? AND config_type=?", new String[]{accountId$media_release4, type3});
                            }
                        }
                    } else {
                        if (Intrinsics.a(w2.f23313a.getType(), "root")) {
                            Config config6 = w2.f23313a;
                            Intrinsics.d(config6, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                            if (((RootConfig) config6).getIpAddrTPSupport().isEmpty()) {
                                I5.a();
                            }
                        }
                        Q2 q3 = (Q2) O2.f.getX();
                        Config config7 = w2.f23313a;
                        q3.getClass();
                        Intrinsics.f(config7, "config");
                        try {
                            if (config7.getAccountId$media_release() != null) {
                                config7.getType();
                                config7.getAccountId$media_release();
                                q3.a(config7, "account_id=? AND config_type=?", new String[]{config7.getAccountId$media_release(), config7.getType()});
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        w2.f23313a.getType();
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        Objects.toString(w2.f23313a.toJson());
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        w2.f23313a.getAccountId$media_release();
                        Config config8 = w2.f23313a;
                        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                        config8.getType();
                        config8.getAccountId$media_release();
                        ConcurrentHashMap concurrentHashMap2 = O2.f23030e;
                        HashMap map8 = D3.f22758a;
                        concurrentHashMap2.put(D3.b(config8.getAccountId$media_release(), config8.getType()), config8);
                        M2.b(w2.f23313a);
                    }
                    break;
                case 7:
                    Object obj7 = message.obj;
                    Intrinsics.d(obj7, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigNetworkResponse.IPAddress");
                    Z2 z6 = (Z2) obj7;
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    Objects.toString(z6);
                    if (z6 instanceof Y2) {
                        Boolean bool3 = AbstractC2936ab.f23444b;
                        if (bool3 != null) {
                            zBooleanValue2 = bool3.booleanValue();
                        } else {
                            Context contextD2 = Uc.d();
                            if (contextD2 != null) {
                                ConcurrentHashMap concurrentHashMap3 = C6.f22734b;
                                AbstractC2936ab.f23444b = Boolean.valueOf(B6.a(contextD2, "user_info_store").f22735a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool4 = AbstractC2936ab.f23444b;
                            if (bool4 != null) {
                                zBooleanValue2 = bool4.booleanValue();
                            }
                        }
                        if (zBooleanValue2) {
                            I5.a();
                        } else {
                            Lazy lazy = I5.f22882a;
                            String ipAddress = ((Y2) z6).f23362a;
                            Intrinsics.f(ipAddress, "ipAddress");
                            I5.f22883b = ipAddress;
                            C6 c6 = (C6) I5.f22882a.getX();
                            if (c6 != null) {
                                C6.a(c6, "cip", ipAddress, false, 4, (Object) null);
                            }
                            Intrinsics.c(I5.f22884c);
                        }
                    } else if (z6 instanceof X2) {
                        I5.a();
                    }
                    break;
                default:
                    Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
                    break;
            }
        }
    }
}
