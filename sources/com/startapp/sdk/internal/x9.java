package com.startapp.sdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.ads.AdError;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.common.utils.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class x9 extends z1 {
    public final g9 j0;
    public String k0;
    public String l0;
    public String m0;
    public String n0;
    public String o0;
    public String p0;
    public Map q0;

    public x9(g9 g9Var) {
        super(8);
        this.j0 = g9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        g9 g9Var = this.j0;
        Long l2 = g9Var.f41003h;
        String string = l2 != null ? l2.toString() : AbstractC3396g.a();
        veVar.a(AbstractC3396g.f40988b, string, true, true);
        veVar.a(AbstractC3396g.f40989c, AbstractC3396g.a(string), true, true);
        veVar.a("category", g9Var.f40999a.f41046a, true, true);
        veVar.a("value", g9Var.d, false, true);
        veVar.a("d", g9Var.g, false, true);
        veVar.a("appActivity", g9Var.f41004i, false, true);
        veVar.a("details", g9Var.f41002e, false, true);
        veVar.a("detailsJson", g9Var.f, false, true);
        veVar.a("isService", Boolean.valueOf(g9Var.j), false, true);
        veVar.a("orientation", this.k0, false, true);
        veVar.a("usedRam", this.l0, false, true);
        veVar.a("freeRam", this.m0, false, true);
        veVar.a("sessionTime", null, false, true);
        veVar.a("cellScanRes", this.n0, false, true);
        veVar.a("sens", this.o0, false, true);
        veVar.a("bt", this.p0, false, true);
        Pair pairA = com.startapp.sdk.adsbase.g.a();
        Pair pairB = com.startapp.sdk.adsbase.g.b();
        veVar.a((String) pairA.first, pairA.second, false, true);
        veVar.a((String) pairB.first, pairB.second, false, true);
        Map map = this.q0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                veVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        veVar.a("rcd", null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // com.startapp.sdk.internal.z1
    public final void b(Context context, AdPreferences adPreferences) {
        String str;
        Configuration configuration;
        super.b(context, adPreferences);
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            str = AdError.UNDEFINED_DOMAIN;
        } else {
            int i2 = configuration.orientation;
            if (i2 == 2) {
                str = com.ironsource.d9.h.C;
            } else if (i2 == 1) {
                str = com.ironsource.d9.h.D;
            } else {
                str = AdError.UNDEFINED_DOMAIN;
            }
        }
        this.k0 = str;
        String[] strArr = {null, null};
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                strArr[0] = Long.toString(memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                strArr[1] = Long.toString((q0.a(memoryInfo).longValue() - memoryInfo.availMem) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
        } catch (Throwable th) {
            if (!vi.a(th, SecurityException.class) && !vi.a(th, RemoteException.class)) {
                g9.a(th);
            }
        }
        this.m0 = strArr[0];
        this.l0 = strArr[1];
    }

    public final String toString() {
        return this.j0.toString();
    }
}
