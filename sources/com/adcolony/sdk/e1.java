package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f9136a;

    public e1() {
        this(new JSONArray());
    }

    public Object a(int i2) throws JSONException {
        return this.f9136a.get(i2);
    }

    public int b(int i2) throws JSONException {
        return this.f9136a.getInt(i2);
    }

    public f1 c(int i2) {
        f1 f1Var;
        synchronized (this.f9136a) {
            try {
                JSONObject jSONObjectOptJSONObject = this.f9136a.optJSONObject(i2);
                f1Var = jSONObjectOptJSONObject != null ? new f1(jSONObjectOptJSONObject) : new f1();
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1Var;
    }

    public String d(int i2) {
        String strOptString;
        synchronized (this.f9136a) {
            strOptString = this.f9136a.optString(i2);
        }
        return strOptString;
    }

    public String e(int i2) {
        synchronized (this.f9136a) {
            try {
                if (!this.f9136a.isNull(i2)) {
                    Object objOpt = this.f9136a.opt(i2);
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

    public e1 f(int i2) {
        synchronized (this.f9136a) {
            this.f9136a.put(i2);
        }
        return this;
    }

    public String toString() {
        String string;
        synchronized (this.f9136a) {
            string = this.f9136a.toString();
        }
        return string;
    }

    public e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    public e1 a(f1 f1Var) {
        synchronized (this.f9136a) {
            this.f9136a.put(f1Var.a());
        }
        return this;
    }

    public e1 b(String str) {
        synchronized (this.f9136a) {
            this.f9136a.put(str);
        }
        return this;
    }

    public e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f9136a = jSONArray;
    }

    public String[] d() {
        String[] strArr;
        synchronized (this.f9136a) {
            try {
                strArr = new String[this.f9136a.length()];
                for (int i2 = 0; i2 < this.f9136a.length(); i2++) {
                    strArr[i2] = d(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr;
    }

    public boolean a(String str) {
        boolean z2;
        synchronized (this.f9136a) {
            z2 = false;
            for (int i2 = 0; i2 < this.f9136a.length(); i2++) {
                try {
                    if (d(i2).equals(str)) {
                        z2 = true;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z2;
    }

    public int b() {
        return this.f9136a.length();
    }

    public f1[] c() {
        f1[] f1VarArr;
        synchronized (this.f9136a) {
            try {
                f1VarArr = new f1[this.f9136a.length()];
                for (int i2 = 0; i2 < this.f9136a.length(); i2++) {
                    f1VarArr[i2] = c(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1VarArr;
    }

    public JSONArray a() {
        return this.f9136a;
    }
}
