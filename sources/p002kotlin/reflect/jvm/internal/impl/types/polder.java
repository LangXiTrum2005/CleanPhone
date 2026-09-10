package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import prescient.impromptu;
import prescient.wireman;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class polder extends merc {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final permissivist f31800arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final Function1<beachfront, merc> f31801graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final MemberScope f31802molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final List<timberyard> f31803monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f31804polloi;

    /* JADX WARN: Multi-variable type inference failed */
    public polder(permissivist constructor, List<? extends timberyard> arguments, boolean z, MemberScope memberScope, Function1<? super beachfront, ? extends merc> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f31800arytenoidectomy = constructor;
        this.f31803monoploid = arguments;
        this.f31804polloi = z;
        this.f31802molybdenite = memberScope;
        this.f31801graveside = refinedTypeFactory;
        if (!(formularize() instanceof wireman) || (formularize() instanceof impromptu)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + formularize() + '\n' + setterwort());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public List<timberyard> dhss() {
        return this.f31803monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public MemberScope formularize() {
        return this.f31802molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: immediately, reason: merged with bridge method [inline-methods] */
    public merc libyan(beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        merc mercVarInvoke = this.f31801graveside.invoke(kotlinTypeRefiner);
        return mercVarInvoke == null ? this : mercVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return this.f31804polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        if (z == mastfed()) {
            return this;
        }
        return z ? new supplicat(this) : new sealless(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new seminary(this, newAttributes);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public permissivist setterwort() {
        return this.f31800arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public overspeculate vesuvio() {
        return overspeculate.f31797arytenoidectomy.taiyuan();
    }
}
