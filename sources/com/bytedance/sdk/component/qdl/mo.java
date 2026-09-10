package com.bytedance.sdk.component.qdl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class mo {
    private final com.bytedance.sdk.component.qdl.qdl jpc;
    private final wd qdl;
    private final rq wd;
    private final Map<String, ud> ud = new HashMap();
    private final yt<String, jl> lnr = new yt<>();
    private final Map<String, lnr.ud> mml = new HashMap();
    private final List<rdp> mzz = new ArrayList();
    private final Set<lnr> mo = new HashSet();

    public static final class qdl {
        boolean qdl;
        String ud;

        private qdl(boolean z2, String str) {
            this.qdl = z2;
            this.ud = str;
        }
    }

    public mo(tvp tvpVar, com.bytedance.sdk.component.qdl.qdl qdlVar) {
        this.jpc = qdlVar;
        this.qdl = tvpVar.mml;
        this.wd = tvpVar.jpc;
    }

    public qdl qdl(rdp rdpVar, mzz mzzVar) throws Exception {
        ud udVar = this.ud.get(rdpVar.mml);
        if (udVar != null) {
            try {
                if (udVar instanceof mml) {
                    rdpVar.toString();
                    return qdl(rdpVar, (mml) udVar, mzzVar);
                }
            } catch (IllegalStateException unused) {
                rdpVar.toString();
                this.mzz.add(rdpVar);
                return new qdl(false, exc.qdl());
            }
        }
        jl jlVarQdl = this.lnr.qdl(rdpVar.mml);
        if (jlVarQdl != null) {
            rdpVar.toString();
            return qdl(rdpVar, jlVarQdl, mzzVar);
        }
        lnr.ud udVar2 = this.mml.get(rdpVar.mml);
        if (udVar2 == null) {
            rdpVar.toString();
            return null;
        }
        lnr lnrVarQdl = udVar2.qdl();
        lnrVarQdl.qdl(rdpVar.mml);
        rdpVar.toString();
        return qdl(rdpVar, lnrVarQdl, mzzVar);
    }

    public void qdl(String str, mml<?, ?> mmlVar) {
        mmlVar.qdl(str);
        this.ud.put(str, mmlVar);
    }

    public void qdl(Set<String> set, jl<?, ?> jlVar) {
        jlVar.qdl(set);
        this.lnr.qdl(set, jlVar);
        Objects.toString(set);
    }

    public void qdl(String str, lnr.ud udVar) {
        this.mml.put(str, udVar);
    }

    public void qdl() {
        Iterator<lnr> it = this.mo.iterator();
        while (it.hasNext()) {
            it.next().mzz();
        }
        this.mo.clear();
        this.ud.clear();
        this.mml.clear();
        this.lnr.qdl();
    }

    private qdl qdl(rdp rdpVar, mml mmlVar, mzz mzzVar) throws Exception {
        return new qdl(true, exc.qdl(this.qdl.qdl(mmlVar.qdl(rdpVar.mml, qdl(rdpVar.mzz, (ud) mmlVar), mzzVar)), mmlVar.ud()));
    }

    private qdl qdl(final rdp rdpVar, final lnr lnrVar, mzz mzzVar) throws Exception {
        this.mo.add(lnrVar);
        lnrVar.qdl(qdl(rdpVar.mzz, lnrVar), mzzVar, new lnr.qdl() { // from class: com.bytedance.sdk.component.qdl.mo.1
            @Override // com.bytedance.sdk.component.qdl.lnr.qdl
            public void qdl(Object obj) {
                if (mo.this.jpc == null) {
                    return;
                }
                mo.this.jpc.ud(exc.qdl(mo.this.qdl.qdl(obj), lnrVar.ud()), rdpVar);
                mo.this.mo.remove(lnrVar);
            }

            @Override // com.bytedance.sdk.component.qdl.lnr.qdl
            public void qdl(Throwable th) {
                if (mo.this.jpc == null) {
                    return;
                }
                mo.this.jpc.ud(exc.qdl(th), rdpVar);
                mo.this.mo.remove(lnrVar);
            }
        });
        return new qdl(false, exc.qdl());
    }

    private Object qdl(String str, ud udVar) throws JSONException {
        return this.qdl.qdl(str, qdl(udVar)[0]);
    }

    private static Type[] qdl(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
