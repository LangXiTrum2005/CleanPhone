package com.inmobi.media;

import android.util.SparseArray;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.D1[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.D1[]) from 0x002a: INVOKE (r0v1 com.inmobi.media.D1[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:43)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class D1 {
    d("UNKNOWN"),
    f22756e("PLAYING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("PAUSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("COMPLETED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1 f22754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f22755c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22757a;

    static {
        EnumEntriesKt.a(new D1[]{r0, r1, new D1("PAUSED"), new D1("COMPLETED")});
        f22754b = new C1();
        f22755c = new SparseArray();
        for (D1 d1 : values()) {
            f22755c.put(d1.f22757a, d1);
        }
    }

    public D1(String str) {
        super(str, i);
        this.f22757a = i;
    }

    public static D1 valueOf(String str) {
        return (D1) Enum.valueOf(D1.class, str);
    }

    public static D1[] values() {
        return (D1[]) f.clone();
    }
}
