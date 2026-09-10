package kotlin.enums;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EnumEntriesList<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {
    public final Enum[] X;

    public EnumEntriesList(Enum[] entries) {
        Intrinsics.f(entries, "entries");
        this.X = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.X);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        return ((Enum) ArraysKt.A(element.ordinal(), this.X)) == element;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i2) {
        AbstractList.Companion companion = AbstractList.INSTANCE;
        Enum[] enumArr = this.X;
        int length = enumArr.length;
        companion.getClass();
        AbstractList.Companion.b(i2, length);
        return enumArr[i2];
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int getZ() {
        return this.X.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt.A(iOrdinal, this.X)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        return indexOf(element);
    }
}
