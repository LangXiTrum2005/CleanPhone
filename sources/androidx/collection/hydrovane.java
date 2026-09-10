package androidx.collection;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "index", "", "wireman", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "marial", "(Ljava/util/List;II)V", "E", "Landroidx/collection/ObjectList;", "beachfront", "()Landroidx/collection/ObjectList;", "element1", "taiyuan", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/seminary;", "competently", "(Ljava/lang/Object;)Landroidx/collection/seminary;", "element2", "impromptu", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/seminary;", "", "", "attabal", "[Ljava/lang/Object;", "EmptyArray", "saneness", "Landroidx/collection/ObjectList;", "EmptyObjectList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object[] f5696attabal = new Object[0];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ObjectList<Object> f5697saneness = new seminary(0);

    public static final <E> ObjectList<E> beachfront() {
        ObjectList<E> objectList = (ObjectList<E>) f5697saneness;
        Intrinsics.competently(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> seminary<E> competently(E e) {
        seminary<E> seminaryVar = new seminary<>(1);
        seminaryVar.triweekly(e);
        return seminaryVar;
    }

    public static final <E> seminary<E> impromptu(E e, E e2) {
        seminary<E> seminaryVar = new seminary<>(2);
        seminaryVar.triweekly(e);
        seminaryVar.triweekly(e2);
        return seminaryVar;
    }

    public static final void marial(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            molybdenite.wireman.attabal("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            molybdenite.wireman.dern("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 > size) {
            molybdenite.wireman.dern("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> ObjectList<E> taiyuan(E e) {
        return competently(e);
    }

    public static final void wireman(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            molybdenite.wireman.dern("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }
}
