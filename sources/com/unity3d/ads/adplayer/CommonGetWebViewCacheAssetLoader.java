package com.unity3d.ads.adplayer;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonGetWebViewCacheAssetLoader implements GetWebViewCacheAssetLoader {
    private final Context context;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader$invoke$1", f = "CommonGetWebViewCacheAssetLoader.kt", l = {21}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WebResourceResponse invokeSuspend$lambda$2(CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader, String str) {
            try {
                InputStream inputStreamOpen = commonGetWebViewCacheAssetLoader.context.getAssets().open(UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH_LOCAL + str);
                AbstractC2995aW.p(inputStreamOpen, "context.assets.open(\"$WE…W_ASSET_PATH_LOCAL$path\")");
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(str), null, inputStreamOpen);
            } catch (Exception unused) {
                DeviceLog.debug("Webview Asset not found: %s", str);
                return null;
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CommonGetWebViewCacheAssetLoader.this.new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            String strConcat;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                GetLatestWebViewConfiguration getLatestWebViewConfiguration = CommonGetWebViewCacheAssetLoader.this.getLatestWebViewConfiguration;
                this.label = 1;
                obj = GetLatestWebViewConfiguration.invoke$default(getLatestWebViewConfiguration, null, null, null, this, 7, null);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            Uri uri = Uri.parse(((WebViewConfiguration) obj).getEntryPoint());
            String path = uri.getPath();
            if (path == null || path.length() == 0) {
                strConcat = UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH;
            } else {
                int iW0 = AbstractC3089ba0.w0(path, '/', 0, 6);
                if (iW0 != -1) {
                    path = path.substring(0, iW0);
                    AbstractC2995aW.p(path, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                strConcat = path.concat("/");
            }
            String host = uri.getHost();
            if (host == null || host.length() == 0) {
                host = UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN;
            }
            WebViewAssetLoader.Builder builder = new WebViewAssetLoader.Builder();
            final CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader = CommonGetWebViewCacheAssetLoader.this;
            return builder.addPathHandler(strConcat, new WebViewAssetLoader.PathHandler() { // from class: com.unity3d.ads.adplayer.a
                @Override // androidx.webkit.WebViewAssetLoader.PathHandler
                public final WebResourceResponse handle(String str) {
                    return CommonGetWebViewCacheAssetLoader.AnonymousClass1.invokeSuspend$lambda$2(commonGetWebViewCacheAssetLoader, str);
                }
            }).setDomain(host).build();
        }
    }

    public CommonGetWebViewCacheAssetLoader(Context context, GetLatestWebViewConfiguration getLatestWebViewConfiguration) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        this.context = context;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
    }

    @Override // com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader
    public WebViewAssetLoader invoke() throws Throwable {
        Object objR = WD.R(C2734Rq.f3684a, new AnonymousClass1(null));
        AbstractC2995aW.p(objR, "override fun invoke(): W…           .build()\n    }");
        return (WebViewAssetLoader) objR;
    }
}
