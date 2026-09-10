package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri extends com.bytedance.sdk.openadsdk.core.di.ik {
    protected String di;
    protected TTDislikeDialogAbstract fi;
    protected com.bytedance.sdk.openadsdk.core.model.wjv ik;
    protected boolean jbs;
    protected com.bytedance.sdk.openadsdk.ik.ik ka;
    protected Context lr;
    protected int mj;
    protected boolean qt;
    private com.bytedance.sdk.openadsdk.ka.xha ri;
    protected String sf;
    protected int xha;

    public ri(Context context) {
        super(context);
        this.di = "embeded_ad";
        this.jbs = true;
        this.qt = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public String getDescription() {
        if (TextUtils.isEmpty(this.ik.xh())) {
            return !TextUtils.isEmpty(this.ik.tq()) ? this.ik.tq() : "";
        }
        return this.ik.xh();
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ik;
        if (wjvVar == null) {
            return "";
        }
        if (wjvVar.tyz() == null || TextUtils.isEmpty(this.ik.tyz().lr())) {
            return !TextUtils.isEmpty(this.ik.tpb()) ? this.ik.tpb() : "";
        }
        return this.ik.tyz().lr();
    }

    public float getRealHeight() {
        return qd.ik(this.lr, this.mj);
    }

    public float getRealWidth() {
        return qd.ik(this.lr, this.xha);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        if (this.ik.tyz() != null && !TextUtils.isEmpty(this.ik.tyz().lr())) {
            return this.ik.tyz().lr();
        }
        if (TextUtils.isEmpty(this.ik.tpb())) {
            return !TextUtils.isEmpty(this.ik.xh()) ? this.ik.xh() : "";
        }
        return this.ik.tpb();
    }

    public com.bytedance.sdk.openadsdk.core.bgr.lr.di getVideoView() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ik;
        if (wjvVar != null && this.lr != null) {
            if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(wjvVar)) {
                try {
                    diVar = new com.bytedance.sdk.openadsdk.core.bgr.lr.di(this.lr, this.ik, this.di, true, false, this.ri);
                    diVar.setVideoCacheUrl(this.sf);
                    diVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ri.2
                        @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr
                        public void ri(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    diVar.setIsAutoPlay(this.jbs);
                    diVar.ri(this.qt, "bannerGetVideoView");
                } catch (Throwable unused) {
                    diVar = null;
                }
            } else {
                diVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.wjv.fi(this.ik) && diVar != null && diVar.ri(0L, true, false)) {
                return diVar;
            }
        }
        return null;
    }

    public void ri() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fi;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.ik.ik ikVar = this.ka;
        if (ikVar != null) {
            ikVar.ri();
        } else {
            TTDelegateActivity.ri(this.ik, (String) null);
        }
    }

    public abstract void ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar);

    public void setDislikeInner(ory oryVar) {
        if (oryVar instanceof com.bytedance.sdk.openadsdk.ik.ik) {
            this.ka = (com.bytedance.sdk.openadsdk.ik.ik) oryVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        if (tTDislikeDialogAbstract != null && (wjvVar = this.ik) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(wjvVar.yjg(), this.ik.ib());
        }
        this.fi = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void ri(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.lr;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ik;
            String str = this.di;
            lrVar = new com.bytedance.sdk.openadsdk.core.ik.ri(context, wjvVar, str, ig.ri(str));
        } else {
            Context context2 = this.lr;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.ik;
            String str2 = this.di;
            lrVar = new com.bytedance.sdk.openadsdk.core.ik.lr(context2, wjvVar2, str2, ig.ri(str2));
        }
        view.setOnTouchListener(lrVar);
        view.setOnClickListener(lrVar);
        lrVar.ri(new lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.lr
            public void ri(View view2, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
                ri.this.ri(view2, i, slmVar);
            }
        });
    }

    public void ri(View view) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ik;
        if (wjvVar == null || wjvVar.eu() == null || view == null) {
            return;
        }
        ri(view, this.ik.ud() == 1 && this.jbs);
    }
}
