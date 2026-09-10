package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Nf f26664a = new Nf();

    private Nf() {
    }

    public final void a(int i10) {
        a(EnumC0672y5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i10), null);
    }

    public final void b() {
        a(this, EnumC0672y5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, EnumC0672y5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, EnumC0672y5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) {
        kotlin.jvm.internal.n.f(errorReason, "errorReason");
        a(EnumC0672y5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    public static /* synthetic */ void a(Nf nf2, EnumC0672y5 enumC0672y5, Integer num, String str, int i10, Object obj) throws JSONException {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        nf2.a(enumC0672y5, num, str);
    }

    private final void a(EnumC0672y5 enumC0672y5, Integer num, String str) throws JSONException {
        Wf wf2 = Wf.f27610a;
        JSONObject jSONObjectA = wf2.a(false);
        if (num != null) {
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f29609f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        wf2.a(enumC0672y5, jSONObjectA);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = Wf.f27610a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f29609f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f29609f));
        }
        return null;
    }
}
