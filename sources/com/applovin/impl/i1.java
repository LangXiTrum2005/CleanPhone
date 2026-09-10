package com.applovin.impl;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements OnSuccessListener {
        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            com.applovin.impl.sdk.m.a(new com.applovin.impl.sdk.m.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(Context context) {
        new Thread(new u9(context, 10)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) {
        com.applovin.impl.sdk.m.a(v.b(context));
        if (q7.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
