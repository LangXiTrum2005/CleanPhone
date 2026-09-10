package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Zc f23411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f23412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23413c;
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f23414e;
    public static long f;
    public static final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SignalsConfig.SessionConfig f23415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f23416i;
    public static final C6 j;
    public static final C3297x1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3297x1 f23417l;

    static {
        boolean z2 = false;
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("sessionCnt", Zc.class, "getSessionCnt()I");
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f23412b = new KProperty[]{reflectionFactory.i(propertyReference1Impl), reflectionFactory.i(new PropertyReference1Impl("userRetention", Zc.class, "getUserRetention()I"))};
        f23411a = new Zc();
        f23413c = "Zc";
        g = CollectionsKt.L(0, 0, 0, 0);
        LinkedHashMap linkedHashMap = O2.f23027a;
        C6 c6A = null;
        f23415h = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getSession();
        f23416i = new AtomicBoolean(false);
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            c6A = B6.a(contextD, "session_pref_file");
        }
        j = c6A;
        int i2 = 12;
        k = new C3297x1((Integer) (-1), (Function0) Xc.f23349a, z2, i2);
        f23417l = new C3297x1((Integer) (-1), (Function0) Yc.f23378a, z2, i2);
    }

    public static int a() {
        C6 c6 = j;
        if (c6 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return Integer.min((int) ((jCurrentTimeMillis - c6.f22735a.getLong("u-ret", jCurrentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f23416i.getAndSet(true)) {
            return;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        if (((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getIce().getSessionEnabled()) {
            d = androidx.media3.extractor.text.ttml.a.m("toString(...)");
            String TAG = f23413c;
            Intrinsics.e(TAG, "TAG");
        }
        f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        SignalsConfig.SessionConfig sessionConfig = f23415h;
        if (sessionConfig.getSigControlList().contains(5)) {
            C6 c6 = j;
            if (c6 != null) {
                C6.a(c6, "cnt", Integer.min(c6.f22735a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false, 4, (Object) null);
            }
            k.a();
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            C6 c7 = j;
            if (c7 != null && !c7.f22735a.contains("u-ret")) {
                C6.a(c7, "u-ret", System.currentTimeMillis(), false, 4, (Object) null);
            }
            f23417l.a();
        }
    }

    public final JSONObject b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SignalsConfig.SessionConfig sessionConfig = f23415h;
        if (sessionConfig.getSigControlList().contains(0)) {
            linkedHashMap.put(com.smartdigimkt.q0.b.b1, Long.valueOf(f));
        }
        if (sessionConfig.getSigControlList().contains(5)) {
            C3297x1 c3297x1 = k;
            KProperty[] kPropertyArr = f23412b;
            if (((Number) c3297x1.getValue(this, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) c3297x1.getValue(this, kPropertyArr[0])).intValue()));
            }
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            C3297x1 c3297x2 = f23417l;
            KProperty[] kPropertyArr2 = f23412b;
            if (((Number) c3297x2.getValue(this, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) c3297x2.getValue(this, kPropertyArr2[1])).intValue()));
            }
        }
        ArrayList arrayListJ0 = CollectionsKt.j0(g);
        if (!sessionConfig.getSigControlList().contains(1)) {
            arrayListJ0.set(0, -1);
        }
        if (!sessionConfig.getSigControlList().contains(2)) {
            arrayListJ0.set(1, -1);
        }
        if (!sessionConfig.getSigControlList().contains(3)) {
            arrayListJ0.set(2, -1);
        }
        if (!sessionConfig.getSigControlList().contains(4)) {
            arrayListJ0.set(3, -1);
        }
        if (!arrayListJ0.isEmpty()) {
            Iterator it = arrayListJ0.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap.put("dep", arrayListJ0);
                    break;
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static void a(String adtype, Boolean bool) {
        Intrinsics.f(adtype, "adtype");
        if (adtype.equals("banner") && f23415h.getSigControlList().contains(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (adtype.equals("int") && !Intrinsics.a(bool, Boolean.TRUE) && f23415h.getSigControlList().contains(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (adtype.equals("native") && f23415h.getSigControlList().contains(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.a(bool, Boolean.TRUE) && f23415h.getSigControlList().contains(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
