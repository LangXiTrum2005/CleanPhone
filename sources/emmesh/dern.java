package emmesh;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kurbash.arytenoidectomy;
import kurbash.formularize;
import kurbash.impromptu;
import kurbash.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.TypesJVMKt;
import p002kotlin.reflect.jvm.internal.KCallableImpl;
import p002kotlin.reflect.jvm.internal.KPropertyImpl;
import p002kotlin.reflect.jvm.internal.KTypeImpl;
import p002kotlin.reflect.jvm.internal.molybdenite;

/* JADX INFO: compiled from: ReflectJvmMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkurbash/formularize;", "Ljava/lang/reflect/Field;", "saneness", "(Lkurbash/formularize;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "dern", "(Lkurbash/formularize;)Ljava/lang/reflect/Method;", "javaGetter", "Lkurbash/taiyuan;", "marial", "(Lkurbash/taiyuan;)Ljava/lang/reflect/Method;", "javaSetter", "Lkurbash/impromptu;", "wireman", "(Lkurbash/impromptu;)Ljava/lang/reflect/Method;", "javaMethod", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/reflect/Constructor;", "attabal", "(Lkurbash/impromptu;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkurbash/impromptu;)V", "javaConstructor", "Lkurbash/arytenoidectomy;", "Ljava/lang/reflect/Type;", "beachfront", "(Lkurbash/arytenoidectomy;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class dern {
    public static final <T> Constructor<T> attabal(impromptu<? extends T> impromptuVar) {
        p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarDovishness;
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        KCallableImpl<?> kCallableImplSaneness = molybdenite.saneness(impromptuVar);
        Member memberSaneness = (kCallableImplSaneness == null || (dernVarDovishness = kCallableImplSaneness.dovishness()) == null) ? null : dernVarDovishness.saneness();
        if (memberSaneness instanceof Constructor) {
            return (Constructor) memberSaneness;
        }
        return null;
    }

    public static final Type beachfront(arytenoidectomy arytenoidectomyVar) {
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        Type typeMarial = ((KTypeImpl) arytenoidectomyVar).marial();
        return typeMarial == null ? TypesJVMKt.competently(arytenoidectomyVar) : typeMarial;
    }

    public static final Method dern(formularize<?> formularizeVar) {
        Intrinsics.checkNotNullParameter(formularizeVar, "<this>");
        return wireman(formularizeVar.getGetter());
    }

    public static final Method marial(taiyuan<?> taiyuanVar) {
        Intrinsics.checkNotNullParameter(taiyuanVar, "<this>");
        return wireman(taiyuanVar.getSetter());
    }

    public static final Field saneness(formularize<?> formularizeVar) {
        Intrinsics.checkNotNullParameter(formularizeVar, "<this>");
        KPropertyImpl<?> kPropertyImplWireman = molybdenite.wireman(formularizeVar);
        if (kPropertyImplWireman != null) {
            return kPropertyImplWireman.supplicat();
        }
        return null;
    }

    public static final Method wireman(impromptu<?> impromptuVar) {
        p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarDovishness;
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        KCallableImpl<?> kCallableImplSaneness = molybdenite.saneness(impromptuVar);
        Member memberSaneness = (kCallableImplSaneness == null || (dernVarDovishness = kCallableImplSaneness.dovishness()) == null) ? null : dernVarDovishness.saneness();
        if (memberSaneness instanceof Method) {
            return (Method) memberSaneness;
        }
        return null;
    }
}
