package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41717c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b6 f41718e;
    public vh f;
    public final double g = Math.random();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f41719h = "e106";

    public yh(Context context, lb lbVar, lb lbVar2, lb lbVar3, b6 b6Var) {
        this.f41715a = context;
        this.f41716b = lbVar;
        this.f41717c = lbVar2;
        this.d = lbVar3;
        this.f41718e = b6Var;
    }

    public final vh a(Class cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f41715a.getSystemService("phone");
        if (telephonyManager != null) {
            return Build.VERSION.SDK_INT < 31 ? new xh(this, telephonyManager, cls) : new uh(this, telephonyManager, cls);
        }
        return null;
    }

    public final void b() {
        vh vhVarA;
        try {
            if (a() == null || (vhVarA = a(SignalStrength.class)) == null) {
                return;
            }
            vhVarA.a();
        } catch (Throwable th) {
            if (a(8)) {
                g9.a(th);
            }
        }
    }

    public final TelephonyMetadata a() {
        Boolean boolB = ((h6) this.d.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f41718e.getClass();
            TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
            if (telephonyMetadataA0 != null && telephonyMetadataA0.c()) {
                return telephonyMetadataA0;
            }
        }
        return null;
    }

    public final boolean a(int i2) {
        TelephonyMetadata telephonyMetadataA = a();
        return telephonyMetadataA != null && this.g < telephonyMetadataA.b() && (telephonyMetadataA.a() & i2) == i2;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            this.f41719h = String.valueOf(signalStrength.getLevel());
        } catch (NoSuchMethodException unused) {
            this.f41719h = "e104";
        } catch (Throwable unused2) {
            this.f41719h = "e105";
        }
    }

    public final Map a(h9 h9Var) {
        List listA;
        TelephonyMetadata telephonyMetadataA = a();
        if (telephonyMetadataA == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = null;
        for (Map.Entry entry : ((vf) this.f41717c.a()).getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) entry.getKey();
                TelephonyDataConfig telephonyDataConfigA = telephonyMetadataA.a(str);
                if (telephonyDataConfigA.c() && (listA = telephonyDataConfigA.a()) != null && listA.contains(h9Var.f41046a)) {
                    String strB = telephonyDataConfigA.b();
                    if (strB != null) {
                        str = strB;
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(str, (String) value);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
