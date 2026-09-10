package genesis;

import java.util.LinkedList;
import java.util.List;
import p002kotlin.Triple;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* JADX INFO: compiled from: NameResolverImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ProtoBuf$StringTable f26717attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ProtoBuf$QualifiedNameTable f26718saneness;

    /* JADX INFO: compiled from: NameResolverImpl.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f26719attabal;

        static {
            int[] iArr = new int[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26719attabal = iArr;
        }
    }

    public wireman(ProtoBuf$StringTable strings, ProtoBuf$QualifiedNameTable qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f26717attabal = strings;
        this.f26718saneness = qualifiedNames;
    }

    @Override // genesis.dern
    public boolean attabal(int i) {
        return dern(i).getThird().booleanValue();
    }

    public final Triple<List<String>, List<String>, Boolean> dern(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f26718saneness.getQualifiedName(i);
            String string = this.f26717attabal.getString(qualifiedName.getShortName());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.beachfront(kind);
            int i2 = attabal.f26719attabal[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else if (i2 == 3) {
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // genesis.dern
    public String getString(int i) {
        String string = this.f26717attabal.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // genesis.dern
    public String saneness(int i) {
        Triple<List<String>, List<String>, Boolean> tripleDern = dern(i);
        List<String> listComponent1 = tripleDern.component1();
        String strPreterite = CollectionsKt.preterite(tripleDern.component2(), ".", null, null, 0, null, null, 62, null);
        if (listComponent1.isEmpty()) {
            return strPreterite;
        }
        return CollectionsKt.preterite(listComponent1, "/", null, null, 0, null, null, 62, null) + '/' + strPreterite;
    }
}
