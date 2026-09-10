package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3808ji0 implements JD {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    public static final C3634hi0 Companion = new C3634hi0(null);
    private static final String GZIP = "gzip";

    private final NY gzip(NY ny) throws IOException {
        C4848vb c4848vb = new C4848vb();
        DX dxE = AbstractC4496rb.e(new C2690Py(c4848vb));
        ny.writeTo(dxE);
        dxE.close();
        return new C3721ii0(ny, c4848vb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
    public C5021xZ intercept(ID id) throws IOException {
        AbstractC2995aW.q(id, "chain");
        MX mx = (MX) id;
        HY hy = mx.e;
        NY ny = hy.d;
        if (ny == null || hy.c.a("Content-Encoding") != null) {
            return mx.b(hy);
        }
        GY gyA = hy.a();
        gyA.c("Content-Encoding", "gzip");
        gyA.e(hy.b, gzip(ny));
        return mx.b(gyA.b());
    }
}
