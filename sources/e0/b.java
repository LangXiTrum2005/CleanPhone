package e0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f38984a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f38985b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f38986c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f38987d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static int b(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f38986c;
        return f0.a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float c(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static d d(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i10;
        int i11;
        ?? r3;
        long j10;
        Throwable th2;
        ?? r10;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i10 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            f(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.a.f3314b);
        int i12 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i13 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.a.f3315c);
                        int i14 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i15 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i16 = typedArrayObtainAttributes2.getInt(i15, 0);
                        int i17 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i17, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i17);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            f(xmlResourceParser);
                        }
                        arrayList.add(new f(string7, i14, string6, i16, resourceId2, z10));
                    } else {
                        f(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List listE = e(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i13) {
            if (xmlResourceParser.getEventType() == i10) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.a.f3316d);
                    int i18 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i12);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i10);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j10 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                f(xmlResourceParser);
                            } catch (Throwable th3) {
                                th2 = th3;
                                r10 = typedArrayObtainAttributes3;
                                j10 = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            i11 = i18;
                            j10 = 1;
                            try {
                                j0.c cVar = new j0.c(string, string2, string8, listE, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r3;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z11 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService2.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(cVar);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r3 = typedArrayObtainAttributes3;
                            j10 = 1;
                            th2 = th;
                            r10 = r3;
                            if (r10 != 0) {
                                throw th2;
                            }
                            try {
                                if (!(r10 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r10).close();
                                    throw th2;
                                }
                                if (r10 instanceof ExecutorService) {
                                    r10.recycle();
                                    throw th2;
                                }
                                executorService = (ExecutorService) r10;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th2;
                                }
                                throw th2;
                            } catch (Throwable th6) {
                                th2.addSuppressed(th6);
                                throw th2;
                            }
                        }
                        th = th4;
                    } catch (Throwable th7) {
                        th = th7;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th2 = th;
                    r10 = r3;
                    if (r10 != 0) {
                        throw th2;
                    }
                    if (!(r10 instanceof AutoCloseable)) {
                        ((AutoCloseable) r10).close();
                        throw th2;
                    }
                    if (r10 instanceof ExecutorService) {
                        r10.recycle();
                        throw th2;
                    }
                    executorService = (ExecutorService) r10;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th2;
                    }
                    executorService.shutdown();
                    boolean z12 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j10, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z12) {
                                executorService.shutdownNow();
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
                i11 = integer;
                f(xmlResourceParser);
                integer = i11;
                string3 = string3;
                string4 = string4;
                i10 = 2;
                i12 = 0;
                i13 = 3;
            }
        }
        int i19 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i19, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new j0.c(string, string2, str, listE, null, null));
        if (str2 != null) {
            arrayList2.add(new j0.c(string, string2, str2, listE, null, null));
        }
        return new g(arrayList2, i19, integer2, string5);
    }

    public static List e(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static float g() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
