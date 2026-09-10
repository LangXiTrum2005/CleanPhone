package pb;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f48298c;

    static {
        a aVar = new a("GRANTED", 0);
        f48296a = aVar;
        a aVar2 = new a("DENIED", 1);
        f48297b = aVar2;
        f48298c = new a[]{aVar, aVar2};
    }

    @NonNull
    public static a valueOf(@NonNull String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    @NonNull
    public static a[] values() {
        return (a[]) f48298c.clone();
    }
}
