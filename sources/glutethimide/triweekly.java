package glutethimide;

import java.util.Queue;

/* JADX INFO: compiled from: ModelCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class triweekly<A, B> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.bumptech.glide.util.impromptu<saneness<A>, B> f27296attabal;

    /* JADX INFO: compiled from: ModelCache.java */
    public class attabal extends com.bumptech.glide.util.impromptu<saneness<A>, B> {
        public attabal(long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.impromptu
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public void cutely(saneness<A> sanenessVar, B b) {
            sanenessVar.dern();
        }
    }

    /* JADX INFO: compiled from: ModelCache.java */
    public static final class saneness<A> {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final Queue<saneness<?>> f27298wireman = com.bumptech.glide.util.formularize.competently(0);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f27299attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public A f27300dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f27301saneness;

        public static <A> saneness<A> attabal(A a, int i, int i2) {
            saneness<A> sanenessVar;
            Queue<saneness<?>> queue = f27298wireman;
            synchronized (queue) {
                sanenessVar = (saneness) queue.poll();
            }
            if (sanenessVar == null) {
                sanenessVar = new saneness<>();
            }
            sanenessVar.saneness(a, i, i2);
            return sanenessVar;
        }

        public void dern() {
            Queue<saneness<?>> queue = f27298wireman;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof saneness) {
                saneness sanenessVar = (saneness) obj;
                if (this.f27301saneness == sanenessVar.f27301saneness && this.f27299attabal == sanenessVar.f27299attabal && this.f27300dern.equals(sanenessVar.f27300dern)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f27299attabal * 31) + this.f27301saneness) * 31) + this.f27300dern.hashCode();
        }

        public final void saneness(A a, int i, int i2) {
            this.f27300dern = a;
            this.f27301saneness = i;
            this.f27299attabal = i2;
        }
    }

    public triweekly(long j) {
        this.f27296attabal = new attabal(j);
    }

    public B attabal(A a, int i, int i2) {
        saneness<A> sanenessVarAttabal = saneness.attabal(a, i, i2);
        B bCompetently = this.f27296attabal.competently(sanenessVarAttabal);
        sanenessVarAttabal.dern();
        return bCompetently;
    }

    public void saneness(A a, int i, int i2, B b) {
        this.f27296attabal.apical(saneness.attabal(a, i, i2), b);
    }
}
