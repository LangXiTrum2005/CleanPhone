package com.ironsource;

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
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Gc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f26167d = "Ironsrc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f26168e = "7";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f26169f = Omid.getVersion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f26170g = "omidVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26171h = "omidPartnerName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26172i = "omidPartnerVersion";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f26173j = "omidActiveAdSessions";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f26174k = "Invalid OMID impressionOwner";
    private static final String l = "Invalid OMID videoEventsOwner";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f26175m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26176n = "Missing OMID videoEventsOwner";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f26177o = "OMID has not been activated";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f26178p = "Missing OMID creativeType";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f26179q = "Missing adview id in OMID params";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f26180r = "No adview found with the provided adViewId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f26181s = "OMID Session has already started";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f26182t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Partner f26183a = Partner.createPartner(f26167d, f26168e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26185c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f26184b = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26186i = "isolateVerificationScripts";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26187j = "impressionOwner";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26188k = "videoEventsOwner";
        private static final String l = "customReferenceData";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26189m = "creativeType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f26190n = "impressionType";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f26191o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Owner f26193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Owner f26194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImpressionType f26196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CreativeType f26197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f26198g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Owner f26199h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f26192a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f26175m);
            }
            try {
                aVar.f26193b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(Gc.f26176n);
                }
                try {
                    aVar.f26194c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f26195d = jSONObject.optString("customReferenceData", "");
                    aVar.f26197f = b(jSONObject);
                    aVar.f26196e = c(jSONObject);
                    aVar.f26198g = e(jSONObject);
                    aVar.f26199h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e10) {
                    C0474n4.d().a(e10);
                    throw new IllegalArgumentException(defpackage.e.n("Invalid OMID videoEventsOwner ", strOptString2));
                }
            } catch (IllegalArgumentException e11) {
                C0474n4.d().a(e11);
                throw new IllegalArgumentException(defpackage.e.n("Invalid OMID impressionOwner ", strOptString));
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(defpackage.e.n(Gc.f26178p, strOptString));
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(defpackage.e.n(Gc.f26178p, strOptString));
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(defpackage.e.n(Gc.f26178p, strOptString));
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(defpackage.e.n(Gc.f26178p, strOptString));
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e10) {
                C0474n4.d().a(e10);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(defpackage.e.n(Gc.f26179q, strOptString));
            }
            return strOptString;
        }
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f26185c) {
            return;
        }
        Omid.activate(context);
        this.f26185c = true;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f26184b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f26182t);
        }
        adSession.finish();
        this.f26184b.remove(strOptString);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f26184b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f26182t);
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

    public C0395ie a() {
        C0395ie c0395ie = new C0395ie();
        c0395ie.b(f26170g, SDKUtils.encodeString(f26169f));
        c0395ie.b(f26171h, SDKUtils.encodeString(f26167d));
        c0395ie.b(f26172i, SDKUtils.encodeString(f26168e));
        c0395ie.b(f26173j, SDKUtils.encodeString(Arrays.toString(this.f26184b.keySet().toArray())));
        return c0395ie;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.f26185c) {
            if (!TextUtils.isEmpty(aVar.f26198g)) {
                String str = aVar.f26198g;
                if (!this.f26184b.containsKey(str)) {
                    H8 h8A = C0460m8.a().a(str);
                    if (h8A != null) {
                        AdSession adSessionA = a(aVar, h8A);
                        adSessionA.start();
                        this.f26184b.put(str, adSessionA);
                        return;
                    }
                    throw new IllegalStateException(f26180r);
                }
                throw new IllegalStateException(f26181s);
            }
            throw new IllegalStateException(f26179q);
        }
        throw new IllegalStateException(f26177o);
    }

    private AdSession a(a aVar, H8 h8) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f26197f, aVar.f26196e, aVar.f26193b, aVar.f26194c, aVar.f26192a), AdSessionContext.createHtmlAdSessionContext(this.f26183a, h8.getPresentingView(), null, aVar.f26195d));
        adSessionCreateAdSession.registerAdView(h8.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f26185c) {
            throw new IllegalStateException(f26177o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f26182t);
        }
    }
}
