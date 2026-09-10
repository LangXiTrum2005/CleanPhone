package ads_mobile_sdk;

import ads_mobile_sdk.it2;
import com.google.common.base.marial;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import saneness.delouse;
import saneness.glutethimide;

/* JADX INFO: loaded from: classes.dex */
public final class it2 {
    public final delouse a;
    public final delouse b;
    public final delouse c;
    public final ExecutorService d;
    public final u13 e;
    public final y5 f;

    public it2(delouse delouseVar, delouse delouseVar2, delouse delouseVar3, j5 j5Var, ExecutorService executorService, u13 u13Var) {
        this.a = delouseVar;
        this.b = delouseVar2;
        this.c = delouseVar3;
        this.d = executorService;
        this.e = u13Var;
        this.f = j5Var.z();
    }

    public final cutely a(y5 y5Var, boolean z) {
        cutely cutelyVarA = a(y5Var);
        return (!z || y5Var == this.f) ? cutelyVarA : cutely.restrictive(cutelyVarA).kattegat(Throwable.class, new marial() { // from class: saneness.phrasemonger
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return it2.a((Throwable) obj);
            }
        }, rotuma.attabal()).polder(new ht2(this), rotuma.attabal());
    }

    public final glutethimide b(y5 y5Var) {
        int iOrdinal = y5Var.ordinal();
        if (iOrdinal == 1) {
            return (glutethimide) this.a.get();
        }
        if (iOrdinal == 2) {
            return (glutethimide) this.b.get();
        }
        if (iOrdinal == 3) {
            return (glutethimide) this.c.get();
        }
        throw new IllegalArgumentException();
    }

    public final cutely a(final y5 y5Var) {
        return cutely.restrictive(arytenoidectomy.apical(new Callable() { // from class: saneness.atria
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37067kowloon.b(y5Var);
            }
        }, this.d)).polder(new impromptu() { // from class: saneness.victim
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                glutethimide glutethimideVar = (glutethimide) obj;
                return com.google.common.util.concurrent.arytenoidectomy.formularize(glutethimideVar.a(), new com.google.common.base.marial() { // from class: saneness.punish
                    @Override // com.google.common.base.marial
                    public final Object apply(Object obj2) {
                        return it2.a(glutethimideVar, (Void) obj2);
                    }
                }, com.google.common.util.concurrent.rotuma.attabal());
            }
        }, rotuma.attabal());
    }

    public static /* synthetic */ glutethimide a(Throwable th) {
        return null;
    }

    public static /* synthetic */ glutethimide a(glutethimide glutethimideVar, Void r1) {
        return glutethimideVar;
    }
}
