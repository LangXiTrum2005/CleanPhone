package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class Filters implements IFilter {
    public static final IFilter NONE = new Filters(new IFilter[0]);
    private final IFilter[] filters;

    private Filters(IFilter... iFilterArr) {
        this.filters = iFilterArr;
    }

    public static IFilter all() {
        return new Filters(new EnumFilter(), new SyntheticFilter(), new BridgeFilter(), new SynchronizedFilter(), new TryWithResourcesJavac11Filter(), new TryWithResourcesJavacFilter(), new TryWithResourcesEcjFilter(), new FinallyFilter(), new PrivateEmptyNoArgConstructorFilter(), new AssertFilter(), new StringSwitchJavacFilter(), new StringSwitchFilter(), new EnumEmptyConstructorFilter(), new RecordsFilter(), new AnnotationGeneratedFilter(), new KotlinGeneratedFilter(), new KotlinLateinitFilter(), new KotlinWhenFilter(), new KotlinWhenStringFilter(), new KotlinUnsafeCastOperatorFilter(), new KotlinNotNullOperatorFilter(), new KotlinDefaultArgumentsFilter(), new KotlinInlineFilter(), new KotlinCoroutineFilter(), new KotlinDefaultMethodsFilter());
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        for (IFilter iFilter : this.filters) {
            iFilter.filter(methodNode, iFilterContext, iFilterOutput);
        }
    }
}
