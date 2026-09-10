package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b9.a;
import com.applovin.impl.sdk.c0;
import com.applovin.impl.sdk.x;
import com.google.android.gms.internal.consent_sdk.d;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import r1.s;
import r8.i;
import r8.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10614a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        s sVarA = i.a();
        sVarA.n(queryParameter);
        sVarA.f49340d = a.b(iIntValue);
        if (queryParameter2 != null) {
            sVarA.f49339c = Base64.decode(queryParameter2, 0);
        }
        d dVar = p.a().f49509d;
        ((Executor) dVar.f22985e).execute(new c0(dVar, sVarA.c(), i10, new x(20), 2));
    }
}
