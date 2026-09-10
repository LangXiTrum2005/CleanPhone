package com.thinkup.network.inmobi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InmobiTUNativeAd extends CustomNativeAd {
    o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Context f42589n;
    InMobiNative o;
    RelativeLayout o0;
    private final String om = "InmobiTUNativeAd";
    boolean oo;

    public interface o {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd, AdMetaInfo adMetaInfo);
    }

    public InmobiTUNativeAd(Context context, o oVar, String str, Map<String, Object> map) {
        this.f42589n = context.getApplicationContext();
        this.o = new InMobiNative(context, Long.parseLong(str), new NativeAdEventListener() { // from class: com.thinkup.network.inmobi.InmobiTUNativeAd.1
            @Override // com.inmobi.ads.listeners.NativeAdEventListener
            public final void onAdClicked(InMobiNative inMobiNative) {
            }

            @Override // com.inmobi.ads.listeners.AdEventListener
            public final void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
                o oVar2 = InmobiTUNativeAd.this.m;
                if (oVar2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(inMobiAdRequestStatus.getStatusCode());
                    oVar2.onFail(sb.toString(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
                }
                InmobiTUNativeAd.this.m = null;
            }

            @Override // com.inmobi.ads.listeners.AdEventListener
            public final void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo) {
                InmobiTUNativeAd inmobiTUNativeAd = InmobiTUNativeAd.this;
                inmobiTUNativeAd.o = inMobiNative;
                inmobiTUNativeAd.setTitle(inMobiNative.getAdTitle());
                InmobiTUNativeAd inmobiTUNativeAd2 = InmobiTUNativeAd.this;
                inmobiTUNativeAd2.setDescriptionText(inmobiTUNativeAd2.o.getAdDescription());
                InmobiTUNativeAd inmobiTUNativeAd3 = InmobiTUNativeAd.this;
                inmobiTUNativeAd3.setIconImageUrl(inmobiTUNativeAd3.o.getAdIconUrl());
                InmobiTUNativeAd inmobiTUNativeAd4 = InmobiTUNativeAd.this;
                inmobiTUNativeAd4.setCallToActionText(inmobiTUNativeAd4.o.getAdCtaText());
                InmobiTUNativeAd inmobiTUNativeAd5 = InmobiTUNativeAd.this;
                inmobiTUNativeAd5.setStarRating(Double.valueOf(inmobiTUNativeAd5.o.getAdRating()));
                try {
                    if (InmobiTUNativeAd.this.o.isVideo().booleanValue()) {
                        ((com.thinkup.nativead.unitgroup.o) InmobiTUNativeAd.this).mAdSourceType = "1";
                    } else {
                        ((com.thinkup.nativead.unitgroup.o) InmobiTUNativeAd.this).mAdSourceType = "2";
                    }
                } catch (Throwable unused) {
                }
                InmobiTUNativeAd.this.o.setListener(new NativeAdEventListener() { // from class: com.thinkup.network.inmobi.InmobiTUNativeAd.1.1
                    @Override // com.inmobi.ads.listeners.NativeAdEventListener
                    public final void onAdClicked(InMobiNative inMobiNative2) {
                        InmobiTUNativeAd.this.notifyAdClicked();
                    }

                    @Override // com.inmobi.ads.listeners.AdEventListener
                    public final void onAdImpression(InMobiNative inMobiNative2) {
                        super.onAdImpression(inMobiNative2);
                        InmobiTUNativeAd.this.notifyAdImpression();
                    }
                });
                InmobiTUNativeAd inmobiTUNativeAd6 = InmobiTUNativeAd.this;
                o oVar2 = inmobiTUNativeAd6.m;
                if (oVar2 != null) {
                    oVar2.onSuccess(inmobiTUNativeAd6, adMetaInfo);
                }
                InmobiTUNativeAd.this.m = null;
            }
        });
        this.m = oVar;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        if (view != null) {
            if (!(view instanceof ViewGroup) || view == this.o0) {
                view.setOnClickListener(null);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(viewGroup.getChildAt(i2), (View.OnClickListener) null);
            }
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        this.o0 = null;
        this.f42589n = null;
        InMobiNative inMobiNative = this.o;
        if (inMobiNative != null) {
            inMobiNative.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.o0 == null) {
                ClickInterceptorRelativeLayout clickInterceptorRelativeLayout = new ClickInterceptorRelativeLayout(this.f42589n);
                this.o0 = clickInterceptorRelativeLayout;
                clickInterceptorRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.o0.setGravity(17);
                this.o0.post(new Runnable() { // from class: com.thinkup.network.inmobi.InmobiTUNativeAd.4
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        RelativeLayout relativeLayout;
                        try {
                            InmobiTUNativeAd inmobiTUNativeAd = InmobiTUNativeAd.this;
                            InMobiNative inMobiNative = inmobiTUNativeAd.o;
                            if (inMobiNative == null) {
                                return;
                            }
                            Context context = inmobiTUNativeAd.o0.getContext();
                            RelativeLayout relativeLayout2 = InmobiTUNativeAd.this.o0;
                            View primaryViewOfWidth = inMobiNative.getPrimaryViewOfWidth(context, relativeLayout2, relativeLayout2, relativeLayout2.getWidth());
                            if (primaryViewOfWidth == null || (relativeLayout = InmobiTUNativeAd.this.o0) == null) {
                                return;
                            }
                            relativeLayout.addView(primaryViewOfWidth);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
            return this.o0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            this.o.load();
        } else {
            this.o.load(str.getBytes());
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
        if (clickViewList == null || clickViewList.size() <= 0) {
            o(view, new View.OnClickListener() { // from class: com.thinkup.network.inmobi.InmobiTUNativeAd.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InMobiNative inMobiNative = InmobiTUNativeAd.this.o;
                    if (inMobiNative != null) {
                        inMobiNative.reportAdClickAndOpenLandingPage();
                    }
                }
            });
            return;
        }
        for (View view2 : clickViewList) {
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.network.inmobi.InmobiTUNativeAd.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        InMobiNative inMobiNative = InmobiTUNativeAd.this.o;
                        if (inMobiNative != null) {
                            inMobiNative.reportAdClickAndOpenLandingPage();
                        }
                    }
                });
            }
        }
    }

    public void setIsAutoPlay(boolean z2) {
        this.oo = z2;
    }

    private void o(View view, View.OnClickListener onClickListener) {
        if (!(view instanceof ViewGroup) || view == this.o0) {
            view.setOnClickListener(onClickListener);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            o(viewGroup.getChildAt(i2), onClickListener);
        }
    }

    private void o(View view) {
        if ((view instanceof ViewGroup) && view != this.o0) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                o(viewGroup.getChildAt(i2), (View.OnClickListener) null);
            }
            return;
        }
        view.setOnClickListener(null);
    }
}
