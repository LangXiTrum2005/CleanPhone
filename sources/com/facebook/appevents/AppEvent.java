package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;
import l7.g0;
import org.json.JSONException;
import org.json.JSONObject;
import q7.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.BQ\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B'\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0015J\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u0018J;\u0010\"\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\u0003H\u0016J(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030)2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\nH\u0002J\b\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006/"}, d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "contextName", "", X3.i.f27798j0, "valueToSum", "", "parameters", "Landroid/os/Bundle;", "isImplicitlyLogged", "", "isInBackground", "currentSessionId", "Ljava/util/UUID;", "operationalParameters", "Lcom/facebook/appevents/OperationalData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", "jsonString", "operationalJsonString", "isImplicit", "inBackground", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "name", "getName", "()Ljava/lang/String;", "operationalJsonObject", "getOperationalJsonObject", "getIsImplicit", "getJSONObject", "getJSONObjectForAppEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "getOperationalJSONObject", "type", "Lcom/facebook/appevents/OperationalDataEnum;", InAppPurchaseConstants.METHOD_TO_STRING, "validateParameters", "", "isOperational", "writeReplace", "", "Companion", "SerializationProxyV2", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEvent implements Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;
    private final JSONObject operationalJsonObject;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "<init>", "()V", "", "identifier", "Lwj/r;", "validateIdentifier", "(Ljava/lang/String;)V", "", "MAX_IDENTIFIER_LENGTH", "I", "", "serialVersionUID", "J", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validatedIdentifiers", "Ljava/util/HashSet;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void validateIdentifier(String identifier) {
            boolean zContains;
            n.f(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                throw new l7.n(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                zContains = AppEvent.validatedIdentifiers.contains(identifier);
            }
            if (zContains) {
                return;
            }
            Pattern patternCompile = Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$");
            n.e(patternCompile, "compile(...)");
            if (!patternCompile.matcher(identifier).matches()) {
                throw new l7.n(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1)));
            }
            synchronized (AppEvent.validatedIdentifiers) {
                AppEvent.validatedIdentifiers.add(identifier);
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "jsonString", "", "operationalJsonString", "isImplicit", "", "inBackground", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;
        private final String operationalJsonString;

        public SerializationProxyV2(String jsonString, String operationalJsonString, boolean z10, boolean z11) {
            n.f(jsonString, "jsonString");
            n.f(operationalJsonString, "operationalJsonString");
            this.jsonString = jsonString;
            this.operationalJsonString = operationalJsonString;
            this.isImplicit = z10;
            this.inBackground = z11;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, null);
        }
    }

    public /* synthetic */ AppEvent(String str, String str2, boolean z10, boolean z11, g gVar) {
        this(str, str2, z10, z11);
    }

    private final JSONObject getJSONObjectForAppEvent(String contextName, String eventName, Double valueToSum, Bundle parameters, UUID currentSessionId) throws JSONException {
        INSTANCE.validateIdentifier(eventName);
        JSONObject jSONObject = new JSONObject();
        String strProcessEvent = RestrictiveDataManager.processEvent(eventName);
        if (n.a(strProcessEvent, eventName)) {
            strProcessEvent = RedactedEventsManager.processEventsRedaction(eventName);
        }
        jSONObject.put(Constants.EVENT_NAME_EVENT_KEY, strProcessEvent);
        jSONObject.put(Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", contextName);
        if (currentSessionId != null) {
            jSONObject.put("_session_id", currentSessionId);
        }
        if (parameters != null) {
            Map mapValidateParameters$default = validateParameters$default(this, parameters, false, 2, null);
            for (String str : mapValidateParameters$default.keySet()) {
                jSONObject.put(str, mapValidateParameters$default.get(str));
            }
        }
        if (valueToSum != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, valueToSum.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        ne.a aVar = x.f48792c;
        String string = jSONObject.toString();
        n.e(string, "eventObject.toString()");
        aVar.t(g0.f45136d, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle parameters, boolean isOperational) {
        HashMap map = new HashMap();
        for (String key : parameters.keySet()) {
            Companion companion = INSTANCE;
            n.e(key, "key");
            companion.validateIdentifier(key);
            Object obj = parameters.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new l7.n(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2)));
            }
            map.put(key, obj.toString());
        }
        if (!isOperational) {
            IntegrityManager.processParameters(map);
            h0.b(map);
            RestrictiveDataManager.processParameters(map, this.name);
            h0.b(map);
            EventDeactivationManager.processDeprecatedParameters(map, this.name);
        }
        return map;
    }

    public static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return appEvent.validateParameters(bundle, z10);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        n.e(string, "jsonObject.toString()");
        String string2 = this.operationalJsonObject.toString();
        n.e(string2, "operationalJsonObject.toString()");
        return new SerializationProxyV2(string, string2, this.isImplicit, this.inBackground);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getOperationalJSONObject, reason: from getter */
    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, OperationalData operationalData, int i10, g gVar) throws JSONException, l7.n {
        this(str, str2, d10, bundle, z10, z11, uuid, (i10 & 128) != 0 ? null : operationalData);
    }

    public final JSONObject getOperationalJSONObject(OperationalDataEnum type) {
        n.f(type, "type");
        return this.operationalJsonObject.optJSONObject(type.getValue());
    }

    public AppEvent(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, OperationalData operationalData) throws JSONException, l7.n {
        JSONObject json;
        n.f(contextName, "contextName");
        n.f(eventName, "eventName");
        this.isImplicit = z10;
        this.inBackground = z11;
        this.name = eventName;
        this.operationalJsonObject = (operationalData == null || (json = operationalData.toJSON()) == null) ? new JSONObject() : json;
        this.jsonObject = getJSONObjectForAppEvent(contextName, eventName, d10, bundle, uuid);
    }

    private AppEvent(String str, String str2, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z10;
        String strOptString = jSONObject.optString(Constants.EVENT_NAME_EVENT_KEY);
        n.e(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = strOptString;
        this.inBackground = z11;
    }
}
