package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C0869a> f48471a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C0869a> f48472b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C0869a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48475c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f48476e;

        public C0869a(String str, int i2, int i3, String str2, String str3) {
            this.f48474b = str;
            this.f48475c = i2;
            this.d = i3;
            this.f48476e = str2;
            this.f48473a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.f48474b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.f48476e) || "image/png".equalsIgnoreCase(this.f48476e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.f48476e);
        }
    }

    public final C0869a a() {
        return a(this.f48471a);
    }

    public static C0869a a(List<C0869a> list) {
        if (list == null) {
            return null;
        }
        for (C0869a c0869a : list) {
            if (c0869a != null) {
                return c0869a;
            }
        }
        return null;
    }
}
