package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.r;
import q7.u;
import xj.k;
import xj.v;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b!\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002MNB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b,\u0010\u0003R\u0014\u0010/\u001a\u00020.8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00103R\u0014\u00107\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00108\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00103R\u0014\u00109\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00103R\u0014\u0010:\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00103R\u0014\u0010;\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010<\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010=\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00103R\u0014\u0010?\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00103R\u0014\u0010@\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00103R\u0014\u0010A\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00103R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00103R\u0014\u0010E\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00103R\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010!2\b\u0010H\u001a\u0004\u0018\u00010!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/facebook/appevents/integrity/VVPManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "", "isEnabled", "()Z", "Lorg/json/JSONObject;", "obj", "", "Lcom/facebook/appevents/integrity/VVPManager$CompiledRule;", "parseRules", "(Lorg/json/JSONObject;)Ljava/util/List;", "", X3.i.W, "Ljava/util/regex/Pattern;", "optRegex", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/regex/Pattern;", "", "parseStandardParams", "(Lorg/json/JSONObject;)Ljava/util/Set;", "parseInScopeEventNames", X3.i.f27798j0, "Landroid/os/Bundle;", "parameters", "processParametersForVVP", "(Ljava/lang/String;Landroid/os/Bundle;)V", "loadConfig$facebook_core_release", "loadConfig", "jsonStr", "Lcom/facebook/appevents/integrity/VVPManager$VVPConfig;", "parseConfig$facebook_core_release", "(Ljava/lang/String;)Lcom/facebook/appevents/integrity/VVPManager$VVPConfig;", "parseConfig", "ruleObj", "compileRule$facebook_core_release", "(Lorg/json/JSONObject;)Lcom/facebook/appevents/integrity/VVPManager$CompiledRule;", "compileRule", "scrubIdInContentsArray$facebook_core_release", "(Landroid/os/Bundle;)V", "scrubIdInContentsArray", "clearForTests$facebook_core_release", "clearForTests", "", "PLACE_CUSTOM_DATA", "I", "PLACE_EVENT_NAME", "ENABLED_KEY", "Ljava/lang/String;", "IS_SHADOW_ENABLED_KEY", "RULES_KEY", "STANDARD_PARAMS_KEY", "IN_SCOPE_EVENT_NAMES_KEY", "PLACE_KEY", "KEY_REGEX_KEY", "KEY_NEGATIVE_REGEX_KEY", "VALUE_REGEX_KEY", "VVP_IS_APPLIED_KEY", "VVP_IS_APPLIED_VALUE", "VVP_METADATA_KEY", "VP_RP", "VP_RP_EV", "EVENT_NAME_SENTINEL", "CONTENT_ID_SANITIZE_KEYS", "Ljava/util/Set;", "SANITIZED_VALUE", "CONTENTS_KEY", "enabled", "Z", "<set-?>", "config", "Lcom/facebook/appevents/integrity/VVPManager$VVPConfig;", "getConfig$facebook_core_release", "()Lcom/facebook/appevents/integrity/VVPManager$VVPConfig;", "CompiledRule", "VVPConfig", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class VVPManager {
    private static final String CONTENTS_KEY = "fb_content";
    private static final String ENABLED_KEY = "enabled";
    private static final String EVENT_NAME_SENTINEL = "1";
    private static final String IN_SCOPE_EVENT_NAMES_KEY = "inScopeEventNames";
    private static final String IS_SHADOW_ENABLED_KEY = "isShadowEnabled";
    private static final String KEY_NEGATIVE_REGEX_KEY = "keyNegativeRegex";
    private static final String KEY_REGEX_KEY = "keyRegex";
    public static final int PLACE_CUSTOM_DATA = 1;
    public static final int PLACE_EVENT_NAME = 3;
    private static final String PLACE_KEY = "place";
    private static final String RULES_KEY = "rules";
    private static final String SANITIZED_VALUE = "_removed_";
    private static final String STANDARD_PARAMS_KEY = "standardParams";
    private static final String VALUE_REGEX_KEY = "valueRegex";
    private static final String VP_RP = "vp_rp";
    private static final String VP_RP_EV = "vp_rp_ev";
    private static final String VVP_IS_APPLIED_KEY = "vvp";
    private static final String VVP_IS_APPLIED_VALUE = "1";
    private static final String VVP_METADATA_KEY = "vvp_md";
    private static volatile VVPConfig config;
    private static boolean enabled;
    public static final VVPManager INSTANCE = new VVPManager();
    private static final Set<String> CONTENT_ID_SANITIZE_KEYS = k.E0(new String[]{"fb_content_ids", AppEventsConstants.EVENT_PARAM_CONTENT_ID});

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/integrity/VVPManager$CompiledRule;", "", VVPManager.PLACE_KEY, "", VVPManager.KEY_REGEX_KEY, "Ljava/util/regex/Pattern;", VVPManager.KEY_NEGATIVE_REGEX_KEY, VVPManager.VALUE_REGEX_KEY, "(ILjava/util/regex/Pattern;Ljava/util/regex/Pattern;Ljava/util/regex/Pattern;)V", "getKeyNegativeRegex", "()Ljava/util/regex/Pattern;", "getKeyRegex", "getPlace", "()I", "getValueRegex", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class CompiledRule {
        private final Pattern keyNegativeRegex;
        private final Pattern keyRegex;
        private final int place;
        private final Pattern valueRegex;

        public CompiledRule(int i10, Pattern pattern, Pattern pattern2, Pattern pattern3) {
            this.place = i10;
            this.keyRegex = pattern;
            this.keyNegativeRegex = pattern2;
            this.valueRegex = pattern3;
        }

        public static /* synthetic */ CompiledRule copy$default(CompiledRule compiledRule, int i10, Pattern pattern, Pattern pattern2, Pattern pattern3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = compiledRule.place;
            }
            if ((i11 & 2) != 0) {
                pattern = compiledRule.keyRegex;
            }
            if ((i11 & 4) != 0) {
                pattern2 = compiledRule.keyNegativeRegex;
            }
            if ((i11 & 8) != 0) {
                pattern3 = compiledRule.valueRegex;
            }
            return compiledRule.copy(i10, pattern, pattern2, pattern3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPlace() {
            return this.place;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Pattern getKeyRegex() {
            return this.keyRegex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Pattern getKeyNegativeRegex() {
            return this.keyNegativeRegex;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Pattern getValueRegex() {
            return this.valueRegex;
        }

        public final CompiledRule copy(int place, Pattern keyRegex, Pattern keyNegativeRegex, Pattern valueRegex) {
            return new CompiledRule(place, keyRegex, keyNegativeRegex, valueRegex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompiledRule)) {
                return false;
            }
            CompiledRule compiledRule = (CompiledRule) other;
            return this.place == compiledRule.place && n.a(this.keyRegex, compiledRule.keyRegex) && n.a(this.keyNegativeRegex, compiledRule.keyNegativeRegex) && n.a(this.valueRegex, compiledRule.valueRegex);
        }

        public final Pattern getKeyNegativeRegex() {
            return this.keyNegativeRegex;
        }

        public final Pattern getKeyRegex() {
            return this.keyRegex;
        }

        public final int getPlace() {
            return this.place;
        }

        public final Pattern getValueRegex() {
            return this.valueRegex;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.place) * 31;
            Pattern pattern = this.keyRegex;
            int iHashCode2 = (iHashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
            Pattern pattern2 = this.keyNegativeRegex;
            int iHashCode3 = (iHashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
            Pattern pattern3 = this.valueRegex;
            return iHashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
        }

        public String toString() {
            return "CompiledRule(place=" + this.place + ", keyRegex=" + this.keyRegex + ", keyNegativeRegex=" + this.keyNegativeRegex + ", valueRegex=" + this.valueRegex + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/integrity/VVPManager$VVPConfig;", "", VVPManager.RULES_KEY, "", "Lcom/facebook/appevents/integrity/VVPManager$CompiledRule;", VVPManager.STANDARD_PARAMS_KEY, "", "", VVPManager.IN_SCOPE_EVENT_NAMES_KEY, VVPManager.IS_SHADOW_ENABLED_KEY, "", "(Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Z)V", "getInScopeEventNames", "()Ljava/util/Set;", "()Z", "getRules", "()Ljava/util/List;", "getStandardParams", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class VVPConfig {
        private final Set<String> inScopeEventNames;
        private final boolean isShadowEnabled;
        private final List<CompiledRule> rules;
        private final Set<String> standardParams;

        public VVPConfig(List<CompiledRule> rules, Set<String> standardParams, Set<String> set, boolean z10) {
            n.f(rules, "rules");
            n.f(standardParams, "standardParams");
            this.rules = rules;
            this.standardParams = standardParams;
            this.inScopeEventNames = set;
            this.isShadowEnabled = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VVPConfig copy$default(VVPConfig vVPConfig, List list, Set set, Set set2, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = vVPConfig.rules;
            }
            if ((i10 & 2) != 0) {
                set = vVPConfig.standardParams;
            }
            if ((i10 & 4) != 0) {
                set2 = vVPConfig.inScopeEventNames;
            }
            if ((i10 & 8) != 0) {
                z10 = vVPConfig.isShadowEnabled;
            }
            return vVPConfig.copy(list, set, set2, z10);
        }

        public final List<CompiledRule> component1() {
            return this.rules;
        }

        public final Set<String> component2() {
            return this.standardParams;
        }

        public final Set<String> component3() {
            return this.inScopeEventNames;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsShadowEnabled() {
            return this.isShadowEnabled;
        }

        public final VVPConfig copy(List<CompiledRule> rules, Set<String> standardParams, Set<String> inScopeEventNames, boolean isShadowEnabled) {
            n.f(rules, "rules");
            n.f(standardParams, "standardParams");
            return new VVPConfig(rules, standardParams, inScopeEventNames, isShadowEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VVPConfig)) {
                return false;
            }
            VVPConfig vVPConfig = (VVPConfig) other;
            return n.a(this.rules, vVPConfig.rules) && n.a(this.standardParams, vVPConfig.standardParams) && n.a(this.inScopeEventNames, vVPConfig.inScopeEventNames) && this.isShadowEnabled == vVPConfig.isShadowEnabled;
        }

        public final Set<String> getInScopeEventNames() {
            return this.inScopeEventNames;
        }

        public final List<CompiledRule> getRules() {
            return this.rules;
        }

        public final Set<String> getStandardParams() {
            return this.standardParams;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            int iHashCode = (this.standardParams.hashCode() + (this.rules.hashCode() * 31)) * 31;
            Set<String> set = this.inScopeEventNames;
            int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
            boolean z10 = this.isShadowEnabled;
            ?? r2 = z10;
            if (z10) {
                r2 = 1;
            }
            return iHashCode2 + r2;
        }

        public final boolean isShadowEnabled() {
            return this.isShadowEnabled;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("VVPConfig(rules=");
            sb2.append(this.rules);
            sb2.append(", standardParams=");
            sb2.append(this.standardParams);
            sb2.append(", inScopeEventNames=");
            sb2.append(this.inScopeEventNames);
            sb2.append(", isShadowEnabled=");
            return e.t(sb2, this.isShadowEnabled, ')');
        }
    }

    private VVPManager() {
    }

    public static final void disable() {
        if (v7.a.b(VVPManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th2) {
            v7.a.a(VVPManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(VVPManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadConfig$facebook_core_release();
        } catch (Throwable th2) {
            v7.a.a(VVPManager.class, th2);
        }
    }

    public static final boolean isEnabled() {
        if (v7.a.b(VVPManager.class)) {
            return false;
        }
        try {
            return enabled;
        } catch (Throwable th2) {
            v7.a.a(VVPManager.class, th2);
            return false;
        }
    }

    private final Pattern optRegex(JSONObject obj, String key) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            if (obj.has(key) && !obj.isNull(key)) {
                String raw = obj.optString(key, "");
                n.e(raw, "raw");
                if (raw.length() == 0) {
                    return null;
                }
                try {
                    return Pattern.compile(raw, 2);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final Set<String> parseInScopeEventNames(JSONObject obj) {
        JSONArray jSONArrayOptJSONArray;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            if (!obj.has(IN_SCOPE_EVENT_NAMES_KEY) || obj.isNull(IN_SCOPE_EVENT_NAMES_KEY) || (jSONArrayOptJSONArray = obj.optJSONArray(IN_SCOPE_EVENT_NAMES_KEY)) == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String s10 = jSONArrayOptJSONArray.optString(i10, "");
                n.e(s10, "s");
                if (s10.length() > 0) {
                    hashSet.add(s10);
                }
            }
            return hashSet;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final List<CompiledRule> parseRules(JSONObject obj) {
        CompiledRule compiledRuleCompileRule$facebook_core_release;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = obj.optJSONArray(RULES_KEY);
            if (jSONArrayOptJSONArray == null) {
                return v.f53866a;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (compiledRuleCompileRule$facebook_core_release = compileRule$facebook_core_release(jSONObjectOptJSONObject)) != null) {
                    arrayList.add(compiledRuleCompileRule$facebook_core_release);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final Set<String> parseStandardParams(JSONObject obj) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = obj.optJSONObject(STANDARD_PARAMS_KEY);
            if (jSONObjectOptJSONObject == null) {
                return x.f53868a;
            }
            HashSet hashSet = new HashSet();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.optBoolean(next, false)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final void processParametersForVVP(String eventName, Bundle parameters) {
        VVPConfig vVPConfig;
        Matcher matcher;
        String string;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        if (v7.a.b(VVPManager.class)) {
            return;
        }
        try {
            n.f(eventName, "eventName");
            if (enabled && parameters != null && !parameters.isEmpty() && (vVPConfig = config) != null) {
                Set<String> inScopeEventNames = vVPConfig.getInScopeEventNames();
                if (inScopeEventNames == null || inScopeEventNames.isEmpty() || inScopeEventNames.contains(eventName)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    boolean z10 = false;
                    for (CompiledRule compiledRule : vVPConfig.getRules()) {
                        int place = compiledRule.getPlace();
                        if (place == 1) {
                            Set<String> setKeySet = parameters.keySet();
                            n.e(setKeySet, "parameters.keySet()");
                            for (String str : xj.n.N0(setKeySet)) {
                                Object obj = parameters.get(str);
                                if (obj != null && (string = obj.toString()) != null) {
                                    Pattern keyRegex = compiledRule.getKeyRegex();
                                    boolean zFind = (keyRegex == null || (matcher4 = keyRegex.matcher(str)) == null) ? true : matcher4.find();
                                    Pattern keyNegativeRegex = compiledRule.getKeyNegativeRegex();
                                    boolean z11 = zFind && !((keyNegativeRegex == null || (matcher3 = keyNegativeRegex.matcher(str)) == null) ? false : matcher3.find());
                                    Pattern valueRegex = compiledRule.getValueRegex();
                                    boolean zFind2 = (valueRegex == null || (matcher2 = valueRegex.matcher(string)) == null) ? true : matcher2.find();
                                    if (z11 && zFind2) {
                                        linkedHashSet.add(str);
                                        z10 = true;
                                    }
                                }
                            }
                        } else if (place == 3 && compiledRule.getKeyRegex() != null && compiledRule.getKeyRegex().matcher(eventName).find()) {
                            Pattern keyNegativeRegex2 = compiledRule.getKeyNegativeRegex();
                            if (!((keyNegativeRegex2 == null || (matcher = keyNegativeRegex2.matcher(eventName)) == null) ? false : matcher.find())) {
                                linkedHashSet2.add("1");
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        if (!vVPConfig.isShadowEnabled() && !vVPConfig.getStandardParams().isEmpty()) {
                            Set<String> setKeySet2 = parameters.keySet();
                            n.e(setKeySet2, "parameters.keySet()");
                            for (String str2 : xj.n.N0(setKeySet2)) {
                                if (!vVPConfig.getStandardParams().contains(str2)) {
                                    if (CONTENT_ID_SANITIZE_KEYS.contains(str2)) {
                                        parameters.putString(str2, SANITIZED_VALUE);
                                    } else {
                                        parameters.remove(str2);
                                    }
                                }
                            }
                            INSTANCE.scrubIdInContentsArray$facebook_core_release(parameters);
                        }
                        parameters.putString(VVP_IS_APPLIED_KEY, "1");
                        if (linkedHashSet.isEmpty() && linkedHashSet2.isEmpty()) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (!linkedHashSet.isEmpty()) {
                            jSONObject.put(VP_RP, new JSONArray((Collection) xj.n.N0(linkedHashSet)));
                        }
                        if (!linkedHashSet2.isEmpty()) {
                            jSONObject.put(VP_RP_EV, new JSONArray((Collection) xj.n.N0(linkedHashSet2)));
                        }
                        parameters.putString(VVP_METADATA_KEY, jSONObject.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(VVPManager.class, th2);
        }
    }

    public final void clearForTests$facebook_core_release() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            enabled = false;
            config = null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final CompiledRule compileRule$facebook_core_release(JSONObject ruleObj) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(ruleObj, "ruleObj");
            int iOptInt = ruleObj.optInt(PLACE_KEY, -1);
            if (iOptInt != 1 && iOptInt != 3) {
                return null;
            }
            Pattern patternOptRegex = optRegex(ruleObj, KEY_REGEX_KEY);
            Pattern patternOptRegex2 = optRegex(ruleObj, KEY_NEGATIVE_REGEX_KEY);
            Pattern patternOptRegex3 = optRegex(ruleObj, VALUE_REGEX_KEY);
            if (patternOptRegex == null && patternOptRegex3 == null) {
                return null;
            }
            return new CompiledRule(iOptInt, patternOptRegex, patternOptRegex2, patternOptRegex3);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final VVPConfig getConfig$facebook_core_release() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return config;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final void loadConfig$facebook_core_release() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            VVPConfig config$facebook_core_release = null;
            String str = rVarK != null ? rVarK.f48775t : null;
            if (str != null && str.length() != 0) {
                config$facebook_core_release = parseConfig$facebook_core_release(str);
            }
            config = config$facebook_core_release;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final VVPConfig parseConfig$facebook_core_release(String jsonStr) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(jsonStr, "jsonStr");
            try {
                JSONObject jSONObject = new JSONObject(jsonStr);
                if (!jSONObject.optBoolean("enabled", false)) {
                    return null;
                }
                List<CompiledRule> rules = parseRules(jSONObject);
                if (rules.isEmpty()) {
                    return null;
                }
                return new VVPConfig(rules, parseStandardParams(jSONObject), parseInScopeEventNames(jSONObject), jSONObject.optBoolean(IS_SHADOW_ENABLED_KEY, true));
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final void scrubIdInContentsArray$facebook_core_release(Bundle parameters) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(parameters, "parameters");
            String string = parameters.getString("fb_content");
            if (string == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("id")) {
                        jSONObjectOptJSONObject.put("id", SANITIZED_VALUE);
                        z10 = true;
                    }
                }
                if (z10) {
                    parameters.putString("fb_content", jSONArray.toString());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
