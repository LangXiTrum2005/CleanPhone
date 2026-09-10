package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4571sP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3692iN f4978a;
    public final C4866vk b;
    public final HashMap c;

    public C4571sP(Context context, C4866vk c4866vk) {
        C3692iN c3692iN = new C3692iN(context);
        this.c = new HashMap();
        this.f4978a = c3692iN;
        this.b = c4866vk;
    }

    public final synchronized Qd0 a(String str) {
        if (this.c.containsKey(str)) {
            return (Qd0) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryQ = this.f4978a.q(str);
        if (cctBackendFactoryQ == null) {
            return null;
        }
        C4866vk c4866vk = this.b;
        Qd0 qd0Create = cctBackendFactoryQ.create(new W7(c4866vk.f5148a, c4866vk.b, c4866vk.c, str));
        this.c.put(str, qd0Create);
        return qd0Create;
    }
}
