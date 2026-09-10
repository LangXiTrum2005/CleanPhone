package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f15543c;
    public final Throwable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15544e;
    public final Lazy f;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            byte[] bArrB = xc.this.b();
            if (bArrB == null) {
                return null;
            }
            String strC = xc.this.c();
            if (strC == null) {
                strC = Charsets.f44691a.name();
            }
            try {
                Intrinsics.c(strC);
                Charset charsetForName = Charset.forName(strC);
                Intrinsics.e(charsetForName, "forName(...)");
                return new String(bArrB, charsetForName);
            } catch (Exception unused) {
                return new String(bArrB, Charsets.f44691a);
            }
        }
    }

    public xc(boolean z2, int i2, byte[] bArr, Throwable th, String str) {
        this.f15541a = z2;
        this.f15542b = i2;
        this.f15543c = bArr;
        this.d = th;
        this.f15544e = str;
        this.f = LazyKt.b(new a());
    }

    public final String a() {
        return (String) this.f.getX();
    }

    public final byte[] b() {
        return this.f15543c;
    }

    public final String c() {
        return this.f15544e;
    }

    public final Throwable d() {
        return this.d;
    }

    public final int e() {
        return this.f15542b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return this.f15541a == xcVar.f15541a && this.f15542b == xcVar.f15542b && Intrinsics.a(this.f15543c, xcVar.f15543c) && Intrinsics.a(this.d, xcVar.d) && Intrinsics.a(this.f15544e, xcVar.f15544e);
    }

    public final boolean f() {
        return this.f15541a;
    }

    public int hashCode() {
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f15542b, Boolean.hashCode(this.f15541a) * 31, 31);
        byte[] bArr = this.f15543c;
        int iHashCode = (iA + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th = this.d;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.f15544e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z2 = this.f15541a;
        int i2 = this.f15542b;
        String string = Arrays.toString(this.f15543c);
        Throwable th = this.d;
        String str = this.f15544e;
        StringBuilder sb = new StringBuilder("NetworkResponse(isSuccessful=");
        sb.append(z2);
        sb.append(", statusCode=");
        sb.append(i2);
        sb.append(", bytes=");
        sb.append(string);
        sb.append(", error=");
        sb.append(th);
        sb.append(", charset=");
        return android.support.v4.media.a.r(sb, str, ")");
    }

    public /* synthetic */ xc(boolean z2, int i2, byte[] bArr, Throwable th, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i2, (i3 & 4) != 0 ? null : bArr, (i3 & 8) != 0 ? null : th, (i3 & 16) != 0 ? null : str);
    }
}
