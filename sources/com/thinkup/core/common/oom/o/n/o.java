package com.thinkup.core.common.oom.o.n;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.m;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.m0m;
import com.thinkup.core.common.on.m0o;
import com.thinkup.core.common.on.mom;
import com.thinkup.core.common.on.moo;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.oom.o.m.o0;
import com.thinkup.core.oo.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final String o = "moo";
    private final Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n0 f42301n;
    private final m0o o0;
    private InterfaceC0686o om;
    private final o0 oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.oom.o.n.o$o, reason: collision with other inner class name */
    public interface InterfaceC0686o {
        void o(List<m0m> list, boolean z2);

        void o(boolean z2);
    }

    public o(Context context, n0 n0Var, m0o m0oVar, o0 o0Var) {
        this.m = context;
        this.f42301n = n0Var;
        this.oo = o0Var;
        this.o0 = m0oVar;
    }

    private void m() {
        n0 n0Var;
        o0 o0Var = this.oo;
        if (o0Var == null || (n0Var = this.f42301n) == null) {
            return;
        }
        o0Var.m(n0Var.mo());
    }

    private mom n() {
        n0 n0Var;
        Map<String, Integer> mapM;
        Map<String, List<moo.o>> mapO;
        List<moo.o> list;
        Integer num;
        mom momVar = new mom();
        momVar.o(o0n.m().o00());
        momVar.m(o0n.m().o0o());
        momVar.o(this.m);
        n0 n0Var2 = this.f42301n;
        if (n0Var2 != null) {
            momVar.m(n0Var2.o0mn());
            momVar.o(this.f42301n.nmn());
            momVar.o0(this.f42301n.mo());
        }
        m0o m0oVar = this.o0;
        if (m0oVar != null) {
            momVar.n(m0oVar.on());
        }
        o0 o0Var = this.oo;
        if (o0Var != null && (n0Var = this.f42301n) != null) {
            moo mooVarO = o0Var.o(n0Var.mo());
            if (mooVarO != null) {
                mapM = mooVarO.m();
                mapO = mooVarO.o();
            } else {
                mapM = null;
                mapO = null;
            }
            Map<String, o0mm> mapOon = this.f42301n.oon();
            if (mapOon != null) {
                Set<String> setKeySet = mapOon.keySet();
                ArrayList arrayList = new ArrayList();
                for (String str : setKeySet) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        o0mm o0mmVar = mapOon.get(str);
                        if (o0mmVar != null) {
                            jSONObject.put("unitid", Integer.parseInt(o0mmVar.m0o()));
                            jSONObject.put("nwfid", o0mmVar.nm());
                            jSONObject.put("ecpm", o0mmVar.moo());
                            jSONObject.put("unit_type", o0mmVar.om0o());
                        }
                        if (mapM != null && (num = mapM.get(str)) != null && num.intValue() > 0) {
                            jSONObject.put("request", num.intValue());
                        }
                        if (mapO != null && (list = mapO.get(str)) != null && !list.isEmpty()) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (moo.o oVar : list) {
                                String strO = oVar.o();
                                if (!TextUtils.isEmpty(strO)) {
                                    jSONObject2.put(strO, oVar.m());
                                }
                            }
                            if (jSONObject2.length() > 0) {
                                jSONObject.put("error_code", jSONObject2);
                            }
                        }
                        arrayList.add(jSONObject);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                momVar.o(new JSONArray((Collection) arrayList));
            }
        }
        return momVar;
    }

    public static /* synthetic */ void m(o oVar) {
        n0 n0Var;
        o0 o0Var = oVar.oo;
        if (o0Var == null || (n0Var = oVar.f42301n) == null) {
            return;
        }
        o0Var.m(n0Var.mo());
    }

    public final void o(InterfaceC0686o interfaceC0686o) {
        this.om = interfaceC0686o;
    }

    public final void o(final boolean z2) {
        try {
            new com.thinkup.core.common.n0.n0(n()).o(0, (o0o) new m() { // from class: com.thinkup.core.common.oom.o.n.o.1
                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadError(int i2, String str, AdError adError) {
                    if (o.this.om != null) {
                        InterfaceC0686o interfaceC0686o = o.this.om;
                        adError.getCode();
                        adError.getDesc();
                        interfaceC0686o.o(z2);
                    }
                    o.m(o.this);
                }

                @Override // com.thinkup.core.common.n0.o0o
                public final void onLoadFinish(int i2, Object obj) {
                    JSONArray jSONArrayOptJSONArray;
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    try {
                        if ((obj instanceof JSONObject) && (jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("u_d")) != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                copyOnWriteArrayList.add(m0m.o(String.valueOf(jSONArrayOptJSONArray.optInt(i3)), com.thinkup.core.common.oom.o.o.C0687o.o));
                            }
                        }
                    } catch (Throwable th) {
                        String unused = o.o;
                        th.getMessage();
                    }
                    if (o.this.om != null) {
                        o.this.om.o(copyOnWriteArrayList, z2);
                    }
                    o.m(o.this);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
