package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v10 implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20996a;

    public static int a(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzay.zza();
                i10 = zzf.zzE(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strH = d5.u.h(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i11 = zze.zza;
                zzo.zzi(strH);
            }
        }
        if (zze.zzc()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            d5.u.r(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i10);
            sb2.append(".");
            zze.zza(sb2.toString());
        }
        return i10;
    }

    public static void c(d10 d10Var, Map map) {
        z00 z00Var = d10Var.f13341g;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i10 = Integer.parseInt(str);
                if (z00Var != null) {
                    z00Var.z(i10);
                }
            } catch (NumberFormatException unused) {
                String strH = l1.d.h("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i11 = zze.zza;
                zzo.zzi(strH);
                return;
            }
        }
        if (str2 != null) {
            int i12 = Integer.parseInt(str2);
            if (z00Var != null) {
                z00Var.A(i12);
            }
        }
        if (str3 != null) {
            int i13 = Integer.parseInt(str3);
            if (z00Var != null) {
                z00Var.d(i13);
            }
        }
        if (str4 != null) {
            int i14 = Integer.parseInt(str4);
            if (z00Var != null) {
                z00Var.f(i14);
            }
        }
        if (str5 != null) {
            int i15 = Integer.parseInt(str5);
            if (z00Var == null) {
                return;
            }
            z00Var.g(i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i10;
        boolean z10;
        int i11;
        d10 d10Var;
        z00 z00Var;
        b30 b30Var = (b30) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i12 = zze.zza;
            zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numX = (b30Var.p0() == null || (d10Var = (d10) b30Var.p0().f18185f) == null || (z00Var = d10Var.f13341g) == null) ? null : z00Var.x();
        if (numValueOf2 != null && numX != null && !numValueOf2.equals(numX) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i13 = zze.zza;
            zzo.zzh("Event intended for player " + numValueOf2 + ", but sent to player " + numX + " - event ignored");
            return;
        }
        Integer num = numValueOf2;
        if (zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(string);
            zzo.zzd(sb2.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                b30Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                b30Var.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                b30Var.e("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            b30Var.e("onVideoEvent", map4);
            return;
        }
        o8 o8VarP0 = b30Var.p0();
        if (o8VarP0 == null) {
            zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals(X3.i.L);
        if (zEquals || zEquals2) {
            Context context = b30Var.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            ul ulVar = am.T4;
            if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                iMin = iA3 == -1 ? b30Var.c() : Math.min(iA3, b30Var.c());
            } else {
                if (zze.zzc()) {
                    int iC = b30Var.c();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA).length() + com.applovin.impl.ca.i(String.valueOf(iA3).length() + 72, 4, String.valueOf(iC)) + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iA3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iC);
                    sb3.append(", x ");
                    sb3.append(iA);
                    sb3.append(".");
                    zze.zza(sb3.toString());
                }
                iMin = Math.min(iA3, b30Var.c() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? b30Var.zzx() : Math.min(iA4, b30Var.zzx());
            } else {
                if (zze.zzc()) {
                    int iZzx = b30Var.zzx();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iA2).length() + com.applovin.impl.ca.i(String.valueOf(iA4).length() + 75, 4, String.valueOf(iZzx)) + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iA4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iZzx);
                    sb4.append(", y ");
                    sb4.append(iA2);
                    sb4.append(".");
                    zze.zza(sb4.toString());
                }
                iMin2 = Math.min(iA4, b30Var.zzx() - iA2);
            }
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i10 = 0;
            }
            boolean z11 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((d10) o8VarP0.f18185f) != null) {
                k9.c0.d("The underlay may only be modified from the UI thread.");
                d10 d10Var2 = (d10) o8VarP0.f18185f;
                if (d10Var2 != null) {
                    d10Var2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            j10 j10Var = new j10((String) map.get("flags"));
            if (((d10) o8VarP0.f18185f) == null) {
                n30 n30Var = (n30) o8VarP0.f18182c;
                r30 r30Var = n30Var.f17626a;
                pi1.j((gm) r30Var.L.f17037c, r30Var.J, "vpr2");
                d10 d10Var3 = new d10((Context) o8VarP0.f18181b, n30Var, i10, z11, (gm) n30Var.f17626a.L.f17037c, j10Var, (yh0) o8VarP0.f18184e);
                o8VarP0.f18185f = d10Var3;
                ((n30) o8VarP0.f18183d).addView(d10Var3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((d10) o8VarP0.f18185f).l(iA, iA2, iMin, iMin2);
                n30Var.f17626a.f19339n.l = false;
            }
            d10 d10Var4 = (d10) o8VarP0.f18185f;
            if (d10Var4 != null) {
                c(d10Var4, map);
                return;
            }
            return;
        }
        t30 t30VarZzh = b30Var.zzh();
        if (t30VarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f10 = Float.parseFloat(str6);
                    synchronized (t30VarZzh.f20140b) {
                        t30VarZzh.f20148j = f10;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (t30VarZzh.f20140b) {
                    z10 = t30VarZzh.f20146h;
                    i11 = t30VarZzh.f20143e;
                    t30VarZzh.f20143e = 3;
                }
                l00.f16613f.execute(new s30(t30VarZzh, i11, 3, z10, z10));
                return;
            }
        }
        d10 d10Var5 = (d10) o8VarP0.f18185f;
        if (d10Var5 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            b30Var.e("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = b30Var.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            z00 z00Var2 = d10Var5.f13341g;
            if (z00Var2 != null) {
                z00Var2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i14 = (int) (Float.parseFloat(str7) * 1000.0f);
                z00 z00Var3 = d10Var5.f13341g;
                if (z00Var3 == null) {
                    return;
                }
                z00Var3.p(i14);
                return;
            } catch (NumberFormatException unused5) {
                zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            d10Var5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            d10Var5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            z00 z00Var4 = d10Var5.f13341g;
            if (z00Var4 == null) {
                return;
            }
            if (TextUtils.isEmpty(d10Var5.f13347n)) {
                d10Var5.c("no_src", new String[0]);
                return;
            } else {
                z00Var4.y(d10Var5.f13347n, d10Var5.f13348o, num);
                return;
            }
        }
        if (str.equals("loadControl")) {
            c(d10Var5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                z00 z00Var5 = d10Var5.f13341g;
                if (z00Var5 == null) {
                    return;
                }
                m10 m10Var = z00Var5.f22442b;
                m10Var.f17207e = true;
                m10Var.a();
                z00Var5.zzq();
                return;
            }
            z00 z00Var6 = d10Var5.f13341g;
            if (z00Var6 == null) {
                return;
            }
            m10 m10Var2 = z00Var6.f22442b;
            m10Var2.f17207e = false;
            m10Var2.a();
            z00Var6.zzq();
            return;
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            z00 z00Var7 = d10Var5.f13341g;
            if (z00Var7 == null) {
                return;
            }
            z00Var7.m();
            return;
        }
        if (str.equals("play")) {
            z00 z00Var8 = d10Var5.f13341g;
            if (z00Var8 == null) {
                return;
            }
            z00Var8.l();
            return;
        }
        if (str.equals("show")) {
            d10Var5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) zzba.zzc().a(am.R2)).booleanValue() && TextUtils.isEmpty(str8)) {
                zzo.zzi("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                        String string2 = jSONArray.getString(i15);
                        if (!((Boolean) zzba.zzc().a(am.R2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) zzba.zzc().a(am.R2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder(str9.length() + 41);
                        sb5.append("All demuxed URLs are empty for playback: ");
                        sb5.append(str9);
                        zzo.zzi(sb5.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    zzo.zzi("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                b30Var.r0(numValueOf.intValue());
            }
            d10Var5.f13347n = str8;
            d10Var5.f13348o = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = b30Var.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f11 = iA6;
            float f12 = iA7;
            z00 z00Var9 = d10Var5.f13341g;
            if (z00Var9 != null) {
                z00Var9.q(f11, f12);
            }
            if (this.f20996a) {
                return;
            }
            b30Var.zzl();
            this.f20996a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                d10Var5.a();
                return;
            } else {
                zzo.zzi("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzo.zzi("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f13 = Float.parseFloat(str10);
            z00 z00Var10 = d10Var5.f13341g;
            if (z00Var10 == null) {
                return;
            }
            m10 m10Var3 = z00Var10.f22442b;
            m10Var3.f17208f = f13;
            m10Var3.a();
            z00Var10.zzq();
        } catch (NumberFormatException unused8) {
            zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
