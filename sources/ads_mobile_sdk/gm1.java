package ads_mobile_sdk;

import ads_mobile_sdk.gm1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesView;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.ironsource.Y3;
import complexometry.formularize;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.electropaint;
import saneness.grout;
import saneness.moresque;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 {
    public static final ImageView.ScaleType i = ImageView.ScaleType.CENTER_INSIDE;
    public final saran a;
    public final saran b;
    public final hj1 c;
    public final jk0 d;
    public final f51 e;
    public final gl1 f;
    public final formularize g;
    public final JsonObject h;

    public gm1(saran uiScope, saran backgroundScope, hj1 nativeAdAssets, jk0 flags, f51 internalMediaContent, gl1 nativeAdSettingsDataStore, formularize baseRequest, JsonObject nativeAdJson) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(internalMediaContent, "internalMediaContent");
        Intrinsics.checkNotNullParameter(nativeAdSettingsDataStore, "nativeAdSettingsDataStore");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        this.a = uiScope;
        this.b = backgroundScope;
        this.c = nativeAdAssets;
        this.d = flags;
        this.e = internalMediaContent;
        this.f = nativeAdSettingsDataStore;
        this.g = baseRequest;
        this.h = nativeAdJson;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public static final void a(gm1 gm1Var, technofreak technofreakVar) {
        JsonObject asJsonObject;
        AdChoicesView adChoicesView;
        View xx0Var;
        AdChoicesPlacement adChoicesPlacement;
        JsonObject jsonObject = gm1Var.h;
        Intrinsics.checkNotNullParameter(Y3.c, X3.i.W);
        if (jsonObject == null) {
            asJsonObject = null;
        } else {
            try {
                asJsonObject = jsonObject.getAsJsonObject(Y3.c);
            } catch (Exception unused) {
                asJsonObject = null;
            }
        }
        if (asJsonObject != null) {
            Intrinsics.checkNotNullParameter("allow_pub_rendering", X3.i.W);
            try {
                Intrinsics.checkNotNullParameter(asJsonObject, "<this>");
                Intrinsics.checkNotNullParameter("allow_pub_rendering", X3.i.W);
                if (asJsonObject.get("allow_pub_rendering").getAsBoolean()) {
                    View viewB = ((cm1) technofreakVar).b("3011");
                    if (viewB instanceof AdChoicesView) {
                        adChoicesView = (AdChoicesView) viewB;
                    } else {
                        adChoicesView = null;
                    }
                } else {
                    adChoicesView = null;
                }
            } catch (Exception unused2) {
            }
        } else {
            adChoicesView = null;
        }
        boolean z = adChoicesView != null;
        cm1 cm1Var = (cm1) technofreakVar;
        FrameLayout frameLayoutC = cm1Var.c();
        Context context = frameLayoutC != null ? frameLayoutC.getContext() : null;
        if (context == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        hj1 hj1Var = gm1Var.c;
        View view = hj1Var.t;
        if (view != null) {
            if (!z && (adChoicesPlacement = hj1Var.u) != null) {
                int i2 = electropaint.f37137attabal[adChoicesPlacement.ordinal()];
                if (i2 == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (i2 == 2) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (i2 == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                } else if (i2 == 4) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                }
                view.setLayoutParams(layoutParams);
            }
            xx0Var = view;
        } else {
            b41 b41Var = hj1Var.h;
            if (b41Var == null) {
                xx0Var = null;
            } else {
                if (!z) {
                    int i3 = electropaint.f37137attabal[b41Var.g.ordinal()];
                    if (i3 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (i3 == 2) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (i3 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    } else if (i3 == 4) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    }
                }
                xx0Var = new xx0(context, b41Var, layoutParams);
                jk0 jk0Var = gm1Var.d;
                grout.attabal(jk0Var, "gads:ad_choices_content_description", X3.i.W, "Ad Choices Icon", "defaultValue");
                xx0Var.setContentDescription((String) jk0Var.a("gads:ad_choices_content_description", "Ad Choices Icon", zk.o));
            }
        }
        if (xx0Var == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) xx0Var.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(xx0Var);
        }
        if (z) {
            if (adChoicesView != null) {
                adChoicesView.removeAllViews();
            }
            if (adChoicesView != null) {
                adChoicesView.addView(xx0Var);
            }
        } else {
            AdChoicesView adChoicesView2 = new AdChoicesView(context);
            adChoicesView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            adChoicesView2.addView(xx0Var);
            FrameLayout frameLayoutD = cm1Var.d();
            if (frameLayoutD != null) {
                frameLayoutD.addView(adChoicesView2);
            }
        }
        cm1Var.a(xx0Var, "3012");
    }

    public final void a(technofreak nativeAdViewContainer) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        final cm1 cm1Var = (cm1) nativeAdViewContainer;
        View viewB = cm1Var.b("3010");
        ViewGroup viewGroup = viewB instanceof ViewGroup ? (ViewGroup) viewB : null;
        cutely.wireman(this.b, null, null, new em1(this, viewGroup, null), 3, null);
        if (viewGroup == null) {
            return;
        }
        if (a(viewGroup)) {
            gq0 gq0Var = this.c.j;
            if (gq0Var == null) {
                return;
            }
            gq0Var.s = new moresque() { // from class: saneness.sanskrit
                @Override // saneness.moresque
                public final void attabal(MotionEvent motionEvent) {
                    gm1.a(cm1Var, motionEvent);
                }
            };
            return;
        }
        viewGroup.removeAllViews();
        FrameLayout frameLayoutC = cm1Var.c();
        if (frameLayoutC == null) {
            return;
        }
        Context context = frameLayoutC.getContext();
        Intrinsics.beachfront(context);
        Drawable drawableE = this.e.e();
        if (drawableE == null) {
            return;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawableE);
        ImageView.ScaleType scaleTypeE = cm1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = i;
        }
        imageView.setScaleType(scaleTypeE);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(imageView);
    }

    public static final void a(technofreak nativeAdViewContainer, MotionEvent event) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "$nativeAdViewContainer");
        Intrinsics.checkNotNullParameter(event, "event");
        ((cm1) nativeAdViewContainer).onTouch(null, event);
    }

    public final boolean a(ViewGroup mediaViewContainer) {
        gq0 gq0Var;
        ia3 ia3VarE;
        Intrinsics.checkNotNullParameter(mediaViewContainer, "mediaViewContainer");
        View view = this.c.k;
        if (view == null) {
            return false;
        }
        mediaViewContainer.removeAllViews();
        ViewParent parent = view.getParent();
        ha3 ha3Var = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        mediaViewContainer.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        jk0 jk0Var = this.d;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:native:disable_video_rect_for_fixed_size:enabled", X3.i.W);
        if (!((Boolean) jk0Var.a("gads:native:disable_video_rect_for_fixed_size:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = mediaViewContainer.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams2 = mediaViewContainer.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height == -2) {
            return true;
        }
        gq0 gq0Var2 = this.c.j;
        if (gq0Var2 != null && (ia3VarE = gq0Var2.e()) != null) {
            ha3Var = ia3VarE.a;
        }
        if (ha3Var != ha3.VIDEO_RECT || (gq0Var = this.c.j) == null) {
            return true;
        }
        gq0Var.a(new ia3(ha3.DEFAULT, 0, 0, 14));
        return true;
    }
}
