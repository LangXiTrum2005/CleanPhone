package com.bytedance.sdk.openadsdk.oth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private final String lnr;
    private SharedPreferences qdl;
    private final Context ud;

    public ud(Context context, String str) {
        this.ud = context;
        this.lnr = str;
    }

    private SharedPreferences ud() {
        Context context;
        SharedPreferences sharedPreferences = this.qdl;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.lnr) || (context = this.ud) == null) {
            return null;
        }
        try {
            this.qdl = context.getSharedPreferences(this.lnr, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.qdl;
    }

    public void qdl(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
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
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public long ud(String str, long j) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.lnr + th.getMessage());
            return j;
        }
    }

    public void qdl(String str, long j) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int qdl(String str, int i2) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getInt(str, i2);
            }
            return i2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.lnr + th.getMessage());
            return i2;
        }
    }

    public String qdl(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.lnr + th.getMessage());
            return str2;
        }
    }

    public boolean qdl(String str, boolean z2) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getBoolean(str, z2);
            }
            return z2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.lnr + th.getMessage());
            return z2;
        }
    }

    public void qdl() {
        SharedPreferences sharedPreferencesUd = ud();
        if (sharedPreferencesUd != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
