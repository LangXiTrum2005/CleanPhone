package com.bytedance.sdk.component.Lxb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
class ebl implements HD.Lxb {
    private final DY LD;
    private final OY Lxb;
    private final boolean OY;
    private final boolean QAg;
    private final NXR ebl;
    private final com.bytedance.sdk.component.Lxb.Lxb nBu;
    private final Map<String, LD> lk = new HashMap();
    private final Map<String, ZU.LD> ZU = new HashMap();
    private final List<VVE> JXs = new ArrayList();
    private final Set<ZU> lc = new HashSet();

    public static final class Lxb {
        String LD;
        boolean Lxb;

        private Lxb(boolean z, String str) {
            this.Lxb = z;
            this.LD = str;
        }
    }

    public ebl(nBu nbu, com.bytedance.sdk.component.Lxb.Lxb lxb, Sfi sfi) {
        this.nBu = lxb;
        this.Lxb = nbu.ZU;
        DY dy = new DY(sfi, nbu.sLN, nbu.NXR);
        this.LD = dy;
        dy.Lxb(this);
        dy.Lxb(nbu.VVE);
        this.ebl = nbu.QAg;
        this.OY = nbu.OY;
        this.QAg = nbu.IeN;
    }

    private eK LD(String str, LD ld) {
        return this.QAg ? eK.PRIVATE : this.LD.Lxb(this.OY, str, ld);
    }

    public Lxb Lxb(VVE vve, lc lcVar) throws Exception {
        LD ld = this.lk.get(vve.ZU);
        if (ld != null) {
            try {
                eK eKVarLD = LD(lcVar.LD, ld);
                lcVar.ZU = eKVarLD;
                if (eKVarLD == null) {
                    vve.toString();
                    throw new brP(-1);
                }
                if (ld instanceof JXs) {
                    vve.toString();
                    return Lxb(vve, (JXs) ld, lcVar);
                }
                if (ld instanceof lk) {
                    vve.toString();
                    return Lxb(vve, (lk) ld, eKVarLD);
                }
            } catch (Sfi.Lxb unused) {
                vve.toString();
                this.JXs.add(vve);
                return new Lxb(false, aH.Lxb());
            }
        }
        ZU.LD ld2 = this.ZU.get(vve.ZU);
        if (ld2 == null) {
            vve.toString();
            return null;
        }
        ZU zuLxb = ld2.Lxb();
        zuLxb.Lxb(vve.ZU);
        eK eKVarLD2 = LD(lcVar.LD, zuLxb);
        lcVar.ZU = eKVarLD2;
        if (eKVarLD2 != null) {
            vve.toString();
            return Lxb(vve, zuLxb, lcVar);
        }
        vve.toString();
        zuLxb.ZU();
        throw new brP(-1);
    }

    public void Lxb(String str, JXs<?, ?> jXs) {
        jXs.Lxb(str);
        this.lk.put(str, jXs);
    }

    public void Lxb(String str, ZU.LD ld) {
        this.ZU.put(str, ld);
    }

    public void Lxb() {
        Iterator<ZU> it = this.lc.iterator();
        while (it.hasNext()) {
            it.next().JXs();
        }
        this.lc.clear();
        this.lk.clear();
        this.ZU.clear();
        this.LD.LD(this);
    }

    private Lxb Lxb(VVE vve, JXs jXs, lc lcVar) throws Exception {
        return new Lxb(true, aH.Lxb(this.Lxb.Lxb(jXs.Lxb(Lxb(vve.JXs, (LD) jXs), lcVar))));
    }

    private Lxb Lxb(final VVE vve, final ZU zu, lc lcVar) throws Exception {
        this.lc.add(zu);
        zu.Lxb(Lxb(vve.JXs, zu), lcVar, new ZU.Lxb() { // from class: com.bytedance.sdk.component.Lxb.ebl.1
            @Override // com.bytedance.sdk.component.Lxb.ZU.Lxb
            public void Lxb(Object obj) {
                if (ebl.this.nBu == null) {
                    return;
                }
                ebl.this.nBu.LD(aH.Lxb(ebl.this.Lxb.Lxb(obj)), vve);
                ebl.this.lc.remove(zu);
            }

            @Override // com.bytedance.sdk.component.Lxb.ZU.Lxb
            public void Lxb(Throwable th) {
                if (ebl.this.nBu == null) {
                    return;
                }
                ebl.this.nBu.LD(aH.Lxb(th), vve);
                ebl.this.lc.remove(zu);
            }
        });
        return new Lxb(false, aH.Lxb());
    }

    private Lxb Lxb(final VVE vve, lk lkVar, eK eKVar) throws Exception {
        new tD(vve.ZU, eKVar, new tD.Lxb() { // from class: com.bytedance.sdk.component.Lxb.ebl.2
        });
        return new Lxb(false, aH.Lxb());
    }

    private Object Lxb(String str, LD ld) throws JSONException {
        return this.Lxb.Lxb(str, Lxb(ld)[0]);
    }

    private static Type[] Lxb(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
