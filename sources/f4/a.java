package f4;

import android.content.res.AssetManager;
import android.os.Build;
import b2.w;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.auth.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import tn.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f40621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f40622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f40623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Serializable f40624h;

    public a(bc.i composer, sn.b bVar, j jVar, a[] aVarArr) {
        n.f(composer, "composer");
        this.f40619c = composer;
        this.f40620d = bVar;
        this.f40621e = jVar;
        this.f40622f = aVarArr;
        this.f40623g = bVar.f50283a;
        int iOrdinal = jVar.ordinal();
        if (aVarArr != null) {
            a aVar = aVarArr[iOrdinal];
            if (aVar == null && aVar == this) {
                return;
            }
            aVarArr[iOrdinal] = this;
        }
    }

    public a a(pn.d descriptor) {
        a aVar;
        a[] aVarArr = (a[]) this.f40622f;
        n.f(descriptor, "descriptor");
        sn.b bVar = (sn.b) this.f40620d;
        j jVarF = tn.g.f(descriptor, bVar);
        char c4 = jVarF.f51607a;
        bc.i iVar = (bc.i) this.f40619c;
        iVar.d(c4);
        iVar.f5552b = true;
        String str = this.f40618b;
        if (str != null) {
            String strH = (String) this.f40624h;
            if (strH == null) {
                strH = descriptor.h();
            }
            iVar.b();
            j(str);
            iVar.d(':');
            j(strH);
            this.f40618b = null;
            this.f40624h = null;
        }
        if (((j) this.f40621e) == jVarF) {
            return this;
        }
        return (aVarArr == null || (aVar = aVarArr[jVarF.ordinal()]) == null) ? new a(iVar, bVar, jVarF, aVarArr) : aVar;
    }

    public void b(pn.d descriptor, int i10) {
        bc.i iVar = (bc.i) this.f40619c;
        n.f(descriptor, "descriptor");
        int iOrdinal = ((j) this.f40621e).ordinal();
        boolean z10 = true;
        if (iOrdinal == 1) {
            if (!iVar.f5552b) {
                iVar.d(',');
            }
            iVar.b();
            return;
        }
        if (iOrdinal == 2) {
            if (iVar.f5552b) {
                this.f40617a = true;
                iVar.b();
                return;
            }
            if (i10 % 2 == 0) {
                iVar.d(',');
                iVar.b();
            } else {
                iVar.d(':');
                iVar.f();
                z10 = false;
            }
            this.f40617a = z10;
            return;
        }
        if (iOrdinal != 3) {
            if (!iVar.f5552b) {
                iVar.d(',');
            }
            iVar.b();
            tn.g.e(descriptor, (sn.b) this.f40620d);
            j(descriptor.e(i10));
            iVar.d(':');
            iVar.f();
            return;
        }
        if (i10 == 0) {
            this.f40617a = true;
        }
        if (i10 == 1) {
            iVar.d(',');
            iVar.f();
            this.f40617a = false;
        }
    }

    public void c(int i10) {
        if (this.f40617a) {
            j(String.valueOf(i10));
        } else {
            ((w) ((bc.i) this.f40619c).f5553c).j(String.valueOf(i10));
        }
    }

    public void d(long j10) {
        if (this.f40617a) {
            j(String.valueOf(j10));
        } else {
            ((w) ((bc.i) this.f40619c).f5553c).j(String.valueOf(j10));
        }
    }

    public void e(pn.d descriptor, int i10, long j10) {
        n.f(descriptor, "descriptor");
        b(descriptor, i10);
        d(j10);
    }

    public void f() {
        bc.i iVar = (bc.i) this.f40619c;
        iVar.getClass();
        n.f("null", "v");
        ((w) iVar.f5553c).j("null");
    }

    public void g(pn.d descriptor, int i10, nn.a serializer, Object obj) {
        n.f(descriptor, "descriptor");
        n.f(serializer, "serializer");
        if (obj != null || ((hx0) this.f40623g).f15418b) {
            n.f(descriptor, "descriptor");
            n.f(serializer, "serializer");
            b(descriptor, i10);
            if (serializer.d().b()) {
                i(serializer, obj);
            } else if (obj == null) {
                f();
            } else {
                i(serializer, obj);
            }
        }
    }

    public void h(pn.d descriptor, int i10, nn.a serializer, Object obj) {
        n.f(descriptor, "descriptor");
        n.f(serializer, "serializer");
        b(descriptor, i10);
        i(serializer, obj);
    }

    public void i(nn.a serializer, Object obj) {
        String strDiscriminator;
        n.f(serializer, "serializer");
        hx0 hx0Var = ((sn.b) this.f40620d).f50283a;
        hx0Var.getClass();
        int iOrdinal = ((sn.a) hx0Var.f15422f).ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                o kind = serializer.d().getKind();
                if (n.a(kind, pn.f.f48503e) || n.a(kind, pn.f.f48506h)) {
                    pn.d dVarD = serializer.d();
                    n.f(dVarD, "<this>");
                    Iterator it = dVarD.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = (String) hx0Var.f15421e;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof sn.c) {
                            strDiscriminator = ((sn.c) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new aa.b((byte) 0, 20);
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strH = serializer.d().h();
            this.f40618b = strDiscriminator;
            this.f40624h = strH;
        }
        serializer.a(this, obj);
    }

    public void j(String value) {
        byte b10;
        n.f(value, "value");
        bc.i iVar = (bc.i) this.f40619c;
        iVar.getClass();
        n.f(value, "value");
        w wVar = (w) iVar.f5553c;
        wVar.c(wVar.f5410b, value.length() + 2);
        char[] cArr = (char[]) wVar.f5411c;
        int i10 = wVar.f5410b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c4 = cArr[i13];
            byte[] bArr = tn.i.f51600b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    wVar.c(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = tn.i.f51600b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) wVar.f5411c)[i13] = cCharAt;
                        i13 = i15;
                    } else if (b10 == 1) {
                        String str = tn.i.f51599a[cCharAt];
                        n.c(str);
                        wVar.c(i13, str.length());
                        str.getChars(0, str.length(), (char[]) wVar.f5411c, i13);
                        int length3 = str.length() + i13;
                        wVar.f5410b = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = (char[]) wVar.f5411c;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b10;
                        i13 += 2;
                        wVar.f5410b = i13;
                    }
                }
                wVar.c(i13, 1);
                ((char[]) wVar.f5411c)[i13] = '\"';
                wVar.f5410b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        wVar.f5410b = i12 + 1;
    }

    public void k(pn.d descriptor, int i10, String value) {
        n.f(descriptor, "descriptor");
        n.f(value, "value");
        b(descriptor, i10);
        j(value);
    }

    public void l(pn.d descriptor) {
        n.f(descriptor, "descriptor");
        j jVar = (j) this.f40621e;
        bc.i iVar = (bc.i) this.f40619c;
        iVar.getClass();
        iVar.f5552b = false;
        iVar.d(jVar.f51608b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((c) this.f40620d).f();
            return null;
        }
    }

    public void n(int i10, Serializable serializable) {
        ((Executor) this.f40619c).execute(new com.applovin.mediation.nativeAds.adPlacer.a(i10, 4, this, serializable));
    }

    public boolean o(pn.d dVar) {
        ((hx0) this.f40623g).getClass();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        ?? r2;
        this.f40617a = false;
        this.f40619c = executor;
        this.f40620d = cVar;
        this.f40618b = str;
        this.f40623g = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            r2 = d.f40637d;
        } else {
            r2 = i10 != 30 ? 0 : d.f40638e;
        }
        this.f40621e = r2;
    }
}
