package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.Analytics;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rf f13972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f13973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef f13974c;
    public final y6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf f13975e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13976a;

        static {
            int[] iArr = new int[Analytics.IAPType.values().length];
            try {
                iArr[Analytics.IAPType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Analytics.IAPType.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13976a = iArr;
        }
    }

    public g1(rf sdkInitializer, z2 networkService, ef requestBodyBuilder, y6 eventTracker, uf session) {
        Intrinsics.f(sdkInitializer, "sdkInitializer");
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(session, "session");
        this.f13972a = sdkInitializer;
        this.f13973b = networkService;
        this.f13974c = requestBodyBuilder;
        this.d = eventTracker;
        this.f13975e = session;
    }

    public final JSONObject a(String str, String str2) throws JSONException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            za.b("Null object is passed for for amazon user id or amazon purchase token", (Throwable) null, 2, (Object) null);
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userID", str);
        jSONObject.put("purchaseToken", str2);
        jSONObject.put("type", Analytics.IAPType.AMAZON.ordinal());
        return jSONObject;
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            za.b("Null object is passed for for purchase data or purchase signature", (Throwable) null, 2, (Object) null);
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("purchaseData", str);
        jSONObject.put("purchaseSignature", str2);
        jSONObject.put("type", Analytics.IAPType.GOOGLE_PLAY.ordinal());
        return jSONObject;
    }

    public final boolean a() {
        return this.f13972a.e();
    }

    public final void a(JSONObject jSONObject) {
        b3 b3Var = new b3("https://live.chartboost.com", String.format(Locale.US, "%s%s", Arrays.copyOf(new Object[]{"/post-install-event/", "iap"}, 2)), this.f13974c.a(), ae.NORMAL, "iap", null, this.d, this.f13975e);
        b3Var.a("iap", jSONObject);
        b3Var.s = true;
        this.f13973b.a(b3Var);
    }

    public final void a(JSONArray jSONArray) {
        b3 b3Var = new b3("https://live.chartboost.com", "/post-install-event/tracking", this.f13974c.a(), ae.NORMAL, "tracking", null, this.d, this.f13975e);
        b3Var.a("track_info", jSONArray);
        b3Var.s = true;
        this.f13973b.a(b3Var);
    }

    public final void a(String productID, String title, String description, String price, String currency, String str, String str2, String str3, String str4, Analytics.IAPType iapType) {
        JSONObject jSONObjectB;
        Intrinsics.f(productID, "productID");
        Intrinsics.f(title, "title");
        Intrinsics.f(description, "description");
        Intrinsics.f(price, "price");
        Intrinsics.f(currency, "currency");
        Intrinsics.f(iapType, "iapType");
        try {
            if (!a()) {
                za.b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            float fA = a(price);
            if (fA == -1.0f) {
                return;
            }
            int i2 = a.f13976a[iapType.ordinal()];
            if (i2 == 1) {
                jSONObjectB = b(str, str2);
            } else if (i2 == 2) {
                jSONObjectB = a(str3, str4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (jSONObjectB.length() == 0) {
                za.b("Error while parsing the receipt to a JSON Object", (Throwable) null, 2, (Object) null);
                return;
            }
            String string = jSONObjectB.toString();
            Intrinsics.e(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("localized-title", title);
            jSONObject.put("localized-description", description);
            jSONObject.put("price", Float.valueOf(fA));
            jSONObject.put("currency", currency);
            jSONObject.put("productID", productID);
            jSONObject.put("receipt", strEncodeToString);
            a(jSONObject);
        } catch (Exception e2) {
            za.b("", e2);
        }
    }

    public final void a(String eventLabel, Analytics.LevelType type, int i2, int i3, String description, long j) {
        Intrinsics.f(eventLabel, "eventLabel");
        Intrinsics.f(type, "type");
        Intrinsics.f(description, "description");
        try {
            if (!a()) {
                za.b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            if (eventLabel.length() == 0) {
                za.b("Invalid value: event label cannot be empty or null", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i2 >= 0 && i3 >= 0) {
                if (description.length() == 0) {
                    za.b("Invalid value: description cannot be empty or null", (Throwable) null, 2, (Object) null);
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_label", eventLabel);
                jSONObject.put("event_field", type.getLevelType());
                jSONObject.put("main_level", i2);
                jSONObject.put("sub_level", i3);
                jSONObject.put("description", description);
                jSONObject.put("timestamp", j);
                jSONObject.put("data_type", "level_info");
                jSONArray.put(jSONObject);
                a(jSONArray);
                return;
            }
            za.b("Invalid value: Level number should be > 0", (Throwable) null, 2, (Object) null);
        } catch (Exception e2) {
            za.b("", e2);
        }
    }

    public final float a(String str) {
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str);
            matcher.find();
            String strGroup = matcher.group();
            if (TextUtils.isEmpty(strGroup)) {
                za.b("Invalid price object", (Throwable) null, 2, (Object) null);
                return -1.0f;
            }
            Intrinsics.c(strGroup);
            return Float.parseFloat(strGroup);
        } catch (IllegalStateException e2) {
            za.b("Invalid price object", e2);
            return -1.0f;
        }
    }
}
