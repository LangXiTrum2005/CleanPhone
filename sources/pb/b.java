package pb;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f48300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f48301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f48302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f48303e;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f48299a = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f48300b = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        f48301c = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        f48302d = bVar4;
        f48303e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    @NonNull
    public static b valueOf(@NonNull String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    @NonNull
    public static b[] values() {
        return (b[]) f48303e.clone();
    }
}
