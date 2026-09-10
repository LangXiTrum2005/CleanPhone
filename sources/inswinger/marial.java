package inswinger;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: AnimatablePathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class marial implements kowloon<PointF, PointF> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<com.airbnb.lottie.value.attabal<PointF>> f28893attabal;

    public marial(List<com.airbnb.lottie.value.attabal<PointF>> list) {
        this.f28893attabal = list;
    }

    @Override // inswinger.kowloon
    public boolean apical() {
        return this.f28893attabal.size() == 1 && this.f28893attabal.get(0).taiyuan();
    }

    @Override // inswinger.kowloon
    public redevelopment.attabal<PointF, PointF> attabal() {
        return this.f28893attabal.get(0).taiyuan() ? new redevelopment.apical(this.f28893attabal) : new redevelopment.cutely(this.f28893attabal);
    }

    @Override // inswinger.kowloon
    public List<com.airbnb.lottie.value.attabal<PointF>> saneness() {
        return this.f28893attabal;
    }
}
