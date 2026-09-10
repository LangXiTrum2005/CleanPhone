package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37381a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f37382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f37383c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0195a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f37384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37385b;

        public C0195a(ImageView imageView, boolean z10) {
            this.f37384a = imageView;
            this.f37385b = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.f37385b) {
                this.f37384a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f37384a.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("OrderCampAdapter", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f37387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MBRotationView f37388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        MBridgeImageView f37389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RoundImageView f37390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f37391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        TextView f37392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        TextView f37393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        TextView f37394h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f37395i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ImageView f37396j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        ImageView f37397k;
        MBCusRoundImageView l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f37398m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f37399n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f37400o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        MBFrameLayout f37401p;
    }

    public a(List<CampaignEx> list) {
        this.f37383c = list;
    }

    private void a(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f37383c;
        if (list == null || this.f37382b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f37382b.f37389c;
        if (mBridgeImageView != null) {
            a(mBridgeImageView, this.f37383c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f37382b.f37397k;
        if (imageView != null) {
            a(imageView, this.f37383c.get(i10).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f37382b.f37390d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f37382b.f37390d, this.f37383c.get(i10).getIconUrl(), true);
        }
        double rating = this.f37383c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f37382b.f37395i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f37383c.get(i10).getNumberRating());
            this.f37382b.f37395i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f37382b.f37388b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f37382b.f37388b.setHeightRatio(1.0f);
            this.f37382b.f37388b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f37382b.f37389c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private View b(int i10) throws Throwable {
        View viewA;
        String str;
        try {
            List<CampaignEx> list = this.f37383c;
            String cMPTEntryUrl = "";
            if (list == null || list.get(i10) == null) {
                str = "501";
            } else {
                str = this.f37383c.get(i10).getMof_tplid() + "";
                cMPTEntryUrl = this.f37383c.get(i10).getCMPTEntryUrl();
            }
            if (TextUtils.isEmpty(cMPTEntryUrl)) {
                return a();
            }
            int iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
            String strA = z.a(0, str, cMPTEntryUrl);
            if (TextUtils.isEmpty(strA)) {
                return a();
            }
            File file = new File(strA + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                List<String> listA = o0.a(strA, "template_" + str + "_" + iG + "_item");
                if (listA == null) {
                    return a();
                }
                viewA = a(i10, listA);
                return this.f37381a ? viewA : a();
            }
            return a();
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
            viewA = null;
        }
    }

    private int c(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f37383c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f37383c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List<CampaignEx> list = this.f37383c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = b(i10);
            } else {
                this.f37382b = (b) view.getTag();
            }
            a(view);
            if (this.f37381a) {
                b(i10, viewGroup);
            } else {
                a(i10, viewGroup);
            }
            a(i10);
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
        }
        List<CampaignEx> list = this.f37383c;
        if (list != null && list.size() > i10) {
            b1.a(view, this.f37383c.get(i10).getLocalRequestId(), this.f37383c.get(i10).getLocalAllowTrackClick());
        }
        return view;
    }

    private void b(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f37383c;
        if (list == null || this.f37382b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f37382b.l;
        if (mBCusRoundImageView != null) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            a(this.f37382b.l, this.f37383c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f37382b.f37397k;
        if (imageView != null) {
            a(imageView, this.f37383c.get(i10).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f37382b.f37398m;
        if (mBCusRoundImageView2 != null) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            a(this.f37382b.f37398m, this.f37383c.get(i10).getIconUrl(), true);
        }
        double rating = this.f37383c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f37382b.f37399n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f37382b.f37399n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f37382b.f37400o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f37383c.get(i10).getNumberRating());
        }
    }

    private View a(int i10, List<String> list) {
        int iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
        i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f37383c.get(i10)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iG).adChoiceLink(v0.a(this.f37383c.get(i10))).build());
        if (viewCreateDynamicView != null) {
            this.f37381a = true;
            b bVar = new b();
            this.f37382b = bVar;
            bVar.l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv"));
            this.f37382b.f37397k = (ImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv_burl"));
            this.f37382b.f37398m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_icon_iv"));
            this.f37382b.f37399n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(b("mbridge_lv_sv_starlevel"));
            this.f37382b.f37401p = (MBFrameLayout) viewCreateDynamicView.findViewById(b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f37382b);
        }
        return viewCreateDynamicView;
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.n().d()).inflate(d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f37382b = bVar;
        bVar.f37389c = (MBridgeImageView) viewInflate.findViewById(c("mbridge_lv_iv"));
        this.f37382b.f37397k = (ImageView) viewInflate.findViewById(c("mbridge_lv_iv_burl"));
        this.f37382b.f37390d = (RoundImageView) viewInflate.findViewById(c("mbridge_lv_icon_iv"));
        this.f37382b.f37395i = (MBridgeLevelLayoutView) viewInflate.findViewById(c("mbridge_lv_sv_starlevel"));
        this.f37382b.f37388b = (MBRotationView) viewInflate.findViewById(c("mbridge_lv_ration"));
        viewInflate.setTag(this.f37382b);
        return viewInflate;
    }

    private void a(View view) {
        this.f37382b.f37387a = (RelativeLayout) view.findViewById(a("mbridge_lv_item_rl"));
        this.f37382b.f37391e = (TextView) view.findViewById(a("mbridge_lv_title_tv"));
        this.f37382b.f37393g = (TextView) view.findViewById(a("mbridge_lv_tv_install"));
        this.f37382b.f37400o = (MBHeatLevelLayoutView) view.findViewById(a("mbridge_lv_sv_heat_level"));
        this.f37382b.f37392f = (TextView) view.findViewById(a("mbridge_lv_desc_tv"));
        this.f37382b.f37396j = (ImageView) view.findViewById(a("mbridge_iv_flag"));
        this.f37382b.f37394h = (TextView) view.findViewById(a("mbridge_order_viewed_tv"));
    }

    private void a(ImageView imageView, String str, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new C0195a(imageView, z10));
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i10) {
        b bVar = this.f37382b;
        if (bVar != null) {
            if (bVar.f37391e != null) {
                this.f37382b.f37391e.setText(this.f37383c.get(i10).getAppName());
            }
            if (this.f37382b.f37392f != null) {
                this.f37382b.f37392f.setText(this.f37383c.get(i10).getAppDesc());
            }
            if (this.f37382b.f37393g != null) {
                String adCall = this.f37383c.get(i10).getAdCall();
                if (this.f37382b.f37393g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f37382b.f37393g).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(this.f37382b.f37393g));
                }
                this.f37382b.f37393g.setText(adCall);
            }
            if (this.f37382b.f37396j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                            this.f37382b.f37396j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        } else {
                            this.f37382b.f37396j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        }
                    }
                } catch (Exception e10) {
                    q0.b("OrderCampAdapter", e10.getMessage());
                }
                v0.a(2, this.f37382b.f37396j, this.f37383c.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), false, null);
            }
            if (this.f37382b.f37394h != null) {
                try {
                    this.f37382b.f37394h.setText(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getString(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", com.mbridge.msdk.foundation.controller.c.n().i())));
                    this.f37382b.f37394h.setVisibility(0);
                } catch (Exception e11) {
                    q0.b("OrderCampAdapter", e11.getMessage());
                }
            }
        }
    }

    private int a(String str) {
        if (this.f37381a) {
            return b(str);
        }
        return c(str);
    }
}
