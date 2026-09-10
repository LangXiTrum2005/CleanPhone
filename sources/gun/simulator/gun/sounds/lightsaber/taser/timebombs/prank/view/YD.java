package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class YD extends Ei0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YD(EnumC4719u30 enumC4719u30, String str) {
        super(enumC4719u30, str, null);
        AbstractC2995aW.q(enumC4719u30, "loggableReason");
        AbstractC2995aW.q(str, "errorMessage");
    }

    public /* synthetic */ YD(EnumC4719u30 enumC4719u30, String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this(enumC4719u30, (i & 2) != 0 ? "Ad state is invalid" : str);
    }
}
