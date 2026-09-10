package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import sg.bigo.ads.api.core.r;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f48454b = "h";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f48456c;
    private final r d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48457e;
    private final String f;
    private final String g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48459i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f48458h = {0, 30000, 300000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48455a = 0;

    private h(Map<String, String> map, r rVar, int i2, String str, String str2, String str3) {
        this.f48456c = map;
        this.d = rVar;
        this.f48457e = str;
        this.f = str2;
        this.g = str3;
        this.f48459i = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (str == null || str.length() < 40) {
            return str;
        }
        return str.substring(0, 20) + "..." + str.substring(str.length() - 10);
    }

    public static /* synthetic */ void b(h hVar, Context context) {
        if (TextUtils.equals("va_show", hVar.f48457e) || TextUtils.equals("va_cli", hVar.f48457e) || TextUtils.equals("va_cpn_imp", hVar.f48457e) || TextUtils.equals("va_cpn_cli", hVar.f48457e)) {
            int i2 = hVar.f48455a + 1;
            hVar.f48455a = i2;
            hVar.a(context, i2);
        }
    }

    public static h a(Map<String, String> map, r rVar, int i2, String str, String str2, String str3) {
        return new h(map, rVar, i2, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        String str = f48454b;
        StringBuilder sb = new StringBuilder("Vast tracker request start, action: ");
        sb.append(this.f48457e);
        sb.append(", url: ");
        p005e.a.f(sb, 0, b(this.f), 3, str);
        sg.bigo.ads.core.e.b.a(context, 0, this.f48457e, new sg.bigo.ads.common.u.b.d(this.f), this.g, this.f48459i, false, this.f48455a, this.f48456c, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.h.2
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f48454b, "Vast tracker request error, action: " + h.this.f48457e + ", url: " + h.b(h.this.f));
                h.b(h.this, context);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f48454b, "Vast tracker request success, action: " + h.this.f48457e + ", url: " + h.b(h.this.f));
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i2) {
                return h.this.d != null && h.this.d.a(i2);
            }
        });
    }

    public final void a(final Context context, int i2) {
        if (i2 >= 3) {
            String str = f48454b;
            StringBuilder sb = new StringBuilder("Vast tracker retry time exceed, action: ");
            sb.append(this.f48457e);
            sb.append(", url: ");
            p005e.a.f(sb, 0, b(this.f), 3, str);
            return;
        }
        int[] iArr = this.f48458h;
        int i3 = iArr[i2 % iArr.length];
        if (i3 <= 0) {
            a(context);
            return;
        }
        String str2 = f48454b;
        StringBuilder sbU = android.support.v4.media.a.u(i3, "Vast tracker retry after ", " ms, action: ");
        sbU.append(this.f48457e);
        sbU.append(", url: ");
        sbU.append(b(this.f));
        sg.bigo.ads.common.t.a.a(0, 3, str2, sbU.toString());
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.h.1
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(context);
            }
        }, i3);
    }
}
