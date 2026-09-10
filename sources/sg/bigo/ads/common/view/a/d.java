package sg.bigo.ads.common.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T extends View> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f47675a = r.f47535a.a(1) / 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f47676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f47677c;
    public final sg.bigo.ads.common.view.a.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f47678e;
    public View f;
    public boolean g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.c.a f47680i;
    private Canvas j;
    private Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f47681l;
    private long m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f47679h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - d.this.m) < d.f47675a) {
                return true;
            }
            d.b(d.this);
            d.this.m = jElapsedRealtime;
            return true;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47682n = -1;
    private final WeakHashMap<TextureView, Object> o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f47685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f47686b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.f47676b.getResources(), bitmap);
            this.f47685a = dVar;
            this.f47686b = new Paint();
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.f47685a.d.f47669b;
            if (bVar != null) {
                this.f47686b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.f47686b);
            }
        }

        public /* synthetic */ a(d dVar, Bitmap bitmap, byte b2) {
            this(dVar, bitmap);
        }
    }

    public d(T t) {
        this.f47676b = t;
        Context context = t.getContext();
        this.f47677c = context;
        this.f47680i = new sg.bigo.ads.common.c.b(context);
        this.d = new sg.bigo.ads.common.view.a.a();
    }

    public static /* synthetic */ int d(d dVar) {
        int i2 = dVar.f47682n;
        dVar.f47682n = i2 + 1;
        return i2;
    }

    public final void b() {
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            bitmap.recycle();
            this.k = null;
        }
        if (this.f47681l != null) {
            this.f47681l = null;
        }
        this.f47680i.a();
    }

    @Override // sg.bigo.ads.common.view.a.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.common.view.a.a aVar = this.d;
        if ((bVar == null && aVar.f47669b == null) || bVar == aVar.f47669b) {
            return;
        }
        aVar.f47669b = bVar;
        aVar.invalidateSelf();
        this.m = 0L;
        b();
    }

    public static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.f47678e) {
            return;
        }
        sg.bigo.ads.common.view.a.a aVar = dVar.d;
        Drawable drawable = aVar.f47310a;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.f47669b) != null && bVar.c() > 0.0f && u.c(dVar.f47676b) && sg.bigo.ads.common.ab.a.a(dVar.f47676b, new Rect())) {
            b bVar2 = dVar.d.f47669b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f;
            if (view == null || !dVar.f47676b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            byte b2 = 0;
            if (dVar.j == null || dVar.f47681l == null || dVar.k == null) {
                dVar.b();
                int measuredWidth = (dVar.f47676b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.f47676b.getMeasuredHeight() - rect.top) - rect.bottom;
                int iMax = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int iMax2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                dVar.k = sg.bigo.ads.common.utils.d.a(iMax, iMax2, config);
                dVar.f47681l = new a(dVar, sg.bigo.ads.common.utils.d.a(iMax, iMax2, config), b2);
                if (dVar.k == null) {
                    return;
                }
                dVar.j = new Canvas(dVar.k);
                dVar.d.a(dVar.f47681l);
                if (!dVar.f47680i.a(dVar.k, bVar2.c())) {
                    return;
                }
            }
            Point pointA = u.a(view, dVar.f47676b);
            dVar.k.eraseColor(bVar2.b());
            float alpha = dVar.f47676b.getAlpha();
            dVar.f47676b.setAlpha(0.0f);
            dVar.f47678e = true;
            float fD = 1.0f / bVar2.d();
            int iSave = dVar.j.save();
            try {
                dVar.j.scale(fD, fD);
                dVar.j.translate((-pointA.x) - rect.left, (-pointA.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.j);
                }
                view.draw(dVar.j);
            } catch (Exception unused) {
            } finally {
                dVar.j.restoreToCount(iSave);
            }
            dVar.a();
            Set<TextureView> setKeySet = dVar.o.keySet();
            if (!k.a(setKeySet)) {
                int i2 = pointA.x;
                Rect rect2 = new Rect(rect.left + i2, pointA.y + rect.top, (dVar.f47676b.getMeasuredWidth() + i2) - rect.right, (dVar.f47676b.getMeasuredHeight() + pointA.y) - rect.bottom);
                for (TextureView textureView : setKeySet) {
                    if (textureView != null && textureView.isOpaque() && u.d(textureView)) {
                        Point pointA2 = u.a(view, textureView);
                        int i3 = pointA2.x;
                        Rect rect3 = new Rect(i3, pointA2.y, textureView.getMeasuredWidth() + i3, textureView.getMeasuredHeight() + pointA2.y);
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = textureView.getBitmap()) != null) {
                            int i4 = rect4.left - rect3.left;
                            int i5 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i4, i5, rect4.width() + i4, rect4.height() + i5);
                            int i6 = rect4.left - rect2.left;
                            int i7 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i6, i7, rect4.width() + i6, rect4.height() + i7);
                            int iSave2 = dVar.j.save();
                            try {
                                dVar.j.scale(fD, fD);
                                dVar.j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } finally {
                                dVar.j.restoreToCount(iSave2);
                            }
                            break;
                        }
                    }
                }
            }
            dVar.f47678e = false;
            dVar.f47676b.setAlpha(alpha);
            dVar.f47680i.a(dVar.k, dVar.f47681l.getBitmap());
            dVar.d.invalidateSelf();
        }
    }

    public final void a() {
        if (!(this.f instanceof ViewGroup) || this.f47682n == this.o.size()) {
            return;
        }
        this.f47682n = 0;
        this.o.clear();
        u.a((ViewGroup) this.f, new sg.bigo.ads.common.d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }
}
