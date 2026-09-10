package com.bytedance.sdk.component.ri;

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

/* JADX INFO: loaded from: classes2.dex */
class di {
    private final com.bytedance.sdk.component.ri.ri mj;
    private final xha ri;
    private final sf xha;
    private final Map<String, lr> lr = new HashMap();
    private final bu<String, nr> ik = new bu<>();
    private final Map<String, ik.lr> ka = new HashMap();
    private final List<bgr> fi = new ArrayList();
    private final Set<ik> di = new HashSet();

    public static final class ri {
        String lr;
        boolean ri;

        private ri(boolean z, String str) {
            this.ri = z;
            this.lr = str;
        }
    }

    public di(jbs jbsVar, com.bytedance.sdk.component.ri.ri riVar) {
        this.mj = riVar;
        this.ri = jbsVar.ka;
        this.xha = jbsVar.mj;
    }

    public ri ri(bgr bgrVar, fi fiVar) throws Exception {
        lr lrVar = this.lr.get(bgrVar.ka);
        if (lrVar != null) {
            try {
                if (lrVar instanceof ka) {
                    bgrVar.toString();
                    return ri(bgrVar, (ka) lrVar, fiVar);
                }
            } catch (IllegalStateException unused) {
                bgrVar.toString();
                this.fi.add(bgrVar);
                return new ri(false, tan.ri());
            }
        }
        nr nrVarRi = this.ik.ri(bgrVar.ka);
        if (nrVarRi != null) {
            bgrVar.toString();
            return ri(bgrVar, nrVarRi, fiVar);
        }
        ik.lr lrVar2 = this.ka.get(bgrVar.ka);
        if (lrVar2 == null) {
            bgrVar.toString();
            return null;
        }
        ik ikVarRi = lrVar2.ri();
        ikVarRi.ri(bgrVar.ka);
        bgrVar.toString();
        return ri(bgrVar, ikVarRi, fiVar);
    }

    public void ri(String str, ka<?, ?> kaVar) {
        kaVar.ri(str);
        this.lr.put(str, kaVar);
    }

    public void ri(Set<String> set, nr<?, ?> nrVar) {
        nrVar.ri(set);
        this.ik.ri(set, nrVar);
        Objects.toString(set);
    }

    public void ri(String str, ik.lr lrVar) {
        this.ka.put(str, lrVar);
    }

    public void ri() {
        Iterator<ik> it = this.di.iterator();
        while (it.hasNext()) {
            it.next().fi();
        }
        this.di.clear();
        this.lr.clear();
        this.ka.clear();
        this.ik.ri();
    }

    private ri ri(bgr bgrVar, ka kaVar, fi fiVar) throws Exception {
        return new ri(true, tan.ri(this.ri.ri(kaVar.ri(bgrVar.ka, ri(bgrVar.fi, (lr) kaVar), fiVar)), kaVar.lr()));
    }

    private ri ri(final bgr bgrVar, final ik ikVar, fi fiVar) throws Exception {
        this.di.add(ikVar);
        ikVar.ri(ri(bgrVar.fi, ikVar), fiVar, new ik.ri() { // from class: com.bytedance.sdk.component.ri.di.1
            @Override // com.bytedance.sdk.component.ri.ik.ri
            public void ri(Object obj) {
                if (di.this.mj == null) {
                    return;
                }
                di.this.mj.lr(tan.ri(di.this.ri.ri(obj), ikVar.lr()), bgrVar);
                di.this.di.remove(ikVar);
            }

            @Override // com.bytedance.sdk.component.ri.ik.ri
            public void ri(Throwable th) {
                if (di.this.mj == null) {
                    return;
                }
                di.this.mj.lr(tan.ri(th), bgrVar);
                di.this.di.remove(ikVar);
            }
        });
        return new ri(false, tan.ri());
    }

    private Object ri(String str, lr lrVar) throws JSONException {
        return this.ri.ri(str, ri(lrVar)[0]);
    }

    private static Type[] ri(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
