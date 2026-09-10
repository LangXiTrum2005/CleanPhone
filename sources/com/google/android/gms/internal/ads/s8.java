package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7[] f19891a;

    public s8(v7... v7VarArr) {
        this.f19891a = v7VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final ya1 a(Class cls, h81 h81Var) {
        v7 v7Var;
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        for (v7 v7Var2 : this.f19891a) {
            if (cls.isAssignableFrom(v7Var2.getClass())) {
                v7Var = (v7) cls.cast(v7Var2);
                if (!h81Var.zza(v7Var)) {
                    v7Var = null;
                }
            } else {
                v7Var = null;
            }
            if (v7Var != null) {
                int length = objArrCopyOf.length;
                int i11 = i10 + 1;
                int iD = x91.d(length, i11);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i10] = v7Var;
                i10 = i11;
            }
        }
        return ca1.A(i10, objArrCopyOf);
    }

    public final s8 b(s8 s8Var) {
        return s8Var == null ? this : c(s8Var.f19891a);
    }

    public final s8 c(v7... v7VarArr) {
        int length = v7VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = uu0.f20901a;
        v7[] v7VarArr2 = this.f19891a;
        int length2 = v7VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(v7VarArr2, length2 + length);
        System.arraycopy(v7VarArr, 0, objArrCopyOf, length2, length);
        return new s8((v7[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s8.class == obj.getClass() && Arrays.equals(this.f19891a, ((s8) obj).f19891a);
    }

    public final int hashCode() {
        return Long.hashCode(C.TIME_UNSET) + (Arrays.hashCode(this.f19891a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f19891a);
        return q4.a.j(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public s8(List list) {
        this.f19891a = (v7[]) list.toArray(new v7[0]);
    }
}
