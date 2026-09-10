package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t6 {
    public static void a(Context context, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd, t2 t2Var, s2 s2Var) {
        com.startapp.sdk.adsbase.f fVarA = diskAdCacheManager$DiskCachedAd.a();
        WeakHashMap weakHashMap = vi.f41589a;
        if (fVarA instanceof na) {
            na naVar = (na) fVarA;
            String strB = diskAdCacheManager$DiskCachedAd.b();
            if (strB == null || strB.equals("")) {
                a0.a(context, s2Var, null, true);
                return;
            }
            if (AdsCommonMetaData.k().G()) {
                ArrayList arrayListA = u0.a(strB, 0);
                ArrayList arrayList = new ArrayList();
                if (u0.a(context, arrayListA, 0, new HashSet(), arrayList).booleanValue()) {
                    ((Executor) com.startapp.sdk.components.a.a(context).f40724A.a()).execute(new t0(context, arrayList).f41497c);
                    a0.a(context, s2Var, null, true);
                    return;
                }
            }
            p pVar = (p) com.startapp.sdk.components.a.a(context).M.a();
            pVar.f41334b.put(naVar.f41298b, strB);
            t2Var.f41501a.o = naVar;
            ((rk) com.startapp.sdk.components.a.a(context).f40736c.a()).a(strB, new s6(context, s2Var, naVar));
            return;
        }
        if (!(fVarA instanceof wd)) {
            a0.a(context, s2Var, null, true);
            return;
        }
        wd wdVar = (wd) fVarA;
        List listA = wdVar.f41005a;
        if (listA == null) {
            a0.a(context, s2Var, null, true);
            return;
        }
        if (AdsCommonMetaData.k().G()) {
            listA = u0.a(context, listA, 0, new HashSet(), true);
        }
        if (listA.size() <= 0) {
            a0.a(context, s2Var, null, true);
            return;
        }
        t2Var.f41501a.o = wdVar;
        ub ubVarA = ((vb) com.startapp.sdk.components.a.a(context).f40733R.a()).a(wdVar.f41632b);
        ubVarA.getClass();
        ubVarA.f41542b = new ArrayList();
        ubVarA.f41543c = "";
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            rb rbVar = new rb((AdDetails) it.next());
            ubVarA.f41542b.add(rbVar);
            ubVarA.f41541a.a(rbVar.f41435a, ubVarA.f41542b.size() - 1, rbVar.f41440i);
        }
        a0.b(context, s2Var, wdVar, true);
    }
}
