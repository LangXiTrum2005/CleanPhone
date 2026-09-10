package vinyl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, d2 = {"Lbristol/beachfront;", "", "", "attabal", "(Lbristol/beachfront;)Ljava/util/Set;", "", "", "saneness", "(Ljava/util/List;)[Lbristol/beachfront;", "Lkurbash/wireman;", "", "beachfront", "(Lkurbash/wireman;)Ljava/lang/Void;", "marial", "(Lkurbash/wireman;)Ljava/lang/String;", "className", "wireman", "(Ljava/lang/String;)Ljava/lang/String;", "Lkurbash/arytenoidectomy;", "", "dern", "(Lkurbash/arytenoidectomy;)Lkurbash/wireman;", "Lkotlin/reflect/KTypeProjection;", "competently", "(Lkotlin/reflect/KTypeProjection;)Lkurbash/arytenoidectomy;", "[Lbristol/beachfront;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class claque {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final bristol.beachfront[] f39365attabal = new bristol.beachfront[0];

    public static final Set<String> attabal(bristol.beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        if (beachfrontVar instanceof triweekly) {
            return ((triweekly) beachfrontVar).attabal();
        }
        HashSet hashSet = new HashSet(beachfrontVar.getElementsCount());
        int elementsCount = beachfrontVar.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(beachfrontVar.marial(i));
        }
        return hashSet;
    }

    public static final Void beachfront(kurbash.wireman<?> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        throw new SerializationException(marial(wiremanVar));
    }

    public static final kurbash.arytenoidectomy competently(KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        kurbash.arytenoidectomy type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }

    public static final kurbash.wireman<Object> dern(kurbash.arytenoidectomy arytenoidectomyVar) {
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        kurbash.beachfront beachfrontVarDern = arytenoidectomyVar.dern();
        if (beachfrontVarDern instanceof kurbash.wireman) {
            return (kurbash.wireman) beachfrontVarDern;
        }
        if (!(beachfrontVarDern instanceof kurbash.monoploid)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + beachfrontVarDern);
        }
        throw new IllegalArgumentException("Captured type parameter " + beachfrontVarDern + " from generic non-reified function. Such functionality cannot be supported because " + beachfrontVarDern + " is erased, either specify serializer explicitly or make calling function inline with reified " + beachfrontVarDern + '.');
    }

    public static final String marial(kurbash.wireman<?> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        String strTaiyuan = wiremanVar.taiyuan();
        if (strTaiyuan == null) {
            strTaiyuan = "<local class name not available>";
        }
        return wireman(strTaiyuan);
    }

    public static final bristol.beachfront[] saneness(List<? extends bristol.beachfront> list) {
        bristol.beachfront[] beachfrontVarArr;
        List<? extends bristol.beachfront> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (beachfrontVarArr = (bristol.beachfront[]) list.toArray(new bristol.beachfront[0])) == null) ? f39365attabal : beachfrontVarArr;
    }

    public static final String wireman(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }
}
