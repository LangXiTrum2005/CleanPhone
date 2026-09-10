package fc;

import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b2.j;
import cc.e2;
import cc.k2;
import cc.q2;
import cc.s0;
import cc.t0;
import cc.u0;
import cc.u1;
import cc.v0;
import cc.w0;
import cc.z0;
import cc.z1;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.config.component.common.express.operator.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import zb.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f40769e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f40770f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dc.a f40771g = new dc.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f40772h = new j(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f40773i = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f40774a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f40775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f40776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f40777d;

    public d(f fVar, com.google.android.gms.internal.consent_sdk.d dVar, h hVar) {
        this.f40775b = fVar;
        this.f40776c = dVar;
        this.f40777d = hVar;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f40769e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f40769e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final q2 a(String str, final t0 t0Var) {
        String str2 = t0Var.f6283b;
        if (Build.VERSION.SDK_INT >= 37) {
            return (str2.equals("crash") || str2.equals("ndk-crash")) ? (q2) Optional.of(this.f40775b.r(str, "profiling-manager-info")).filter(new b(0)).flatMap(new v(2)).map(new Function() { // from class: fc.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    z1 z1Var = (z1) obj;
                    t0 t0Var2 = t0Var;
                    s0 s0VarA = t0Var2.a();
                    k2 k2Var = t0Var2.f6284c;
                    u0 u0VarA = k2Var.a();
                    w0 w0Var = (w0) ((v0) k2Var).f6311a;
                    List list = w0Var.f6320a;
                    e2 e2Var = w0Var.f6321b;
                    u1 u1Var = w0Var.f6322c;
                    z0 z0Var = w0Var.f6324e;
                    List list2 = w0Var.f6325f;
                    if (list2 != null) {
                        u0VarA.f6295a = new w0(list, e2Var, u1Var, z1Var, z0Var, list2);
                        s0VarA.f6271c = u0VarA.a();
                        return s0VarA.a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (list2 == null) {
                        sb2.append(" binaries");
                    }
                    throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
                }
            }).orElse(t0Var) : t0Var;
        }
        return t0Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.f40775b;
        arrayList.addAll(f.I(((File) fVar.f40785g).listFiles()));
        arrayList.addAll(f.I(((File) fVar.f40786h).listFiles()));
        j jVar = f40772h;
        Collections.sort(arrayList, jVar);
        List listI = f.I(((File) fVar.f40784f).listFiles());
        Collections.sort(listI, jVar);
        arrayList.addAll(listI);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(f.I(((File) this.f40775b.f40783e).list())).descendingSet();
    }

    public final void e(q2 q2Var, String str, boolean z10) {
        f fVar = this.f40775b;
        int i10 = this.f40776c.h().f42297a.f38703b;
        f40771g.getClass();
        try {
            g(fVar.r(str, defpackage.e.o(NotificationCompat.CATEGORY_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.f40774a.getAndIncrement())), z10 ? "_" : "")), dc.a.f38803a.y(q2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(1);
        fVar.getClass();
        File file = new File((File) fVar.f40783e, str);
        file.mkdirs();
        List<File> listI = f.I(file.listFiles(aVar));
        Collections.sort(listI, new j(3));
        int size = listI.size();
        for (File file2 : listI) {
            if (size <= i10) {
                return;
            }
            f.F(file2);
            size--;
        }
    }
}
