package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T4> f27304a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, T4> f27305b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, T4> f27306c = new LinkedHashMap();

    private Map<String, T4> b(C0514p8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C0514p8.e.RewardedVideo.name())) {
            return this.f27304a;
        }
        if (eVar.name().equalsIgnoreCase(C0514p8.e.Interstitial.name())) {
            return this.f27305b;
        }
        if (eVar.name().equalsIgnoreCase(C0514p8.e.Banner.name())) {
            return this.f27306c;
        }
        return null;
    }

    public Collection<T4> a(C0514p8.e eVar) {
        Map<String, T4> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public T4 a(C0514p8.e eVar, String str) {
        Map<String, T4> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    private void a(C0514p8.e eVar, String str, T4 t10) {
        Map<String, T4> mapB;
        if (TextUtils.isEmpty(str) || t10 == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, t10);
    }

    public void b(C0514p8.e eVar, String str) {
        Map<String, T4> mapB;
        T4 t4Remove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (t4Remove = mapB.remove(str)) == null) {
            return;
        }
        t4Remove.a();
    }

    public T4 a(C0514p8.e eVar, K9 k10) {
        T4 t10 = new T4(k10);
        a(eVar, k10.e(), t10);
        return t10;
    }

    public T4 a(C0514p8.e eVar, String str, Map<String, String> map, Hc hc2) {
        T4 t10 = new T4(str, str, map, hc2);
        a(eVar, str, t10);
        return t10;
    }
}
