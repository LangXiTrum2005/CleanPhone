package com.mbridge.msdk.newreward.player.model;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.CommunicatorParameter;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl;
import com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BaseWebContentModel extends HybridCommunicatorImpl implements WebViewEventListener {
    e mAdapterModel;
    a mClickControl;
    c mCommandManager;
    String mInitCallbackParameter;
    b mReqCallBack;
    int renderStatus;
    int renderType;
    private final String TAG = "BaseWebContentModel";
    String mLifeCycleString = "{}";
    String mVideoProgressString = "{}";

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void click(CommunicatorParameter communicatorParameter) {
        CampaignEx campaignExH;
        super.click(communicatorParameter);
        try {
            if (this.mAdapterModel != null) {
                if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
                    campaignExH = this.mAdapterModel.H() != null ? this.mAdapterModel.H() : this.mAdapterModel.g().b().get(0);
                } else {
                    String strOptString = "";
                    try {
                        strOptString = new JSONObject(communicatorParameter.getQuery()).optString("pt");
                    } catch (Throwable th) {
                        o0.b("BaseWebContentModel", th.getMessage());
                    }
                    campaignExH = com.mbridge.msdk.newreward.function.utils.b.a(strOptString, this.mAdapterModel.H() != null ? this.mAdapterModel.H() : this.mAdapterModel.g().b().get(0));
                }
                campaignExH.setClickTempSource(this.renderType == 3 ? com.mbridge.msdk.foundation.same.report.metrics.a.h : com.mbridge.msdk.foundation.same.report.metrics.a.g);
                campaignExH.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.l);
                a aVar = this.mClickControl;
                if (aVar != null) {
                    aVar.a(campaignExH);
                } else {
                    new a(com.mbridge.msdk.foundation.controller.c.n().d(), this.mAdapterModel.R()).a(campaignExH);
                }
                if (this.mReqCallBack != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.umeng.ccg.a.w, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                    this.mReqCallBack.reqSuccessful(jSONObject);
                }
            }
        } catch (Throwable th2) {
            o0.b("BaseWebContentModel", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void close(CommunicatorParameter communicatorParameter) {
        super.close(communicatorParameter);
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("state");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "close");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "close", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void expand(CommunicatorParameter communicatorParameter) {
        super.expand(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            o0.b("BaseWebContentModel", "MRAID expand " + strOptString + " " + strOptString2);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            boolean zEqualsIgnoreCase = strOptString2.equalsIgnoreCase("true");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.umeng.ccg.a.w, "expand");
                jSONObject2.put("url", strOptString);
                jSONObject2.put("shouldUseCustomClose", zEqualsIgnoreCase ? 1 : 2);
                this.mReqCallBack.reqSuccessful(jSONObject2);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "MRAID expand", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackLayoutOperate(CommunicatorParameter communicatorParameter) {
        super.feedbackLayoutOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "feedbackOperate");
                jSONObject.put("type", TtmlNode.TAG_LAYOUT);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, communicatorParameter.getQuery());
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "feedbackLayoutOperate", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackOperate(CommunicatorParameter communicatorParameter) {
        super.feedbackOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "feedbackOperate");
                jSONObject.put("type", "visibility");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, communicatorParameter.getQuery());
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "feedbackOperate", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackPopupOperate(CommunicatorParameter communicatorParameter) {
        super.feedbackPopupOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "feedbackOperate");
                jSONObject.put("type", "popup");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, communicatorParameter.getQuery());
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "feedbackPopupOperate", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getCurrentProgress(CommunicatorParameter communicatorParameter) {
        super.getCurrentProgress(communicatorParameter);
        if (communicatorParameter != null) {
            try {
                if (TextUtils.isEmpty(this.mVideoProgressString)) {
                    return;
                }
                callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(this.mVideoProgressString.getBytes(), 2));
            } catch (Throwable th) {
                o0.b("BaseWebContentModel", "isSystemResume", th);
                callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getEndScreenInfo(CommunicatorParameter communicatorParameter) {
        super.getEndScreenInfo(communicatorParameter);
        ArrayList arrayList = new ArrayList();
        if (this.mAdapterModel.H() != null) {
            arrayList.add(this.mAdapterModel.H());
        } else {
            arrayList.addAll(this.mAdapterModel.g().b());
        }
        String strA = com.mbridge.msdk.newreward.function.utils.b.a(this.mAdapterModel.R(), (ArrayList<CampaignEx>) arrayList);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(strA.getBytes(), 2));
    }

    public String getH5InitCallbackParameter() {
        return this.mInitCallbackParameter;
    }

    public int getRenderStatus() {
        return this.renderStatus;
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getSDKInfo(CommunicatorParameter communicatorParameter) {
        super.getSDKInfo(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(communicatorParameter.getQuery());
            JSONObject jSONObject = new JSONObject();
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    switch (jSONArray.getInt(i)) {
                        case 1:
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("sdk_info", "MAL_16.9.41,3.0.1");
                                jSONObject.put("sdk_info", jSONObject2);
                            } catch (JSONException e) {
                                o0.b("BaseWebContentModel", e.getMessage());
                            }
                            break;
                        case 2:
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                if (!TextUtils.isEmpty(this.mAdapterModel.R())) {
                                    jSONObject3.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.mAdapterModel.R());
                                }
                                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, jSONObject3);
                            } catch (JSONException e2) {
                                o0.b("BaseWebContentModel", e2.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("appSetting", this.mAdapterModel.O().a().L0());
                                jSONObject.put("appSetting", jSONObject4);
                            } catch (JSONException e3) {
                                o0.b("BaseWebContentModel", e3.getMessage());
                            }
                            break;
                        case 4:
                            try {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("unitSetting", this.mAdapterModel.O().c().H());
                                jSONObject.put("unitSetting", jSONObject5);
                            } catch (JSONException e4) {
                                o0.b("BaseWebContentModel", e4.getMessage());
                            }
                            break;
                        case 5:
                            try {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("device", new r(com.mbridge.msdk.foundation.controller.c.n().d()).a());
                                jSONObject.put("device", jSONObject6);
                            } catch (JSONException e5) {
                                o0.b("BaseWebContentModel", e5.getMessage());
                            }
                            break;
                        case 6:
                            try {
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("playVideoMute", this.mAdapterModel.s());
                                jSONObject7.put("instanceId", "");
                                jSONObject.put("sdkSetting", jSONObject7);
                            } catch (JSONException e6) {
                                o0.b("BaseWebContentModel", e6.getMessage());
                            }
                            break;
                    }
                }
                String string = jSONObject.toString();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(string.getBytes(), 2));
            }
        } catch (Exception e7) {
            o0.b("BaseWebContentModel", "getSDKInfo", e7);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void handlerH5Exception(CommunicatorParameter communicatorParameter) {
        super.handlerH5Exception(communicatorParameter);
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "onReceivedError");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            this.renderStatus = 1;
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f A[PHI: r3
  0x005f: PHI (r3v7 boolean) = (r3v6 boolean), (r3v13 boolean), (r3v13 boolean) binds: [B:24:0x0064, B:12:0x0043, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void init(CommunicatorParameter communicatorParameter) {
        Throwable th;
        boolean zL;
        super.init(communicatorParameter);
        ArrayList arrayList = new ArrayList();
        if (this.mAdapterModel.H() != null) {
            arrayList.add(this.mAdapterModel.H());
        } else {
            arrayList.addAll(this.mAdapterModel.g().b());
        }
        boolean z = false;
        try {
            if (this.renderType == 3 && !arrayList.isEmpty()) {
                zL = t0.l(((CampaignEx) arrayList.get(0)).getendcard_url());
                if (zL) {
                    z = zL;
                } else {
                    try {
                        long ecTemplateId = ((CampaignEx) arrayList.get(0)).getEcTemplateId();
                        if (ecTemplateId == -302 || ecTemplateId == -202) {
                            z = true;
                        } else {
                            z = zL;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        o0.b("BaseWebContentModel", th.getMessage());
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zL = false;
        }
        String strA = com.mbridge.msdk.newreward.function.utils.b.a(this.mAdapterModel.R(), arrayList, this.mAdapterModel.l0(), this.mAdapterModel.s(), z);
        if (!TextUtils.isEmpty(strA)) {
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(strA.getBytes(), 2));
        }
        if (TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            this.mInitCallbackParameter = communicatorParameter.getQuery();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.ccg.a.w, communicatorParameter.getPath());
            jSONObject.put(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, communicatorParameter.getQuery());
            b bVar = this.mReqCallBack;
            if (bVar != null) {
                bVar.reqSuccessful(jSONObject);
            }
        } catch (Throwable th4) {
            o0.b("BaseWebContentModel", "init", th4);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void install(CommunicatorParameter communicatorParameter) {
        CampaignEx campaignExH;
        super.install(communicatorParameter);
        try {
            if (this.mAdapterModel != null) {
                if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
                    campaignExH = this.mAdapterModel.H() != null ? this.mAdapterModel.H() : this.mAdapterModel.g().b().get(0);
                } else {
                    campaignExH = com.mbridge.msdk.newreward.function.utils.b.a(communicatorParameter.getQuery(), this.mAdapterModel.H() != null ? this.mAdapterModel.H() : this.mAdapterModel.g().b().get(0));
                }
                campaignExH.setClickTempSource(this.renderType == 3 ? com.mbridge.msdk.foundation.same.report.metrics.a.h : com.mbridge.msdk.foundation.same.report.metrics.a.g);
                campaignExH.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.l);
                a aVar = this.mClickControl;
                if (aVar != null) {
                    aVar.a(campaignExH);
                } else {
                    new a(com.mbridge.msdk.foundation.controller.c.n().d(), this.mAdapterModel.R()).a(campaignExH);
                }
                if (this.mReqCallBack != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.umeng.ccg.a.w, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                    this.mReqCallBack.reqSuccessful(jSONObject);
                }
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void isSystemResume(CommunicatorParameter communicatorParameter) {
        super.isSystemResume(communicatorParameter);
        if (communicatorParameter != null) {
            try {
                if (TextUtils.isEmpty(this.mLifeCycleString)) {
                    return;
                }
                callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(this.mLifeCycleString.getBytes(), 2));
            } catch (Throwable th) {
                o0.b("BaseWebContentModel", "isSystemResume", th);
                callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void ivRewardAdsWithoutVideo(CommunicatorParameter communicatorParameter) {
        super.ivRewardAdsWithoutVideo(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "ivRewardAdsWithoutVideo");
                if (!TextUtils.isEmpty(communicatorParameter.getQuery())) {
                    JSONObject jSONObject2 = new JSONObject(communicatorParameter.getQuery());
                    int iOptInt = jSONObject2.optInt("type");
                    int iOptInt2 = jSONObject2.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    jSONObject.put("type", iOptInt);
                    jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, iOptInt2);
                }
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "ivRewardAdsWithoutVideo", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void loadingResourceStatus(WebView webView, int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void notifyCloseBtn(CommunicatorParameter communicatorParameter) {
        super.notifyCloseBtn(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("state");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, communicatorParameter.getPath());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "notifyCloseBtn", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onJSBridgeConnect(CommunicatorParameter communicatorParameter) {
        super.onJSBridgeConnect(communicatorParameter);
        onSignalCommunicationConnected(communicatorParameter.getWebView());
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onPageFinished(WebView webView, String str) {
        onSignalCommunicationConnected(webView);
        try {
            if (this.renderStatus != 1) {
                this.renderStatus = 2;
            }
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "onPageFinished");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onProgressChanged(WebView webView, int i) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "onReceivedError");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            this.renderStatus = 1;
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public void onRenderProcessGone(WebView webView) {
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "onReceivedError");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            this.renderStatus = 1;
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void open(CommunicatorParameter communicatorParameter) {
        super.open(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            String strOptString = new JSONObject(communicatorParameter.getQuery()).optString("url");
            if (!TextUtils.isEmpty(strOptString)) {
                if (this.mAdapterModel.g().a().g().size() > 1) {
                    com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)));
                } else {
                    JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(this.mAdapterModel.H());
                    if (jSONObjectCampaignToJsonObject != null) {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                        campaignWithBackData.setClickURL(strOptString);
                        campaignWithBackData.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.h);
                        campaignWithBackData.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.m);
                        new a(com.mbridge.msdk.foundation.controller.c.n().d(), this.mAdapterModel.R()).a(campaignWithBackData);
                    }
                }
            }
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 0);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", C4304pL.OPEN, th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void progressBarOperate(CommunicatorParameter communicatorParameter) {
        super.progressBarOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            if (this.mReqCallBack != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.umeng.ccg.a.w, "progressBarOperate");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, jSONObject);
                this.mReqCallBack.reqSuccessful(jSONObject2);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "progressBarOperate", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void progressOperate(CommunicatorParameter communicatorParameter) {
        super.progressOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            if (this.mReqCallBack != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.umeng.ccg.a.w, "progressOperate");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, jSONObject);
                this.mReqCallBack.reqSuccessful(jSONObject2);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "progressOperate", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void readyStatus(CommunicatorParameter communicatorParameter) {
        super.readyStatus(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int i = 1;
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("isReady", 1);
            this.renderStatus = iOptInt == 1 ? 3 : 4;
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, communicatorParameter.getPath());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            if (iOptInt != 1) {
                i = 2;
            }
            eVar.a("result", Integer.valueOf(i));
            eVar.a("type", Integer.valueOf(this.renderType));
            this.mAdapterModel.B().a(this.mAdapterModel, eVar.a(), "2000155");
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "readyStatus", th);
        }
    }

    public void setAdapterModel(e eVar) {
        this.mAdapterModel = eVar;
    }

    public void setCallbackListener(b bVar) {
        this.mReqCallBack = bVar;
    }

    public void setCommandManager(c cVar) {
        this.mCommandManager = cVar;
    }

    public void setLifeCycleString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mLifeCycleString = str;
    }

    public void setRenderStatus(int i) {
        this.renderStatus = i;
    }

    public void setRenderType(int i) {
        this.renderType = i;
    }

    public void setVideoProgressString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mVideoProgressString = str;
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showVideoClickView(CommunicatorParameter communicatorParameter) {
        super.showVideoClickView(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("type");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "showVideoClickView");
                jSONObject.put("type", iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "showVideoClickView", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showVideoLocation(CommunicatorParameter communicatorParameter) {
        super.showVideoLocation(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "showVideoLocation");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, communicatorParameter.getQuery());
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "showVideoLocation", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void soundOperate(CommunicatorParameter communicatorParameter) {
        super.soundOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            if (this.mReqCallBack != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.umeng.ccg.a.w, "soundOperate");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, jSONObject);
                this.mReqCallBack.reqSuccessful(jSONObject2);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "soundOperate", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void statistics(CommunicatorParameter communicatorParameter) {
        super.statistics(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            final String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT);
            final String strOptString2 = jSONObject.optString("template", "-1");
            final String strOptString3 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "-1");
            final String strOptString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.mAdapterModel.R());
            final int iS = k0.s(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.newreward.player.model.BaseWebContentModel.1
                @Override // java.lang.Runnable
                public void run() {
                    n.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(new m("2000039", strOptString, strOptString2, strOptString3, strOptString4, BaseWebContentModel.this.mAdapterModel.H().getId(), iS, k0.a(com.mbridge.msdk.foundation.controller.c.n().d(), iS)));
                }
            });
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void toggleCloseBtn(CommunicatorParameter communicatorParameter) {
        super.toggleCloseBtn(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("state");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, communicatorParameter.getPath());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "toggleCloseBtn", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void triggerCloseBtn(CommunicatorParameter communicatorParameter) {
        super.triggerCloseBtn(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("state");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "close");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "triggerCloseBtn", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void unload(CommunicatorParameter communicatorParameter) {
        super.unload(communicatorParameter);
        close(communicatorParameter);
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void useCustomClose(CommunicatorParameter communicatorParameter) {
        super.useCustomClose(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            String strOptString = new JSONObject(communicatorParameter.getQuery()).optString("shouldUseCustomClose");
            o0.b("BaseWebContentModel", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            boolean zEqualsIgnoreCase = strOptString.equalsIgnoreCase("true");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "toggleCloseBtn");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, zEqualsIgnoreCase ? 1 : 2);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "MRAID useCustomClose", th);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void videoOperate(CommunicatorParameter communicatorParameter) {
        super.videoOperate(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("pause_or_resume");
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, "videoOperate");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "videoOperate", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl, com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void loadingResourceStatus(CommunicatorParameter communicatorParameter) {
        super.loadingResourceStatus(communicatorParameter);
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            int iOptInt = new JSONObject(communicatorParameter.getQuery()).optInt("isReady", 1);
            this.renderStatus = iOptInt == 1 ? 3 : 4;
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(0));
            if (this.mReqCallBack != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.ccg.a.w, communicatorParameter.getPath());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, iOptInt);
                this.mReqCallBack.reqSuccessful(jSONObject);
            }
        } catch (Throwable th) {
            o0.b("BaseWebContentModel", "readyStatus", th);
        }
    }
}
