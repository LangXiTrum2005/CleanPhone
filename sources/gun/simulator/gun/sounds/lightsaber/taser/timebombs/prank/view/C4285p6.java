package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4285p6 extends Ei0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4285p6(String str, Integer num, String str2) {
        super(EnumC4719u30.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + str + ", Error code:" + num + ", Error message: " + str2, null);
        AbstractC2995aW.q(str, "url");
    }

    public /* synthetic */ C4285p6(String str, Integer num, String str2, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
