package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class UU implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2833Vl f3821a;
    public final Wm0 b;
    public C2676Pk f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = Ug0.m(this);
    public final C3386es c = new C3386es();

    public UU(C2676Pk c2676Pk, Wm0 wm0, C2833Vl c2833Vl) {
        this.f = c2676Pk;
        this.b = wm0;
        this.f3821a = c2833Vl;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        SU su = (SU) message.obj;
        long j = su.f3716a;
        TreeMap treeMap = this.e;
        long j2 = su.b;
        Long l = (Long) treeMap.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
