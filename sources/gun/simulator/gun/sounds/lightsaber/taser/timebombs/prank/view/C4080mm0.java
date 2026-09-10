package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4080mm0 extends com.bytedance.sdk.component.OY.OY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4715a = false;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ String c;
    public final /* synthetic */ C4959wm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080mm0(C4959wm0 c4959wm0, String str) {
        super("cancel b b S");
        this.d = c4959wm0;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UG ug;
        synchronized (this.d.b) {
            try {
                Map map = (Map) this.d.b.get(this.f4715a ? 1 : 0);
                if (map != null) {
                    ug = (UG) map.remove(this.b ? this.c : SG.a(this.c));
                } else {
                    ug = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ug != null) {
            ug.d();
        }
    }
}
