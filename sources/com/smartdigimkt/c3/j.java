package com.smartdigimkt.c3;

import android.text.TextUtils;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.z;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34118b = "HTMLResourceManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34119c = 259200000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34120a;

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
            com.smartdigimkt.v0.p.a(j.this.f34120a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static j f34121a = new j(null);

        private b() {
        }
    }

    public /* synthetic */ j(a aVar) {
        this();
    }

    public static j b() {
        return b.f34121a;
    }

    public void c() {
        this.f34120a = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_HTML);
    }

    private j() {
        c();
    }

    public void a() {
        try {
            if (TextUtils.isEmpty(this.f34120a)) {
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
            String str2 = this.f34120a + "/" + s.a(z.b(str)) + ".html";
            if (!new File(str2).exists()) {
                return null;
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return this.f34120a + "/" + s.a(z.b(str)) + ".html";
    }

    public boolean a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f34120a);
            sb.append("/");
            sb.append(s.a(z.b(str)));
            sb.append(".html");
            return new File(sb.toString()).exists();
        } catch (Exception e2) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            e2.printStackTrace();
            return false;
        }
    }

    public String a(String str) {
        try {
            File file = new File(this.f34120a + "/" + s.a(z.b(str)) + ".html");
            if (file.length() > 0) {
                return com.smartdigimkt.v0.p.e(file);
            }
            return null;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
