package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.OY.ebl;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Bo0 extends com.bytedance.sdk.component.OY.OY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2893a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bo0(ebl eblVar) {
        super("processCacheNetWorkConcurrent");
        this.f2893a = 1;
        this.b = eblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2893a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((HashSet) obj).iterator();
                while (it.hasNext()) {
                    try {
                        ((File) it.next()).delete();
                    } catch (Throwable unused) {
                    }
                }
                break;
            case 1:
                ((ebl) obj).run();
                break;
            default:
                ((C4172no0) obj).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Bo0(Object obj, String str, int i, Object obj2, int i2) {
        super(str, i);
        this.f2893a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
