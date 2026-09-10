package va;

import java.nio.charset.Charset;
import jb.e1;
import jb.f1;
import jb.g1;
import jb.h1;
import jb.i1;
import jb.j1;
import jb.s1;
import jb.y0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f52528a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static j1 a(f1 f1Var) {
        g1 g1VarA = j1.A();
        int iD = f1Var.D();
        g1VarA.e();
        j1.y((j1) g1VarA.f24645b, iD);
        for (e1 e1Var : f1Var.C()) {
            h1 h1VarC = i1.C();
            String strD = e1Var.C().D();
            h1VarC.e();
            i1.y((i1) h1VarC.f24645b, strD);
            y0 y0VarF = e1Var.F();
            h1VarC.e();
            i1.A((i1) h1VarC.f24645b, y0VarF);
            s1 s1VarE = e1Var.E();
            h1VarC.e();
            i1.z((i1) h1VarC.f24645b, s1VarE);
            int iD2 = e1Var.D();
            h1VarC.e();
            i1.B((i1) h1VarC.f24645b, iD2);
            i1 i1Var = (i1) h1VarC.a();
            g1VarA.e();
            j1.z((j1) g1VarA.f24645b, i1Var);
        }
        return (j1) g1VarA.a();
    }
}
