package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.Qi;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kurbash.formularize;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: loaded from: classes3.dex */
public final class Qi {
    public static String d;
    public static boolean e;
    public static long f;
    public static final Ea i;
    public static final I1 j;
    public static final I1 k;
    public static final /* synthetic */ formularize[] b = {polloi.cutely(new PropertyReference1Impl(Qi.class, "sessionCnt", "getSessionCnt()I", 0)), polloi.cutely(new PropertyReference1Impl(Qi.class, "userRetention", "getUserRetention()I", 0))};
    public static final Qi a = new Qi();
    public static final String c = Qi.class.getSimpleName();
    public static final List g = adultoid.polloi(0, 0, 0, 0);
    public static final AtomicBoolean h = new AtomicBoolean(false);

    static {
        Ea eaA;
        int i2 = -1;
        Context context = Ji.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.b;
            eaA = Da.a(context, "session_pref_file");
        } else {
            eaA = null;
        }
        i = eaA;
        int i3 = 12;
        j = new I1(i2, new Function0() { // from class: adsuki.alloy
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Qi.a());
            }
        }, i3);
        k = new I1(i2, new Function0() { // from class: adsuki.palewise
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Qi.b());
            }
        }, i3);
    }

    public static boolean a(int i2) {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getSession().getSigControlList().contains(Integer.valueOf(i2));
    }

    public static final int b() {
        a.getClass();
        Ea ea = i;
        if (ea == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", com.ironsource.X3.i.W);
        return Integer.min((int) ((jCurrentTimeMillis - ea.a.getLong("u-ret", jCurrentTimeMillis)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS), Integer.MAX_VALUE);
    }

    public static void c() {
        if (h.getAndSet(true)) {
            return;
        }
        if (Yi.a().getSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            d = string;
            String TAG = c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
        f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Ea ea = i;
            if (ea != null) {
                Intrinsics.checkNotNullParameter("cnt", com.ironsource.X3.i.W);
                ea.a("cnt", Integer.min(ea.a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            j.a();
        }
        if (a(6)) {
            Ea ea2 = i;
            if (ea2 != null) {
                Intrinsics.checkNotNullParameter("u-ret", com.ironsource.X3.i.W);
                if (!ea2.a.contains("u-ret")) {
                    ea2.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            k.a();
        }
    }

    public static final int a() {
        a.getClass();
        Ea ea = i;
        if (ea == null) {
            return 0;
        }
        Intrinsics.checkNotNullParameter("cnt", com.ironsource.X3.i.W);
        return ea.a.getInt("cnt", 0);
    }

    public static void a(String adtype, Boolean bool) {
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (Intrinsics.wireman(adtype, "banner") && a(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.wireman(adtype, "int") && !Intrinsics.wireman(bool, Boolean.TRUE) && a(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.wireman(adtype, "native") && a(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.wireman(bool, Boolean.TRUE) && a(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
