package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f9143a;

    public f1() {
        this(new JSONObject());
    }

    public void a(f1 f1Var) {
        if (f1Var != null) {
            synchronized (this.f9143a) {
                synchronized (f1Var.f9143a) {
                    Iterator<String> itC = f1Var.c();
                    while (itC.hasNext()) {
                        String next = itC.next();
                        try {
                            this.f9143a.put(next, f1Var.f9143a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    public int b(String str) throws JSONException {
        int i2;
        synchronized (this.f9143a) {
            i2 = this.f9143a.getInt(str);
        }
        return i2;
    }

    public e1 c(String str) throws JSONException {
        e1 e1Var;
        synchronized (this.f9143a) {
            e1Var = new e1(this.f9143a.getJSONArray(str));
        }
        return e1Var;
    }

    public long d(String str) throws JSONException {
        long j;
        synchronized (this.f9143a) {
            j = this.f9143a.getLong(str);
        }
        return j;
    }

    public String e(String str) throws JSONException {
        String string;
        synchronized (this.f9143a) {
            string = this.f9143a.getString(str);
        }
        return string;
    }

    public boolean f(String str) {
        boolean zOptBoolean;
        synchronized (this.f9143a) {
            zOptBoolean = this.f9143a.optBoolean(str);
        }
        return zOptBoolean;
    }

    public Boolean g(String str) {
        Boolean boolValueOf;
        try {
            synchronized (this.f9143a) {
                boolValueOf = Boolean.valueOf(this.f9143a.getBoolean(str));
            }
            return boolValueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    public double h(String str) {
        double dOptDouble;
        synchronized (this.f9143a) {
            dOptDouble = this.f9143a.optDouble(str);
        }
        return dOptDouble;
    }

    public Integer i(String str) {
        Integer numValueOf;
        try {
            synchronized (this.f9143a) {
                numValueOf = Integer.valueOf(this.f9143a.getInt(str));
            }
            return numValueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int j(String str) {
        int iOptInt;
        synchronized (this.f9143a) {
            iOptInt = this.f9143a.optInt(str);
        }
        return iOptInt;
    }

    public e1 k(String str) {
        e1 e1Var;
        synchronized (this.f9143a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f9143a.optJSONArray(str);
                e1Var = jSONArrayOptJSONArray != null ? new e1(jSONArrayOptJSONArray) : new e1();
            } catch (Throwable th) {
                throw th;
            }
        }
        return e1Var;
    }

    public e1 l(String str) {
        e1 e1Var;
        synchronized (this.f9143a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f9143a.optJSONArray(str);
                e1Var = jSONArrayOptJSONArray != null ? new e1(jSONArrayOptJSONArray) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e1Var;
    }

    public f1 m(String str) {
        f1 f1Var;
        synchronized (this.f9143a) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f9143a.optJSONObject(str);
                f1Var = jSONObjectOptJSONObject != null ? new f1(jSONObjectOptJSONObject) : new f1();
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1Var;
    }

    public f1 n(String str) {
        f1 f1Var;
        synchronized (this.f9143a) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f9143a.optJSONObject(str);
                f1Var = jSONObjectOptJSONObject != null ? new f1(jSONObjectOptJSONObject) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1Var;
    }

    public Object o(String str) {
        Object objOpt;
        synchronized (this.f9143a) {
            objOpt = this.f9143a.isNull(str) ? null : this.f9143a.opt(str);
        }
        return objOpt;
    }

    public String p(String str) {
        String strOptString;
        synchronized (this.f9143a) {
            strOptString = this.f9143a.optString(str);
        }
        return strOptString;
    }

    public String q(String str) {
        synchronized (this.f9143a) {
            try {
                if (!this.f9143a.isNull(str)) {
                    Object objOpt = this.f9143a.opt(str);
                    if (objOpt instanceof String) {
                        return (String) objOpt;
                    }
                    if (objOpt != null) {
                        return String.valueOf(objOpt);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(String str) {
        synchronized (this.f9143a) {
            this.f9143a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f9143a) {
            string = this.f9143a.toString();
        }
        return string;
    }

    public f1(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public f1(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    public f1(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f9143a = jSONObject;
    }

    public f1 b(String str, boolean z2) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, z2);
        }
        return this;
    }

    public boolean c(String str, int i2) throws JSONException {
        synchronized (this.f9143a) {
            try {
                if (this.f9143a.has(str)) {
                    return false;
                }
                this.f9143a.put(str, i2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d() {
        return this.f9143a.length();
    }

    public void e() {
        synchronized (this.f9143a) {
            try {
                Iterator<String> itC = c();
                while (itC.hasNext()) {
                    Object objO = o(itC.next());
                    if (objO != null && (!(objO instanceof JSONArray) || ((JSONArray) objO).length() != 0)) {
                        if ((!(objO instanceof JSONObject) || ((JSONObject) objO).length() != 0) && !objO.equals("")) {
                        }
                    }
                    itC.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, String> f() {
        HashMap map = new HashMap();
        synchronized (this.f9143a) {
            try {
                Iterator<String> itC = c();
                while (itC.hasNext()) {
                    String next = itC.next();
                    map.put(next, p(next));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public f1 b(String str, int i2) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, i2);
        }
        return this;
    }

    private Iterator<String> c() {
        return this.f9143a.keys();
    }

    public f1 b(String str, long j) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, j);
        }
        return this;
    }

    public boolean a(String str) {
        boolean z2;
        synchronized (this.f9143a) {
            try {
                Iterator<String> itC = c();
                while (itC.hasNext()) {
                    if (str.equals(itC.next())) {
                        z2 = true;
                    }
                }
                z2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public f1 b(String str, double d) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, d);
        }
        return this;
    }

    public boolean a(String str, boolean z2) {
        boolean zOptBoolean;
        synchronized (this.f9143a) {
            zOptBoolean = this.f9143a.optBoolean(str, z2);
        }
        return zOptBoolean;
    }

    public boolean b() {
        return d() == 0;
    }

    public int a(String str, int i2) {
        int iOptInt;
        synchronized (this.f9143a) {
            iOptInt = this.f9143a.optInt(str, i2);
        }
        return iOptInt;
    }

    public long a(String str, long j) {
        long jOptLong;
        synchronized (this.f9143a) {
            jOptLong = this.f9143a.optLong(str, j);
        }
        return jOptLong;
    }

    public double a(String str, double d) {
        double dOptDouble;
        synchronized (this.f9143a) {
            dOptDouble = this.f9143a.optDouble(str, d);
        }
        return dOptDouble;
    }

    public f1 a(String str, String str2) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, str2);
        }
        return this;
    }

    public f1 a(String str, f1 f1Var) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, f1Var.a());
        }
        return this;
    }

    public f1 a(String str, e1 e1Var) throws JSONException {
        synchronized (this.f9143a) {
            this.f9143a.put(str, e1Var.a());
        }
        return this;
    }

    public void a(String[] strArr) {
        synchronized (this.f9143a) {
            try {
                for (String str : strArr) {
                    this.f9143a.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(e1 e1Var) {
        synchronized (this.f9143a) {
            try {
                Iterator<String> itC = c();
                while (itC.hasNext()) {
                    if (!e1Var.a(itC.next())) {
                        itC.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject a() {
        return this.f9143a;
    }
}
