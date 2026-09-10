package b3;

import com.google.android.gms.internal.ads.o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import java.util.ArrayList;
import java.util.Objects;
import l1.y;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f5475c;

    public o(String str, String str2, n1 n1Var) {
        super(str);
        go.k.i(!n1Var.isEmpty());
        this.f5474b = str2;
        j0 j0VarX = j0.x(n1Var);
        this.f5475c = j0VarX;
    }

    public static ArrayList d(String str) {
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

    @Override // i1.b0
    public final void b(o6 o6Var) {
        byte b10;
        switch (this.f5462a) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = 11;
                break;
            case "TCON":
                b10 = 12;
                break;
            case "TDAT":
                b10 = 13;
                break;
            case "TDRC":
                b10 = 14;
                break;
            case "TDRL":
                b10 = 15;
                break;
            case "TEXT":
                b10 = 16;
                break;
            case "TIT2":
                b10 = 17;
                break;
            case "TPE1":
                b10 = 18;
                break;
            case "TPE2":
                b10 = 19;
                break;
            case "TPE3":
                b10 = 20;
                break;
            case "TRCK":
                b10 = 21;
                break;
            case "TYER":
                b10 = 22;
                break;
            default:
                b10 = -1;
                break;
        }
        j0 j0Var = this.f5475c;
        try {
            switch (b10) {
                case 0:
                case 10:
                    o6Var.f18153c = (CharSequence) j0Var.get(0);
                    break;
                case 1:
                case 11:
                    o6Var.f18168s = (CharSequence) j0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) j0Var.get(0);
                    int i10 = Integer.parseInt(str.substring(2, 4));
                    int i11 = Integer.parseInt(str.substring(0, 2));
                    o6Var.f18162m = Integer.valueOf(i10);
                    o6Var.f18163n = Integer.valueOf(i11);
                    break;
                case 3:
                case 18:
                    o6Var.f18152b = (CharSequence) j0Var.get(0);
                    break;
                case 4:
                case 19:
                    o6Var.f18154d = (CharSequence) j0Var.get(0);
                    break;
                case 5:
                case 20:
                    o6Var.f18169t = (CharSequence) j0Var.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) j0Var.get(0);
                    String str3 = y.f44830a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    o6Var.f18158h = Integer.valueOf(i12);
                    o6Var.f18159i = numValueOf;
                    break;
                case 7:
                case 17:
                    o6Var.f18151a = (CharSequence) j0Var.get(0);
                    break;
                case 8:
                case 16:
                    o6Var.f18167r = (CharSequence) j0Var.get(0);
                    break;
                case 9:
                case 22:
                    o6Var.l = Integer.valueOf(Integer.parseInt((String) j0Var.get(0)));
                    break;
                case 12:
                    Integer numK = com.bumptech.glide.c.K((String) j0Var.get(0));
                    if (numK != null) {
                        String strA = k.a(numK.intValue());
                        if (strA != null) {
                            o6Var.f18172w = strA;
                        }
                    } else {
                        o6Var.f18172w = (CharSequence) j0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) j0Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                o6Var.f18163n = (Integer) arrayListD.get(2);
                            }
                        }
                        o6Var.f18162m = (Integer) arrayListD.get(1);
                    }
                    o6Var.l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) j0Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                o6Var.f18166q = (Integer) arrayListD2.get(2);
                            }
                        }
                        o6Var.f18165p = (Integer) arrayListD2.get(1);
                    }
                    o6Var.f18164o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f5462a, oVar.f5462a) && Objects.equals(this.f5474b, oVar.f5474b) && this.f5475c.equals(oVar.f5475c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f5462a);
        String str = this.f5474b;
        return this.f5475c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b3.j
    public final String toString() {
        return this.f5462a + ": description=" + this.f5474b + ": values=" + this.f5475c;
    }
}
