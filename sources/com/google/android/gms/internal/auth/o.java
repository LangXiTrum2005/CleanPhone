package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.webkit.HttpAuthHandler;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.measurement.nf;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.f4;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile v f22879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static eb.d0 f22880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Context f22881d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22882a;

    public /* synthetic */ o(int i10) {
        this.f22882a = i10;
    }

    public static final tl.q0 A(tl.y0 y0Var, l3.i typeTable) {
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        int i10 = y0Var.f51570c;
        if ((i10 & 4) == 4) {
            tl.q0 type = y0Var.f51573f;
            kotlin.jvm.internal.n.e(type, "type");
            return type;
        }
        if ((i10 & 8) == 8) {
            return typeTable.a(y0Var.f51574g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static int B(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static String C(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(D(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(D(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String D(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strJ = q4.a.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strJ.length() + 8 + name2.length() + 1);
            d5.u.r(sb2, "<", strJ, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static boolean E(byte b10) {
        return b10 > -65;
    }

    public static lo.d b() throws InterruptedException {
        lo.d dVar = lo.d.l;
        kotlin.jvm.internal.n.c(dVar);
        lo.d dVar2 = dVar.f45634f;
        if (dVar2 == null) {
            long jNanoTime = System.nanoTime();
            lo.d.f45630i.await(lo.d.f45631j, TimeUnit.MILLISECONDS);
            lo.d dVar3 = lo.d.l;
            kotlin.jvm.internal.n.c(dVar3);
            if (dVar3.f45634f != null || System.nanoTime() - jNanoTime < lo.d.f45632k) {
                return null;
            }
            return lo.d.l;
        }
        long jNanoTime2 = dVar2.f45635g - System.nanoTime();
        if (jNanoTime2 > 0) {
            lo.d.f45630i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        lo.d dVar4 = lo.d.l;
        kotlin.jvm.internal.n.c(dVar4);
        dVar4.f45634f = dVar2.f45634f;
        dVar2.f45634f = null;
        return dVar2;
    }

    public static void c(uk.f fVar, Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        if (com.google.android.gms.internal.play_billing.q1.q(fVar) == args.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(com.google.android.gms.internal.play_billing.q1.q(fVar));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(l1.d.i(sb2, args.length, " were provided."));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final String d(zk.e klass, rl.e typeMappingConfiguration) {
        kotlin.jvm.internal.n.f(klass, "klass");
        kotlin.jvm.internal.n.f(typeMappingConfiguration, "typeMappingConfiguration");
        zk.j jVarE = klass.e();
        kotlin.jvm.internal.n.e(jVarE, "klass.containingDeclaration");
        yl.f name = klass.getName();
        if (name != null) {
            yl.f fVar = yl.h.f54517a;
            if (name.f54515b) {
                name = yl.h.f54519c;
            }
        } else {
            name = yl.h.f54519c;
        }
        String strC = name.c();
        if (jVarE instanceof zk.b0) {
            yl.c cVar = ((cl.h0) ((zk.b0) jVarE)).f6518e;
            if (cVar.d()) {
                return strC;
            }
            return an.p.m0(cVar.b(), '.', '/') + '/' + strC;
        }
        zk.e eVar = jVarE instanceof zk.e ? (zk.e) jVarE : null;
        if (eVar == null) {
            throw new IllegalArgumentException("Unexpected container: " + jVarE + " for " + klass);
        }
        return d(eVar, typeMappingConfiguration) + '$' + strC;
    }

    public static com.bumptech.glide.h e(com.bumptech.glide.b bVar, ArrayList arrayList) {
        e6.k eVar;
        e6.k aVar;
        Class cls;
        h6.a aVar2 = bVar.f10458b;
        dm0 dm0Var = bVar.f10461e;
        com.bumptech.glide.e eVar2 = bVar.f10460d;
        Context applicationContext = eVar2.getApplicationContext();
        od.c cVar = eVar2.f10472g;
        com.bumptech.glide.h hVar = new com.bumptech.glide.h();
        n6.i iVar = new n6.i();
        h2.d dVar = hVar.f10486g;
        synchronized (dVar) {
            dVar.f42079a.add(iVar);
        }
        n6.r rVar = new n6.r();
        h2.d dVar2 = hVar.f10486g;
        synchronized (dVar2) {
            dVar2.f42079a.add(rVar);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = hVar.e();
        r6.a aVar3 = new r6.a(applicationContext, arrayListE, aVar2, dm0Var);
        n6.e0 e0Var = new n6.e0(aVar2, new jj.d(28));
        n6.n nVar = new n6.n(hVar.e(), resources.getDisplayMetrics(), aVar2, dm0Var);
        if (((Map) cVar.f47386b).containsKey(com.bumptech.glide.c.class)) {
            aVar = new n6.f(1);
            eVar = new n6.f(0);
        } else {
            eVar = new n6.e(nVar, 0);
            aVar = new n6.a(2, nVar, dm0Var);
        }
        hVar.d("Animation", InputStream.class, Drawable.class, new p6.a(new m5.k(8, arrayListE, dm0Var), 1));
        hVar.d("Animation", ByteBuffer.class, Drawable.class, new p6.a(new m5.k(8, arrayListE, dm0Var), 0));
        p6.c cVar2 = new p6.c(applicationContext);
        n6.b bVar2 = new n6.b(dm0Var);
        b2.w wVar = new b2.w((byte) 0, 19);
        s6.c cVar3 = new s6.c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        hVar.a(ByteBuffer.class, new k6.a0(5));
        hVar.a(InputStream.class, new od.c(dm0Var, 16));
        hVar.d("Bitmap", ByteBuffer.class, Bitmap.class, eVar);
        hVar.d("Bitmap", InputStream.class, Bitmap.class, aVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            hVar.d("Bitmap", cls, Bitmap.class, new n6.e(nVar, 1));
        }
        hVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new n6.e0(aVar2, new j2.n(27)));
        hVar.d("Bitmap", cls, Bitmap.class, e0Var);
        k6.a0 a0Var = k6.a0.f44329b;
        hVar.c(Bitmap.class, Bitmap.class, a0Var);
        hVar.d("Bitmap", Bitmap.class, Bitmap.class, new n6.z(0));
        hVar.b(Bitmap.class, bVar2);
        hVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new n6.a(resources, eVar));
        hVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new n6.a(resources, aVar));
        hVar.d("BitmapDrawable", cls, BitmapDrawable.class, new n6.a(resources, e0Var));
        hVar.b(BitmapDrawable.class, new m0.s1(8, aVar2, bVar2));
        hVar.d("Animation", InputStream.class, r6.c.class, new r6.i(arrayListE, aVar3, dm0Var));
        hVar.d("Animation", ByteBuffer.class, r6.c.class, aVar3);
        hVar.b(r6.c.class, new ne.c(10));
        hVar.c(d6.d.class, d6.d.class, a0Var);
        hVar.d("Bitmap", d6.d.class, Bitmap.class, new n6.c(aVar2));
        hVar.d("legacy_append", Uri.class, Drawable.class, cVar2);
        hVar.d("legacy_append", Uri.class, Bitmap.class, new n6.a(1, cVar2, aVar2));
        hVar.h(new com.bumptech.glide.load.data.h(2));
        hVar.c(File.class, ByteBuffer.class, new k6.a0(6));
        hVar.c(File.class, InputStream.class, new k6.g(new k6.a0(9)));
        hVar.d("legacy_append", File.class, File.class, new n6.z(2));
        hVar.c(File.class, cls, new k6.g(new k6.a0(8)));
        hVar.c(File.class, File.class, a0Var);
        hVar.h(new com.bumptech.glide.load.data.m(dm0Var));
        if (!"robolectric".equals(str)) {
            hVar.h(new com.bumptech.glide.load.data.h(1));
        }
        f7.a aVar4 = new f7.a(applicationContext, 1);
        i6.d dVar3 = new i6.d(applicationContext, false);
        f4 f4Var = new f4(applicationContext, 1, false);
        Class cls2 = Integer.TYPE;
        hVar.c(cls2, InputStream.class, aVar4);
        hVar.c(Integer.class, InputStream.class, aVar4);
        hVar.c(cls2, AssetFileDescriptor.class, dVar3);
        hVar.c(Integer.class, AssetFileDescriptor.class, dVar3);
        hVar.c(cls2, Drawable.class, f4Var);
        hVar.c(Integer.class, Drawable.class, f4Var);
        int i10 = 2;
        hVar.c(Uri.class, InputStream.class, new f7.a(applicationContext, i10));
        hVar.c(Uri.class, AssetFileDescriptor.class, new f4(applicationContext, i10, false));
        k6.y yVar = new k6.y(resources);
        am.e eVar3 = new am.e(resources, 14);
        od.c cVar4 = new od.c(resources, 15);
        hVar.c(Integer.class, Uri.class, yVar);
        hVar.c(cls2, Uri.class, yVar);
        hVar.c(Integer.class, AssetFileDescriptor.class, eVar3);
        hVar.c(cls2, AssetFileDescriptor.class, eVar3);
        hVar.c(Integer.class, InputStream.class, cVar4);
        hVar.c(cls2, InputStream.class, cVar4);
        hVar.c(String.class, InputStream.class, new od.c(14));
        hVar.c(Uri.class, InputStream.class, new od.c(14));
        hVar.c(String.class, InputStream.class, new k6.a0(13));
        hVar.c(String.class, cls, new k6.a0(12));
        hVar.c(String.class, AssetFileDescriptor.class, new k6.a0(11));
        hVar.c(Uri.class, InputStream.class, new am.e(applicationContext.getAssets(), 13));
        hVar.c(Uri.class, AssetFileDescriptor.class, new n5.f(applicationContext.getAssets(), 20));
        hVar.c(Uri.class, InputStream.class, new f7.a(applicationContext, 4));
        hVar.c(Uri.class, InputStream.class, new e5.f(applicationContext, 2));
        hVar.c(Uri.class, InputStream.class, new l6.b(applicationContext, InputStream.class));
        hVar.c(Uri.class, cls, new l6.b(applicationContext, cls));
        hVar.c(Uri.class, InputStream.class, new am.e(contentResolver, 15));
        hVar.c(Uri.class, cls, new n5.f(contentResolver, 22));
        hVar.c(Uri.class, AssetFileDescriptor.class, new s4.i(contentResolver));
        hVar.c(Uri.class, InputStream.class, new k6.a0(14));
        hVar.c(URL.class, InputStream.class, new j2.n(12));
        hVar.c(Uri.class, File.class, new e5.f(applicationContext, 1));
        hVar.c(k6.h.class, InputStream.class, new n5.f(24));
        hVar.c(byte[].class, ByteBuffer.class, new k6.a0(2));
        hVar.c(byte[].class, InputStream.class, new k6.a0(4));
        hVar.c(Uri.class, Uri.class, a0Var);
        hVar.c(Drawable.class, Drawable.class, a0Var);
        hVar.d("legacy_append", Drawable.class, Drawable.class, new n6.z(1));
        hVar.i(Bitmap.class, BitmapDrawable.class, new k6.y(resources));
        hVar.i(Bitmap.class, byte[].class, wVar);
        hVar.i(Drawable.class, byte[].class, new r1.s(aVar2, wVar, cVar3, 2));
        hVar.i(r6.c.class, byte[].class, cVar3);
        n6.e0 e0Var2 = new n6.e0(aVar2, new jj.d(27));
        hVar.d("legacy_append", ByteBuffer.class, Bitmap.class, e0Var2);
        hVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new n6.a(resources, e0Var2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.measurement.f2.j(it);
        }
        return hVar;
    }

    public static al.c f(al.j jVar, yl.c fqName) {
        Object next;
        kotlin.jvm.internal.n.f(fqName, "fqName");
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.n.a(((al.c) next).e(), fqName)) {
                return (al.c) next;
            }
        }
        next = null;
        return (al.c) next;
    }

    public static xn.r g(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return xn.r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return xn.r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return xn.r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return xn.r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return xn.r.SPDY_3;
        }
        if (str.equals("quic")) {
            return xn.r.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static ColorStateList h(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        e0.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        e0.i iVar = new e0.i(resources, theme);
        synchronized (e0.j.f39006c) {
            try {
                SparseArray sparseArray = (SparseArray) e0.j.f39005b.get(iVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (hVar = (e0.h) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (hVar.f39000b.equals(resources.getConfiguration())) {
                        if (theme != null || hVar.f39001c != 0) {
                            if (theme == null || hVar.f39001c != theme.hashCode()) {
                            }
                        }
                        colorStateList = hVar.f38999a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = e0.j.f39004a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = e0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i10, theme);
        }
        synchronized (e0.j.f39006c) {
            try {
                WeakHashMap weakHashMap = e0.j.f39005b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i10, new e0.h(colorStateListA, iVar.f39002a.getConfiguration(), theme));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return colorStateListA;
    }

    public static Drawable i(Context context, int i10) {
        return p.h2.b().c(context, i10);
    }

    public static final int j(Cursor cursor, String str) {
        kotlin.jvm.internal.n.f(cursor, "<this>");
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public static final long k(Cursor cursor, String str) {
        kotlin.jvm.internal.n.f(cursor, "<this>");
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public static int l(List list, InputStream inputStream, dm0 dm0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new n6.v(inputStream, dm0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int iB = ((e6.e) list.get(i10)).b(inputStream, dm0Var);
                inputStream.reset();
                if (iB != -1) {
                    return iB;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return -1;
    }

    public static final String m(Cursor cursor, String columnName) {
        String string;
        kotlin.jvm.internal.n.f(cursor, "<this>");
        kotlin.jvm.internal.n.f(columnName, "columnName");
        int columnIndex = cursor.getColumnIndex(columnName);
        return (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) ? "" : string;
    }

    public static final String n(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    public static ImageHeaderParser$ImageType o(List list, InputStream inputStream, dm0 dm0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new n6.v(inputStream, dm0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((e6.e) list.get(i10)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType p(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((e6.e) list.get(i10)).a(byteBuffer);
                AtomicReference atomicReference = a7.c.f3418a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th2) {
                AtomicReference atomicReference2 = a7.c.f3418a;
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final List q(Iterable iterable) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        an.r rVarG0 = xj.n.g0(iterable);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (Iterable) rVarG0.f3793b) {
            String str = simpleDateFormat.format(((dh.b) obj).f38882g);
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return zm.l.W(zm.l.U(new hk.i(2, xj.n.g0(linkedHashMap.entrySet()), new ae.l(4)), new bh.a(0)));
    }

    public static boolean r(al.j jVar, yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return jVar.d(fqName) != null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de A[EDGE_INSN: B:79:0x01de->B:82:0x020f BREAK  A[LOOP:1: B:74:0x01c9->B:173:?]] */
    public static final Object s(pm.y kotlinType, rl.q qVar, jk.d writeGenericType) {
        rl.h hVarD;
        pm.y yVar;
        rl.q qVar2;
        Object objS;
        int iC;
        rl.i iVar;
        boolean z10;
        pm.r rVarG;
        rl.e eVar = rl.e.f49628d;
        kotlin.jvm.internal.n.f(kotlinType, "kotlinType");
        boolean z11 = qVar.f49649c;
        kotlin.jvm.internal.n.f(writeGenericType, "writeGenericType");
        byte b10 = 0;
        if (a.a.y(kotlinType)) {
            cl.g0 g0Var = wk.n.f53378a;
            a.a.y(kotlinType);
            wk.h hVarH = qk.i0.H(kotlinType);
            al.j annotations = kotlinType.getAnnotations();
            pm.y yVarU = a.a.u(kotlinType);
            List listQ = a.a.q(kotlinType);
            List listV = a.a.v(kotlinType);
            ArrayList arrayList = new ArrayList(xj.p.W(listV, 10));
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(((pm.q0) it.next()).b());
            }
            pm.j0.f48443b.getClass();
            pm.j0 j0Var = pm.j0.f48444c;
            pm.n0 n0VarN = wk.n.f53378a.n();
            a.a.w(kotlinType);
            pm.y yVarB = ((pm.q0) xj.n.w0(kotlinType.t())).b();
            kotlin.jvm.internal.n.e(yVarB, "arguments.last().type");
            ArrayList arrayListD0 = xj.n.D0(arrayList, pm.f.r(j1.f.C(qk.i0.d(yVarB)), j0Var, n0VarN, false));
            pm.c0 c0VarO = qk.i0.H(kotlinType).o();
            kotlin.jvm.internal.n.e(c0VarO, "suspendFunType.builtIns.nullableAnyType");
            return s(a.a.i(hVarH, annotations, yVarU, listQ, arrayListD0, c0VarO, false).i0(kotlinType.Q()), qVar, writeGenericType);
        }
        pm.c0 c0VarH = qm.g.h(kotlinType);
        if (c0VarH == null && ((rVarG = qm.g.g(kotlinType)) == null || (c0VarH = qm.g.N(rVarG)) == null)) {
            c0VarH = qm.g.h(kotlinType);
            kotlin.jvm.internal.n.c(c0VarH);
        }
        pm.n0 receiver = qm.g.W(c0VarH);
        Object objD = null;
        if (qm.g.y(receiver)) {
            kotlin.jvm.internal.n.f(receiver, "$receiver");
            if (!(receiver instanceof pm.n0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, receiver.getClass(), sb2).toString());
            }
            zk.g gVarE = receiver.e();
            kotlin.jvm.internal.n.d(gVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            wk.j jVarT = wk.h.t((zk.e) gVarE);
            if (jVarT != null) {
                switch (jVarT.ordinal()) {
                    case 0:
                        iVar = rl.j.f49635a;
                        break;
                    case 1:
                        iVar = rl.j.f49636b;
                        break;
                    case 2:
                        iVar = rl.j.f49637c;
                        break;
                    case 3:
                        iVar = rl.j.f49638d;
                        break;
                    case 4:
                        iVar = rl.j.f49639e;
                        break;
                    case 5:
                        iVar = rl.j.f49640f;
                        break;
                    case 6:
                        iVar = rl.j.f49641g;
                        break;
                    case 7:
                        iVar = rl.j.f49642h;
                        break;
                    default:
                        throw new aa.b(b10, 20);
                }
                if (qm.g.H(kotlinType)) {
                    z10 = true;
                } else {
                    yl.c ENHANCED_NULLABILITY_ANNOTATION = il.y.f43134p;
                    kotlin.jvm.internal.n.e(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (qm.g.u(kotlinType, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                objD = j1.f.c(iVar, z10);
            } else {
                kotlin.jvm.internal.n.f(receiver, "$receiver");
                if (!(receiver instanceof pm.n0)) {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(receiver);
                    sb3.append(", ");
                    throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, receiver.getClass(), sb3).toString());
                }
                zk.g gVarE2 = receiver.e();
                kotlin.jvm.internal.n.d(gVarE2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                wk.j jVarR = wk.h.r((zk.e) gVarE2);
                if (jVarR != null) {
                    StringBuilder sb4 = new StringBuilder(X3.j.f27834d);
                    gm.c cVar = (gm.c) gm.c.f41970o.get(jVarR);
                    if (cVar == null) {
                        gm.c.a(4);
                        throw null;
                    }
                    sb4.append(cVar.d());
                    objD = rl.e.b(sb4.toString());
                } else {
                    kotlin.jvm.internal.n.f(receiver, "$receiver");
                    if (!(receiver instanceof pm.n0)) {
                        StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb5.append(receiver);
                        sb5.append(", ");
                        throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, receiver.getClass(), sb5).toString());
                    }
                    zk.g gVarE3 = receiver.e();
                    if (gVarE3 != null && wk.h.I(gVarE3)) {
                        kotlin.jvm.internal.n.f(receiver, "$receiver");
                        if (!(receiver instanceof pm.n0)) {
                            StringBuilder sb6 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb6.append(receiver);
                            sb6.append(", ");
                            throw new IllegalArgumentException(q4.a.k(kotlin.jvm.internal.d0.f44761a, receiver.getClass(), sb6).toString());
                        }
                        zk.g gVarE4 = receiver.e();
                        kotlin.jvm.internal.n.d(gVarE4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        yl.e eVarH = fm.e.h((zk.e) gVarE4);
                        String str = yk.d.f54447a;
                        yl.b bVarF = yk.d.f(eVarH);
                        if (bVarF != null) {
                            if (!qVar.f49653g) {
                                List list = yk.d.f54459n;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it2 = list.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            String strE = gm.b.b(bVarF).e();
                                            kotlin.jvm.internal.n.e(strE, "byClassId(classId).internalName");
                                            objD = rl.e.d(strE);
                                            break;
                                        }
                                    } while (!((yk.c) it2.next()).f54444a.equals(bVarF));
                                } else {
                                    String strE2 = gm.b.b(bVarF).e();
                                    kotlin.jvm.internal.n.e(strE2, "byClassId(classId).internalName");
                                    objD = rl.e.d(strE2);
                                    break;
                                }
                            } else {
                                String strE3 = gm.b.b(bVarF).e();
                                kotlin.jvm.internal.n.e(strE3, "byClassId(classId).internalName");
                                objD = rl.e.d(strE3);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (objD != null) {
            Object objC = j1.f.c(objD, qVar.f49647a);
            writeGenericType.invoke(kotlinType, objC, qVar);
            return objC;
        }
        pm.n0 n0VarP = kotlinType.P();
        if (n0VarP instanceof pm.x) {
            pm.x xVar = (pm.x) n0VarP;
            pm.y yVar2 = xVar.f48484a;
            if (yVar2 != null) {
                return s(qk.i0.h0(yVar2), qVar, writeGenericType);
            }
            LinkedHashSet types = xVar.f48485b;
            kotlin.jvm.internal.n.f(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + xj.n.u0(types, null, null, null, null, 63));
        }
        zk.g gVarE5 = n0VarP.e();
        if (gVarE5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (rm.i.f(gVarE5)) {
            return rl.e.d("error/NonExistentClass");
        }
        boolean z12 = gVarE5 instanceof zk.e;
        if (z12 && wk.h.y(kotlinType)) {
            if (kotlinType.t().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            pm.q0 q0Var = (pm.q0) kotlinType.t().get(0);
            pm.y yVarB2 = q0Var.b();
            kotlin.jvm.internal.n.e(yVarB2, "memberProjection.type");
            if (q0Var.a() == 2) {
                objS = rl.e.d("java/lang/Object");
            } else {
                int iA = q0Var.a();
                d5.u.u(iA, "memberProjection.projectionKind");
                if (z11 || ((iC = v0.i.c(iA)) == 0 ? (qVar2 = qVar.f49655i) == null : !(iC == 1 ? (qVar2 = qVar.f49654h) != null : (qVar2 = qVar.f49652f) != null))) {
                    qVar2 = qVar;
                }
                objS = s(yVarB2, qVar2, writeGenericType);
            }
            return rl.e.b(X3.j.f27834d + rl.e.h((rl.j) objS));
        }
        if (!z12) {
            if (gVarE5 instanceof zk.m0) {
                pm.y yVarO = qk.i0.O((zk.m0) gVarE5);
                if (kotlinType.Q()) {
                    yVarO = qk.i0.T(yVarO);
                }
                return s(yVarO, qVar, ym.c.f54544e);
            }
            if ((gVarE5 instanceof nm.s) && qVar.f49656j) {
                return s(((nm.s) gVarE5).K0(), qVar, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (bm.g.b(gVarE5) && !qVar.f49648b && (yVar = (pm.y) pm.c.d(kotlinType, new HashSet())) != null) {
            return s(yVar, new rl.q(qVar.f49647a, true, qVar.f49649c, qVar.f49650d, qVar.f49651e, qVar.f49652f, qVar.f49653g, qVar.f49654h, qVar.f49655i, 512), writeGenericType);
        }
        if (z11 && wk.h.b((zk.e) gVarE5, wk.l.P)) {
            hVarD = rl.e.d("java/lang/Class");
        } else {
            zk.e eVar2 = (zk.e) gVarE5;
            kotlin.jvm.internal.n.e(eVar2.a(), "descriptor.original");
            if (eVar2.l0() == 4) {
                zk.j jVarE = eVar2.e();
                kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                eVar2 = (zk.e) jVarE;
            }
            zk.e eVarA = eVar2.a();
            kotlin.jvm.internal.n.e(eVarA, "enumClassIfEnumEntry.original");
            hVarD = rl.e.d(d(eVarA, eVar));
        }
        writeGenericType.invoke(kotlinType, hVarD, qVar);
        return hVarD;
    }

    public static final tl.q0 t(tl.q0 q0Var, l3.i iVar) {
        kotlin.jvm.internal.n.f(q0Var, "<this>");
        int i10 = q0Var.f51412c;
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            return q0Var.f51421m;
        }
        if ((i10 & 512) == 512) {
            return iVar.a(q0Var.f51422n);
        }
        return null;
    }

    public static final tl.q0 u(tl.y yVar, l3.i typeTable) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        int i10 = yVar.f51551c;
        if ((i10 & 32) == 32) {
            return yVar.f51558j;
        }
        if ((i10 & 64) == 64) {
            return typeTable.a(yVar.f51559k);
        }
        return null;
    }

    public static final tl.q0 v(tl.y yVar, l3.i typeTable) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        int i10 = yVar.f51551c;
        if ((i10 & 8) == 8) {
            tl.q0 returnType = yVar.f51555g;
            kotlin.jvm.internal.n.e(returnType, "returnType");
            return returnType;
        }
        if ((i10 & 16) == 16) {
            return typeTable.a(yVar.f51556h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final tl.q0 w(tl.g0 g0Var, l3.i typeTable) {
        kotlin.jvm.internal.n.f(g0Var, "<this>");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        int i10 = g0Var.f51239c;
        if ((i10 & 8) == 8) {
            tl.q0 returnType = g0Var.f51243g;
            kotlin.jvm.internal.n.e(returnType, "returnType");
            return returnType;
        }
        if ((i10 & 16) == 16) {
            return typeTable.a(g0Var.f51244h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static void x(xi.f binaryMessenger, final tj.h hVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar2 = (hVar == null || (nfVar = hVar.f50828a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", hVar2, obj);
        if (hVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.z
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i11 = i10;
                    h hVar3 = hVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                hVar3.getClass();
                                listQ = j1.f.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                hVar3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                hVar3.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", hVar2, obj);
        if (hVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.z
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i12 = i11;
                    h hVar3 = hVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                hVar3.getClass();
                                listQ = j1.f.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                hVar3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                hVar3.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", hVar2, obj);
        if (hVar == null) {
            gVar3.C(null);
        } else {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.z
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    int i13 = i12;
                    h hVar3 = hVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                hVar3.getClass();
                                listQ = j1.f.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                hVar3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                hVar3.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019a  */
    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad A[PHI: r2
  0x01ad: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:99:0x0198, B:101:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c A[Catch: all -> 0x014e, TRY_ENTER, TryCatch #3 {all -> 0x014e, blocks: (B:40:0x00d6, B:57:0x00f7, B:62:0x0117, B:72:0x0146, B:58:0x00fe, B:59:0x0109, B:60:0x010a, B:61:0x0111, B:84:0x015c, B:86:0x016c, B:88:0x0173, B:90:0x017b, B:92:0x0182, B:94:0x018a, B:95:0x018e), top: B:115:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x016c A[Catch: all -> 0x014e, TryCatch #3 {all -> 0x014e, blocks: (B:40:0x00d6, B:57:0x00f7, B:62:0x0117, B:72:0x0146, B:58:0x00fe, B:59:0x0109, B:60:0x010a, B:61:0x0111, B:84:0x015c, B:86:0x016c, B:88:0x0173, B:90:0x017b, B:92:0x0182, B:94:0x018a, B:95:0x018e), top: B:115:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0172  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b A[Catch: all -> 0x014e, TryCatch #3 {all -> 0x014e, blocks: (B:40:0x00d6, B:57:0x00f7, B:62:0x0117, B:72:0x0146, B:58:0x00fe, B:59:0x0109, B:60:0x010a, B:61:0x0111, B:84:0x015c, B:86:0x016c, B:88:0x0173, B:90:0x017b, B:92:0x0182, B:94:0x018a, B:95:0x018e), top: B:115:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x018a A[Catch: all -> 0x014e, TryCatch #3 {all -> 0x014e, blocks: (B:40:0x00d6, B:57:0x00f7, B:62:0x0117, B:72:0x0146, B:58:0x00fe, B:59:0x0109, B:60:0x010a, B:61:0x0111, B:84:0x015c, B:86:0x016c, B:88:0x0173, B:90:0x017b, B:92:0x0182, B:94:0x018a, B:95:0x018e), top: B:115:0x00d6 }] */
    public static e8.a y(Cursor cursor, Context context, boolean z10, int i10) {
        int i11;
        Uri uriWithAppendedId;
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        long j10;
        long j11;
        int i12;
        String str;
        int i13 = 1;
        boolean z11 = (i10 & 2) != 0 ? true : z10;
        boolean z12 = (i10 & 4) != 0;
        kotlin.jvm.internal.n.f(cursor, "<this>");
        kotlin.jvm.internal.n.f(context, "context");
        long jK = k(cursor, "_id");
        String strM = m(cursor, "_data");
        if (z11 && !an.h.y0(strM) && !new File(strM).exists()) {
            if (!z12) {
                return null;
            }
            throw new RuntimeException("Asset (" + jK + ") does not exists at its path (" + strM + ").");
        }
        g8.f.f41737a.getClass();
        long jK2 = k(cursor, "datetaken") / ((long) 1000);
        if (jK2 == 0) {
            jK2 = k(cursor, "date_added");
        }
        int iJ = j(cursor, "media_type");
        String strM2 = m(cursor, "mime_type");
        long jK3 = iJ != 1 ? k(cursor, IronSourceConstants.EVENTS_DURATION) : 0L;
        int iJ2 = j(cursor, "width");
        int iJ3 = j(cursor, "height");
        String strM3 = m(cursor, "_display_name");
        long jK4 = k(cursor, "date_modified");
        int iJ4 = j(cursor, "orientation");
        boolean z13 = j(cursor, "is_favorite") == 1;
        boolean z14 = j(cursor, "is_trashed") == 1;
        String strM4 = m(cursor, "relative_path");
        if (iJ2 == 0 || iJ3 == 0) {
            if (iJ == 1) {
                try {
                    if (!an.h.q0(strM2, "svg", false)) {
                        if (iJ == 1) {
                            i11 = 1;
                        } else if (iJ != 2) {
                            i11 = iJ != 3 ? 0 : 2;
                        } else {
                            i11 = 3;
                        }
                        if (i11 == 1) {
                            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, jK);
                        } else if (i11 == 2) {
                            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, jK);
                        } else {
                            if (i11 != 3) {
                                throw new RuntimeException(l1.d.e(i11, "Unexpected asset type "));
                            }
                            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, jK);
                        }
                        kotlin.jvm.internal.n.c(uriWithAppendedId);
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriWithAppendedId);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                a1.h hVar = new a1.h(inputStreamOpenInputStream);
                                String strC = hVar.c("ImageWidth");
                                if (strC != null) {
                                    iJ2 = Integer.parseInt(strC);
                                }
                                String strC2 = hVar.c("ImageLength");
                                if (strC2 != null) {
                                    iJ3 = Integer.parseInt(strC2);
                                }
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th2) {
                                int i14 = iJ2;
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    try {
                                        qk.i0.j(inputStreamOpenInputStream, th2);
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        iJ2 = i14;
                                        l8.a.b(th);
                                        int i15 = iJ4;
                                        int i16 = iJ3;
                                        int i17 = iJ2;
                                        if (iJ != 1) {
                                            i13 = 3;
                                            if (iJ != 2) {
                                                long j12 = jK3;
                                                j10 = jK2;
                                                j11 = j12;
                                                str = strM2;
                                                if (iJ != 3) {
                                                    i12 = 0;
                                                } else {
                                                    i12 = 2;
                                                }
                                            } else {
                                                long j13 = jK3;
                                                j10 = jK2;
                                                j11 = j13;
                                                i12 = i13;
                                                str = strM2;
                                            }
                                        } else {
                                            long j14 = jK3;
                                            j10 = jK2;
                                            j11 = j14;
                                            i12 = i13;
                                            str = strM2;
                                        }
                                        return new e8.a(jK, strM, j11, j10, i17, i16, i12, strM3, jK4, i15, z13, z14, strM4, str);
                                    }
                                }
                            }
                        }
                    } else if (iJ == 3) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(strM);
                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        if (strExtractMetadata != null) {
                            iJ2 = Integer.parseInt(strExtractMetadata);
                        } else {
                            iJ2 = 0;
                        }
                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        if (strExtractMetadata2 != null) {
                            iJ3 = Integer.parseInt(strExtractMetadata2);
                        } else {
                            iJ3 = 0;
                        }
                        strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        if (strExtractMetadata3 != null) {
                            iJ4 = Integer.parseInt(strExtractMetadata3);
                        }
                        mediaMetadataRetriever.close();
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else if (iJ == 3) {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                mediaMetadataRetriever2.setDataSource(strM);
                strExtractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                if (strExtractMetadata != null) {
                    iJ2 = Integer.parseInt(strExtractMetadata);
                } else {
                    iJ2 = 0;
                }
                strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                if (strExtractMetadata2 != null) {
                    iJ3 = Integer.parseInt(strExtractMetadata2);
                } else {
                    iJ3 = 0;
                }
                strExtractMetadata3 = mediaMetadataRetriever2.extractMetadata(24);
                if (strExtractMetadata3 != null) {
                    iJ4 = Integer.parseInt(strExtractMetadata3);
                }
                mediaMetadataRetriever2.close();
            }
        }
        int i18 = iJ4;
        int i19 = iJ3;
        int i110 = iJ2;
        if (iJ != 1) {
            i13 = 3;
            if (iJ != 2) {
                long j15 = jK3;
                j10 = jK2;
                j11 = j15;
                str = strM2;
                if (iJ != 3) {
                    i12 = 0;
                } else {
                    i12 = 2;
                }
            } else {
                long j16 = jK3;
                j10 = jK2;
                j11 = j16;
                i12 = i13;
                str = strM2;
            }
        } else {
            long j17 = jK3;
            j10 = jK2;
            j11 = j17;
            i12 = i13;
            str = strM2;
        }
        return new e8.a(jK, strM, j11, j10, i110, i19, i12, strM3, jK4, i18, z13, z14, strM4, str);
    }

    public static String z(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public abstract j9.o a();

    public int hashCode() {
        switch (this.f22882a) {
            case 14:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f22882a) {
            case 14:
                String strG = kotlin.jvm.internal.d0.f44761a.b(getClass()).g();
                kotlin.jvm.internal.n.c(strG);
                return strG;
            default:
                return super.toString();
        }
    }
}
