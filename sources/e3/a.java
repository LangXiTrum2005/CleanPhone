package e3;

import com.bumptech.glide.c;
import com.google.android.gms.internal.ads.o6;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39072b;

    public a(String str, String str2) {
        this.f39071a = q1.H(str);
        this.f39072b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // i1.b0
    public final void b(o6 o6Var) {
        String str = this.f39071a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b10 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b10 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b10 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b10 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b10 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b10 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b10 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b10 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b10 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b10 = 9;
                }
                break;
        }
        String str2 = this.f39072b;
        switch (b10) {
            case 0:
                Integer numK = c.K(str2);
                if (numK != null) {
                    o6Var.f18159i = numK;
                }
                break;
            case 1:
                Integer numK2 = c.K(str2);
                if (numK2 != null) {
                    o6Var.f18171v = numK2;
                }
                break;
            case 2:
                Integer numK3 = c.K(str2);
                if (numK3 != null) {
                    o6Var.f18158h = numK3;
                }
                break;
            case 3:
                o6Var.f18153c = str2;
                break;
            case 4:
                o6Var.f18172w = str2;
                break;
            case 5:
                o6Var.f18151a = str2;
                break;
            case 6:
                o6Var.f18155e = str2;
                break;
            case 7:
                Integer numK4 = c.K(str2);
                if (numK4 != null) {
                    o6Var.f18170u = numK4;
                }
                break;
            case 8:
                o6Var.f18154d = str2;
                break;
            case 9:
                o6Var.f18152b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f39071a.equals(aVar.f39071a) && this.f39072b.equals(aVar.f39072b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39072b.hashCode() + u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f39071a);
    }

    public final String toString() {
        return "VC: " + this.f39071a + X3.j.f27830b + this.f39072b;
    }
}
