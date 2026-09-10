package com.bytedance.sdk.openadsdk.wjv;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private final String ik;
    private final Context lr;
    private SharedPreferences ri;

    public ik(Context context, String str) {
        this.lr = context;
        this.ik = str;
    }

    private SharedPreferences lr() {
        Context context;
        SharedPreferences sharedPreferences = this.ri;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.ik) || (context = this.lr) == null) {
            return null;
        }
        try {
            this.ri = context.getSharedPreferences(this.ik, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
        return this.ri;
    }

    public void ri(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLr.edit();
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
                                editorEdit.putFloat(next, ((Double) obj).floatValue());
                            } else {
                                editorEdit.putString(next, String.valueOf(obj));
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

    public long lr(String str, long j) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null && sharedPreferencesLr.contains(str)) {
                return sharedPreferencesLr.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            th.getMessage();
            return j;
        }
    }

    public void ri(String str, long j) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLr.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public int ri(String str, int i) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null && sharedPreferencesLr.contains(str)) {
                return sharedPreferencesLr.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            th.getMessage();
            return i;
        }
    }

    public String ri(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null && sharedPreferencesLr.contains(str)) {
                return sharedPreferencesLr.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            th.getMessage();
            return str2;
        }
    }

    public boolean ri(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesLr = lr();
            if (sharedPreferencesLr != null && sharedPreferencesLr.contains(str)) {
                return sharedPreferencesLr.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            th.getMessage();
            return z;
        }
    }

    public <T> T ri(String str, T t, lr.ri<T> riVar) {
        String string;
        T tLr;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences sharedPreferencesLr = lr();
                if (sharedPreferencesLr != null && sharedPreferencesLr.contains(str) && (string = sharedPreferencesLr.getString(str, null)) != null && riVar != null && (tLr = riVar.lr(string)) != null) {
                    return tLr;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return t;
    }

    public void ri() {
        SharedPreferences sharedPreferencesLr = lr();
        if (sharedPreferencesLr != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesLr.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
