package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface KParameter extends KAnnotatedElement {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Kind {
        public static final Kind X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Kind f43350Y;
        public static final Kind Z;
        public static final /* synthetic */ Kind[] e0;
        public static final /* synthetic */ EnumEntries f0;

        static {
            Kind kind = new Kind("INSTANCE", 0);
            X = kind;
            Kind kind2 = new Kind("EXTENSION_RECEIVER", 1);
            f43350Y = kind2;
            Kind kind3 = new Kind("VALUE", 2);
            Z = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            e0 = kindArr;
            f0 = EnumEntriesKt.a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) e0.clone();
        }
    }

    int g();

    Kind getKind();

    String getName();

    KTypeImpl getType();

    boolean h();

    boolean m();
}
