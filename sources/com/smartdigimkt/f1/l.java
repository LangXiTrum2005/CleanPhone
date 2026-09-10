package com.smartdigimkt.f1;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class l implements com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34992b = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34993c = 7;
    public static final int d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f34994e = "CustomInfoManager";
    private static volatile l f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f34995a = new ConcurrentHashMap<>();

    private l() {
    }

    public static l a() {
        if (f == null) {
            synchronized (l.class) {
                try {
                    if (f == null) {
                        f = new l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void a(String str, int i2, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String strC = com.smartdigimkt.r4.a.c(str2);
        if (i2 == 6) {
            this.f34995a.put(str + "_bid", strC);
            return;
        }
        if (i2 != 7) {
            if (i2 != 8) {
                return;
            }
            this.f34995a.put(str, strC);
        } else {
            this.f34995a.put(str + "_bidload", strC);
        }
    }

    private String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i2 == 6) {
            return this.f34995a.get(str + "_bid");
        }
        if (i2 != 7) {
            return i2 != 8 ? "" : this.f34995a.get(str);
        }
        return this.f34995a.get(str + "_bidload");
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str2);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("bid")) {
                    return a(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains("hb") && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return a(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains(com.smartdigimkt.b0.a.k)) {
                    return a(str, 8);
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
