package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U40 {
    private final boolean isSingleton;
    final /* synthetic */ C3756j50 this$0;

    public /* synthetic */ U40(C3756j50 c3756j50, boolean z, int i, AbstractC2471Hm abstractC2471Hm) {
        this(c3756j50, (i & 1) != 0 ? true : z);
    }

    public abstract Object create();

    public final boolean isSingleton() {
        return this.isSingleton;
    }

    public U40(C3756j50 c3756j50, boolean z) {
        this.this$0 = c3756j50;
        this.isSingleton = z;
    }
}
