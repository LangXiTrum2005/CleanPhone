package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3136n extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.a(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3215s.c();
        }
    }
}
