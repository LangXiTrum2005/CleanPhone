package com.smartdigimkt.n2;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.smartdigimkt.c2.c;
import com.smartdigimkt.v0.h;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.x.d;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f36975e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36976a = "ChoiceOneDrawBitBg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f36977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f36978c;
    private Bitmap d;

    /* JADX INFO: renamed from: com.smartdigimkt.n2.a$a, reason: collision with other inner class name */
    public class RunnableC0549a implements Runnable {
        final /* synthetic */ Bitmap X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f36979Y;
        final /* synthetic */ float Z;
        final /* synthetic */ float e0;

        /* JADX INFO: renamed from: com.smartdigimkt.n2.a$a$a, reason: collision with other inner class name */
        public class RunnableC0550a implements Runnable {
            final /* synthetic */ com.smartdigimkt.k2.a.b X;

            public RunnableC0550a(com.smartdigimkt.k2.a.b bVar) {
                this.X = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f36977b == null || this.X.a() == null) {
                    return;
                }
                a.this.f36977b.setBackgroundDrawable(this.X.a());
            }
        }

        public RunnableC0549a(Bitmap bitmap, int i2, float f, float f2) {
            this.X = bitmap;
            this.f36979Y = i2;
            this.Z = f;
            this.e0 = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = h.a(this.X, 10);
                Bitmap bitmapA2 = h.a(this.X, 10);
                com.smartdigimkt.k2.a.b bVarA = com.smartdigimkt.k2.a.a();
                bVarA.a(this.f36979Y).b(bitmapA).a(bitmapA2);
                if (this.f36979Y == 2) {
                    float f = this.Z;
                    float f2 = this.e0;
                    if (f > f2) {
                        bVarA.b(f).a(this.e0);
                    } else {
                        bVarA.b(f2).a(this.Z);
                    }
                } else {
                    bVarA.b(this.Z).a(this.e0);
                }
                if (a.this.f36977b != null) {
                    a.this.f36977b.post(new RunnableC0550a(bVarA));
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f36977b != null) {
            this.f36977b = null;
        }
        Bitmap bitmap = this.f36978c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f36978c.recycle();
            this.f36978c = null;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.d.recycle();
        this.d = null;
    }

    public static a a() {
        a aVar;
        if (f36975e != null) {
            return f36975e;
        }
        synchronized (a.class) {
            try {
                if (f36975e == null) {
                    f36975e = new a();
                }
                aVar = f36975e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f36977b = view;
        int i2 = cVar.i();
        float fN = cVar.n();
        float fL = cVar.l();
        try {
            List<d> listB = cVar.b();
            String strA = listB.get(0) != null ? s.a(listB.get(0).k()) : "";
            String strA2 = listB.get(1) != null ? s.a(listB.get(1).k()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(strA) || !map.containsKey(strA)) ? null : map.get(strA);
            if (!TextUtils.isEmpty(strA2) && map.containsKey(strA2)) {
                bitmap = map.get(strA2);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(i2, fN, fL, bitmap2, bitmap3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private synchronized void a(int i2, float f, float f2, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    com.smartdigimkt.t0.a.b().execute(new RunnableC0549a(bitmap, i2, f, f2));
                } catch (Exception e2) {
                    e = e2;
                    e.getMessage();
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
