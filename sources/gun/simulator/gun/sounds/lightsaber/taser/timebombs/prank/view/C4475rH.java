package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Trace;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4475rH implements InterfaceC3718ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4925a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4475rH(String str, Object obj, int i) {
        this.f4925a = i;
        this.b = str;
        this.c = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3718ih
    public final Object c(C3274de0 c3274de0) {
        int i = this.f4925a;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return new C3235d8(str, ((InterfaceC4563sH) obj).f((Context) c3274de0.a(Context.class)));
            default:
                C3190ch c3190ch = (C3190ch) obj;
                try {
                    Trace.beginSection(str);
                    return c3190ch.f.c(c3274de0);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
