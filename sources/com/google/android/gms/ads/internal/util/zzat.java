package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ij0;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.lj0;
import defpackage.e;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj0 f11041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PointF f11048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f11049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f11050k;
    public final Runnable l;

    public zzat(Context context) {
        this.f11046g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzat zzatVar = this.f11039a;
                zzatVar.f11046g = 4;
                zzatVar.zzb();
            }
        };
        this.f11040a = context;
        this.f11047h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzs().zza();
        this.f11050k = com.google.android.gms.ads.internal.zzt.zzs().zzb();
        this.f11041b = com.google.android.gms.ads.internal.zzt.zzo().zzb();
    }

    public static final int c(ArrayList arrayList, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final boolean a(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f11048i.x - f10);
        int i10 = this.f11047h;
        return fAbs < ((float) i10) && Math.abs(this.f11048i.y - f11) < ((float) i10) && Math.abs(this.f11049j.x - f12) < ((float) i10) && Math.abs(this.f11049j.y - f13) < ((float) i10);
    }

    public final void b(Context context) {
        final int i10;
        ArrayList arrayList = new ArrayList();
        int iC = c(arrayList, "None", true);
        final int iC2 = c(arrayList, "Shake", true);
        final int iC3 = c(arrayList, "Flick", true);
        int iOrdinal = this.f11041b.f17028r.ordinal();
        if (iOrdinal != 1) {
            i10 = iOrdinal != 2 ? iC : iC3;
        } else {
            i10 = iC2;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzN = zzs.zzN(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderZzN.setTitle("Setup gesture");
        builderZzN.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderZzN.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                this.f11024a.zzb();
            }
        });
        builderZzN.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzat zzatVar = this.f11025a;
                lj0 lj0Var = zzatVar.f11041b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i10) {
                    if (atomicInteger2.get() == iC2) {
                        lj0Var.h(ij0.f15769b, true);
                    } else if (atomicInteger2.get() == iC3) {
                        lj0Var.h(ij0.f15770c, true);
                    } else {
                        lj0Var.h(ij0.f15768a, true);
                    }
                }
                zzatVar.zzb();
            }
        });
        builderZzN.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.f11030a.zzb();
            }
        });
        builderZzN.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f11042c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f11045f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f11044e);
        sb2.append(",Ad Unit ID: ");
        return e.q(this.f11043d, "}", sb2);
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f11046g = 0;
            this.f11048i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f11046g;
        if (i10 == -1) {
            return;
        }
        Runnable runnable = this.l;
        Handler handler = this.f11050k;
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f11046g = 5;
                this.f11049j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(runnable, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12065a6)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !a(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f11046g = -1;
            handler.removeCallbacks(runnable);
        }
    }

    public final void zzb() {
        try {
            Context context = this.f11040a;
            if (!(context instanceof Activity)) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzo().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzo().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iC = c(arrayList, "Ad information", true);
            final int iC2 = c(arrayList, str, true);
            final int iC3 = c(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue();
            final int iC4 = c(arrayList, "Open ad inspector", zBooleanValue);
            final int iC5 = c(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzN = zzs.zzN(context);
            builderZzN.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
                    final zzat zzatVar = this.f11012a;
                    lj0 lj0Var = zzatVar.f11041b;
                    if (i11 != iC) {
                        if (i11 == iC2) {
                            int i12 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Creative Preview] selected.");
                            l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzat zzatVar2 = zzatVar;
                                    zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
                                    Context context2 = zzatVar2.f11040a;
                                    String str3 = zzatVar2.f11043d;
                                    String str4 = zzatVar2.f11044e;
                                    zzaxVarZzo.getClass();
                                    String strB = zzax.b(context2, zzaxVarZzo.c(context2, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12097c6), str3, str4).toString(), str4);
                                    if (TextUtils.isEmpty(strB)) {
                                        int i13 = zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strB.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            zzaxVarZzo.f11063f = jSONObject.optString("status");
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue()) {
                                                String str5 = zzaxVarZzo.f11063f;
                                                boolean z10 = "0".equals(str5) || "2".equals(str5);
                                                zzaxVarZzo.zzj(z10);
                                                com.google.android.gms.ads.internal.zzt.zzh().g().zzM(!z10 ? "" : str3);
                                            }
                                            synchronized (zzaxVarZzo.f11058a) {
                                                zzaxVarZzo.f11060c = strOptString;
                                            }
                                            String str6 = zzaxVarZzo.f11063f;
                                            if ("2".equals(str6)) {
                                                int i14 = zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Creative is not pushed for this device.");
                                                zzaxVarZzo.a(context2, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(str6)) {
                                                int i15 = zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd("The app is not linked for creative preview.");
                                                zzaxVarZzo.zzf(context2, str3, str4);
                                                return;
                                            } else {
                                                if ("0".equals(str6)) {
                                                    int i16 = zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for in app preview.");
                                                    zzaxVarZzo.a(context2, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e10) {
                                            int i17 = zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e10);
                                        }
                                    }
                                    zzaxVarZzo.a(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        }
                        if (i11 == iC3) {
                            int i13 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Troubleshooting] selected.");
                            l00.f16608a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzat zzatVar2 = zzatVar;
                                    zzatVar2.getClass();
                                    zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
                                    String str3 = zzatVar2.f11043d;
                                    String str4 = zzatVar2.f11044e;
                                    String str5 = zzatVar2.f11045f;
                                    boolean zZzm = zzaxVarZzo.zzm();
                                    Context context2 = zzatVar2.f11040a;
                                    zzaxVarZzo.zzl(zzaxVarZzo.zze(context2, str3, str4));
                                    if (!zzaxVarZzo.zzm()) {
                                        zzaxVarZzo.zzf(context2, str3, str4);
                                        return;
                                    }
                                    if (!zZzm && !TextUtils.isEmpty(str5)) {
                                        zzaxVarZzo.zzh(context2, str4, str5, str3);
                                    }
                                    int i14 = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for debug signals.");
                                    zzaxVarZzo.a(context2, "The device is successfully linked for troubleshooting.", false, true);
                                }
                            });
                            return;
                        }
                        if (i11 == iC4) {
                            final k00 k00Var = l00.f16613f;
                            k00 k00Var2 = l00.f16608a;
                            if (lj0Var.f()) {
                                k00Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzat zzatVar2 = zzatVar;
                                        zzatVar2.getClass();
                                        com.google.android.gms.ads.internal.zzt.zzo().zzc(zzatVar2.f11040a);
                                    }
                                });
                                return;
                            } else {
                                k00Var2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
                                        final zzat zzatVar2 = zzatVar;
                                        Context context2 = zzatVar2.f11040a;
                                        if (!zzaxVarZzo.zze(context2, zzatVar2.f11043d, zzatVar2.f11044e)) {
                                            com.google.android.gms.ads.internal.zzt.zzo().zzf(context2, zzatVar2.f11043d, zzatVar2.f11044e);
                                        } else {
                                            k00Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzat zzatVar3 = zzatVar2;
                                                    zzatVar3.getClass();
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzc(zzatVar3.f11040a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i11 == iC5) {
                            final k00 k00Var3 = l00.f16613f;
                            k00 k00Var4 = l00.f16608a;
                            if (lj0Var.f()) {
                                k00Var3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzat zzatVar2 = zzatVar;
                                        zzatVar2.b(zzatVar2.f11040a);
                                    }
                                });
                                return;
                            } else {
                                k00Var4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzax zzaxVarZzo = com.google.android.gms.ads.internal.zzt.zzo();
                                        final zzat zzatVar2 = zzatVar;
                                        Context context2 = zzatVar2.f11040a;
                                        if (!zzaxVarZzo.zze(context2, zzatVar2.f11043d, zzatVar2.f11044e)) {
                                            com.google.android.gms.ads.internal.zzt.zzo().zzf(context2, zzatVar2.f11043d, zzatVar2.f11044e);
                                        } else {
                                            k00Var3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzat zzatVar3 = zzatVar2;
                                                    zzatVar3.b(zzatVar3.f11040a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzatVar.f11040a;
                    if (!(context2 instanceof Activity)) {
                        int i14 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = zzatVar.f11042c;
                    final String str4 = "No debug information";
                    if (!TextUtils.isEmpty(str3)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        Map mapZzT = zzs.zzT(uriBuild);
                        for (String str5 : mapZzT.keySet()) {
                            sb2.append(str5);
                            sb2.append(" = ");
                            sb2.append((String) mapZzT.get(str5));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str4 = strTrim;
                        }
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    AlertDialog.Builder builderZzN2 = zzs.zzN(context2);
                    builderZzN2.setMessage(str4);
                    builderZzN2.setTitle("Ad Information");
                    builderZzN2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // android.content.DialogInterface.OnClickListener
                        public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i15) {
                            zzat zzatVar2 = zzatVar;
                            zzatVar2.getClass();
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzs.zzY(zzatVar2.f11040a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str4), "Share via"));
                        }
                    });
                    builderZzN2.setNegativeButton("Close", zzao.f11033a);
                    builderZzN2.create().show();
                }
            });
            builderZzN.create().show();
        } catch (WindowManager.BadTokenException e10) {
            zze.zzb("", e10);
        }
    }

    public final void zzc(String str) {
        this.f11043d = str;
    }

    public final void zzd(String str) {
        this.f11044e = str;
    }

    public final void zze(String str) {
        this.f11042c = str;
    }

    public final void zzf(String str) {
        this.f11045f = str;
    }

    public zzat(Context context, String str) {
        this(context);
        this.f11042c = str;
    }
}
