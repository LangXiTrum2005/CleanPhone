package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class td0 implements me0 {
    public zzdc C;
    public final cb0 D;
    public final ue0 E;
    public final zzb F;
    public final n90 G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0 f20309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f20310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ng0 f20311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final je0 f20312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qf f20313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ma0 f20314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ba0 f20315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pc0 f20316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final du0 f20317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final VersionInfoParcel f20318k;
    public final ou0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d70 f20319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final we0 f20320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p9.a f20321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oc0 f20322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mx0 f20323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hh0 f20324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jw0 f20325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zl0 f20326t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20328v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20327u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20329w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20330x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Point f20331y = new Point();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Point f20332z = new Point();
    public long A = 0;
    public long B = 0;

    public td0(Context context, ne0 ne0Var, JSONObject jSONObject, ng0 ng0Var, je0 je0Var, qf qfVar, ma0 ma0Var, ba0 ba0Var, pc0 pc0Var, du0 du0Var, VersionInfoParcel versionInfoParcel, ou0 ou0Var, d70 d70Var, we0 we0Var, p9.a aVar, oc0 oc0Var, mx0 mx0Var, jw0 jw0Var, zl0 zl0Var, hh0 hh0Var, ue0 ue0Var, cb0 cb0Var, zzb zzbVar, n90 n90Var) {
        this.f20308a = context;
        this.f20309b = ne0Var;
        this.f20310c = jSONObject;
        this.f20311d = ng0Var;
        this.f20312e = je0Var;
        this.f20313f = qfVar;
        this.f20314g = ma0Var;
        this.f20315h = ba0Var;
        this.f20316i = pc0Var;
        this.f20317j = du0Var;
        this.f20318k = versionInfoParcel;
        this.l = ou0Var;
        this.f20319m = d70Var;
        this.f20320n = we0Var;
        this.f20321o = aVar;
        this.f20322p = oc0Var;
        this.f20323q = mx0Var;
        this.f20325s = jw0Var;
        this.f20326t = zl0Var;
        this.f20324r = hh0Var;
        this.E = ue0Var;
        this.D = cb0Var;
        this.F = zzbVar;
        this.G = n90Var;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f20331y = new Point();
        this.f20332z = new Point();
        if (!this.f20328v) {
            this.f20322p.X0(view);
            this.f20328v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        d70 d70Var = this.f20319m;
        d70Var.getClass();
        d70Var.f13445j = new WeakReference(this);
        boolean zZza = zzbs.zza(this.f20318k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void b(View view) {
        if (!this.f20310c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = zze.zza;
            zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            we0 we0Var = this.f20320n;
            view.setOnClickListener(we0Var);
            view.setClickable(true);
            we0Var.f21503g = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f20310c);
            v71.j(this.f20311d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", l00.f16615h);
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void d(View view) {
        this.f20331y = new Point();
        this.f20332z = new Point();
        if (view != null) {
            oc0 oc0Var = this.f20322p;
            synchronized (oc0Var) {
                WeakHashMap weakHashMap = oc0Var.f18233c;
                if (weakHashMap.containsKey(view)) {
                    ((bi) weakHashMap.get(view)).l.remove(oc0Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f20328v = false;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final JSONObject e(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectM = m(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f20330x && this.f20310c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectM != null) {
                jSONObject.put("nas", jSONObjectM);
            }
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Unable to create native click meta data JSON.", e10);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void f(String str) {
        y(null, null, null, null, null, str, null, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.me0
    public final void g(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f20310c;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!this.f20330x) {
                int i11 = zze.zza;
                zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                int i12 = zze.zza;
                zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.f20308a;
        JSONObject jSONObjectZze = zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = zzbs.zzc(view2);
        boolean z12 = z11;
        JSONObject jSONObjectZzd = zzbs.zzd(context, view2);
        String strU = u(view, map);
        JSONObject jSONObjectZzf = zzbs.zzf(strU, context, this.f20332z, this.f20331y);
        if (z12) {
            try {
                Point point = this.f20332z;
                Point point2 = this.f20331y;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e10) {
                        e = e10;
                        int i13 = zze.zza;
                        zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                int i14 = zze.zza;
                zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                zzt.zzh().d("FirstPartyNativeAdCore.performCustomClickGesture", e12);
            }
        }
        y(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strU, jSONObjectZzf, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void h(Bundle bundle) {
        if (bundle == null) {
            int i10 = zze.zza;
            zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!t("touch_reporting")) {
                int i11 = zze.zza;
                zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f20313f.f19044b.zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            v();
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void i(up upVar) {
        if (!this.f20310c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = zze.zza;
            zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        we0 we0Var = this.f20320n;
        ng0 ng0Var = we0Var.f21497a;
        we0Var.f21499c = upVar;
        lq lqVar = we0Var.f21500d;
        if (lqVar != null) {
            ng0Var.c("/unconfirmedClick", lqVar);
        }
        lq lqVar2 = new lq(4, we0Var, upVar);
        we0Var.f21500d = lqVar2;
        ng0Var.b("/unconfirmedClick", lqVar2);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean j(Bundle bundle) {
        if (t("impression_reporting")) {
            return w(null, null, null, null, ((Boolean) zzba.zzc().a(am.f12104cd)).booleanValue() ? x(null) : null, zzay.zza().zzn(bundle, null), false, null);
        }
        int i10 = zze.zza;
        zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void k(zzdg zzdgVar) {
        zzew zzewVar;
        zzew zzewVar2;
        jw0 jw0Var = this.f20325s;
        du0 du0Var = this.f20317j;
        mx0 mx0Var = this.f20323q;
        try {
            if (this.f20329w) {
                return;
            }
            if (zzdgVar == null) {
                je0 je0Var = this.f20312e;
                synchronized (je0Var) {
                    zzewVar = je0Var.f16056g;
                }
                if (zzewVar != null) {
                    this.f20329w = true;
                    synchronized (je0Var) {
                        zzewVar2 = je0Var.f16056g;
                    }
                    mx0Var.b(zzewVar2.zzf(), du0Var.f13718x0, jw0Var, null);
                    z();
                    return;
                }
            }
            this.f20329w = true;
            mx0Var.b(zzdgVar.zzf(), du0Var.f13718x0, jw0Var, null);
            z();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void l(MotionEvent motionEvent, View view) {
        this.f20331y = zzbs.zzh(motionEvent, view);
        ((p9.b) this.f20321o).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.B = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f20324r.f15292a = motionEvent;
            this.A = jCurrentTimeMillis;
            this.f20332z = this.f20331y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f20331y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f20313f.f19044b.zzd(motionEventObtain);
        motionEventObtain.recycle();
        v();
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f20308a;
        JSONObject jSONObjectZze = zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = zzbs.zzc(view);
        JSONObject jSONObjectZzd = zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void n(Bundle bundle) {
        if (bundle == null) {
            int i10 = zze.zza;
            zzo.zzd("Click data is null. No click is reported.");
        } else if (t("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            y(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzay.zza().zzn(bundle, null), false, false);
        } else {
            int i11 = zze.zza;
            zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void o(zzdc zzdcVar) {
        this.C = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void p() {
        w(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void q(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        Context context = this.f20308a;
        JSONObject jSONObjectZze = zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = zzbs.zzc(view2);
        JSONObject jSONObjectZzd = zzbs.zzd(context, view2);
        String strU = u(view, map);
        y(true == ((Boolean) zzba.zzc().a(am.I4)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strU, zzbs.zzf(strU, context, this.f20332z, this.f20331y), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f20308a;
        JSONObject jSONObjectZze = zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = zzbs.zzc(view);
        JSONObject jSONObjectZzd = zzbs.zzd(context, view);
        boolean zZzi = zzbs.zzi(context, this.f20317j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f20310c);
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            if (((Boolean) zzba.zzc().a(am.B4)).booleanValue()) {
                jSONObject.put("view_signals", x(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", zzbs.zzj(context));
            v71.j(this.f20311d.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", l00.f16615h);
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Unable to create native ad signals logging JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f20308a;
        w(zzbs.zzb(context, view), zzbs.zze(context, map, map2, view, scaleType), zzbs.zzc(view), zzbs.zzd(context, view), x(view), null, zzbs.zzi(context, this.f20317j), view);
    }

    public final boolean t(String str) {
        JSONObject jSONObjectOptJSONObject = this.f20310c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final String u(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iQ = this.f20312e.q();
        if (iQ == 1) {
            return "1099";
        }
        if (iQ == 2) {
            return "2099";
        }
        if (iQ != 6) {
            return null;
        }
        return "3099";
    }

    public final void v() {
        zzb zzbVar;
        if (!((Boolean) zzba.zzc().a(am.f12352sf)).booleanValue() || (zzbVar = this.F) == null) {
            return;
        }
        zzbVar.zza();
    }

    public final boolean w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) {
        n90 n90Var;
        du0 du0Var = this.f20317j;
        Context context = this.f20308a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f20310c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().a(am.B4)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            jSONObject6.put("screen", zzbs.zzj(context));
            if (((Boolean) zzba.zzc().a(am.f12383uf)).booleanValue() && (n90Var = this.G) != null) {
                AtomicLong atomicLong = n90Var.f17723a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.Y9)).booleanValue();
            ng0 ng0Var = this.f20311d;
            if (zBooleanValue) {
                ng0Var.b("/clickRecorded", new rd0(this, 1));
            } else {
                ng0Var.b("/logScionEvent", new rd0(this, 0));
            }
            ng0Var.b("/nativeImpression", new lq(this, view));
            ng0Var.b("/nativeImpressionFlowControl", new sd0(this, this.f20323q, du0Var.f13718x0, this.f20325s));
            v71.j(ng0Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", l00.f16615h);
            if (!this.f20327u) {
                this.f20327u = zzt.zzo().zzg(context, this.f20318k.afmaVersion, du0Var.C.toString(), this.l.f18366g);
            }
            return true;
        } catch (JSONException e10) {
            int i10 = zze.zza;
            zzo.zzg("Unable to create impression JSON.", e10);
            return false;
        }
    }

    public final String x(View view) {
        if (!((Boolean) zzba.zzc().a(am.B4)).booleanValue()) {
            return null;
        }
        try {
            return this.f20313f.f19044b.zzj(this.f20308a, view, null);
        } catch (Exception unused) {
            int i10 = zze.zza;
            zzo.zzf("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    public final void y(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        List list;
        boolean z12;
        String strZzg;
        zzew zzewVar;
        p9.a aVar = this.f20321o;
        je0 je0Var = this.f20312e;
        JSONObject jSONObject7 = this.f20310c;
        try {
            v();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            ne0 ne0Var = this.f20309b;
            jSONObject8.put("has_custom_click_handler", ((ip) ne0Var.f17787g.get(je0Var.g())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", je0Var.q());
            jSONObject9.put("view_aware_api_used", z10);
            eo eoVar = this.l.f18369j;
            jSONObject9.put("custom_mute_requested", eoVar != null && eoVar.f14036g);
            synchronized (je0Var) {
                list = je0Var.f16055f;
            }
            if (list.isEmpty()) {
                z12 = false;
            } else {
                synchronized (je0Var) {
                    zzewVar = je0Var.f16056g;
                }
                if (zzewVar != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            jSONObject9.put("custom_mute_enabled", z12);
            if (this.f20320n.f21499c != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            ((p9.b) aVar).getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f20330x && this.f20310c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((ip) ne0Var.f17787g.get(je0Var.g())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.f20313f.f19044b.zzg(this.f20308a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                int i10 = zze.zza;
                zzo.zzg("Exception obtaining click signals", e10);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) zzba.zzc().a(am.f12101ca)).booleanValue()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().a(am.da)).booleanValue()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            ((p9.b) aVar).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.A);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f20317j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f20326t.x1(string, je0Var);
                }
            }
            v71.j(this.f20311d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", l00.f16615h);
        } catch (JSONException e11) {
            int i11 = zze.zza;
            zzo.zzg("Unable to create click JSON.", e11);
        }
    }

    public final void z() {
        try {
            zzdc zzdcVar = this.C;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzA() {
        ng0 ng0Var = this.f20311d;
        synchronized (ng0Var) {
            gd1 gd1Var = ng0Var.f17822m;
            if (gd1Var == null) {
                return;
            }
            tc0 tc0Var = new tc0(7);
            gd1Var.addListener(new zd1(0, gd1Var, tc0Var), ng0Var.f17815e);
            ng0Var.f17822m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzg() {
        this.f20330x = true;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean zzh() {
        return this.f20310c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final void zzq() {
        View view;
        if (this.f20310c.optBoolean("custom_one_point_five_click_enabled", false)) {
            we0 we0Var = this.f20320n;
            if (we0Var.f21499c == null || we0Var.f21502f == null) {
                return;
            }
            we0Var.f21501e = null;
            we0Var.f21502f = null;
            WeakReference weakReference = we0Var.f21503g;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                we0Var.f21503g = null;
            }
            try {
                we0Var.f21499c.zzf();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final int zzu() {
        eo eoVar = this.l.f18369j;
        if (eoVar == null) {
            return 0;
        }
        if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
            return eoVar.f14038i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.me0
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) zzba.zzc().a(am.f12216jd)).booleanValue()) {
            return this.l.f18369j.f14039j;
        }
        return true;
    }
}
