package com.smartdigimkt.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.toponad.Omid;
import com.iab.omid.library.toponad.ScriptInjector;
import com.iab.omid.library.toponad.adsession.AdSession;
import com.iab.omid.library.toponad.adsession.AdSessionConfiguration;
import com.iab.omid.library.toponad.adsession.AdSessionContext;
import com.iab.omid.library.toponad.adsession.CreativeType;
import com.iab.omid.library.toponad.adsession.ImpressionType;
import com.iab.omid.library.toponad.adsession.Owner;
import com.iab.omid.library.toponad.adsession.Partner;
import com.iab.omid.library.toponad.adsession.VerificationScriptResource;
import com.smartdigimkt.w6.f;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33571a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33572b = "topon-omid-v2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33573c = "Toponad";
    private static final String d = "[AT H5 JS CONTENT]";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33574e = "[AT VERIFICATION URL]";
    private static final String f = "[AT VERIFICATION PARAMS]";
    private static final String g = "vk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f33575h = "jr";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33576i = "vp";

    public static String a(String str, f fVar, com.smartdigimkt.v6.a aVar) {
        JSONArray jSONArrayR;
        if (!TextUtils.isEmpty(str)) {
            String strD = com.smartdigimkt.j5.c.a().d();
            if (!TextUtils.isEmpty(strD)) {
                try {
                    String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(strD, str);
                    if (fVar != null && (jSONArrayR = fVar.R()) != null && jSONArrayR.length() != 0) {
                        String strOptString = "";
                        String strOptString2 = strOptString;
                        for (int i2 = 0; i2 < jSONArrayR.length(); i2++) {
                            try {
                                JSONObject jSONObject = jSONArrayR.getJSONObject(i2);
                                if (TextUtils.equals(f33572b, jSONObject.getString(g))) {
                                    strOptString = jSONObject.optString(f33575h, "");
                                    strOptString2 = jSONObject.optString(f33576i, "");
                                }
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(strOptString)) {
                            com.smartdigimkt.n8.d.d(f33571a, "verificationUrl is empty,no need to inject");
                        } else {
                            String strE = com.smartdigimkt.j5.c.a().e();
                            if (!TextUtils.isEmpty(strE)) {
                                if (com.smartdigimkt.m6.b.p().D()) {
                                    com.smartdigimkt.n8.d.d(f33571a, "Offer Html Contain MACRO_INSERT_WEBVIEW_CONTENT [AT H5 JS CONTENT]:" + strInjectScriptContentIntoHtml.contains(d));
                                }
                                String strReplace = strInjectScriptContentIntoHtml.replace(d, strE);
                                if (com.smartdigimkt.m6.b.p().D()) {
                                    com.smartdigimkt.n8.d.d(f33571a, "Offer Html Contain MACRO_INSERT_VERIFICATION_URL [AT VERIFICATION URL]:" + strReplace.contains(f33574e));
                                }
                                if (!TextUtils.isEmpty(strOptString)) {
                                    strReplace = strReplace.replace(f33574e, strOptString);
                                }
                                if (com.smartdigimkt.m6.b.p().D()) {
                                    com.smartdigimkt.n8.d.d(f33571a, "Offer Html Contain MACRO_INSERT_VERIFICATION_PARAMS [AT VERIFICATION PARAMS]:" + strReplace.contains(f));
                                }
                                return strReplace.replace(f, strOptString2);
                            }
                        }
                    }
                    return strInjectScriptContentIntoHtml;
                } catch (Throwable th2) {
                    th2.getMessage();
                    com.smartdigimkt.i7.d.a("Omsdk Exception", androidx.datastore.preferences.protobuf.a.o(th2, new StringBuilder("injectScriptContentIntoHtml fail with throwable:")), com.smartdigimkt.m6.b.p().q());
                    return str;
                }
            }
        }
        return str;
    }

    public static com.smartdigimkt.k5.b a(Context context, boolean z2, f fVar, com.smartdigimkt.v6.a aVar) {
        String strK0;
        JSONArray jSONArrayR;
        String strD = com.smartdigimkt.j5.c.a().d();
        b bVar = null;
        if (TextUtils.isEmpty(strD)) {
            com.smartdigimkt.i7.d.a(aVar, fVar, a(), z2 ? "3" : "2", false, "3", "");
            return null;
        }
        String str = "";
        if (fVar == null) {
            strK0 = "";
            jSONArrayR = null;
        } else {
            jSONArrayR = fVar.R();
            strK0 = fVar.k0();
        }
        if (jSONArrayR != null && jSONArrayR.length() != 0) {
            try {
                a(context);
                Partner partnerCreatePartner = Partner.createPartner(f33573c, com.smartdigimkt.n8.f.a());
                CreativeType creativeType = z2 ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                Owner owner = Owner.NATIVE;
                AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z2 ? owner : Owner.NONE, false);
                if (aVar != null) {
                    str = aVar.f;
                }
                List<VerificationScriptResource> listA = a(jSONArrayR);
                if (TextUtils.isEmpty(strK0)) {
                    strK0 = null;
                }
                b bVar2 = new b(AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, strD, listA, strK0, str)), z2);
                try {
                    com.smartdigimkt.i7.d.a(aVar, fVar, a(), z2 ? "3" : "2");
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    th.getMessage();
                    com.smartdigimkt.i7.d.a(aVar, fVar, a(), z2 ? "3" : "2", false, "4", th.getMessage());
                    return bVar;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return bVar;
    }

    public static com.smartdigimkt.k5.b a(Context context, WebView webView, f fVar, com.smartdigimkt.v6.a aVar) {
        f fVar2;
        com.smartdigimkt.v6.a aVar2;
        b bVar = null;
        if (TextUtils.isEmpty(com.smartdigimkt.j5.c.a().d())) {
            com.smartdigimkt.i7.d.a(aVar, fVar, a(), "1", false, "3", "");
            return null;
        }
        try {
            a(context);
            b bVar2 = new b(AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(f33573c, com.smartdigimkt.n8.f.a()), webView, null, null)), false);
            try {
                fVar2 = fVar;
                aVar2 = aVar;
                try {
                    com.smartdigimkt.i7.d.a(aVar2, fVar2, a(), "1");
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    th.getMessage();
                    com.smartdigimkt.i7.d.a(aVar2, fVar2, a(), "1", false, "4", th.getMessage());
                    return bVar;
                }
            } catch (Throwable th2) {
                th = th2;
                fVar2 = fVar;
                aVar2 = aVar;
            }
        } catch (Throwable th3) {
            th = th3;
            fVar2 = fVar;
            aVar2 = aVar;
        }
    }

    private static void a(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    private static List<VerificationScriptResource> a(JSONArray jSONArray) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        String strOptString = jSONObjectOptJSONObject.optString(g, "");
                        String strOptString2 = jSONObjectOptJSONObject.optString(f33575h, "");
                        String strOptString3 = jSONObjectOptJSONObject.optString(f33576i, "");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            URL url = new URL(strOptString2);
                            if (TextUtils.isEmpty(strOptString3)) {
                                verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            } else {
                                verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString, url, strOptString3);
                            }
                            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th.getMessage();
                    com.smartdigimkt.i7.d.a("Omsdk Exception", androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("getMeasureResource fail:")), com.smartdigimkt.m6.b.p().q());
                }
            }
        }
        return arrayList;
    }

    private static String a() {
        try {
            return Omid.getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }
}
