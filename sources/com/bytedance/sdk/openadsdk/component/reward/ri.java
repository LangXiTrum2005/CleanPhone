package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.su;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.fr;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.uq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import laky.attabal;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri<L, A> {
    protected com.bytedance.sdk.component.mj.lr.ik ka;
    protected final Context ri;
    protected final AtomicBoolean lr = new AtomicBoolean(false);
    protected final List<ri<L, A>.ka> ik = Collections.synchronizedList(new ArrayList());
    private final su.ri fi = new su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.6
        @Override // com.bytedance.sdk.component.utils.su.ri
        public void ri(Context context, Intent intent, boolean z, int i) {
            if (z) {
                ri riVar = ri.this;
                if (riVar.ka == null) {
                    riVar.ka = new lr("net connect task", riVar.ik);
                    com.bytedance.sdk.component.utils.jbs.ri().post(ri.this.ka);
                }
            }
        }
    };

    public class ik {
        protected final AtomicInteger ik;
        protected final com.bytedance.sdk.openadsdk.core.model.ri ka;
        protected final AtomicBoolean lr;
        protected final ri<L, A>.C0227ri ri;

        private int ri() {
            if (!this.ka.fi()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.ka.ka().size(); i2++) {
                wjv wjvVar = this.ka.ka().get(i2);
                if (wjvVar != null && !dw.ik(wjvVar) && wjvVar.eu() != null) {
                    i++;
                }
            }
            return i;
        }

        private ik(ri<L, A>.C0227ri c0227ri, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            this.lr = new AtomicBoolean(false);
            this.ri = c0227ri;
            this.ka = riVar;
            this.ik = new AtomicInteger(ri());
        }

        public void ri(int i, String str) {
            if (this.ik.decrementAndGet() > 0 || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.ri(i, str);
            com.bytedance.sdk.openadsdk.slm.ka.ri("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ik.1
                @Override // com.bytedance.sdk.openadsdk.slm.lr
                public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ik.this.ka.lr());
                    return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("choose_ad_load_error").lr(jSONObject.toString());
                }
            });
        }

        public void ri(A a) {
            this.ik.decrementAndGet();
            if (this.ri == null || !this.lr.compareAndSet(false, true)) {
                return;
            }
            this.ri.ri(a);
        }
    }

    public class ka extends com.bytedance.sdk.component.mj.lr.ik {
        final com.bytedance.sdk.openadsdk.core.model.ri ik;
        final AdSlot lr;
        final wjv ri;

        public ka(wjv wjvVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
            super("VideoPreloadTask");
            this.ri = wjvVar;
            this.lr = adSlot;
            this.ik = riVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wjv wjvVar = this.ri;
            if (wjvVar == null || wjvVar.eu() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ri(), this.ri);
            lrVarRi.ri("material_meta", this.ri);
            lrVarRi.ri("ad_slot", this.lr);
            com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ka.1
                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                }

                @Override // laky.saneness.attabal
                public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                    bgr bgrVarRi = ri.this.ri();
                    ka kaVar = ka.this;
                    bgrVarRi.ri(kaVar.lr, kaVar.ik);
                }
            });
        }
    }

    public class lr extends com.bytedance.sdk.component.mj.lr.ik {
        private final List<ri<L, A>.ka> lr;

        public lr(String str, List<ri<L, A>.ka> list) {
            super(str);
            this.lr = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<ri<L, A>.ka> list = this.lr;
            if (list == null || list.isEmpty()) {
                ri.this.ka = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.lr);
            this.lr.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((ka) it.next()).run();
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.ac.ri("BVL", "continue download task error", e);
                }
            }
            ri.this.ka = null;
        }
    }

    public ri(Context context) {
        this.ri = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context.getApplicationContext();
        ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(AdSlot adSlot) {
        ri().ri(adSlot.getCodeId());
    }

    private void lr(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, ri(adSlot, true), lr(), new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.1
            boolean ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                return ri.this.ri().ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                boolean zRi = ri.this.ri().ri(riVar);
                this.ri = zRi;
                return zRi;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                if (this.ri || riVar.ka() == null || riVar.ka().isEmpty()) {
                    return;
                }
                ri riVar2 = ri.this;
                ri.this.ri(riVar, riVar2.ri(riVar2.ri, riVar, adSlot), adSlot, true, (Object) null);
            }
        });
    }

    public abstract int di();

    public void fi() {
        try {
            ri().ri();
        } catch (Throwable unused) {
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.ka != null) {
            try {
                com.bytedance.sdk.component.utils.jbs.ri().removeCallbacks(this.ka);
            } catch (Throwable unused) {
            }
            this.ka = null;
        }
        ka();
    }

    public void ka() {
        if (this.lr.get()) {
            this.lr.set(false);
            try {
                su.ri(this.fi);
            } catch (Exception unused) {
            }
        }
    }

    public abstract int lr();

    public abstract void lr(A a);

    public abstract bgr ri();

    public abstract A ri(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, AdSlot adSlot);

    public abstract Object ri(A a);

    public abstract void ri(L l, int i, String str);

    public abstract void ri(L l, Object obj);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri$ri, reason: collision with other inner class name */
    public class C0227ri {
        protected final L ik;
        protected final boolean ka;
        protected final com.bytedance.sdk.openadsdk.core.model.ri lr;
        protected final AdSlot ri;

        public C0227ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar, L l, boolean z) {
            this.ri = adSlot;
            this.lr = riVar;
            this.ik = l;
            this.ka = z;
        }

        public void ri(int i, String str) {
            L l = this.ik;
            if (l != null) {
                ri.this.ri(l, i, str);
            }
        }

        public void ri(A a) {
            ri.this.ri(this.ri, this.lr, this.ik, a, this.ka);
        }
    }

    private void lr(final AdSlot adSlot, final L l) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.nr.ik().ri(adSlot, ri(adSlot, false), lr(), new uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.2
            boolean ri = false;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(int i, String str) {
                Object obj = l;
                if (obj != null) {
                    ri.this.ri(obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
            public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                com.bytedance.sdk.openadsdk.core.model.ri riVar2;
                if (riVar.ka() != null && !riVar.ka().isEmpty()) {
                    ri riVar3 = ri.this;
                    Object objRi = riVar3.ri(riVar3.ri, riVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.uq.ri.ka.ri().ri(riVar.ka().isEmpty() ? null : riVar.ka().get(0));
                        com.bytedance.sdk.openadsdk.slm.ka.ri(riVar.di(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l == null || com.bytedance.sdk.openadsdk.core.nr.ka().zf() != 0) {
                        riVar2 = riVar;
                    } else {
                        ri.this.ri(adSlot, riVar, l, objRi, this.ri);
                        riVar2 = riVar;
                        objRi = objRi;
                    }
                    ri.this.ri(riVar2, objRi, adSlot, false, l);
                    return;
                }
                Object obj = l;
                if (obj != null) {
                    ri.this.ri(obj, -3, com.bytedance.sdk.openadsdk.core.jbs.ri(-3));
                    ikVar.ri(-3);
                    ikVar.ik(ri.this.di());
                    com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public String ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strRi = ri.this.ri().ri(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strRi);
                if (TextUtils.isEmpty(strRi)) {
                    return null;
                }
                return strRi;
            }

            @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.ihz
            public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                this.ri = ri.this.ri().ri(riVar);
                return this.ri;
            }
        });
    }

    public void ik() {
        if (this.lr.get()) {
            return;
        }
        this.lr.set(true);
        su.ri(this.fi, this.ri);
    }

    public void ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        lr(adSlot);
    }

    public void ri(AdSlot adSlot, L l) {
        Objects.toString(adSlot);
        Objects.toString(l);
        lr(adSlot, l);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, A a, AdSlot adSlot, boolean z, L l) {
        if (!z) {
            com.bytedance.sdk.openadsdk.bgr.ri.ri().ri(riVar.di());
        }
        ri<L, A> riVar2 = this;
        AdSlot adSlot2 = adSlot;
        ri<L, A>.ik ikVar = new ik(riVar2.new C0227ri(adSlot2, riVar, l, false), riVar);
        ri(riVar);
        int i = 0;
        while (i < riVar.ka().size()) {
            wjv wjvVar = riVar.ka().get(i);
            int iNd = wjvVar.nd();
            if (i == 0 && iNd == 43) {
                wjvVar.eu().competently(0);
            }
            A a2 = a;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            riVar2.ri(riVar, wjvVar, a2, adSlot3, z2, ikVar);
            adSlot2 = adSlot3;
            if (riVar.mj() && iNd != 43) {
                return;
            }
            i++;
            riVar2 = this;
            a = a2;
            z = z2;
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        fr frVarQt = riVar.qt();
        int iSlm = riVar.mj() ? 10 : 1;
        if (frVarQt != null) {
            iSlm = frVarQt.slm();
        }
        for (final int i = 0; i < riVar.ka().size() && i < iSlm; i++) {
            com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(riVar.ka().get(i), new com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.bgr.ik.ri.InterfaceC0232ri
                public void ri(boolean z) {
                    com.bytedance.sdk.component.utils.ac.ri("BVL", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    private boolean ri(boolean z, wjv wjvVar, AdSlot adSlot) {
        if (z) {
            return !dw.ik(wjvVar) && wjv.fi(wjvVar) && com.bytedance.sdk.openadsdk.core.nr.ka().su(adSlot.getCodeId()).ka == 1 && !com.bytedance.sdk.component.utils.nr.ka(this.ri);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(ri<L, A>.ik ikVar) {
        return ikVar != null && com.bytedance.sdk.openadsdk.core.nr.ka().zf() == 1;
    }

    private void ri(wjv wjvVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ri riVar, final A a, final boolean z, final ri<L, A>.ik ikVar) {
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(wjvVar.qf()).ri(), wjvVar);
        lrVarRi.ri("material_meta", wjvVar);
        lrVarRi.ri("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar2, int i) {
                ri.this.lr(a);
                if (z) {
                    ri.this.ri().ri(adSlot, riVar);
                } else if (ri.this.ri(ikVar)) {
                    ikVar.ri(a);
                }
            }

            @Override // laky.saneness.attabal
            public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar2, int i, String str) {
                if (ri.this.ri(ikVar)) {
                    ikVar.ri(i, str);
                }
            }
        });
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, wjv wjvVar, A a, AdSlot adSlot, boolean z, ri<L, A>.ik ikVar) {
        A a2;
        ri<L, A>.ik ikVar2;
        if (ri(z, wjvVar, adSlot)) {
            ri((ka) new ka(wjvVar, adSlot, riVar));
            return;
        }
        boolean zRi = ri((ik) ikVar);
        if (dw.ik(wjvVar)) {
            a2 = a;
            ikVar2 = ikVar;
            if (z) {
                ri().ri(adSlot, riVar);
            }
        } else if (!wjv.fi(wjvVar)) {
            a2 = a;
            ikVar2 = ikVar;
            if (z) {
                ri().ri(adSlot, riVar);
            }
        } else {
            if (wjvVar.eu() == null) {
                return;
            }
            a2 = a;
            ikVar2 = ikVar;
            ri(wjvVar, adSlot, riVar, a2, z, ikVar2);
            zRi = false;
        }
        if (zRi) {
            ikVar2.ri(a2);
        }
    }

    public void ri(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ri riVar, L l, A a, final boolean z) {
        com.bytedance.sdk.openadsdk.core.vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    ri.this.ik(adSlot);
                } else {
                    ri.this.ri().ri(adSlot, riVar);
                    ri.this.ik(adSlot);
                }
            }
        });
        if (l != null) {
            ri(l, ri(a));
        }
    }

    public void ri(ri<L, A>.ka kaVar) {
        if (kaVar == null) {
            return;
        }
        if (this.ik.size() > 0) {
            this.ik.remove(0);
        }
        this.ik.add(kaVar);
    }

    public igq ri(AdSlot adSlot, boolean z) {
        igq igqVar = new igq();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.nr.ka().co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd())) {
            igqVar.jbs = 2;
        }
        if (lr() == 7) {
            igqVar.lr = z ? 2 : 1;
            return igqVar;
        }
        igqVar.ik = z ? 2 : 1;
        return igqVar;
    }

    public void ri(String str, wjv wjvVar) {
        ri().ri(str, wjvVar);
    }
}
