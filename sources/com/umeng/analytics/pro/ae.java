package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ae extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2485a;
    private int b;
    private int c;
    private ArrayList<Pair<String, Integer>> d;

    public ae(String str, ArrayList<ac> arrayList) {
        super(str, arrayList);
    }

    public void a(int i) {
        this.f2485a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(new String(ax.a(Base64.decode(str, 0), UMUtils.genSin())));
            int length = jSONArray.length();
            if (length > 0) {
                this.d = new ArrayList<>();
            }
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : "";
                int iValueOf = jSONObject.has(com.umeng.ccg.a.B) ? Integer.valueOf(jSONObject.optInt(com.umeng.ccg.a.B)) : 1;
                if (!TextUtils.isEmpty(strOptString)) {
                    this.d.add(new Pair<>(strOptString, iValueOf));
                }
            }
            this.c = this.d.size();
        } catch (Throwable unused) {
        }
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.f2485a;
    }

    public int f() {
        return this.b;
    }

    public ArrayList<Pair<String, Integer>> g() {
        return this.d;
    }

    @Override // com.umeng.analytics.pro.ab
    public String a() {
        return super.a();
    }

    @Override // com.umeng.analytics.pro.ab
    public String b() {
        return super.b();
    }

    @Override // com.umeng.analytics.pro.ab
    public void a(String str) {
        super.a(str);
    }

    @Override // com.umeng.analytics.pro.ab
    public void b(String str) {
        super.b(str);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int i = this.f2485a;
                int i2 = 0;
                if (i != 0) {
                    if (i == 1) {
                        int randNumber = DeviceConfig.getRandNumber(0, this.c - 1);
                        String str = (String) this.d.get(randNumber).first;
                        int iIntValue = ((Integer) this.d.get(randNumber).second).intValue();
                        jSONObject.put("target", str);
                        jSONObject.put(com.umeng.ccg.a.B, iIntValue);
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "selPoclicy: 1, currIndex: " + randNumber);
                        return;
                    }
                    return;
                }
                SharedPreferences sharedPreferencesA = au.a(UMGlobalContext.getAppContext());
                if (sharedPreferencesA != null) {
                    int i3 = sharedPreferencesA.getInt(au.h, 0);
                    if (i3 < this.c) {
                        String str2 = (String) this.d.get(i3).first;
                        int iIntValue2 = ((Integer) this.d.get(i3).second).intValue();
                        jSONObject.put("target", str2);
                        jSONObject.put(com.umeng.ccg.a.B, iIntValue2);
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "selPoclicy: 0, currIndex: " + i3);
                        if (i3 < this.c - 1) {
                            i2 = i3 + 1;
                        }
                    } else {
                        String str3 = (String) this.d.get(0).first;
                        int iIntValue3 = ((Integer) this.d.get(0).second).intValue();
                        jSONObject.put("target", str3);
                        jSONObject.put(com.umeng.ccg.a.B, iIntValue3);
                    }
                    sharedPreferencesA.edit().putInt(au.h, i2).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.umeng.analytics.pro.ab, com.umeng.analytics.pro.aj
    public void b(String str, JSONObject jSONObject) {
        super.b(str, jSONObject);
        if (jSONObject.has(com.umeng.ccg.a.y)) {
            a(jSONObject.optInt(com.umeng.ccg.a.y));
        }
        if (jSONObject.has(com.umeng.ccg.a.z)) {
            b(jSONObject.optInt(com.umeng.ccg.a.z));
        }
        if (jSONObject.has("signature")) {
            c(jSONObject.optString("signature"));
        }
    }

    @Override // com.umeng.analytics.pro.ab
    public String c() {
        return super.c();
    }

    @Override // com.umeng.analytics.pro.ab, com.umeng.analytics.pro.aj
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectA = super.a(str, jSONObject);
        if (this.c == 0) {
            return null;
        }
        if (jSONObject != null) {
            try {
                jSONObjectA.put(com.umeng.ccg.a.z, this.b);
                jSONObjectA.put(com.umeng.ccg.a.y, this.f2485a);
                int iOptInt = jSONObject.optInt(com.umeng.ccg.a.j);
                if (this.b == 0 && iOptInt == 202) {
                    a(jSONObjectA);
                }
                if (this.b == 1 && iOptInt == 304) {
                    a(jSONObjectA);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObjectA;
    }
}
