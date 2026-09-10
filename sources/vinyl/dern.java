package vinyl;

import kotlinx.serialization.SerializationException;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "subClassName", "Lkurbash/wireman;", "baseClass", "", "attabal", "(Ljava/lang/String;Lkurbash/wireman;)Ljava/lang/Void;", "subClass", "saneness", "(Lkurbash/wireman;Lkurbash/wireman;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class dern {
    public static final Void attabal(String str, kurbash.wireman<?> baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.taiyuan() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.taiyuan() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void saneness(kurbash.wireman<?> subClass, kurbash.wireman<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String strTaiyuan = subClass.taiyuan();
        if (strTaiyuan == null) {
            strTaiyuan = String.valueOf(subClass);
        }
        attabal(strTaiyuan, baseClass);
        throw new KotlinNothingValueException();
    }
}
