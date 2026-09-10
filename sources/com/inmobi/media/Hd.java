package com.inmobi.media;

import A.RunnableC0905n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Hd extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        Intrinsics.f(intent, "$intent");
        Intrinsics.f(context, "$context");
        Jd.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(intent, "intent");
        Uc.a(new RunnableC0905n(4, intent, context));
    }
}
