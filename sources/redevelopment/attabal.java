package redevelopment;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal<K, A> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman<K> f36089dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public com.airbnb.lottie.value.dern<A> f36091marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<saneness> f36086attabal = new ArrayList(1);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f36092saneness = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float f36093wireman = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public A f36087beachfront = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f36088competently = -1.0f;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f36090impromptu = -1.0f;

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class beachfront<T> implements wireman<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final com.airbnb.lottie.value.attabal<T> f36094attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f36095saneness = -1.0f;

        public beachfront(List<? extends com.airbnb.lottie.value.attabal<T>> list) {
            this.f36094attabal = list.get(0);
        }

        @Override // redevelopment.attabal.wireman
        public boolean attabal(float f) {
            if (this.f36095saneness == f) {
                return true;
            }
            this.f36095saneness = f;
            return false;
        }

        @Override // redevelopment.attabal.wireman
        public boolean dern(float f) {
            return !this.f36094attabal.taiyuan();
        }

        @Override // redevelopment.attabal.wireman
        public boolean isEmpty() {
            return false;
        }

        @Override // redevelopment.attabal.wireman
        public float marial() {
            return this.f36094attabal.dern();
        }

        @Override // redevelopment.attabal.wireman
        public com.airbnb.lottie.value.attabal<T> saneness() {
            return this.f36094attabal;
        }

        @Override // redevelopment.attabal.wireman
        public float wireman() {
            return this.f36094attabal.beachfront();
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class dern<T> implements wireman<T> {
        public dern() {
        }

        @Override // redevelopment.attabal.wireman
        public boolean attabal(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // redevelopment.attabal.wireman
        public boolean dern(float f) {
            return false;
        }

        @Override // redevelopment.attabal.wireman
        public boolean isEmpty() {
            return true;
        }

        @Override // redevelopment.attabal.wireman
        public float marial() {
            return 1.0f;
        }

        @Override // redevelopment.attabal.wireman
        public com.airbnb.lottie.value.attabal<T> saneness() {
            throw new IllegalStateException("not implemented");
        }

        @Override // redevelopment.attabal.wireman
        public float wireman() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class marial<T> implements wireman<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<? extends com.airbnb.lottie.value.attabal<T>> f36096attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public com.airbnb.lottie.value.attabal<T> f36097dern = null;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f36099wireman = -1.0f;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public com.airbnb.lottie.value.attabal<T> f36098saneness = beachfront(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        public marial(List<? extends com.airbnb.lottie.value.attabal<T>> list) {
            this.f36096attabal = list;
        }

        @Override // redevelopment.attabal.wireman
        public boolean attabal(float f) {
            com.airbnb.lottie.value.attabal<T> attabalVar = this.f36097dern;
            com.airbnb.lottie.value.attabal<T> attabalVar2 = this.f36098saneness;
            if (attabalVar == attabalVar2 && this.f36099wireman == f) {
                return true;
            }
            this.f36097dern = attabalVar2;
            this.f36099wireman = f;
            return false;
        }

        public final com.airbnb.lottie.value.attabal<T> beachfront(float f) {
            List<? extends com.airbnb.lottie.value.attabal<T>> list = this.f36096attabal;
            com.airbnb.lottie.value.attabal<T> attabalVar = list.get(list.size() - 1);
            if (f >= attabalVar.beachfront()) {
                return attabalVar;
            }
            for (int size = this.f36096attabal.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.attabal<T> attabalVar2 = this.f36096attabal.get(size);
                if (this.f36098saneness != attabalVar2 && attabalVar2.attabal(f)) {
                    return attabalVar2;
                }
            }
            return this.f36096attabal.get(0);
        }

        @Override // redevelopment.attabal.wireman
        public boolean dern(float f) {
            if (this.f36098saneness.attabal(f)) {
                return !this.f36098saneness.taiyuan();
            }
            this.f36098saneness = beachfront(f);
            return true;
        }

        @Override // redevelopment.attabal.wireman
        public boolean isEmpty() {
            return false;
        }

        @Override // redevelopment.attabal.wireman
        public float marial() {
            List<? extends com.airbnb.lottie.value.attabal<T>> list = this.f36096attabal;
            return list.get(list.size() - 1).dern();
        }

        @Override // redevelopment.attabal.wireman
        public com.airbnb.lottie.value.attabal<T> saneness() {
            return this.f36098saneness;
        }

        @Override // redevelopment.attabal.wireman
        public float wireman() {
            return this.f36096attabal.get(0).beachfront();
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface saneness {
        void attabal();
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface wireman<T> {
        boolean attabal(float f);

        boolean dern(float f);

        boolean isEmpty();

        float marial();

        com.airbnb.lottie.value.attabal<T> saneness();

        float wireman();
    }

    public attabal(List<? extends com.airbnb.lottie.value.attabal<K>> list) {
        this.f36089dern = monoploid(list);
    }

    public static <T> wireman<T> monoploid(List<? extends com.airbnb.lottie.value.attabal<T>> list) {
        if (list.isEmpty()) {
            return new dern();
        }
        return list.size() == 1 ? new beachfront(list) : new marial(list);
    }

    public boolean apical() {
        return this.f36091marial != null;
    }

    public boolean arytenoidectomy() {
        return false;
    }

    public void attabal(saneness sanenessVar) {
        this.f36086attabal.add(sanenessVar);
    }

    public float beachfront() {
        return this.f36093wireman;
    }

    public final float competently() {
        if (this.f36088competently == -1.0f) {
            this.f36088competently = this.f36089dern.wireman();
        }
        return this.f36088competently;
    }

    public A cutely(com.airbnb.lottie.value.attabal<K> attabalVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public float dern() {
        if (this.f36090impromptu == -1.0f) {
            this.f36090impromptu = this.f36089dern.marial();
        }
        return this.f36090impromptu;
    }

    public void formularize() {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.f36086attabal.size(); i++) {
            this.f36086attabal.get(i).attabal();
        }
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void impassible() {
        this.f36092saneness = true;
    }

    public A impromptu() {
        float fMarial = marial();
        if (this.f36091marial == null && this.f36089dern.attabal(fMarial) && !arytenoidectomy()) {
            return this.f36087beachfront;
        }
        com.airbnb.lottie.value.attabal<K> attabalVarSaneness = saneness();
        Interpolator interpolator = attabalVarSaneness.f16255marial;
        A aTaiyuan = (interpolator == null || attabalVarSaneness.f16247beachfront == null) ? taiyuan(attabalVarSaneness, wireman()) : cutely(attabalVarSaneness, fMarial, interpolator.getInterpolation(fMarial), attabalVarSaneness.f16247beachfront.getInterpolation(fMarial));
        this.f36087beachfront = aTaiyuan;
        return aTaiyuan;
    }

    public void kowloon(com.airbnb.lottie.value.dern<A> dernVar) {
        com.airbnb.lottie.value.dern<A> dernVar2 = this.f36091marial;
        if (dernVar2 != null) {
            dernVar2.dern(null);
        }
        this.f36091marial = dernVar;
        if (dernVar != null) {
            dernVar.dern(this);
        }
    }

    public float marial() {
        if (this.f36092saneness) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.airbnb.lottie.value.attabal<K> attabalVarSaneness = saneness();
        return attabalVarSaneness.taiyuan() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.f36093wireman - attabalVarSaneness.beachfront()) / (attabalVarSaneness.dern() - attabalVarSaneness.beachfront());
    }

    public com.airbnb.lottie.value.attabal<K> saneness() {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        com.airbnb.lottie.value.attabal<K> attabalVarSaneness = this.f36089dern.saneness();
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.dern("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return attabalVarSaneness;
    }

    public abstract A taiyuan(com.airbnb.lottie.value.attabal<K> attabalVar, float f);

    public void triweekly(float f) {
        if (com.airbnb.lottie.wireman.impromptu()) {
            com.airbnb.lottie.wireman.saneness("BaseKeyframeAnimation#setProgress");
        }
        if (this.f36089dern.isEmpty()) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f < competently()) {
            f = competently();
        } else if (f > dern()) {
            f = dern();
        }
        if (f == this.f36093wireman) {
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f36093wireman = f;
            if (this.f36089dern.dern(f)) {
                formularize();
            }
            if (com.airbnb.lottie.wireman.impromptu()) {
                com.airbnb.lottie.wireman.dern("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public float wireman() {
        Interpolator interpolator;
        com.airbnb.lottie.value.attabal<K> attabalVarSaneness = saneness();
        return (attabalVarSaneness == null || attabalVarSaneness.taiyuan() || (interpolator = attabalVarSaneness.f16259wireman) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : interpolator.getInterpolation(marial());
    }
}
