package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.r;
import q7.u;
import r9.b;
import wj.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J-\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/appevents/integrity/ProtectedModeManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "", "isEnabled", "()Z", "loadStandardParams", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "convertJSONArrayToHashSet", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "Landroid/os/Bundle;", "parameters", "processParametersForProtectedMode", "(Landroid/os/Bundle;)V", "protectedModeIsApplied", "(Landroid/os/Bundle;)Z", "enabled", "Z", "PROTECTED_MODE_IS_APPLIED_KEY", "Ljava/lang/String;", "PROTECTED_MODE_IS_APPLIED_VALUE", "PROTECTED_MODE_METADATA_KEY", "defaultStandardParameterNames$delegate", "Lwj/d;", "getDefaultStandardParameterNames", "()Ljava/util/HashSet;", "defaultStandardParameterNames", "standardParams", "Ljava/util/HashSet;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProtectedModeManager {
    private static final String PROTECTED_MODE_IS_APPLIED_KEY = "pm";
    private static final String PROTECTED_MODE_IS_APPLIED_VALUE = "1";
    private static final String PROTECTED_MODE_METADATA_KEY = "pm_metadata";
    private static boolean enabled;
    private static HashSet<String> standardParams;
    public static final ProtectedModeManager INSTANCE = new ProtectedModeManager();

    /* JADX INFO: renamed from: defaultStandardParameterNames$delegate, reason: from kotlin metadata */
    private static final d defaultStandardParameterNames = b.u(ProtectedModeManager$defaultStandardParameterNames$2.INSTANCE);

    private ProtectedModeManager() {
    }

    private final HashSet<String> convertJSONArrayToHashSet(JSONArray jsonArray) {
        if (!v7.a.b(this) && jsonArray != null) {
            try {
                if (jsonArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jsonArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jsonArray.getString(i10);
                        n.e(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        }
        return null;
    }

    public static final void disable() {
        if (v7.a.b(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th2) {
            v7.a.a(ProtectedModeManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadStandardParams();
        } catch (Throwable th2) {
            v7.a.a(ProtectedModeManager.class, th2);
        }
    }

    public static final boolean isEnabled() {
        if (v7.a.b(ProtectedModeManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th2) {
            v7.a.a(ProtectedModeManager.class, th2);
            return false;
        }
    }

    private final void loadStandardParams() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null) {
                return;
            }
            HashSet<String> hashSetConvertJSONArrayToHashSet = convertJSONArrayToHashSet(rVarK.f48768m);
            if (hashSetConvertJSONArrayToHashSet == null) {
                hashSetConvertJSONArrayToHashSet = getDefaultStandardParameterNames();
            }
            standardParams = hashSetConvertJSONArrayToHashSet;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final void processParametersForProtectedMode(Bundle parameters) {
        if (v7.a.b(ProtectedModeManager.class)) {
            return;
        }
        try {
            if (enabled && parameters != null && !parameters.isEmpty() && standardParams != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> setKeySet = parameters.keySet();
                n.e(setKeySet, "parameters.keySet()");
                for (String param : setKeySet) {
                    HashSet<String> hashSet = standardParams;
                    n.c(hashSet);
                    if (!hashSet.contains(param)) {
                        n.e(param, "param");
                        arrayList.add(param);
                    }
                }
                boolean z10 = false;
                for (String str : arrayList) {
                    if (parameters.containsKey(str)) {
                        parameters.remove(str);
                        z10 = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z10);
                parameters.putString(PROTECTED_MODE_METADATA_KEY, jSONObject.toString());
                parameters.putString(PROTECTED_MODE_IS_APPLIED_KEY, "1");
            }
        } catch (Throwable th2) {
            v7.a.a(ProtectedModeManager.class, th2);
        }
    }

    public final HashSet<String> getDefaultStandardParameterNames() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return (HashSet) defaultStandardParameterNames.getValue();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final boolean protectedModeIsApplied(Bundle parameters) {
        if (v7.a.b(this) || parameters == null) {
            return false;
        }
        try {
            return parameters.containsKey(PROTECTED_MODE_IS_APPLIED_KEY) && n.a(parameters.get(PROTECTED_MODE_IS_APPLIED_KEY), "1");
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
