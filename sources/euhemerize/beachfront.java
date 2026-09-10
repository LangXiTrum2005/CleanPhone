package euhemerize;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import inswinger.kowloon;

/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon<PointF, PointF> f26094attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final inswinger.saneness f26095dern;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon<PointF, PointF> f26096saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f26097wireman;

    public beachfront(String str, kowloon<PointF, PointF> kowloonVar, kowloon<PointF, PointF> kowloonVar2, inswinger.saneness sanenessVar, boolean z) {
        this.name = str;
        this.f26094attabal = kowloonVar;
        this.f26096saneness = kowloonVar2;
        this.f26095dern = sanenessVar;
        this.f26097wireman = z;
    }

    @Override // euhemerize.dern
    public kinesic.dern attabal(LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar, com.airbnb.lottie.model.layer.attabal attabalVar) {
        return new kinesic.kowloon(lottieDrawable, attabalVar, this);
    }

    public boolean beachfront() {
        return this.f26097wireman;
    }

    public String dern() {
        return this.name;
    }

    public kowloon<PointF, PointF> marial() {
        return this.f26096saneness;
    }

    public inswinger.saneness saneness() {
        return this.f26095dern;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f26094attabal + ", size=" + this.f26096saneness + '}';
    }

    public kowloon<PointF, PointF> wireman() {
        return this.f26094attabal;
    }
}
