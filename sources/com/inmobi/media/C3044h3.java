package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3044h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3044h3 f23645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LinkedList f23646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinkedList f23647c;
    public static SignalsConfig d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AdConfig f23648e;
    public static byte[] f;
    public static String g;

    static {
        List<String> skipFields;
        AdConfig.ContextualDataConfig contextualData;
        C3044h3 c3044h3 = new C3044h3();
        f23645a = c3044h3;
        LinkedList linkedList = new LinkedList();
        f23646b = linkedList;
        Object objClone = linkedList.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f23647c = (LinkedList) objClone;
        C3028g3 c3028g3 = new C3028g3();
        C3012f3 c3012f3 = new C3012f3();
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("signals", Uc.b(), c3028g3);
        d = configA instanceof SignalsConfig ? (SignalsConfig) configA : null;
        Config configA2 = M2.a("ads", Uc.b(), c3012f3);
        f23648e = configA2 instanceof AdConfig ? (AdConfig) configA2 : null;
        SignalsConfig signalsConfig = d;
        f = AbstractC3077j4.a(signalsConfig != null ? signalsConfig.getKA() : null);
        AdConfig adConfig = f23648e;
        if (adConfig == null || (contextualData = adConfig.getContextualData()) == null || (skipFields = contextualData.getSkipFields()) == null) {
            skipFields = EmptyList.X;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C3060i3.j);
        arrayList.removeAll(skipFields);
        g = CollectionsKt.D(arrayList, ",", null, null, null, 62);
        c3044h3.b();
    }

    public static final void a() {
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f23648e;
        int maxAdRecords = 0;
        long expiryTime = jCurrentTimeMillis - (((long) ((adConfig == null || (contextualData3 = adConfig.getContextualData()) == null) ? 0 : contextualData3.getExpiryTime())) * 1000);
        AdConfig adConfig2 = f23648e;
        a(expiryTime, (adConfig2 == null || (contextualData2 = adConfig2.getContextualData()) == null) ? 0 : contextualData2.getMaxAdRecords());
        Object objClone = f23646b.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f23647c = (LinkedList) objClone;
        AdConfig adConfig3 = f23648e;
        if (adConfig3 != null && (contextualData = adConfig3.getContextualData()) != null) {
            maxAdRecords = contextualData.getMaxAdRecords();
        }
        C2979d3 c2979d3 = (C2979d3) Nc.d.getX();
        c2979d3.getClass();
        c2979d3.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + maxAdRecords + ") foo);", null);
    }

    public static String c() {
        AdConfig.ContextualDataConfig contextualData;
        if (g.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f23648e;
        long expiryTime = jCurrentTimeMillis - (((long) ((adConfig == null || (contextualData = adConfig.getContextualData()) == null) ? 0 : contextualData.getExpiryTime())) * 1000);
        LinkedList linkedList = f23647c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C3061i4) obj).f23689b >= expiryTime) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(StringsKt.a0(((C3061i4) it.next()).f23688a).toString());
        }
        String string = jSONArray.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static boolean d() {
        boolean z2;
        AdConfig.ContextualDataConfig contextualData;
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            z2 = B6.a(contextD, "c_data_store").f22735a.getBoolean("isEnabled", true);
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        AdConfig adConfig = f23648e;
        return ((adConfig == null || (contextualData = adConfig.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
    }

    public final void b() {
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6 c6A = B6.a(contextD, "c_data_store");
            Context contextD2 = Uc.d();
            int vak = contextD2 != null ? B6.a(contextD2, "c_data_store").f22735a.getInt("akv", 1) : 1;
            SignalsConfig signalsConfig = d;
            if (signalsConfig == null || signalsConfig.getVAK() != vak) {
                SignalsConfig signalsConfig2 = d;
                if (signalsConfig2 != null) {
                    vak = signalsConfig2.getVAK();
                }
                C6.a(c6A, "akv", vak, false, 4, (Object) null);
                e();
            }
        }
    }

    public final void e() {
        synchronized (this) {
            C2979d3 c2979d3 = (C2979d3) Nc.d.getX();
            c2979d3.getClass();
            try {
                A3.a(c2979d3.f23193a, null, null);
            } catch (Exception unused) {
            }
            LinkedList linkedList = new LinkedList();
            f23646b = linkedList;
            Object objClone = linkedList.clone();
            Intrinsics.d(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f23647c = (LinkedList) objClone;
        }
    }

    public static void a(long j, int i2) {
        for (int size = f23646b.size(); size > i2; size--) {
            f23646b.remove();
        }
        Iterator it = f23646b.iterator();
        Intrinsics.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.e(next, "next(...)");
            if (((C3061i4) next).f23689b >= j) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
