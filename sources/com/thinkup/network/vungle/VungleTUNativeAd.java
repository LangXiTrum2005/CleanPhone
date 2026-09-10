package com.thinkup.network.vungle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUNativeAd extends CustomNativeAd implements NativeAdListener {
    String m;
    ImageView m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AdConfig f42638n;
    Context o;
    LoadCallbackListener o0;
    FrameLayout om;
    MediaView on;
    NativeAd oo;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public VungleTUNativeAd(Context context, String str, AdConfig adConfig, LoadCallbackListener loadCallbackListener) {
        this.o = context.getApplicationContext();
        this.m = str;
        this.f42638n = adConfig;
        this.o0 = loadCallbackListener;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        NativeAd nativeAd = this.oo;
        if (nativeAd != null) {
            nativeAd.unregisterView();
        }
        this.oo = null;
        this.on = null;
        this.om = null;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdIconView() {
        if (this.m0 == null) {
            this.m0 = new ImageView(this.o);
        }
        return this.m0;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.on == null) {
            this.on = new MediaView(this.o);
        }
        return this.on;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.oo != null) {
            this.om = new FrameLayout(this.o);
        }
        return this.om;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        notifyAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        LoadCallbackListener loadCallbackListener = this.o0;
        if (loadCallbackListener != null) {
            loadCallbackListener.onFail(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            this.o0 = null;
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        notifyAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        if (baseAd == null || !baseAd.canPlayAd().booleanValue()) {
            LoadCallbackListener loadCallbackListener = this.o0;
            if (loadCallbackListener != null) {
                loadCallbackListener.onFail("", "Vungle onNativeAdLoaded but can't PlayAd");
                this.o0 = null;
                return;
            }
            return;
        }
        setTitle(this.oo.getAdTitle());
        setDescriptionText(this.oo.getAdBodyText());
        setCallToActionText(this.oo.getAdCallToActionText());
        setStarRating(Double.valueOf(this.oo.getAdStarRating() == null ? 5.0d : this.oo.getAdStarRating().doubleValue()));
        setAdFrom(this.oo.getAdSponsoredText());
        LoadCallbackListener loadCallbackListener2 = this.o0;
        if (loadCallbackListener2 != null) {
            loadCallbackListener2.onSuccess(this);
            this.o0 = null;
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
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
    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) throws Throwable {
        Collection<? extends View> collection;
        FrameLayout frameLayout;
        MediaView mediaView;
        List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
        if (clickViewList == null || clickViewList.size() == 0) {
            collection = clickViewList;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            collection = arrayList;
        }
        collection = clickViewList;
        NativeAd nativeAd = this.oo;
        if (nativeAd == null || (frameLayout = this.om) == null || (mediaView = this.on) == null) {
            return;
        }
        nativeAd.registerViewForInteraction(frameLayout, mediaView, this.m0, collection);
    }

    public void startLoadAd(Context context, Map<String, Object> map, Map<String, Object> map2, String str) throws Throwable {
        NativeAd nativeAd = new NativeAd(context, this.m);
        this.oo = nativeAd;
        nativeAd.setAdListener(this);
        if (map2 != null) {
            try {
                if (map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int i2 = Integer.parseInt(map2.get(TUAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (i2 == 0) {
                        this.oo.setAdOptionsPosition(0);
                    } else if (i2 == 1) {
                        this.oo.setAdOptionsPosition(1);
                    } else if (i2 == 2) {
                        this.oo.setAdOptionsPosition(3);
                    } else if (i2 == 3) {
                        this.oo.setAdOptionsPosition(2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (TUInitMediation.getIntFromMap(map, "render_type", 1) == 2) {
            this.oo.setAdOptionsPosition(3);
        }
        this.oo.load(str);
    }
}
