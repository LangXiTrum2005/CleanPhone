package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ui2 {
    public final ArrayDeque a = new ArrayDeque();

    public final kn a(kn knVar, kn knVar2) {
        a(knVar);
        a(knVar2);
        kn wi2Var = (kn) this.a.pop();
        while (!this.a.isEmpty()) {
            wi2Var = new wi2((kn) this.a.pop(), wi2Var);
        }
        return wi2Var;
    }

    public final void a(kn knVar) {
        if (knVar.b()) {
            int iBinarySearch = Arrays.binarySearch(wi2.i, knVar.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iC = wi2.c(iBinarySearch + 1);
            if (!this.a.isEmpty() && ((kn) this.a.peek()).size() < iC) {
                int iC2 = wi2.c(iBinarySearch);
                kn wi2Var = (kn) this.a.pop();
                while (!this.a.isEmpty() && ((kn) this.a.peek()).size() < iC2) {
                    wi2Var = new wi2((kn) this.a.pop(), wi2Var);
                }
                wi2 wi2Var2 = new wi2(wi2Var, knVar);
                while (!this.a.isEmpty()) {
                    int iBinarySearch2 = Arrays.binarySearch(wi2.i, wi2Var2.d);
                    if (iBinarySearch2 < 0) {
                        iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                    }
                    if (((kn) this.a.peek()).size() >= wi2.c(iBinarySearch2 + 1)) {
                        break;
                    } else {
                        wi2Var2 = new wi2((kn) this.a.pop(), wi2Var2);
                    }
                }
                this.a.push(wi2Var2);
                return;
            }
            this.a.push(knVar);
            return;
        }
        if (knVar instanceof wi2) {
            wi2 wi2Var3 = (wi2) knVar;
            a(wi2Var3.e);
            a(wi2Var3.f);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + String.valueOf(knVar.getClass()));
        }
    }
}
