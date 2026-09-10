package ads_mobile_sdk;

import com.ironsource.C3460cc;
import java.net.URL;
import java.util.LinkedHashMap;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wt0 {
    public URL a;
    public String b;
    public final LinkedHashMap c;
    public byte[] d;

    public wt0() {
        this.b = C3460cc.a;
        this.c = new LinkedHashMap();
    }

    public final wt0 a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = (String) this.c.get(name);
        LinkedHashMap linkedHashMap = this.c;
        if (str != null) {
            value = str + ", " + value;
        }
        linkedHashMap.put(name, value);
        return this;
    }

    public final wt0 b() {
        return a(C3460cc.a, (byte[]) null);
    }

    public final wt0 b(String value, byte[] body) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(value, "contentType");
        wt0 wt0VarA = a(C3460cc.b, body);
        Intrinsics.checkNotNullParameter("Content-Type", "name");
        Intrinsics.checkNotNullParameter(value, "value");
        wt0VarA.c.put("Content-Type", value);
        return wt0VarA;
    }

    public wt0(xt0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.b = C3460cc.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = linkedHashMap;
        this.a = request.d();
        this.b = request.c();
        linkedHashMap.putAll(request.b());
        this.d = request.a();
    }

    public final xt0 a() {
        URL url = this.a;
        if (url != null) {
            return new xt0(url, this.b, seminary.rotuma(this.c), this.d);
        }
        throw new IllegalStateException("HttpRequest.Builder: URL must be set before calling build()");
    }

    public final wt0 a(String method, byte[] bArr) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() > 0) {
            if (bArr == null && (Intrinsics.wireman(method, C3460cc.b) || Intrinsics.wireman(method, "PUT") || Intrinsics.wireman(method, "PATCH"))) {
                throw new IllegalArgumentException(("Method " + method + " must have a request body.").toString());
            }
            this.b = method;
            this.d = bArr;
            return this;
        }
        throw new IllegalArgumentException("HTTP method must not be empty");
    }

    public final wt0 a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = new URL(url);
        return this;
    }
}
