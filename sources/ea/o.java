package ea;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f39653f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f39656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f39658e;

    public o(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(x1.class);
        this.f39658e = enumMap;
        enumMap.put(x1.AD_USER_DATA, bool == null ? v1.UNINITIALIZED : bool.booleanValue() ? v1.GRANTED : v1.DENIED);
        this.f39654a = i10;
        this.f39655b = d();
        this.f39656c = bool2;
        this.f39657d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f39653f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(x1.class);
        x1[] x1VarArr = w1.DMA.f39861a;
        int length = x1VarArr.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(x1VarArr[i12], y1.e(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new o(enumMap, i10, (Boolean) null, (String) null);
    }

    public static o c(int i10, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.DMA.f39861a) {
            enumMap.put(x1Var, y1.d(bundle.getString(x1Var.f39910a)));
        }
        return new o(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final v1 a() {
        v1 v1Var = (v1) this.f39658e.get(x1.AD_USER_DATA);
        return v1Var == null ? v1.UNINITIALIZED : v1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39654a);
        for (x1 x1Var : w1.DMA.f39861a) {
            sb2.append(":");
            sb2.append(y1.h((v1) this.f39658e.get(x1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f39655b.equalsIgnoreCase(oVar.f39655b) && Objects.equals(this.f39656c, oVar.f39656c)) {
            return Objects.equals(this.f39657d, oVar.f39657d);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f39656c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f39657d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f39655b.hashCode() + (i10 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(y1.a(this.f39654a));
        for (x1 x1Var : w1.DMA.f39861a) {
            sb2.append(",");
            sb2.append(x1Var.f39910a);
            sb2.append(X3.j.f27830b);
            v1 v1Var = (v1) this.f39658e.get(x1Var);
            if (v1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = v1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f39656c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f39657d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public o(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f39658e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f39654a = i10;
        this.f39655b = d();
        this.f39656c = bool;
        this.f39657d = str;
    }
}
