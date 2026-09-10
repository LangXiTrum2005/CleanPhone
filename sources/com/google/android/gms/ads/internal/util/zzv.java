package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.g30;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.w30;
import com.google.android.gms.internal.ads.zl0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final g30 zzb(b30 b30Var, pj pjVar, boolean z10, @Nullable zl0 zl0Var) {
        return new w30(b30Var, pjVar, z10, zl0Var);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final ll zzd(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        return (zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? ll.ENUM_TRUE : ll.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zze(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.S9)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzf(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
