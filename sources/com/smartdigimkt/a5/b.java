package com.smartdigimkt.a5;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.b5.e;
import com.smartdigimkt.sdk.api.business.express.IExpressComponent;
import com.smartdigimkt.w6.l;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IExpressComponent f33676a;

    public b(IExpressComponent iExpressComponent) {
        this.f33676a = iExpressComponent;
    }

    @Override // com.smartdigimkt.a5.c
    public void a(com.smartdigimkt.f5.a aVar) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            iExpressComponent.setListener(aVar);
        }
    }

    @Override // com.smartdigimkt.a5.c
    public void b(Activity activity, Map<String, Object> map, String str, String str2, String str3) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            iExpressComponent.showInterstitial(activity, map, str3, str2);
        }
    }

    @Override // com.smartdigimkt.a5.c
    public void destroy() {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            iExpressComponent.destroy();
        }
    }

    @Override // com.smartdigimkt.a5.c
    public boolean isAdReady() {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            return iExpressComponent.isReady();
        }
        return false;
    }

    @Override // com.smartdigimkt.a5.c
    public void a(Activity activity, Map<String, Object> map, String str, String str2, String str3) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            iExpressComponent.showRewardedVideo(activity, map, str3, str2);
        }
    }

    @Override // com.smartdigimkt.a5.c
    public void a(ViewGroup viewGroup, Map<String, Object> map, boolean z2) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            iExpressComponent.showSplash(viewGroup, map);
        }
    }

    @Override // com.smartdigimkt.a5.c
    public View a(Context context) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent == null) {
            return null;
        }
        iExpressComponent.registerBannerListener();
        return this.f33676a.getBannerView();
    }

    @Override // com.smartdigimkt.a5.c
    public com.smartdigimkt.b5.d a(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        IExpressComponent iExpressComponent = this.f33676a;
        if (iExpressComponent != null) {
            return new e(context, lVar, aVar, iExpressComponent, z2);
        }
        return null;
    }
}
