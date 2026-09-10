package com.unity3d.ads.network.mapper;

import aa.b;
import an.h;
import com.bumptech.glide.d;
import com.google.android.gms.internal.auth.i;
import com.google.android.gms.internal.measurement.nf;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xn.l;
import xn.o;
import xn.s;
import xn.t;
import xn.u;
import yn.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody;", "body", "Lxn/u;", "generateOkHttpBody", "(Lcom/unity3d/ads/network/model/HttpBody;)Lxn/u;", "Lcom/unity3d/ads/network/model/HttpRequest;", "Lxn/l;", "generateOkHttpHeaders", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lxn/l;", "Lxn/s;", "toOkHttpRequest", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lxn/s;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HttpRequestToOkHttpRequestKt {
    private static final u generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            Pattern pattern = o.f53998c;
            return u.a(i.B("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (!(httpBody instanceof HttpBody.ByteArrayBody)) {
            if (httpBody instanceof HttpBody.EmptyBody) {
                return null;
            }
            throw new b((byte) 0, 20);
        }
        Pattern pattern2 = o.f53998c;
        o oVarB = i.B("text/plain;charset=utf-8");
        byte[] content = ((HttpBody.ByteArrayBody) httpBody).getContent();
        n.f(content, "content");
        int length = content.length;
        a.c(content.length, 0, length);
        return new t(oVarB, length, content);
    }

    private static final l generateOkHttpHeaders(HttpRequest httpRequest) throws IOException {
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String name = entry.getKey();
            String value = xj.n.u0(entry.getValue(), ",", null, null, null, 62);
            n.f(name, "name");
            n.f(value, "value");
            d.h(name);
            d.l(value, name);
            arrayList.add(name);
            arrayList.add(h.T0(value).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    public static final s toOkHttpRequest(HttpRequest httpRequest) throws IOException {
        n.f(httpRequest, "<this>");
        nf nfVar = new nf(10);
        nfVar.B(h.F0(h.U0(httpRequest.getBaseURL(), '/') + '/' + h.U0(httpRequest.getPath(), '/'), "/"));
        nfVar.s(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        l headers = generateOkHttpHeaders(httpRequest);
        n.f(headers, "headers");
        nfVar.f23784d = headers.m();
        return nfVar.a();
    }
}
