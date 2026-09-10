package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile i0 f2439a;
    private Context b;
    private List<Integer> c = new ArrayList();

    private i0(Context context) {
        this.b = null;
        this.b = context;
    }

    public static i0 a(Context context) {
        if (f2439a == null) {
            synchronized (i0.class) {
                try {
                    if (f2439a == null) {
                        f2439a = new i0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2439a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.c.size() <= 0) {
            return "-1";
        }
        List<Integer> list = this.c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.c).toString();
    }

    @SuppressLint({"DefaultLocale"})
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
        this.c.add(Integer.valueOf(iF));
        try {
            int size = this.c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.c.subList(size - 10, size));
                this.c.clear();
                this.c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
