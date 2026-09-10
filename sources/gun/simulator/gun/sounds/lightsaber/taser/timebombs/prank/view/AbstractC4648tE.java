package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.bytedance.sdk.component.utils.sLN;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4648tE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile No0 f5026a;
    public static volatile Vo0 b;
    public static volatile Context d;
    public static volatile boolean f;
    public static final boolean c = sLN.ZU();
    public static volatile boolean e = true;
    public static volatile int g = 0;
    public static volatile int h = 3;

    public static void a(No0 no0, Context context) {
        if (context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        d = context.getApplicationContext();
        if (f5026a != null) {
            return;
        }
        f5026a = no0;
        b = Vo0.b(context);
        No0 no1 = f5026a;
        no1.o.add(new C4385qE());
        C4963wo0 c4963wo0B = C4963wo0.b();
        c4963wo0B.e = no0;
        c4963wo0B.d = b;
        C4959wm0 c4959wm0C = C4959wm0.c();
        c4959wm0C.f = no0;
        c4959wm0C.e = b;
    }
}
