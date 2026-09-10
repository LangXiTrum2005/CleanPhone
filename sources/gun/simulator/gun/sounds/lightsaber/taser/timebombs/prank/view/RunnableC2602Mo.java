package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import androidx.profileinstaller.DeviceProfileWriter;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2602Mo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3426a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC2602Mo(Object obj, int i, Object obj2, int i2) {
        this.f3426a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3426a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((DeviceProfileWriter) obj2).lambda$result$0(i2, obj);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((C4167nm) ((OO) ((C3692iN) obj2).c).h).D(((Integer) pair.first).intValue(), (C5186zO) pair.second, i2);
                break;
            case 2:
                C3031aq c3031aq = (C3031aq) obj2;
                InterfaceC3120bq interfaceC3120bq = (InterfaceC3120bq) obj;
                int i3 = c3031aq.f4145a;
                interfaceC3120bq.getClass();
                interfaceC3120bq.D(i3, c3031aq.b, i2);
                break;
            default:
                BI bi = (BI) obj;
                for (DI di : (CopyOnWriteArraySet) obj2) {
                    if (!di.d) {
                        if (i2 != -1) {
                            di.b.a(i2);
                        }
                        di.c = true;
                        bi.invoke(di.f2965a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2602Mo(Object obj, Object obj2, int i, int i2) {
        this.f3426a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
