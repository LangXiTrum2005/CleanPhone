package com.thinkup.core.m;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.smartdigimkt.n8.g;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mo;
import com.thinkup.core.common.on.o0mm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static int nm = -1;
    private static volatile m nn;
    private static SimpleDateFormat o00;
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> m;
    ConcurrentHashMap<String, Long> m0;
    ConcurrentHashMap<String, Long> mm;
    ConcurrentHashMap<String, Long> mn;
    ConcurrentHashMap<String, Long> mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> f42391n;
    ConcurrentHashMap<String, Long> n0;
    ConcurrentHashMap<String, Long> no;
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> o0;
    private oo o0n;
    private final com.thinkup.core.common.oo.o o0o;
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> om;
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> on;
    ConcurrentHashMap<String, com.thinkup.core.common.on.o0> oo;
    private o oo0;
    private o oom;
    private o oon;
    private o ooo;
    final String o = "m";
    private final Object o0m = new Object();

    /* JADX INFO: renamed from: com.thinkup.core.m.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ String m;
        final /* synthetic */ String o;

        public AnonymousClass1(String str, String str2) {
            this.o = str;
            this.m = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (m.this.o0o != null) {
                m.this.o0o.oo(this.o, this.m);
            }
        }
    }

    public static class o {
        private int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f42393n;
        private int o;
        private Map<String, Pair<Integer, Integer>> o0;
        private Map<String, Pair<Integer, Integer>> oo;

        public final void m(int i2) {
            this.m = i2;
        }

        public final void n(Map<String, Pair<Integer, Integer>> map) {
            this.oo = map;
        }

        public final void o(int i2) {
            this.o = i2;
        }

        public final Map<String, Pair<Integer, Integer>> o0() {
            return this.o0;
        }

        public final Map<String, Pair<Integer, Integer>> oo() {
            return this.oo;
        }

        public final void m(Map<String, Pair<Integer, Integer>> map) {
            this.o0 = map;
        }

        public final Map<String, Pair<Integer, Integer>> n() {
            return this.f42393n;
        }

        public final void o(Map<String, Pair<Integer, Integer>> map) {
            this.f42393n = map;
        }

        public final int m() {
            return this.m;
        }

        public final int o() {
            return this.o;
        }
    }

    private m(Context context) {
        this.o0o = com.thinkup.core.common.oo.o.o(com.thinkup.core.common.oo.oo.o(context));
        o00 = new SimpleDateFormat(g.f37185a);
        try {
            com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass1(o(new Date()), m(new Date())), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.m = new ConcurrentHashMap<>(3);
        this.f42391n = new ConcurrentHashMap<>(3);
        this.o0 = new ConcurrentHashMap<>(3);
        this.oo = new ConcurrentHashMap<>(3);
        this.om = new ConcurrentHashMap<>();
        this.on = new ConcurrentHashMap<>(3);
        this.m0 = new ConcurrentHashMap<>(3);
        this.mm = new ConcurrentHashMap<>(3);
        this.mo = new ConcurrentHashMap<>(3);
        this.mn = new ConcurrentHashMap<>(3);
        this.no = new ConcurrentHashMap<>(3);
        this.n0 = new ConcurrentHashMap<>(3);
    }

    public static String m(Date date) {
        if (o00 == null) {
            o00 = new SimpleDateFormat(g.f37185a);
        }
        return o00.format(date).substring(8, 10);
    }

    public static String n(Date date) {
        if (o00 == null) {
            o00 = new SimpleDateFormat(g.f37185a);
        }
        return o00.format(date).substring(11, 13);
    }

    private ConcurrentHashMap<String, Long> o0() {
        return this.mm;
    }

    private oo om() {
        if (this.o0n == null) {
            synchronized (this.o0m) {
                this.o0n = new oo(this.o0o);
            }
        }
        return this.o0n;
    }

    private ConcurrentHashMap<String, Long> oo() {
        return this.no;
    }

    public static m o(Context context) {
        if (nn == null) {
            synchronized (m.class) {
                try {
                    if (nn == null) {
                        nn = new m(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nn;
    }

    public final void o0(o0mm o0mmVar) {
        if (o0mmVar.m0m0() == null || this.o0o == null) {
            return;
        }
        om().o(o0mmVar);
    }

    private ConcurrentHashMap<String, com.thinkup.core.common.on.o0> m() {
        return this.f42391n;
    }

    private ConcurrentHashMap<String, com.thinkup.core.common.on.o0> n() {
        return this.om;
    }

    public final void m(int i2, long j, int i3, String str, String str2) {
        Pair<Integer, Integer> pair;
        String str3 = str;
        try {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(String.valueOf(i3))) {
                o oVar = this.oon;
                if (oVar != null) {
                    Map<String, Pair<Integer, Integer>> mapO0 = oVar.o0();
                    if (mapO0 != null && !mapO0.isEmpty() && (pair = mapO0.get(String.valueOf(i3))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                        com.thinkup.core.common.on.o0 o0Var = this.oo.get(String.valueOf(i3));
                        if (o0Var == null) {
                            o0Var = new com.thinkup.core.common.on.o0("1", String.valueOf(i3), "network_id", System.currentTimeMillis(), 1);
                            this.oo.put(String.valueOf(i3), o0Var);
                        } else if (System.currentTimeMillis() - o0Var.mo() > ((Integer) pair.second).intValue()) {
                            o0Var.o(System.currentTimeMillis());
                            o0Var.o = 1;
                        } else {
                            o0Var.o++;
                        }
                        o0Var.toString();
                        this.o0o.m(String.valueOf(i3), "network_id", o0Var.o, o0Var.mo());
                    }
                    Map<String, Pair<Integer, Integer>> mapOo = this.oon.oo();
                    if (mapOo != null && !mapOo.isEmpty()) {
                        Pair<Integer, Integer> pair2 = mapOo.get(i3 + "_" + str2);
                        if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                            com.thinkup.core.common.on.o0 o0Var2 = this.on.get(i3 + "_" + str2);
                            if (o0Var2 == null) {
                                o0Var2 = new com.thinkup.core.common.on.o0("1", i3 + "_" + str2, com.thinkup.core.common.oo.o.C0684o.om, System.currentTimeMillis(), 1);
                                this.on.put(i3 + "_" + str2, o0Var2);
                            } else if (System.currentTimeMillis() - o0Var2.mo() > ((Integer) pair2.second).intValue()) {
                                o0Var2.o(System.currentTimeMillis());
                                o0Var2.o = 1;
                            } else {
                                o0Var2.o++;
                            }
                            o0Var2.toString();
                            this.o0o.m(i3 + "_" + str2, com.thinkup.core.common.oo.o.C0684o.om, o0Var2.o, o0Var2.mo());
                        }
                    }
                }
                if (i2 <= 0 || j <= 0) {
                    return;
                }
                com.thinkup.core.common.on.o0 o0Var3 = this.om.get(str3);
                if (o0Var3 == null) {
                    com.thinkup.core.common.on.o0 o0Var4 = new com.thinkup.core.common.on.o0("1", str, com.thinkup.core.common.oo.o.C0684o.m0, System.currentTimeMillis(), 1);
                    str3 = str;
                    this.om.put(str3, o0Var4);
                    o0Var3 = o0Var4;
                } else if (System.currentTimeMillis() - o0Var3.mo() > j) {
                    o0Var3.o(System.currentTimeMillis());
                    o0Var3.o = 1;
                } else {
                    o0Var3.o++;
                }
                this.o0o.m(str3, com.thinkup.core.common.oo.o.C0684o.m0, o0Var3.o, o0Var3.mo());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void n(o0mm o0mmVar) {
        if (o0mmVar.m0m0() == null || this.o0o == null) {
            return;
        }
        om().n(o0mmVar);
    }

    private com.thinkup.core.common.oo.o o() {
        return this.o0o;
    }

    public static String o(Date date) {
        if (o00 == null) {
            o00 = new SimpleDateFormat(g.f37185a);
        }
        return o00.format(date).substring(5, 7);
    }

    private void o(String str, String str2) {
        try {
            com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass1(str, str2), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void o(JSONObject jSONObject) {
        try {
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caps_d");
                if (jSONObjectOptJSONObject != null) {
                    this.oo0 = m(jSONObjectOptJSONObject);
                } else if (this.oo0 != null) {
                    this.oo0 = null;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("caps_h");
                if (jSONObjectOptJSONObject2 != null) {
                    this.ooo = m(jSONObjectOptJSONObject2);
                } else if (this.ooo != null) {
                    this.ooo = null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("caps_s");
                if (jSONObjectOptJSONObject3 != null) {
                    this.oom = m(jSONObjectOptJSONObject3);
                } else if (this.oom != null) {
                    this.oom = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("req_pace");
                if (jSONObjectOptJSONObject4 != null) {
                    this.oon = m(jSONObjectOptJSONObject4);
                    return;
                } else {
                    if (this.oon != null) {
                        this.oon = null;
                    }
                    return;
                }
            }
            if (this.oo0 != null) {
                this.oo0 = null;
            }
            if (this.ooo != null) {
                this.ooo = null;
            }
            if (this.oom != null) {
                this.oom = null;
            }
            if (this.oon != null) {
                this.oon = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final int o(String str) {
        Pair<Integer, Integer> pair;
        try {
            o oVar = this.oon;
            if (oVar != null) {
                if (oVar.o() > 0 && this.oon.m() > 0) {
                    String strO00 = o0n.m().o00();
                    if (!TextUtils.isEmpty(strO00)) {
                        com.thinkup.core.common.on.o0 o0VarO0 = this.m.get(strO00);
                        if (o0VarO0 == null && (o0VarO0 = this.o0o.o0(strO00, "app")) != null) {
                            this.m.put(strO00, o0VarO0);
                        }
                        if (o0VarO0 != null && o0VarO0.o >= this.oon.o() && System.currentTimeMillis() - o0VarO0.mo() <= this.oon.m()) {
                            this.oon.o();
                            return 9;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.oon.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(str)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    com.thinkup.core.common.on.o0 o0VarO1 = this.o0.get(str);
                    if (o0VarO1 == null && (o0VarO1 = this.o0o.o0(str, "format")) != null) {
                        this.o0.put(str, o0VarO1);
                    }
                    if (o0VarO1 != null && o0VarO1.o >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - o0VarO1.mo() <= ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return nm;
    }

    public final mo m(o0mm o0mmVar) {
        if (o0mmVar.m0m0() == null || this.o0o == null) {
            return null;
        }
        return om().m(o0mmVar);
    }

    private static o m(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        if (jSONObject == null) {
            return null;
        }
        try {
            o oVar = new o();
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("format");
            if (jSONObjectOptJSONObject5 != null) {
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject5.optJSONObject(next)) != null) {
                        int iOptInt = jSONObjectOptJSONObject4.optInt("max_num");
                        int iOptInt2 = jSONObjectOptJSONObject4.optInt("per_second");
                        if (iOptInt != 0 || iOptInt2 != 0) {
                            map.put(next, new Pair(Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2)));
                        }
                    }
                }
                if (!map.isEmpty()) {
                    oVar.o(map);
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("nw");
            if (jSONObjectOptJSONObject6 != null) {
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject6.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!TextUtils.isEmpty(next2) && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject6.optJSONObject(next2)) != null) {
                        int iOptInt3 = jSONObjectOptJSONObject3.optInt("max_num");
                        int iOptInt4 = jSONObjectOptJSONObject3.optInt("per_second");
                        if (iOptInt3 != 0 || iOptInt4 != 0) {
                            map2.put(next2, new Pair(Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt4)));
                        }
                    }
                }
                if (!map2.isEmpty()) {
                    oVar.m(map2);
                }
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("nw_format");
            if (jSONObjectOptJSONObject7 != null) {
                HashMap map3 = new HashMap();
                Iterator<String> itKeys3 = jSONObjectOptJSONObject7.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!TextUtils.isEmpty(next3) && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject7.optJSONObject(next3)) != null) {
                        int iOptInt5 = jSONObjectOptJSONObject2.optInt("max_num");
                        int iOptInt6 = jSONObjectOptJSONObject2.optInt("per_second");
                        if (iOptInt5 != 0 || iOptInt6 != 0) {
                            map3.put(next3, new Pair(Integer.valueOf(iOptInt5), Integer.valueOf(iOptInt6)));
                        }
                    }
                }
                if (!map3.isEmpty()) {
                    oVar.n(map3);
                }
            }
            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("global");
            if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("global")) != null) {
                int iOptInt7 = jSONObjectOptJSONObject.optInt("max_num");
                if (iOptInt7 != 0) {
                    oVar.o(iOptInt7);
                }
                int iOptInt8 = jSONObjectOptJSONObject.optInt("per_second");
                if (iOptInt8 != 0) {
                    oVar.m(iOptInt8);
                }
            }
            return oVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final int o(int i2, long j, String str) {
        if (i2 > 0 && j > 0) {
            try {
                com.thinkup.core.common.on.o0 o0VarO0 = this.f42391n.get(str);
                if (o0VarO0 == null && (o0VarO0 = this.o0o.o0(str, "placement_id")) != null) {
                    this.f42391n.put(str, o0VarO0);
                }
                if (o0VarO0 != null && o0VarO0.o >= i2 && System.currentTimeMillis() - o0VarO0.mo() <= j) {
                    return 8;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return nm;
    }

    public final void o(int i2, long j, String str, int i3) {
        String str2;
        Pair<Integer, Integer> pair;
        String str3;
        try {
            o oVar = this.oon;
            if (oVar != null) {
                if (oVar.o() > 0 && this.oon.m() > 0) {
                    String strO00 = o0n.m().o00();
                    if (!TextUtils.isEmpty(strO00)) {
                        com.thinkup.core.common.on.o0 o0Var = this.m.get(strO00);
                        if (o0Var != null) {
                            if (System.currentTimeMillis() - o0Var.mo() > this.oon.m()) {
                                o0Var.o(System.currentTimeMillis());
                                o0Var.o = 1;
                            } else {
                                o0Var.o++;
                            }
                            str3 = strO00;
                        } else {
                            str3 = strO00;
                            com.thinkup.core.common.on.o0 o0Var2 = new com.thinkup.core.common.on.o0("1", str3, "app", System.currentTimeMillis(), 1);
                            this.m.put(str3, o0Var2);
                            o0Var = o0Var2;
                        }
                        o0Var.toString();
                        this.o0o.m(str3, "app", o0Var.o, o0Var.mo());
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.oon.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(String.valueOf(i3))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    com.thinkup.core.common.on.o0 o0Var3 = this.o0.get(String.valueOf(i3));
                    if (o0Var3 == null) {
                        com.thinkup.core.common.on.o0 o0Var4 = new com.thinkup.core.common.on.o0("1", String.valueOf(i3), "format", System.currentTimeMillis(), 1);
                        this.o0.put(String.valueOf(i3), o0Var4);
                        o0Var3 = o0Var4;
                    } else if (System.currentTimeMillis() - o0Var3.mo() > ((Integer) pair.second).intValue()) {
                        o0Var3.o(System.currentTimeMillis());
                        o0Var3.o = 1;
                    } else {
                        o0Var3.o++;
                    }
                    o0Var3.toString();
                    this.o0o.m(String.valueOf(i3), "format", o0Var3.o, o0Var3.mo());
                }
            }
            if (i2 <= 0 || j <= 0) {
                return;
            }
            com.thinkup.core.common.on.o0 o0Var5 = this.f42391n.get(str);
            if (o0Var5 != null) {
                if (System.currentTimeMillis() - o0Var5.mo() > j) {
                    o0Var5.o(System.currentTimeMillis());
                    o0Var5.o = 1;
                } else {
                    o0Var5.o++;
                }
                str2 = str;
            } else {
                str2 = str;
                com.thinkup.core.common.on.o0 o0Var6 = new com.thinkup.core.common.on.o0("1", str2, "placement_id", System.currentTimeMillis(), 1);
                this.f42391n.put(str2, o0Var6);
                o0Var5 = o0Var6;
            }
            o0Var5.toString();
            this.o0o.m(str2, "placement_id", o0Var5.o, o0Var5.mo());
        } catch (Throwable unused) {
        }
    }

    public final int o(int i2, long j, int i3, String str, String str2) {
        Pair<Integer, Integer> pair;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                o oVar = this.oon;
                if (oVar != null) {
                    Map<String, Pair<Integer, Integer>> mapO0 = oVar.o0();
                    if (mapO0 != null && !mapO0.isEmpty() && (pair = mapO0.get(String.valueOf(i3))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                        com.thinkup.core.common.on.o0 o0VarO0 = this.oo.get(String.valueOf(i3));
                        if (o0VarO0 == null && (o0VarO0 = this.o0o.o0(String.valueOf(i3), "network_id")) != null) {
                            this.oo.put(String.valueOf(i3), o0VarO0);
                        }
                        if (o0VarO0 != null && o0VarO0.o >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - o0VarO0.mo() <= ((Integer) pair.second).intValue()) {
                            Objects.toString(pair.first);
                            return 25;
                        }
                    }
                    Map<String, Pair<Integer, Integer>> mapOo = this.oon.oo();
                    if (mapOo != null && !mapOo.isEmpty()) {
                        Pair<Integer, Integer> pair2 = mapOo.get(i3 + "_" + str2);
                        if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                            com.thinkup.core.common.on.o0 o0VarO1 = this.on.get(i3 + "_" + str2);
                            if (o0VarO1 == null) {
                                o0VarO1 = this.o0o.o0(i3 + "_" + str2, com.thinkup.core.common.oo.o.C0684o.om);
                                if (o0VarO1 != null) {
                                    this.on.put(i3 + "_" + str2, o0VarO1);
                                }
                            }
                            if (o0VarO1 != null && o0VarO1.o >= ((Integer) pair2.first).intValue() && System.currentTimeMillis() - o0VarO1.mo() <= ((Integer) pair2.second).intValue()) {
                                Objects.toString(pair2.first);
                                return 26;
                            }
                        }
                    }
                }
                if (i2 > 0 && j > 0) {
                    com.thinkup.core.common.on.o0 o0VarO2 = this.om.get(str);
                    if (o0VarO2 == null && (o0VarO2 = this.o0o.o0(str, com.thinkup.core.common.oo.o.C0684o.m0)) != null) {
                        this.om.put(str, o0VarO2);
                    }
                    if (o0VarO2 != null && o0VarO2.o >= i2 && System.currentTimeMillis() - o0VarO2.mo() <= j) {
                        return 18;
                    }
                }
                return nm;
            }
            return nm;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final int o(String str, String str2, long j, long j2) {
        List<com.thinkup.core.common.on.o0> listM;
        Pair<Integer, Integer> pair;
        List<com.thinkup.core.common.on.o0> listM2;
        List<com.thinkup.core.common.on.o0> listM3;
        List<com.thinkup.core.common.on.o0> listO;
        Pair<Integer, Integer> pair2;
        List<com.thinkup.core.common.on.o0> listO2;
        List<com.thinkup.core.common.on.o0> listO3;
        try {
            Date date = new Date();
            int i2 = Integer.parseInt(m(date));
            int i3 = Integer.parseInt(n(date));
            o oVar = this.oo0;
            if (oVar != null) {
                if (oVar.o() > 0) {
                    String strO00 = o0n.m().o00();
                    if (!TextUtils.isEmpty(strO00)) {
                        Long lValueOf = this.m0.get("day_".concat(String.valueOf(i2)));
                        if (lValueOf == null && (listO3 = this.o0o.o(strO00, "app")) != null && !listO3.isEmpty()) {
                            lValueOf = Long.valueOf(listO3.size());
                            this.m0.put("day_".concat(String.valueOf(i2)), lValueOf);
                        }
                        if (lValueOf != null && lValueOf.longValue() >= this.oo0.o()) {
                            this.oo0.o();
                            return 7;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.oo0.n();
                if (mapN != null && !mapN.isEmpty() && (pair2 = mapN.get(str2)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long lValueOf2 = this.mo.get("day_" + i2 + "_" + str2);
                    if (lValueOf2 == null && (listO2 = this.o0o.o(str2, "format")) != null && !listO2.isEmpty()) {
                        lValueOf2 = Long.valueOf(listO2.size());
                        this.mo.put("day_" + i2 + "_" + str2, lValueOf2);
                    }
                    if (lValueOf2 != null && lValueOf2.longValue() >= ((Integer) pair2.first).intValue()) {
                        Objects.toString(pair2.first);
                        return 8;
                    }
                }
            }
            if (j > 0) {
                Long lValueOf3 = this.mm.get("day_" + i2 + "_" + str);
                if (lValueOf3 == null && (listO = this.o0o.o(str, "placement_id")) != null && !listO.isEmpty()) {
                    lValueOf3 = Long.valueOf(listO.size());
                    this.mm.put("day_" + i2 + "_" + str, lValueOf3);
                }
                if (lValueOf3 != null && lValueOf3.longValue() >= j) {
                    return 2;
                }
            }
            o oVar2 = this.ooo;
            if (oVar2 != null) {
                if (oVar2.o() > 0) {
                    String strO01 = o0n.m().o00();
                    if (!TextUtils.isEmpty(strO01)) {
                        Long lValueOf4 = this.m0.get("hour_".concat(String.valueOf(i3)));
                        if (lValueOf4 == null && (listM3 = this.o0o.m(strO01, "app")) != null && !listM3.isEmpty()) {
                            lValueOf4 = Long.valueOf(listM3.size());
                            this.m0.put("hour_".concat(String.valueOf(i3)), lValueOf4);
                        }
                        if (lValueOf4 != null && lValueOf4.longValue() >= this.ooo.o()) {
                            this.ooo.o();
                            return 9;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN2 = this.ooo.n();
                if (mapN2 != null && !mapN2.isEmpty() && (pair = mapN2.get(str2)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long lValueOf5 = this.mo.get("hour_" + i3 + "_" + str2);
                    if (lValueOf5 == null && (listM2 = this.o0o.m(str2, "format")) != null && !listM2.isEmpty()) {
                        lValueOf5 = Long.valueOf(listM2.size());
                        this.mo.put("hour_" + i3 + "_" + str2, lValueOf5);
                    }
                    if (lValueOf5 != null && lValueOf5.longValue() >= ((Integer) pair.first).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
            }
            if (j2 > 0) {
                Long lValueOf6 = this.mm.get("hour_" + i3 + "_" + str);
                if (lValueOf6 == null && (listM = this.o0o.m(str, "placement_id")) != null && !listM.isEmpty()) {
                    lValueOf6 = Long.valueOf(listM.size());
                    this.mm.put("hour_" + i3 + "_" + str, lValueOf6);
                }
                if (lValueOf6 != null && lValueOf6.longValue() >= j2) {
                    return 2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return nm;
    }

    public final int o(String str, String str2, long j) {
        com.thinkup.core.common.on.o0 o0VarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.on.o0 o0VarN2;
        com.thinkup.core.common.on.o0 o0VarN3;
        try {
            o oVar = this.oom;
            if (oVar != null) {
                if (oVar.m() > 0) {
                    String strO00 = o0n.m().o00();
                    if (!TextUtils.isEmpty(strO00)) {
                        Long lValueOf = this.m0.get(com.thinkup.core.common.oo.o.C0684o.no);
                        if (lValueOf == null && (o0VarN3 = this.o0o.n(strO00, "app")) != null) {
                            lValueOf = Long.valueOf(o0VarN3.mo());
                            this.m0.put(com.thinkup.core.common.oo.o.C0684o.no, lValueOf);
                        }
                        if (lValueOf != null && System.currentTimeMillis() - lValueOf.longValue() < this.oom.m()) {
                            this.oom.m();
                            return 11;
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.oom.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(str2)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long lValueOf2 = this.mo.get("time_stamp_".concat(String.valueOf(str2)));
                    if (lValueOf2 == null && (o0VarN2 = this.o0o.n(str2, "format")) != null) {
                        lValueOf2 = Long.valueOf(o0VarN2.mo());
                        this.mo.put("time_stamp_".concat(String.valueOf(str2)), lValueOf2);
                    }
                    if (lValueOf2 != null && System.currentTimeMillis() - lValueOf2.longValue() < ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.second);
                        return 12;
                    }
                }
            }
            if (j > 0) {
                Long lValueOf3 = this.mm.get("time_stamp_".concat(String.valueOf(str)));
                if (lValueOf3 == null && (o0VarN = this.o0o.n(str, "placement_id")) != null) {
                    lValueOf3 = Long.valueOf(o0VarN.mo());
                    this.mm.put("time_stamp_".concat(String.valueOf(str)), lValueOf3);
                }
                if (lValueOf3 != null && System.currentTimeMillis() - lValueOf3.longValue() < j) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return nm;
    }

    public final int o(String str, String str2, String str3, long j, long j2) {
        List<com.thinkup.core.common.on.o0> listM;
        Pair<Integer, Integer> pair;
        List<com.thinkup.core.common.on.o0> listM2;
        List<com.thinkup.core.common.on.o0> listO;
        Pair<Integer, Integer> pair2;
        List<com.thinkup.core.common.on.o0> listO2;
        try {
            Date date = new Date();
            int i2 = Integer.parseInt(m(date));
            int i3 = Integer.parseInt(n(date));
            o oVar = this.oo0;
            if (oVar != null) {
                Map<String, Pair<Integer, Integer>> mapO0 = oVar.o0();
                if (mapO0 != null && !mapO0.isEmpty() && (pair2 = mapO0.get(str)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long lValueOf = this.mn.get("day_" + i2 + "_" + str);
                    if (lValueOf == null && (listO2 = this.o0o.o(str, "network_id")) != null && !listO2.isEmpty()) {
                        lValueOf = Long.valueOf(listO2.size());
                        this.mn.put("day_" + i2 + "_" + str, lValueOf);
                    }
                    if (lValueOf != null && lValueOf.longValue() >= ((Integer) pair2.first).intValue()) {
                        Objects.toString(pair2.first);
                        return 8;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapOo = this.oo0.oo();
                if (mapOo != null && !mapOo.isEmpty()) {
                    Pair<Integer, Integer> pair3 = mapOo.get(str + "_" + str3);
                    if (pair3 != null && ((Integer) pair3.first).intValue() > 0) {
                        Long lValueOf2 = this.n0.get("day_" + i2 + "_" + str + "_" + str3);
                        if (lValueOf2 == null) {
                            List<com.thinkup.core.common.on.o0> listO3 = this.o0o.o(str + "_" + str3, com.thinkup.core.common.oo.o.C0684o.om);
                            if (listO3 != null && !listO3.isEmpty()) {
                                lValueOf2 = Long.valueOf(listO3.size());
                                this.n0.put("day_" + i2 + "_" + str + "_" + str3, lValueOf2);
                            }
                        }
                        if (lValueOf2 != null && lValueOf2.longValue() >= ((Integer) pair3.first).intValue()) {
                            Objects.toString(pair3.first);
                            return 9;
                        }
                    }
                }
            }
            long j3 = 0;
            if (j > 0) {
                Long lValueOf3 = this.no.get("day_" + i2 + "_" + str2);
                if (lValueOf3 == null && (listO = this.o0o.o(str2, com.thinkup.core.common.oo.o.C0684o.m0)) != null && !listO.isEmpty()) {
                    lValueOf3 = Long.valueOf(listO.size());
                    this.no.put("day_" + i2 + "_" + str2, lValueOf3);
                }
                if (lValueOf3 != null && lValueOf3.longValue() >= j) {
                    return 2;
                }
            } else {
                j3 = 0;
            }
            o oVar2 = this.ooo;
            if (oVar2 != null) {
                Map<String, Pair<Integer, Integer>> mapO1 = oVar2.o0();
                if (mapO1 != null && !mapO1.isEmpty() && (pair = mapO1.get(str)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long lValueOf4 = this.mn.get("hour_" + i3 + "_" + str);
                    if (lValueOf4 == null && (listM2 = this.o0o.m(str, "network_id")) != null && !listM2.isEmpty()) {
                        lValueOf4 = Long.valueOf(listM2.size());
                        this.mn.put("hour_" + i3 + "_" + str, lValueOf4);
                    }
                    if (lValueOf4 != null && lValueOf4.longValue() >= ((Integer) pair.first).intValue()) {
                        Objects.toString(pair.first);
                        return 10;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapOo2 = this.ooo.oo();
                if (mapOo2 != null && !mapOo2.isEmpty()) {
                    Pair<Integer, Integer> pair4 = mapOo2.get(str + "_" + str3);
                    if (pair4 != null && ((Integer) pair4.first).intValue() > 0) {
                        Long lValueOf5 = this.n0.get("hour_" + i3 + "_" + str + "_" + str3);
                        if (lValueOf5 == null) {
                            List<com.thinkup.core.common.on.o0> listM3 = this.o0o.m(str + "_" + str3, com.thinkup.core.common.oo.o.C0684o.om);
                            if (listM3 != null && !listM3.isEmpty()) {
                                lValueOf5 = Long.valueOf(listM3.size());
                                this.n0.put("hour_" + i3 + "_" + str + "_" + str3, lValueOf5);
                            }
                        }
                        if (lValueOf5 != null && lValueOf5.longValue() >= ((Integer) pair4.first).intValue()) {
                            Objects.toString(pair4.first);
                            return 11;
                        }
                    }
                }
            }
            if (j2 > j3) {
                Long lValueOf6 = this.no.get("hour_" + i3 + "_" + str2);
                if (lValueOf6 == null && (listM = this.o0o.m(str2, com.thinkup.core.common.oo.o.C0684o.m0)) != null && !listM.isEmpty()) {
                    lValueOf6 = Long.valueOf(listM.size());
                    this.no.put("hour_" + i3 + "_" + str2, lValueOf6);
                }
                if (lValueOf6 != null && lValueOf6.longValue() >= j2) {
                    return 2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return nm;
    }

    public final int o(String str, String str2, String str3, long j) {
        com.thinkup.core.common.on.o0 o0VarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.on.o0 o0VarN2;
        try {
            o oVar = this.oom;
            if (oVar != null) {
                Map<String, Pair<Integer, Integer>> mapO0 = oVar.o0();
                if (mapO0 != null && !mapO0.isEmpty() && (pair = mapO0.get(str)) != null && ((Integer) pair.second).intValue() > 0) {
                    Long lValueOf = this.mn.get("time_stamp_".concat(String.valueOf(str)));
                    if (lValueOf == null && (o0VarN2 = this.o0o.n(str, "network_id")) != null) {
                        lValueOf = Long.valueOf(o0VarN2.mo());
                        this.mn.put("time_stamp_".concat(String.valueOf(str)), lValueOf);
                    }
                    if (lValueOf != null && System.currentTimeMillis() - lValueOf.longValue() < ((Integer) pair.second).intValue()) {
                        Objects.toString(pair.second);
                        return 12;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapOo = this.oom.oo();
                if (mapOo != null && !mapOo.isEmpty()) {
                    Pair<Integer, Integer> pair2 = mapOo.get(str + "_" + str3);
                    if (pair2 != null && ((Integer) pair2.second).intValue() > 0) {
                        Long lValueOf2 = this.n0.get("time_stamp_" + str + "_" + str3);
                        if (lValueOf2 == null) {
                            com.thinkup.core.common.on.o0 o0VarN3 = this.o0o.n(str + "_" + str3, com.thinkup.core.common.oo.o.C0684o.om);
                            if (o0VarN3 != null) {
                                lValueOf2 = Long.valueOf(o0VarN3.mo());
                                this.n0.put("time_stamp_" + str + "_" + str3, lValueOf2);
                            }
                        }
                        if (lValueOf2 != null && System.currentTimeMillis() - lValueOf2.longValue() < ((Integer) pair2.second).intValue()) {
                            Objects.toString(pair2.second);
                            return 13;
                        }
                    }
                }
            }
            if (j > 0) {
                Long lValueOf3 = this.no.get("time_stamp_".concat(String.valueOf(str2)));
                if (lValueOf3 == null && (o0VarN = this.o0o.n(str2, com.thinkup.core.common.oo.o.C0684o.m0)) != null) {
                    lValueOf3 = Long.valueOf(o0VarN.mo());
                    this.mm.put("time_stamp_".concat(String.valueOf(str2)), lValueOf3);
                }
                if (lValueOf3 != null && System.currentTimeMillis() - lValueOf3.longValue() < j) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return nm;
    }

    public final void o(int i2, String str, String str2, String str3) {
        try {
            String strO00 = o0n.m().o00();
            Date date = new Date();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i3 = Integer.parseInt(o(date));
            int i4 = Integer.parseInt(m(date));
            int i5 = Integer.parseInt(n(date));
            this.o0o.o(new com.thinkup.core.common.on.o0("2", strO00, String.valueOf(i2), str, i2 + "_" + str, str2, str3, i3, i4, i5, jCurrentTimeMillis));
            o(1, this.oo0, this.m0, "day_".concat(String.valueOf(i4)), jCurrentTimeMillis);
            o(1, this.oo0, this.mo, "day_" + i4 + "_" + str, jCurrentTimeMillis);
            o(1, this.oo0, this.mn, "day_" + i4 + "_" + i2, jCurrentTimeMillis);
            o(1, this.oo0, this.n0, "day_" + i4 + "_" + i2 + "_" + str, jCurrentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap = this.mm;
            StringBuilder sb = new StringBuilder("day_");
            sb.append(i4);
            sb.append("_");
            sb.append(str2);
            o(1, concurrentHashMap, sb.toString(), jCurrentTimeMillis);
            o(1, this.no, "day_" + i4 + "_" + str3, jCurrentTimeMillis);
            o(1, this.ooo, this.m0, "hour_".concat(String.valueOf(i5)), jCurrentTimeMillis);
            o(1, this.ooo, this.mo, "hour_" + i5 + "_" + str, jCurrentTimeMillis);
            o(1, this.ooo, this.mn, "hour_" + i5 + "_" + i2, jCurrentTimeMillis);
            o(1, this.ooo, this.n0, "hour_" + i5 + "_" + i2 + "_" + str, jCurrentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap2 = this.mm;
            StringBuilder sb2 = new StringBuilder("hour_");
            sb2.append(i5);
            sb2.append("_");
            sb2.append(str2);
            o(1, concurrentHashMap2, sb2.toString(), jCurrentTimeMillis);
            o(1, this.no, "hour_" + i5 + "_" + str3, jCurrentTimeMillis);
            o(2, this.oom, this.m0, com.thinkup.core.common.oo.o.C0684o.no, jCurrentTimeMillis);
            o(2, this.oom, this.mo, "time_stamp_".concat(String.valueOf(str)), jCurrentTimeMillis);
            o(2, this.oom, this.mn, "time_stamp_".concat(String.valueOf(i2)), jCurrentTimeMillis);
            o(2, this.oom, this.n0, "time_stamp_" + i2 + "_" + str, jCurrentTimeMillis);
            o(2, this.mm, "time_stamp_".concat(String.valueOf(str2)), jCurrentTimeMillis);
            o(2, this.no, "time_stamp_".concat(String.valueOf(str3)), jCurrentTimeMillis);
        } catch (Throwable unused) {
        }
    }

    private static void o(int i2, o oVar, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j) {
        long jValueOf;
        Objects.toString(oVar);
        if (concurrentHashMap != null) {
            if (i2 == 2) {
                concurrentHashMap.put(str, Long.valueOf(j));
                return;
            }
            Long l2 = concurrentHashMap.get(str);
            if (l2 == null) {
                jValueOf = 1L;
            } else {
                jValueOf = Long.valueOf(l2.longValue() + 1);
            }
            concurrentHashMap.put(str, jValueOf);
        }
    }

    private static void o(int i2, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j) {
        long jValueOf;
        Objects.toString(concurrentHashMap);
        if (concurrentHashMap != null) {
            if (i2 == 2) {
                concurrentHashMap.put(str, Long.valueOf(j));
                return;
            }
            Long l2 = concurrentHashMap.get(str);
            if (l2 == null) {
                jValueOf = 1L;
            } else {
                jValueOf = Long.valueOf(l2.longValue() + 1);
            }
            concurrentHashMap.put(str, jValueOf);
        }
    }

    public final void o(o0mm o0mmVar) {
        if (o0mmVar.m0m0() == null || this.o0o == null) {
            return;
        }
        om().o0(o0mmVar);
    }
}
