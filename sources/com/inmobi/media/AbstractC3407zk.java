package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.AbstractC3407zk;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3407zk {
    public static C3238t1 a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C3238t1 c3238t1 = a;
            if (c3238t1 == null || (str = c3238t1.b) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            Kb.a((byte) 2, "zk", "Publisher device Id is " + str);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e.getMessage();
        }
    }

    public static void c() {
        boolean z;
        boolean zBooleanValue;
        C3238t1 c3238t1;
        try {
            Context context = Ji.a;
            if (context != null) {
                C3238t1 c3238t2 = new C3238t1();
                try {
                    polloi.saneness(AdvertisingIdClient.class).taiyuan();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c3238t2.b = advertisingIdInfo.getId();
                        c3238t2.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        a = c3238t2;
                        Boolean bool = Tg.b;
                        if (bool == null) {
                            Context context2 = Ji.a;
                            z = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Ea.b;
                                Ea eaA = Da.a(context2, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                                Tg.b = Boolean.valueOf(eaA.a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = Tg.b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z || (c3238t1 = a) == null) {
                                return;
                            }
                            c3238t1.b = null;
                            return;
                            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
                            e.getMessage();
                        }
                        zBooleanValue = bool.booleanValue();
                        z = zBooleanValue;
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Exception e) {
                        Intrinsics.checkNotNullExpressionValue("zk", "TAG");
                        e.getMessage();
                        return;
                    }
                } catch (NoClassDefFoundError unused) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue("zk", "TAG");
                e.getMessage();
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e2.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a(boolean z) {
        C3238t1 c3238t1 = a;
        if (c3238t1 == null) {
            return;
        }
        if (z) {
            c3238t1.b = null;
        } else if (c3238t1.b == null) {
            Runnable runnable = new Runnable() { // from class: adsuki.evenfall
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3407zk.d();
                }
            };
            Context context = Ji.a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Ji.g.submit(runnable);
        }
    }
}
