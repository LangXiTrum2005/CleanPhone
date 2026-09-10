package com.thinkup.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.ooo.on;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static final String m = "ImageLoader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile m f42358n;
    Context o;
    private Map<String, Integer> o0;
    private final Object om = new Object();
    private final ConcurrentHashMap<String, List<o>> on = new ConcurrentHashMap<>();
    private n<String, SoftReference<Bitmap>> oo = new n<String, SoftReference<Bitmap>>(((int) Runtime.getRuntime().maxMemory()) / 5) { // from class: com.thinkup.core.common.res.m.3
        @Override // com.thinkup.core.common.res.n
        public final /* synthetic */ int o(String str, SoftReference<Bitmap> softReference) {
            String str2 = str;
            SoftReference<Bitmap> softReference2 = softReference;
            Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
            if (m.this.o0 == null) {
                m.this.o0 = new HashMap(8);
            }
            if (bitmap != null) {
                int height = bitmap.getHeight() * bitmap.getRowBytes();
                m.this.o0.put(str2, Integer.valueOf(height));
                return height;
            }
            Integer num = (Integer) m.this.o0.get(str2);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // com.thinkup.core.common.res.n
        public final /* synthetic */ void o(boolean z2, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            String str2 = str;
            SoftReference<Bitmap> softReference3 = softReference;
            SoftReference<Bitmap> softReference4 = softReference2;
            super.o(z2, str2, softReference3, softReference4);
            if (softReference3 != null) {
                try {
                    bitmap = softReference3.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (m.this.o0 != null) {
                m.this.o0.remove(str2);
            }
            if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }

        /* JADX INFO: renamed from: o, reason: avoid collision after fix types in other method */
        private int o2(String str, SoftReference<Bitmap> softReference) {
            Bitmap bitmap = softReference != null ? softReference.get() : null;
            if (m.this.o0 == null) {
                m.this.o0 = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) m.this.o0.get(str);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int height = bitmap.getHeight() * bitmap.getRowBytes();
            m.this.o0.put(str, Integer.valueOf(height));
            return height;
        }

        /* JADX INFO: renamed from: o, reason: avoid collision after fix types in other method */
        private void o2(boolean z2, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            super.o(z2, str, softReference, softReference2);
            if (softReference != null) {
                try {
                    bitmap = softReference.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (m.this.o0 != null) {
                m.this.o0.remove(str);
            }
            if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    };

    /* JADX INFO: renamed from: com.thinkup.core.common.res.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ o m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42359n;
        final /* synthetic */ Bitmap o;

        public AnonymousClass1(Bitmap bitmap, o oVar, String str) {
            this.o = bitmap;
            this.m = oVar;
            this.f42359n = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.o;
            if (bitmap != null) {
                this.m.onSuccess(this.f42359n, bitmap);
            } else {
                this.m.onFail(this.f42359n, "Bitmap load fail");
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.m$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f42360n;
        final /* synthetic */ o o;

        public AnonymousClass2(o oVar, String str, String str2) {
            this.o = oVar;
            this.m = str;
            this.f42360n = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.o.onFail(this.m, this.f42360n);
        }
    }

    public interface o {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private m(Context context) {
        this.o = context.getApplicationContext();
    }

    private void m(String str, Bitmap bitmap) {
        synchronized (this.on) {
            try {
                LinkedList<o> linkedList = (LinkedList) this.on.remove(str);
                if (linkedList != null) {
                    for (o oVar : linkedList) {
                        if (oVar != null) {
                            o0n.m().m(new AnonymousClass1(bitmap, oVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void o(String str, String str2) {
        synchronized (this.on) {
            try {
                LinkedList<o> linkedList = (LinkedList) this.on.remove(str);
                if (linkedList != null) {
                    for (o oVar : linkedList) {
                        if (oVar != null) {
                            o0n.m().m(new AnonymousClass2(oVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.res.m$5, reason: invalid class name */
    public class AnonymousClass5 implements com.thinkup.core.common.res.image.o.InterfaceC0691o {
        final /* synthetic */ int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ oo f42362n;
        final /* synthetic */ int o;

        public AnonymousClass5(int i2, int i3, oo ooVar) {
            this.o = i2;
            this.m = i3;
            this.f42362n = ooVar;
        }

        @Override // com.thinkup.core.common.res.image.o.InterfaceC0691o
        public final void o(oo ooVar) {
            String str = ooVar.m0;
            Bitmap bitmapO = m.this.o(ooVar, this.o, this.m);
            if (bitmapO != null) {
                m.this.o(ooVar.m0, bitmapO);
            }
            m.o(m.this, this.f42362n.m0, bitmapO);
        }

        @Override // com.thinkup.core.common.res.image.o.InterfaceC0691o
        public final void o(oo ooVar, String str) {
            m.o(m.this, ooVar.m0, str);
        }
    }

    private Bitmap m(oo ooVar, int i2, int i3) {
        if (TextUtils.isEmpty(ooVar.m0)) {
            return null;
        }
        Bitmap bitmapO = o(ooVar.m0);
        if (bitmapO != null && !bitmapO.isRecycled()) {
            return bitmapO;
        }
        Bitmap bitmapO2 = o(ooVar, i2, i3);
        if (bitmapO2 == null || bitmapO2.isRecycled()) {
            return null;
        }
        o(ooVar.m0, bitmapO2);
        return bitmapO2;
    }

    public final void o(String str, Bitmap bitmap) {
        if (o(str) != null || bitmap == null) {
            return;
        }
        this.oo.m(str, new SoftReference<>(bitmap));
    }

    public final Bitmap o(String str) {
        SoftReference<Bitmap> softReferenceO = this.oo.o(str);
        if (softReferenceO != null) {
            return softReferenceO.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:9:0x0014, B:11:0x0022), top: B:35:0x0014 }] */
    public final Bitmap o(oo ooVar, int i2, int i3) {
        Bitmap bitmapO = null;
        if (ooVar == null || TextUtils.isEmpty(ooVar.m0)) {
            return null;
        }
        String strO = nm.o(ooVar.m0);
        if (i2 <= 0) {
            try {
                i2 = this.o.getResources().getDisplayMetrics().widthPixels;
                if (i3 <= 0) {
                    i3 = this.o.getResources().getDisplayMetrics().heightPixels;
                }
            } catch (Throwable unused) {
            }
        } else if (i3 <= 0) {
            i3 = this.o.getResources().getDisplayMetrics().heightPixels;
        }
        synchronized (this.om) {
            FileInputStream fileInputStreamO = o0.o(this.o).o(ooVar.on, strO);
            if (fileInputStreamO == null) {
                return null;
            }
            try {
                bitmapO = on.o(fileInputStreamO.getFD(), i2, i3);
            } catch (Throwable unused2) {
            }
            try {
                fileInputStreamO.close();
            } catch (Exception unused3) {
            }
            return bitmapO;
        }
    }

    private void m(oo ooVar, int i2, int i3, o oVar) {
        synchronized (this.on) {
            try {
                if (!this.on.containsKey(ooVar.m0)) {
                    if (oVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(oVar);
                        this.on.put(ooVar.m0, linkedList);
                    }
                    com.thinkup.core.common.res.image.o oVar2 = new com.thinkup.core.common.res.image.o(ooVar);
                    oVar2.o(new AnonymousClass5(i2, i3, ooVar));
                    oVar2.o0();
                } else {
                    LinkedList linkedList2 = (LinkedList) this.on.get(ooVar.m0);
                    if (linkedList2 != null && oVar != null && !linkedList2.contains(oVar)) {
                        linkedList2.add(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static m o(Context context) {
        if (f42358n == null) {
            synchronized (m.class) {
                try {
                    if (f42358n == null) {
                        f42358n = new m(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42358n;
    }

    public final void o(oo ooVar, o oVar) {
        o(ooVar, -1, -1, oVar);
    }

    public final void o(final oo ooVar, final int i2, final int i3, final o oVar) {
        if (ooVar == null || TextUtils.isEmpty(ooVar.m0)) {
            if (oVar != null) {
                oVar.onFail("", "No url info.");
                return;
            }
            return;
        }
        Bitmap bitmapO = o(ooVar.m0);
        if (bitmapO == null || bitmapO.isRecycled() || (bitmapO.getWidth() < i2 && bitmapO.getHeight() < i3)) {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.res.m.4
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmapO2 = m.this.o(ooVar, i2, i3);
                    if (bitmapO2 == null || bitmapO2.isRecycled()) {
                        m.o(m.this, ooVar, i2, i3, oVar);
                        return;
                    }
                    m.this.o(ooVar.m0, bitmapO2);
                    if (oVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(oVar);
                        m.this.on.put(ooVar.m0, linkedList);
                    }
                    m.o(m.this, ooVar.m0, bitmapO2);
                }
            }, 2);
        } else if (oVar != null) {
            oVar.onSuccess(ooVar.m0, bitmapO);
        }
    }

    private void o() {
        try {
            n<String, SoftReference<Bitmap>> nVar = this.oo;
            if (nVar != null) {
                nVar.o();
            }
            ConcurrentHashMap<String, List<o>> concurrentHashMap = this.on;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void o(m mVar, String str, Bitmap bitmap) {
        synchronized (mVar.on) {
            try {
                LinkedList<o> linkedList = (LinkedList) mVar.on.remove(str);
                if (linkedList != null) {
                    for (o oVar : linkedList) {
                        if (oVar != null) {
                            o0n.m().m(mVar.new AnonymousClass1(bitmap, oVar, str));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void o(m mVar, oo ooVar, int i2, int i3, o oVar) {
        synchronized (mVar.on) {
            try {
                if (!mVar.on.containsKey(ooVar.m0)) {
                    if (oVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(oVar);
                        mVar.on.put(ooVar.m0, linkedList);
                    }
                    com.thinkup.core.common.res.image.o oVar2 = new com.thinkup.core.common.res.image.o(ooVar);
                    oVar2.o(mVar.new AnonymousClass5(i2, i3, ooVar));
                    oVar2.o0();
                } else {
                    LinkedList linkedList2 = (LinkedList) mVar.on.get(ooVar.m0);
                    if (linkedList2 != null && oVar != null && !linkedList2.contains(oVar)) {
                        linkedList2.add(oVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void o(m mVar, String str, String str2) {
        synchronized (mVar.on) {
            try {
                LinkedList<o> linkedList = (LinkedList) mVar.on.remove(str);
                if (linkedList != null) {
                    for (o oVar : linkedList) {
                        if (oVar != null) {
                            o0n.m().m(mVar.new AnonymousClass2(oVar, str, str2));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
