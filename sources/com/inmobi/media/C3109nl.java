package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3109nl {
    public final G a;

    public C3109nl(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adContext;
    }

    public static void a(HashMap macros, List nativeTrackers, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(nativeTrackers, "nativeTrackers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : nativeTrackers) {
            if (Intrinsics.wireman(((C3301ve) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((C3301ve) it.next()).a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(macros, "macros");
            String strPolder = str;
            for (Map.Entry entry : macros.entrySet()) {
                strPolder = p002kotlin.text.dovishness.polder(strPolder, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            arrayList2.add(strPolder);
        }
        for (String url : arrayList2) {
            C3315w3 c3315w3 = C3315w3.a;
            Ag priority = Ag.REGULAR;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(priority, "priority");
            Dg.a(priority, new C3091n3(url, c3097n9, null));
        }
    }
}
