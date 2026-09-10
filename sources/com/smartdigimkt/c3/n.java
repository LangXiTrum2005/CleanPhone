package com.smartdigimkt.c3;

import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.z;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f34127b = "ResourceManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34128c = "foldername";
    public static final String d = "md5filename";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34129e = "nc";
    public static final int f = 259200000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34130a;

    public class a extends com.smartdigimkt.s0.a {
        public a() {
        }

        @Override // com.smartdigimkt.s0.a
        public void a(boolean z2) {
        }

        @Override // com.smartdigimkt.s0.a
        public void c() {
        }

        @Override // com.smartdigimkt.s0.a
        public void f() {
            com.smartdigimkt.v0.p.a(n.this.f34130a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static n f34131a = new n(null);

        private b() {
        }
    }

    public /* synthetic */ n(a aVar) {
        this();
    }

    public static n b() {
        return b.f34131a;
    }

    public void c() {
        this.f34130a = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_RES);
    }

    private n() {
        c();
    }

    public void a() {
        try {
            if (TextUtils.isEmpty(this.f34130a)) {
                return;
            }
            h.a().a(new a());
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return this.f34130a + "/" + s.a(z.b(str)) + ".zip";
        } catch (Throwable unused) {
            return "";
        }
    }

    public synchronized String a(String str, String str2) {
        String message;
        String strA;
        message = "unknow exception ";
        try {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(str2);
                    if (file.exists()) {
                        Uri uri = Uri.parse(str);
                        List<String> queryParameters = uri.getQueryParameters("nc");
                        if (queryParameters != null && queryParameters.size() != 0) {
                            strA = a(str, str2, file);
                        } else {
                            List<String> queryParameters2 = uri.getQueryParameters("md5filename");
                            if (queryParameters2 != null && queryParameters2.size() > 0) {
                                String str3 = queryParameters2.get(0);
                                if (!TextUtils.isEmpty(str3) && str3.equals(com.smartdigimkt.v0.o.b(file))) {
                                    strA = a(str, str2, file);
                                }
                            }
                        }
                        message = strA;
                    }
                    if (!TextUtils.isEmpty(message)) {
                        com.smartdigimkt.v0.p.a(file);
                    }
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
                message = e2.getMessage();
            }
        } catch (Throwable th) {
            throw th;
        }
        return message;
    }

    private String a(String str, String str2, File file) {
        String strC = com.smartdigimkt.v0.p.c(str2, this.f34130a + "/" + s.a(z.b(str)));
        return TextUtils.isEmpty(strC) ? com.smartdigimkt.v0.p.a(file) : strC;
    }

    public String a(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.f34130a + "/" + s.a(z.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!com.smartdigimkt.v0.p.f(str5)) {
                return null;
            }
            try {
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                str2 = "?" + strSubstring;
            }
            return AdPayload.FILE_SCHEME + str5 + str2;
        } catch (Exception e2) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }
}
