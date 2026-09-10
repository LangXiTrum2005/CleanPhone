package f1;

import androidx.lifecycle.c1;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import bc.i;
import g9.k;
import java.io.PrintWriter;
import x.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f40271b;

    public d(v vVar, c1 c1Var) {
        this.f40270a = vVar;
        this.f40271b = (c) new k(c1Var, c.f40267f).n(c.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f40271b;
        if (cVar.f40268d.f53509c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            j jVar = cVar.f40268d;
            if (i10 >= jVar.f53509c) {
                return;
            }
            b bVar = (b) jVar.f53508b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f40268d.f53507a[i10]);
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.l);
            g9.d dVar = bVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f41751a);
            if (dVar.f41752b || dVar.f41755e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f41752b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f41755e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f41753c || dVar.f41754d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f41753c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f41754d);
            }
            if (dVar.f41757g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f41757g);
                printWriter.print(" waiting=");
                dVar.f41757g.getClass();
                printWriter.println(false);
            }
            if (dVar.f41758h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.f41758h);
                printWriter.print(" waiting=");
                dVar.f41758h.getClass();
                printWriter.println(false);
            }
            if (bVar.f40266n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f40266n);
                i iVar = bVar.f40266n;
                iVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(iVar.f5552b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            g9.d dVar2 = bVar.l;
            Object obj = bVar.f4546e;
            Object obj2 = obj != e0.f4541k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bVar.f4544c > 0);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f40270a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
