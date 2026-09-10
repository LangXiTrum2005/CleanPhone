package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.media.a;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.p004ironsource.dc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3) {
        return getErrorDialog(activity, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        return super.getErrorResolutionIntent(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return super.getErrorResolutionPendingIntent(context, i2, i3);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i2) {
        return super.getErrorString(i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i2) {
        return super.isUserResolvableError(i2);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i2);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaccVarZaa = zacc.zaa(activity);
        zaccVarZaa.zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zaccVarZaa.zad();
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i2, int i3) {
        return showErrorDialogFragment(activity, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i2) {
        zae(context, i2, null, getErrorResolutionPendingIntent(context, i2, 0, dc.q));
    }

    public final Dialog zaa(Context context, int i2, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(com.google.android.gms.common.internal.zac.zac(context, i2));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strZab = com.google.android.gms.common.internal.zac.zab(context, i2);
        DialogInterface.OnClickListener onClickListener2 = zagVar;
        if (strZab != null) {
            if (zagVar == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZab, onClickListener2);
        }
        String strZaf = com.google.android.gms.common.internal.zac.zaf(context, i2);
        if (strZaf != null) {
            builder2.setTitle(strZaf);
        }
        Log.w("GoogleApiAvailability", a.h(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder2.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zae(Context context, int i2, String str, PendingIntent pendingIntent) {
        String str2;
        int i3;
        Log.w("GoogleApiAvailability", androidx.datastore.preferences.protobuf.a.k("GMS core API Availability. ConnectionResult=", i2, ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZae = com.google.android.gms.common.internal.zac.zae(context, i2);
        String strZad = com.google.android.gms.common.internal.zac.zad(context, i2);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, null);
        builder.o = true;
        builder.c(16);
        builder.f4209e = NotificationCompat.Builder.b(strZae);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.f4201b = NotificationCompat.Builder.b(strZad);
        builder.d(bigTextStyle);
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            builder.f4215u.icon = context.getApplicationInfo().icon;
            builder.f4211i = 2;
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                int i4 = com.google.android.gms.base.R.drawable.common_full_open_on_phone;
                String string = resources.getString(com.google.android.gms.base.R.string.common_open_on_phone);
                builder.f4207b.add(new NotificationCompat.Action(i4 != 0 ? IconCompat.e(null, "", i4) : null, (CharSequence) string, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false));
            } else {
                builder.g = pendingIntent;
            }
        } else {
            builder.f4215u.icon = android.R.drawable.stat_sys_warning;
            builder.f4215u.tickerText = NotificationCompat.Builder.b(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker));
            builder.f4215u.when = System.currentTimeMillis();
            builder.g = pendingIntent;
            builder.f = NotificationCompat.Builder.b(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(com.google.android.exoplayer2.scheduler.a.c(string2));
                } else if (!string2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            builder.r = str2;
        }
        Notification notificationA = builder.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }

    public final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i2, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i2, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i2) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i2, true), zap.zaa | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i2, zag.zab(activity, getErrorResolutionIntent(activity, i2, "d"), i3), onCancelListener, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i2) {
        return super.isGooglePlayServicesAvailable(context, i2);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i2, i3, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3) {
        return getErrorDialog(fragment, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i2, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i2, null, onCancelListener, new zac(this, activity, i2, activityResultLauncher));
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i2, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i2, "d"), i3), onCancelListener, null);
    }
}
