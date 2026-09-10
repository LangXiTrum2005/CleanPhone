package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.Xa;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 extends zv {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f22651i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f22653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yh0 f22654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzu f22655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ul0 f22656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f22657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22658h;

    public zl0(Context context, ul0 ul0Var, zzu zzuVar, yh0 yh0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f22652b = new HashMap();
        this.f22653c = context;
        this.f22654d = yh0Var;
        this.f22655e = zzuVar;
        this.f22656f = ul0Var;
    }

    public static String E1(int i10, String str) {
        Resources resourcesC = zzt.zzh().c();
        if (resourcesC == null) {
            return str;
        }
        try {
            return resourcesC.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    public static void y1(Context context, yh0 yh0Var, ul0 ul0Var, String str, String str2, Map map) {
        String strGenerateUrl;
        String str3 = true != zzt.zzh().i(context) ? "offline" : u.a.ONLINE_EXTRAS_KEY;
        if (yh0Var != null) {
            lj1 lj1VarA = yh0Var.a();
            lj1VarA.l("gqi", str);
            lj1VarA.l("action", str2);
            lj1VarA.l("device_connectivity", str3);
            ((p9.b) zzt.zzk()).getClass();
            lj1VarA.l("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                lj1VarA.l((String) entry.getKey(), (String) entry.getValue());
            }
            strGenerateUrl = ((yh0) lj1VarA.f17037c).f22254a.f13174f.generateUrl((ConcurrentHashMap) lj1VarA.f17036b);
        } else {
            strGenerateUrl = "";
        }
        String str4 = strGenerateUrl;
        ((p9.b) zzt.zzk()).getClass();
        tb tbVar = new tb(str, 2, str4, System.currentTimeMillis());
        ul0Var.getClass();
        ul0Var.a(new md0(23, ul0Var, tbVar));
    }

    public static final PendingIntent z1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return PendingIntent.getActivity(context, 0, b71.a(intent, 201326592), 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        return PendingIntent.getService(context, 0, b71.a(intent, 1140850688), 1140850688);
    }

    public final void A1(Activity activity, zzm zzmVar) {
        zzt.zzc();
        if (new b0.l0(activity).f5152b.areNotificationsEnabled()) {
            B1();
            C1(activity, zzmVar);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        db1 db1Var = db1.f13484g;
        if (i10 >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            D1(this.f22657g, "asnpdi", db1Var);
            return;
        }
        zzt.zzc();
        AlertDialog.Builder builderZzN = zzs.zzN(activity);
        builderZzN.setTitle(E1(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(E1(R.string.notifications_permission_confirm, "Allow"), new yl0(this, activity, zzmVar, 0)).setNegativeButton(E1(R.string.notifications_permission_decline, "Don't allow"), new wl0(1, this, zzmVar)).setOnCancelListener(new xl0(this, zzmVar, 1));
        builderZzN.create().show();
        D1(this.f22657g, "rtsdi", db1Var);
    }

    public final void B1() {
        boolean zZzg;
        boolean zZze;
        try {
            zzt.zzc();
            Context context = this.f22653c;
            zzbo zzboVarZzC = zzs.zzC(context);
            s9.b bVar = new s9.b(context);
            String str = this.f22658h;
            String str2 = this.f22657g;
            sl0 sl0Var = (sl0) this.f22652b.get(str2);
            zZzg = zzboVarZzC.zzg(bVar, new zza(str, str2, sl0Var == null ? "" : sl0Var.f19995b));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = zzboVarZzC.zze(new s9.b(context), this.f22658h, this.f22657g);
                } catch (RemoteException e10) {
                    e = e10;
                    int i10 = zze.zza;
                    zzo.zzg("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e11) {
            e = e11;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.f22656f.b(this.f22657g);
        D1(this.f22657g, "offline_notification_worker_not_scheduled", db1.f13484g);
    }

    public final void C1(Activity activity, zzm zzmVar) {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        zzt.zzc();
        AlertDialog.Builder onCancelListener = zzs.zzN(activity).setOnCancelListener(new w20(zzmVar, 2));
        int i10 = R.layout.offline_ads_dialog;
        Resources resourcesC = zzt.zzh().c();
        if (resourcesC == null) {
            layout = null;
        } else {
            try {
                layout = resourcesC.getLayout(i10);
            } catch (Resources.NotFoundException unused) {
                layout = null;
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(E1(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f22657g;
                HashMap map = this.f22652b;
                sl0 sl0Var = (sl0) map.get(str);
                String str2 = sl0Var == null ? "" : sl0Var.f19994a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                sl0 sl0Var2 = (sl0) map.get(this.f22657g);
                Drawable drawable = sl0Var2 != null ? sl0Var2.f19996c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(E1(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new vl0(this, alertDialogCreate, timer, zzmVar), Xa.C);
    }

    public final void D1(String str, String str2, Map map) {
        y1(this.f22653c, this.f22654d, this.f22656f, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void Y(String[] strArr, int[] iArr, s9.a aVar) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                tl0 tl0Var = (tl0) ((bm0) s9.b.y1(aVar));
                Activity activity = tl0Var.f20438a;
                zzm zzmVar = tl0Var.f20439b;
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    B1();
                    C1(activity, zzmVar);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVar != null) {
                        zzmVar.zzb();
                    }
                }
                D1(this.f22657g, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void i(s9.a aVar) {
        tl0 tl0Var = (tl0) ((bm0) s9.b.y1(aVar));
        Activity activity = tl0Var.f20438a;
        zzm zzmVar = tl0Var.f20439b;
        this.f22657g = tl0Var.f20440c;
        this.f22658h = tl0Var.f20441d;
        if (((Boolean) zzba.zzc().a(am.Q9)).booleanValue()) {
            A1(activity, zzmVar);
            return;
        }
        D1(this.f22657g, "dialog_impression", db1.f13484g);
        zzt.zzc();
        AlertDialog.Builder builderZzN = zzs.zzN(activity);
        builderZzN.setTitle(E1(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(E1(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(E1(R.string.offline_opt_in_confirm, "OK"), new yl0(this, activity, zzmVar, 1)).setNegativeButton(E1(R.string.offline_opt_in_decline, "No thanks"), new wl0(0, this, zzmVar)).setOnCancelListener(new xl0(this, zzmVar, 0));
        builderZzN.create().show();
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void s(Intent intent) {
        ul0 ul0Var = this.f22656f;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                f00 f00VarZzh = zzt.zzh();
                Context context = this.f22653c;
                boolean zI = f00VarZzh.i(context);
                HashMap map = new HashMap();
                char c4 = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c4 = true == zI ? (char) 1 : (char) 2;
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
                D1(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = ul0Var.getWritableDatabase();
                    if (c4 == 1) {
                        ul0Var.f20818b.execute(new o1(writableDatabase, stringExtra2, this.f22655e, 8));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e10) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e10.toString());
                    int i10 = zze.zza;
                    zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void u(s9.a aVar, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) s9.b.y1(aVar);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        sl0 sl0Var = (sl0) this.f22652b.get(this.f22657g);
        String str5 = sl0Var == null ? "" : sl0Var.f19994a;
        zzt.zzf().zze(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZ1 = z1(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZ2 = z1(context, "offline_notification_dismissed", str3, str2);
        b0.p pVar = new b0.p(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            pVar.f5170e = b0.p.b(E1(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            pVar.f5170e = b0.p.b(String.format(E1(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        pVar.c(16, true);
        pVar.G.deleteIntent = pendingIntentZ2;
        pVar.f5172g = pendingIntentZ1;
        pVar.G.icon = context.getApplicationInfo().icon;
        pVar.f5176k = ((Integer) zzba.zzc().a(am.R9)).intValue();
        if (!((Boolean) zzba.zzc().a(am.T9)).booleanValue() || str4.isEmpty()) {
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
                pVar.f5174i = IconCompat.b(NotificationCompat.reduceLargeIconSize(pVar.f5166a, bitmapDecodeStream));
                b0.k kVar = new b0.k();
                kVar.f5136e = IconCompat.b(bitmapDecodeStream);
                kVar.g(null);
                pVar.e(kVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, pVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str = "offline_notification_failed";
        }
        D1(str3, str, map);
    }

    public final void x1(String str, je0 je0Var) {
        mo moVar;
        String string = "";
        String strF = je0Var.f();
        String strA = je0Var.a();
        if (TextUtils.isEmpty(strF)) {
            strF = strA != null ? strA : "";
        }
        mo moVarB = je0Var.b();
        if (moVarB != null) {
            try {
                string = moVarB.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (je0Var) {
            moVar = je0Var.f16067s;
        }
        Drawable drawable = null;
        if (moVar != null) {
            try {
                s9.a aVarZzb = moVar.zzb();
                if (aVarZzb != null) {
                    drawable = (Drawable) s9.b.y1(aVarZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f22652b.put(str, new sl0(strF, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void zzg() {
        this.f22656f.a(new b21(this.f22655e, 25));
    }
}
