package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements w5.b, u5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f7532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7533d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(b bVar, String str);

        void a(z zVar, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public b0(com.applovin.impl.sdk.l lVar, a aVar) {
        this.f7530a = lVar;
        this.f7531b = aVar;
    }

    public void a() {
        z zVar = this.f7532c;
        if (zVar != null) {
            this.f7531b.a(zVar, this.f7533d);
        } else {
            this.f7530a.s0().a(new w5(this.f7530a, this));
        }
    }

    public static List a(z zVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            List list2 = (List) zVar.a().get(a0Var.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((a0) it2.next()).a(a0Var));
            }
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.w5.b
    public void a(String str) {
        this.f7530a.s0().a(new u5(this.f7530a, str, this));
    }

    @Override // com.applovin.impl.w5.b
    public void a(b bVar) {
        this.f7531b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.u5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                a0 a0Var = new a0(strTrim, i10);
                if (a0Var.h()) {
                    String strB = a0Var.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(a0Var);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(a0Var);
                }
            }
            i10++;
        }
        this.f7532c = new z(map, arrayList);
        this.f7533d = str2;
        this.f7530a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7530a.Q().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f7532c);
        }
        this.f7531b.a(this.f7532c, str2);
    }

    @Override // com.applovin.impl.u5.b
    public void a(b bVar, String str) {
        this.f7531b.a(bVar, str);
    }
}
