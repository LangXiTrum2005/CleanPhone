package com.smartdigimkt.e0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34585b = "smartdigimkt_template/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34586c = "smartdigimkt_template/res/Movies";
    private static final String d = "smartdigimkt_template/res";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34587e = "smartdigimkt_template/res/.Anythink_VC";
    private static final String f = "smartdigimkt_template/res/.anythink700";
    private static final String g = "smartdigimkt_template/res/img";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34588h = "smartdigimkt_template/crashinfo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f34589i = "smartdigimkt_template/other";
    private static final String j = "smartdigimkt_template/res/xml";
    private static final String k = "smartdigimkt_template/anythink/config";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f34590l = "smartdigimkt_template/res/res";
    private static final String m = "smartdigimkt_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.smartdigimkt.e0.f
    public List<e> b() {
        ArrayList<e> arrayList = new ArrayList<>();
        a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, d);
        a(arrayList, a.AD_MOVIES, f34586c).a(a.ANYTHINK_VC, f34587e);
        e eVarA = a(arrayList, a.AD_ANYTHINK_700, f);
        eVarA.a(a.ANYTHINK_700_IMG, g);
        eVarA.a(a.ANYTHINK_700_XML, j);
        eVarA.a(a.ANYTHINK_700_CONFIG, k);
        eVarA.a(a.ANYTHINK_700_RES, f34590l);
        eVarA.a(a.ANYTHINK_700_HTML, m);
        a aVar = a.ANYTHINK_OTHER;
        a(arrayList, aVar, f34589i);
        a(arrayList, a.ANYTHINK_CRASH_INFO, f34588h);
        a(arrayList, aVar, f34589i);
        return arrayList;
    }
}
