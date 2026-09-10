package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.kattegat;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends arytenoidectomy implements kattegat {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f30650arytenoidectomy;

    public marial(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f30650arytenoidectomy = delegate;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    public merc immediately() {
        return this.f30650arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public oilcan itchy(oilcan replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        empress empressVarHomozygous = replacement.homozygous();
        if (!TypeUtilsKt.graveside(empressVarHomozygous) && !nosophobia.formularize(empressVarHomozygous)) {
            return empressVarHomozygous;
        }
        if (empressVarHomozygous instanceof merc) {
            return prefect((merc) empressVarHomozygous);
        }
        if (empressVarHomozygous instanceof preprohormone) {
            preprohormone preprohormoneVar = (preprohormone) empressVarHomozygous;
            return sayid.wireman(KotlinTypeFactory.wireman(prefect(preprohormoneVar.sakeen()), prefect(preprohormoneVar.immediately())), sayid.attabal(empressVarHomozygous));
        }
        throw new IllegalStateException(("Incorrect type: " + empressVarHomozygous).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    /* JADX INFO: renamed from: licking, reason: merged with bridge method [inline-methods] */
    public marial tectonization(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new marial(delegate);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy, p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        return z ? immediately().lampshade(true) : this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public marial deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new marial(immediately().deadwork(newAttributes));
    }

    public final merc prefect(merc mercVar) {
        merc mercVarLampshade = mercVar.lampshade(false);
        return !TypeUtilsKt.graveside(mercVar) ? mercVarLampshade : new marial(mercVarLampshade);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public boolean unconsolidated() {
        return true;
    }
}
