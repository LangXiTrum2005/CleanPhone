package com.smartdigimkt.d7;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smartdigimkt.n8.l;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private static final String f = "ImageLoader";
    private static volatile b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f34480a;
    Context d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f34482c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<f>> f34483e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.d7.c<String, SoftReference<Bitmap>> f34481b = new c(((int) Runtime.getRuntime().maxMemory()) / 5);

    public class a implements Runnable {
        final /* synthetic */ Bitmap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ f f34484Y;
        final /* synthetic */ String Z;

        public a(Bitmap bitmap, f fVar, String str) {
            this.X = bitmap;
            this.f34484Y = fVar;
            this.Z = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.X;
            if (bitmap != null) {
                this.f34484Y.a(this.Z, bitmap);
            } else {
                this.f34484Y.a(this.Z, "Bitmap load fail");
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.d7.b$b, reason: collision with other inner class name */
    public class RunnableC0460b implements Runnable {
        final /* synthetic */ f X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34485Y;
        final /* synthetic */ String Z;

        public RunnableC0460b(f fVar, String str, String str2) {
            this.X = fVar;
            this.f34485Y = str;
            this.Z = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.f34485Y, this.Z);
        }
    }

    public class c extends com.smartdigimkt.d7.c<String, SoftReference<Bitmap>> {
        public c(int i2) {
            super(i2);
        }

        @Override // com.smartdigimkt.d7.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int c(String str, SoftReference<Bitmap> softReference) {
            Bitmap bitmap = softReference != null ? softReference.get() : null;
            if (b.this.f34480a == null) {
                b.this.f34480a = new HashMap(8);
            }
            if (bitmap != null) {
                int height = bitmap.getHeight() * bitmap.getRowBytes();
                b.this.f34480a.put(str, Integer.valueOf(height));
                return height;
            }
            Integer num = (Integer) b.this.f34480a.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // com.smartdigimkt.d7.c
        public void a(boolean z2, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            super.a(z2, str, softReference, softReference2);
            if (softReference != null) {
                try {
                    bitmap = softReference.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.f34480a != null) {
                b.this.f34480a.remove(str);
            }
            if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    }

    public class d implements Runnable {
        final /* synthetic */ com.smartdigimkt.d7.e X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f34487Y;
        final /* synthetic */ int Z;
        final /* synthetic */ f e0;

        public d(com.smartdigimkt.d7.e eVar, int i2, int i3, f fVar) {
            this.X = eVar;
            this.f34487Y = i2;
            this.Z = i3;
            this.e0 = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapA = b.this.a(this.X, this.f34487Y, this.Z);
            if (bitmapA == null || bitmapA.isRecycled()) {
                b.this.b(this.X, this.f34487Y, this.Z, this.e0);
                return;
            }
            b.this.a(this.X.f34508b, bitmapA);
            if (this.e0 != null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.e0);
                b.this.f34483e.put(this.X.f34508b, linkedList);
            }
            b.this.b(this.X.f34508b, bitmapA);
        }
    }

    public interface f {
        void a(String str, Bitmap bitmap);

        void a(String str, String str2);
    }

    private b(Context context) {
        this.d = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Bitmap bitmap) {
        synchronized (this.f34483e) {
            try {
                LinkedList<f> linkedList = (LinkedList) this.f34483e.remove(str);
                if (linkedList != null) {
                    for (f fVar : linkedList) {
                        if (fVar != null) {
                            com.smartdigimkt.l7.b.a().e(new a(bitmap, fVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class e implements com.smartdigimkt.f7.a.InterfaceC0483a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.d7.e f34490c;

        public e(int i2, int i3, com.smartdigimkt.d7.e eVar) {
            this.f34488a = i2;
            this.f34489b = i3;
            this.f34490c = eVar;
        }

        @Override // com.smartdigimkt.f7.a.InterfaceC0483a
        public void a(com.smartdigimkt.d7.e eVar) {
            String str = eVar.f34508b;
            Bitmap bitmapA = b.this.a(eVar, this.f34488a, this.f34489b);
            if (bitmapA != null) {
                b.this.a(eVar.f34508b, bitmapA);
            }
            b.this.b(this.f34490c.f34508b, bitmapA);
        }

        @Override // com.smartdigimkt.f7.a.InterfaceC0483a
        public void a(com.smartdigimkt.d7.e eVar, String str) {
            b.this.a(eVar.f34508b, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        synchronized (this.f34483e) {
            try {
                LinkedList<f> linkedList = (LinkedList) this.f34483e.remove(str);
                if (linkedList != null) {
                    for (f fVar : linkedList) {
                        if (fVar != null) {
                            com.smartdigimkt.l7.b.a().e(new RunnableC0460b(fVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public Bitmap b(com.smartdigimkt.d7.e eVar, int i2, int i3) {
        if (eVar != null && !TextUtils.isEmpty(eVar.f34508b)) {
            Bitmap bitmapA = a(eVar.f34508b);
            if (bitmapA != null && !bitmapA.isRecycled()) {
                return bitmapA;
            }
            Bitmap bitmapA2 = a(eVar, i2, i3);
            if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                a(eVar.f34508b, bitmapA2);
                return bitmapA2;
            }
        }
        return null;
    }

    public void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.f34481b.a(str, new SoftReference<>(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.d7.e eVar, int i2, int i3, f fVar) {
        synchronized (this.f34483e) {
            try {
                if (!this.f34483e.containsKey(eVar.f34508b)) {
                    if (fVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(fVar);
                        this.f34483e.put(eVar.f34508b, linkedList);
                    }
                    com.smartdigimkt.f7.a aVar = new com.smartdigimkt.f7.a(eVar);
                    aVar.a(new e(i2, i3, eVar));
                    aVar.f();
                } else {
                    LinkedList linkedList2 = (LinkedList) this.f34483e.get(eVar.f34508b);
                    if (linkedList2 != null && fVar != null && !linkedList2.contains(fVar)) {
                        linkedList2.add(fVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap a(String str) {
        SoftReference<Bitmap> softReferenceB = this.f34481b.b(str);
        if (softReferenceB != null) {
            return softReferenceB.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:9:0x0014, B:11:0x0022), top: B:34:0x0014 }] */
    public Bitmap a(com.smartdigimkt.d7.e eVar, int i2, int i3) {
        Bitmap bitmapA = null;
        if (eVar == null || TextUtils.isEmpty(eVar.f34508b)) {
            return null;
        }
        String strB = l.b(eVar.f34508b);
        if (i2 <= 0) {
            try {
                i2 = this.d.getResources().getDisplayMetrics().widthPixels;
                if (i3 <= 0) {
                    i3 = this.d.getResources().getDisplayMetrics().heightPixels;
                }
            } catch (Throwable unused) {
            }
        } else if (i3 <= 0) {
            i3 = this.d.getResources().getDisplayMetrics().heightPixels;
        }
        synchronized (this.f34482c) {
            FileInputStream fileInputStreamB = com.smartdigimkt.d7.d.c().b(eVar.f34507a, strB);
            if (fileInputStreamB == null) {
                return null;
            }
            try {
                bitmapA = com.smartdigimkt.o8.b.a(fileInputStreamB.getFD(), i2, i3);
            } catch (Throwable unused2) {
            }
            try {
                fileInputStreamB.close();
            } catch (Exception unused3) {
            }
            return bitmapA;
        }
    }

    public static b a(Context context) {
        if (g == null) {
            synchronized (b.class) {
                try {
                    if (g == null) {
                        g = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public void a(com.smartdigimkt.d7.e eVar, f fVar) {
        a(eVar, -1, -1, fVar);
    }

    public void a(com.smartdigimkt.d7.e eVar, int i2, int i3, f fVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.f34508b)) {
            if (fVar != null) {
                fVar.a("", "No url info.");
                return;
            }
            return;
        }
        Bitmap bitmapA = a(eVar.f34508b);
        if (bitmapA == null || bitmapA.isRecycled() || (bitmapA.getWidth() < i2 && bitmapA.getHeight() < i3)) {
            com.smartdigimkt.l7.b.a().g(new d(eVar, i2, i3, fVar));
        } else if (fVar != null) {
            fVar.a(eVar.f34508b, bitmapA);
        }
    }

    public void a() {
        try {
            com.smartdigimkt.d7.c<String, SoftReference<Bitmap>> cVar = this.f34481b;
            if (cVar != null) {
                cVar.c();
            }
            ConcurrentHashMap<String, List<f>> concurrentHashMap = this.f34483e;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }
}
