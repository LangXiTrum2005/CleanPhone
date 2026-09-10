package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.inmobi.media.Jj;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Jj extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        Lj.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Runnable runnable = new Runnable() { // from class: adsuki.outmarry
            @Override // java.lang.Runnable
            public final void run() {
                Jj.a(intent, context);
            }
        };
        Context context2 = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }
}
