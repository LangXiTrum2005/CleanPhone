package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.X3;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uo0 implements gd0, mp0, kt0, zb0, OnCompleteListener, pq1, q81, li0, n22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20839b;

    public /* synthetic */ uo0(zz1 zz1Var, g22 g22Var, yx1 yx1Var) {
        this.f20838a = 17;
        this.f20839b = g22Var;
    }

    public static uo0 k(int i10) {
        return new uo0(zq1.a(mj1.a(i10)), 13);
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void a(Bundle bundle) {
        ((MediaCodec) this.f20839b).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.kt0
    public /* synthetic */ c50 b(jt0 jt0Var) {
        return ((yt0) this.f20839b).b(jt0Var);
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void d(int i10, qx1 qx1Var, long j10, int i11) {
        ((MediaCodec) this.f20839b).queueSecureInputBuffer(i10, 0, qx1Var.f19238i, j10, i11);
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void e(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f20839b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public void f(m80 m80Var) {
        switch (this.f20838a) {
            case 1:
                kp0 kp0Var = (kp0) this.f20839b;
                ad0 ad0Var = (ad0) m80Var;
                synchronized (kp0Var) {
                    kp0Var.f16498j = ad0Var;
                    ad0Var.a();
                    break;
                }
                return;
            default:
                l70 l70Var = (l70) m80Var;
                xs0 xs0Var = (xs0) this.f20839b;
                synchronized (xs0Var) {
                    try {
                        l70 l70Var2 = xs0Var.f22000k;
                        if (l70Var2 != null) {
                            l70Var2.d();
                        }
                        xs0Var.f22000k = l70Var;
                        b30 b30Var = l70Var.l;
                        if (b30Var != null) {
                            b30Var.X(xs0Var);
                        }
                        xs0Var.f21995f.f(new m70(l70Var, xs0Var, xs0Var.f21995f, xs0Var.f21997h));
                        l70Var.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public JSONObject g(View view) {
        int currentModeType;
        JSONObject jSONObjectA = hz0.a(0, 0, 0, 0);
        UiModeManager uiModeManager = x10.A;
        int i10 = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : v71.f21098v;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i11 == 0);
            return jSONObjectA;
        } catch (JSONException e10) {
            rb0.k("Error with setting output device status", e10);
            return jSONObjectA;
        }
    }

    public void h(int i10, long j10, by0 by0Var, String str) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("action", "start_preload");
        lj1VarA.l("sp_ts", Long.toString(j10));
        lj1VarA.l("ad_format", by0Var.a());
        lj1VarA.l("ad_unit_id", by0Var.f12922a);
        lj1VarA.l("pid", by0Var.f12924c);
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("pv", str);
        lj1VarA.m();
    }

    public void i(Exception exc) {
        v71.J("MediaCodecAudioRenderer", "Audio sink error", exc);
        iw0 iw0Var = ((w12) this.f20839b).A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new x02(iw0Var, exc, 5));
        }
    }

    public void l(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
            boolean z10 = true;
            while (it.hasNext()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z10 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            r91 r91Var = (r91) this.f20839b;
            if (r91Var == null) {
                r91Var = new r91();
                this.f20839b = r91Var;
            }
            x91 x91VarY = (x91) r91Var.get(obj);
            if (x91VarY == null) {
                x91VarY = ia1.y(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                r91 r91Var2 = (r91) this.f20839b;
                if (r91Var2 == null) {
                    r91Var2 = new r91();
                    this.f20839b = r91Var2;
                }
                r91Var2.put(obj, x91VarY);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                rb0.j(obj, next);
                x91VarY.c(next);
            }
        }
    }

    public void m(EnumMap enumMap, long j10) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("action", "start_preload");
        lj1VarA.l("sp_ts", Long.toString(j10));
        lj1VarA.l("pv", "1");
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            lj1VarA.l(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        lj1VarA.m();
    }

    public void n(int i10, int i11, long j10, Long l, String str, by0 by0Var, String str2) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("plaac_ts", Long.toString(j10));
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("cache_size", Integer.toString(i11));
        lj1VarA.l("action", "is_ad_available");
        if (by0Var != null) {
            lj1VarA.l("ad_unit_id", by0Var.f12922a);
            lj1VarA.l("pid", by0Var.f12924c);
            lj1VarA.l("ad_format", by0Var.a());
        }
        if (l != null) {
            lj1VarA.l("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            lj1VarA.l("gqi", str);
        }
        lj1VarA.l("pv", str2);
        lj1VarA.m();
    }

    public void o(long j10, int i10, int i11, String str, by0 by0Var, String str2) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("ppla_ts", Long.toString(j10));
        lj1VarA.l("ad_format", by0Var.a());
        lj1VarA.l("ad_unit_id", by0Var.f12922a);
        lj1VarA.l("pid", by0Var.f12924c);
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("cache_size", Integer.toString(i11));
        lj1VarA.l("action", "poll_ad");
        if (str != null) {
            lj1VarA.l("gqi", str);
        }
        lj1VarA.l("pv", str2);
        lj1VarA.m();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        e21 e21Var = (e21) this.f20839b;
        if (task.isCanceled()) {
            e21Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            e21Var.c(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        e21Var.d(exception);
    }

    public void p(long j10, long j11, long j12, long j13, long j14) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("action", "iic");
        lj1VarA.l("pat", Long.toString(j10));
        lj1VarA.l("bot", Long.toString(j11));
        lj1VarA.l("cim", Long.toString(j12));
        lj1VarA.l("mbot", Long.toString(j13));
        lj1VarA.l("mim", Long.toString(j14));
        lj1VarA.m();
    }

    public void q(String str, long j10, String str2, String str3, AdFormat adFormat, int i10, int i11, int i12) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("action", str);
        lj1VarA.l("pat", Long.toString(j10));
        lj1VarA.l("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("cache_size", Integer.toString(i11));
        lj1VarA.l("pas", Integer.toString(i12));
        lj1VarA.l("pv", "2");
        lj1VarA.l("ad_unit_id", str3);
        lj1VarA.l("pid", str2);
        lj1VarA.m();
    }

    public void r(String str, String str2, long j10, int i10, int i11, String str3, by0 by0Var, String str4) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l(str2, Long.toString(j10));
        if (by0Var != null) {
            lj1VarA.l("ad_unit_id", by0Var.f12922a);
            lj1VarA.l("ad_format", by0Var.a());
            lj1VarA.l("pid", by0Var.f12924c);
        }
        lj1VarA.l("action", str);
        if (str3 != null) {
            lj1VarA.l("gqi", str3);
        }
        if (i10 >= 0) {
            lj1VarA.l("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            lj1VarA.l("cache_size", Integer.toString(i11));
        }
        lj1VarA.l("pv", str4);
        lj1VarA.m();
    }

    public void s(String str, long j10, String str2, String str3, AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        lj1 lj1VarA = ((yh0) this.f20839b).a();
        lj1VarA.l("action", str);
        lj1VarA.l("pat", Long.toString(j10));
        lj1VarA.l("pid", str2);
        lj1VarA.l("ad_unit_id", str3);
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("cache_size", Integer.toString(i11));
        lj1VarA.l("tpcnt", Integer.toString(i13));
        lj1VarA.l("mpl", Integer.toString(i14));
        if (adFormat != null) {
            lj1VarA.l("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            lj1VarA.l("nptr", Integer.toString(i12));
        }
        lj1VarA.m();
    }

    @Override // com.google.android.gms.internal.ads.q81
    public /* synthetic */ Object zza() {
        int i10 = fy1.f14575z;
        return (l20) this.f20839b;
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public du0 zzb() {
        return (du0) this.f20839b;
    }

    public /* synthetic */ uo0(zz1 zz1Var, Object obj, long j10) {
        this.f20838a = 16;
        this.f20839b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pq1
    public Object zza(String str) {
        rq1 rq1Var = (rq1) this.f20839b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return rq1Var.e(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return rq1Var.e(str, null);
    }

    public /* synthetic */ uo0(Object obj, int i10) {
        this.f20838a = i10;
        this.f20839b = obj;
    }

    public uo0(int i10) {
        this.f20838a = i10;
        switch (i10) {
            case 11:
                break;
            default:
                this.f20839b = new ln.c();
                break;
        }
    }

    public uo0(b21 b21Var, du0 du0Var) {
        this.f20838a = 0;
        this.f20839b = du0Var;
    }

    public uo0(byte[] bArr) {
        this.f20838a = 9;
        this.f20839b = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i10 = 0; i10 < 256; i10++) {
            ((byte[]) this.f20839b)[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = (byte[]) this.f20839b;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
    }

    @Override // com.google.android.gms.internal.ads.mp0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo168zza() {
        switch (this.f20838a) {
            case 1:
                kp0 kp0Var = (kp0) this.f20839b;
                synchronized (kp0Var) {
                    kp0Var.f16498j = null;
                    break;
                }
                return;
            case 2:
                xs0 xs0Var = (xs0) this.f20839b;
                synchronized (xs0Var) {
                    xs0Var.f22000k = null;
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        switch (this.f20838a) {
            case 5:
                uv0 uv0Var = (uv0) this.f20839b;
                ((zv0) obj).b((vv0) uv0Var.f20913a, uv0Var.f20914b);
                break;
            case 16:
                ((a02) obj).zzo();
                break;
            default:
                ((a02) obj).l((g22) this.f20839b);
                break;
        }
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void zze() {
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.n22
    public void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public void c(boolean z10, Context context, ka0 ka0Var) {
    }
}
