package com.smartdigimkt.k7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final int f = 1;
    public static final int g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<View, b> f36236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<View, d<b>> f36237c;
    private final f.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.e f36238e;

    public class a implements f.e {
        public a() {
        }

        @Override // com.smartdigimkt.k7.f.e
        public void a(List<View> list, List<View> list2) {
            for (View view : list) {
                b bVar = (b) c.this.f36236b.get(view);
                if (bVar == null) {
                    c.this.b(view);
                } else {
                    bVar.recordImpression(view);
                    bVar.setImpressionRecorded();
                }
            }
        }
    }

    public c(int i2, Context context) {
        this(new WeakHashMap(), new WeakHashMap(), new f.c(i2), new f(context, i2), new Handler(Looper.getMainLooper()));
    }

    public void b(View view) {
        this.f36236b.remove(view);
        a(view);
        this.f36235a.a(view);
    }

    @Deprecated
    public f.e c() {
        return this.f36238e;
    }

    public void a(View view, b bVar) {
        if (this.f36236b.get(view) == bVar) {
            return;
        }
        b(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.f36236b.put(view, bVar);
        this.f36235a.a(view, bVar.getImpressionMinPercentageViewed(), bVar.getImpressionMinVisiblePx());
    }

    public c(int i2, Context context, int i3) {
        this(new WeakHashMap(), new WeakHashMap(), new f.c(i2), new f(context, i3, i2), new Handler(Looper.getMainLooper()));
    }

    public void b() {
        a();
        this.f36235a.b();
        this.f36238e = null;
    }

    public c(Map<View, b> map, Map<View, d<b>> map2, f.c cVar, f fVar, Handler handler) {
        this.f36236b = map;
        this.f36237c = map2;
        this.d = cVar;
        this.f36235a = fVar;
        a aVar = new a();
        this.f36238e = aVar;
        fVar.a(aVar);
    }

    public void a() {
        this.f36236b.clear();
        this.f36237c.clear();
        this.f36235a.a();
    }

    private void a(View view) {
        this.f36237c.remove(view);
    }
}
