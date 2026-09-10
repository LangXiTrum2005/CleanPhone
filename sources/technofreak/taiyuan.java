package technofreak;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3700q2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltechnofreak/taiyuan;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ltechnofreak/impromptu;", "", "maxPoolSize", "<init>", "(I)V", "saneness", "()Ljava/lang/Object;", C3700q2.p, "", "attabal", "(Ljava/lang/Object;)Z", "dern", "Ljava/lang/Object;", "lock", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class taiyuan<T> extends impromptu<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Object lock;

    public taiyuan(int i) {
        super(i);
        this.lock = new Object();
    }

    @Override // technofreak.impromptu, technofreak.competently
    public boolean attabal(T instance) {
        boolean zAttabal;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.lock) {
            zAttabal = super.attabal(instance);
        }
        return zAttabal;
    }

    @Override // technofreak.impromptu, technofreak.competently
    public T saneness() {
        T t;
        synchronized (this.lock) {
            t = (T) super.saneness();
        }
        return t;
    }
}
