package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.smartdigimkt.u2.m;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeif extends zzbwq {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdxe zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzehu zze;
    private String zzf;
    private String zzg;

    public zzeif(Context context, zzehu zzehuVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdxe zzdxeVar) {
        this.zzb = context;
        this.zzc = zzdxeVar;
        this.zzd = zzuVar;
        this.zze = zzehuVar;
    }

    public static void zzd(Context context, zzdxe zzdxeVar, zzehu zzehuVar, String str, String str2) {
        zzk(context, zzdxeVar, zzehuVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdxe zzdxeVar, zzehu zzehuVar, String str, String str2, Map map) {
        String strZzg;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdxeVar != null) {
            zzdxd zzdxdVarZza = zzdxeVar.zza();
            zzdxdVarZza.zzc("gqi", str);
            zzdxdVarZza.zzc("action", str2);
            zzdxdVarZza.zzc("device_connectivity", str3);
            zzdxdVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdxdVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdxdVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzehuVar.zze(new zzehw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, strZzg, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzgne.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzgne.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgtg.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(activity);
            builderZzP.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeia
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzo(activity, zzmVar, dialogInterface, i2);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeib
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzp(zzmVar, dialogInterface, i2);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeic
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(zzmVar, dialogInterface);
                }
            });
            builderZzP.create().show();
            zzw(this.zzf, "rtsdi", zzgtg.zza());
        }
    }

    private final void zzt() {
        boolean zZzg;
        boolean zZze;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzboVarZzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzehm zzehmVar = (zzehm) this.zza.get(str2);
            zZzg = zzboVarZzE.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzehmVar == null ? "" : zzehmVar.zzb()));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = zzboVarZzE.zze(ObjectWrapper.wrap(context), this.zzg, this.zzf);
                } catch (RemoteException e2) {
                    e = e2;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e3) {
            e = e3;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.zze.zzd(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgtg.zza());
    }

    private final void zzu(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogZzv = zzv(activity, zzmVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzehx(this, alertDialogZzv, timer, zzmVar), m.D0);
    }

    private final AlertDialog zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzP(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeid
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzehm zzehmVar = (zzehm) this.zza.get(this.zzf);
            Drawable drawableZzc = zzehmVar != null ? zzehmVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i2, String str) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf != null) {
            try {
                return resourcesZzf.getString(i2);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    private static XmlResourceParser zzy(int i2) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return null;
        }
        try {
            return resourcesZzf.getLayout(i2);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzehm zzehmVar = (zzehm) this.zza.get(this.zzf);
        return zzehmVar == null ? "" : zzehmVar.zza();
    }

    public final void zzc(String str, zzdnm zzdnmVar) {
        String strZzQ = zzdnmVar.zzQ();
        String strZzB = zzdnmVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbjy zzbjyVarZzD = zzdnmVar.zzD();
        if (zzbjyVarZzD != null) {
            try {
                string = zzbjyVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbjy zzbjyVarZzP = zzdnmVar.zzP();
        Drawable drawable = null;
        if (zzbjyVarZzP != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbjyVarZzP.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzehj(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap map = new HashMap();
                char c2 = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c2 = true == zZzs ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c2 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzehu.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e2) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e2.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzflu() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzflu
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzehu.zzf(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzeih zzeihVar = (zzeih) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzeihVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzeihVar.zzb();
        this.zzf = zzeihVar.zzc();
        this.zzg = zzeihVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjH)).booleanValue()) {
            zzs(activityZza, zzmVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgtg.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzP = com.google.android.gms.ads.internal.util.zzs.zzP(activityZza);
        builderZzP.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeie
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzl(activityZza, zzmVarZzb, dialogInterface, i2);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                this.zza.zzm(zzmVarZzb, dialogInterface, i2);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(zzmVarZzb, dialogInterface);
            }
        });
        builderZzP.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeih zzeihVar = (zzeih) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzeihVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzeihVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i2] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwr
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        Notification notification = builder.f4215u;
        if (TextUtils.isEmpty(strZzz)) {
            builder.f4209e = NotificationCompat.Builder.b(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.f4209e = NotificationCompat.Builder.b(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzz));
        }
        builder.c(16);
        notification.deleteIntent = pendingIntentZzr2;
        builder.g = pendingIntentZzr;
        notification.icon = context.getApplicationInfo().icon;
        builder.f4211i = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjI)).intValue();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjK)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                Bitmap bitmapReduceLargeIconSize = NotificationCompat.reduceLargeIconSize(builder.f4206a, bitmapDecodeStream);
                PorterDuff.Mode mode = IconCompat.k;
                bitmapReduceLargeIconSize.getClass();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f4317b = bitmapReduceLargeIconSize;
                builder.f4210h = iconCompat;
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.f4317b = bitmapDecodeStream;
                bigPictureStyle.f4199b = iconCompat2;
                bigPictureStyle.f4200c = null;
                bigPictureStyle.d = true;
                builder.d(bigPictureStyle);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e2) {
            map.put("notification_not_shown_reason", e2.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        zzw(this.zzf, "dialog_click", androidx.media3.extractor.text.ttml.a.s("dialog_action", "confirm"));
        zzs(activity, zzmVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        zzw(this.zzf, "rtsdc", androidx.media3.extractor.text.ttml.a.s("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
