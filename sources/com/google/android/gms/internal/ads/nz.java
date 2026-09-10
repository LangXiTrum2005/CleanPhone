package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18029a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18030b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f18031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lj1 f18032d;

    public nz(Context context, lj1 lj1Var) {
        this.f18031c = context;
        this.f18032d = lj1Var;
    }

    public final synchronized void a(String str) {
        try {
            HashMap map = this.f18029a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f18031c) : this.f18031c.getSharedPreferences(str, 0);
            lz lzVar = new lz(this, str);
            map.put(str, lzVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(lzVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
