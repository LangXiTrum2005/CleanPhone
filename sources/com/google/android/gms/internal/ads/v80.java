package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk0 f21102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ou0 f21103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yv0 f21104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w50 f21105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fo0 f21106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vb0 f21107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ju0 f21108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vu0 f21109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s90 f21110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f21111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wk0 f21112k;
    public final sm0 l;

    public v80(nk0 nk0Var, ou0 ou0Var, yv0 yv0Var, w50 w50Var, fo0 fo0Var, vb0 vb0Var, ju0 ju0Var, vu0 vu0Var, s90 s90Var, k00 k00Var, wk0 wk0Var, sm0 sm0Var) {
        this.f21102a = nk0Var;
        this.f21103b = ou0Var;
        this.f21104c = yv0Var;
        this.f21105d = w50Var;
        this.f21106e = fo0Var;
        this.f21107f = vb0Var;
        this.f21108g = ju0Var;
        this.f21109h = vu0Var;
        this.f21110i = s90Var;
        this.f21111j = k00Var;
        this.f21112k = wk0Var;
        this.l = sm0Var;
    }

    public final uv0 a(ListenableFuture listenableFuture) {
        if (this.f21108g != null) {
            yv0 yv0Var = this.f21104c;
            vv0 vv0Var = vv0.SERVER_TRANSACTION;
            Objects.requireNonNull(yv0Var);
            return new v90(yv0Var, vv0Var, null, yv0.f22377d, Collections.EMPTY_LIST, zw1.d(this.f21108g)).m();
        }
        ej ejVarZzj = zzt.zzj();
        ejVarZzj.getClass();
        if (((Boolean) zzba.zzc().a(am.f12298p5)).booleanValue()) {
            synchronized (ejVarZzj.f13990c) {
                try {
                    ejVarZzj.d();
                    ScheduledFuture scheduledFuture = ejVarZzj.f13988a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ejVarZzj.f13988a = l00.f16611d.schedule(ejVarZzj.f13989b, ((Long) zzba.zzc().a(am.f12314q5)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f21104c.a(listenableFuture, vv0.SERVER_TRANSACTION).g(new rr(this.f21112k, 4)).m();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:105:0x026d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0275  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:31:0x009e, B:33:0x00c0, B:35:0x00c8, B:37:0x00d5, B:39:0x00ef, B:43:0x011f, B:46:0x012a, B:48:0x0132, B:50:0x0138, B:54:0x0141, B:63:0x0179, B:57:0x0155, B:62:0x0164, B:65:0x017e, B:42:0x0109, B:66:0x0192, B:73:0x01b1, B:76:0x01b9, B:80:0x01db, B:82:0x01f1, B:86:0x0212, B:88:0x0227, B:91:0x023b, B:93:0x0241, B:94:0x024e, B:96:0x0251, B:99:0x025a, B:98:0x0257, B:87:0x021c, B:83:0x0203, B:79:0x01c7, B:70:0x01a0, B:71:0x01a5), top: B:138:0x009e, inners: #4, #7 }] */
    public final uv0 b() {
        zzc zzcVar;
        uc1 uc1VarL;
        String strOptString;
        String strOptString2;
        String strOptString3;
        int i10;
        String str;
        List listAsList;
        String string;
        ou0 ou0Var = this.f21103b;
        if (!ou0Var.f18380v) {
            zzm zzmVar = ou0Var.f18363d;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                yv0 yv0Var = this.f21104c;
                vv0 vv0Var = vv0.PRELOADED_LOADER;
                Objects.requireNonNull(yv0Var);
                nk0 nk0Var = this.f21102a;
                if (((Boolean) zzba.zzc().a(am.U2)).booleanValue()) {
                    nk0Var.f17859o = nk0Var.f17849d.f18378t;
                    com.applovin.impl.ca.s((p9.b) zzt.zzk(), nk0Var.f17854i, "scar-preloader-ready");
                }
                String strA = nk0Var.f17849d.f18363d.zzx;
                if (TextUtils.isEmpty(strA)) {
                    zzcVar = nk0Var.f17849d.f18363d.zzs;
                    if (zzcVar != null) {
                        if (((Boolean) zzba.zzc().a(am.W7)).booleanValue()) {
                            String str2 = zzcVar.zza;
                            String str3 = zzcVar.zzb;
                            strOptString = "";
                            strOptString = new JSONObject(str2).optString("request_id", "");
                            strOptString2 = "";
                            strOptString2 = new JSONObject(str3).optString("request_id", "");
                            if (TextUtils.isEmpty(strOptString2)) {
                            }
                            nk0Var.f17854i.f21514a.put("ridmm", com.ironsource.mediationsdk.metadata.a.f29610g);
                            uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                        }
                        uc1VarL = nk0Var.a(zzcVar.zza, nk0Var.c(zzcVar.zzb));
                    } else {
                        uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                    }
                } else {
                    String strSubstring = "";
                    try {
                        strSubstring = new JSONObject(strA).optString("request_id", "");
                    } catch (JSONException unused) {
                    }
                    ul ulVar = am.f12134e8;
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && strSubstring.isEmpty()) {
                        int iLastIndexOf = strA.lastIndexOf("&request_id=");
                        strSubstring = iLastIndexOf != -1 ? strA.substring(iLastIndexOf + 12) : "";
                    }
                    String str4 = strSubstring;
                    if (TextUtils.isEmpty(str4)) {
                        uc1VarL = zw1.l(new eo0(15, "Invalid ad string."));
                    } else {
                        synchronized (nk0Var.l) {
                            try {
                                zzq zzqVar = (zzq) nk0Var.f17846a.S.zzb();
                                wh0 wh0Var = nk0Var.f17854i;
                                String strZzb = zzqVar.zzb(str4, wh0Var);
                                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && !TextUtils.isEmpty(strZzb)) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject = new JSONObject(strZzb).optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                                        if (jSONObjectOptJSONObject != null) {
                                            String strOptString4 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                            if (((Boolean) zzba.zzc().a(am.f12166g8)).booleanValue()) {
                                                listAsList = Arrays.asList(((String) zzba.zzc().a(am.h8)).split(","));
                                            } else {
                                                listAsList = Arrays.asList(((String) zzba.zzc().a(am.f12150f8)).split(","));
                                            }
                                            if (listAsList.contains(zzv.zzb(strOptString4))) {
                                                int iLastIndexOf2 = strA.lastIndexOf(X3.j.f27832c);
                                                String strSubstring2 = iLastIndexOf2 != -1 ? strA.substring(0, iLastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(strSubstring2)) {
                                                    try {
                                                        byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                                                        byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
                                                        if (TextUtils.isEmpty(strZzb)) {
                                                            string = null;
                                                        } else {
                                                            try {
                                                                string = new JSONObject(strZzb).getString("arek");
                                                            } catch (JSONException e10) {
                                                                zze.zza("Failed to get key from QueryJSONMap".concat(e10.toString()));
                                                                zzt.zzh().d("CryptoUtils.getKeyFromQueryJsonMap", e10);
                                                                string = null;
                                                            }
                                                        }
                                                        strA = su0.a(bArrDecode, bytes, string, wh0Var);
                                                    } catch (IllegalArgumentException e11) {
                                                        zze.zza("Failed to decode the adResponse. ".concat(e11.toString()));
                                                        zzt.zzh().d("PreloadedLoader.decryptAdResponseIfNecessary", e11);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                }
                                if (TextUtils.isEmpty(strA)) {
                                    strOptString3 = "";
                                } else {
                                    try {
                                        strOptString3 = new JSONObject(strA).optString("render_id", "");
                                    } catch (JSONException unused3) {
                                        strOptString3 = "";
                                    }
                                }
                                String str5 = strOptString3;
                                if (TextUtils.isEmpty(str5)) {
                                    i10 = 0;
                                    str = null;
                                } else {
                                    String str6 = "";
                                    try {
                                        str6 = new String(Base64.decode(str5, 0), StandardCharsets.UTF_8);
                                    } catch (IllegalArgumentException e12) {
                                        zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str5)));
                                        zzt.zzh().d("PreloadedLoader.decodeRenderId", e12);
                                    }
                                    List listM = t6.l.h(new z71(':')).m(str6);
                                    if (listM.size() == 2) {
                                        str = (String) listM.get(0);
                                        i10 = Integer.parseInt((String) listM.get(1));
                                    } else {
                                        zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str5)));
                                        i10 = 0;
                                        str = null;
                                    }
                                }
                                Pair pair = str != null ? new Pair(str, Integer.valueOf(i10)) : new Pair("", 0);
                                String str7 = (String) pair.first;
                                int iIntValue = ((Integer) pair.second).intValue();
                                if (TextUtils.isEmpty(str7) || iIntValue <= 0) {
                                    zzqVar.zzc(str4);
                                    if (TextUtils.isEmpty(strZzb)) {
                                        zzcVar = nk0Var.f17849d.f18363d.zzs;
                                        if (zzcVar != null) {
                                            if (((Boolean) zzba.zzc().a(am.W7)).booleanValue()) {
                                                String str8 = zzcVar.zza;
                                                String str9 = zzcVar.zzb;
                                                strOptString = "";
                                                try {
                                                    strOptString = new JSONObject(str8).optString("request_id", "");
                                                } catch (JSONException unused4) {
                                                }
                                                strOptString2 = "";
                                                try {
                                                    strOptString2 = new JSONObject(str9).optString("request_id", "");
                                                } catch (JSONException unused5) {
                                                }
                                                if (TextUtils.isEmpty(strOptString2) && strOptString.equals(strOptString2)) {
                                                    ((zzq) nk0Var.f17846a.S.zzb()).zzc(strOptString);
                                                    nk0Var.f17854i.f21514a.put("request_id", strOptString);
                                                } else {
                                                    nk0Var.f17854i.f21514a.put("ridmm", com.ironsource.mediationsdk.metadata.a.f29610g);
                                                    uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                                                }
                                            }
                                            uc1VarL = nk0Var.a(zzcVar.zza, nk0Var.c(zzcVar.zzb));
                                        } else {
                                            uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                                        }
                                    } else {
                                        uc1VarL = nk0Var.a(strA, nk0Var.c(strZzb));
                                    }
                                } else if (zzqVar.zzd(str4, str7)) {
                                    uc1VarL = zw1.l(new eo0(10, "The ad has already been shown."));
                                } else {
                                    if (!zzqVar.zze(str4, str7, iIntValue)) {
                                        zzqVar.zzc(str4);
                                    }
                                    if (TextUtils.isEmpty(strZzb)) {
                                        uc1VarL = nk0Var.a(strA, nk0Var.c(strZzb));
                                    } else {
                                        zzcVar = nk0Var.f17849d.f18363d.zzs;
                                        if (zzcVar != null) {
                                            if (((Boolean) zzba.zzc().a(am.W7)).booleanValue()) {
                                                String str10 = zzcVar.zza;
                                                String str11 = zzcVar.zzb;
                                                strOptString = "";
                                                strOptString = new JSONObject(str10).optString("request_id", "");
                                                strOptString2 = "";
                                                strOptString2 = new JSONObject(str11).optString("request_id", "");
                                                if (TextUtils.isEmpty(strOptString2)) {
                                                }
                                                nk0Var.f17854i.f21514a.put("ridmm", com.ironsource.mediationsdk.metadata.a.f29610g);
                                                uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                                            }
                                            uc1VarL = nk0Var.a(zzcVar.zza, nk0Var.c(zzcVar.zzb));
                                        } else {
                                            uc1VarL = zw1.l(new eo0(14, "Mismatch request IDs."));
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                return new v90(yv0Var, vv0Var, null, yv0.f22377d, Collections.EMPTY_LIST, uc1VarL).m();
            }
        }
        return a(this.f21110i.b());
    }

    public final uv0 c(ListenableFuture listenableFuture) {
        v90 v90VarG = this.f21104c.a(listenableFuture, vv0.RENDERER).d(new b21(this, 14)).g(this.f21106e);
        if (!((Boolean) zzba.zzc().a(am.I6)).booleanValue()) {
            long jIntValue = ((Integer) zzba.zzc().a(am.J6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            v90VarG = v90VarG.l(jIntValue);
        }
        return v90VarG.m();
    }
}
