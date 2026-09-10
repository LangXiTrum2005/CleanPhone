package com.thinkup.network.gtm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUExpressNativeAd extends CustomNativeAd {
    ViewGroup m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42562n;
    MBNativeAdvancedHandler o;
    private final String o0 = "GTMTUExpressNativeAd";

    public GTMTUExpressNativeAd(Context context, MBNativeAdvancedHandler mBNativeAdvancedHandler, boolean z2) {
        this.o = mBNativeAdvancedHandler;
        mBNativeAdvancedHandler.setAdListener(new NativeAdvancedAdListener() { // from class: com.thinkup.network.gtm.GTMTUExpressNativeAd.1
            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void closeFullScreen(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onClick(MBridgeIds mBridgeIds) {
                GTMTUExpressNativeAd.this.notifyAdClicked();
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onClose(MBridgeIds mBridgeIds) {
                GTMTUExpressNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLeaveApp(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLogImpression(MBridgeIds mBridgeIds) {
                GTMTUExpressNativeAd.this.notifyAdImpression();
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void showFullScreen(MBridgeIds mBridgeIds) {
            }
        });
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.o;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
            this.o.setAdListener(null);
            this.o = null;
        }
        this.m = null;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.m == null) {
                this.m = this.o.getAdViewGroup();
            }
            return this.m;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public boolean isNativeExpress() {
        return true;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void onPause() {
        super.onPause();
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.o;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void onResume() {
        super.onResume();
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.o;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.o;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }

    public void setIsAutoPlay(boolean z2) {
        this.f42562n = z2;
    }
}
