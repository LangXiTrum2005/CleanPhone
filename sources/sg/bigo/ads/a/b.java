package sg.bigo.ads.a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
final class b implements sg.bigo.ads.a.a.a.InterfaceC0779a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f45359c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.a.a.a f45360a = new sg.bigo.ads.a.a.a();
    private final int d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45362e = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<String> f45361b = new LinkedHashSet();
    private final HashMap<String, Long> f = new HashMap<>();
    private int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45363h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45364i = false;
    private boolean j = true;
    private boolean k = false;

    public static /* synthetic */ String a(int i2) {
        switch (i2) {
            case 1:
                return "Navigation Started";
            case 2:
                return "Navigation Finished";
            case 3:
                return "Navigation Failed";
            case 4:
                return "Navigation Aborted";
            case 5:
                return "Tab Shown";
            case 6:
                return "Tab Hidden";
            default:
                return "Unknown Event";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        final String next;
        if (!this.f45364i) {
            this.k = false;
            return;
        }
        if (!this.k) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload start.");
        }
        try {
            Iterator<String> it = this.f45361b.iterator();
            if (!it.hasNext()) {
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload stop.");
                this.k = false;
                return;
            }
            this.k = true;
            next = it.next();
            try {
                this.f45361b.remove(next);
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(next)) {
                return;
            }
            d.a(1, new Runnable() { // from class: sg.bigo.ads.a.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSession customTabsSessionA;
                    Long l2 = (Long) b.this.f.get(next);
                    if (l2 == null || SystemClock.elapsedRealtime() - l2.longValue() > 300000) {
                        Uri uri = Uri.parse(next);
                        sg.bigo.ads.a.a.a aVar = b.this.f45360a;
                        boolean zC = (aVar.f45347a == null || (customTabsSessionA = aVar.a()) == null) ? false : customTabsSessionA.c(uri, null);
                        StringBuilder sb = new StringBuilder("Preload url state: ");
                        sb.append(zC);
                        sb.append(", url: ");
                        p005e.a.f(sb, 0, next, 3, "ChromeTabsStatic");
                        if (!zC) {
                            sg.bigo.ads.core.d.b.a(3002, 10115, String.valueOf(next));
                        }
                        b.this.f.put(next, Long.valueOf(SystemClock.elapsedRealtime()));
                    } else {
                        p005e.a.f(new StringBuilder("The url that wait for preload has been preloaded before: "), 0, next, 3, "ChromeTabsStatic");
                    }
                    d.a(2, new Runnable() { // from class: sg.bigo.ads.a.b.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.e();
                        }
                    }, 200L);
                }
            });
        } catch (Exception unused2) {
            next = null;
        }
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0779a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service connected.");
        this.f45364i = true;
        this.f45363h = false;
        b();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0779a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service disconnected.");
        this.f45364i = false;
        this.f45363h = false;
    }

    public final void b() {
        if (this.k) {
            return;
        }
        e();
    }

    public static b a() {
        return f45359c;
    }

    public final boolean a(Context context) {
        String str;
        if (!this.j) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome service is unavailable.");
            return false;
        }
        boolean zA = true;
        if (this.f45364i) {
            str = "Chrome service connected";
        } else {
            if (!this.f45363h) {
                this.f45363h = true;
                sg.bigo.ads.a.a.a aVar = this.f45360a;
                aVar.f45349c = this;
                if (aVar.f45347a == null) {
                    sg.bigo.ads.a.a.b.a aVarA = sg.bigo.ads.a.a.b.a(context);
                    if (aVarA == null || !aVarA.f45354a) {
                        zA = false;
                    } else {
                        sg.bigo.ads.a.a.c cVar = new sg.bigo.ads.a.a.c(aVar);
                        aVar.f45348b = cVar;
                        zA = CustomTabsClient.a(context, aVarA.f45357e, cVar);
                    }
                }
                if (!zA) {
                    this.f45363h = false;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    if (i2 < 3) {
                        this.j = false;
                    }
                }
                return zA;
            }
            str = "Chrome service connect trying.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", str);
        return true;
    }
}
