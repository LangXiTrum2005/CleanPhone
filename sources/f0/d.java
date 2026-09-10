package f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.o1;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.auth.o;
import com.unity3d.services.UnityAdsConstants;
import e0.g;
import ea.a0;
import ea.f2;
import j0.f;
import j0.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f40262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f40263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f40264c;

    static {
        Trace.beginSection(o.z("TypefaceCompat static init"));
        if (Build.VERSION.SDK_INT >= 31) {
            f40262a = new e();
        } else {
            f40262a = new a0();
        }
        f40263b = new o1(16);
        f40264c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, i[] iVarArr, int i10) {
        Trace.beginSection(o.z("TypefaceCompat.createFromFontInfo"));
        try {
            a0 a0Var = f40262a;
            a0Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyQ = a0Var.q(iVarArr, context.getContentResolver());
                if (fontFamilyQ != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(a0.p(fontFamilyQ, i10).getStyle()).build();
                }
            } catch (Exception e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            Trace.endSection();
            return typefaceBuild;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bf  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface b(Context context, e0.d dVar, Resources resources, int i10, String str, int i11, int i12, k3 k3Var) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i13 = 7;
        Typeface typefaceBuild2 = null;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        if (dVar instanceof g) {
            g gVar = (g) dVar;
            String str2 = gVar.f38998d;
            int i14 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = e(str2)) == null) {
                ArrayList arrayList = gVar.f38995a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList.size()) {
                                int i16 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i16 < arrayList.size()) {
                                        j0.c cVar = (j0.c) arrayList.get(i16);
                                        if (i16 == arrayList.size() - 1 && TextUtils.isEmpty(cVar.f43552f)) {
                                            customFallbackBuilder.setSystemFallback(cVar.f43551e);
                                        } else {
                                            String str3 = cVar.f43551e;
                                            String str4 = cVar.f43552f;
                                            Font fontF = f(e(str3));
                                            if (fontF == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + cVar.f43551e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontF).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(c.a(fontF).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (e(((j0.c) arrayList.get(i15)).f43551e) != null) {
                                i15++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = e(((j0.c) arrayList.get(0)).f43551e);
            }
            if (typefaceBuild != null) {
                new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(i13, k3Var, typefaceBuild));
                f40263b.k(d(resources, i10, str, i11, i12), typefaceBuild);
                return typefaceBuild;
            }
            byte b13 = gVar.f38997c == 0;
            int i17 = gVar.f38996b;
            Handler handler = new Handler(Looper.getMainLooper());
            od.c cVar2 = new od.c(i13, (boolean) (b12 == true ? 1 : 0));
            cVar2.f47386b = k3Var;
            ArrayList arrayList2 = gVar.f38995a;
            u uVar = new u(handler, 1);
            f2 f2Var = new f2(cVar2, b11 == true ? 1 : 0, uVar, 22);
            int i18 = 26;
            if (b13 != true) {
                String strA = j0.g.a(i12, arrayList2);
                Typeface typeface = (Typeface) j0.g.f43563a.g(strA);
                if (typeface != null) {
                    uVar.execute(new i0(i18, cVar2, typeface));
                    typefaceBuild2 = typeface;
                } else {
                    j0.e eVar = new j0.e(f2Var, b10 == true ? 1 : 0);
                    synchronized (j0.g.f43565c) {
                        try {
                            x.i iVar = j0.g.f43566d;
                            ArrayList arrayList3 = (ArrayList) iVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(eVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eVar);
                                iVar.put(strA, arrayList4);
                                j0.d dVar2 = new j0.d(strA, context, arrayList2, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = j0.g.f43564b;
                                j0.e eVar2 = new j0.e(strA, i14);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m0 m0Var = new m0(20);
                                m0Var.f11735c = dVar2;
                                m0Var.f11734b = eVar2;
                                m0Var.f11736d = handler2;
                                threadPoolExecutor.execute(m0Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                j0.c cVar3 = (j0.c) arrayList2.get(0);
                o1 o1Var = j0.g.f43563a;
                String strA2 = j0.g.a(i12, List.of(cVar3));
                Typeface typeface2 = (Typeface) j0.g.f43563a.g(strA2);
                if (typeface2 != null) {
                    uVar.execute(new i0(i18, cVar2, typeface2));
                    typefaceBuild2 = typeface2;
                } else if (i17 == -1) {
                    f fVarB = j0.g.b(context, List.of(cVar3), strA2, i12);
                    f2Var.x(fVarB);
                    typefaceBuild2 = fVarB.f43561a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    f fVar = (f) j0.g.f43564b.submit(new j0.d(strA2, context, cVar3, i12, 0)).get(i17, TimeUnit.MILLISECONDS);
                                    f2Var.x(fVar);
                                    typefaceBuild2 = fVar.f43561a;
                                } catch (ExecutionException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } catch (InterruptedException e11) {
                                throw e11;
                            }
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((u) f2Var.f39410c).execute(new androidx.lifecycle.a0((od.c) f2Var.f39409b, -3));
                    }
                }
            }
        } else {
            e0.e eVar3 = (e0.e) dVar;
            f40262a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (e0.f fVar2 : eVar3.f38989a) {
                    try {
                        try {
                            try {
                                Font fontBuild = new Font.Builder(resources, fVar2.f38994e).setWeight(fVar2.f38990a).setSlant(fVar2.f38991b ? 1 : 0).setTtcIndex(fVar2.f38993d).setFontVariationSettings(fVar2.f38992c).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                                if (typefaceBuild2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(i13, k3Var, typefaceBuild2));
                                } else {
                                    k3Var.a();
                                }
                                if (typefaceBuild2 != null) {
                                    f40263b.k(d(resources, i10, str, i11, i12), typefaceBuild2);
                                }
                                return typefaceBuild2;
                            }
                        } catch (IOException unused4) {
                        }
                    } catch (IOException unused5) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(a0.p(fontFamilyBuild2, i12).getStyle()).build();
                }
            } catch (Exception e13) {
                e = e13;
            }
            if (typefaceBuild2 != null) {
                new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(i13, k3Var, typefaceBuild2));
            } else {
                k3Var.a();
            }
        }
        if (typefaceBuild2 != null) {
            f40263b.k(d(resources, i10, str, i11, i12), typefaceBuild2);
        }
        return typefaceBuild2;
    }

    public static Typeface c(Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceBuild;
        f40262a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f40263b.k(d(resources, i10, str, i11, i12), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font f(Typeface typeface) {
        if (f40264c == null) {
            f40264c = new Paint();
        }
        f40264c.setTextSize(10.0f);
        f40264c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, f40264c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
