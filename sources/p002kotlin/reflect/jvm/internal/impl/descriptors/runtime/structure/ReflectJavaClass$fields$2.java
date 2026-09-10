package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements Function1<Field, arytenoidectomy> {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "<init>";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(arytenoidectomy.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final arytenoidectomy invoke(Field p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new arytenoidectomy(p0);
    }
}
