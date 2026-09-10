package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0927b0 implements u5.b, s5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0972z f10567c;
    private String d;

    /* JADX INFO: renamed from: com.applovin.impl.b0$a */
    public interface a {
        void a(b bVar, String str);

        void a(C0972z c0972z, String str);
    }

    /* JADX INFO: renamed from: com.applovin.impl.b0$b */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C0927b0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f10565a = kVar;
        this.f10566b = aVar;
    }

    public void a() {
        C0972z c0972z = this.f10567c;
        if (c0972z != null) {
            this.f10566b.a(c0972z, this.d);
        } else {
            this.f10565a.q0().a(new u5(this.f10565a, this));
        }
    }

    public static List a(C0972z c0972z, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0925a0 c0925a0 = (C0925a0) it.next();
            List list2 = (List) c0972z.a().get(c0925a0.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((C0925a0) it2.next()).a(c0925a0));
            }
            arrayList.add(c0925a0);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u5.b
    public void a(String str) {
        this.f10565a.q0().a(new s5(this.f10565a, str, this));
    }

    @Override // com.applovin.impl.u5.b
    public void a(b bVar) {
        this.f10566b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.s5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        for (String str3 : str.split(IOUtils.LINE_SEPARATOR_UNIX)) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                C0925a0 c0925a0 = new C0925a0(strTrim, i2);
                if (c0925a0.h()) {
                    String strB = c0925a0.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(c0925a0);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(c0925a0);
                }
            }
            i2++;
        }
        this.f10567c = new C0972z(map, arrayList);
        this.d = str2;
        this.f10565a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10565a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f10567c);
        }
        this.f10566b.a(this.f10567c, str2);
    }

    @Override // com.applovin.impl.s5.b
    public void a(b bVar, String str) {
        this.f10566b.a(bVar, str);
    }
}
