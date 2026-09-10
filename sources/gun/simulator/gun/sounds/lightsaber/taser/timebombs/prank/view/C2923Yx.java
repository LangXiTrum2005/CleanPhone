package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2923Yx extends ContextWrapper {
    public static final C2378Dx k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4391qK f4048a;
    public final C4351pr b;
    public final C4710tz c;
    public final NN d;
    public final List e;
    public final Map f;
    public final C4439qr g;
    public final C3568gy h;
    public final int i;
    public ZY j;

    static {
        C2378Dx c2378Dx = new C2378Dx();
        c2378Dx.f2999a = G7.g;
        k = c2378Dx;
    }

    public C2923Yx(Context context, C4391qK c4391qK, C3877kY c3877kY, C4710tz c4710tz, NN nn, ArrayMap arrayMap, List list, C4439qr c4439qr, C3568gy c3568gy, int i) {
        super(context.getApplicationContext());
        this.f4048a = c4391qK;
        this.c = c4710tz;
        this.d = nn;
        this.e = list;
        this.f = arrayMap;
        this.g = c4439qr;
        this.h = c3568gy;
        this.i = i;
        this.b = new C4351pr(c3877kY);
    }

    public final synchronized ZY a() {
        try {
            if (this.j == null) {
                this.d.getClass();
                ZY zy = new ZY();
                zy.t = true;
                this.j = zy;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final C3789jY b() {
        return (C3789jY) this.b.get();
    }
}
