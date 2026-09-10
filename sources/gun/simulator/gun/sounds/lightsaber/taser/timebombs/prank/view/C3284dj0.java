package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3284dj0 implements BE {
    private final Context context;
    private final ZT pathProvider;

    public C3284dj0(Context context, ZT zt) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(zt, "pathProvider");
        this.context = context;
        this.pathProvider = zt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BE
    public InterfaceC5088yE create(String str) throws Wf0 {
        AbstractC2995aW.q(str, "tag");
        if (str.length() == 0) {
            throw new Wf0("Job tag is null");
        }
        if (AbstractC2995aW.i(str, C3889kf.TAG)) {
            return new C3889kf(this.context, this.pathProvider);
        }
        if (AbstractC2995aW.i(str, C3440fZ.TAG)) {
            return new C3440fZ(this.context, this.pathProvider);
        }
        throw new Wf0("Unknown Job Type ".concat(str));
    }

    public final Context getContext() {
        return this.context;
    }

    public final ZT getPathProvider() {
        return this.pathProvider;
    }
}
