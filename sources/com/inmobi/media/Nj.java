package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Nj {
    public final String a;
    public final String b;

    public Nj(String tableName, String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.a = tableName;
        this.b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nj)) {
            return false;
        }
        Nj nj = (Nj) obj;
        return Intrinsics.wireman(this.a, nj.a) && Intrinsics.wireman(this.b, nj.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.a + ", tableSchema=" + this.b + ")";
    }
}
