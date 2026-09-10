package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0nm {
    static final String m0 = "bidResps";
    static final String mm = "price";
    static final String mn = "networkFirmId";
    static final String mo = "adSourceId";
    static final String n0 = "demandType";
    static final String nm = "deal_type";
    static final String nn = "deal_id";
    static final String no = "tp_bid_id";
    static final String o00 = "deal_pri";
    static final String om = "reqDatetime";
    static final String on = "fillOffers";
    static final String oo = "reqId";
    long m;
    String o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<o> f42236n = new ArrayList(3);
    List<o> o0 = new ArrayList(3);

    public static class o {
        public String m;
        public String m0;
        public on0 mm;
        public int mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f42237n;
        public int o;
        public double o0;
        public int om;
        public String on;
        public String oo;

        public o() {
        }

        public final synchronized JSONObject o() {
            JSONObject jSONObject;
            jSONObject = new JSONObject();
            try {
                jSONObject.put(o0nm.mo, this.m);
                jSONObject.put("price", this.o0);
                jSONObject.put(o0nm.mn, this.f42237n);
                jSONObject.put(o0nm.n0, this.o);
                jSONObject.put(o0nm.no, this.oo);
                if (!TextUtils.isEmpty(this.on)) {
                    jSONObject.put(o0nm.nm, this.on);
                    jSONObject.put(o0nm.o00, this.mo);
                }
                if (!TextUtils.isEmpty(this.m0)) {
                    jSONObject.put(o0nm.nn, this.m0);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        public o(o0mm o0mmVar, on0 on0Var) {
            this.m = o0mmVar.m0o();
            if (on0Var != null) {
                this.o0 = on0Var.getPrice();
            } else {
                this.o0 = o0mmVar.moo();
            }
            this.f42237n = o0mmVar.nm();
            int iOm0 = o0mmVar.om0();
            if (iOm0 == 0) {
                this.o = 1;
            } else if (iOm0 == 1) {
                this.o = 2;
            } else if (iOm0 == 2) {
                this.o = 3;
            } else if (iOm0 == 3) {
                this.o = 4;
            } else if (iOm0 == 4 || iOm0 == 7) {
                this.o = 2;
            } else if (iOm0 == 8) {
                this.o = 1;
            }
            if (35 == o0mmVar.nm()) {
                this.o = 2;
            }
            this.oo = on0Var != null ? on0Var.on : "";
            this.mm = on0Var;
            this.on = on0Var != null ? on0Var.oo0() : "";
            this.om = on0Var != null ? on0Var.o0n() : 0;
            this.m0 = on0Var != null ? on0Var.ooo() : "";
            this.mo = on0Var != null ? on0Var.oom() : 0;
        }
    }

    private synchronized long n() {
        return this.m;
    }

    private synchronized JSONArray o0() {
        return n(this.f42236n);
    }

    private synchronized JSONArray oo() {
        return n(this.o0);
    }

    public final synchronized void m(String str) {
        this.o = str;
    }

    public final synchronized JSONObject o() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(oo, this.o);
            jSONObject.put(om, this.m);
            jSONObject.put(on, o0());
            jSONObject.put(m0, oo());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private synchronized List<o> n(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    o oVar = new o();
                    JSONObject jSONObject = new JSONObject(jSONArray.optString(i2));
                    oVar.m = jSONObject.getString(mo);
                    oVar.o0 = jSONObject.getDouble("price");
                    oVar.f42237n = jSONObject.getInt(mn);
                    oVar.o = jSONObject.getInt(n0);
                    if (jSONObject.has(no)) {
                        oVar.oo = jSONObject.getString(no);
                    }
                    oVar.on = jSONObject.optString(nm);
                    oVar.m0 = jSONObject.optString(nn);
                    oVar.mo = jSONObject.optInt(o00);
                    arrayList.add(oVar);
                }
                Collections.sort(arrayList, new Comparator<o>() { // from class: com.thinkup.core.common.on.o0nm.1
                    private static int o(o oVar2, o oVar3) {
                        return com.thinkup.core.common.ooo.mn.o(oVar2, oVar3);
                    }

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(o oVar2, o oVar3) {
                        return com.thinkup.core.common.ooo.mn.o(oVar2, oVar3);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    private synchronized void m(List<o> list) {
        this.o0 = list;
    }

    public final synchronized String m() {
        return this.o;
    }

    public final synchronized void m(o oVar) {
        o(this.o0, oVar);
    }

    public static o0nm o(String str) {
        o0nm o0nmVar = new o0nm();
        try {
            JSONObject jSONObject = new JSONObject(str);
            o0nmVar.m(jSONObject.getString(oo));
            o0nmVar.o(jSONObject.getLong(om));
            o0nmVar.o(o0nmVar.n(jSONObject.getString(on)));
            o0nmVar.m(o0nmVar.n(jSONObject.getString(m0)));
            return o0nmVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return o0nmVar;
        }
    }

    public final synchronized void o(long j) {
        this.m = j;
    }

    private synchronized void o(List<o> list) {
        this.f42236n = list;
    }

    public final synchronized void o(o oVar) {
        o(this.f42236n, oVar);
    }

    private synchronized void o(List<o> list, o oVar) {
        if (oVar != null) {
            if (list.size() == 0) {
                list.add(oVar);
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    i2 = -1;
                    break;
                } else if (com.thinkup.core.common.ooo.mn.o(oVar, list.get(i2)) < 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                list.add(i2, oVar);
                return;
            }
            list.add(oVar);
        }
    }

    private synchronized JSONArray n(List<o> list) {
        JSONArray jSONArray;
        jSONArray = new JSONArray();
        if (list != null) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().o());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return jSONArray;
    }
}
