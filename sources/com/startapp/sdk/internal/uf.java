package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class uf implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f41545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f41546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c5 f41547c;
    public boolean d;

    public uf(SharedPreferences.Editor editor, Map map, c5 c5Var) {
        this.f41545a = editor;
        this.f41546b = map;
        this.f41547c = c5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f41547c == null || vi.a(this.f41546b.get(str), obj)) {
            return;
        }
        this.d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f41545a.apply();
        c5 c5Var = this.f41547c;
        if (c5Var == null || !this.d) {
            return;
        }
        this.d = false;
        pg.d.a(c5Var.f40853a.f40898a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f41546b.isEmpty()) {
            this.d = true;
        }
        this.f41545a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f41545a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        a(str, Boolean.valueOf(z2));
        this.f41545a.putBoolean(str, z2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        this.f41545a.putFloat(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i2) {
        a(str, Integer.valueOf(i2));
        this.f41545a.putInt(str, i2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        a(str, Long.valueOf(j));
        this.f41545a.putLong(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f41545a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f41545a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f41546b.containsKey(str)) {
            this.d = true;
        }
        this.f41545a.remove(str);
        return this;
    }
}
