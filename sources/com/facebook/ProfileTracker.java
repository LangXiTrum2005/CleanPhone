package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/ProfileTracker;", "", "ProfileBroadcastReceiver", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public abstract class ProfileTracker {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/ProfileTracker$ProfileBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public final class ProfileBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intrinsics.f(context, "context");
            Intrinsics.f(intent, "intent");
            if ("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED".equals(intent.getAction())) {
                throw null;
            }
        }
    }
}
