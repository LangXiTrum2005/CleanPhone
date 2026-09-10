package id;

import md.h;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler f43001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f43002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.f f43003c;

    public f(ResponseHandler responseHandler, h hVar, gd.f fVar) {
        this.f43001a = responseHandler;
        this.f43002b = hVar;
        this.f43003c = fVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f43003c.i(this.f43002b.b());
        this.f43003c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = g.a(httpResponse);
        if (lA != null) {
            this.f43003c.h(lA.longValue());
        }
        String strB = g.b(httpResponse);
        if (strB != null) {
            this.f43003c.g(strB);
        }
        this.f43003c.b();
        return this.f43001a.handleResponse(httpResponse);
    }
}
