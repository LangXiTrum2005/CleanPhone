package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/ObservedTableVersions;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObservedTableVersions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f8208a;

    public ObservedTableVersions(int i2) {
        this.f8208a = StateFlowKt.a(new int[i2]);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Set tableIds) {
        Object value;
        int[] iArr;
        Intrinsics.f(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.f8208a;
        do {
            value = mutableStateFlow.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = tableIds.contains(Integer.valueOf(i2)) ? iArr2[i2] + 1 : iArr2[i2];
            }
        } while (!mutableStateFlow.compareAndSet(value, iArr));
    }
}
