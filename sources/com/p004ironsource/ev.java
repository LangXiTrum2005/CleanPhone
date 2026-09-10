package com.p004ironsource;

import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\n\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/ironsource/ev;", "", "Lcom/ironsource/ac;", "event", "", "errorCode", "", "errorReason", "", "a", "(Lcom/ironsource/ac;Ljava/lang/Integer;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "b", "c", "d", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ev f24944a = new ev();

    private ev() {
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = qv.f26644a.d();
        if (concurrentHashMapD.containsKey(a.f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(a.f));
        }
        return null;
    }

    public final void b() throws JSONException {
        a(this, ac.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() throws JSONException {
        a(this, ac.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, ac.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(int errorCode) throws JSONException {
        a(ac.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(errorCode), null);
    }

    private final void a(ac event, Integer errorCode, String errorReason) throws JSONException {
        qv qvVar = qv.f26644a;
        JSONObject jSONObjectA = qvVar.a(false);
        if (errorCode != null) {
            jSONObjectA.put("errorCode", errorCode.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(a.f, jSONArrayA);
            }
        }
        if (errorReason != null) {
            jSONObjectA.put("reason", errorReason);
        }
        qvVar.a(event, jSONObjectA);
    }

    public static /* synthetic */ void a(ev evVar, ac acVar, Integer num, String str, int i2, Object obj) throws JSONException {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        evVar.a(acVar, num, str);
    }

    public final void a(String errorReason) {
        Intrinsics.f(errorReason, "errorReason");
        a(ac.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }
}
