package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4672tb implements JD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3108bk f5039a;

    public C4672tb(InterfaceC3108bk interfaceC3108bk) {
        AbstractC2995aW.q(interfaceC3108bk, "cookieJar");
        this.f5039a = interfaceC3108bk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public final C5021xZ intercept(ID id) {
        CZ cz;
        MX mx = (MX) id;
        HY hy = mx.e;
        GY gyA = hy.a();
        NY ny = hy.d;
        if (ny != null) {
            RO roContentType = ny.contentType();
            if (roContentType != null) {
                gyA.c("Content-Type", roContentType.f3657a);
            }
            long jContentLength = ny.contentLength();
            if (jContentLength != -1) {
                gyA.c("Content-Length", String.valueOf(jContentLength));
                gyA.c.j(HttpResponseHeader.TransferEncoding);
            } else {
                gyA.c(HttpResponseHeader.TransferEncoding, "chunked");
                gyA.c.j("Content-Length");
            }
        }
        C4447qz c4447qz = hy.c;
        String strA = c4447qz.a(HttpRequestHeader.Host);
        boolean z = false;
        ZA za = hy.f3175a;
        if (strA == null) {
            gyA.c(HttpRequestHeader.Host, Vg0.v(za, false));
        }
        if (c4447qz.a("Connection") == null) {
            gyA.c("Connection", "Keep-Alive");
        }
        if (c4447qz.a(HttpRequestHeader.AcceptEncoding) == null && c4447qz.a("Range") == null) {
            gyA.c(HttpRequestHeader.AcceptEncoding, Constants.CP_GZIP);
            z = true;
        }
        InterfaceC3108bk interfaceC3108bk = this.f5039a;
        ((G7) interfaceC3108bk).getClass();
        AbstractC2995aW.q(za, "url");
        if (c4447qz.a("User-Agent") == null) {
            gyA.c("User-Agent", "okhttp/4.10.0");
        }
        C5021xZ c5021xZB = mx.b(gyA.b());
        C4447qz c4447qz2 = c5021xZB.f;
        UA.b(interfaceC3108bk, za, c4447qz2);
        C4845vZ c4845vZM = c5021xZB.m();
        c4845vZM.f5136a = hy;
        if (z && AbstractC3089ba0.o0(Constants.CP_GZIP, C5021xZ.i(c5021xZB, HttpResponseHeader.ContentEncoding)) && UA.a(c5021xZB) && (cz = c5021xZB.g) != null) {
            C2716Qy c2716Qy = new C2716Qy(cz.source());
            C5036xh c5036xhC = c4447qz2.c();
            c5036xhC.j(HttpResponseHeader.ContentEncoding);
            c5036xhC.j("Content-Length");
            c4845vZM.c(c5036xhC.e());
            c4845vZM.g = new AZ(C5021xZ.i(c5021xZB, "Content-Type"), -1L, AbstractC4496rb.f(c2716Qy));
        }
        return c4845vZM.a();
    }
}
