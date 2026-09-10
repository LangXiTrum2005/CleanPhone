package tympanoplasty;

import com.bumptech.glide.util.cutely;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ModelToResourceClassCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicReference<cutely> f39059attabal = new AtomicReference<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.collection.attabal<cutely, List<Class<?>>> f39060saneness = new androidx.collection.attabal<>();

    public List<Class<?>> attabal(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        cutely andSet = this.f39059attabal.getAndSet(null);
        if (andSet == null) {
            andSet = new cutely(cls, cls2, cls3);
        } else {
            andSet.attabal(cls, cls2, cls3);
        }
        synchronized (this.f39060saneness) {
            list = this.f39060saneness.get(andSet);
        }
        this.f39059attabal.set(andSet);
        return list;
    }

    public void saneness(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f39060saneness) {
            this.f39060saneness.put(new cutely(cls, cls2, cls3), list);
        }
    }
}
