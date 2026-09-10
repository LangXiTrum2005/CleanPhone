package jn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f44003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f44004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f44005f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f44000a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f44001b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f44002c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f44003d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f44004e = bVar5;
        f44005f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44005f.clone();
    }
}
