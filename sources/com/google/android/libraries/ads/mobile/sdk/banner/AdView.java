package com.google.android.libraries.ads.mobile.sdk.banner;

import ads_mobile_sdk.ci;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.f80;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.nj;
import ads_mobile_sdk.o7;
import ads_mobile_sdk.p7;
import ads_mobile_sdk.q7;
import ads_mobile_sdk.ra2;
import ads_mobile_sdk.rj;
import ads_mobile_sdk.yf2;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.base.triweekly;
import kotlinx.coroutines.channels.wireman;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import liquory.attabal;
import liquory.marial;
import liquory.saneness;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.philabeg;
import saneness.terni;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/banner/AdView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lliquory/attabal;", "newSize", "", "resize", "(Lliquory/attabal;)V", "Lliquory/marial;", "adRequest", "Lcomplexometry/wireman;", "Lliquory/saneness;", "adLoadCallback", "loadAd", "(Lliquory/marial;Lcomplexometry/wireman;)V", "", "adResponse", "loadFromAdResponse", "(Ljava/lang/String;Lcomplexometry/wireman;)V", "Lcomplexometry/marial;", "(Ljava/lang/String;Lwretchedly/dern;)Ljava/lang/Object;", "bannerAd", "Landroid/app/Activity;", "activity", "registerBannerAd", "(Lliquory/saneness;Landroid/app/Activity;)V", "getBannerAd", "()Lliquory/saneness;", "unregisterBannerAd", "destroy", "()V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class AdView extends FrameLayout {
    private saneness a;
    private attabal b;
    private wireman c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void a(AdView adView, saneness sanenessVar) {
        Context context = adView.getContext();
        adView.a(sanenessVar, context instanceof Activity ? (Activity) context : null);
    }

    private final void b() {
        attabal attabalVar = this.b;
        if (this.a == null && attabalVar != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int height = attabalVar.getHeight();
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(context, "<this>");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
            setMinimumHeight((int) TypedValue.applyDimension(1, height, displayMetrics));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int width = attabalVar.getWidth();
            Intrinsics.checkNotNullParameter(context2, "<this>");
            Intrinsics.checkNotNullParameter(context2, "<this>");
            DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
            setMinimumWidth((int) TypedValue.applyDimension(1, width, displayMetrics2));
        } else {
            setMinimumHeight(0);
            setMinimumWidth(0);
        }
        requestLayout();
    }

    public final void destroy() {
        saneness sanenessVar = this.a;
        unregisterBannerAd();
        if (sanenessVar != null) {
            sanenessVar.destroy();
        }
    }

    /* JADX INFO: renamed from: getBannerAd, reason: from getter */
    public final saneness getA() {
        return this.a;
    }

    public final void loadAd(marial adRequest, complexometry.wireman<saneness> adLoadCallback) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        a();
        this.c = philabeg.saneness(adRequest, new o7(adLoadCallback, this), true);
    }

    public final void loadFromAdResponse(String adResponse, complexometry.wireman<saneness> adLoadCallback) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        a();
        this.c = philabeg.attabal(adResponse, new o7(adLoadCallback, this));
    }

    public final void registerBannerAd(saneness bannerAd, Activity activity) {
        Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.wireman(this.a, bannerAd)) {
            return;
        }
        a();
        a(bannerAd, activity);
    }

    public final void resize(attabal newSize) {
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        this.b = newSize;
        b();
        saneness sanenessVar = this.a;
        if (sanenessVar != null) {
            sanenessVar.a(newSize);
        }
    }

    public final saneness unregisterBannerAd() {
        saneness sanenessVar = this.a;
        this.a = null;
        removeAllViews();
        a();
        b();
        return sanenessVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a(saneness sanenessVar, Activity activity) {
        removeAllViews();
        this.a = sanenessVar;
        this.b = sanenessVar.getAdSize();
        b();
        View view = activity == null ? sanenessVar.getView() : sanenessVar.getView(activity);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            String adapterClassName = sanenessVar.getResponseInfo().getAdapterClassName();
            triweekly triweeklyVar = kn0.a;
            kn0.c("Banner view provided from " + adapterClassName + " already has a parent view. Removing its old parent.", null);
            ((ViewGroup) parent).removeView(view);
        }
        addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadFromAdResponse(String str, dern<? super complexometry.marial<? extends saneness>> dernVar) {
        q7 q7Var;
        AdView adView;
        if (dernVar instanceof q7) {
            q7Var = (q7) dernVar;
            int i = q7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7Var.d = i - Integer.MIN_VALUE;
            } else {
                q7Var = new q7(this, dernVar);
            }
        } else {
            q7Var = new q7(this, dernVar);
        }
        Object objB = q7Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = q7Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB);
            a();
            q7Var.a = this;
            q7Var.d = 1;
            rj rjVar = rj.a;
            terni.f37333attabal.getClass();
            i60 i60Var = ((i60) ((terni) en0.c.getValue())).c;
            str.getClass();
            objB = rjVar.b((ra2) new f80(i60Var, yf2.f, str, Boolean.FALSE).i.get(), new nj(new ci(null), null), q7Var);
            if (objB != objBeachfront) {
                adView = this;
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            complexometry.marial marialVar = (complexometry.marial) q7Var.a;
            p002kotlin.dern.saneness(objB);
            return marialVar;
        }
        adView = (AdView) q7Var.a;
        p002kotlin.dern.saneness(objB);
        complexometry.marial marialVar2 = (complexometry.marial) objB;
        if (marialVar2 instanceof complexometry.marial.saneness) {
            terni.f37333attabal.getClass();
            CoroutineContext coroutineContext = (CoroutineContext) ((i60) ((terni) en0.c.getValue())).u.get();
            b bVar = new b(adView, marialVar2, null);
            q7Var.a = marialVar2;
            q7Var.d = 2;
            if (impromptu.competently(coroutineContext, bVar, q7Var) == objBeachfront) {
                return objBeachfront;
            }
        }
        return marialVar2;
    }

    private final void a() {
        wireman wiremanVar = this.c;
        if (wiremanVar != null) {
            terni.f37333attabal.getClass();
            cutely.wireman((saran) ((i60) ((terni) en0.c.getValue())).t.get(), null, null, new p7(wiremanVar, null), 3, null);
        }
    }
}
