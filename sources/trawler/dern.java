package trawler;

import java.util.Queue;
import trawler.impassible;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dern<T extends impassible> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Queue<T> f38957attabal = com.bumptech.glide.util.formularize.competently(20);

    public abstract T attabal();

    public void dern(T t) {
        if (this.f38957attabal.size() < 20) {
            this.f38957attabal.offer(t);
        }
    }

    public T saneness() {
        T tPoll = this.f38957attabal.poll();
        return tPoll == null ? (T) attabal() : tPoll;
    }
}
