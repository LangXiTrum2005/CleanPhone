package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {
    public final Comparator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f19820Y;
    public final Object Z;
    public final BoundType e0;
    public final boolean f0;
    public final Object g0;
    public final BoundType h0;

    public GeneralRange(Comparator comparator, boolean z2, Object obj, BoundType boundType, boolean z3, Object obj2, BoundType boundType2) {
        comparator.getClass();
        this.X = comparator;
        this.f19820Y = z2;
        this.f0 = z3;
        this.Z = obj;
        boundType.getClass();
        this.e0 = boundType;
        this.g0 = obj2;
        boundType2.getClass();
        this.h0 = boundType2;
        if (z2) {
            comparator.compare(obj, obj);
        }
        if (z3) {
            comparator.compare(obj2, obj2);
        }
        if (z2 && z3) {
            int iCompare = comparator.compare(obj, obj2);
            Preconditions.h(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.X;
                Preconditions.f((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public final boolean a(Object obj) {
        return (d(obj) || c(obj)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GeneralRange b(GeneralRange generalRange) {
        boolean z2;
        int iCompare;
        boolean z3;
        Object obj;
        int iCompare2;
        BoundType boundType;
        Object obj2;
        int iCompare3;
        Comparator comparator = this.X;
        Preconditions.f(comparator.equals(generalRange.X));
        BoundType boundType2 = BoundType.X;
        boolean z4 = generalRange.f19820Y;
        BoundType boundType3 = generalRange.e0;
        Object obj3 = generalRange.Z;
        boolean z5 = this.f19820Y;
        if (z5) {
            Object obj4 = this.Z;
            if (!z4 || ((iCompare = comparator.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType3 == boundType2))) {
                boundType3 = this.e0;
                z2 = z5;
                obj3 = obj4;
            } else {
                z2 = z5;
            }
        } else {
            z2 = z4;
        }
        boolean z6 = generalRange.f0;
        BoundType boundType4 = generalRange.h0;
        Object obj5 = generalRange.g0;
        boolean z7 = this.f0;
        if (z7) {
            Object obj6 = this.g0;
            if (!z6 || ((iCompare2 = comparator.compare(obj6, obj5)) <= 0 && !(iCompare2 == 0 && boundType4 == boundType2))) {
                boundType4 = this.h0;
                z3 = z7;
                obj = obj6;
            } else {
                obj = obj5;
                z3 = z7;
            }
        } else {
            obj = obj5;
            z3 = z6;
        }
        if (z2 && z3 && ((iCompare3 = comparator.compare(obj3, obj)) > 0 || (iCompare3 == 0 && boundType3 == boundType2 && boundType4 == boundType2))) {
            boundType4 = BoundType.f19795Y;
            boundType = boundType2;
            obj2 = obj;
        } else {
            boundType = boundType3;
            obj2 = obj3;
        }
        return new GeneralRange(this.X, z2, obj2, boundType, z3, obj, boundType4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Object obj) {
        if (!this.f0) {
            return false;
        }
        int iCompare = this.X.compare(obj, this.g0);
        return ((iCompare == 0) & (this.h0 == BoundType.X)) | (iCompare > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Object obj) {
        if (!this.f19820Y) {
            return false;
        }
        int iCompare = this.X.compare(obj, this.Z);
        return ((iCompare == 0) & (this.e0 == BoundType.X)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.X.equals(generalRange.X) && this.f19820Y == generalRange.f19820Y && this.f0 == generalRange.f0 && this.e0.equals(generalRange.e0) && this.h0.equals(generalRange.h0) && Objects.a(this.Z, generalRange.Z) && Objects.a(this.g0, generalRange.g0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Z, this.e0, this.g0, this.h0});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.X);
        sb.append(":");
        BoundType boundType = BoundType.f19795Y;
        sb.append(this.e0 == boundType ? AbstractJsonLexerKt.BEGIN_LIST : '(');
        sb.append(this.f19820Y ? this.Z : "-∞");
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(this.f0 ? this.g0 : "∞");
        sb.append(this.h0 == boundType ? AbstractJsonLexerKt.END_LIST : ')');
        return sb.toString();
    }
}
