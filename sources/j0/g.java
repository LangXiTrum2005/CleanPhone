package j0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.recyclerview.widget.o1;
import com.google.android.gms.internal.auth.o;
import ea.a0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f43563a = new o1(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f43564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x.i f43566d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new g6.b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f43564b = threadPoolExecutor;
        f43565c = new Object();
        f43566d = new x.i(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((c) list.get(i11)).f43553g);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static f b(Context context, List list, String str, int i10) {
        int i11;
        Typeface typefaceA;
        o1 o1Var = f43563a;
        Trace.beginSection(o.z("getFontSync"));
        try {
            Typeface typeface = (Typeface) o1Var.g(str);
            if (typeface != null) {
                f fVar = new f(typeface);
                Trace.endSection();
                return fVar;
            }
            try {
                h hVarA = b.a(context, list);
                List list2 = hVarA.f43568b;
                int i12 = hVarA.f43567a;
                if (i12 == 0) {
                    i[] iVarArr = (i[]) list2.get(0);
                    if (iVarArr == null || iVarArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = iVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = iVarArr[i13].f43574f;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    f fVar2 = new f(i11);
                    Trace.endSection();
                    return fVar2;
                }
                if (list2.size() > 1) {
                    a0 a0Var = f0.d.f40262a;
                    Trace.beginSection(o.z("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceA = f0.d.f40262a.o(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    typefaceA = f0.d.a(context, (i[]) list2.get(0), i10);
                }
                if (typefaceA == null) {
                    f fVar3 = new f(-3);
                    Trace.endSection();
                    return fVar3;
                }
                o1Var.k(str, typefaceA);
                f fVar4 = new f(typefaceA);
                Trace.endSection();
                return fVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                f fVar5 = new f(-1);
                Trace.endSection();
                return fVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
