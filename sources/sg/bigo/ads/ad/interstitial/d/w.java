package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class w extends sg.bigo.ads.ad.d.f {
    protected sg.bigo.ads.api.a.m k;

    private w(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(Context context, ViewGroup viewGroup) {
    }

    public final void c(ViewGroup viewGroup) {
        sg.bigo.ads.api.a.m mVar = this.k;
        boolean z2 = mVar != null && mVar.c("video_play_page.media_view_clickable_switch");
        sg.bigo.ads.api.a.m mVar2 = this.k;
        boolean z3 = mVar2 != null && mVar2.c("video_play_page.ad_component_clickable_switch");
        sg.bigo.ads.api.a.m mVar3 = this.k;
        boolean z4 = mVar3 != null && mVar3.c("video_play_page.other_space_clickable_switch");
        sg.bigo.ads.api.a.m mVar4 = this.k;
        a(viewGroup, z2, z3, z4, mVar4 != null ? mVar4.a("video_play_page.click_type") : 1);
    }

    public sg.bigo.ads.common.utils.n e(ViewGroup viewGroup) {
        return null;
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean j() {
        sg.bigo.ads.api.a.m mVar = this.k;
        if (mVar == null) {
            return false;
        }
        return mVar.c("video_play_page.is_widget");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final int k() {
        sg.bigo.ads.api.a.m mVar = this.k;
        if (mVar == null) {
            return 1;
        }
        return mVar.a("video_play_page.close_button_style");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean l() {
        sg.bigo.ads.api.a.m mVar = this.k;
        if (mVar == null) {
            return false;
        }
        return mVar.c("video_play_page.is_cta_show_animation");
    }

    public final int m() {
        sg.bigo.ads.api.a.m mVar = this.k;
        if (mVar == null) {
            return 0;
        }
        return mVar.a("video_play_page.force_staying_time", 0);
    }

    public w(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar) {
        this(cVar);
        this.k = mVar;
    }

    public final void a(final View view, final View view2) {
        sg.bigo.ads.common.utils.u.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.w.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                sg.bigo.ads.common.w.b.a(sg.bigo.ads.common.utils.b.a(2), view);
                sg.bigo.ads.common.utils.b.a(view2);
            }
        });
    }

    public static void a(ViewGroup viewGroup, String str) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_ad_label);
        View viewFindViewById = viewGroup.findViewById(R.id.inter_separator);
        if (textView == null || textView2 == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        textView.setVisibility(!zIsEmpty ? 0 : 8);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(zIsEmpty ? 8 : 0);
        }
        if (zIsEmpty) {
            return;
        }
        textView.setText(str);
        textView2.setText(R.string.bigo_ad_tag);
    }
}
