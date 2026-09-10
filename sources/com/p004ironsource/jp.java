package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class jp {
    public static final String d = "Ironsrc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25437e = "7";
    public static final String f = Omid.getVersion();
    public static final String g = "omidVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25438h = "omidPartnerName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f25439i = "omidPartnerVersion";
    public static final String j = "omidActiveAdSessions";
    private static final String k = "Invalid OMID impressionOwner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f25440l = "Invalid OMID videoEventsOwner";
    private static final String m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f25441n = "Missing OMID videoEventsOwner";
    private static final String o = "OMID has not been activated";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f25442p = "Missing OMID creativeType";
    private static final String q = "Missing adview id in OMID params";
    private static final String r = "No adview found with the provided adViewId";
    private static final String s = "OMID Session has already started";
    private static final String t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Partner f25443a = Partner.createPartner(d, "7");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25445c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f25444b = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f25446i = "isolateVerificationScripts";
        private static final String j = "impressionOwner";
        private static final String k = "videoEventsOwner";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f25447l = "customReferenceData";
        private static final String m = "creativeType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f25448n = "impressionType";
        public static final String o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f25449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Owner f25450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Owner f25451c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImpressionType f25452e;
        public CreativeType f;
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Owner f25453h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f25449a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(jp.m);
            }
            try {
                aVar.f25450b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(jp.f25441n);
                }
                try {
                    aVar.f25451c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.f25452e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.f25453h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e2) {
                    q9.d().a(e2);
                    throw new IllegalArgumentException(android.support.v4.media.a.C("Invalid OMID videoEventsOwner ", strOptString2));
                }
            } catch (IllegalArgumentException e3) {
                q9.d().a(e3);
                throw new IllegalArgumentException(android.support.v4.media.a.C("Invalid OMID impressionOwner ", strOptString));
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(android.support.v4.media.a.C(jp.f25442p, strOptString));
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.a.C(jp.f25442p, strOptString));
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(android.support.v4.media.a.C(jp.f25442p, strOptString));
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.a.C(jp.f25442p, strOptString));
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e2) {
                q9.d().a(e2);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(android.support.v4.media.a.C(jp.q, strOptString));
            }
            return strOptString;
        }
    }

    private AdSession a(a aVar, di diVar) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.f25452e, aVar.f25450b, aVar.f25451c, aVar.f25449a), AdSessionContext.createHtmlAdSessionContext(this.f25443a, diVar.getPresentingView(), null, aVar.d));
        adSessionCreateAdSession.registerAdView(diVar.getPresentingView());
        return adSessionCreateAdSession;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f25444b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(t);
        }
        adSession.finish();
        this.f25444b.remove(strOptString);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f25444b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public is a() {
        is isVar = new is();
        isVar.b(g, SDKUtils.encodeString(f));
        isVar.b(f25438h, SDKUtils.encodeString(d));
        isVar.b(f25439i, SDKUtils.encodeString("7"));
        isVar.b(j, SDKUtils.encodeString(Arrays.toString(this.f25444b.keySet().toArray())));
        return isVar;
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f25445c) {
            return;
        }
        Omid.activate(context);
        this.f25445c = true;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.f25445c) {
            throw new IllegalStateException(o);
        }
        if (TextUtils.isEmpty(aVar.g)) {
            throw new IllegalStateException(q);
        }
        String str = aVar.g;
        if (this.f25444b.containsKey(str)) {
            throw new IllegalStateException(s);
        }
        di diVarA = jh.a().a(str);
        if (diVarA == null) {
            throw new IllegalStateException(r);
        }
        AdSession adSessionA = a(aVar, diVarA);
        adSessionA.start();
        this.f25444b.put(str, adSessionA);
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f25445c) {
            throw new IllegalStateException(o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(t);
        }
    }
}
