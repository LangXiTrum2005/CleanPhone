package u4;

import android.util.Log;
import com.google.android.gms.internal.ads.zs;
import d5.u;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.n;
import v0.i;
import xj.k;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f51888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zs f51891f;

    public f(Object value, String str, a aVar, int i10) {
        Collection collectionC;
        n.f(value, "value");
        u.n(i10, "verificationMode");
        this.f51888c = value;
        this.f51889d = str;
        this.f51890e = i10;
        String message = a.a.j(value, str);
        n.f(message, "message");
        zs zsVar = new zs(message, 11);
        StackTraceElement[] stackTrace = zsVar.getStackTrace();
        n.e(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(defpackage.e.h(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionC = v.f53866a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionC = k.C0(stackTrace);
            } else if (length == 1) {
                collectionC = j1.f.C(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i11 = length2 - length; i11 < length2; i11++) {
                    arrayList.add(stackTrace[i11]);
                }
                collectionC = arrayList;
            }
        }
        zsVar.setStackTrace((StackTraceElement[]) collectionC.toArray(new StackTraceElement[0]));
        this.f51891f = zsVar;
    }

    @Override // a.a
    public final Object g() throws zs {
        int iC = i.c(this.f51890e);
        if (iC == 0) {
            throw this.f51891f;
        }
        if (iC != 1) {
            if (iC == 2) {
                return null;
            }
            throw new aa.b((byte) 0, 20);
        }
        String message = a.a.j(this.f51888c, this.f51889d);
        n.f(message, "message");
        Log.d("g", message);
        return null;
    }

    @Override // a.a
    public final a.a G(String str, jk.b bVar) {
        return this;
    }
}
