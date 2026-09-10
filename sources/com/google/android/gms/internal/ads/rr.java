package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Ve;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rr implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19642b;

    public /* synthetic */ rr(ty0 ty0Var, at0 at0Var) {
        this.f19641a = 12;
        this.f19642b = ty0Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) throws JSONException, ck0 {
        int length;
        wv1 wv1Var;
        gd1 gd1VarZ;
        nq0 nq0Var;
        fv0 fv0Var;
        bt0 bt0Var;
        int i10 = 0;
        int i11 = 2;
        int i12 = 5;
        int i13 = 4;
        int i14 = 1;
        switch (this.f19641a) {
            case 0:
                pr prVar = (pr) obj;
                m00 m00Var = new m00();
                qr qrVar = new qr(this, m00Var);
                nr nrVar = (nr) this.f19642b;
                Parcel parcelQ = prVar.q();
                rh.c(parcelQ, nrVar);
                rh.e(parcelQ, qrVar);
                prVar.u1(parcelQ, 2);
                return m00Var;
            case 1:
                zy zyVar = (zy) this.f19642b;
                Map map = (Map) obj;
                zyVar.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = zyVar.f22769h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            try {
                                                wv1Var = (wv1) zyVar.f22763b.get(str);
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                    break;
                                }
                                if (wv1Var == null) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb2.append("Cannot find the corresponding resource object for ");
                                    sb2.append(str);
                                    x10.j(sb2.toString());
                                } else {
                                    for (int i15 = 0; i15 < length; i15++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i15).getString("threat_type");
                                        wv1Var.b();
                                        ((xv1) wv1Var.f19193b).F(string);
                                    }
                                    zyVar.f22767f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        if (((Boolean) on.f18306a.o()).booleanValue()) {
                            int i16 = zze.zza;
                            zzo.zze("Failed to get SafeBrowsing metadata", e10);
                        }
                        return zw1.l(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (zyVar.f22767f) {
                    synchronized (zyVar.f22769h) {
                        dv1 dv1Var = zyVar.f22762a;
                        dv1Var.b();
                        ((ew1) dv1Var.f19193b).N(10);
                        break;
                    }
                }
                boolean z10 = zyVar.f22767f;
                if (!(z10 && zyVar.f22768g.f12550g) && (!(zyVar.f22772k && zyVar.f22768g.f12549f) && (z10 || !zyVar.f22768g.f12547d))) {
                    return be1.f12743b;
                }
                synchronized (zyVar.f22769h) {
                    try {
                        for (wv1 wv1Var2 : zyVar.f22763b.values()) {
                            dv1 dv1Var2 = zyVar.f22762a;
                            xv1 xv1Var = (xv1) wv1Var2.e();
                            dv1Var2.b();
                            ((ew1) dv1Var2.f19193b).G(xv1Var);
                        }
                        dv1 dv1Var3 = zyVar.f22762a;
                        ArrayList arrayList = zyVar.f22764c;
                        dv1Var3.b();
                        ((ew1) dv1Var3.f19193b).L(arrayList);
                        ArrayList arrayList2 = zyVar.f22765d;
                        dv1Var3.b();
                        ((ew1) dv1Var3.f19193b).M(arrayList2);
                        if (((Boolean) on.f18306a.o()).booleanValue()) {
                            String strZ = ((ew1) dv1Var3.f19193b).z();
                            String strB = ((ew1) dv1Var3.f19193b).B();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strZ).length() + 38 + String.valueOf(strB).length() + 15);
                            sb3.append("Sending SB report\n  url: ");
                            sb3.append(strZ);
                            sb3.append("\n  clickUrl: ");
                            sb3.append(strB);
                            sb3.append("\n  resources: \n");
                            StringBuilder sb4 = new StringBuilder(sb3.toString());
                            for (xv1 xv1Var2 : Collections.unmodifiableList(((ew1) dv1Var3.f19193b).A())) {
                                sb4.append("    [");
                                sb4.append(xv1Var2.A());
                                sb4.append("] ");
                                sb4.append(xv1Var2.z());
                            }
                            x10.j(sb4.toString());
                        }
                        ListenableFuture listenableFutureZzb = new zzbl(zyVar.f22766e).zzb(1, zyVar.f22768g.f12545b, null, ((ew1) dv1Var3.e()).b());
                        if (((Boolean) on.f18306a.o()).booleanValue()) {
                            listenableFutureZzb.addListener(bf.f12746b, l00.f16608a);
                        }
                        gd1VarZ = zw1.z(listenableFutureZzb, i6.f15604d, l00.f16615h);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return gd1VarZ;
            case 2:
                String str2 = (String) zzba.zzc().a(am.Qb);
                Uri.Builder builder = (Uri.Builder) this.f19642b;
                builder.appendQueryParameter(str2, "12");
                return zw1.d(builder.toString());
            case 3:
                ((o8) this.f19642b).zza((Throwable) obj);
                return be1.f12743b;
            case 4:
                return ((wk0) this.f19642b).a((mx) obj);
            case 5:
                zk0 zk0Var = (zk0) obj;
                return zw1.d(new ju0(new uo0(((lk0) this.f19642b).f17041c, i13), uw.a(new InputStreamReader(zk0Var.f22647a), zk0Var.f22648b.f17577m)));
            case 6:
                nk0 nk0Var = (nk0) this.f19642b;
                return zw1.d(new ju0(new uo0(nk0Var.f17849d, i13), uw.a(new StringReader(((JSONObject) obj).toString()), nk0Var.f17859o)));
            case 7:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f19642b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put(Ve.f27442n, jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zw1.d(jSONObject);
                } catch (JSONException e11) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e11.getCause())));
                }
            case 8:
                vp0 vp0Var = (vp0) this.f19642b;
                Throwable th5 = (Throwable) obj;
                if (((Boolean) zzba.zzc().a(am.f12176h3)).booleanValue()) {
                    bs0 bs0Var = (bs0) vp0Var.f21229c;
                    f00 f00VarZzh = zzt.zzh();
                    int iZzb = bs0Var.zzb();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb).length() + 22);
                    sb5.append("OptionalSignalTimeout:");
                    sb5.append(iZzb);
                    f00VarZzh.d(sb5.toString(), th5);
                }
                return be1.f12743b;
            case 9:
                Throwable th6 = (Throwable) obj;
                String str5 = "";
                ((k00) ((gs0) this.f19642b).f14944c).a(new x60(th6, 21));
                if (th6 instanceof SecurityException) {
                    nq0Var = new nq0(str5, i11, i14);
                } else if (th6 instanceof IllegalStateException) {
                    nq0Var = new nq0(str5, 3, i14);
                } else if (th6 instanceof IllegalArgumentException) {
                    nq0Var = new nq0(str5, i13, i14);
                } else {
                    nq0Var = th6 instanceof TimeoutException ? new nq0(str5, i12, i14) : new nq0(str5, i10, i14);
                }
                return zw1.d(nq0Var);
            case 10:
                return zw1.d(new yp0((String) ((jq0) this.f19642b).f16150c, i12));
            case 11:
                v90 v90Var = (v90) this.f19642b;
                lv0 lv0Var = (lv0) obj;
                if (lv0Var == null || (fv0Var = lv0Var.f17133a) == null || (bt0Var = lv0Var.f17134b) == null) {
                    throw new ck0(1, "Empty prefetch");
                }
                ok okVarZ = tk.z();
                mk mkVarA = nk.A();
                mkVarA.b();
                ((nk) mkVarA.f19193b).B();
                qk qkVarA = qk.A();
                mkVarA.b();
                ((nk) mkVarA.f19193b).C(qkVarA);
                okVarZ.b();
                ((tk) okVarZ.f19193b).A((nk) mkVarA.e());
                fv0Var.f14567a.zza().f21107f.u0((tk) okVarZ.e());
                return v90Var.k(fv0Var, bt0Var.f12882b);
            case 12:
                ty0 ty0Var = (ty0) this.f19642b;
                Exception exc = (Exception) obj;
                synchronized (ty0Var) {
                    try {
                        ty0Var.f20529b = true;
                        throw exc;
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 13:
                return zw1.d(((qv0) this.f19642b).zza(obj));
            case 14:
                m31 m31Var = (m31) obj;
                if (m31Var != null) {
                    return zw1.d(m31Var);
                }
                p31 p31Var = (p31) this.f19642b;
                p31Var.f18473e.b(51);
                return zw1.x(vd1.r(zw1.o(p31Var.f18472d, new o31(p31Var, p31Var.f18474f))), c60.f13068n, td1.f20333a);
            case 15:
                return ((p51) this.f19642b).f18532b.zze();
            default:
                return ((y51) this.f19642b).f22155c.zzb();
        }
    }

    public /* synthetic */ rr(Object obj, int i10) {
        this.f19641a = i10;
        this.f19642b = obj;
    }

    public rr(p31 p31Var) {
        this.f19641a = 14;
        Objects.requireNonNull(p31Var);
        this.f19642b = p31Var;
    }

    public rr(i9.i iVar, nr nrVar) {
        this.f19641a = 0;
        this.f19642b = nrVar;
    }
}
