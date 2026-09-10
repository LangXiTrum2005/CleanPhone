package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.common.inner.ui.BaseBannerTUView;
import com.thinkup.core.common.inner.ui.BaseTUView;
import com.thinkup.core.common.inner.ui.CloseImageView;
import com.thinkup.core.common.inner.ui.ScanningAnimButton;
import com.thinkup.core.common.mn.oo.o.o0;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.res.oo;
import com.thinkup.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyBannerTUView extends BaseBannerTUView implements o0 {
    private LinearLayout m0;
    private TextView mm;
    private ScanningAnimButton mn;
    private TextView mo;
    private RoundImageView n0;
    private View nm;
    private List<Integer> nn;
    private View no;
    private ViewGroup o0;
    private boolean o00;
    private String o0m;
    private com.thinkup.core.common.inner.mixad.om.m o0n;
    private TextView o0o;
    private FrameLayout om;
    private FrameLayout on;
    private com.thinkup.core.common.mn.on.o0 oo;
    private Context oo0;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyBannerTUView$1, reason: invalid class name */
    public class AnonymousClass1 implements com.thinkup.core.common.res.m.o {
        public AnonymousClass1() {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(((BaseTUView) ThirdPartyBannerTUView.this).m00.no(), str)) {
                ThirdPartyBannerTUView.this.n0.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyBannerTUView$2, reason: invalid class name */
    public class AnonymousClass2 implements com.thinkup.core.common.res.m.o {
        final /* synthetic */ RoundImageView m;
        final /* synthetic */ String o;

        public AnonymousClass2(String str, RoundImageView roundImageView) {
            this.o = str;
            this.m = roundImageView;
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onFail(String str, String str2) {
        }

        @Override // com.thinkup.core.common.res.m.o
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.o, str)) {
                this.m.setImageBitmap(bitmap);
            }
        }
    }

    public ThirdPartyBannerTUView(Context context) {
        super(context);
        this.o00 = false;
        this.o0m = "";
        this.oo0 = context;
    }

    private void m0() {
        FrameLayout frameLayout = (FrameLayout) a.c(this, "myoffer_banner_template_view", "id");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        View adMediaView = this.oo.getAdMediaView(frameLayout);
        this.nm = adMediaView;
        if (adMediaView != null) {
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.nm.getParent()).removeView(this.nm);
            }
            frameLayout.addView(this.nm, layoutParams);
        }
        CloseImageView closeImageView = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
        this.m = closeImageView;
        if (closeImageView != null) {
            if (this.o00) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
    }

    private void mm() {
        ArrayList arrayList = new ArrayList();
        if (this.on != null) {
            arrayList.add(this.om);
        }
        FrameLayout frameLayout = this.on;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        this.o0n = new com.thinkup.core.common.inner.mixad.om.m.o().o(arrayList).o(this.mo).m(this.mm).n(this.mn).o();
    }

    private boolean mn() {
        return this.oo.isNativeExpress();
    }

    private void mo() {
        this.om = (FrameLayout) a.c(this, "myoffer_main_resouce_container", "id");
        this.on = (FrameLayout) a.c(this, "myoffer_banner_icon_container", "id");
        this.m0 = (LinearLayout) a.c(this, "ll_title_desc", "id");
        this.n0 = (RoundImageView) a.c(this, "myoffer_banner_icon", "id");
        this.mo = (TextView) a.c(this, "myoffer_banner_ad_title", "id");
        this.mm = (TextView) a.c(this, "myoffer_banner_desc", "id");
        this.mn = (ScanningAnimButton) a.c(this, "myoffer_banner_ad_install_btn", "id");
        this.o0o = (TextView) a.c(this, "myoffer_banner_ad_from", "id");
        CloseImageView closeImageView = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
        this.m = closeImageView;
        o(this.o0o, this.oo.getAdFrom());
        if (closeImageView != null) {
            if (this.o00) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.oo.getAdIconView();
        this.no = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.no.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.no.getParent()).removeView(this.no);
            }
            this.on.removeAllViews();
            this.on.addView(this.no, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.m00.no()) || this.n0 == null) {
            FrameLayout frameLayout = this.on;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            this.on.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.on.getLayoutParams();
            this.n0.setRadiusInDip(6);
            this.n0.setNeedRadiu(true);
            com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, this.m00.no()), layoutParams.width, layoutParams.height, new AnonymousClass1());
        }
        o(this.mo, this.m00.mn());
        String strO00 = this.m00.o00();
        o(this.mn, strO00);
        if (TextUtils.isEmpty(strO00)) {
            ScanningAnimButton scanningAnimButton = this.mn;
            if (scanningAnimButton != null) {
                scanningAnimButton.setVisibility(8);
            }
        } else {
            ScanningAnimButton scanningAnimButton2 = this.mn;
            if (scanningAnimButton2 != null) {
                scanningAnimButton2.setVisibility(0);
            }
        }
        o(this.mm, this.m00.n0());
        if (this.om != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.nm = this.oo.getAdMediaView(this.om);
            String mainImageUrl = this.oo.getMainImageUrl();
            if (this.nm != null) {
                this.om.setVisibility(0);
                if (this.nm.getParent() != null) {
                    ((ViewGroup) this.nm.getParent()).removeView(this.nm);
                }
                this.om.addView(this.nm, layoutParams2);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.om.setVisibility(8);
            } else {
                this.om.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.om.addView(roundImageView, layoutParams2);
                com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
            }
        }
        View adLogoView = this.oo.getAdLogoView();
        com.thinkup.core.common.inner.ui.oo.o oVar = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
        this.f41834n = oVar;
        oVar.o(adLogoView);
        this.f41834n.m(this);
    }

    private void o0() {
        this.o00 = this.oo.o0o();
        this.nn = new ArrayList();
        if (!this.oo.isNativeExpress()) {
            for (int i2 : this.oo.mo()) {
                this.nn.add(Integer.valueOf(i2));
            }
        }
        this.o0m = this.oo.nn();
    }

    private void om() {
        byte b2 = 0;
        this.o0 = (ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
        int iO = o00.o(getContext(), 320.0f);
        int iO2 = o00.o(getContext(), 50.0f);
        String str = this.o0m;
        str.getClass();
        switch (str.hashCode()) {
            case -559799608:
                if (!str.equals("300x250")) {
                    b2 = -1;
                }
                break;
            case 1507809730:
                b2 = !str.equals("320x50") ? (byte) -1 : (byte) 1;
                break;
            case 1507809854:
                b2 = !str.equals("320x90") ? (byte) -1 : (byte) 2;
                break;
            case 1622564786:
                b2 = !str.equals("728x90") ? (byte) -1 : (byte) 3;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                iO = o00.o(getContext(), 300.0f);
                iO2 = o00.o(getContext(), 250.0f);
                break;
            case 1:
                iO = o00.o(getContext(), 320.0f);
                iO2 = o00.o(getContext(), 50.0f);
                break;
            case 2:
                iO = o00.o(getContext(), 320.0f);
                iO2 = o00.o(getContext(), 90.0f);
                break;
            case 3:
                iO = o00.o(getContext(), 720.0f);
                iO2 = o00.o(getContext(), 90.0f);
                break;
        }
        this.o0.setLayoutParams(new ViewGroup.LayoutParams(Math.min(iO, getResources().getDisplayMetrics().widthPixels), iO2));
        addView(this.o0);
    }

    private void on() {
        String str;
        this.o0 = new FrameLayout(this.oo0);
        String str2 = this.o0m;
        str2.getClass();
        switch (str2) {
            case "300x250":
                str = "myoffer_banner_native_ad_layout_300x250";
                break;
            case "320x90":
                com.thinkup.core.common.mn.on.o0 o0Var = this.oo;
                if (o0Var.getAdMediaView(this) != null || !TextUtils.isEmpty(o0Var.getMainImageUrl())) {
                    str = "myoffer_banner_native_ad_layout_320x90";
                    break;
                } else {
                    str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                    break;
                }
                break;
            case "728x90":
                str = "myoffer_banner_native_ad_layout_728x90";
                break;
            default:
                str = "myoffer_banner_native_ad_layout_320x50";
                break;
        }
        this.o0.addView((ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), str, "layout"), (ViewGroup) this, false));
        addView(this.o0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:6:0x0055  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, android.view.ViewGroup, com.thinkup.core.common.inner.ui.BaseBannerTUView, com.thinkup.core.common.inner.ui.BaseTUView, com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyBannerTUView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private void oo() {
        float f;
        String str;
        boolean z2;
        byte b2;
        byte b3;
        ?? r7;
        ViewGroup.LayoutParams layoutParams;
        float f2 = 300.0f;
        if (this.oo.isNativeExpress()) {
            this.o0 = (ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int iO = o00.o(getContext(), 320.0f);
            int iO2 = o00.o(getContext(), 50.0f);
            String str2 = this.o0m;
            str2.getClass();
            switch (str2) {
                case "300x250":
                    iO = o00.o(getContext(), 300.0f);
                    f = 250.0f;
                    iO2 = o00.o(getContext(), 250.0f);
                    break;
                case "320x50":
                    iO = o00.o(getContext(), 320.0f);
                    iO2 = o00.o(getContext(), 50.0f);
                    f = 250.0f;
                    break;
                case "320x90":
                    iO = o00.o(getContext(), 320.0f);
                    iO2 = o00.o(getContext(), 90.0f);
                    f = 250.0f;
                    break;
                case "728x90":
                    iO = o00.o(getContext(), 720.0f);
                    iO2 = o00.o(getContext(), 90.0f);
                    f = 250.0f;
                    break;
                default:
                    f = 250.0f;
                    break;
            }
            this.o0.setLayoutParams(new ViewGroup.LayoutParams(Math.min(iO, getResources().getDisplayMetrics().widthPixels), iO2));
            addView(this.o0);
            FrameLayout frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.oo.getAdMediaView(frameLayout);
            this.nm = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.nm.getParent()).removeView(this.nm);
                }
                frameLayout.addView(this.nm, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
            this.m = closeImageView;
            if (closeImageView != null) {
                if (this.o00) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            z2 = true;
            b3 = -1;
        } else {
            f = 250.0f;
            this.o0 = new FrameLayout(this.oo0);
            String str3 = this.o0m;
            str3.getClass();
            switch (str3) {
                case "300x250":
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case "320x90":
                    com.thinkup.core.common.mn.on.o0 o0Var = this.oo;
                    if (o0Var.getAdMediaView(this) != null || !TextUtils.isEmpty(o0Var.getMainImageUrl())) {
                        str = "myoffer_banner_native_ad_layout_320x90";
                        break;
                    } else {
                        str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                        break;
                    }
                    break;
                case "728x90":
                    str = "myoffer_banner_native_ad_layout_728x90";
                    break;
                default:
                    str = "myoffer_banner_native_ad_layout_320x50";
                    break;
            }
            this.o0.addView((ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.o0);
            this.om = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_main_resouce_container", "id"));
            this.on = (FrameLayout) a.c(this, "myoffer_banner_icon_container", "id");
            this.m0 = (LinearLayout) a.c(this, "ll_title_desc", "id");
            this.n0 = (RoundImageView) a.c(this, "myoffer_banner_icon", "id");
            this.mo = (TextView) a.c(this, "myoffer_banner_ad_title", "id");
            this.mm = (TextView) a.c(this, "myoffer_banner_desc", "id");
            this.mn = (ScanningAnimButton) a.c(this, "myoffer_banner_ad_install_btn", "id");
            this.o0o = (TextView) a.c(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
            this.m = closeImageView2;
            o(this.o0o, this.oo.getAdFrom());
            if (closeImageView2 != null) {
                if (this.o00) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.oo.getAdIconView();
            this.no = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.no.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.no.getParent()).removeView(this.no);
                }
                this.on.removeAllViews();
                this.on.addView(this.no, new FrameLayout.LayoutParams(-1, -1));
            } else if (TextUtils.isEmpty(this.m00.no()) || this.n0 == null) {
                FrameLayout frameLayout2 = this.on;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            } else {
                this.on.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.on.getLayoutParams();
                this.n0.setRadiusInDip(6);
                this.n0.setNeedRadiu(true);
                com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, this.m00.no()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            }
            o(this.mo, this.m00.mn());
            String strO00 = this.m00.o00();
            o(this.mn, strO00);
            if (TextUtils.isEmpty(strO00)) {
                ScanningAnimButton scanningAnimButton = this.mn;
                if (scanningAnimButton != null) {
                    scanningAnimButton.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton2 = this.mn;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(0);
                }
            }
            o(this.mm, this.m00.n0());
            if (this.om != null) {
                b2 = -1;
                b2 = -1;
                b2 = -1;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.nm = this.oo.getAdMediaView(this.om);
                String mainImageUrl = this.oo.getMainImageUrl();
                if (this.nm != null) {
                    this.om.setVisibility(0);
                    if (this.nm.getParent() != null) {
                        ((ViewGroup) this.nm.getParent()).removeView(this.nm);
                    }
                    this.om.addView(this.nm, layoutParams4);
                    z2 = true;
                } else if (TextUtils.isEmpty(mainImageUrl)) {
                    z2 = true;
                    this.om.setVisibility(8);
                } else {
                    this.om.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.om.addView(roundImageView, layoutParams4);
                    z2 = true;
                    com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                }
            } else {
                z2 = true;
                b2 = -1;
            }
            View adLogoView = this.oo.getAdLogoView();
            com.thinkup.core.common.inner.ui.oo.o oVar = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
            this.f41834n = oVar;
            oVar.o(adLogoView);
            this.f41834n.m((View) this);
            b3 = b2;
        }
        m();
        com.thinkup.core.common.mn.on.o0 o0Var2 = this.oo;
        if (this.o0 != null) {
            Context context = getContext();
            String str4 = this.o0m;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    r7 = !str4.equals("300x250") ? b3 : 0;
                    break;
                case 1507809730:
                    r7 = !str4.equals("320x50") ? b3 : z2;
                    break;
                case 1507809854:
                    r7 = !str4.equals("320x90") ? b3 : 2;
                    break;
                case 1622564786:
                    r7 = !str4.equals("728x90") ? b3 : 3;
                    break;
                default:
                    r7 = b3;
                    break;
            }
            switch (r7) {
                case 0:
                    break;
                case 1:
                case 2:
                default:
                    f2 = 320.0f;
                    break;
                case 3:
                    f2 = 728.0f;
                    break;
            }
            int iO3 = o00.o(context, f2);
            String str5 = this.o0m;
            str5.getClass();
            ?? r13 = b3;
            switch (str5.hashCode()) {
                case -559799608:
                    r13 = b3;
                    if (str5.equals("300x250")) {
                        r13 = 0;
                    }
                    break;
                case 1507809730:
                    r13 = b3;
                    if (str5.equals("320x50")) {
                        r13 = z2;
                    }
                    break;
                case 1507809854:
                    r13 = b3;
                    if (str5.equals("320x90")) {
                        r13 = 2;
                    }
                    break;
                case 1622564786:
                    r13 = b3;
                    if (str5.equals("728x90")) {
                        r13 = 3;
                    }
                    break;
            }
            switch (r13) {
                case 0:
                    break;
                case 1:
                default:
                    f = 50.0f;
                    break;
                case 2:
                case 3:
                    f = 90.0f;
                    break;
            }
            int iO4 = o00.o(context, f);
            int i2 = getResources().getDisplayMetrics().widthPixels;
            if (iO3 > i2) {
                iO3 = i2;
            }
            ViewGroup customAdContainer = o0Var2 != null ? o0Var2.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams5 = customAdContainer.getLayoutParams();
                if (layoutParams5 == null) {
                    layoutParams5 = new ViewGroup.LayoutParams(iO3, iO4);
                } else {
                    layoutParams5.width = iO3;
                    layoutParams5.height = iO4;
                }
                customAdContainer.setLayoutParams(layoutParams5);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iO3, iO4);
                    layoutParams6.gravity = 17;
                    layoutParams = layoutParams6;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iO3, iO4);
                }
                this.o0.setLayoutParams(layoutParams);
                moo.o((View) customAdContainer);
                customAdContainer.addView(this.o0);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            o(this.o0);
        }
    }

    @Override // com.thinkup.core.common.mn.oo.o.o0
    public void destroyNativeAd() {
        com.thinkup.core.common.mn.on.o0 o0Var = this.oo;
        if (o0Var != null) {
            o0Var.clear(this.o0);
            this.oo.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.thinkup.core.common.inner.mixad.om.m mVar = this.o0n;
        if (mVar != null) {
            mVar.o(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getClickedArea() {
        com.thinkup.core.common.inner.mixad.om.m mVar = this.o0n;
        return mVar != null ? mVar.o() : com.thinkup.core.common.inner.mixad.om.m.o;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void m(View view) {
        if (view != null) {
            this.m0n.add(view);
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[320x50]] */
    private int m(Context context) {
        String str = this.o0m;
        str.getClass();
        float f = 50.0f;
        switch (str) {
            case "300x250":
                f = 250.0f;
                break;
            case "320x90":
            case "728x90":
                f = 90.0f;
                break;
        }
        return o00.o(context, f);
    }

    private static void o(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ThirdPartyBannerTUView(Context context, BaseAd baseAd, oom oomVar, ooo<?> oooVar, com.thinkup.core.common.inner.oo.o oVar) {
        float f;
        String str;
        byte b2;
        byte b3;
        byte b4;
        float f2;
        ViewGroup.LayoutParams layoutParams;
        super(context, oomVar, oooVar, oVar);
        this.o00 = false;
        this.o0m = "";
        if (baseAd instanceof com.thinkup.core.common.mn.on.o0) {
            this.oo = (com.thinkup.core.common.mn.on.o0) baseAd;
        }
        com.thinkup.core.common.mn.on.o0 o0Var = this.oo;
        if (o0Var == null || oooVar == null || oomVar == null) {
            return;
        }
        this.oo0 = context;
        this.o00 = o0Var.o0o();
        this.nn = new ArrayList();
        if (!this.oo.isNativeExpress()) {
            for (int i2 : this.oo.mo()) {
                this.nn.add(Integer.valueOf(i2));
            }
        }
        this.o0m = this.oo.nn();
        float f3 = 300.0f;
        if (this.oo.isNativeExpress()) {
            this.o0 = (ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int iO = o00.o(getContext(), 320.0f);
            int iO2 = o00.o(getContext(), 50.0f);
            String str2 = this.o0m;
            str2.getClass();
            switch (str2) {
                case "300x250":
                    iO = o00.o(getContext(), 300.0f);
                    f = 250.0f;
                    iO2 = o00.o(getContext(), 250.0f);
                    break;
                case "320x50":
                    iO = o00.o(getContext(), 320.0f);
                    iO2 = o00.o(getContext(), 50.0f);
                    f = 250.0f;
                    break;
                case "320x90":
                    iO = o00.o(getContext(), 320.0f);
                    iO2 = o00.o(getContext(), 90.0f);
                    f = 250.0f;
                    break;
                case "728x90":
                    iO = o00.o(getContext(), 720.0f);
                    iO2 = o00.o(getContext(), 90.0f);
                    f = 250.0f;
                    break;
                default:
                    f = 250.0f;
                    break;
            }
            this.o0.setLayoutParams(new ViewGroup.LayoutParams(Math.min(iO, getResources().getDisplayMetrics().widthPixels), iO2));
            addView(this.o0);
            FrameLayout frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.oo.getAdMediaView(frameLayout);
            this.nm = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.nm.getParent()).removeView(this.nm);
                }
                frameLayout.addView(this.nm, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
            this.m = closeImageView;
            if (closeImageView != null) {
                if (this.o00) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            b2 = -1;
        } else {
            f = 250.0f;
            this.o0 = new FrameLayout(this.oo0);
            String str3 = this.o0m;
            str3.getClass();
            switch (str3) {
                case "300x250":
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case "320x90":
                    com.thinkup.core.common.mn.on.o0 o0Var2 = this.oo;
                    if (o0Var2.getAdMediaView(this) == null && TextUtils.isEmpty(o0Var2.getMainImageUrl())) {
                        str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                        break;
                    } else {
                        str = "myoffer_banner_native_ad_layout_320x90";
                        break;
                    }
                    break;
                case "728x90":
                    str = "myoffer_banner_native_ad_layout_728x90";
                    break;
                default:
                    str = "myoffer_banner_native_ad_layout_320x50";
                    break;
            }
            this.o0.addView((ViewGroup) LayoutInflater.from(this.oo0).inflate(o00.o(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.o0);
            this.om = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_main_resouce_container", "id"));
            this.on = (FrameLayout) a.c(this, "myoffer_banner_icon_container", "id");
            this.m0 = (LinearLayout) a.c(this, "ll_title_desc", "id");
            this.n0 = (RoundImageView) a.c(this, "myoffer_banner_icon", "id");
            this.mo = (TextView) a.c(this, "myoffer_banner_ad_title", "id");
            this.mm = (TextView) a.c(this, "myoffer_banner_desc", "id");
            this.mn = (ScanningAnimButton) a.c(this, "myoffer_banner_ad_install_btn", "id");
            this.o0o = (TextView) a.c(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) a.c(this, "myoffer_banner_close", "id");
            this.m = closeImageView2;
            o(this.o0o, this.oo.getAdFrom());
            if (closeImageView2 != null) {
                if (this.o00) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.oo.getAdIconView();
            this.no = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.no.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.no.getParent()).removeView(this.no);
                }
                this.on.removeAllViews();
                this.on.addView(this.no, new FrameLayout.LayoutParams(-1, -1));
            } else if (!TextUtils.isEmpty(this.m00.no()) && this.n0 != null) {
                this.on.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.on.getLayoutParams();
                this.n0.setRadiusInDip(6);
                this.n0.setNeedRadiu(true);
                com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, this.m00.no()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            } else {
                FrameLayout frameLayout2 = this.on;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            o(this.mo, this.m00.mn());
            String strO00 = this.m00.o00();
            o(this.mn, strO00);
            if (TextUtils.isEmpty(strO00)) {
                ScanningAnimButton scanningAnimButton = this.mn;
                if (scanningAnimButton != null) {
                    scanningAnimButton.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton2 = this.mn;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(0);
                }
            }
            o(this.mm, this.m00.n0());
            if (this.om != null) {
                b2 = -1;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.nm = this.oo.getAdMediaView(this.om);
                String mainImageUrl = this.oo.getMainImageUrl();
                if (this.nm != null) {
                    this.om.setVisibility(0);
                    if (this.nm.getParent() != null) {
                        ((ViewGroup) this.nm.getParent()).removeView(this.nm);
                    }
                    this.om.addView(this.nm, layoutParams4);
                } else if (!TextUtils.isEmpty(mainImageUrl)) {
                    this.om.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.om.addView(roundImageView, layoutParams4);
                    com.thinkup.core.common.res.m.o(getContext()).o(new oo(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                } else {
                    this.om.setVisibility(8);
                }
            } else {
                b2 = -1;
            }
            View adLogoView = this.oo.getAdLogoView();
            com.thinkup.core.common.inner.ui.oo.o oVar2 = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
            this.f41834n = oVar2;
            oVar2.o(adLogoView);
            this.f41834n.m(this);
        }
        m();
        com.thinkup.core.common.mn.on.o0 o0Var3 = this.oo;
        if (this.o0 != null) {
            Context context2 = getContext();
            String str4 = this.o0m;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    b3 = str4.equals("300x250") ? (byte) 0 : b2;
                    break;
                case 1507809730:
                    b3 = str4.equals("320x50") ? (byte) 1 : b2;
                    break;
                case 1507809854:
                    b3 = str4.equals("320x90") ? (byte) 2 : b2;
                    break;
                case 1622564786:
                    b3 = str4.equals("728x90") ? (byte) 3 : b2;
                    break;
                default:
                    b3 = b2;
                    break;
            }
            switch (b3) {
                case 0:
                    break;
                case 1:
                case 2:
                default:
                    f3 = 320.0f;
                    break;
                case 3:
                    f3 = 728.0f;
                    break;
            }
            int iO3 = o00.o(context2, f3);
            String str5 = this.o0m;
            str5.getClass();
            switch (str5.hashCode()) {
                case -559799608:
                    b4 = str5.equals("300x250") ? (byte) 0 : b2;
                    break;
                case 1507809730:
                    b4 = str5.equals("320x50") ? (byte) 1 : b2;
                    break;
                case 1507809854:
                    b4 = str5.equals("320x90") ? (byte) 2 : b2;
                    break;
                case 1622564786:
                    b4 = str5.equals("728x90") ? (byte) 3 : b2;
                    break;
                default:
                    b4 = b2;
                    break;
            }
            switch (b4) {
                case 0:
                    f2 = f;
                    break;
                case 1:
                default:
                    f2 = 50.0f;
                    break;
                case 2:
                case 3:
                    f2 = 90.0f;
                    break;
            }
            int iO4 = o00.o(context2, f2);
            int i3 = getResources().getDisplayMetrics().widthPixels;
            iO3 = iO3 > i3 ? i3 : iO3;
            ViewGroup customAdContainer = o0Var3 != null ? o0Var3.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams5 = customAdContainer.getLayoutParams();
                if (layoutParams5 == null) {
                    layoutParams5 = new ViewGroup.LayoutParams(iO3, iO4);
                } else {
                    layoutParams5.width = iO3;
                    layoutParams5.height = iO4;
                }
                customAdContainer.setLayoutParams(layoutParams5);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iO3, iO4);
                    layoutParams6.gravity = 17;
                    layoutParams = layoutParams6;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(iO3, iO4);
                }
                this.o0.setLayoutParams(layoutParams);
                moo.o((View) customAdContainer);
                customAdContainer.addView(this.o0);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            o(this.o0);
        }
        if (this.oo.isNativeExpress()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.on != null) {
            arrayList.add(this.om);
        }
        FrameLayout frameLayout3 = this.on;
        if (frameLayout3 != null) {
            arrayList.add(frameLayout3);
        }
        this.o0n = new com.thinkup.core.common.inner.mixad.om.m.o().o(arrayList).o(this.mo).m(this.mm).n(this.mn).o();
    }

    private void o(View view) {
        RoundImageView roundImageView;
        int i2 = this.onn.mm;
        FrameLayout.LayoutParams layoutParamsO = com.thinkup.core.common.inner.mixad.om.o.o(i2, o(32.0f), o(8.0f));
        com.thinkup.core.basead.m.o0 o0Var = new com.thinkup.core.basead.m.o0();
        int[] iArrMo = this.oo.mo();
        if (iArrMo == null) {
            m((View) this);
        } else {
            for (int i3 : iArrMo) {
                if (i3 == 1) {
                    View view2 = this.no;
                    if (view2 != null) {
                        m(view2);
                        o0Var.m(this.no);
                    } else if (!TextUtils.isEmpty(this.oo.getIconImageUrl()) && (roundImageView = this.n0) != null) {
                        m(roundImageView);
                        o0Var.m(this.n0);
                    }
                    m(this.nm);
                    View view3 = this.nm;
                    if (view3 != null) {
                        o0Var.n(view3);
                    }
                } else if (i3 == 2) {
                    m(this.mo);
                    o0Var.o(this.mo);
                } else if (i3 == 3) {
                    m(this.mm);
                    o0Var.o0(this.mm);
                } else if (i3 == 4) {
                    m(this.mn);
                    o0Var.oo(this.mn);
                } else if (i3 == 5) {
                    m((View) this);
                }
            }
        }
        CloseImageView closeImageView = this.m;
        if (closeImageView != null) {
            o0Var.mo(closeImageView);
        }
        if (this.f41834n != null && i2 == 34) {
            o0Var.om(this.o0o);
            this.f41834n.o(this.oo, o0Var, false);
        }
        com.thinkup.core.common.mn.on.o0 o0Var2 = this.oo;
        if (o0Var2 != null) {
            o0Var2.registerListener(view, this.m0n, layoutParamsO, o0Var);
        }
    }

    private int o(float f) {
        return o00.o(getContext(), f);
    }

    private static boolean o(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        float x = view.getX();
        float y = view.getY();
        return f >= x && f <= ((float) view.getWidth()) + x && f2 >= y && f2 <= ((float) view.getHeight()) + y;
    }

    /* JADX WARN: switch over string: strings are not added: [[320x50], [320x90]] */
    /* JADX WARN: switch over string: strings are not added: [[320x50]] */
    private void o(BaseAd baseAd) {
        ViewGroup.LayoutParams layoutParams;
        if (this.o0 == null) {
            return;
        }
        Context context = getContext();
        String str = this.o0m;
        str.getClass();
        float f = 320.0f;
        switch (str) {
            case "300x250":
                f = 300.0f;
                break;
            case "728x90":
                f = 728.0f;
                break;
        }
        int iO = o00.o(context, f);
        String str2 = this.o0m;
        str2.getClass();
        float f2 = 50.0f;
        switch (str2) {
            case "300x250":
                f2 = 250.0f;
                break;
            case "320x90":
            case "728x90":
                f2 = 90.0f;
                break;
        }
        int iO2 = o00.o(context, f2);
        int i2 = getResources().getDisplayMetrics().widthPixels;
        if (iO > i2) {
            iO = i2;
        }
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = customAdContainer.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(iO, iO2);
            } else {
                layoutParams2.width = iO;
                layoutParams2.height = iO2;
            }
            customAdContainer.setLayoutParams(layoutParams2);
            removeAllViews();
            if (customAdContainer instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iO, iO2);
                layoutParams3.gravity = 17;
                layoutParams = layoutParams3;
            } else {
                layoutParams = new ViewGroup.LayoutParams(iO, iO2);
            }
            this.o0.setLayoutParams(layoutParams);
            moo.o((View) customAdContainer);
            customAdContainer.addView(this.o0);
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            addView(customAdContainer);
        }
        o(this.o0);
    }

    /* JADX WARN: switch over string: strings are not added: [[320x50], [320x90]] */
    private int o(Context context) {
        String str = this.o0m;
        str.getClass();
        float f = 320.0f;
        switch (str) {
            case "300x250":
                f = 300.0f;
                break;
            case "728x90":
                f = 728.0f;
                break;
        }
        return o00.o(context, f);
    }
}
