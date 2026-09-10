package com.unity3d.services.core.webview;

import com.ironsource.X3;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import d5.u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbI = u.i("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbI.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder sbI2 = u.i(sbI.toString());
        sbI2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = d.h(str, sbI2.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return X3.j.f27832c + str + X3.j.f27830b + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                DeviceLog.exception("Unsupported charset when encoding " + str, e10);
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
