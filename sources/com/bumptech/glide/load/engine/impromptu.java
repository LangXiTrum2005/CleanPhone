package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class impromptu<Z> implements endosteum.cutely<Z> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f17755adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f17756arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f17757graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final boolean f17758kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final maggot.saneness f17759molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final endosteum.cutely<Z> f17760monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final attabal f17761polloi;

    /* JADX INFO: compiled from: EngineResource.java */
    public interface attabal {
        void attabal(maggot.saneness sanenessVar, impromptu<?> impromptuVar);
    }

    public impromptu(endosteum.cutely<Z> cutelyVar, boolean z, boolean z2, maggot.saneness sanenessVar, attabal attabalVar) {
        this.f17760monoploid = (endosteum.cutely) com.bumptech.glide.util.apical.wireman(cutelyVar);
        this.f17758kowloon = z;
        this.f17756arytenoidectomy = z2;
        this.f17759molybdenite = sanenessVar;
        this.f17761polloi = (attabal) com.bumptech.glide.util.apical.wireman(attabalVar);
    }

    @Override // endosteum.cutely
    public synchronized void attabal() {
        if (this.f17757graveside > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f17755adultoid) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f17755adultoid = true;
        if (this.f17756arytenoidectomy) {
            this.f17760monoploid.attabal();
        }
    }

    public void beachfront() {
        boolean z;
        synchronized (this) {
            int i = this.f17757graveside;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f17757graveside = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f17761polloi.attabal(this.f17759molybdenite, this);
        }
    }

    public synchronized void dern() {
        if (this.f17755adultoid) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f17757graveside++;
    }

    @Override // endosteum.cutely
    public Z get() {
        return this.f17760monoploid.get();
    }

    @Override // endosteum.cutely
    public int getSize() {
        return this.f17760monoploid.getSize();
    }

    public boolean marial() {
        return this.f17758kowloon;
    }

    @Override // endosteum.cutely
    public Class<Z> saneness() {
        return this.f17760monoploid.saneness();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f17758kowloon + ", listener=" + this.f17761polloi + ", key=" + this.f17759molybdenite + ", acquired=" + this.f17757graveside + ", isRecycled=" + this.f17755adultoid + ", resource=" + this.f17760monoploid + '}';
    }

    public endosteum.cutely<Z> wireman() {
        return this.f17760monoploid;
    }
}
