package com.thinkup.core.common.o0m.m;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class om implements com.thinkup.core.common.o0m.o {
    private static final String o = "om";
    private final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42145n;
    private final int o0;

    public om(com.thinkup.core.common.o0m.n nVar) {
        this.m = nVar.o();
        this.f42145n = nVar.m();
        this.o0 = nVar.o0();
    }

    private static boolean o(int i2) {
        return i2 != 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.thinkup.core.common.o0m.o
    public final <V> V m(String str, V v) {
        if (this.m != null && !TextUtils.isEmpty(this.f42145n) && !TextUtils.isEmpty(str) && v != 0) {
            try {
                SharedPreferences sharedPreferences = this.m.getSharedPreferences(this.f42145n, 0);
                if (v instanceof String) {
                    return (V) sharedPreferences.getString(str, (String) v);
                }
                if (v instanceof Integer) {
                    return (V) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) v).intValue()));
                }
                if (v instanceof Long) {
                    return (V) Long.valueOf(sharedPreferences.getLong(str, ((Long) v).longValue()));
                }
                if (v instanceof Double) {
                    return (V) Double.valueOf(sharedPreferences.getFloat(str, Float.parseFloat(v.toString())));
                }
                if (v instanceof Float) {
                    return (V) Float.valueOf(sharedPreferences.getFloat(str, ((Float) v).floatValue()));
                }
                return v instanceof Boolean ? (V) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) v).booleanValue())) : v;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v;
    }

    public final String n() {
        return this.f42145n;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v) {
        o(str, v, this.o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.thinkup.core.common.o0m.o
    public final <V> void o(String str, V v, int i2) {
        if (this.m == null || TextUtils.isEmpty(this.f42145n) || TextUtils.isEmpty(str) || v == 0) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.m.getSharedPreferences(this.f42145n, 0).edit();
            String string = v.toString();
            if (v instanceof String) {
                editorEdit.putString(str, (String) v);
            } else if (v instanceof Integer) {
                editorEdit.putInt(str, Integer.parseInt(string));
            } else if (v instanceof Long) {
                editorEdit.putLong(str, Long.parseLong(string));
            } else if ((v instanceof Double) || (v instanceof Float)) {
                editorEdit.putFloat(str, Float.parseFloat(string));
            } else if (v instanceof Boolean) {
                editorEdit.putBoolean(str, Boolean.parseBoolean(string));
            }
            if (o(i2)) {
                editorEdit.apply();
            } else {
                editorEdit.commit();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m(String str) {
        if (this.m == null || TextUtils.isEmpty(this.f42145n)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.m.getSharedPreferences(this.f42145n, 0).edit();
            editorEdit.remove(str);
            editorEdit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final Map<String, Object> o() {
        if (this.m != null && !TextUtils.isEmpty(this.f42145n)) {
            try {
                return this.m.getSharedPreferences(this.f42145n, 0).getAll();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    @Override // com.thinkup.core.common.o0m.o
    public final void m() {
        if (this.m == null || TextUtils.isEmpty(this.f42145n)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.m.getSharedPreferences(this.f42145n, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.thinkup.core.common.o0m.o
    public final boolean o(String str) {
        if (this.m != null && !TextUtils.isEmpty(this.f42145n)) {
            try {
                return this.m.getSharedPreferences(this.f42145n, 0).contains(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }
}
