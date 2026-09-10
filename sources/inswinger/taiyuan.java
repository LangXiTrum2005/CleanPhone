package inswinger;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan implements kowloon<PointF, PointF> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f28894attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f28895saneness;

    public taiyuan(saneness sanenessVar, saneness sanenessVar2) {
        this.f28894attabal = sanenessVar;
        this.f28895saneness = sanenessVar2;
    }

    @Override // inswinger.kowloon
    public boolean apical() {
        return this.f28894attabal.apical() && this.f28895saneness.apical();
    }

    @Override // inswinger.kowloon
    public redevelopment.attabal<PointF, PointF> attabal() {
        return new redevelopment.triweekly(this.f28894attabal.attabal(), this.f28895saneness.attabal());
    }

    @Override // inswinger.kowloon
    public List<com.airbnb.lottie.value.attabal<PointF>> saneness() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
