package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzdmg implements zzdnu {
    private com.google.android.gms.ads.internal.client.zzdf zzC;
    private final zzdcz zzD;
    private final zzdon zzE;
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final zzcze zzG;
    private final Context zza;
    private final zzdnw zzb;
    private final JSONObject zzc;
    private final zzdsp zzd;
    private final zzdnm zze;
    private final zzayq zzf;
    private final zzdbc zzg;
    private final zzdai zzh;
    private final zzdip zzi;
    private final zzfhr zzj;
    private final VersionInfoParcel zzk;
    private final zzfik zzl;
    private final zzcrx zzm;
    private final zzdor zzn;
    private final Clock zzo;
    private final zzdil zzp;
    private final zzfpi zzq;
    private final zzduf zzr;
    private final zzfno zzs;
    private final zzeif zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdmg(Context context, zzdnw zzdnwVar, JSONObject jSONObject, zzdsp zzdspVar, zzdnm zzdnmVar, zzayq zzayqVar, zzdbc zzdbcVar, zzdai zzdaiVar, zzdip zzdipVar, zzfhr zzfhrVar, VersionInfoParcel versionInfoParcel, zzfik zzfikVar, zzcrx zzcrxVar, zzdor zzdorVar, Clock clock, zzdil zzdilVar, zzfpi zzfpiVar, zzfno zzfnoVar, zzeif zzeifVar, zzduf zzdufVar, zzdon zzdonVar, zzdcz zzdczVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar, zzcze zzczeVar) {
        this.zza = context;
        this.zzb = zzdnwVar;
        this.zzc = jSONObject;
        this.zzd = zzdspVar;
        this.zze = zzdnmVar;
        this.zzf = zzayqVar;
        this.zzg = zzdbcVar;
        this.zzh = zzdaiVar;
        this.zzi = zzdipVar;
        this.zzj = zzfhrVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfikVar;
        this.zzm = zzcrxVar;
        this.zzn = zzdorVar;
        this.zzo = clock;
        this.zzp = zzdilVar;
        this.zzq = zzfpiVar;
        this.zzs = zzfnoVar;
        this.zzt = zzeifVar;
        this.zzr = zzdufVar;
        this.zzE = zzdonVar;
        this.zzD = zzdczVar;
        this.zzF = zzbVar;
        this.zzG = zzczeVar;
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzx = this.zze.zzx();
        if (iZzx == 1) {
            return "1099";
        }
        if (iZzx == 2) {
            return "2099";
        }
        if (iZzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpa)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z2, View view) {
        JSONException jSONException;
        zzcze zzczeVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeq)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e2) {
                    jSONException = e2;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z2);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(this.zza));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpc)).booleanValue() && (zzczeVar = this.zzG) != null && zzczeVar.zza() > 0) {
                jSONObject6.put("placement_id", zzczeVar.zza());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjP)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdmd(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdmc(this, null));
            }
            zzdsp zzdspVar = this.zzd;
            zzdspVar.zzd("/nativeImpression", new zzdme(this, view, null));
            try {
                zzdspVar.zzd("/nativeImpressionFlowControl", new zzdmf(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzcdr.zza(zzdspVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.zzu) {
                    return true;
                }
                this.zzu = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzg);
                return true;
            } catch (JSONException e3) {
                e = e3;
                jSONException = e;
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e4) {
            e = e4;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeq)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzA() {
        this.zzd.zzb();
    }

    public final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    public final /* synthetic */ zzdbc zzC() {
        return this.zzg;
    }

    public final /* synthetic */ zzdai zzD() {
        return this.zzh;
    }

    public final /* synthetic */ zzdip zzE() {
        return this.zzi;
    }

    public final /* synthetic */ zzdcz zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zZza = com.google.android.gms.ads.internal.util.zzbs.zza(this.zzk.clientJarVersion);
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

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzc(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        zzi(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzex)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy), null, z2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zze(Bundle bundle) {
        if (bundle == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, false);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzf(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z3 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue()) {
                z3 = true;
            }
        }
        if (!z3) {
            if (!this.zzx) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        boolean z4 = z3;
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy);
        if (z4) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
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
                        jSONObject.put("duration_ms", i2);
                    } catch (Exception e2) {
                        e = e2;
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e4) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e4);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, jSONObjectZzf, null, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzh() {
        return zzI();
    }

    public final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z2, boolean z3) {
        String strZzg;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdnw zzdnwVar = this.zzb;
            zzdnm zzdnmVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdnwVar.zzg(zzdnmVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdnmVar.zzx());
            jSONObject9.put("view_aware_api_used", z2);
            zzbjn zzbjnVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbjnVar != null && zzbjnVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdnmVar.zzE().isEmpty() || zzdnmVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z3) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdnwVar.zzg(zzdnmVar.zzS()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.zzf.zzb().zzg(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", e2);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjT)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjU)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzcdr.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create click JSON.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzc(motionEventObtain);
        motionEventObtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzl != null) {
                jSONObject.put("nas", jSONObjectZzl);
                return jSONObject;
            }
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native click meta data JSON.", e2);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdor zzdorVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdorVar);
        view.setClickable(true);
        zzdorVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzp(zzblp zzblpVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzblpVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdjVar == null) {
                zzdnm zzdnmVar = this.zze;
                if (zzdnmVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdnmVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(zzdjVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzC = zzdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzt() {
        try {
            com.google.android.gms.ads.internal.client.zzdf zzdfVar = this.zzC;
            if (zzdfVar != null) {
                zzdfVar.zze();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final int zzu() {
        zzbjn zzbjnVar = this.zzl.zzj;
        if (zzbjnVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue()) {
            return zzbjnVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmS)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzK(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), zzL(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeq)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzcdr.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad signals logging JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final void zzy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcdr.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmO)).booleanValue() ? zzL(null) : null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, null);
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}
