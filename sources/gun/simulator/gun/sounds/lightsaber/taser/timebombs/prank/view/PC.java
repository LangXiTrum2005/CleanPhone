package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PC implements Runnable {
    final /* synthetic */ QC this$0;
    private final ArrayList<View> visibleViews = new ArrayList<>();
    private final ArrayList<View> invisibleViews = new ArrayList<>();

    public PC(QC qc) {
        this.this$0 = qc;
    }

    @Override // java.lang.Runnable
    public void run() {
        NC impressionListener;
        NC impressionListener2;
        this.this$0.isVisibilityScheduled = false;
        for (Map.Entry entry : this.this$0.trackedViews.entrySet()) {
            View view = (View) entry.getKey();
            if (this.this$0.isVisible(view, ((OC) entry.getValue()).getMinViewablePercent())) {
                this.visibleViews.add(view);
            } else {
                this.invisibleViews.add(view);
            }
        }
        for (View view2 : this.visibleViews) {
            OC oc = (OC) this.this$0.trackedViews.get(view2);
            if (oc != null && (impressionListener2 = oc.getImpressionListener()) != null) {
                impressionListener2.onImpression(view2);
            }
            QC qc = this.this$0;
            AbstractC2995aW.p(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            qc.removeView(view2);
        }
        this.visibleViews.clear();
        for (View view3 : this.invisibleViews) {
            OC oc2 = (OC) this.this$0.trackedViews.get(view3);
            if (oc2 != null && (impressionListener = oc2.getImpressionListener()) != null) {
                impressionListener.onViewInvisible(view3);
            }
        }
        this.invisibleViews.clear();
        if (!(!this.this$0.trackedViews.isEmpty()) || this.this$0.setViewTreeObserverSucceed) {
            return;
        }
        this.this$0.scheduleVisibilityCheck();
    }
}
