package com.google.android.gms.internal.measurement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f23794a;

    public o3(Double d10) {
        if (d10 == null) {
            this.f23794a = Double.valueOf(Double.NaN);
        } else {
            this.f23794a = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3) {
            return this.f23794a.equals(((o3) obj).f23794a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23794a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        if (InAppPurchaseConstants.METHOD_TO_STRING.equals(str)) {
            return new e6(zzc());
        }
        throw new IllegalArgumentException(q4.a.i(zzc(), ".", str, " is not a function."));
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        Double d10 = this.f23794a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        return this.f23794a;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        Double d10 = this.f23794a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return new o3(this.f23794a);
    }
}
