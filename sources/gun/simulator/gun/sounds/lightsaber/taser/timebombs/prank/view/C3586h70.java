package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3586h70 extends AbstractC4923wP {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3586h70(B30 b30) {
        super(b30);
        AbstractC2995aW.q(b30, "metricType");
    }

    public final void addValue(long j) {
        Long l = this.value;
        this.value = Long.valueOf((l != null ? l.longValue() : 0L) + j);
    }

    /* JADX INFO: renamed from: getValue, reason: collision with other method in class */
    public final Long m245getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4923wP
    public long getValue() {
        Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
