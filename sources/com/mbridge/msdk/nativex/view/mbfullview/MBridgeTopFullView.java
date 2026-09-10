package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f35076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected TextView f35077k;
    protected TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f35078m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.f35072i);
        if (viewInflate != null) {
            this.f35076j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f35077k = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f35078m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f35076j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f35077k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f35078m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f35064a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f35065b.setLayoutParams(layoutParams2);
    }
}
