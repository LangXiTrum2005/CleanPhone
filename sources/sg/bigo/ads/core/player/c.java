package sg.bigo.ads.core.player;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f48840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48842c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.core.e.a.b f48843e;
    public sg.bigo.ads.core.c.b f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f48844h;
    public final List<Integer> j;
    public final List<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48846l = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f48845i = false;

    public c(Context context, p pVar, sg.bigo.ads.core.e.a.b bVar) {
        ArrayList arrayList = new ArrayList(4);
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        this.k = arrayList2;
        this.f48844h = context;
        this.f48840a = pVar;
        this.f48843e = bVar;
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList2.add(2000);
        arrayList2.add(3000);
        arrayList2.add(5000);
        arrayList2.add(8000);
        arrayList2.add(10000);
    }

    public static String a(String str) {
        if (q.a((CharSequence) str)) {
            return "";
        }
        String strA = q.a(str, "[TIMESTAMP]", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date()), true);
        StringBuilder sb = new StringBuilder();
        sb.append(((int) (Math.random() * 9.0E7d)) + 10000000);
        return q.a(strA, "[CACHEBUSTING]", sb.toString(), true);
    }

    public final void b() {
        a(this.f48840a.y, "va_cpn_imp");
    }

    public final boolean c() {
        return a(this.f48840a.f48539z, "va_cpn_cli");
    }

    public final void a() {
        if (this.f48846l) {
            return;
        }
        a(this.f48840a.j, "va_cli");
    }

    public static void a(Context context, List<n> list) {
        if (list != null) {
            for (n nVar : list) {
                if (nVar != null) {
                    String str = nVar.f48522b;
                    if (q.a((CharSequence) str) || (nVar.f48523c && !nVar.d)) {
                        sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                    } else {
                        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(str), context);
                        aVar.k = e.g();
                        g.a(aVar, null);
                    }
                }
            }
        }
    }

    public static void a(sg.bigo.ads.core.a.a aVar, int i2) {
        sg.bigo.ads.core.d.b.a(aVar, i2, aVar.aK(), aVar.aM());
    }

    public final void a(n nVar, String str) {
        String str2 = nVar.f48522b;
        if (q.a((CharSequence) str2) || (nVar.f48523c && !nVar.d)) {
            sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String strA = a(str2);
        nVar.f48523c = true;
        if (q.a((CharSequence) strA)) {
            return;
        }
        this.f48843e.a(this.f48844h, str, strA, "bigoad");
        sg.bigo.ads.common.t.a.a(0, 3, "VASTController", android.support.v4.media.a.o("Send track info, action: ", str, ", url: ", strA));
    }

    public final boolean a(List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.f48846l = true;
            }
            a(it.next(), str);
            it.remove();
            z2 = true;
        }
        return z2;
    }
}
