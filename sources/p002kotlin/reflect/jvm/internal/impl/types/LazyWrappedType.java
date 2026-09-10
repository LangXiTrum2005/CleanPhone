package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import presbytery.competently;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyWrappedType extends coi {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final formularize f31667arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Function0<oilcan> f31668monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final impromptu<oilcan> f31669polloi;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(formularize storageManager, Function0<? extends oilcan> computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f31667arytenoidectomy = storageManager;
        this.f31668monoploid = computation;
        this.f31669polloi = storageManager.dern(computation);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.coi
    public oilcan lampshade() {
        return this.f31669polloi.invoke();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.coi
    public boolean libyan() {
        return this.f31669polloi.cutely();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    /* JADX INFO: renamed from: molet, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType libyan(final beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f31667arytenoidectomy, new Function0<oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final oilcan invoke() {
                return kotlinTypeRefiner.attabal((competently) this.f31668monoploid.invoke());
            }
        });
    }
}
