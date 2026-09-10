package org.checkerframework.framework.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeKind {
    public static final /* synthetic */ TypeKind[] X = {new TypeKind("BOOLEAN", 0), new TypeKind("BYTE", 1), new TypeKind("SHORT", 2), new TypeKind("INT", 3), new TypeKind("LONG", 4), new TypeKind("CHAR", 5), new TypeKind("FLOAT", 6), new TypeKind("DOUBLE", 7), new TypeKind("VOID", 8), new TypeKind("NONE", 9), new TypeKind("NULL", 10), new TypeKind("ARRAY", 11), new TypeKind("DECLARED", 12), new TypeKind("ERROR", 13), new TypeKind("TYPEVAR", 14), new TypeKind("WILDCARD", 15), new TypeKind("PACKAGE", 16), new TypeKind("EXECUTABLE", 17), new TypeKind("OTHER", 18), new TypeKind("UNION", 19), new TypeKind("INTERSECTION", 20)};

    /* JADX INFO: Fake field, exist only in values array */
    TypeKind EF5;

    public static TypeKind valueOf(String str) {
        return (TypeKind) Enum.valueOf(TypeKind.class, str);
    }

    public static TypeKind[] values() {
        return (TypeKind[]) X.clone();
    }
}
