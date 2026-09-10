package sg.bigo.ads.ad;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<Ad>> f45401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Map<String, List<Ad>>> f45402b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f45406a = new b(0);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b$b, reason: collision with other inner class name */
    public interface InterfaceC0782b {
        boolean a(Ad ad);
    }

    private b() {
        this.f45401a = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        this.f45402b = arrayList;
        arrayList.add(this.f45401a);
    }

    private int a(String str, Map<String, List<Ad>> map) {
        return a(str, map, new InterfaceC0782b() { // from class: sg.bigo.ads.ad.b.1
            @Override // sg.bigo.ads.ad.b.InterfaceC0782b
            public final boolean a(Ad ad) {
                return ad != null && ad.isExpired();
            }
        });
    }

    private static String b(Ad ad) {
        return ad == null ? AbstractJsonLexerKt.NULL : ad.toString();
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    private int a(String str, Map<String, List<Ad>> map, InterfaceC0782b interfaceC0782b) {
        List<Ad> list = map.get(str);
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            for (Ad ad : list) {
                if (interfaceC0782b.a(ad)) {
                    a(ad);
                    list.remove(ad);
                    i2++;
                }
            }
        }
        return i2;
    }

    private static String b(l lVar) {
        if (lVar == null) {
            return null;
        }
        String strL = lVar.l();
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        return strL + "_" + lVar.v() + "_" + lVar.b();
    }

    public final Ad a(l lVar) {
        String strB = b(lVar);
        p005e.a.d(0, 3, strB, "AdCacheManager:key = ", "AdCacheManager");
        Ad ad = null;
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:getAd expiredNum is ".concat(String.valueOf(a(strB, this.f45401a))));
        List<Ad> list = this.f45401a.get(strB);
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (i2 < list.size()) {
                try {
                    Ad ad2 = list.get(i2);
                    i2++;
                    ad = ad2;
                } catch (Exception e2) {
                    sg.bigo.ads.common.t.a.a(0, "AdCacheManager", "AdCacheManager:getAd end error= " + e2.getMessage());
                }
            }
            if (ad != null) {
                list.remove(ad);
            }
            StringBuilder sb = new StringBuilder("AdCacheManager:getAd end cacheNum= ");
            sb.append(list.size());
            sb.append("ad = ");
            p005e.a.f(sb, 0, b(ad), 3, "AdCacheManager");
        }
        return ad;
    }

    private void a(final Ad ad) {
        if (ad == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ad.destroy();
            }
        });
    }

    public final void a(l lVar, Ad ad) {
        h hVar;
        List list;
        if (lVar == null) {
            return;
        }
        String strL = lVar.l();
        String strB = b(lVar);
        if (TextUtils.isEmpty(strB) || (hVar = i.f46986a) == null) {
            return;
        }
        int iH = hVar.q().h(strL);
        Map<String, List<Ad>> map = this.f45401a;
        int iA = a(strB, map);
        List<Ad> list2 = map.get(strB);
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(ad);
            map.put(strB, copyOnWriteArrayList);
            list = copyOnWriteArrayList;
        } else {
            int iIndexOf = list2.indexOf(ad);
            if (iIndexOf >= 0) {
                list2.set(iIndexOf, ad);
                list = list2;
            } else {
                list2.add(ad);
                list = list2;
            }
        }
        sg.bigo.ads.api.core.c[] cVarArrA = sg.bigo.ads.controller.loader.a.a(ad);
        for (int i2 = 0; cVarArrA != null && i2 < cVarArrA.length; i2++) {
            sg.bigo.ads.api.core.c cVar = cVarArrA[i2];
            cVar.T();
            cVar.S();
        }
        Object[] array = list.toArray();
        if (array != null) {
            List listAsList = Arrays.asList(array);
            Collections.sort(listAsList, Collections.reverseOrder());
            list.clear();
            list.addAll(listAsList);
        }
        int size = list.size();
        if (iH > 0 && size > iH) {
            try {
                Ad ad2 = (Ad) list.remove(iH);
                sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:removeAd due to limit:" + b(ad2));
                a(ad2);
            } catch (Exception e2) {
                sg.bigo.ads.common.t.a.a(0, "AdCacheManager", "AdCacheManager:doAdPut, error = " + e2.getMessage());
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:putAdInCache:" + b(ad));
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:doAdPut, size = " + list.size() + ", expired num = " + iA);
    }
}
