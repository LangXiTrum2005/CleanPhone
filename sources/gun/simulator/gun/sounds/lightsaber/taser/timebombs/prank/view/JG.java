package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3259a;
    public String b;
    public Yo0 c;
    public BF d;
    public Vo0 e;
    public List f;
    public int g;
    public C4568sM h;
    public GG i;
    public Object j;

    public final UG a() {
        if (this.d == null || this.e == null || TextUtils.isEmpty(this.f3259a) || TextUtils.isEmpty(this.b) || this.c == null) {
            throw new IllegalArgumentException();
        }
        return new UG(this);
    }
}
