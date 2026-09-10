package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ac {
    private boolean di = false;
    private lr fi;
    private Context ik;
    private com.bytedance.sdk.openadsdk.core.bgr.lr.ri ka;
    private TextView lr;
    private ViewGroup mj;
    private View ri;
    private com.bykv.vk.openvk.ri.ri.ri.ik.attabal xha;

    public interface lr {
        boolean qt();

        void sf();
    }

    public enum ri {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        if (this.ik == null) {
            return;
        }
        ka();
    }

    private void ka() {
        View view = this.ri;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void lr() {
        this.xha = null;
    }

    public void ri(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.mj = viewGroup;
        this.ik = com.bytedance.sdk.openadsdk.core.nr.ri().getApplicationContext();
    }

    private void ri(Context context, View view, boolean z) {
        ViewGroup.LayoutParams layoutParamsRi;
        if (context == null || view == null || this.ri != null || (layoutParamsRi = ri(this.mj)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.vr.fi fiVar = new com.bytedance.sdk.openadsdk.vr.fi(context);
        this.ri = fiVar;
        fiVar.setLayoutParams(layoutParamsRi);
        this.mj.addView(this.ri);
        this.lr = (TextView) this.ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ib);
        View viewFindViewById = this.ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.mvf);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ac.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ac.this.ik();
                    if (ac.this.ka != null) {
                        ac.this.ka.ri(ri.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams ri(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.lr.ri riVar, lr lrVar) {
        this.fi = lrVar;
        this.ka = riVar;
    }

    public boolean ri(int i, com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVar, boolean z) {
        Context context = this.ik;
        if (context == null || attabalVar == null) {
            return true;
        }
        ri(context, this.mj, z);
        this.xha = attabalVar;
        if (i == 1 || i == 2) {
            return ri(i);
        }
        return true;
    }

    private boolean ri(int i) {
        lr lrVar;
        if (ri() || this.di) {
            return true;
        }
        if (this.ka != null && (lrVar = this.fi) != null) {
            if (lrVar.qt()) {
                this.ka.fi(null, null);
            }
            this.ka.ri(ri.PAUSE_VIDEO, (String) null);
        }
        ri(this.xha, true);
        return false;
    }

    public void ri(boolean z) {
        if (z) {
            lr();
        }
        ka();
    }

    public boolean ri() {
        View view = this.ri;
        return view != null && view.getVisibility() == 0;
    }

    private void ri(com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVar, boolean z) {
        View view;
        String str;
        View view2;
        if (attabalVar == null || (view = this.ri) == null || this.ik == null || view.getVisibility() == 0) {
            return;
        }
        lr lrVar = this.fi;
        if (lrVar != null) {
            lrVar.sf();
        }
        double dCeil = Math.ceil((attabalVar.taiyuan() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(uq.ri(this.ik, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = uq.ri(this.ik, "tt_video_without_wifi_tips") + uq.ri(this.ik, "tt_video_bytesize");
        }
        qd.ri(this.ri, 0);
        qd.ri(this.lr, str);
        if (!qd.ka(this.ri) || (view2 = this.ri) == null) {
            return;
        }
        view2.bringToFront();
    }
}
