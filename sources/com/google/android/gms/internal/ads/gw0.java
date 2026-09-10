package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements fw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14974a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14988p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14975b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14976c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14977d = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14989q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14990r = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14978e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14979f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14980g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14981h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14982i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mw0 f14983j = mw0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14984k = "";
    public String l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14985m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14986n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14987o = false;

    public gw0(Context context, int i10) {
        this.f14974a = context;
        this.f14988p = i10;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 a(Throwable th2) {
        synchronized (this) {
            if (((Boolean) zzba.zzc().a(am.f12213ja)).booleanValue()) {
                String strZzh = zzf.zzh(zw.f(th2));
                if (strZzh == null) {
                    strZzh = "";
                }
                this.l = strZzh;
                String strF = zw.f(th2);
                t6.l lVarH = t6.l.h(new z71('\n'));
                strF.getClass();
                this.f14984k = (String) ((o81) ((p81) lVarH.f50551d).e(lVarH, strF)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 b(uw uwVar) {
        synchronized (this) {
            try {
                String str = ((fu0) uwVar.f20920d).f14546b;
                if (!TextUtils.isEmpty(str)) {
                    this.f14979f = str;
                }
                Iterator it = ((List) uwVar.f20919c).iterator();
                while (it.hasNext()) {
                    String str2 = ((du0) it.next()).f13678b0;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f14980g = str2;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 c(zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.zze;
                if (iBinder != null) {
                    aa0 aa0Var = (aa0) iBinder;
                    String str = aa0Var.f11957d;
                    if (!TextUtils.isEmpty(str)) {
                        this.f14979f = str;
                    }
                    String str2 = aa0Var.f11955b;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f14980g = str2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 e(mw0 mw0Var) {
        synchronized (this) {
            this.f14983j = mw0Var;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 g(int i10) {
        synchronized (this) {
            this.f14989q = i10;
        }
        return this;
    }

    public final synchronized void h() {
        Configuration configuration;
        zzz zzzVarZzf = zzt.zzf();
        Context context = this.f14974a;
        this.f14978e = zzzVarZzf.zzk(context);
        Resources resources = context.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f14990r = i10;
        ((p9.b) zzt.zzk()).getClass();
        this.f14975b = SystemClock.elapsedRealtime();
        this.f14987o = true;
    }

    public final synchronized void i() {
        ((p9.b) zzt.zzk()).getClass();
        this.f14976c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final /* bridge */ /* synthetic */ fw0 zza() {
        h();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final synchronized boolean zzb() {
        return this.f14987o;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final /* bridge */ /* synthetic */ fw0 zzc() {
        i();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 zzd(boolean z10) {
        synchronized (this) {
            this.f14977d = z10;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 zze(String str) {
        synchronized (this) {
            this.f14982i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 zzi(String str) {
        synchronized (this) {
            this.f14981h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final fw0 zzk(String str) {
        synchronized (this) {
            if (((Boolean) zzba.zzc().a(am.f12213ja)).booleanValue()) {
                this.f14985m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f14981h);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final synchronized hw0 zzm() {
        try {
            if (this.f14986n) {
                return null;
            }
            this.f14986n = true;
            if (!this.f14987o) {
                h();
            }
            if (this.f14976c < 0) {
                i();
            }
            return new hw0(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
