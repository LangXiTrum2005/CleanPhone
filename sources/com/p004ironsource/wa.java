package com.p004ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, va> f27565a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, va> f27566b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, va> f27567c = new LinkedHashMap();

    private Map<String, va> b(mh.e eVar) {
        if (eVar.name().equalsIgnoreCase(mh.e.RewardedVideo.name())) {
            return this.f27565a;
        }
        if (eVar.name().equalsIgnoreCase(mh.e.Interstitial.name())) {
            return this.f27566b;
        }
        if (eVar.name().equalsIgnoreCase(mh.e.Banner.name())) {
            return this.f27567c;
        }
        return null;
    }

    public va a(mh.e eVar, zj zjVar) {
        va vaVar = new va(zjVar);
        a(eVar, zjVar.e(), vaVar);
        return vaVar;
    }

    public va a(mh.e eVar, String str) {
        Map<String, va> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    public void b(mh.e eVar, String str) {
        Map<String, va> mapB;
        va vaVarRemove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (vaVarRemove = mapB.remove(str)) == null) {
            return;
        }
        vaVarRemove.a();
    }

    public va a(mh.e eVar, String str, Map<String, String> map, kp kpVar) {
        va vaVar = new va(str, str, map, kpVar);
        a(eVar, str, vaVar);
        return vaVar;
    }

    public Collection<va> a(mh.e eVar) {
        Map<String, va> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    private void a(mh.e eVar, String str, va vaVar) {
        Map<String, va> mapB;
        if (TextUtils.isEmpty(str) || vaVar == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, vaVar);
    }
}
