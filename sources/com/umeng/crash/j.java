package com.umeng.crash;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class j {
    public static boolean a(Context context, File file) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String string = sharedPreferences.getString("k_upload", null);
            UCrash.a().a("UCrash.Upload", "get upload cfg: ".concat(String.valueOf(string)));
            if (TextUtils.isEmpty(string)) {
                return true;
            }
            boolean zD = k.d(file.getPath());
            String str = AppMeasurement.CRASH_ORIGIN;
            if (!zD && !k.c(file.getPath()) && !k.b(file.getPath())) {
                if (k.e(file.getPath())) {
                    str = "custom";
                }
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
                if (jSONObjectOptJSONObject == null) {
                    return true;
                }
                boolean zEquals = "custom".equals(str);
                long j = 0;
                if (zEquals) {
                    long jOptLong = jSONObjectOptJSONObject.optLong("ts", 0L);
                    int iOptInt = jSONObjectOptJSONObject.optInt("cnt", 0);
                    if (!a(System.currentTimeMillis(), jOptLong)) {
                        iOptInt = 0;
                    }
                    return iOptInt < c.a().p;
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("time");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() < 25) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray();
                int length = jSONArrayOptJSONArray.length() - 1;
                while (length >= 0) {
                    long jOptLong2 = jSONArrayOptJSONArray.optLong(length, j);
                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                    if (jOptLong2 >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L)) {
                        jSONArray.put(jOptLong2);
                    }
                    length--;
                    jSONArrayOptJSONArray = jSONArray2;
                    j = 0;
                }
                jSONObjectOptJSONObject.put("time", jSONArray);
                sharedPreferences.edit().putString("k_upload", jSONObject.toString()).apply();
                return jSONArray.length() < 25;
            } catch (Exception unused) {
                return true;
            }
        } catch (Exception unused2) {
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void b(Context context, File file) {
        JSONObject jSONObject;
        try {
            boolean zD = k.d(file.getPath());
            String str = AppMeasurement.CRASH_ORIGIN;
            if (!zD && !k.c(file.getPath()) && !k.b(file.getPath())) {
                if (!k.e(file.getPath())) {
                    return;
                } else {
                    str = "custom";
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String string = sharedPreferences.getString("k_upload", null);
            if (TextUtils.isEmpty(string)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if ("custom".equals(str)) {
                long jOptLong = jSONObjectOptJSONObject.optLong("ts", 0L);
                int iOptInt = jSONObjectOptJSONObject.optInt("cnt", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = a(jCurrentTimeMillis, jOptLong) ? 1 + iOptInt : 1;
                jSONObjectOptJSONObject.put("ts", jCurrentTimeMillis);
                jSONObjectOptJSONObject.put("cnt", i);
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("time");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(System.currentTimeMillis());
                jSONObjectOptJSONObject.put("time", jSONArrayOptJSONArray);
            }
            jSONObject.put(str, jSONObjectOptJSONObject);
            sharedPreferences.edit().putString("k_upload", jSONObject.toString()).commit();
            UCrash.a().a("UCrash.Upload", "save cfg: ".concat(String.valueOf(jSONObject)));
        } catch (Exception e) {
            UCrash.a().a("UCrash.Upload", "save cfg failed", e);
        }
    }

    public static boolean a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static String a(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String str2 = "k_ver";
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length > 1) {
                    str2 = "k_ver_" + strArrSplit[1];
                }
            }
            return sharedPreferences.getString(str2, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context) {
        try {
            String string = context.getSharedPreferences("um_crash_cfg", 0).getString("k_generate", null);
            if (TextUtils.isEmpty(string)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(string);
            long jOptLong = jSONObject.optLong("ts", 0L);
            int iOptInt = jSONObject.optInt("cnt", 0);
            if (!a(System.currentTimeMillis(), jOptLong)) {
                iOptInt = 0;
            }
            return iOptInt < c.a().o;
        } catch (Exception unused) {
            return true;
        }
    }
}
