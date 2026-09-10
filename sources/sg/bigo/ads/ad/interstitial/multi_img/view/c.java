package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f46418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f46419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f46420c;
    public final boolean d;

    public c(Context context, boolean z2) {
        LinearLayout linearLayout = (LinearLayout) sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_more, null, false);
        this.f46418a = linearLayout;
        this.f46419b = (TextView) linearLayout.findViewById(R.id.bigo_ad_more_txt);
        this.f46420c = (ImageView) linearLayout.findViewById(R.id.bigo_ad_more_img);
        this.d = z2;
        int iA = e.a(context, 20);
        if (z2) {
            linearLayout.setPadding(iA, 0, 0, 0);
        } else {
            linearLayout.setPadding(0, 0, iA, 0);
        }
        a(true);
    }

    public final void a(boolean z2) {
        if (z2) {
            this.f46419b.setTextColor(-1);
            this.f46420c.setImageResource(this.d ? R.drawable.bigo_ad_ic_right_round_white : R.drawable.bigo_ad_ic_left_round_white);
        } else {
            this.f46419b.setTextColor(-14275021);
            this.f46420c.setImageResource(this.d ? R.drawable.bigo_ad_ic_right_round_black : R.drawable.bigo_ad_ic_left_round_black);
        }
    }
}
