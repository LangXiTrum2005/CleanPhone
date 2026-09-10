package com.smartdigimkt.g5;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.sdk.basead.mraid.MraidBaseWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Handler.Callback {
    Context X;
    MraidBaseWebView Z;
    protected Pattern e0;
    protected String f0;
    List<String> g0 = new ArrayList(Arrays.asList(MRAIDPresenter.OPEN, "close", "unload", "useCustomClose", "expand"));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    Handler f35442Y = new Handler(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: com.smartdigimkt.g5.a$a, reason: collision with other inner class name */
    public class C0492a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f35443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f35445c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f35446e;
        public String f;

        public C0492a() {
        }
    }

    public a(Context context) {
        this.X = context;
    }

    public void a(Pattern pattern) {
        this.e0 = pattern;
    }

    public C0492a b(String str) {
        if (str == null) {
            return null;
        }
        C0492a c0492a = new C0492a();
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains("mraid")) {
            return null;
        }
        String host = uri.getHost();
        c0492a.f35445c = host;
        if (!this.g0.contains(host) && this.Z != null) {
            com.smartdigimkt.s4.a.a().b(this.Z, host);
            com.smartdigimkt.s4.a.a().a(this.Z, host, "Specified command is not implemented");
            return null;
        }
        Set<String> setA = a(uri);
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : setA) {
                jSONObject.put(str2, uri.getQueryParameter(str2));
            }
            c0492a.d = jSONObject.toString();
            return c0492a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return c0492a;
        }
    }

    public boolean c(String str) {
        if (!com.smartdigimkt.v4.d.f(str)) {
            return false;
        }
        a(com.smartdigimkt.v4.d.c(str));
        d(str);
        return true;
    }

    public void d(String str) {
        this.f0 = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public void a(MraidBaseWebView mraidBaseWebView) {
        this.Z = mraidBaseWebView;
    }

    public String a() {
        return this.f0;
    }

    public void a(String str) {
        C0492a c0492aB;
        if (TextUtils.isEmpty(str) || (c0492aB = b(str)) == null) {
            return;
        }
        a(c0492aB);
    }

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

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(C0492a c0492a) {
        byte b2;
        Object jsObject = this.Z.getJsObject(c0492a.f35444b);
        if (jsObject == null) {
            return;
        }
        try {
            if (jsObject instanceof h) {
                String str = c0492a.f35445c;
                switch (str.hashCode()) {
                    case -1289167206:
                        if (!str.equals("expand")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case -840442113:
                        if (!str.equals("unload")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 3417674:
                        if (!str.equals(MRAIDPresenter.OPEN)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 94756344:
                        if (!str.equals("close")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1614272768:
                        if (!str.equals("useCustomClose")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                String str2 = JsonUtils.EMPTY_JSON;
                if (b2 == 0) {
                    h hVar = (h) jsObject;
                    if (!TextUtils.isEmpty(c0492a.d)) {
                        str2 = c0492a.d;
                    }
                    hVar.c(str2);
                    return;
                }
                if (b2 == 1) {
                    h hVar2 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0492a.d)) {
                        str2 = c0492a.d;
                    }
                    hVar2.a(str2);
                    return;
                }
                if (b2 == 2) {
                    h hVar3 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0492a.d)) {
                        str2 = c0492a.d;
                    }
                    hVar3.e(str2);
                    return;
                }
                if (b2 == 3) {
                    h hVar4 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0492a.d)) {
                        str2 = c0492a.d;
                    }
                    hVar4.f(str2);
                    return;
                }
                if (b2 != 4) {
                    return;
                }
                h hVar5 = (h) jsObject;
                if (!TextUtils.isEmpty(c0492a.d)) {
                    str2 = c0492a.d;
                }
                hVar5.b(str2);
            }
        } catch (Throwable unused) {
        }
    }
}
