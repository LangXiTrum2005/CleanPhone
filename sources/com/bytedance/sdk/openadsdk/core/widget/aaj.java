package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class aaj {
    private ViewGroup jpc;
    private Context lnr;
    private com.bytedance.sdk.openadsdk.core.exu.ud.qdl mml;
    private boolean mo = false;
    private ud mzz;
    private View qdl;
    private TextView ud;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud wd;

    public enum qdl {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public interface ud {
        void rq();

        boolean to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        if (this.lnr == null) {
            return;
        }
        mml();
    }

    private void mml() {
        View view = this.qdl;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void ud() {
        this.wd = null;
    }

    public void qdl(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.jpc = viewGroup;
        this.lnr = com.bytedance.sdk.openadsdk.core.yt.qdl().getApplicationContext();
    }

    private void qdl(Context context, View view, boolean z2) {
        ViewGroup.LayoutParams layoutParamsQdl;
        if (context == null || view == null || this.qdl != null || (layoutParamsQdl = qdl(this.jpc)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.rdp.bjy bjyVar = new com.bytedance.sdk.openadsdk.rdp.bjy(context);
        this.qdl = bjyVar;
        bjyVar.setLayoutParams(layoutParamsQdl);
        this.jpc.addView(this.qdl);
        this.ud = (TextView) this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.az);
        View viewFindViewById = this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.fhs);
        if (z2) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.aaj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    aaj.this.lnr();
                    if (aaj.this.mml != null) {
                        aaj.this.mml.qdl(qdl.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams qdl(ViewGroup viewGroup) {
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

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.ud.qdl qdlVar, ud udVar) {
        this.mzz = udVar;
        this.mml = qdlVar;
    }

    public boolean qdl(int i2, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar, boolean z2) {
        Context context = this.lnr;
        if (context == null || udVar == null) {
            return true;
        }
        qdl(context, this.jpc, z2);
        this.wd = udVar;
        if (i2 == 1 || i2 == 2) {
            return qdl(i2);
        }
        return true;
    }

    private boolean qdl(int i2) {
        ud udVar;
        if (qdl() || this.mo) {
            return true;
        }
        if (this.mml != null && (udVar = this.mzz) != null) {
            if (udVar.to()) {
                this.mml.mzz(null, null);
            }
            this.mml.qdl(qdl.PAUSE_VIDEO, (String) null);
        }
        qdl(this.wd, true);
        return false;
    }

    public void qdl(boolean z2) {
        if (z2) {
            ud();
        }
        mml();
    }

    public boolean qdl() {
        View view = this.qdl;
        return view != null && view.getVisibility() == 0;
    }

    private void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar, boolean z2) {
        View view;
        String str;
        View view2;
        if (udVar == null || (view = this.qdl) == null || this.lnr == null || view.getVisibility() == 0) {
            return;
        }
        ud udVar2 = this.mzz;
        if (udVar2 != null) {
            udVar2.rq();
        }
        double dCeil = Math.ceil((udVar.mzz() * 1.0d) / 1048576.0d);
        if (z2) {
            str = String.format(ljh.qdl(this.lnr, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = ljh.qdl(this.lnr, "tt_video_without_wifi_tips") + ljh.qdl(this.lnr, "tt_video_bytesize");
        }
        ax.qdl(this.qdl, 0);
        ax.qdl(this.ud, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!ax.mml(this.qdl) || (view2 = this.qdl) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
