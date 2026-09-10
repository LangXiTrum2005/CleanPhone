package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f31666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CampaignEx f31667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppletsModel f31668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f31669d;

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f31666a = nativeTrackingListener;
        this.f31667b = campaignEx;
        this.f31668c = appletsModel;
        this.f31669d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f31667b;
        if (campaignEx == null || this.f31668c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f31666a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f31668c.setUserClick(false);
            this.f31668c.setRequestingFinish();
            this.f31667b.setClickURL(str2);
            a aVar = this.f31669d;
            if (aVar != null) {
                try {
                    aVar.a(this.f31667b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f31667b;
        if (campaignEx == null || this.f31668c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f31666a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f31668c.setUserClick(false);
            this.f31668c.setRequestingFinish();
            this.f31667b.setDeepLinkUrl(str);
            a aVar = this.f31669d;
            if (aVar != null) {
                try {
                    aVar.a(this.f31667b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestStart() {
    }
}
