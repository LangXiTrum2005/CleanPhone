package euhemerize;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class apical implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<dern> f26091attabal;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f26092saneness;

    public apical(String str, List<dern> list, boolean z) {
        this.name = str;
        this.f26091attabal = list;
        this.f26092saneness = z;
    }

    @Override // euhemerize.dern
    public kinesic.dern attabal(LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar, com.airbnb.lottie.model.layer.attabal attabalVar) {
        return new kinesic.wireman(lottieDrawable, attabalVar, this, impromptuVar);
    }

    public String dern() {
        return this.name;
    }

    public List<dern> saneness() {
        return this.f26091attabal;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.name + "' Shapes: " + Arrays.toString(this.f26091attabal.toArray()) + '}';
    }

    public boolean wireman() {
        return this.f26092saneness;
    }
}
