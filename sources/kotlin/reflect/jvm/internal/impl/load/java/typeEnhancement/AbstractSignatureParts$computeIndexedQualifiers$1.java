package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
    public final /* synthetic */ TypeEnhancementInfo X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ JavaTypeQualifiers[] f43915Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        super(1);
        this.X = typeEnhancementInfo;
        this.f43915Y = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaTypeQualifiers javaTypeQualifiers;
        int iIntValue = ((Number) obj).intValue();
        TypeEnhancementInfo typeEnhancementInfo = this.X;
        if (typeEnhancementInfo != null && (javaTypeQualifiers = (JavaTypeQualifiers) typeEnhancementInfo.f43956a.get(Integer.valueOf(iIntValue))) != null) {
            return javaTypeQualifiers;
        }
        if (iIntValue >= 0) {
            JavaTypeQualifiers[] javaTypeQualifiersArr = this.f43915Y;
            if (iIntValue <= javaTypeQualifiersArr.length - 1) {
                return javaTypeQualifiersArr[iIntValue];
            }
        }
        return JavaTypeQualifiers.f43924e;
    }
}
