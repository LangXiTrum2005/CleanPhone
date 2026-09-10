package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.B5;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13433b;

    public /* synthetic */ d60(Object obj, int i10) {
        this.f13432a = i10;
        this.f13433b = obj;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(HashMap map) {
        switch (this.f13432a) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.f12070ac)).booleanValue()) {
                    zw1.u(vd1.r(((mm0) this.f13433b).a(true)), Throwable.class, c60.f13057b, l00.f16608a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((cu0) this.f13433b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException("Invalid render_in_browser state", e10);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f13433b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) zzba.zzc().a(am.E1), str2);
                    return;
                }
                String str3 = (String) zzba.zzc().a(am.E1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listM = t6.l.h(new z71(';')).m(cookie);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        String str4 = (String) listM.get(i10);
                        t6.l lVarH = t6.l.h(new z71(B5.U));
                        str4.getClass();
                        o81 o81Var = (o81) ((p81) lVarH.f50551d).e(lVarH, str4);
                        if (!o81Var.hasNext()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 70);
                            sb2.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) o81Var.next()).concat(String.valueOf((String) zzba.zzc().a(am.f12294p1))));
                    }
                    return;
                }
                return;
        }
    }

    public d60(Context context) {
        this.f13432a = 2;
        this.f13433b = zzt.zzf().zza(context);
    }
}
