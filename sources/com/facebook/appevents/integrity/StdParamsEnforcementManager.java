package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR2\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R2\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lcom/facebook/appevents/integrity/StdParamsEnforcementManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "loadConfigs", "Lorg/json/JSONArray;", "schema", "configureSchemaRestrictions", "(Lorg/json/JSONArray;)V", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "loadSet", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "Landroid/os/Bundle;", "parameters", "processFilterParamSchemaBlocking", "(Landroid/os/Bundle;)V", X3.i.X, "", "expressions", "", "isAnyRegexMatched", "(Ljava/lang/String;Ljava/util/Set;)Z", "enumValues", "isAnyEnumMatched", "enabled", "Z", "", "regexRestrictionsConfig", "Ljava/util/Map;", "enumRestrictionsConfig", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class StdParamsEnforcementManager {
    private static boolean enabled;
    public static final StdParamsEnforcementManager INSTANCE = new StdParamsEnforcementManager();
    private static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();
    private static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();

    private StdParamsEnforcementManager() {
    }

    private final void configureSchemaRestrictions(JSONArray schema) {
        if (v7.a.b(this) || schema == null) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            int length = schema.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = schema.getJSONObject(i10);
                String key = jSONObject.getString(X3.i.W);
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray(X3.i.X);
                        int length2 = jSONArray.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            boolean z10 = jSONArray.getJSONObject(i11).getBoolean("require_exact_match");
                            HashSet<String> hashSetLoadSet = loadSet(jSONArray.getJSONObject(i11).getJSONArray("potential_matches"));
                            if (z10) {
                                Map<String, HashSet<String>> map = enumRestrictionsConfig;
                                n.e(key, "key");
                                HashSet<String> hashSet = enumRestrictionsConfig.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetLoadSet);
                                    hashSetLoadSet = hashSet;
                                }
                                map.put(key, hashSetLoadSet);
                            } else {
                                Map<String, HashSet<String>> map2 = regexRestrictionsConfig;
                                n.e(key, "key");
                                HashSet<String> hashSet2 = regexRestrictionsConfig.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetLoadSet);
                                    hashSetLoadSet = hashSet2;
                                }
                                map2.put(key, hashSetLoadSet);
                            }
                        }
                    } catch (Exception unused) {
                        enumRestrictionsConfig.remove(key);
                        regexRestrictionsConfig.remove(key);
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final void disable() {
        if (v7.a.b(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            enabled = false;
            regexRestrictionsConfig = new HashMap();
            enumRestrictionsConfig = new HashMap();
        } catch (Throwable th2) {
            v7.a.a(StdParamsEnforcementManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            enabled = (regexRestrictionsConfig.isEmpty() && enumRestrictionsConfig.isEmpty()) ? false : true;
        } catch (Throwable th2) {
            v7.a.a(StdParamsEnforcementManager.class, th2);
        }
    }

    private final boolean isAnyEnumMatched(String value, Set<String> enumValues) {
        if (!v7.a.b(this) && enumValues != null) {
            try {
                if (enumValues.isEmpty()) {
                    return false;
                }
                for (String str : enumValues) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    n.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = value.toLowerCase(locale);
                    n.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (lowerCase.equals(lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        }
        return false;
    }

    private final boolean isAnyRegexMatched(String value, Set<String> expressions) {
        if (!v7.a.b(this) && expressions != null) {
            try {
                if (expressions.isEmpty()) {
                    return false;
                }
                for (String pattern : expressions) {
                    n.f(pattern, "pattern");
                    Pattern patternCompile = Pattern.compile(pattern);
                    n.e(patternCompile, "compile(...)");
                    n.f(value, "input");
                    if (patternCompile.matcher(value).matches()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        }
        return false;
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
            configureSchemaRestrictions(rVarK.f48773r);
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

    public static final void processFilterParamSchemaBlocking(Bundle parameters) {
        if (v7.a.b(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : parameters.keySet()) {
                    String strValueOf = String.valueOf(parameters.get(key));
                    boolean z10 = regexRestrictionsConfig.get(key) != null;
                    boolean z11 = enumRestrictionsConfig.get(key) != null;
                    if (z10 || z11) {
                        StdParamsEnforcementManager stdParamsEnforcementManager = INSTANCE;
                        boolean zIsAnyRegexMatched = stdParamsEnforcementManager.isAnyRegexMatched(strValueOf, regexRestrictionsConfig.get(key));
                        boolean zIsAnyEnumMatched = stdParamsEnforcementManager.isAnyEnumMatched(strValueOf, enumRestrictionsConfig.get(key));
                        if (!zIsAnyRegexMatched && !zIsAnyEnumMatched) {
                            n.e(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            v7.a.a(StdParamsEnforcementManager.class, th2);
        }
    }
}
