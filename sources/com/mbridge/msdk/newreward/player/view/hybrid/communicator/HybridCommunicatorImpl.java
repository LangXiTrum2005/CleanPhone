package com.mbridge.msdk.newreward.player.view.hybrid.communicator;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.buffer.b;
import com.mbridge.msdk.foundation.same.threadpool.a;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HybridCommunicatorImpl implements HybridCommunicator {
    private final String TAG = "HybridCommunicatorImpl";

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void appendSubView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void appendViewTo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void bringViewToFront(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void broadcast(CommunicatorParameter communicatorParameter) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "NOT IMPLEMENTATION");
            jSONObject.put("data", new JSONObject());
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            o0.a("HybridCommunicatorImpl", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void cai(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void callFailure(WebView webView, String str, String str2) {
        if (webView != null) {
            MBCommunicatorUtil.callFailure(webView, str, str2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void callNotSupportMethod(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getScheme()) || !communicatorParameter.getScheme().equals(CampaignEx.JSON_KEY_MRAID)) {
            return;
        }
        MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), communicatorParameter.getPath());
        MRAIDCommunicatorUtil.fireErrorEvent(communicatorParameter.getWebView(), communicatorParameter.getPath(), "Specified command is not implemented");
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void callSuccess(WebView webView, String str, String str2) {
        if (webView != null) {
            MBCommunicatorUtil.callSuccess(webView, str, str2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void clearAllCache(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void click(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void close(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), "close");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void closeAd(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void closeVideoOperte(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void closeWeb(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void createNativeEC(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void createPlayerView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void createSubPlayTemplateView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void createView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void createWebview(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void destroyComponent(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void expand(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), "expand");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackLayoutOperate(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), "");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackOperate(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), "");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void feedbackPopupOperate(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), "");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void fireEvent(WebView webView, String str, String str2) {
        if (webView != null) {
            MBCommunicatorUtil.fireEvent(webView, str, str2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getAllCache(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getAppSetting(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getComponentOptions(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getCurrentProgress(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getCutout(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getEncryptPrice(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getEndScreenInfo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getFileInfo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getNetstat(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getRewardSetting(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getRewardUnitSetting(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getSDKInfo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void getUnitSetting(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void gial(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void handleNativeObject(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void handlerH5Exception(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void handlerPlayableException(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void hideView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void increaseOfferFrequence(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            if (jSONObject.optJSONObject("data") == null) {
                callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), "H5 transfer data is empty");
                return;
            }
            final CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObject);
            if (campaignWithBackData == null) {
                MBCommunicatorUtil.callException(communicatorParameter.getWebView(), communicatorParameter.getToken(), "H5 transfer campaign is empty");
            } else {
                a.b().execute(new Runnable() { // from class: com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicatorImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        j jVarA = j.a(g.a(c.n().d()));
                        if (jVarA != null) {
                            if (jVarA.a(campaignWithBackData.getId())) {
                                jVarA.b(campaignWithBackData.getId());
                            } else {
                                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                gVar.a(campaignWithBackData.getId());
                                gVar.b(campaignWithBackData.getFca());
                                gVar.c(campaignWithBackData.getFcb());
                                gVar.a(0);
                                gVar.d(1);
                                gVar.a(System.currentTimeMillis());
                                jVarA.b(gVar);
                            }
                        }
                        if (b.k == null || TextUtils.isEmpty(campaignWithBackData.getId())) {
                            return;
                        }
                        b.a(campaignWithBackData.getCampaignUnitId(), campaignWithBackData, "reward");
                    }
                });
                callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), "");
            }
        } catch (Throwable th) {
            MBCommunicatorUtil.callException(communicatorParameter.getWebView(), communicatorParameter.getToken(), th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void init(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void insertViewAbove(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void insertViewBelow(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void install(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void isSystemResume(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void ivRewardAdsWithoutVideo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void loadads(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void loadingResourceStatus(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void notifyCloseBtn(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onJSBridgeConnect(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onSignalCommunicationConnected(WebView webView) {
        String strA = i0.a("YFPpVTzBLkxgHVfXYrPQDbxQHv==");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            fireEvent(webView, strA, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            fireEvent(webView, strA, "");
        } catch (Throwable unused2) {
            fireEvent(webView, strA, "");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onlyAppendSubView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onlyAppendViewTo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onlyInsertViewAbove(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void onlyInsertViewBelow(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void open(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), C4304pL.OPEN);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void openURL(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.d(c.n().d(), strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.f(c.n().d(), strOptString);
            }
        } catch (Throwable th) {
            o0.b("HybridCommunicatorImpl", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playVideoFinishOperate(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerGetMuteState(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerMute(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerPause(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerPlay(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerResume(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerSetRenderType(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerSetSource(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerStop(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerUnmute(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void playerUpdateFrame(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void preloadSubPlayTemplateView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void progressBarOperate(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void progressOperate(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void reactDeveloper(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void readyStatus(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void removeCacheItem(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void removeFromSuperView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void reportData(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void reportUrls(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter == null || TextUtils.isEmpty(communicatorParameter.getQuery())) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(communicatorParameter.getQuery());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strA = t0.a(jSONObject.optString("url"), "&tun=", k0.y() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    com.mbridge.msdk.click.a.a(c.n().d(), (CampaignEx) null, "", strA, false, iOptInt != 0);
                } else {
                    com.mbridge.msdk.click.a.a(c.n().d(), (CampaignEx) null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            callSuccess(communicatorParameter.getWebView(), communicatorParameter.getToken(), "");
        } catch (Throwable th) {
            o0.b("HybridCommunicatorImpl", "reportUrls", th);
            callFailure(communicatorParameter.getWebView(), communicatorParameter.getToken(), com.mbridge.msdk.newreward.function.utils.b.a(1));
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void resetCountdown(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void sendImpressions(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void sendNotchData(WebView webView, String str) {
        MBCommunicatorUtil.notifyNotchData(webView, str);
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setCacheItem(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setOrientation(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setOrientationProperties(CommunicatorParameter communicatorParameter) {
        String str;
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), C4304pL.SET_ORIENTATION_PROPERTIES);
            if (communicatorParameter.getQuery() != null) {
                try {
                    JSONObject jSONObject = new JSONObject(communicatorParameter.getQuery());
                    String strOptString = jSONObject.optString("allowOrientationChange");
                    String strOptString2 = jSONObject.optString("forceOrientation");
                    o0.b("HybridCommunicatorImpl", "MRAID setOrientationProperties");
                    if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                        return;
                    }
                    strOptString.toLowerCase().equals("true");
                    String lowerCase = strOptString2.toLowerCase();
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode == 729267099) {
                        str = "portrait";
                    } else if (iHashCode != 1430647483) {
                        return;
                    } else {
                        str = "landscape";
                    }
                    lowerCase.equals(str);
                } catch (Throwable th) {
                    o0.b("HybridCommunicatorImpl", "MRAID setOrientationProperties", th);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setScaleFitXY(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setSubPlayTemplateInfo(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setViewAlpha(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setViewBgColor(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setViewRect(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void setViewScale(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showAlertView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showVideoClickView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showVideoLocation(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void showView(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void soundOperate(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void statistics(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void toggleCloseBtn(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void triggerCloseBtn(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void unload(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), "unload");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void useCustomClose(CommunicatorParameter communicatorParameter) {
        if (communicatorParameter != null) {
            MRAIDCommunicatorUtil.fireNativeMethodCompleteEvent(communicatorParameter.getWebView(), "useCustomClose");
        }
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void videoOperate(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webViewShow(WebView webView, String str) {
        fireEvent(webView, "webviewshow", str);
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webviewFireEvent(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webviewGoBack(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webviewGoForward(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webviewLoad(CommunicatorParameter communicatorParameter) {
    }

    @Override // com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator
    public void webviewReload(CommunicatorParameter communicatorParameter) {
    }
}
