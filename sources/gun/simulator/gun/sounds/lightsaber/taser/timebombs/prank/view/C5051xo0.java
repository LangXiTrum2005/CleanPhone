package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5051xo0 extends com.bytedance.sdk.component.OY.OY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5247a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5051xo0(TY ty) {
        super("cleanupCmd", 1);
        this.b = ty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5247a) {
            case 0:
                No0 no0 = (No0) ((TY) this.b).b;
                No0.t(no0, no0.p);
                return;
            default:
                ArrayList arrayList = new ArrayList();
                synchronized (((C4959wm0) this.b).b) {
                    try {
                        int size = ((C4959wm0) this.b).b.size();
                        for (int i = 0; i < size; i++) {
                            Object obj = this.b;
                            Map map = (Map) ((C4959wm0) obj).b.get(((C4959wm0) obj).b.keyAt(i));
                            if (map != null) {
                                arrayList.addAll(map.values());
                                map.clear();
                            }
                        }
                        ((C4959wm0) this.b).c.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UG) it.next()).d();
                    No0 no1 = AbstractC4648tE.f5026a;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5051xo0(C4959wm0 c4959wm0) {
        super("cancelAll");
        this.b = c4959wm0;
    }
}
