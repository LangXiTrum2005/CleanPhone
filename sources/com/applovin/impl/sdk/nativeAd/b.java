package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import b2.o;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.k6;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b extends k5 implements a.InterfaceC0017a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f9564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f9565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9568k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f9569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f9571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f9572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r7 f9573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f9574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f9575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f9576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f9577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f9578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f9579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f9580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f9581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f9582z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, l lVar) {
        super("TaskRenderNativeAd", lVar);
        this.f9567j = "";
        this.f9568k = "";
        this.l = "";
        this.f9569m = null;
        this.f9570n = "";
        this.f9571o = null;
        this.f9572p = null;
        this.f9574r = null;
        this.f9575s = null;
        this.f9576t = null;
        this.f9577u = null;
        this.f9578v = new ArrayList();
        this.f9579w = new ArrayList();
        this.f9580x = new ArrayList();
        this.f9581y = new ArrayList();
        this.f9582z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f9564g = jSONObject;
        this.f9565h = jSONObject2;
        this.f9566i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f9576t = Uri.parse(string);
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Processed click destination URL: " + this.f9576t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f9577u = Uri.parse(string2);
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Processed click destination backup URL: " + this.f9577u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f9564g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f8297a.a(z4.S2)).booleanValue()) {
                try {
                    this.f9578v.addAll(JsonUtils.toList(jSONArray));
                    if (p.a()) {
                        this.f8299c.a(this.f8298b, "Processed click tracking URLs: " + this.f9578v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (p.a()) {
                        this.f8299c.a(this.f8298b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f9580x.add(new e.a(this.f8297a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Processed click tracking requests: " + this.f9580x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f9566i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (p.a()) {
                this.f8299c.a(this.f8298b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f8297a.E().a(this.f8298b, "prepareNativeComponents", th2);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new o(9, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f9564g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f8297a.a(z4.R2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (p.a()) {
            this.f8299c.a(this.f8298b, "VAST ad rendered successfully");
        }
        this.f9573q = (r7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (p.a()) {
            this.f8299c.b(this.f8298b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.f9564g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f9574r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f9564g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f9575s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9564g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (p.a()) {
                this.f8299c.b(this.f8298b, "No oRtb response provided: " + this.f9564g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, X3.i.X, (JSONObject) null);
        if (p.a()) {
            defpackage.e.A("Rendering native ad for oRTB version: ", string3, this.f8299c, this.f8298b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, IronSourceConstants.EVENTS_NATIVE, jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (p.a()) {
                this.f8299c.b(this.f8298b, "Unable to retrieve assets - failing ad load: " + this.f9564g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f9567j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", null);
                if (p.a()) {
                    defpackage.e.C(new StringBuilder("Processed title: "), this.f9567j, this.f8299c, this.f8298b);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i12 == 1 || 3 == i11) {
                    this.f9571o = Uri.parse(string4);
                    if (p.a()) {
                        this.f8299c.a(this.f8298b, "Processed icon URL: " + this.f9571o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f9572p = Uri.parse(string4);
                    if (p.a()) {
                        this.f8299c.a(this.f8298b, "Processed main image URL: " + this.f9572p);
                    }
                } else {
                    if (p.a()) {
                        this.f8299c.k(this.f8298b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (p.a()) {
                            this.f8299c.k(this.f8298b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (p.a()) {
                            this.f8299c.a(this.f8298b, l1.d.f("Inferring main image from ", i13, "x", i14, "..."));
                        }
                        this.f9572p = Uri.parse(string4);
                    } else {
                        if (p.a()) {
                            this.f8299c.a(this.f8298b, l1.d.f("Inferring icon image from ", i13, "x", i14, "..."));
                        }
                        this.f9571o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (p.a()) {
                        this.f8299c.a(this.f8298b, "Processed VAST video");
                    }
                } else if (p.a()) {
                    this.f8299c.k(this.f8298b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, X3.i.X, null);
                if (i16 == 1 || i15 == 8) {
                    this.f9568k = string6;
                    if (p.a()) {
                        defpackage.e.C(new StringBuilder("Processed advertiser: "), this.f9568k, this.f8299c, this.f8298b);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.l = string6;
                    if (p.a()) {
                        defpackage.e.C(new StringBuilder("Processed body: "), this.l, this.f8299c, this.f8298b);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f9570n = string6;
                    if (p.a()) {
                        defpackage.e.C(new StringBuilder("Processed cta: "), this.f9570n, this.f8299c, this.f8298b);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = q7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f9569m = Double.valueOf(dA);
                        if (p.a()) {
                            this.f8299c.a(this.f8298b, "Processed star rating: " + this.f9569m);
                        }
                    } else if (p.a()) {
                        defpackage.e.A("Received invalid star rating: ", string6, this.f8299c, this.f8298b);
                    }
                } else if (p.a()) {
                    this.f8299c.k(this.f8298b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (p.a()) {
                this.f8299c.b(this.f8298b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f9579w.add(string7);
            if (p.a()) {
                defpackage.e.A("Processed jstracker: ", string7, this.f8299c, this.f8298b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i17 = 0; i17 < jSONArray2.length(); i17++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f9581y.add(new e.a(this.f8297a).b(str2).b(false).a(false).h(f()).a());
                        if (p.a()) {
                            this.f8299c.a(this.f8298b, "Processed imptracker URL: ".concat(str2));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r3);
                int i19 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r3);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f9579w.add(string8);
                        } else {
                            e eVarB = new e.a(this.f8297a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f9581y.add(eVarB);
                                if (p.a()) {
                                    defpackage.e.A("Processed impression URL: ", string8, this.f8299c, this.f8298b);
                                }
                            } else if (i19 == 2) {
                                this.f9582z.add(eVarB);
                                if (p.a()) {
                                    defpackage.e.A("Processed viewable MRC50 URL: ", string8, this.f8299c, this.f8298b);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarB);
                                if (p.a()) {
                                    defpackage.e.A("Processed viewable MRC100 URL: ", string8, this.f8299c, this.f8298b);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarB);
                                if (p.a()) {
                                    defpackage.e.A("Processed viewable video 50 URL: ", string8, this.f8299c, this.f8298b);
                                }
                            } else if (i19 == 555) {
                                if (p.a()) {
                                    defpackage.e.A("Ignoring processing of OMID URL: ", string8, this.f8299c, this.f8298b);
                                }
                            } else if (p.a()) {
                                this.f8299c.b(this.f8298b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (p.a()) {
                        this.f8299c.b(this.f8298b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r3 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Processing VAST video...");
        }
        this.f8297a.s0().a(k6.a(str, JsonUtils.shallowCopy(this.f9564g), JsonUtils.shallowCopy(this.f9565h), this, this.f8297a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f9564g), JsonUtils.shallowCopy(this.f9565h), this.f8297a).setTitle(this.f9567j).setAdvertiser(this.f9568k).setBody(this.l).setCallToAction(this.f9570n).setStarRating(this.f9569m).setIconUri(this.f9571o).setMainImageUri(this.f9572p).setPrivacyIconUri(this.f9574r).setVastAd(this.f9573q).setPrivacyDestinationUri(this.f9575s).setClickDestinationUri(this.f9576t).setClickDestinationBackupUri(this.f9577u).setClickTrackingUrls(this.f9578v).setJsTrackers(this.f9579w).setClickTrackingRequests(this.f9580x).setImpressionRequests(this.f9581y).setViewableMRC50Requests(this.f9582z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f8297a.s0().a((k5) new a(appLovinNativeAdImplBuild, this.f8297a, this), f6.b.CORE);
    }

    private void b(String str) {
        this.f9566i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0017a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8299c.a(this.f8298b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
