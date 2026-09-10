package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.basead.m.o0;
import com.thinkup.core.common.inner.ui.AsseblemSplashTUView;
import com.thinkup.core.common.inner.ui.CloseShadeView;
import com.thinkup.core.common.mn.oo.o.om;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartySplashTUView extends AsseblemSplashTUView implements om {
    BaseAd om0;
    private View omo;

    public ThirdPartySplashTUView(Context context) {
        super(context);
    }

    private boolean m0() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.mm == 59;
    }

    private boolean mm() {
        oon oonVar;
        oom oomVar = this.onn;
        return (oomVar == null || (oonVar = oomVar.oo0) == null || oonVar.o0o() == 0) ? false : true;
    }

    private boolean mn() {
        BaseAd baseAd = this.om0;
        return baseAd != null && baseAd.isNativeExpress();
    }

    private boolean mo() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.mm == 39;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void o(View view) {
        ArrayList arrayList;
        List<View> list;
        List<View> list2;
        FrameLayout.LayoutParams layoutParamsO = com.thinkup.core.common.inner.mixad.om.o.o(this.onn.mm, 0, 0);
        if (this.om0 != null) {
            o0 o0Var = new o0();
            com.thinkup.core.common.inner.ui.oo.o oVar = this.o0m;
            if (oVar != null) {
                oVar.o(this.om0, o0Var, true);
            }
            o0Var.o(((AsseblemSplashTUView) this).o);
            o0Var.oo(this.mo0);
            o0Var.o0(((AsseblemSplashTUView) this).m);
            o0Var.m(getIconView());
            if (this.onn.oo0.o0o() == 0) {
                this.m0n.add(this);
                list2 = this.m0n;
            } else if (this.onn.oo0.o0o() == 2) {
                arrayList = new ArrayList();
                View view2 = this.o0;
                if (view2 != null) {
                    list = arrayList;
                    arrayList.add(view2);
                    list = arrayList;
                }
            } else {
                oom oomVar = this.onn;
                if (oomVar != null && oomVar.mm == 59) {
                    n.o(this.om0.getAdIconView());
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.mo0);
                list = arrayList2;
            }
            if (list != null) {
                if (this.o0n >= this.ranDom) {
                    list = list2;
                    list.add(this.n0);
                } else {
                    CloseShadeView closeShadeView = this.n0;
                    if (closeShadeView != null) {
                        list = list2;
                        closeShadeView.setVisibility(8);
                    }
                }
            }
            list = list2;
            list = list2;
            this.om0.registerListener(view, list, layoutParamsO, o0Var);
        }
    }

    private void on() {
        BaseAd baseAd;
        BaseAd baseAd2;
        BaseAd baseAd3;
        FrameLayout frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.m0n.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd3 = this.om0) != null && baseAd3.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.om0.getAdMediaView(new Object[0]);
            this.omo = adMediaView;
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.omo.getParent()).removeView(this.omo);
            }
            frameLayout2.addView(this.omo, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && (baseAd2 = this.om0) != null && baseAd2.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = layoutParams.height;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (this.onn.oo0.n0() == 2) {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = o00.o(getContext(), 18.0f);
                } else {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = o00.o(getContext(), 12.0f);
                }
            }
            roundImageView.setLayoutParams(layoutParams);
            ((ViewGroup) roundImageView.getParent()).addView(this.om0.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (this.oo == null || (baseAd = this.om0) == null || baseAd.getAdLogoView() == null || this.oo.getParent() == null || !(this.oo.getParent() instanceof ViewGroup)) {
            return;
        }
        this.oo.setVisibility(4);
        ((ViewGroup) this.oo.getParent()).addView(this.om0.getAdLogoView(), this.oo.getLayoutParams());
    }

    public CloseShadeView getCloseShadeView() {
        CloseShadeView closeShadeView = this.n0;
        if (closeShadeView != null) {
            return closeShadeView;
        }
        return null;
    }

    public View getIconView() {
        BaseAd baseAd = this.om0;
        if (baseAd == null) {
            return null;
        }
        if (!TextUtils.isEmpty(baseAd.getIconImageUrl())) {
            return ((AsseblemSplashTUView) this).f41831n;
        }
        View adIconView = this.om0.getAdIconView();
        if (adIconView != null) {
            return adIconView;
        }
        return null;
    }

    @Override // com.thinkup.core.common.mn.oo.o.om
    public void handleFullScreenClick(View view) {
        oom oomVar;
        oon oonVar;
        if (view == null || (oomVar = this.onn) == null || oomVar.mm != 39 || oomVar == null || (oonVar = oomVar.oo0) == null || oonVar.o0o() == 0) {
            return;
        }
        n.o(view);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseSdkSplashTUView
    public final void o0() {
        super.o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0n.m().o(new Runnable() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySplashTUView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseAd baseAd = ThirdPartySplashTUView.this.om0;
                if (baseAd != null) {
                    baseAd.destroy();
                    ThirdPartySplashTUView.this.om0 = null;
                }
            }
        }, 1000L);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseSplashTUView
    public final void oo() {
        om();
        if (this.nn) {
            return;
        }
        this.nn = true;
        com.thinkup.core.common.inner.oo.o oVar = this.o00;
        if (oVar != null) {
            oVar.m();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.thinkup.core.common.mn.oo.o.om
    public void registerNativeAdContainer(View view) {
        ArrayList arrayList;
        List<View> list;
        List<View> list2;
        FrameLayout.LayoutParams layoutParamsO = com.thinkup.core.common.inner.mixad.om.o.o(this.onn.mm, 0, 0);
        if (this.om0 != null) {
            o0 o0Var = new o0();
            com.thinkup.core.common.inner.ui.oo.o oVar = this.o0m;
            if (oVar != null) {
                oVar.o(this.om0, o0Var, true);
            }
            o0Var.o(((AsseblemSplashTUView) this).o);
            o0Var.oo(this.mo0);
            o0Var.o0(((AsseblemSplashTUView) this).m);
            o0Var.m(getIconView());
            if (this.onn.oo0.o0o() == 0) {
                this.m0n.add(this);
                list2 = this.m0n;
            } else if (this.onn.oo0.o0o() == 2) {
                arrayList = new ArrayList();
                View view2 = this.o0;
                if (view2 != null) {
                    list = arrayList;
                    arrayList.add(view2);
                    list = arrayList;
                }
            } else {
                oom oomVar = this.onn;
                if (oomVar != null && oomVar.mm == 59) {
                    n.o(this.om0.getAdIconView());
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.mo0);
                list = arrayList2;
            }
            if (list != null) {
                if (this.o0n >= this.ranDom) {
                    list = list2;
                    list.add(this.n0);
                } else {
                    CloseShadeView closeShadeView = this.n0;
                    if (closeShadeView != null) {
                        list = list2;
                        closeShadeView.setVisibility(8);
                    }
                }
            }
            list = list2;
            list = list2;
            this.om0.registerListener(view, list, layoutParamsO, o0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartySplashTUView(Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.inner.oo.o oVar, String str, BaseAd baseAd, com.thinkup.core.common.mn.o oVar2) {
        BaseAd baseAd2;
        BaseAd baseAd3;
        BaseAd baseAd4;
        super(context, oomVar, oooVar, oVar);
        this.om0 = baseAd;
        FrameLayout frameLayout = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.m0n.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd4 = this.om0) != null && baseAd4.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.om0.getAdMediaView(new Object[0]);
            this.omo = adMediaView;
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.omo.getParent()).removeView(this.omo);
            }
            frameLayout2.addView(this.omo, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && (baseAd3 = this.om0) != null && baseAd3.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = layoutParams.height;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (this.onn.oo0.n0() == 2) {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = o00.o(getContext(), 18.0f);
                } else {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = o00.o(getContext(), 12.0f);
                }
            }
            roundImageView.setLayoutParams(layoutParams);
            ((ViewGroup) roundImageView.getParent()).addView(this.om0.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (this.oo != null && (baseAd2 = this.om0) != null && baseAd2.getAdLogoView() != null && this.oo.getParent() != null && (this.oo.getParent() instanceof ViewGroup)) {
            this.oo.setVisibility(4);
            ((ViewGroup) this.oo.getParent()).addView(this.om0.getAdLogoView(), this.oo.getLayoutParams());
        }
        if (oVar2 instanceof View) {
            addView((View) oVar2, a.f(-2, -2, 13));
        }
        BaseAd baseAd5 = this.om0;
        if (baseAd5 == null || !baseAd5.isNativeExpress()) {
            return;
        }
        this.o0n = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(com.thinkup.core.common.mn.o oVar) {
        if (oVar instanceof View) {
            addView((View) oVar, a.f(-2, -2, 13));
        }
    }
}
