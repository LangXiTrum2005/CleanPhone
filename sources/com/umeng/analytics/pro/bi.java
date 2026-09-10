package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public enum bi {
    UnKnownCode(5000),
    Timeout(5001),
    NetworkUnavailable(5002),
    SSLException(5003),
    IOException(5004),
    UnKnownHostException(5005),
    HttpError(5006),
    EmptyResponse(5007),
    ErrorResponse(5008),
    ErrorMakeRequestBody(5009);

    private final int k;

    bi(int i) {
        this.k = i;
    }

    private String b() {
        return AbstractC5044xl.o(new StringBuilder("错误码："), this.k, " 错误信息：");
    }

    public String a() {
        if (this == UnKnownCode) {
            return DM.m(new StringBuilder(), b(), "--未知错误--");
        }
        if (this == Timeout) {
            return DM.m(new StringBuilder(), b(), "--连接超时--");
        }
        if (this == NetworkUnavailable) {
            return DM.m(new StringBuilder(), b(), "--网络不可用--");
        }
        if (this == SSLException) {
            return DM.m(new StringBuilder(), b(), "--SSL证书认证失败--");
        }
        if (this == IOException) {
            return DM.m(new StringBuilder(), b(), "--IO异常--");
        }
        if (this == HttpError) {
            return DM.m(new StringBuilder(), b(), "--服务端返回HTTP错误--");
        }
        if (this == EmptyResponse) {
            return DM.m(new StringBuilder(), b(), "--服务端返回数据为空--");
        }
        if (this == ErrorResponse) {
            return DM.m(new StringBuilder(), b(), "--服务端返回错误数据--");
        }
        return this == ErrorMakeRequestBody ? DM.m(new StringBuilder(), b(), "--请求报文构建错误--") : "unknown";
    }
}
