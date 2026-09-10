package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f35064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f35065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f35066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f35067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f35068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f35069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f35070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f35071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f35072i;
    public a style;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f35072i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f35064a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f35065b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f35066c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f35067d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f35068e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f35069f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f35070g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f35071h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f35066c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f35067d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f35069f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f35064a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f35065b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f35068e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f35070g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f35071h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
