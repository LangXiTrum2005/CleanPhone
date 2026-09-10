package sg.bigo.ads.controller.loader;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.g;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static int a(c[] cVarArr) {
        c cVar = (c) k.b(cVarArr);
        if (cVar != null) {
            return cVar.w();
        }
        return 0;
    }

    public static void a(Ad ad, String str) {
        c[] cVarArrA = a(ad);
        if (k.a(cVarArrA)) {
            return;
        }
        for (c cVar : cVarArrA) {
            cVar.a(str);
        }
    }

    public static void a(c[] cVarArr, int i2) {
        if (k.a(cVarArr)) {
            return;
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                cVar.b(i2);
            }
        }
    }

    public static void a(c[] cVarArr, int i2, int i3, boolean z2) {
        if (k.a(cVarArr)) {
            return;
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                cVar.a(i2, i3, z2);
            }
        }
    }

    public static c[] a(Ad ad) {
        if (ad instanceof g) {
            return ((g) ad).a();
        }
        if (ad instanceof sg.bigo.ads.ad.c) {
            return new c[]{((sg.bigo.ads.ad.c) ad).f()};
        }
        return null;
    }

    public static c[] a(sg.bigo.ads.api.core.g... gVarArr) {
        if (k.a(gVarArr)) {
            return null;
        }
        c[] cVarArr = new c[gVarArr.length];
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            cVarArr[i2] = gVarArr[i2].f47032a;
        }
        return cVarArr;
    }
}
