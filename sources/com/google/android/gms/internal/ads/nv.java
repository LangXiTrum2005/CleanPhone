package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nv extends md0 implements oq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b30 f17987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WindowManager f17989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sl f17990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DisplayMetrics f17991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17994k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17998p;

    public nv(b30 b30Var, Context context, sl slVar) {
        super(10, b30Var, "");
        this.f17993j = -1;
        this.f17994k = -1;
        this.f17995m = -1;
        this.f17996n = -1;
        this.f17997o = -1;
        this.f17998p = -1;
        this.f17987d = b30Var;
        this.f17988e = context;
        this.f17990g = slVar;
        this.f17989f = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.f17991h = new DisplayMetrics();
        Display defaultDisplay = this.f17989f.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f17991h);
        this.f17992i = this.f17991h.density;
        this.l = defaultDisplay.getRotation();
        zzay.zza();
        DisplayMetrics displayMetrics = this.f17991h;
        this.f17993j = zzf.zzC(displayMetrics, displayMetrics.widthPixels);
        zzay.zza();
        DisplayMetrics displayMetrics2 = this.f17991h;
        this.f17994k = zzf.zzC(displayMetrics2, displayMetrics2.heightPixels);
        b30 b30Var = this.f17987d;
        Activity activityZzj = b30Var.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.f17995m = this.f17993j;
            this.f17996n = this.f17994k;
        } else {
            zzt.zzc();
            int[] iArrZzV = zzs.zzV(activityZzj);
            zzay.zza();
            this.f17995m = zzf.zzC(this.f17991h, iArrZzV[0]);
            zzay.zza();
            this.f17996n = zzf.zzC(this.f17991h, iArrZzV[1]);
        }
        if (b30Var.zzN().b()) {
            this.f17997o = this.f17993j;
            this.f17998p = this.f17994k;
        } else {
            b30Var.measure(0, 0);
        }
        l(this.f17993j, this.f17994k, this.f17995m, this.f17996n, this.f17992i, this.l);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        sl slVar = this.f17990g;
        boolean zA = slVar.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zA2 = slVar.a(intent2);
        boolean zA3 = slVar.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = slVar.f19993b;
        try {
            jSONObjectPut = new JSONObject().put("sms", zA2).put("tel", zA).put("calendar", zA3).put("storePicture", ((Boolean) zzcb.zza(context, rl.f19604b)).booleanValue() && r9.c.a(context).f40681b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        b30Var.f("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        b30Var.getLocationOnScreen(iArr);
        zzf zzfVarZza = zzay.zza();
        int i11 = iArr[0];
        Context context2 = this.f17988e;
        m(zzfVarZza.zza(context2, i11), zzay.zza().zza(context2, iArr[1]));
        if (zzo.zzm(2)) {
            zzo.zzh("Dispatching Ready Event.");
        }
        try {
            ((b30) this.f17399b).f("onReadyEventReceived", new JSONObject().put("js", b30Var.zzs().afmaVersion));
        } catch (JSONException e11) {
            int i12 = zze.zza;
            zzo.zzg("Error occurred while dispatching ready Event.", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void m(int i10, int i11) {
        int i12;
        Context context = this.f17988e;
        int i13 = 0;
        if (context instanceof Activity) {
            zzt.zzc();
            i12 = zzs.zzW((Activity) context)[0];
        } else {
            i12 = 0;
        }
        b30 b30Var = this.f17987d;
        if (b30Var.zzN() == null || !b30Var.zzN().b()) {
            int width = b30Var.getWidth();
            int height = b30Var.getHeight();
            if (((Boolean) zzba.zzc().a(am.J0)).booleanValue()) {
                if (width == 0) {
                    width = b30Var.zzN() != null ? b30Var.zzN().f20105c : 0;
                }
                if (height != 0) {
                    i13 = height;
                } else if (b30Var.zzN() != null) {
                    i13 = b30Var.zzN().f20104b;
                }
            } else {
                i13 = height;
            }
            this.f17997o = zzay.zza().zza(context, width);
            this.f17998p = zzay.zza().zza(context, i13);
        }
        try {
            ((b30) this.f17399b).f("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11 - i12).put("width", this.f17997o).put("height", this.f17998p));
        } catch (JSONException e10) {
            int i14 = zze.zza;
            zzo.zzg("Error occurred while dispatching default position.", e10);
        }
        kv kvVar = b30Var.zzP().f14716x;
        if (kvVar != null) {
            kvVar.f16528f = i10;
            kvVar.f16529g = i11;
        }
    }
}
