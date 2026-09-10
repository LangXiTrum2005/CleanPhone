package com.pgl.ssdk;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes5.dex */
public class ap extends am {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f33433n;
    private final int o;

    public ap(Context context, int i2) {
        super(context);
        this.f33433n = context;
        this.o = i2;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i2 = this.o;
        if (i2 == 222) {
            return "/ssdk/v2/r?os=0&ver=7.7.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.f33433n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&aid=" + com.pgl.ssdk.ces.b.a();
        }
        if (i2 != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&app_ver=" + ab.h(this.f33433n) + "&platform=android&ver=7.7.0.0.overseas-rc.1&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i2, byte[] bArr) {
        try {
            if (i2 == 200) {
                int i3 = this.o;
                if (i3 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).getClass();
                    return;
                }
                if (i3 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f33388a = 200;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f33390c = (String) objA;
                            a5.f33388a = 200;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f33433n);
        } catch (Throwable unused) {
        }
    }
}
