package com.smartdigimkt.j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.smartdigimkt.g8.a {
    private static final String d = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36126c;

    public e(com.smartdigimkt.g8.d dVar) {
        this.f36124a = dVar.a();
        this.f36125b = dVar.b();
        this.f36126c = dVar.d();
    }

    private boolean a(int i2) {
        return i2 != 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.g8.a
    public <V> V b(String str, V v) {
        if (this.f36124a != null && !TextUtils.isEmpty(this.f36125b) && !TextUtils.isEmpty(str) && v != 0) {
            try {
                SharedPreferences sharedPreferences = this.f36124a.getSharedPreferences(this.f36125b, 0);
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
                if (v instanceof Boolean) {
                    return (V) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) v).booleanValue()));
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v;
    }

    @Override // com.smartdigimkt.g8.a
    public void clear() {
        if (this.f36124a == null || TextUtils.isEmpty(this.f36125b)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.f36124a.getSharedPreferences(this.f36125b, 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.g8.a
    public boolean contains(String str) {
        if (this.f36124a != null && !TextUtils.isEmpty(this.f36125b)) {
            try {
                return this.f36124a.getSharedPreferences(this.f36125b, 0).contains(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    @Override // com.smartdigimkt.g8.a
    public Map<String, Object> getAll() {
        if (this.f36124a != null && !TextUtils.isEmpty(this.f36125b)) {
            try {
                return this.f36124a.getSharedPreferences(this.f36125b, 0).getAll();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    @Override // com.smartdigimkt.g8.a
    public void remove(String str) {
        if (this.f36124a == null || TextUtils.isEmpty(this.f36125b)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.f36124a.getSharedPreferences(this.f36125b, 0).edit();
            editorEdit.remove(str);
            editorEdit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v) {
        a(str, v, this.f36126c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.g8.a
    public <V> void a(String str, V v, int i2) {
        if (this.f36124a == null || TextUtils.isEmpty(this.f36125b) || TextUtils.isEmpty(str) || v == 0) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = this.f36124a.getSharedPreferences(this.f36125b, 0).edit();
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
            if (a(i2)) {
                editorEdit.apply();
            } else {
                editorEdit.commit();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public String a() {
        return this.f36125b;
    }
}
