package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class monoploid extends arytenoidectomy {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f31791arytenoidectomy;

    public monoploid(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f31791arytenoidectomy = delegate;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    public merc immediately() {
        return this.f31791arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        return z == mastfed() ? this : immediately().lampshade(z).deadwork(vesuvio());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != vesuvio() ? new seminary(this, newAttributes) : this;
    }
}
