package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f37370c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f37371a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37372b = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f37376a;

        public b(MOfferModel mOfferModel) {
            this.f37376a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f37376a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f37378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f37379b;

        public c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f37378a = mOfferModel;
            this.f37379b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f37378a, this.f37379b, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean b(String str) {
        if (this.f37371a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f37371a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (f37370c != null) {
            return f37370c;
        }
        synchronized (a.class) {
            try {
                if (f37370c == null) {
                    f37370c = new a();
                }
                aVar = f37370c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0194a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f37373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MOfferModel f37374b;

        public C0194a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f37373a = viewGroup;
            this.f37374b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f37373a) == null) {
                return;
            }
            try {
                a.this.a(this.f37374b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i10, String str) {
            q0.b("MOfferEnergize", str);
        }
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f37371a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f37371a.clear();
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f37371a == null || TextUtils.isEmpty(str) || !this.f37371a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f37371a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        a(mOfferModel, viewGroup, aVar);
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C0194a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, iA, iA, iA);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, v0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, f2.c(100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.f37372b + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.f37372b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        int iG;
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        if (mOfferModel != null) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() == null || mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() == null) {
                    iG = 1;
                } else {
                    iG = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().g();
                    if (iG == 0) {
                        iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            iG = 1;
        }
        if (iG != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                imageView2 = (ImageView) viewGroup.findViewById(-1803557032);
            } else {
                imageView2 = (ImageView) viewGroup.findViewById(a("mbridge_iv_adbanner"));
            }
            int iH = v0.h(com.mbridge.msdk.foundation.controller.c.n().d()) - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.height = iH;
            layoutParams.width = (iH * 16) / 9;
            imageView2.setLayoutParams(layoutParams);
        }
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                imageView = (ImageView) viewGroup.findViewById(389008949);
                textView = (TextView) viewGroup.findViewById(1561614848);
            } else {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                imageView = (ImageView) viewGroup.findViewById(a("mbridge_iv_flag"));
                textView = (TextView) viewGroup.findViewById(a("mbridge_tv_flag"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(imageView);
            arrayList.add(textView);
            new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.f37372b);
        } else {
            relativeLayout = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, 0);
        viewGroup2.setLayoutParams(layoutParams2);
        if (relativeLayout != null) {
            relativeLayout.addView(viewGroup2);
        }
    }

    private void a(ViewGroup viewGroup) {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable != null && (viewFindViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) != null) {
                    viewFindViewById.setBackground(drawable);
                }
            } catch (Exception e10) {
                q0.b("MOfferEnergize", e10.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f37371a == null) {
            this.f37371a = new ConcurrentHashMap();
        }
        if (this.f37371a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f37371a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i10) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f37371a == null) {
            this.f37371a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i10);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f37371a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MOfferEnergize", e10.getMessage());
        }
    }

    private int a(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }
}
