package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5115yc0 extends AbstractC4174nq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5115yc0(B30 b30) {
        super(b30);
        AbstractC2995aW.q(b30, "metricType");
    }

    private final long calculateIntervalDuration() {
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        long jLongValue = valueSecond != null ? valueSecond.longValue() : currentTime;
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return jLongValue - currentTime;
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4923wP
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
