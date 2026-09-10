package tympanoplasty;

import com.bumptech.glide.load.engine.taiyuan;
import com.bumptech.glide.util.cutely;
import environ.competently;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: LoadPathCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final taiyuan<?, ?, ?> f39050dern = new taiyuan<>(Object.class, Object.class, Object.class, Collections.singletonList(new com.bumptech.glide.load.engine.marial(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new competently(), null)), null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.collection.attabal<cutely, taiyuan<?, ?, ?>> f39051attabal = new androidx.collection.attabal<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicReference<cutely> f39052saneness = new AtomicReference<>();

    public <Data, TResource, Transcode> taiyuan<Data, TResource, Transcode> attabal(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        taiyuan<Data, TResource, Transcode> taiyuanVar;
        cutely cutelyVarSaneness = saneness(cls, cls2, cls3);
        synchronized (this.f39051attabal) {
            taiyuanVar = (taiyuan) this.f39051attabal.get(cutelyVarSaneness);
        }
        this.f39052saneness.set(cutelyVarSaneness);
        return taiyuanVar;
    }

    public boolean dern(taiyuan<?, ?, ?> taiyuanVar) {
        return f39050dern.equals(taiyuanVar);
    }

    public final cutely saneness(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        cutely andSet = this.f39052saneness.getAndSet(null);
        if (andSet == null) {
            andSet = new cutely();
        }
        andSet.attabal(cls, cls2, cls3);
        return andSet;
    }

    public void wireman(Class<?> cls, Class<?> cls2, Class<?> cls3, taiyuan<?, ?, ?> taiyuanVar) {
        synchronized (this.f39051attabal) {
            androidx.collection.attabal<cutely, taiyuan<?, ?, ?>> attabalVar = this.f39051attabal;
            cutely cutelyVar = new cutely(cls, cls2, cls3);
            if (taiyuanVar == null) {
                taiyuanVar = f39050dern;
            }
            attabalVar.put(cutelyVar, taiyuanVar);
        }
    }
}
