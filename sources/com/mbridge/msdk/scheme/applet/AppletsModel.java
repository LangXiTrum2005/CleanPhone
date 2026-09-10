package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l1.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (eVar == null || eVar.f33811c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(eVar);
            } catch (SchemeRequestException e10) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z10) {
        this.isRequesting = z10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #3 {Exception -> 0x0077, blocks: (B:5:0x0015, B:7:0x001f, B:10:0x0027, B:11:0x0036, B:14:0x0044, B:16:0x0053, B:21:0x0066, B:23:0x006e, B:34:0x00a7, B:36:0x00ba, B:31:0x0084, B:33:0x0088, B:48:0x00e1, B:57:0x00fa, B:66:0x0113, B:67:0x0116, B:75:0x0130, B:77:0x013e, B:78:0x0154, B:72:0x0126, B:74:0x012a, B:63:0x0109, B:65:0x010d, B:54:0x00f0, B:56:0x00f4, B:45:0x00d7, B:47:0x00db, B:49:0x00e4, B:58:0x00fd, B:40:0x00cb, B:28:0x007a), top: B:91:0x0015, inners: #0, #1, #2, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        String str;
        String str2;
        String str3;
        String strEncode;
        String str4 = MBridgeConstans.DYNAMIC_VIEW_WX_IS_REDIRECT;
        String str5 = "query";
        HashMap map = new HashMap();
        if (campaignEx != null) {
            try {
                Uri uri = Uri.parse(campaignEx.getClickURL());
                if (uri != null && uri.getQueryParameterNames() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = uri.getQueryParameterNames().iterator();
                    int i10 = 0;
                    while (true) {
                        String queryParameter = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        Iterator<String> it2 = it;
                        String next = it.next();
                        if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                            str4 = str4;
                            str5 = str5;
                        } else {
                            try {
                                queryParameter = uri.getQueryParameter(next);
                            } catch (Exception unused) {
                            }
                            String strEncode2 = queryParameter;
                            if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                                try {
                                    strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b(TAG, "encode url for " + strEncode2 + " failed", e10);
                                    }
                                    sb2.append(next);
                                    sb2.append(X3.j.f27830b);
                                    sb2.append(strEncode2);
                                    if (i10 < uri.getQueryParameterNames().size()) {
                                        sb2.append(X3.j.f27832c);
                                    }
                                    i10++;
                                    it = it2;
                                    str4 = str4;
                                    str5 = str5;
                                }
                            }
                            sb2.append(next);
                            sb2.append(X3.j.f27830b);
                            sb2.append(strEncode2);
                            if (i10 < uri.getQueryParameterNames().size()) {
                                sb2.append(X3.j.f27832c);
                            }
                            i10++;
                        }
                        it = it2;
                        str4 = str4;
                        str5 = str5;
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e);
                        }
                    }
                    String str6 = str4;
                    String str7 = str5;
                    try {
                        String queryParameter2 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                        str = queryParameter2 == null ? "" : queryParameter2;
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e11);
                        }
                    }
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
                    try {
                        String queryParameter3 = uri.getQueryParameter("path");
                        str2 = queryParameter3 == null ? "" : queryParameter3;
                    } catch (Exception e12) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e12);
                        }
                    }
                    map.put("path", str2);
                    try {
                        String queryParameter4 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                        str3 = queryParameter4 == null ? "" : queryParameter4;
                    } catch (Exception e13) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e13);
                        }
                    }
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                    try {
                        strEncode = URLEncoder.encode(sb2.toString(), "UTF-8");
                        if (strEncode == null) {
                            strEncode = "";
                        }
                    } catch (UnsupportedEncodingException e14) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(TAG, "create wechat app request param failed ", e14);
                        }
                    }
                    map.put(str7, strEncode);
                    map.put(str6, "0");
                    if (MBridgeConstans.DEBUG) {
                        q0.a(TAG, "query: " + strEncode);
                    }
                    this.reBuildClickUrl = reCreateClickUrl(MBridgeConstans.DYNAMIC_VIEW_WX_APP + X3.j.f27830b + str + X3.j.f27832c + "path" + X3.j.f27830b + str2 + X3.j.f27832c + str7 + X3.j.f27830b + strEncode + X3.j.f27832c + MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + X3.j.f27830b + str3 + X3.j.f27832c + str6 + X3.j.f27830b + "1");
                }
            } catch (Exception e15) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, "create wechat app request param failed ", e15);
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler request network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i10, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestFailed network error by code " + String.valueOf(i10) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i10, str, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme failed exception  ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), d.g("network error by code ", String.valueOf(i10), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i10;
        String message;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i10 = aVar.f33812a;
            message = aVar.getMessage();
            if (i10 == 10) {
                message = "request timeout";
            }
        } else {
            i10 = -1;
            message = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestNetworkError network error by code " + String.valueOf(i10) + " and " + message);
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i10, "network error: " + message, this.reBuildClickUrl);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme network error exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), d.g("network error by code ", String.valueOf(i10), " and ", message), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.f33811c;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(strOptString);
            return;
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(iOptInt, strOptString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme start exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            f2.z("handlerSchemeRequestSuccess: ", str, TAG);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme success exception ", e10);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(c1.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query wx_miniprogram from click url exception ", e10);
            }
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.j())) {
                return TextUtils.equals(c1.a(rewardTemplateMode.j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query reqwxurl from template url exception ", e10);
            }
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return q4.a.j(new StringBuilder(), com.mbridge.msdk.foundation.same.net.utils.d.h().f33847b, "?", str);
    }

    public boolean can(int i10) {
        if (isRequesting() || !canRequestWxScheme(i10)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i11 = this.lastRequestType;
        return (i11 == 0 && i10 == 1) || (i11 == 1 && i10 == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i10) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 1;
        }
        return isCanRequestByTemplateUrl("2");
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i10, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i10;
            appletSchemeRequest.get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33847b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z10) {
        this.isUserClick = z10;
    }
}
