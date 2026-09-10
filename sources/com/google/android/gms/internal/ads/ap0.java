package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends qh implements cv {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12475e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f12477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12479d;

    public ap0(String str, av avVar, m00 m00Var, long j10) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f12477b = jSONObject;
        this.f12479d = false;
        this.f12476a = m00Var;
        this.f12478c = j10;
        try {
            jSONObject.put("adapter_version", avVar.zzf().toString());
            jSONObject.put("sdk_version", avVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void a(zze zzeVar) {
        x1(2, zzeVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String string = parcel.readString();
            rh.f(parcel);
            zze(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            rh.f(parcel);
            synchronized (this) {
                x1(2, string2);
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void x1(int i10, String str) {
        try {
            if (this.f12479d) {
                return;
            }
            try {
                JSONObject jSONObject = this.f12477b;
                jSONObject.put("signal_error", str);
                if (((Boolean) zzba.zzc().a(am.r2)).booleanValue()) {
                    ((p9.b) zzt.zzk()).getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f12478c);
                }
                if (((Boolean) zzba.zzc().a(am.f12311q2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.f12476a.zzc(this.f12477b);
            this.f12479d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void zze(String str) {
        if (this.f12479d) {
            return;
        }
        if (str == null) {
            synchronized (this) {
                x1(2, "Adapter returned null signals");
            }
            return;
        }
        try {
            JSONObject jSONObject = this.f12477b;
            jSONObject.put("signals", str);
            if (((Boolean) zzba.zzc().a(am.r2)).booleanValue()) {
                ((p9.b) zzt.zzk()).getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f12478c);
            }
            if (((Boolean) zzba.zzc().a(am.f12311q2)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f12476a.zzc(this.f12477b);
        this.f12479d = true;
    }
}
