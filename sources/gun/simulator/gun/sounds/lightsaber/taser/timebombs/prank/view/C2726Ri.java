package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2726Ri {
    public static final HashMap c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3673a;
    public final String b;

    public C2726Ri(Context context, String str) {
        this.f3673a = context;
        this.b = str;
    }

    public final synchronized void a() {
        this.f3673a.deleteFile(this.b);
    }
}
