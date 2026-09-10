package com.thinkup.core.o0;

import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.onm;
import com.thinkup.core.oo.nm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static volatile o oo;
    final String o = "o";
    private final String m = "sv_request_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42443n = "sv_price";
    private Map<String, LinkedList<C0700o>> o0 = new HashMap();

    /* JADX INFO: renamed from: com.thinkup.core.o0.o$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ LinkedList m;
        final /* synthetic */ String o;

        public AnonymousClass1(String str, LinkedList linkedList) {
            this.o = str;
            this.m = linkedList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String string;
            if (TextUtils.isEmpty(this.o) || this.m == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (C0700o c0700o : this.m) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sv_request_id", c0700o.o);
                    jSONObject.put("sv_price", c0700o.m);
                    jSONArray.put(jSONObject);
                }
                string = jSONArray.toString();
            } catch (Throwable unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            onm.m(o0n.m().on(), oo0.m.nm, this.o, string);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.o0.o$o, reason: collision with other inner class name */
    public class C0700o {
        public double m;
        public String o;

        public C0700o(String str, double d) {
            this.o = str;
            this.m = d;
        }

        public final String toString() {
            return "ProverbPriceBean{requestId='" + this.o + "', impPrice=" + this.m + AbstractJsonLexerKt.END_OBJ;
        }
    }

    private o() {
    }

    private LinkedList<C0700o> m(String str) {
        try {
            String strN = onm.n(o0n.m().on(), oo0.m.nm, str, "");
            if (TextUtils.isEmpty(strN)) {
                return null;
            }
            LinkedList<C0700o> linkedList = new LinkedList<>();
            try {
                JSONArray jSONArray = new JSONArray(strN);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        linkedList.add(new C0700o(jSONObjectOptJSONObject.optString("sv_request_id"), jSONObjectOptJSONObject.optDouble("sv_price", 0.0d)));
                    }
                }
                return linkedList;
            } catch (Throwable unused) {
                return linkedList;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private String n(String str) {
        LinkedList<C0700o> linkedListO = o(str);
        if (linkedListO.size() <= 0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0700o c0700o : linkedListO) {
                jSONObject.put(c0700o.o, c0700o.m);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static o o() {
        if (oo == null) {
            synchronized (m.class) {
                try {
                    if (oo == null) {
                        oo = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    public final void o(n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.oo.n0 n0VarM;
        double d;
        n0 n0Var2;
        com.thinkup.core.oo.n0 n0Var3;
        double d2;
        double d3;
        double dMom;
        if (n0Var == null || o0mmVar == null || (n0VarM = nm.o(o0n.m().on()).m(n0Var.oomn())) == null || o0mmVar.ooo0() != 1) {
            return;
        }
        try {
            Map<String, Object> mapM0 = n0Var.m0();
            if (mapM0 != null) {
                mapM0.toString();
            }
            if (mapM0 == null) {
                d = -1.0d;
            } else {
                if (o0mmVar.nm() == 2 && mapM0.containsKey("value_micros")) {
                    d2 = Double.parseDouble(mapM0.get("value_micros").toString());
                    d3 = 1000.0d;
                } else if (mapM0.containsKey("network_ecpm")) {
                    d2 = Double.parseDouble(mapM0.get("network_ecpm").toString());
                    d3 = 100.0d;
                    if ("CNY".equalsIgnoreCase(o0mmVar.o0nn())) {
                        dMom = (d2 / 100.0d) * n0VarM.mom();
                    }
                    d = dMom;
                } else {
                    d = -1.0d;
                }
                dMom = d2 / d3;
                d = dMom;
            }
            if (d == -1.0d) {
                StringBuilder sb = new StringBuilder();
                sb.append(o0mmVar.nm());
                String string = sb.toString();
                String strM0o = o0mmVar.m0o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(o0mmVar.o0nm());
                String string2 = sb2.toString();
                n0Var3 = n0VarM;
                n0Var2 = n0Var;
                oo.o(n0Var2, n0Var3, string, strM0o, string2, o(o0mmVar.m0o(), n0VarM.oo0()) <= 0.0d ? 1 : 2);
            } else {
                n0Var2 = n0Var;
                n0Var3 = n0VarM;
            }
            n0Var2.o0(d);
            if (d > 0.0d) {
                o0mmVar.om(d);
                o(o0mmVar.m0o(), n0Var2.oon0(), d, n0Var3.oo0());
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(n0 n0Var, List<o0mm> list, com.thinkup.core.oo.n0 n0Var2) {
        ListIterator<o0mm> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            o0mm next = listIterator.next();
            if (next.ooo0() == 1) {
                int iOo0 = n0Var2.oo0();
                double dO = o(next.m0o(), iOo0);
                next.m0o();
                if (dO > 0.0d) {
                    next.ooom();
                    next.m(dO);
                    next.oo(dO);
                    next.n(n0Var.ooo() * dO);
                    next.mo("estimated");
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.nm());
                    oo.o(n0Var, n0Var2, sb.toString(), next.m0o(), String.valueOf(dO), String.valueOf(iOo0), n(next.m0o()));
                }
            }
        }
    }

    private synchronized void o(String str, String str2, double d, int i2) {
        try {
            LinkedList<C0700o> linkedListO = o(str);
            if (linkedListO != null) {
                linkedListO.toString();
            }
            if (linkedListO == null) {
                return;
            }
            if (i2 == 0) {
                linkedListO.clear();
            } else {
                if (linkedListO.size() >= i2 - 1) {
                    int size = (linkedListO.size() - i2) + 1;
                    for (int i3 = 0; i3 < size; i3++) {
                        linkedListO.removeLast();
                    }
                }
                if (linkedListO.size() < i2) {
                    linkedListO.addFirst(new C0700o(str2, d));
                }
            }
            linkedListO.toString();
            com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass1(str, linkedListO));
        } catch (Throwable th) {
            throw th;
        }
    }

    private double o(String str, int i2) {
        LinkedList<C0700o> linkedListO = o(str);
        if (linkedListO != null) {
            linkedListO.toString();
        }
        if (linkedListO == null || linkedListO.size() == 0 || i2 == 0) {
            return -1.0d;
        }
        List<C0700o> listSubList = linkedListO.subList(0, Math.min(i2, linkedListO.size()));
        Iterator<C0700o> it = listSubList.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += it.next().m;
        }
        return d / ((double) listSubList.size());
    }

    private synchronized LinkedList<C0700o> o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            LinkedList<C0700o> linkedListM = this.o0.get(str);
            if (linkedListM == null) {
                linkedListM = m(str);
                if (linkedListM == null) {
                    linkedListM = new LinkedList<>();
                }
                this.o0.put(str, linkedListM);
            }
            return linkedListM;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void o(String str, LinkedList<C0700o> linkedList) {
        com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass1(str, linkedList));
    }
}
