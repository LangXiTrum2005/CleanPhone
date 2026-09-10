package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8218b = new Object();

    public j5(JSONObject jSONObject) {
        this.f8217a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f8218b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f8217a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f8218b) {
            stringList = JsonUtils.getStringList(this.f8217a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f8218b) {
            this.f8217a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f8218b) {
            string = this.f8217a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f8218b) {
            zHas = this.f8217a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f8218b) {
            objOpt = this.f8217a.opt(str);
        }
        return objOpt;
    }

    public void a(l0.a aVar) {
        synchronized (this.f8218b) {
            aVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f8218b) {
            JsonUtils.putInt(this.f8217a, str, i10);
        }
    }

    public Object a(s.a aVar) {
        Object objApply;
        synchronized (this.f8218b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f8218b) {
            JsonUtils.putLong(this.f8217a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f8218b) {
            bool2 = JsonUtils.getBoolean(this.f8217a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f8218b) {
            JsonUtils.putString(this.f8217a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f8218b) {
            f11 = JsonUtils.getFloat(this.f8217a, str, f10);
        }
        return f11;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f8218b) {
            d11 = JsonUtils.getDouble(this.f8217a, str, d10);
        }
        return d11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f8218b) {
            i11 = JsonUtils.getInt(this.f8217a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f8218b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8217a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f8218b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8217a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f8218b) {
            j11 = JsonUtils.getLong(this.f8217a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f8218b) {
            string = JsonUtils.getString(this.f8217a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f8218b) {
            integerList = JsonUtils.getIntegerList(this.f8217a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f8218b) {
            JsonUtils.putBoolean(this.f8217a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f8218b) {
            JsonUtils.putObject(this.f8217a, str, obj);
        }
    }
}
