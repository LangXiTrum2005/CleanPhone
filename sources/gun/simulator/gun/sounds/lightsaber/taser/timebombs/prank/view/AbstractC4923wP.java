package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4923wP {
    private String meta;
    private B30 metricType;

    public AbstractC4923wP(B30 b30) {
        AbstractC2995aW.q(b30, "metricType");
        this.metricType = b30;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final B30 getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(B30 b30) {
        AbstractC2995aW.q(b30, "<set-?>");
        this.metricType = b30;
    }
}
