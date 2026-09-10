package lamplit;

import androidx.collection.preprohormone;

/* JADX INFO: compiled from: LottieCompositionCache.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final beachfront f32577saneness = new beachfront();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final preprohormone<String, com.airbnb.lottie.impromptu> f32578attabal = new preprohormone<>(20);

    public static beachfront saneness() {
        return f32577saneness;
    }

    public com.airbnb.lottie.impromptu attabal(String str) {
        if (str == null) {
            return null;
        }
        return this.f32578attabal.get(str);
    }

    public void dern(String str, com.airbnb.lottie.impromptu impromptuVar) {
        if (str == null) {
            return;
        }
        this.f32578attabal.put(str, impromptuVar);
    }
}
