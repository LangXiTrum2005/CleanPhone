package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.zf;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    public interface lr {
        void ri();

        void ri(boolean z, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0226ri {
        void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, View view);
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.lr ik(final bgr bgrVar) {
        final com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarRi = bgrVar.ri();
        final String strLr = bgrVar.lr();
        final lr lrVarKa = bgrVar.ka();
        final slm slmVarDi = bgrVar.di();
        final boolean zFi = bgrVar.fi();
        return new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.common.ri.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar;
                View viewQt;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = riVarRi;
                if (riVar == null || (sfVar = riVar.dzy) == null || (viewQt = sfVar.qt()) == null) {
                    return;
                }
                viewQt.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
                if (bgrVar.ri() == null || bgrVar.xha() == null) {
                    return;
                }
                bgrVar.xha().ri(bgrVar.ri(), view);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ik ikVar;
                com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = riVarRi;
                if (riVar == null || (ikVar = riVar.zf) == null || (lrVar = riVar.nd) == null) {
                    return;
                }
                ikVar.ri(lrVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                if (ri.lr(slmVarDi, riVarRi, false, strLr)) {
                    return;
                }
                if (zFi && ri.lr(riVarRi, strLr, lrVarKa)) {
                    return;
                }
                ri.ri(riVarRi);
                ri.ri(riVarRi, lrVarKa);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = riVarRi;
                if (riVar == null) {
                    return;
                }
                ri.ri(riVar, riVar.nd, str);
            }
        };
    }

    public static void lr(bgr bgrVar) {
        ri(bgrVar);
        bgrVar.ri().oh.ri(ik(bgrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(slm slmVar, com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, boolean z, String str) {
        if (slmVar == null) {
            return false;
        }
        if (!slmVar.ri(dw.ik(riVar.lr), z, null) && (riVar.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.fi)) {
            return ((com.bytedance.sdk.openadsdk.activity.single.fi) riVar.ajz).mj();
        }
        return true;
    }

    public static void ri(final bgr bgrVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar;
        final View viewQt;
        final com.bytedance.sdk.openadsdk.component.reward.ri.ri riVarRi = bgrVar.ri();
        if (riVarRi == null || (sfVar = riVarRi.dzy) == null || (viewQt = sfVar.qt()) == null) {
            return;
        }
        final String strLr = bgrVar.lr();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ri.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ri.lr(riVarRi, viewQt)) {
                    return;
                }
                riVarRi.ory.ihz();
                riVarRi.hcw.sf();
                riVarRi.su.di();
                slm slmVarDi = bgrVar.di();
                if (slmVarDi == null || !dw.ka(riVarRi.lr)) {
                    bgrVar.ik().run();
                    return;
                }
                boolean zLr = ri.lr(slmVarDi, riVarRi, true, strLr);
                if (!(riVarRi.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.fi) || zLr) {
                    return;
                }
                bgrVar.ik().run();
            }
        };
        viewQt.setOnClickListener(onClickListener);
        viewQt.setTag(viewQt.getId(), onClickListener);
    }

    private static void ik(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        wjv wjvVar;
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        if (riVar == null || (wjvVar = riVar.lr) == null || (kaVarQc = wjvVar.qc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi = kaVarQc.ri();
        long jAw = riVar.ihz.aw();
        if (riVar.zyn) {
            kaVarRi.mj(jAw);
        } else {
            kaVarRi.jbs(jAw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, String str, lr lrVar) {
        if (riVar.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.fi) {
            lrVar.ri();
            return true;
        }
        boolean zMj = dw.mj(riVar.lr);
        boolean zDi = dw.di(riVar.lr);
        boolean zFi = dw.fi(riVar.lr);
        if (!zDi && (!zFi || !riVar.wjv.ka(com.bytedance.sdk.openadsdk.component.reward.ri.mj.lr))) {
            if (com.bytedance.sdk.openadsdk.core.model.ac.ri(riVar.lr) && !riVar.aw.get()) {
                lrVar.ri();
                return true;
            }
            riVar.oh.ka(false);
            return false;
        }
        if (zMj) {
            riVar.wjv.jbs();
        } else {
            View viewQt = riVar.dzy.qt();
            if (viewQt != null) {
                viewQt.performClick();
            } else {
                lrVar.ri();
            }
        }
        return true;
    }

    public static void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        if (riVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar2 = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
        riVar2.lr(riVar.ihz.aw());
        riVar2.ka(riVar.ihz.su());
        riVar2.ik(riVar.ihz.bu());
        riVar2.ik(3);
        riVar2.ka(riVar.ihz.fr());
        riVar2.ri(riVar.ihz.lr());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(riVar.ihz.mj(), riVar2, riVar.ihz.fi());
        zf.ik(riVar.di);
        riVar.ihz.ri("skip", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, View view) {
        if (!riVar.ory.ac() || (!riVar.xe && !riVar.jbs.get())) {
            return false;
        }
        boolean zAw = riVar.hcw.aw();
        riVar.ory.di(zAw);
        riVar.dzy.di(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.di.ka) view).setImageResource(uq.ka(riVar.srn, "tt_close_btn"));
        }
        riVar.jc.sendEmptyMessageDelayed(600, 5000L);
        return !wjv.ik(riVar.lr) || zAw;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public static void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, lr lrVar) {
        if (riVar.ik) {
            if (com.bytedance.sdk.openadsdk.core.model.ac.ik(riVar.lr)) {
                com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi = riVar.ay.ri();
                if (ikVarRi == null || ikVarRi.ka != 0) {
                    lrVar.ri(true, 4);
                } else {
                    lrVar.ri();
                }
            } else {
                lrVar.ri(true, 4);
                if (com.bytedance.sdk.openadsdk.core.model.ac.ri(riVar.lr) && !riVar.aw.get()) {
                    lrVar.ri();
                }
            }
        } else {
            lrVar.ri();
        }
        lr(riVar);
    }

    public static void lr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        if (riVar == null) {
            return;
        }
        wjv wjvVar = riVar.lr;
        if (wjvVar != null && (kaVarQc = wjvVar.qc()) != null && (kaVarRi = kaVarQc.ri()) != null) {
            long jAw = riVar.ihz.aw();
            kaVarRi.di(jAw);
            kaVarRi.fi(jAw);
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(riVar.lr, 5);
    }

    public static void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar, String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar;
        if (riVar == null || riVar.nd == null) {
            return;
        }
        riVar.zyn = !riVar.zyn;
        boolean z = riVar.ajz instanceof com.bytedance.sdk.openadsdk.activity.single.fi;
        if (riVar.xe && !z && (jbsVar = riVar.ay) != null && jbsVar.ri() != null) {
            riVar.ay.ri().setSoundMute(riVar.zyn);
        }
        riVar.ihz.ri(riVar.zyn, str);
        riVar.ory.fi(riVar.zyn);
        riVar.wjv.lr(riVar.zyn);
        if (z) {
            return;
        }
        ik(riVar);
    }
}
