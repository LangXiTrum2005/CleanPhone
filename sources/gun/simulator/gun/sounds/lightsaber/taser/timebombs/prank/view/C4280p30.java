package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.GeneratedMessageLite;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4280p30 extends GeneratedMessageLite.Builder implements InterfaceC4368q30 {
    public /* synthetic */ C4280p30(com.vungle.ads.internal.protos.a aVar) {
        this();
    }

    public C4280p30 addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).addAllMetrics(iterable);
        return this;
    }

    public C4280p30 addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).addMetrics(sdk$SDKMetric);
        return this;
    }

    public C4280p30 clearMetrics() {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).clearMetrics();
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4368q30
    public Sdk$SDKMetric getMetrics(int i) {
        return ((Sdk$MetricBatch) this.instance).getMetrics(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4368q30
    public int getMetricsCount() {
        return ((Sdk$MetricBatch) this.instance).getMetricsCount();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4368q30
    public List<Sdk$SDKMetric> getMetricsList() {
        return Collections.unmodifiableList(((Sdk$MetricBatch) this.instance).getMetricsList());
    }

    public C4280p30 removeMetrics(int i) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).removeMetrics(i);
        return this;
    }

    public C4280p30 setMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).setMetrics(i, sdk$SDKMetric);
        return this;
    }

    private C4280p30() {
        super(Sdk$MetricBatch.DEFAULT_INSTANCE);
    }

    public C4280p30 addMetrics(int i, Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).addMetrics(i, sdk$SDKMetric);
        return this;
    }

    public C4280p30 setMetrics(int i, C5071y30 c5071y30) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).setMetrics(i, (Sdk$SDKMetric) c5071y30.build());
        return this;
    }

    public C4280p30 addMetrics(C5071y30 c5071y30) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).addMetrics((Sdk$SDKMetric) c5071y30.build());
        return this;
    }

    public C4280p30 addMetrics(int i, C5071y30 c5071y30) {
        copyOnWrite();
        ((Sdk$MetricBatch) this.instance).addMetrics(i, (Sdk$SDKMetric) c5071y30.build());
        return this;
    }
}
