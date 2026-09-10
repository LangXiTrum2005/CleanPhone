package com.unity3d.services.core.network.mapper;

import an.h;
import com.bumptech.glide.d;
import com.google.android.gms.internal.auth.i;
import com.google.android.gms.internal.measurement.nf;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import xj.n;
import xn.l;
import xn.o;
import xn.s;
import xn.t;
import xn.u;
import yn.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "body", "Lxn/u;", "generateOkHttpBody", "(Ljava/lang/Object;)Lxn/u;", "generateOkHttpProtobufBody", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lxn/l;", "generateOkHttpHeaders", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lxn/l;", "Lxn/s;", "toOkHttpRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lxn/s;", "toOkHttpProtoRequest", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HttpRequestToOkHttpRequestKt {
    private static final u generateOkHttpBody(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof String) {
                Pattern pattern = o.f53998c;
                return u.a(i.B("text/plain;charset=utf-8"), (String) obj);
            }
            Pattern pattern2 = o.f53998c;
            return u.a(i.B("text/plain;charset=utf-8"), "");
        }
        Pattern pattern3 = o.f53998c;
        o oVarB = i.B("text/plain;charset=utf-8");
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        a.c(bArr.length, 0, length);
        return new t(oVarB, length, bArr);
    }

    private static final l generateOkHttpHeaders(HttpRequest httpRequest) throws IOException {
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String name = entry.getKey();
            String value = n.u0(entry.getValue(), ",", null, null, null, 62);
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(value, "value");
            d.h(name);
            d.l(value, name);
            arrayList.add(name);
            arrayList.add(h.T0(value).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    private static final u generateOkHttpProtobufBody(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof String) {
                Pattern pattern = o.f53998c;
                return u.a(i.B(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            }
            Pattern pattern2 = o.f53998c;
            return u.a(i.B(CommonGatewayClient.HEADER_PROTOBUF), "");
        }
        Pattern pattern3 = o.f53998c;
        o oVarB = i.B(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        a.c(bArr.length, 0, length);
        return new t(oVarB, length, bArr);
    }

    public static final s toOkHttpProtoRequest(HttpRequest httpRequest) throws IOException {
        kotlin.jvm.internal.n.f(httpRequest, "<this>");
        nf nfVar = new nf(10);
        nfVar.B(h.F0(h.U0(httpRequest.getBaseURL(), '/') + '/' + h.U0(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        nfVar.s(string, body != null ? generateOkHttpProtobufBody(body) : null);
        l headers = generateOkHttpHeaders(httpRequest);
        kotlin.jvm.internal.n.f(headers, "headers");
        nfVar.f23784d = headers.m();
        return nfVar.a();
    }

    public static final s toOkHttpRequest(HttpRequest httpRequest) throws IOException {
        kotlin.jvm.internal.n.f(httpRequest, "<this>");
        nf nfVar = new nf(10);
        nfVar.B(h.F0(h.U0(httpRequest.getBaseURL(), '/') + '/' + h.U0(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        nfVar.s(string, body != null ? generateOkHttpBody(body) : null);
        l headers = generateOkHttpHeaders(httpRequest);
        kotlin.jvm.internal.n.f(headers, "headers");
        nfVar.f23784d = headers.m();
        return nfVar.a();
    }
}
