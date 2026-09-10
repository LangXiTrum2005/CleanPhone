package com.inmobi.media;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3333z5 f22725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22726b = 101;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22727c = CollectionsKt.i(101);
    public final LinkedHashMap d;

    public Bd(InterfaceC3333z5 interfaceC3333z5) {
        this.f22725a = interfaceC3333z5;
        List listI = CollectionsKt.I(new C3214re(101, 1, 102, new C3229sd(this)), new C3214re(101, 4, 104, new C3245td(this)), new C3214re(102, 2, 103, new C3261ud(this)), new C3214re(102, 3, 104, new C3277vd(this)), new C3214re(102, 4, 104, new C3293wd(this)), new C3214re(102, 8, 107, new C3309xd(this)), new C3214re(102, 5, 105, new C3325yd(this)), new C3214re(103, 5, 105, new C3341zd(this)), new C3214re(106, 5, 105, new Ad(this)), new C3214re(106, 7, 105, new C3070id(this)), new C3214re(103, 8, 107, new C3086jd(this)), new C3214re(103, 4, 104, new C3102kd(this)), new C3214re(106, 2, 106, new C3118ld(this)), new C3214re(106, 4, 104, new C3134md(this)), new C3214re(106, 8, 107, new C3150nd(this)), new C3214re(104, 8, 107, new C3166od(this)), new C3214re(105, 7, 106, new C3182pd(this)), new C3214re(105, 4, 104, new C3198qd(this)), new C3214re(105, 2, 105, new C3213rd(this)));
        int iH = MapsKt.h(CollectionsKt.n(listI, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : listI) {
            C3214re c3214re = (C3214re) obj;
            linkedHashMap.put(new Pair(Integer.valueOf(c3214re.f23969a), Integer.valueOf(c3214re.f23970b)), obj);
        }
        this.d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final Integer a(int i2) {
        String str;
        C3214re c3214re = (C3214re) this.d.get(new Pair(Integer.valueOf(this.f22726b), Integer.valueOf(i2)));
        if (c3214re == null) {
            return Integer.valueOf(this.f22726b);
        }
        c3214re.d.invoke();
        StringBuilder sb = new StringBuilder("Transition: ");
        Map map = Cd.f22752a;
        int i3 = this.f22726b;
        Map map2 = Cd.f22752a;
        sb.append((String) map2.get(Integer.valueOf(i3)));
        sb.append(" --[");
        switch (i2) {
            case 1:
                str = "IMRAID_LOAD_WEBVIEW";
                break;
            case 2:
                str = "FIRE_AD_READY";
                break;
            case 3:
                str = "FIRE_AD_FAILED";
                break;
            case 4:
                str = "ON_RENDER_PROCESS_GONE";
                break;
            case 5:
                str = "SHOW_WEBVIEW";
                break;
            case 6:
                str = "IMRAID_RENDERED";
                break;
            case 7:
                str = "IMRAID_FOCUS_CHANGE";
                break;
            case 8:
                str = "IMRAID_DESTROY_WEBVIEW";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        sb.append("]--> ");
        sb.append((String) map2.get(Integer.valueOf(c3214re.f23971c)));
        System.out.println((Object) sb.toString());
        this.f22727c.add(Integer.valueOf(c3214re.f23971c));
        InterfaceC3333z5 interfaceC3333z5 = this.f22725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("StateMachine", "history - " + this.f22727c);
        }
        this.f22726b = c3214re.f23971c;
        return null;
    }
}
