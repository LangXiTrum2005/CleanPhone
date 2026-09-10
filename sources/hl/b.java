package hl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f42406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f42408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f42409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f42410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f42411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f42412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f42413i;

    /* JADX INFO: Fake field, exist only in values array */
    b EF1;

    static {
        b bVar = new b("FROM_IDE", 0);
        b bVar2 = new b("FROM_BACKEND", 1);
        b bVar3 = new b("FROM_TEST", 2);
        b bVar4 = new b("FROM_BUILTINS", 3);
        f42405a = bVar4;
        b bVar5 = new b("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        b bVar6 = new b("WHEN_CHECK_OVERRIDES", 5);
        b bVar7 = new b("FOR_SCRIPT", 6);
        b bVar8 = new b("FROM_REFLECTION", 7);
        f42406b = bVar8;
        b bVar9 = new b("WHEN_RESOLVE_DECLARATION", 8);
        b bVar10 = new b("WHEN_GET_DECLARATION_SCOPE", 9);
        b bVar11 = new b("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        b bVar12 = new b("FOR_ALREADY_TRACKED", 11);
        f42407c = bVar12;
        b bVar13 = new b("WHEN_GET_ALL_DESCRIPTORS", 12);
        f42408d = bVar13;
        b bVar14 = new b("WHEN_TYPING", 13);
        b bVar15 = new b("WHEN_GET_SUPER_MEMBERS", 14);
        f42409e = bVar15;
        b bVar16 = new b("FOR_NON_TRACKED_SCOPE", 15);
        f42410f = bVar16;
        b bVar17 = new b("FROM_SYNTHETIC_SCOPE", 16);
        b bVar18 = new b("FROM_DESERIALIZATION", 17);
        f42411g = bVar18;
        b bVar19 = new b("FROM_JAVA_LOADER", 18);
        f42412h = bVar19;
        f42413i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, new b("WHEN_GET_LOCAL_VARIABLE", 19), new b("WHEN_FIND_BY_FQNAME", 20), new b("WHEN_GET_COMPANION_OBJECT", 21), new b("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f42413i.clone();
    }
}
