package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class je implements CookieStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieStore f41142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f41143b;

    public je(Context context) {
        HttpCookie httpCookie;
        vf vfVar = new vf(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f41143b = vfVar;
        this.f41142a = new CookieManager().getCookieStore();
        String string = vfVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.f41143b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) JsonParser.fromJson(string2, HttpCookie.class)) != null) {
                    if (httpCookie.hasExpired()) {
                        uf ufVarEdit = this.f41143b.edit();
                        StringBuilder sb = new StringBuilder("cookie_");
                        sb.append(httpCookie.getDomain() + "_" + httpCookie.getName());
                        ufVarEdit.remove(sb.toString());
                        ufVarEdit.apply();
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f41142a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        uf ufVarEdit = this.f41143b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f41142a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + "_" + httpCookie.getName());
        }
        String strJoin = TextUtils.join(";", hashSet);
        ufVarEdit.a("names", strJoin);
        ufVarEdit.f41545a.putString("names", strJoin);
        ufVarEdit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getDomain() + "_" + httpCookie.getName();
        this.f41142a.add(uri, httpCookie);
        uf ufVarEdit = this.f41143b.edit();
        String strC = android.support.v4.media.a.C("cookie_", str);
        String json = JsonParser.toJson(httpCookie);
        ufVarEdit.a(strC, json);
        ufVarEdit.f41545a.putString(strC, json);
        ufVarEdit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return this.f41142a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return this.f41142a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return this.f41142a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f41142a.remove(uri, httpCookie)) {
            return false;
        }
        uf ufVarEdit = this.f41143b.edit();
        StringBuilder sb = new StringBuilder("cookie_");
        sb.append(httpCookie.getDomain() + "_" + httpCookie.getName());
        ufVarEdit.remove(sb.toString());
        ufVarEdit.apply();
        a();
        return true;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (!this.f41142a.removeAll()) {
            return false;
        }
        uf ufVarEdit = this.f41143b.edit();
        ufVarEdit.clear();
        ufVarEdit.apply();
        a();
        return true;
    }
}
