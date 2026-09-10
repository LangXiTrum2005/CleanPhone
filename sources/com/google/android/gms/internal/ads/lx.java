package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17139b;

    public /* synthetic */ lx(Object obj, int i10) {
        this.f17138a = i10;
        this.f17139b = obj;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final Object apply(Object obj) {
        SharedPreferences sharedPreferences;
        int i10 = this.f17138a;
        int i11 = 2;
        int i12 = 0;
        int i13 = -1;
        String str = null;
        Object obj2 = this.f17139b;
        switch (i10) {
            case 0:
                a8 a8Var = (a8) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                ul ulVar = am.f12058a;
                zzba.zza();
                Context context = (Context) a8Var.f11926b;
                SharedPreferences sharedPreferencesA = wl.a(context);
                if (sharedPreferencesA != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    Objects.requireNonNull(zzba.zzb());
                    for (ul ulVar2 : zzba.zzb().f21194a) {
                        if (ulVar2.f20812a == 1) {
                            Object objA = ulVar2.a(jSONObject);
                            switch (ulVar2.f20816e) {
                                case 0:
                                    editorEdit.putBoolean(ulVar2.f20813b, ((Boolean) objA).booleanValue());
                                    break;
                                case 1:
                                    editorEdit.putInt(ulVar2.f20813b, ((Integer) objA).intValue());
                                    break;
                                case 2:
                                    editorEdit.putLong(ulVar2.f20813b, ((Long) objA).longValue());
                                    break;
                                case 3:
                                    editorEdit.putFloat(ulVar2.f20813b, ((Float) objA).floatValue());
                                    break;
                                default:
                                    editorEdit.putString(ulVar2.f20813b, (String) objA);
                                    break;
                            }
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzo.zzf("Flag Json is null.");
                    }
                    if (((Boolean) fn.f14476o.o()).booleanValue() || ((Boolean) fn.f14477p.o()).booleanValue()) {
                        zzba.zza();
                        editorEdit.apply();
                    } else {
                        zzba.zza();
                        editorEdit.commit();
                    }
                    if (((Boolean) fn.f14467e.o()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                        zzba.zza();
                        try {
                            sharedPreferences = context.getSharedPreferences("google_adapter_flags", 0);
                        } catch (IllegalStateException e10) {
                            zzo.zzj("", e10);
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            zzba.zzb();
                            JSONObject jSONObject2 = new JSONObject();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (next.startsWith("adapter:")) {
                                    try {
                                        jSONObject2.put(next, jSONObject.get(next));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            editorEdit2.putString("flag_configuration", jSONObject2.toString());
                            editorEdit2.apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = (SharedPreferences) a8Var.f11927c;
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                        ((p9.b) zzt.zzk()).getClass();
                        editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                    break;
                }
                return null;
            case 1:
                ng0 ng0Var = (ng0) obj2;
                b30 b30Var = (b30) obj;
                b30Var.D("/result", ng0Var.f17818h);
                g30 g30VarZzP = b30Var.zzP();
                zzb zzbVar = new zzb(ng0Var.f17813c, null, null);
                ul0 ul0Var = ng0Var.f17819i;
                mx0 mx0Var = ng0Var.f17820j;
                yh0 yh0Var = ng0Var.f17814d;
                jg0 jg0Var = ng0Var.f17811a;
                g30VarZzP.J(null, jg0Var, jg0Var, jg0Var, jg0Var, false, null, zzbVar, null, null, ul0Var, mx0Var, yh0Var, null, null, null, null, null, null, null, null, null);
                return b30Var;
            case 2:
                return ((e50) obj2).W();
            case 3:
                return ((cq0) obj2).a();
            case 4:
                ((mq0) obj2).f17516a.d("AppSetIdInfoSignal", (Exception) obj);
                return new nq0(str, i13, i12);
            case 5:
                ((f00) ((zp0) obj2).f22687b).d("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new nq0(str, i13, i11);
            case 6:
                ((qs0) obj2).f19187a.d("TrustlessTokenSignal", (Exception) obj);
                return new yp0(str, 6);
            case 7:
                fv0 fv0Var = (fv0) obj2;
                fv0Var.f14569c = (m80) obj;
                return fv0Var;
            case 8:
                return (m31) obj2;
            case 9:
                m31 m31Var = (m31) obj;
                ((q31) obj2).f18916f.set(m31Var);
                return m31Var;
            case 10:
                return new Boolean(((l61) obj2).b((l31) obj));
            case 11:
                i31 i31Var = (i31) obj;
                a71 a71Var = ((g51) obj2).f14769d;
                int iG = i31Var.G() - 1;
                if (iG == 1 || iG == 2) {
                    return i31Var;
                }
                if (iG == 3) {
                    int iG2 = i31Var.G() - 1;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iG2).length());
                    sb2.append(iG2);
                    a71Var.c(1004, sb2.toString());
                    int iG3 = i31Var.G() - 1;
                    throw new c51(l1.d.k(new StringBuilder(String.valueOf(iG3).length() + 3), "r: ", iG3));
                }
                if (iG != 12) {
                    int iG4 = i31Var.G() - 1;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iG4).length());
                    sb3.append(iG4);
                    a71Var.c(1005, sb3.toString());
                    int iG5 = i31Var.G() - 1;
                    throw new b51(l1.d.k(new StringBuilder(String.valueOf(iG5).length() + 3), "r: ", iG5));
                }
                int iG6 = i31Var.G() - 1;
                StringBuilder sb4 = new StringBuilder(String.valueOf(iG6).length());
                sb4.append(iG6);
                a71Var.c(1005, sb4.toString());
                int iG7 = i31Var.G() - 1;
                throw new a51(l1.d.k(new StringBuilder(String.valueOf(iG7).length() + 3), "r: ", iG7));
            case 12:
                f61 f61Var = (f61) obj2;
                l31 l31Var = (l31) obj;
                f61Var.getClass();
                if (l31Var == null || l31Var.equals(l31.F())) {
                    return null;
                }
                return new i01(l31Var.z(), ((z21) f61Var.f14267e.zzb()).f22476a, f61Var.f14265c.f22476a, f61Var.f14269g);
            default:
                q61 q61Var = (q61) obj2;
                String str2 = (String) obj;
                if (!pi1.l(str2)) {
                    return str2;
                }
                File file = new File(q61Var.f18950a.getPackageResourcePath());
                if (!file.exists() || !file.canRead()) {
                    return "";
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                        for (int i14 = fileInputStream.read(bArr); i14 != -1; i14 = fileInputStream.read(bArr)) {
                            messageDigest.update(bArr, 0, i14);
                        }
                        rb1 rb1VarF = rb1.f19515f.f();
                        byte[] bArrDigest = messageDigest.digest();
                        String strG = rb1VarF.g(bArrDigest.length, bArrDigest);
                        fileInputStream.close();
                        return strG;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused2) {
                    return "";
                }
        }
    }
}
