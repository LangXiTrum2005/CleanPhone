package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 implements Iterable, b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23417a;

    public e6(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f23417a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e6) {
            return this.f23417a.equals(((e6) obj).f23417a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23417a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d6(this, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02ec A[PHI: r7
  0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 m(String str, d8 d8Var, ArrayList arrayList) {
        String str2;
        int i10;
        int i11;
        int i12;
        boolean zIsEmpty;
        d8 d8Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || InAppPurchaseConstants.METHOD_TO_STRING.equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = AdError.UNDEFINED_DOMAIN;
        String str3 = this.f23417a;
        z = false;
        boolean z10 = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    yg.c(1, "hasOwnProperty", arrayList);
                    b6 b6VarE = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
                    boolean zEquals = "length".equals(b6VarE.zzc());
                    c2 c2Var = b6.X8;
                    if (zEquals) {
                        return c2Var;
                    }
                    double dDoubleValue = b6VarE.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str3.length()) ? b6.Y8 : c2Var;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals(InAppPurchaseConstants.METHOD_TO_STRING)) {
                    yg.c(0, InAppPurchaseConstants.METHOD_TO_STRING, arrayList);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    yg.c(0, "toLocaleLowerCase", arrayList);
                    return new e6(str3.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    yg.g(1, "charAt", arrayList);
                    int iL = arrayList.isEmpty() ? 0 : (int) yg.l(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue());
                    return (iL < 0 || iL >= str3.length()) ? b6.Z8 : new e6(String.valueOf(str3.charAt(iL)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            sb2.append(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(i13)).zzc());
                        }
                        return new e6(sb2.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    yg.c(0, "toLowerCase", arrayList);
                    return new e6(str3.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    yg.g(1, AppLovinEventTypes.USER_EXECUTED_SEARCH, arrayList);
                    if (!arrayList.isEmpty()) {
                        strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                    }
                    Matcher matcher = Pattern.compile(strZzc).matcher(str3);
                    return matcher.find() ? new o3(Double.valueOf(matcher.start())) : new o3(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    yg.c(0, "toLocaleUpperCase", arrayList);
                    return new e6(str3.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    yg.g(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                    }
                    String str4 = strZzc;
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue();
                    return new o3(Double.valueOf(str3.lastIndexOf(str4, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : yg.l(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    yg.c(0, "toUpperCase", arrayList);
                    return new e6(str3.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    yg.c(0, "toUpperCase", arrayList);
                    return new e6(str3.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    yg.g(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher2.find() ? new m1(Arrays.asList(new e6(matcher2.group()))) : b6.T8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    yg.g(2, "slice", arrayList);
                    double dL = yg.l(!arrayList.isEmpty() ? ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dL < 0.0d ? Math.max(((double) str3.length()) + dL, 0.0d) : Math.min(dL, str3.length());
                    double dL2 = yg.l(arrayList.size() > 1 ? ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue() : str3.length());
                    int i14 = (int) dMax;
                    return new e6(str3.substring(i14, Math.max(0, ((int) (dL2 < 0.0d ? Math.max(((double) str3.length()) + dL2, 0.0d) : Math.min(dL2, str3.length()))) - i14) + i14));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    yg.g(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new m1(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc2 = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                        long jK = arrayList.size() > 1 ? ((long) yg.k(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (jK == 0) {
                            return new m1();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strZzc2), ((int) jK) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc2.isEmpty() || length <= 0) {
                            i12 = zIsEmpty;
                            z10 = zIsEmpty;
                            i11 = length;
                            i12 = z10;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i11 = length - 1;
                            if (!strArrSplit[i11].isEmpty()) {
                                i12 = zIsEmpty;
                                z10 = zIsEmpty;
                                i11 = length;
                                i12 = z10;
                            }
                        }
                        i12 = zIsEmpty;
                        z10 = zIsEmpty;
                        if (length > jK) {
                            i11--;
                        }
                        while (i12 < i11) {
                            arrayList2.add(new e6(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new m1(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    yg.g(2, "substring", arrayList);
                    int iL2 = !arrayList.isEmpty() ? (int) yg.l(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iL3 = arrayList.size() > 1 ? (int) yg.l(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1)).zzd().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iL2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iL3, 0), str3.length());
                    return new e6(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    yg.g(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    b6 b6VarA = b6.S8;
                    if (!zIsEmpty2) {
                        strZzc = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            b6VarA = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
                        }
                    }
                    String str5 = strZzc;
                    int iIndexOf = str3.indexOf(str5);
                    if (iIndexOf >= 0) {
                        if (b6VarA instanceof p4) {
                            b6VarA = ((p4) b6VarA).a(d8Var, Arrays.asList(new e6(str5), new o3(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strZzc3 = b6VarA.zzc();
                        String strSubstring2 = str3.substring(str5.length() + iIndexOf);
                        return new e6(q4.a.j(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzc3, strSubstring2));
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    yg.g(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        d8Var2 = d8Var;
                    } else {
                        d8Var2 = d8Var;
                        strZzc = ((h6) d8Var2.f23388c).e(d8Var2, (b6) arrayList.get(0)).zzc();
                    }
                    return new o3(Double.valueOf(str3.indexOf(strZzc, (int) yg.l(arrayList.size() < 2 ? 0.0d : ((h6) d8Var2.f23388c).e(d8Var2, (b6) arrayList.get(1)).zzd().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f23417a;
        return q4.a.j(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final String zzc() {
        return this.f23417a;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Double zzd() {
        String str = this.f23417a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Boolean zze() {
        return Boolean.valueOf(!this.f23417a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final Iterator zzf() {
        return new d6(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final b6 zzt() {
        return new e6(this.f23417a);
    }
}
