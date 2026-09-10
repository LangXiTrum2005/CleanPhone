package com.smartdigimkt.p3;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class a implements ISDMDirectlyOfferSetting {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f37510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Drawable f37511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<View> f37512c;
    private WeakReference<View> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f37513e;

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public Drawable getDirectlySplashAdCTAButtongBgDrawable() {
        return this.f37511b;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public String getDirectlySplashAdShakeIconString() {
        return this.f37510a;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public View getDirectlySplashCTAButton() {
        View view;
        WeakReference<View> weakReference = this.f37512c;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public Boolean getDirectlySplashMuteIconVisible() {
        return this.f37513e;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public View getDirectlySplashShakeButton() {
        View view;
        WeakReference<View> weakReference = this.d;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public void setDirectlySplashAdCTAButtongBgDrawable(Drawable drawable) {
        this.f37511b = drawable;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public void setDirectlySplashAdShakeIconString(String str) {
        this.f37510a = str;
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public void setDirectlySplashCTAButton(View view) {
        if (view != null) {
            this.f37512c = new WeakReference<>(view);
        }
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public void setDirectlySplashMuteIconVisible(boolean z2) {
        this.f37513e = Boolean.valueOf(z2);
    }

    @Override // com.smartdigimkt.sdk.api.ISDMDirectlyOfferSetting
    public void setDirectlySplashShakeButton(View view) {
        if (view != null) {
            this.d = new WeakReference<>(view);
        }
    }
}
