package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3012k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.wireman(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3162q c3162q = C3162q.a;
            C3342x5.a.getClass();
            if (C3342x5.w()) {
                cutely.wireman(C3162q.g, null, null, new C3062m(null), 3, null);
            } else {
                C3162q.a((Float) null);
            }
        }
    }
}
