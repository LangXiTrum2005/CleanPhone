package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes7.dex */
public final class NameResolverImpl implements NameResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoBuf.StringTable f44123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtoBuf.QualifiedNameTable f44124b;

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.f(strings, "strings");
        Intrinsics.f(qualifiedNames, "qualifiedNames");
        this.f44123a = strings;
        this.f44124b = qualifiedNames;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final boolean a(int i2) {
        return ((Boolean) c(i2).Z).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String b(int i2) {
        Triple tripleC = c(i2);
        List list = (List) tripleC.X;
        String strD = CollectionsKt.D((List) tripleC.f43253Y, mo.ono, null, null, null, 62);
        if (list.isEmpty()) {
            return strD;
        }
        return CollectionsKt.D(list, "/", null, null, null, 62) + IOUtils.DIR_SEPARATOR_UNIX + strD;
    }

    public final Triple c(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z2 = false;
        while (i2 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = (ProtoBuf.QualifiedNameTable.QualifiedName) this.f44124b.f44067Y.get(i2);
            String str = this.f44123a.f44072Y.get(qualifiedName.e0);
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.f0;
            Intrinsics.c(kind);
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z2 = true;
            }
            i2 = qualifiedName.Z;
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String getString(int i2) {
        String str = this.f44123a.f44072Y.get(i2);
        Intrinsics.e(str, "strings.getString(index)");
        return str;
    }
}
