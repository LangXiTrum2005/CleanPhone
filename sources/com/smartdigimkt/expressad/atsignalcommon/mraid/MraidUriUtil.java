package com.smartdigimkt.expressad.atsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.n.b;
import com.smartdigimkt.r4.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MraidUriUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f34693a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f34694b = new ArrayList<>();

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i2);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i2);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i2, iIndexOf2)));
            i2 = iIndexOf + 1;
        } while (i2 < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static void clearUnSupportMraidMethodMap() {
        if (f34693a.size() > 0) {
            f34693a.clear();
        }
    }

    public static b getMraidMethodContext(WindVaneWebView windVaneWebView, String str) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains("mraid")) {
            return null;
        }
        b bVar = new b();
        bVar.d = a.b("n+ztLkxpVTzBLkxgHN==");
        bVar.f36889e = uri.getHost();
        if (f34694b.size() == 0) {
            a();
        }
        if (!f34694b.contains(bVar.f36889e) && windVaneWebView != null) {
            a(windVaneWebView.getCampaignId(), bVar.f36889e);
            com.smartdigimkt.s4.a.a().b(windVaneWebView, bVar.f36889e);
            com.smartdigimkt.s4.a.a().a(windVaneWebView, bVar.f36889e, "Specified command is not implemented");
            return null;
        }
        Set<String> setA = a(uri);
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : setA) {
                jSONObject.put(str2, uri.getQueryParameter(str2));
            }
            bVar.f = jSONObject.toString();
            return bVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return bVar;
        }
    }

    public static String getUnSupportMraidMethodString(String str) {
        if (f34693a.containsKey(str)) {
            return f34693a.get(str);
        }
        return null;
    }

    public static void clearUnSupportMraidMethodMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f34693a.remove(str);
    }

    private static void a() {
        for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
            f34694b.add(method.getName());
        }
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f34693a.containsKey(str)) {
            String strConcat = f34693a.get(str);
            if (TextUtils.isEmpty(str2) || strConcat.contains(str2)) {
                return;
            }
            if (strConcat.length() > 0) {
                strConcat = strConcat.concat(",");
            }
            f34693a.put(str, strConcat.concat(str2));
            return;
        }
        f34693a.put(str, str2);
    }
}
