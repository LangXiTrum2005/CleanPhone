package technofreak;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3700q2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltechnofreak/impromptu;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ltechnofreak/competently;", "", "maxPoolSize", "<init>", "(I)V", "saneness", "()Ljava/lang/Object;", C3700q2.p, "", "attabal", "(Ljava/lang/Object;)Z", "dern", "", "[Ljava/lang/Object;", "pool", "I", "poolSize", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class impromptu<T> implements competently<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object[] pool;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int poolSize;

    public impromptu(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i];
    }

    @Override // technofreak.competently
    public boolean attabal(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (dern(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.poolSize;
        Object[] objArr = this.pool;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.poolSize = i + 1;
        return true;
    }

    public final boolean dern(T instance) {
        int i = this.poolSize;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.pool[i2] == instance) {
                return true;
            }
        }
        return false;
    }

    @Override // technofreak.competently
    public T saneness() {
        int i = this.poolSize;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = (T) this.pool[i2];
        Intrinsics.competently(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.pool[i2] = null;
        this.poolSize--;
        return t;
    }
}
