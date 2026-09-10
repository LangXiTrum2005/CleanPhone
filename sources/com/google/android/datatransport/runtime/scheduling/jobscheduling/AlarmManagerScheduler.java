package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerScheduler implements WorkScheduler {
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public final void a(TransportContext transportContext, int i2) {
        b(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public final void b(TransportContext transportContext, int i2, boolean z2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.b());
        builder.appendQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, String.valueOf(PriorityMapping.a(transportContext.d())));
        if (transportContext.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.c(), 0));
        }
        Intent intent = new Intent((Context) null, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (z2 || PendingIntent.getBroadcast(null, 0, intent, 603979776) == null) {
            throw null;
        }
        Logging.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
    }
}
