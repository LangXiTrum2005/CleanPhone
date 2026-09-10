package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f34878a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f34879b = new ArrayList<>();

    public static com.mbridge.msdk.mbsignalcommon.windvane.a a(WindVaneWebView windVaneWebView, String str) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = new com.mbridge.msdk.mbsignalcommon.windvane.a();
        aVar.f34914d = k0.a("n+ztLkxpVTzBLkxgHN==");
        aVar.f34915e = uri.getHost();
        if (f34879b.size() == 0) {
            a();
        }
        if (!f34879b.contains(aVar.f34915e) && windVaneWebView != null) {
            a(windVaneWebView.getCampaignId(), aVar.f34915e);
            a.a().b(windVaneWebView, aVar.f34915e);
            a.a().a(windVaneWebView, aVar.f34915e, "Specified command is not implemented");
            return null;
        }
        Set<String> setA = a(uri);
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : setA) {
                jSONObject.put(str2, uri.getQueryParameter(str2));
            }
            aVar.f34916f = jSONObject.toString();
            return aVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVar;
        }
    }

    public static String b(String str) {
        if (f34878a.containsKey(str)) {
            return f34878a.get(str);
        }
        return null;
    }

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i10);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, iIndexOf2)));
            i10 = iIndexOf + 1;
        } while (i10 < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private static void a() {
        for (Method method : b.class.getDeclaredMethods()) {
            f34879b.add(method.getName());
        }
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f34878a.containsKey(str)) {
            String strConcat = f34878a.get(str);
            if (TextUtils.isEmpty(str2) || strConcat.contains(str2)) {
                return;
            }
            if (strConcat.length() > 0) {
                strConcat = strConcat.concat(",");
            }
            f34878a.put(str, strConcat.concat(str2));
            return;
        }
        f34878a.put(str, str2);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f34878a.remove(str);
    }
}
