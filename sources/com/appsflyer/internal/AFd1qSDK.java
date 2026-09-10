package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1qSDK {
    public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }

    public static final JSONArray getMediationNetwork(List<ExceptionInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<ExceptionInfo> list2 = list;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExceptionInfo) it.next()).getRevenue());
        }
        return new JSONArray((Collection) arrayList);
    }
}
