package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17099c;

    public /* synthetic */ lq(int i10, Object obj, Object obj2) {
        this.f17097a = i10;
        this.f17098b = obj;
        this.f17099c = obj2;
    }

    public void a(String str, yq yqVar) {
        synchronized (this.f17098b) {
            ((HashMap) this.f17099c).put(str, yqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        switch (this.f17097a) {
            case 0:
                b30 b30Var = (b30) obj;
                nq.b(map, (qc0) this.f17098b);
                String str = (String) map.get("u");
                if (str == null) {
                    int i10 = zze.zza;
                    zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                m60 m60Var = (m60) this.f17099c;
                vd1 vd1VarR = vd1.r(nq.a(b30Var, str));
                int i11 = 0;
                mq mqVar = new mq(m60Var, str, i11);
                k00 k00Var = l00.f16608a;
                fd1 fd1VarX = zw1.x(vd1VarR, mqVar, k00Var);
                fd1VarX.addListener(new zd1(i11, fd1VarX, new so0(b30Var, 9)), k00Var);
                return;
            case 1:
                Map map2 = (Map) this.f17099c;
                kz kzVarZzD = zzt.zzD();
                Context context = (Context) this.f17098b;
                if (kzVarZzD.a(context)) {
                    String str2 = (String) map.get(X3.i.f27798j0);
                    String str3 = (String) map.get("eventId");
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 94399) {
                        if (iHashCode != 94401) {
                            if (iHashCode == 94407 && str2.equals("_ai")) {
                                kz kzVarZzD2 = zzt.zzD();
                                Map map3 = (Map) map2.get("_ai");
                                kzVarZzD2.getClass();
                                kzVarZzD2.h(context, "_ai", str3, kz.f(map3));
                                return;
                            }
                        } else if (str2.equals("_ac")) {
                            kz kzVarZzD3 = zzt.zzD();
                            Map map4 = (Map) map2.get("_ac");
                            kzVarZzD3.getClass();
                            kzVarZzD3.h(context, "_ac", str3, kz.f(map4));
                            return;
                        }
                    } else if (str2.equals("_aa")) {
                        zzt.zzD().h(context, "_aa", str3, null);
                        return;
                    }
                    int i12 = zze.zza;
                    zzo.zzf("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str4 = (String) map.get("id");
                String str5 = (String) map.get(X3.g.f27749e);
                String str6 = (String) map.get("fail_reason");
                String str7 = (String) map.get("fail_stack");
                String str8 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str7)) {
                    str6 = "Unknown Fail Reason.";
                }
                String strConcat = TextUtils.isEmpty(str7) ? "" : "\n".concat(String.valueOf(str7));
                synchronized (this.f17098b) {
                    try {
                        yq yqVar = (yq) ((HashMap) this.f17099c).remove(str4);
                        if (yqVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 50);
                            sb2.append("Received result for unexpected method invocation: ");
                            sb2.append(str4);
                            String string = sb2.toString();
                            int i13 = zze.zza;
                            zzo.zzi(string);
                            return;
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + strConcat.length());
                            sb3.append(str6);
                            sb3.append(strConcat);
                            yqVar.b(sb3.toString());
                            return;
                        }
                        if (str8 == null) {
                            yqVar.c(null);
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(str8);
                            if (zze.zzc()) {
                                String string2 = jSONObject.toString(2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                                sb4.append("Result GMSG: ");
                                sb4.append(string2);
                                zze.zza(sb4.toString());
                            }
                            yqVar.c(jSONObject);
                            break;
                        } catch (JSONException e10) {
                            yqVar.b(e10.getMessage());
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 3:
                td0 td0Var = (td0) ((WeakReference) this.f17098b).get();
                if (td0Var == null) {
                    return;
                }
                td0Var.f20314g.zza();
                ul ulVar = am.Ee;
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f17099c).get();
                    du0 du0Var = td0Var.f20317j;
                    ue0 ue0Var = td0Var.E;
                    ue0Var.getClass();
                    if (!((Boolean) zzba.zzc().a(ulVar)).booleanValue() || view == null) {
                        return;
                    }
                    String str9 = true != zzab.zza(view) ? "0" : "1";
                    lj1 lj1VarA = ue0Var.f20744a.a();
                    lj1VarA.l("action", "hcp");
                    lj1VarA.l("hcp", str9);
                    lj1VarA.k(du0Var);
                    lj1VarA.m();
                    return;
                }
                return;
            case 4:
                we0 we0Var = (we0) this.f17098b;
                try {
                    we0Var.f21502f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i14 = zze.zza;
                    zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                up upVar = (up) this.f17099c;
                we0Var.f21501e = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                if (upVar == null) {
                    int i15 = zze.zza;
                    zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                } else {
                    try {
                        upVar.zze(str10);
                        return;
                    } catch (RemoteException e11) {
                        zzo.zzl("#007 Could not call remote method.", e11);
                        return;
                    }
                }
                break;
            case 5:
                dh0 dh0Var = (dh0) this.f17098b;
                b30 b30Var2 = (b30) this.f17099c;
                d70 d70Var = dh0Var.f13531i;
                synchronized (d70Var) {
                    d70Var.f13438c.add(b30Var2);
                    y60 y60Var = d70Var.f13436a;
                    b30Var2.D("/updateActiveView", y60Var.f22180e);
                    b30Var2.D("/untrackActiveViewUnit", y60Var.f22181f);
                }
                return;
            default:
                b30 b30Var3 = (b30) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    int i16 = zze.zza;
                    zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                du0 du0VarZzC = b30Var3.zzC();
                if (du0VarZzC != null && !du0VarZzC.f13691i0) {
                    ((mx0) this.f17098b).b(str11, du0VarZzC.f13718x0, null, null);
                    return;
                }
                fu0 fu0VarR = b30Var3.r();
                if (fu0VarR == null) {
                    zzt.zzh().d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                ul0 ul0Var = (ul0) this.f17099c;
                ((p9.b) zzt.zzk()).getClass();
                tb tbVar = new tb(fu0VarR.f14546b, 2, str11, System.currentTimeMillis());
                ul0Var.getClass();
                ul0Var.a(new md0(23, ul0Var, tbVar));
                return;
        }
    }

    public lq() {
        this.f17097a = 2;
        this.f17098b = new Object();
        this.f17099c = new HashMap();
    }

    public /* synthetic */ lq(td0 td0Var, View view) {
        this.f17097a = 3;
        this.f17098b = new WeakReference(td0Var);
        if (((Boolean) zzba.zzc().a(am.Ee)).booleanValue()) {
            this.f17099c = new WeakReference(view);
        } else {
            this.f17099c = new WeakReference(null);
        }
    }
}
