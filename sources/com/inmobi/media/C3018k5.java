package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3018k5 {
    public final Context a;
    public final ArrayList b;
    public final int c;

    public C3018k5(Context context, ArrayList tableInfos, int i) {
        Intrinsics.checkNotNullParameter("com.im_11.1.0.db", "name");
        Intrinsics.checkNotNullParameter(tableInfos, "tableInfos");
        this.a = context;
        this.b = tableInfos;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3018k5)) {
            return false;
        }
        C3018k5 c3018k5 = (C3018k5) obj;
        return Intrinsics.wireman(this.a, c3018k5.a) && Intrinsics.wireman("com.im_11.1.0.db", "com.im_11.1.0.db") && Intrinsics.wireman(this.b, c3018k5.b) && this.c == c3018k5.c && Intrinsics.wireman(null, null);
    }

    public final int hashCode() {
        Context context = this.a;
        return AbstractC2906fi.a(this.c, (this.b.hashCode() + AbstractC2906fi.a(1, (((context == null ? 0 : context.hashCode()) * 31) - 2016312295) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.a + ", name=com.im_11.1.0.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + ((Object) null) + ")";
    }
}
