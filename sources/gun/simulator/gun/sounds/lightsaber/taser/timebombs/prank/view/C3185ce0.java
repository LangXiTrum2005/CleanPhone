package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.ShortArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3185ce0 extends Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4233a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3185ce0(Object obj, int i) {
        this.f4233a = i;
        this.b = obj;
    }

    @Override // com.badlogic.gdx.utils.Pool
    public final Object newObject() {
        switch (this.f4233a) {
            case 0:
                return new FloatArray(16);
            case 1:
                return new ShortArray(16);
            default:
                return new C3755j5();
        }
    }
}
