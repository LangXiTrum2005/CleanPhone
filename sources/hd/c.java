package hd;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import nd.c0;
import nd.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fd.a f42317e = fd.a.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f42318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f42319d;

    public c(c0 c0Var, Context context) {
        this.f42319d = context;
        this.f42318c = c0Var;
    }

    @Override // hd.e
    public final boolean a() {
        URI uriCreate;
        c0 c0Var = this.f42318c;
        String url = c0Var.getUrl();
        boolean zIsEmpty = url == null ? true : url.trim().isEmpty();
        fd.a aVar = f42317e;
        if (zIsEmpty) {
            aVar.f("URL is missing:" + c0Var.getUrl());
            return false;
        }
        String url2 = c0Var.getUrl();
        if (url2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e10) {
                aVar.g("getResultUrl throws exception %s", e10.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            aVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.f42319d;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            fd.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (no.b.f46875a == null) {
                no.b.f46875a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = no.b.f46875a;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        aVar.f("URL fails allowlist rule: " + uriCreate);
                        return false;
                    }
                    if (host.contains(strArr[i10])) {
                        break;
                    }
                    i10++;
                }
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            aVar.f("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            aVar.f("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            aVar.f("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            aVar.f("URL port is less than or equal to 0");
            return false;
        }
        z zVarX = c0Var.G() ? c0Var.x() : null;
        if (zVarX == null || zVarX == z.HTTP_METHOD_UNKNOWN) {
            aVar.f("HTTP Method is null or invalid: " + c0Var.x());
            return false;
        }
        if (c0Var.H() && c0Var.y() <= 0) {
            aVar.f("HTTP ResponseCode is a negative value:" + c0Var.y());
            return false;
        }
        if (c0Var.I()) {
            if (!(c0Var.A() >= 0)) {
                aVar.f("Request Payload is a negative value:" + c0Var.A());
                return false;
            }
        }
        if (c0Var.J()) {
            if (!(c0Var.B() >= 0)) {
                aVar.f("Response Payload is a negative value:" + c0Var.B());
                return false;
            }
        }
        if (!c0Var.F() || c0Var.v() <= 0) {
            aVar.f("Start time of the request is null, or zero, or a negative value:" + c0Var.v());
            return false;
        }
        if (c0Var.K()) {
            if (!(c0Var.C() >= 0)) {
                aVar.f("Time to complete the request is a negative value:" + c0Var.C());
                return false;
            }
        }
        if (c0Var.M()) {
            if (!(c0Var.E() >= 0)) {
                aVar.f("Time from the start of the request to the start of the response is null or a negative value:" + c0Var.E());
                return false;
            }
        }
        if (!c0Var.L() || c0Var.D() <= 0) {
            aVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + c0Var.D());
            return false;
        }
        if (c0Var.H()) {
            return true;
        }
        aVar.f("Did not receive a HTTP Response Code");
        return false;
    }
}
