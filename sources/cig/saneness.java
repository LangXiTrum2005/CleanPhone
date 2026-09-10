package cig;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcig/saneness;", "Lcig/attabal;", "", "Lcig/attabal$dern;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Lcig/attabal;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, X3.i.W, "t", "", "dern", "(Lcig/attabal$dern;Ljava/lang/Object;)V", "attabal", "(Lcig/attabal$dern;)Ljava/lang/Object;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness extends CreationExtras {
    public saneness() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // cig.CreationExtras
    public <T> T attabal(CreationExtras.dern<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) saneness().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void dern(CreationExtras.dern<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        saneness().put(key, t);
    }

    public saneness(Map<CreationExtras.dern<?>, ? extends Object> initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        saneness().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public saneness(CreationExtras initialExtras) {
        this((Map<CreationExtras.dern<?>, ? extends Object>) initialExtras.saneness());
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
    }

    public /* synthetic */ saneness(CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreationExtras.saneness.f15611dern : creationExtras);
    }
}
