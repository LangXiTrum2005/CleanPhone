package com.adcolony.sdk;

import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<f1> f8915a = androidx.media3.extractor.text.ttml.a.u();

    public static void a(f1 f1Var) {
        List<f1> list = f8915a;
        synchronized (list) {
            try {
                if (200 > list.size()) {
                    list.add(f1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b() {
        k kVarB = a.b();
        if (kVarB.v().equals("") || !kVarB.I()) {
            return;
        }
        List<f1> list = f8915a;
        synchronized (list) {
            try {
                Iterator<f1> it = list.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                f8915a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(f1 f1Var) {
        f1 f1VarF = c0.f(f1Var, "payload");
        if (l.H) {
            c0.a(f1VarF, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            c0.a(f1VarF, "api_key", a.b().v());
        }
        try {
            f1Var.r("payload");
            f1Var.a("payload", f1VarF);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void d(f1 f1Var) {
        c0.a(f1Var, "timezone", TimeZone.getDefault().getID());
        c0.a(f1Var, "action_time", String.valueOf(Math.round(System.currentTimeMillis() / 1000)));
    }

    public static void logAchievementUnlocked(String str) {
        if (a(str, "logAchievementUnlocked")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("description", str);
        logEvent("achievement_unlocked", map);
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent("ad_impression");
    }

    public static void logAddToCart(String str) {
        HashMap map = new HashMap();
        map.put("item_id", str);
        logEvent("add_to_cart", map);
    }

    public static void logAddToWishlist(String str) {
        HashMap map = new HashMap();
        map.put("item_id", str);
        logEvent("add_to_wishlist", map);
    }

    public static void logAppOpen() {
        logEvent("app_open");
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap map = new HashMap();
        map.put("content_id", str);
        map.put("content_type", str2);
        logEvent("content_view", map);
    }

    public static void logCreditsSpent(String str, Integer num, Double d, String str2) {
        if (str2 != null && str2.length() != 3) {
            new e0.a().a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").a(e0.f9131h);
            return;
        }
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("name", str);
        mapS.put("quantity", String.valueOf(num));
        mapS.put("value", String.valueOf(d));
        mapS.put("currency_code", str2);
        logEvent("credits_spent", mapS);
    }

    public static void logCustomEvent(String str, String str2) {
        if (a(str2, "logCustomEvent")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("event", str);
        map.put("description", str2);
        logEvent("custom_event", map);
    }

    public static void logEvent(String str) {
        logEvent(str, null);
    }

    public static void logInvite() {
        logEvent(AppLovinEventTypes.USER_SENT_INVITATION);
    }

    public static void logLevelAchieved(Integer num) {
        HashMap map = new HashMap();
        map.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", map);
    }

    public static void logLogin(String str) {
        HashMap map = new HashMap();
        map.put("method", str);
        logEvent(AppLovinEventTypes.USER_LOGGED_IN, map);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (a(str2, "logRegistrationCompleted")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("method", str);
        map.put("description", str2);
        logEvent("registration_completed", map);
    }

    public static void logReservation() {
        logEvent(AppLovinEventTypes.USER_CREATED_RESERVATION);
    }

    public static void logSearch(String str) {
        if (str != null && str.length() > 512) {
            new e0.a().a("logSearch searchString cannot exceed 512 characters. Event will ").a("not be sent.").a(e0.f9131h);
            return;
        }
        HashMap map = new HashMap();
        map.put("search_string", str);
        logEvent(AppLovinEventTypes.USER_EXECUTED_SEARCH, map);
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (a(str2, "logSocialSharingEvent")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("network", str);
        map.put("description", str2);
        logEvent("social_sharing_event", map);
    }

    public static void logTransaction(String str, Integer num, Double d, String str2, String str3, String str4, String str5) {
        if (a(str5, "logTransaction")) {
            return;
        }
        if (str2 != null && str2.length() != 3) {
            new e0.a().a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").a(e0.f9131h);
            return;
        }
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("item_id", str);
        mapS.put("quantity", String.valueOf(num));
        mapS.put("price", String.valueOf(d));
        mapS.put("currency_code", str2);
        mapS.put("receipt", str3);
        mapS.put(d9.h.f24716U, str4);
        mapS.put("description", str5);
        logEvent("transaction", mapS);
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logEvent(String str, HashMap<String, String> map) {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, com.smartdigimkt.q0.b.S0, str);
        f1 f1VarB2 = c0.b();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().equals(AbstractJsonLexerKt.NULL)) {
                    c0.a(f1VarB2, entry.getKey(), entry.getValue());
                }
            }
        }
        d(f1VarB2);
        c0.a(f1VarB, "payload", f1VarB2);
        b(f1VarB);
    }

    public static boolean a() {
        boolean z2;
        List<f1> list = f8915a;
        synchronized (list) {
            z2 = list.size() != 0;
        }
        return z2;
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new e0.a().a("Description of event ").a(str2).a(" must be less").a(" than 512 characters").a(e0.f9131h);
        return true;
    }

    private static void b(f1 f1Var) {
        k kVarB = a.b();
        if (!kVarB.v().equals("") && kVarB.I()) {
            c(f1Var);
            new h0("AdColony.log_event", 1, f1Var).c();
        } else {
            a(f1Var);
        }
    }
}
