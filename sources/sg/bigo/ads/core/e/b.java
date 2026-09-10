package sg.bigo.ads.core.e;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.c.c;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.u.h;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public interface a {
        void a();

        boolean a(int i2);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2, String str, String str2, sg.bigo.ads.common.u.a aVar, String str3, boolean z2, int i3, int i4, Map<String, String> map, int i5, String str4) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        HashMap map2 = new HashMap(map);
        map2.put("action", str);
        map2.put("track_url", aVar.a());
        map2.put("domain_front", aVar.e() ? aVar.d() : "");
        map2.put("track_name", str3);
        map2.put("states", str2);
        map2.put("src", z2 ? "1" : "0");
        map2.put("res_code", String.valueOf(i5));
        if (str4 == null) {
            str4 = "";
        }
        map2.put("res_msg", str4);
        map2.put("retry", String.valueOf(i3));
        map2.put("out_ad", String.valueOf(i4));
        map2.put("replace", String.valueOf(i2));
        str.getClass();
        switch (str) {
            case "va_cpn_cli":
            case "va_cli":
            case "click_track":
                sg.bigo.ads.core.d.b.b(map2);
                break;
            case "va_cpn_imp":
            case "impl_track":
            case "va_show":
                sg.bigo.ads.core.d.b.a(map2);
                break;
            default:
                sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "reportTrack dont report action =".concat(str));
                break;
        }
    }

    private static void a(int i2, String str, sg.bigo.ads.common.u.a aVar, String str2, boolean z2, int i3, int i4, Map<String, String> map) {
        b(i2, str, "start", aVar, str2, z2, i3, i4, map, 0, "");
    }

    public static void a(Context context, int i2, String str, sg.bigo.ads.common.u.a aVar, String str2, int i3, Map<String, String> map, a aVar2) {
        a(context, i2, str, aVar, str2, i3, false, 0, map, aVar2);
    }

    public static void a(Context context, final int i2, final String str, final sg.bigo.ads.common.u.a aVar, final String str2, final int i3, final boolean z2, final int i4, final Map<String, String> map, final a aVar2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track url = " + aVar.a());
        if (i.f46986a.n().a(9) && URLUtil.isHttpUrl(aVar.a())) {
            b(i2, str, "failure", aVar, str2, z2, i4, i3, map, 901, "Invalid http url");
            return;
        }
        a(i2, str, aVar, str2, z2, i4, i3, map);
        sg.bigo.ads.common.u.b.a aVar3 = new sg.bigo.ads.common.u.b.a(aVar, context);
        aVar3.k = e.g();
        g.a(aVar3, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.core.e.b.1
            private final List<Integer> k = new ArrayList();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f48470l = -1;
            private boolean m = false;

            @Override // sg.bigo.ads.common.u.b
            public final /* bridge */ /* synthetic */ c a(sg.bigo.ads.common.u.c.a aVar4) {
                return aVar4;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, String str3, int i5) {
                super.a((sg.bigo.ads.common.u.b.a) cVar, str3, i5);
                this.k.add(Integer.valueOf(i5));
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, c cVar2) {
                sg.bigo.ads.common.u.c.a aVar4 = (sg.bigo.ads.common.u.c.a) cVar2;
                a aVar5 = aVar2;
                if (aVar5 != null) {
                    aVar5.b();
                }
                b.b(i2, str, "success", aVar, str2, z2, i4, i3, map, aVar4.f47477a, "success");
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, h hVar) {
                int i5;
                String str3;
                sg.bigo.ads.common.u.a aVar4;
                String str4;
                boolean z3;
                int i6;
                int i7;
                Map map2;
                int i8;
                String message;
                String str5;
                sg.bigo.ads.common.u.b.a aVar5 = (sg.bigo.ads.common.u.b.a) cVar;
                if (this.m || a(aVar5)) {
                    a aVar6 = aVar2;
                    if (aVar6 != null) {
                        aVar6.b();
                    }
                    i5 = i2;
                    str3 = str;
                    aVar4 = aVar;
                    str4 = str2;
                    z3 = z2;
                    i6 = i4;
                    i7 = i3;
                    map2 = map;
                    i8 = this.f48470l;
                    message = "Something wrong occurs when handling the request, but it is still successful";
                    str5 = "success";
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track onError e=" + hVar.getMessage());
                    a aVar7 = aVar2;
                    if (aVar7 != null) {
                        aVar7.a();
                    }
                    i5 = i2;
                    str3 = str;
                    aVar4 = aVar;
                    str4 = str2;
                    z3 = z2;
                    i6 = i4;
                    i7 = i3;
                    map2 = map;
                    i8 = hVar.f47491a;
                    message = hVar.getMessage();
                    str5 = "failure";
                }
                b.b(i5, str3, str5, aVar4, str4, z3, i6, i7, map2, i8, message);
            }

            private boolean a(sg.bigo.ads.common.u.b.a aVar4) {
                Iterator<Integer> it = this.k.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    a aVar5 = aVar2;
                    if ((aVar5 != null && aVar5.a(iIntValue)) || super.a(aVar4, iIntValue)) {
                        this.f48470l = iIntValue;
                        this.m = true;
                        return true;
                    }
                }
                return false;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ boolean a(sg.bigo.ads.common.u.b.c cVar, int i5) {
                this.k.add(Integer.valueOf(i5));
                return a((sg.bigo.ads.common.u.b.a) cVar);
            }
        });
    }
}
