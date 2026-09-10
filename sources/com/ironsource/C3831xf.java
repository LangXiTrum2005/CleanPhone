package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3831xf {
    public static final C3831xf a = new C3831xf();

    private C3831xf() {
    }

    public final void a(int i) {
        a(EnumC3821x5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, EnumC3821x5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC3821x5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() throws JSONException {
        a(this, EnumC3821x5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) throws JSONException {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(EnumC3821x5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    public static /* synthetic */ void a(C3831xf c3831xf, EnumC3821x5 enumC3821x5, Integer num, String str, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c3831xf.a(enumC3821x5, num, str);
    }

    private final void a(EnumC3821x5 enumC3821x5, Integer num, String str) throws JSONException {
        Gf gf = Gf.a;
        JSONObject jSONObjectA = gf.a(false);
        if (num != null) {
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        gf.a(enumC3821x5, jSONObjectA);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = Gf.a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
