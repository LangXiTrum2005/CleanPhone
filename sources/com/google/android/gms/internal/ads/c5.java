package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1 f13041c;

    public c5(String str, String str2, ya1 ya1Var) {
        super(str);
        ps1.v(!ya1Var.isEmpty());
        this.f13040b = str2;
        ca1 ca1VarY = ca1.y(ya1Var);
        this.f13041c = ca1VarY;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0168 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, blocks: (B:69:0x0115, B:82:0x015f, B:84:0x0168, B:86:0x0174, B:102:0x01b8), top: B:113:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.v7
    public final void a(o6 o6Var) {
        String[] strArrSplit;
        Integer numValueOf;
        String str = this.f21738a;
        int iHashCode = str.hashCode();
        ca1 ca1Var = this.f13041c;
        try {
            switch (iHashCode) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    o6Var.f18153c = (CharSequence) ca1Var.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    o6Var.f18168s = (CharSequence) ca1Var.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) ca1Var.get(0);
                    int i10 = Integer.parseInt(str2.substring(2, 4));
                    int i11 = Integer.parseInt(str2.substring(0, 2));
                    o6Var.f18162m = Integer.valueOf(i10);
                    o6Var.f18163n = Integer.valueOf(i11);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    o6Var.f18152b = (CharSequence) ca1Var.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    o6Var.f18154d = (CharSequence) ca1Var.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    o6Var.f18169t = (CharSequence) ca1Var.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) ca1Var.get(0);
                    String str4 = uu0.f20901a;
                    strArrSplit = str3.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    o6Var.f18158h = Integer.valueOf(i12);
                    o6Var.f18159i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    o6Var.f18151a = (CharSequence) ca1Var.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    o6Var.f18167r = (CharSequence) ca1Var.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    o6Var.l = Integer.valueOf(Integer.parseInt((String) ca1Var.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    o6Var.f18153c = (CharSequence) ca1Var.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    o6Var.f18168s = (CharSequence) ca1Var.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        Integer numO = gc1.o((String) ca1Var.get(0));
                        if (numO != null) {
                            String strA = y4.a(numO.intValue());
                            if (strA != null) {
                                o6Var.f18172w = strA;
                            }
                        } else {
                            o6Var.f18172w = (CharSequence) ca1Var.get(0);
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str5 = (String) ca1Var.get(0);
                    int i13 = Integer.parseInt(str5.substring(2, 4));
                    int i14 = Integer.parseInt(str5.substring(0, 2));
                    o6Var.f18162m = Integer.valueOf(i13);
                    o6Var.f18163n = Integer.valueOf(i14);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        ArrayList arrayListB = b((String) ca1Var.get(0));
                        int size = arrayListB.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    o6Var.f18163n = (Integer) arrayListB.get(2);
                                }
                            }
                            o6Var.f18162m = (Integer) arrayListB.get(1);
                        }
                        o6Var.l = (Integer) arrayListB.get(0);
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        ArrayList arrayListB2 = b((String) ca1Var.get(0));
                        int size2 = arrayListB2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    o6Var.f18166q = (Integer) arrayListB2.get(2);
                                }
                            }
                            o6Var.f18165p = (Integer) arrayListB2.get(1);
                        }
                        o6Var.f18164o = (Integer) arrayListB2.get(0);
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    o6Var.f18167r = (CharSequence) ca1Var.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    o6Var.f18151a = (CharSequence) ca1Var.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    o6Var.f18152b = (CharSequence) ca1Var.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    o6Var.f18154d = (CharSequence) ca1Var.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    o6Var.f18169t = (CharSequence) ca1Var.get(0);
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str6 = (String) ca1Var.get(0);
                    String str7 = uu0.f20901a;
                    strArrSplit = str6.split("/", -1);
                    int i15 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    o6Var.f18158h = Integer.valueOf(i15);
                    o6Var.f18159i = numValueOf;
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    o6Var.l = Integer.valueOf(Integer.parseInt((String) ca1Var.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c5.class == obj.getClass()) {
            c5 c5Var = (c5) obj;
            if (Objects.equals(this.f21738a, c5Var.f21738a) && Objects.equals(this.f13040b, c5Var.f13040b) && this.f13041c.equals(c5Var.f13041c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21738a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.f13040b;
        return this.f13041c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String strValueOf = String.valueOf(this.f13041c);
        String str = this.f21738a;
        int length = String.valueOf(str).length();
        String str2 = this.f13040b;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        d5.u.r(sb2, str, ": description=", str2, ": values=");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
