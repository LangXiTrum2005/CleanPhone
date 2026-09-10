package i9;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import b0.q0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.UnityAdsConstants;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f42925d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f42926e = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m9.d f42927c;

    public static AlertDialog e(Activity activity, int i10, k9.t tVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(k9.s.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(com.storage.androidcleaner.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.storage.androidcleaner.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.storage.androidcleaner.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, tVar);
        }
        String strA = k9.s.a(activity, i10);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", l1.d.e(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void i(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                h1 h1VarF = ((FragmentActivity) activity).F();
                j jVar = new j();
                c0.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f42939q = alertDialog;
                if (onCancelListener != null) {
                    jVar.f42940r = onCancelListener;
                }
                jVar.F(h1VarF, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        c0.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f42918a = alertDialog;
        if (onCancelListener != null) {
            bVar.f42919b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i10, new k9.t(super.b(googleApiActivity, i10, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        i(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, com.google.android.gms.common.api.internal.h hVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i10, new k9.t(super.b(activity, i10, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D), hVar, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        i(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        int i12;
        Log.w("GoogleApiAvailability", defpackage.e.h(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? k9.s.e(context, "common_google_play_services_resolution_required_title") : k9.s.a(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.storage.androidcleaner.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? k9.s.d(context, "common_google_play_services_resolution_required_text", k9.s.c(context)) : k9.s.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        c0.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        b0.p pVar = new b0.p(context, null);
        pVar.f5185u = true;
        pVar.c(16, true);
        pVar.f5170e = b0.p.b(strE);
        b0.l lVar = new b0.l(0);
        lVar.f5145f = b0.p.b(strD);
        pVar.e(lVar);
        PackageManager packageManager = context.getPackageManager();
        if (p9.c.f48281c == null) {
            p9.c.f48281c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = p9.c.f48281c.booleanValue();
        int i13 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i14 = context.getApplicationInfo().icon;
            if (i14 != 0) {
                i13 = i14;
            }
            pVar.G.icon = i13;
            pVar.f5176k = 2;
            PackageManager packageManager2 = context.getPackageManager();
            if (p9.c.f48281c == null) {
                p9.c.f48281c = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
            }
            p9.c.f48281c.getClass();
            if (p9.c.l(context)) {
                i11 = 2;
                pVar.f5167b.add(new b0.g(IconCompat.d(null, "", 2131230897), (CharSequence) resources.getString(com.storage.androidcleaner.R.string.common_open_on_phone), pendingIntent, new Bundle(), (q0[]) null, true, 0, true, false, false));
            } else {
                i11 = 2;
                pVar.f5172g = pendingIntent;
            }
        } else {
            i11 = 2;
            pVar.G.icon = R.drawable.stat_sys_warning;
            pVar.G.tickerText = b0.p.b(resources.getString(com.storage.androidcleaner.R.string.common_google_play_services_notification_ticker));
            pVar.G.when = System.currentTimeMillis();
            pVar.f5172g = pendingIntent;
            pVar.f5171f = b0.p.b(strD);
        }
        synchronized (f42925d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.storage.androidcleaner.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        pVar.B = "com.google.android.gms.availability";
        Notification notificationA = pVar.a();
        if (i10 == 1 || i10 == i11 || i10 == 3) {
            h.f42931a.set(false);
            i12 = 10436;
        } else {
            i12 = 39789;
        }
        notificationManager.notify(i12, notificationA);
    }

    public final void h(Context context, ConnectionResult connectionResult, boolean z10) {
        Integer num = connectionResult.f11644e;
        int iIntValue = num == null ? -1 : num.intValue();
        k9.r rVar = new k9.r(iIntValue, connectionResult.f11641b, System.currentTimeMillis(), context.getPackageName(), z10);
        if (this.f42927c == null) {
            this.f42927c = new m9.d(context, null, m9.d.l, j9.b.f43727o9, j9.h.f43737c);
        }
        m9.d dVar = this.f42927c;
        dVar.getClass();
        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
        mVarB.f11729a = new c[]{x9.b.f53675b};
        mVarB.f11730b = false;
        mVarB.f11732d = new n5.f(rVar, 26);
        dVar.c(2, mVarB.a());
    }
}
