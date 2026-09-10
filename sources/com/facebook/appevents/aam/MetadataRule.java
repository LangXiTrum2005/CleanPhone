package com.facebook.appevents.aam;

import an.h;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule;", "", "name", "", "keyRules", "", "valRule", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getKeyRules", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getValRule", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MetadataRule {
    private static final String FIELD_K = "k";
    private static final String FIELD_K_DELIMITER = ",";
    private static final String FIELD_V = "v";
    private final List<String> keyRules;
    private final String name;
    private final String valRule;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<MetadataRule> rules = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lwj/r;", "constructRules", "(Lorg/json/JSONObject;)V", "", "Lcom/facebook/appevents/aam/MetadataRule;", "getRules", "()Ljava/util/Set;", "", "rulesFromServer", "updateRules", "(Ljava/lang/String;)V", "getEnabledRuleNames", "FIELD_K", "Ljava/lang/String;", "FIELD_K_DELIMITER", "FIELD_V", "", "rules", "Ljava/util/Set;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void constructRules(JSONObject jsonObject) {
            Iterator<String> itKeys = jsonObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k8 = jSONObjectOptJSONObject.optString("k");
                    String v4 = jSONObjectOptJSONObject.optString(MetadataRule.FIELD_V);
                    n.e(k8, "k");
                    if (k8.length() != 0) {
                        Set setAccess$getRules$cp = MetadataRule.access$getRules$cp();
                        n.e(key, "key");
                        List listI0 = h.I0(k8, new String[]{MetadataRule.FIELD_K_DELIMITER}, 0, 6);
                        n.e(v4, "v");
                        setAccess$getRules$cp.add(new MetadataRule(key, listI0, v4, null));
                    }
                }
            }
        }

        public final Set<String> getEnabledRuleNames() {
            HashSet hashSet = new HashSet();
            Iterator it = MetadataRule.access$getRules$cp().iterator();
            while (it.hasNext()) {
                hashSet.add(((MetadataRule) it.next()).getName());
            }
            return hashSet;
        }

        public final Set<MetadataRule> getRules() {
            return new HashSet(MetadataRule.access$getRules$cp());
        }

        public final void updateRules(String rulesFromServer) {
            n.f(rulesFromServer, "rulesFromServer");
            try {
                MetadataRule.access$getRules$cp().clear();
                constructRules(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetadataRule(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set access$getRules$cp() {
        if (a.b(MetadataRule.class)) {
            return null;
        }
        try {
            return rules;
        } catch (Throwable th2) {
            a.a(MetadataRule.class, th2);
            return null;
        }
    }

    public static final Set<String> getEnabledRuleNames() {
        if (a.b(MetadataRule.class)) {
            return null;
        }
        try {
            return INSTANCE.getEnabledRuleNames();
        } catch (Throwable th2) {
            a.a(MetadataRule.class, th2);
            return null;
        }
    }

    public static final Set<MetadataRule> getRules() {
        if (a.b(MetadataRule.class)) {
            return null;
        }
        try {
            return INSTANCE.getRules();
        } catch (Throwable th2) {
            a.a(MetadataRule.class, th2);
            return null;
        }
    }

    public static final void updateRules(String str) {
        if (a.b(MetadataRule.class)) {
            return;
        }
        try {
            INSTANCE.updateRules(str);
        } catch (Throwable th2) {
            a.a(MetadataRule.class, th2);
        }
    }

    public final List<String> getKeyRules() {
        if (a.b(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final String getName() {
        if (a.b(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public final String getValRule() {
        if (a.b(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    private MetadataRule(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }
}
