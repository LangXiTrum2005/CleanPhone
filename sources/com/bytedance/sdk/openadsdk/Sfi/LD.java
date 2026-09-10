package com.bytedance.sdk.openadsdk.Sfi;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private final Context LD;
    private SharedPreferences Lxb;
    private final String lk;

    public LD(Context context, String str) {
        this.LD = context;
        this.lk = str;
    }

    private SharedPreferences LD() {
        Context context;
        SharedPreferences sharedPreferences = this.Lxb;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.lk) || (context = this.LD) == null) {
            return null;
        }
        try {
            this.Lxb = context.getSharedPreferences(this.lk, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
        return this.Lxb;
    }

    public void Lxb(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLD.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d = (Double) obj;
                                d.doubleValue();
                                editorEdit.putFloat(next, d.floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public long LD(String str, long j) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null && sharedPreferencesLD.contains(str)) {
                return sharedPreferencesLD.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            th.getMessage();
            return j;
        }
    }

    public void Lxb(String str, long j) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLD.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public int Lxb(String str, int i) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null && sharedPreferencesLD.contains(str)) {
                return sharedPreferencesLD.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            th.getMessage();
            return i;
        }
    }

    public String Lxb(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null && sharedPreferencesLD.contains(str)) {
                return sharedPreferencesLD.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            th.getMessage();
            return str2;
        }
    }

    public boolean Lxb(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesLD = LD();
            if (sharedPreferencesLD != null && sharedPreferencesLD.contains(str)) {
                return sharedPreferencesLD.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            th.getMessage();
            return z;
        }
    }

    public void Lxb() {
        SharedPreferences sharedPreferencesLD = LD();
        if (sharedPreferencesLD != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesLD.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
