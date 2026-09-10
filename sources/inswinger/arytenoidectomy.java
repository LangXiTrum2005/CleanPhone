package inswinger;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class arytenoidectomy<V, O> implements kowloon<V, O> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<com.airbnb.lottie.value.attabal<V>> f28883attabal;

    public arytenoidectomy(List<com.airbnb.lottie.value.attabal<V>> list) {
        this.f28883attabal = list;
    }

    @Override // inswinger.kowloon
    public boolean apical() {
        return this.f28883attabal.isEmpty() || (this.f28883attabal.size() == 1 && this.f28883attabal.get(0).taiyuan());
    }

    @Override // inswinger.kowloon
    public List<com.airbnb.lottie.value.attabal<V>> saneness() {
        return this.f28883attabal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f28883attabal.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f28883attabal.toArray()));
        }
        return sb.toString();
    }
}
