package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vf implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f41584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f41585b;

    public vf(SharedPreferences sharedPreferences) {
        this.f41584a = sharedPreferences;
        this.f41585b = null;
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uf edit() {
        return new uf(this.f41584a.edit(), this.f41584a.getAll(), this.f41585b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f41584a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f41584a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z2) {
        try {
            return this.f41584a.getBoolean(str, z2);
        } catch (Throwable unused) {
            return z2;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        try {
            return this.f41584a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i2) {
        try {
            return this.f41584a.getInt(str, i2);
        } catch (Throwable unused) {
            return i2;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        try {
            return this.f41584a.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f41584a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f41584a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f41584a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f41584a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public vf(SharedPreferences sharedPreferences, c5 c5Var) {
        this.f41584a = sharedPreferences;
        this.f41585b = c5Var;
    }
}
