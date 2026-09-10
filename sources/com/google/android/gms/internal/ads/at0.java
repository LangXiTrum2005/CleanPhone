package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class at0 implements mp0, yd1, r4.f, OnFailureListener, y21, p81, pq1, nt1, li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12510b;

    public /* synthetic */ at0(zz1 zz1Var, dy1 dy1Var) {
        this.f12509a = 14;
        this.f12510b = dy1Var;
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((nt1[]) this.f12510b)[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public xt1 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            nt1 nt1Var = ((nt1[]) this.f12510b)[i10];
            if (nt1Var.a(cls)) {
                return nt1Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.y21
    public Object c(FileInputStream fileInputStream) {
        try {
            tt1 tt1VarO = ((ss1) ((rr1) this.f12510b)).o();
            ks1 ks1Var = ks1.f16518a;
            int i10 = tr1.f20473a;
            ks1 ks1Var2 = ks1.f16519b;
            rs1 rs1Var = (rs1) tt1VarO;
            rs1Var.getClass();
            es1 es1Var = new es1(fileInputStream);
            ss1 ss1VarL = ss1.l(rs1Var.f19656a, es1Var, ks1Var2);
            es1Var.B(0);
            if (ss1.w(ss1VarL, true)) {
                return ss1VarL;
            }
            throw new et1(new hu1().getMessage());
        } catch (et1 e10) {
            throw new x21("Cannot read proto.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.y21
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) {
        ((rr1) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public Iterator e(t6.l lVar, CharSequence charSequence) {
        return new l81(lVar, charSequence, new z61(((e81) this.f12510b).f13882q.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.mp0
    public void f(m80 m80Var) {
        bu0 bu0Var = (bu0) this.f12510b;
        ug0 ug0Var = (ug0) m80Var;
        synchronized (bu0Var) {
            try {
                bu0Var.f12893d = ug0Var;
                if (((Boolean) zzba.zzc().a(am.C4)).booleanValue()) {
                    ug0Var.f20784u.f17548a = bu0Var.f12892c;
                }
                bu0Var.f12893d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        hz hzVar = (hz) this.f12510b;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((qz0) hzVar.f15435d).c(2025, -1L, exc);
    }

    @Override // r4.f
    public void onPostMessage(WebView webView, r4.d dVar, Uri uri, boolean z10, r4.a aVar) {
        oy0 oy0Var = (oy0) this.f12510b;
        try {
            JSONObject jSONObject = new JSONObject(dVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                oy0Var.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap map = oy0Var.f18408d;
                ky0 ky0Var = (ky0) map.get(string2);
                if (ky0Var != null) {
                    ky0Var.c();
                    map.remove(string2);
                }
            }
        } catch (JSONException e10) {
            rb0.k("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        ((fw0) this.f12510b).zza();
    }

    @Override // com.google.android.gms.internal.ads.y21
    public /* synthetic */ Object zzc() {
        return (rr1) this.f12510b;
    }

    public /* synthetic */ at0(zz1 zz1Var, g22 g22Var, yx1 yx1Var) {
        this.f12509a = 13;
        this.f12510b = g22Var;
    }

    @Override // com.google.android.gms.internal.ads.pq1
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((rq1) this.f12510b).e(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public /* synthetic */ at0(Object obj, int i10) {
        this.f12509a = i10;
        this.f12510b = obj;
    }

    @Override // com.google.android.gms.internal.ads.mp0
    /* JADX INFO: renamed from: zza */
    public void mo168zza() {
        bu0 bu0Var = (bu0) this.f12510b;
        synchronized (bu0Var) {
            bu0Var.f12893d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        switch (this.f12509a) {
            case 12:
                ((oe) obj).k((lt) this.f12510b);
                break;
            case 13:
                ((a02) obj).n((g22) this.f12510b);
                break;
            default:
                ((a02) obj).k((dy1) this.f12510b);
                break;
        }
    }
}
