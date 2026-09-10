package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashSet;
import kotlin.Metadata;
import l7.s;
import org.json.JSONArray;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J)\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/integrity/BannedParamManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "loadConfigs", "Lorg/json/JSONArray;", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "loadSet", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "Landroid/os/Bundle;", "parameters", "processFilterBannedParams", "(Landroid/os/Bundle;)V", "", "enabled", "Z", "bannedParamsConfig", "Ljava/util/HashSet;", "BANNED_PARAMS_KEY", "Ljava/lang/String;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BannedParamManager {
    private static final String BANNED_PARAMS_KEY = "_bannedParams";
    public static final BannedParamManager INSTANCE = new BannedParamManager();
    private static HashSet<String> bannedParamsConfig = new HashSet<>();
    private static boolean enabled;

    private BannedParamManager() {
    }

    public static final void disable() {
        if (v7.a.b(BannedParamManager.class)) {
            return;
        }
        try {
            enabled = false;
            bannedParamsConfig = new HashSet<>();
        } catch (Throwable th2) {
            v7.a.a(BannedParamManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            enabled = !bannedParamsConfig.isEmpty();
        } catch (Throwable th2) {
            v7.a.a(BannedParamManager.class, th2);
        }
    }

    private final void loadConfigs() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null) {
                return;
            }
            bannedParamsConfig = loadSet(rVarK.f48774s);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    private final HashSet<String> loadSet(JSONArray paramValues) {
        try {
            if (v7.a.b(this)) {
                return null;
            }
            try {
                HashSet<String> hashSetE = e0.e(paramValues);
                return hashSetE == null ? new HashSet<>() : hashSetE;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final void processFilterBannedParams(Bundle parameters) {
        if (v7.a.b(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : bannedParamsConfig) {
                    if (parameters.containsKey(str)) {
                        parameters.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    parameters.putString(BANNED_PARAMS_KEY, jSONArray.toString());
                }
            }
        } catch (Throwable th2) {
            v7.a.a(BannedParamManager.class, th2);
        }
    }
}
