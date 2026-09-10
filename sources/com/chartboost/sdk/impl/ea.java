package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13798c;
    public final a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f13799e;
    public final a f;

    public enum b {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13806b;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13805i = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13802c = new a(null);

        public static final class a {
            public a() {
            }

            public final b a(int i2) {
                Object next;
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((b) next).c() != i2);
                b bVar = (b) next;
                return bVar == null ? b.TOP_LEFT : bVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        b(int i2) {
            this.f13806b = i2;
        }

        public static EnumEntries b() {
            return f13805i;
        }

        public final int c() {
            return this.f13806b;
        }
    }

    public ea(String imageUrl, String clickthroughUrl, b position, a margin, a padding, a size) {
        Intrinsics.f(imageUrl, "imageUrl");
        Intrinsics.f(clickthroughUrl, "clickthroughUrl");
        Intrinsics.f(position, "position");
        Intrinsics.f(margin, "margin");
        Intrinsics.f(padding, "padding");
        Intrinsics.f(size, "size");
        this.f13796a = imageUrl;
        this.f13797b = clickthroughUrl;
        this.f13798c = position;
        this.d = margin;
        this.f13799e = padding;
        this.f = size;
    }

    public final String a() {
        return this.f13797b;
    }

    public final String b() {
        return this.f13796a;
    }

    public final a c() {
        return this.d;
    }

    public final b d() {
        return this.f13798c;
    }

    public final a e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return Intrinsics.a(this.f13796a, eaVar.f13796a) && Intrinsics.a(this.f13797b, eaVar.f13797b) && this.f13798c == eaVar.f13798c && Intrinsics.a(this.d, eaVar.d) && Intrinsics.a(this.f13799e, eaVar.f13799e) && Intrinsics.a(this.f, eaVar.f);
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.f13799e.hashCode() + ((this.d.hashCode() + ((this.f13798c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f13797b, this.f13796a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.f13796a;
        String str2 = this.f13797b;
        b bVar = this.f13798c;
        a aVar = this.d;
        a aVar2 = this.f13799e;
        a aVar3 = this.f;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("InfoIcon(imageUrl=", str, ", clickthroughUrl=", str2, ", position=");
        sbQ.append(bVar);
        sbQ.append(", margin=");
        sbQ.append(aVar);
        sbQ.append(", padding=");
        sbQ.append(aVar2);
        sbQ.append(", size=");
        sbQ.append(aVar3);
        sbQ.append(")");
        return sbQ.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f13800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f13801b;

        public a(double d, double d2) {
            this.f13800a = d;
            this.f13801b = d2;
        }

        public final double a() {
            return this.f13801b;
        }

        public final double b() {
            return this.f13800a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f13800a, aVar.f13800a) == 0 && Double.compare(this.f13801b, aVar.f13801b) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f13801b) + (Double.hashCode(this.f13800a) * 31);
        }

        public String toString() {
            return "DoubleSize(width=" + this.f13800a + ", height=" + this.f13801b + ")";
        }

        public /* synthetic */ a(double d, double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2);
        }
    }

    public /* synthetic */ ea(String str, String str2, b bVar, a aVar, a aVar2, a aVar3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? b.TOP_LEFT : bVar, (i2 & 8) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar, (i2 & 16) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar2, (i2 & 32) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar3);
    }
}
