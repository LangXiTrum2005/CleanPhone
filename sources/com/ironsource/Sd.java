package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0624vb f27190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C0594u.d> f27191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, C0594u.d> f27192c;

    public Sd(C0624vb tools, Map<String, C0594u.d> map, Map<String, C0594u.d> map2) {
        kotlin.jvm.internal.n.f(tools, "tools");
        this.f27190a = tools;
        this.f27191b = map;
        this.f27192c = map2;
    }

    private final void b(O7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (!(objA instanceof wj.g)) {
            kotlin.jvm.internal.n.c(str2);
            kotlin.jvm.internal.n.c(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thA = wj.h.a(objA);
        if (thA != null) {
            this.f27190a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thA.getMessage());
        }
    }

    public final void a(O7.a rewardService) {
        kotlin.jvm.internal.n.f(rewardService, "rewardService");
        Map<String, C0594u.d> map = this.f27192c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C0594u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Qd qdF = entry.getValue().f();
                if (qdF != null) {
                    b(rewardService, key, qdF.b(), qdF.a());
                }
            }
        }
        Map<String, C0594u.d> map2 = this.f27191b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C0594u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Qd qdA = entry2.getValue().a();
            if (qdA != null) {
                a(rewardService, key2, qdA.b(), qdA.a());
            }
        }
    }

    private final void a(O7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (!(objA instanceof wj.g)) {
            kotlin.jvm.internal.n.c(str2);
            kotlin.jvm.internal.n.c(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thA = wj.h.a(objA);
        if (thA != null) {
            this.f27190a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thA.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            return wj.r.f53297a;
        }
        return t9.e.c(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
    }
}
