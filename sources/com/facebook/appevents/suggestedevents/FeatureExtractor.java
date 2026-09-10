package com.facebook.appevents.suggestedevents;

import an.h;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.Gc;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.a;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010'J+\u0010+\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0(H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J/\u0010:\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00122\n\u00108\u001a\u000606j\u0002`72\n\u00109\u001a\u000606j\u0002`7H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010F\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010BR\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010JR\"\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010M\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/facebook/appevents/suggestedevents/FeatureExtractor;", "", "<init>", "()V", "", "isInitialized", "()Z", "Ljava/io/File;", X3.i.f27782b, "Lwj/r;", MobileAdsBridgeBase.initializeMethodName, "(Ljava/io/File;)V", "", "buttonText", "activityName", "appName", "getTextFeature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "viewHierarchy", "", "getDenseFeatures", "(Lorg/json/JSONObject;Ljava/lang/String;)[F", "node", "parseFeatures", "(Lorg/json/JSONObject;)[F", "Lorg/json/JSONArray;", "siblings", "screenName", "formFieldsJSON", "nonparseFeatures", "(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[F", "language", NotificationCompat.CATEGORY_EVENT, "textType", "matchText", "regexMatched", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "pattern", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "indicators", "values", "matchIndicators", "([Ljava/lang/String;[Ljava/lang/String;)Z", "pruneTree", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)Z", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "sum", "([F[F)V", "isButton", "(Lorg/json/JSONObject;)Z", "view", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "textSB", "hintSB", "updateHintAndTextRecursively", "(Lorg/json/JSONObject;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V", "getInteractedNode", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "NUM_OF_FEATURES", "I", "REGEX_CR_PASSWORD_FIELD", "Ljava/lang/String;", "REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD", "REGEX_CR_HAS_LOG_IN_KEYWORDS", "REGEX_CR_HAS_SIGN_ON_KEYWORDS", "REGEX_ADD_TO_CART_BUTTON_TEXT", "REGEX_ADD_TO_CART_PAGE_TITLE", "", "languageInfo", "Ljava/util/Map;", "eventInfo", "textTypeInfo", "rules", "Lorg/json/JSONObject;", "initialized", "Z", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FeatureExtractor {
    public static final FeatureExtractor INSTANCE = new FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    private static final String REGEX_CR_PASSWORD_FIELD = "password";
    private static Map<String, String> eventInfo;
    private static boolean initialized;
    private static Map<String, String> languageInfo;
    private static JSONObject rules;
    private static Map<String, String> textTypeInfo;

    private FeatureExtractor() {
    }

    public static final float[] getDenseFeatures(JSONObject viewHierarchy, String appName) {
        if (a.b(FeatureExtractor.class)) {
            return null;
        }
        try {
            n.f(viewHierarchy, "viewHierarchy");
            n.f(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                n.e(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                String screenName = viewHierarchy.optString(ViewHierarchyConstants.SCREEN_NAME_KEY);
                JSONArray jSONArray = new JSONArray();
                FeatureExtractor featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject));
                JSONObject interactedNode = featureExtractor.getInteractedNode(jSONObject);
                if (interactedNode == null) {
                    return null;
                }
                n.e(screenName, "screenName");
                String string = jSONObject.toString();
                n.e(string, "viewTree.toString()");
                featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            a.a(FeatureExtractor.class, th2);
            return null;
        }
    }

    private final JSONObject getInteractedNode(JSONObject view) {
        if (a.b(this)) {
            return null;
        }
        try {
            if (view.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return view;
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                n.e(jSONObject, "children.getJSONObject(i)");
                JSONObject interactedNode = getInteractedNode(jSONObject);
                if (interactedNode != null) {
                    return interactedNode;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            a.a(this, th2);
        }
        return null;
    }

    public static final String getTextFeature(String buttonText, String activityName, String appName) {
        if (a.b(FeatureExtractor.class)) {
            return null;
        }
        try {
            n.f(buttonText, "buttonText");
            n.f(activityName, "activityName");
            n.f(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            n.e(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            a.a(FeatureExtractor.class, th2);
            return null;
        }
    }

    public static final void initialize(File file) {
        if (a.b(FeatureExtractor.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, an.a.f3768a));
                languageInfo = b0.Q(new f(ViewHierarchyConstants.ENGLISH, "1"), new f(ViewHierarchyConstants.GERMAN, "2"), new f(ViewHierarchyConstants.SPANISH, "3"), new f(ViewHierarchyConstants.JAPANESE, "4"));
                eventInfo = b0.Q(new f(ViewHierarchyConstants.VIEW_CONTENT, "0"), new f(ViewHierarchyConstants.SEARCH, "1"), new f(ViewHierarchyConstants.ADD_TO_CART, "2"), new f(ViewHierarchyConstants.ADD_TO_WISHLIST, "3"), new f(ViewHierarchyConstants.INITIATE_CHECKOUT, "4"), new f(ViewHierarchyConstants.ADD_PAYMENT_INFO, CampaignEx.CLICKMODE_ON), new f(ViewHierarchyConstants.PURCHASE, "6"), new f(ViewHierarchyConstants.LEAD, Gc.f26168e), new f(ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                textTypeInfo = b0.Q(new f(ViewHierarchyConstants.BUTTON_TEXT, "1"), new f(ViewHierarchyConstants.PAGE_TITLE, "2"), new f(ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, "3"), new f(ViewHierarchyConstants.BUTTON_ID, "4"));
                initialized = true;
            } catch (Throwable th2) {
                a.a(FeatureExtractor.class, th2);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean isButton(JSONObject node) {
        if (a.b(this)) {
            return false;
        }
        try {
            return ((node.optInt(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) > 0;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    public static final boolean isInitialized() {
        if (a.b(FeatureExtractor.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th2) {
            a.a(FeatureExtractor.class, th2);
            return false;
        }
    }

    private final boolean matchIndicators(String[] indicators, String[] values) {
        if (!a.b(this)) {
            try {
                for (String str : indicators) {
                    for (String str2 : values) {
                        if (h.q0(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    private final float[] nonparseFeatures(JSONObject node, JSONArray siblings, String screenName, String formFieldsJSON, String appName) {
        float[] fArr;
        String str;
        String string;
        String string2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float[] fArr2 = null;
        if (a.b(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr3[i10] = 0.0f;
            }
            int length = siblings.length();
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = siblings.length();
                int i11 = 0;
                while (i11 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject = siblings.getJSONObject(i11);
                            n.e(jSONObject, "siblings.getJSONObject(i)");
                            if (isButton(jSONObject)) {
                                fArr3[9] = fArr3[9] + 1.0f;
                            }
                            i11++;
                            fArr2 = fArr;
                        } catch (Throwable th2) {
                            th = th2;
                            a.a(this, th);
                            return fArr;
                        }
                    } catch (JSONException unused) {
                        fArr3[13] = -1.0f;
                        fArr3[14] = -1.0f;
                        str = screenName + '|' + appName;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder();
                        updateHintAndTextRecursively(node, sb3, sb2);
                        string = sb2.toString();
                        n.e(string, "hintSB.toString()");
                        string2 = sb3.toString();
                        n.e(string2, "textSB.toString()");
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                            f10 = 1.0f;
                        } else {
                            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[15] = f10;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str)) {
                            f11 = 1.0f;
                        } else {
                            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[16] = f11;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, string)) {
                            f12 = 1.0f;
                        } else {
                            f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[17] = f12;
                        if (h.q0(formFieldsJSON, REGEX_CR_PASSWORD_FIELD, false)) {
                            f13 = 1.0f;
                        } else {
                            f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[18] = f13;
                        if (regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, formFieldsJSON)) {
                            f14 = 1.0f;
                        } else {
                            f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[19] = f14;
                        if (regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, formFieldsJSON)) {
                            f15 = 1.0f;
                        } else {
                            f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[20] = f15;
                        if (regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, formFieldsJSON)) {
                            f16 = 1.0f;
                        } else {
                            f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[21] = f16;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                            f17 = 1.0f;
                        } else {
                            f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[22] = f17;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str)) {
                            f18 = 1.0f;
                        } else {
                            f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[24] = f18;
                        if (regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, string2)) {
                            f19 = 1.0f;
                        } else {
                            f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[25] = f19;
                        if (regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str)) {
                            f20 = 1.0f;
                        } else {
                            f20 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[27] = f20;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                            f21 = 1.0f;
                        } else {
                            f21 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[28] = f21;
                        if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str)) {
                            f22 = 1.0f;
                        } else {
                            f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        fArr3[29] = f22;
                        return fArr3;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str = screenName + '|' + appName;
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            updateHintAndTextRecursively(node, sb5, sb4);
            string = sb4.toString();
            n.e(string, "hintSB.toString()");
            string2 = sb5.toString();
            n.e(string2, "textSB.toString()");
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                f10 = 1.0f;
            } else {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[15] = f10;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str)) {
                f11 = 1.0f;
            } else {
                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[16] = f11;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, string)) {
                f12 = 1.0f;
            } else {
                f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[17] = f12;
            if (h.q0(formFieldsJSON, REGEX_CR_PASSWORD_FIELD, false)) {
                f13 = 1.0f;
            } else {
                f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[18] = f13;
            if (regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, formFieldsJSON)) {
                f14 = 1.0f;
            } else {
                f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[19] = f14;
            if (regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, formFieldsJSON)) {
                f15 = 1.0f;
            } else {
                f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[20] = f15;
            if (regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, formFieldsJSON)) {
                f16 = 1.0f;
            } else {
                f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[21] = f16;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                f17 = 1.0f;
            } else {
                f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[22] = f17;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str)) {
                f18 = 1.0f;
            } else {
                f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[24] = f18;
            if (regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, string2)) {
                f19 = 1.0f;
            } else {
                f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[25] = f19;
            if (regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str)) {
                f20 = 1.0f;
            } else {
                f20 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[27] = f20;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, string2)) {
                f21 = 1.0f;
            } else {
                f21 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[28] = f21;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str)) {
                f22 = 1.0f;
            } else {
                f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            fArr3[29] = f22;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    private final float[] parseFeatures(JSONObject node) {
        if (a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String strOptString = node.optString("text");
            n.e(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            n.e(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = node.optString(ViewHierarchyConstants.HINT_KEY);
            n.e(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            n.e(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = node.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            n.e(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            n.e(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = node.optInt(ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new String[]{"$", "amount", "price", X3.i.l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new String[]{REGEX_CR_PASSWORD_FIELD, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new String[]{AppLovinEventTypes.USER_EXECUTED_SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (h.q0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new String[]{CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (h.q0(lowerCase3, "radio", false) && h.q0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = node.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i11);
                    n.e(jSONObject, "childViews.getJSONObject(i)");
                    sum(fArr, parseFeatures(jSONObject));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    private final boolean pruneTree(JSONObject node, JSONArray siblings) {
        boolean z10;
        if (a.b(this)) {
            return false;
        }
        try {
            if (node.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = node.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            boolean z11 = z10;
            JSONArray jSONArray = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    siblings.put(jSONArrayOptJSONArray.getJSONObject(i11));
                }
                return z11;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length3; i12++) {
                JSONObject child = jSONArrayOptJSONArray.getJSONObject(i12);
                n.e(child, "child");
                if (pruneTree(child, siblings)) {
                    jSONArray.put(child);
                    z11 = true;
                }
            }
            node.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean regexMatched(String language, String event, String textType, String matchText) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (a.b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String strOptString = null;
            if (jSONObject == null) {
                n.l("rules");
                throw null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map<String, String> map = languageInfo;
                if (map == null) {
                    n.l("languageInfo");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(map.get(language));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map2 = eventInfo;
                    if (map2 == null) {
                        n.l("eventInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject(map2.get(event));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map<String, String> map3 = textTypeInfo;
                        if (map3 == null) {
                            n.l("textTypeInfo");
                            throw null;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString(map3.get(textType));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return regexMatched(strOptString, matchText);
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final void sum(float[] a8, float[] b10) {
        if (a.b(this)) {
            return;
        }
        try {
            int length = a8.length;
            for (int i10 = 0; i10 < length; i10++) {
                a8[i10] = a8[i10] + b10[i10];
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private final void updateHintAndTextRecursively(JSONObject view, StringBuilder textSB, StringBuilder hintSB) {
        if (a.b(this)) {
            return;
        }
        try {
            String strOptString = view.optString("text", "");
            n.e(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            n.e(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = view.optString(ViewHierarchyConstants.HINT_KEY, "");
            n.e(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            n.e(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                textSB.append(lowerCase);
                textSB.append(" ");
            }
            if (lowerCase2.length() > 0) {
                hintSB.append(lowerCase2);
                hintSB.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i10);
                    n.e(currentChildView, "currentChildView");
                    updateHintAndTextRecursively(currentChildView, textSB, hintSB);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private final boolean regexMatched(String pattern, String matchText) {
        if (a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(pattern).matcher(matchText).find();
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }
}
