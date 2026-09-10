package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Aa0 implements InterfaceC4753uV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2819a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4753uV
    public final boolean apply(Object obj) {
        switch (this.f2819a) {
            case 2:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
