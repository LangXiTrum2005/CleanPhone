package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f41497c = new s0(this);

    public t0(Context context, ArrayList arrayList) {
        this.f41496b = arrayList;
        this.f41495a = context;
    }

    public static ArrayList a(ArrayList arrayList) {
        String strC;
        String queryParameter;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            if (!appPresenceDetails.e() && (strC = appPresenceDetails.c()) != null) {
                try {
                    queryParameter = Uri.parse(strC).getQueryParameter("d");
                } catch (Throwable th) {
                    g9.a(th);
                    queryParameter = null;
                }
                if (queryParameter != null) {
                    if (appPresenceDetails.d()) {
                        arrayList3.add("d=".concat(queryParameter));
                    } else {
                        arrayList4.add("d=".concat(queryParameter));
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(h0.a(arrayList3, com.p004ironsource.mediationsdk.metadata.a.g));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.addAll(h0.a(arrayList4, "false"));
        }
        return arrayList2;
    }
}
