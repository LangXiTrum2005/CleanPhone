package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4174nq extends AbstractC4923wP {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4174nq(B30 b30) {
        super(b30);
        AbstractC2995aW.q(b30, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l) {
        this.valueFirst = l;
    }

    public final void setValueSecond(Long l) {
        this.valueSecond = l;
    }
}
