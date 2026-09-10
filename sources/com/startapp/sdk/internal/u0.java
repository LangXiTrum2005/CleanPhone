package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u0 {
    public static ArrayList a(Context context, List list, int i2, HashSet hashSet, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            AdDetails adDetails = (AdDetails) it.next();
            List<String> listAsList = Arrays.asList(adDetails.t());
            WeakHashMap weakHashMap = vi.f41589a;
            ArrayList arrayList5 = new ArrayList();
            for (String str : listAsList) {
                if (vi.d(str)) {
                    arrayList5.add(str);
                }
            }
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(i2, adDetails.r(), arrayList5.isEmpty() ? null : (String) arrayList5.get(0), adDetails.d());
            boolean z4 = adDetails.d() != null && adDetails.d().startsWith("!");
            boolean zA = q0.a(adDetails.r(), context, z4 ? adDetails.d().substring(1) : adDetails.d());
            boolean z5 = AdsCommonMetaData.k().G() && ((zA && !z4) || (!zA && z4));
            arrayList3.add(appPresenceDetails);
            if (z5) {
                appPresenceDetails.a(zA);
                appPresenceDetails.b(false);
                if (!z4) {
                    arrayList2.add(adDetails);
                    arrayList4.add(appPresenceDetails);
                }
                hashSet.add(adDetails.s());
                z3 = true;
            } else {
                arrayList.add(adDetails);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i2 > 0)) {
            int iMin = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, iMin));
            Iterator it2 = arrayList4.subList(0, iMin).iterator();
            while (it2.hasNext()) {
                ((AppPresenceDetails) it2.next()).b(true);
            }
        }
        if (z3) {
            com.startapp.sdk.adsbase.g.f(context);
            if (z2) {
                ((Executor) com.startapp.sdk.components.a.a(context).f40724A.a()).execute(new t0(context, arrayList3).f41497c);
            }
        }
        return arrayList;
    }

    public static ArrayList a(String str, int i2) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = new String[0];
        String strA = vi.a(str, "@tracking@", "@tracking@");
        if (strA != null) {
            strArrSplit = strA.split(",");
        }
        String[] strArrSplit2 = new String[0];
        String strA2 = vi.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (strA2 != null) {
            strArrSplit2 = strA2.split(",");
        }
        String[] strArrSplit3 = new String[0];
        String strA3 = vi.a(str, "@minAppVersion@", "@minAppVersion@");
        if (strA3 != null) {
            strArrSplit3 = strA3.split(",");
        }
        int i3 = 0;
        while (i3 < strArrSplit2.length) {
            arrayList.add(new AppPresenceDetails(i2, strArrSplit3.length > i3 ? Integer.valueOf(strArrSplit3[i3]).intValue() : 0, strArrSplit.length > i3 ? strArrSplit[i3] : null, strArrSplit2[i3]));
            i3++;
        }
        while (i3 < strArrSplit.length) {
            arrayList.add(new AppPresenceDetails(i2, strArrSplit3.length > i3 ? Integer.valueOf(strArrSplit3[i3]).intValue() : 0, strArrSplit[i3], ""));
            i3++;
        }
        return arrayList;
    }

    public static Boolean a(Context context, ArrayList arrayList, int i2, HashSet hashSet, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            boolean zStartsWith = appPresenceDetails.b().startsWith("!");
            boolean zA = q0.a(appPresenceDetails.a(), context, zStartsWith ? appPresenceDetails.b().substring(1) : appPresenceDetails.b());
            if ((!zStartsWith && zA) || (zStartsWith && !zA)) {
                appPresenceDetails.a(zA);
                z2 = i2 == 0;
                if (z2 && !zStartsWith) {
                    hashSet.add(appPresenceDetails.b());
                } else if (!z2 && appPresenceDetails.c() != null) {
                    appPresenceDetails.a(appPresenceDetails.c() + "&isShown=" + appPresenceDetails.e() + "&appPresence=" + appPresenceDetails.d());
                }
            }
            arrayList2.add(appPresenceDetails);
        }
        if (z2) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                ((AppPresenceDetails) arrayList2.get(i3)).b(false);
            }
        }
        return Boolean.valueOf(z2);
    }
}
