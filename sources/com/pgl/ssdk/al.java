package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.x4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f33415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f33417c = new ArrayList();

    private al(Context context) {
        this.f33416b = null;
        this.f33416b = context;
    }

    public static al a(Context context) {
        if (f33415a == null) {
            synchronized (al.class) {
                try {
                    if (f33415a == null) {
                        f33415a = new al(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33415a;
    }

    public int b() {
        Intent intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", this.f33416b, null);
        if (intentD == null) {
            return 0;
        }
        return intentD.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", this.f33416b, null);
        if (intentD == null) {
            return 0;
        }
        return Math.round(((intentD.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / intentD.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f33417c.size() <= 0) {
            return x4.DISABLED_AUCTION_FALLBACK_ID;
        }
        List<Integer> list = this.f33417c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f33417c).toString();
    }

    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f33417c.add(Integer.valueOf(iF));
        try {
            int size = this.f33417c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f33417c.subList(size - 10, size));
                this.f33417c.clear();
                this.f33417c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
