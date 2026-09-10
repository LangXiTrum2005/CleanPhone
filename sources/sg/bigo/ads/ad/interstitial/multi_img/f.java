package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.webkit.ValueCallback;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements ViewFlow.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f46396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Indicator f46397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f46398c;
    private ValueCallback<Integer> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46399e = false;
    private int f;

    public f(d dVar, Indicator indicator, a aVar) {
        this.f46396a = dVar;
        this.f46397b = indicator;
        this.f46398c = aVar;
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i2) {
        Indicator indicator = this.f46397b;
        if (indicator == null || i2 <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.f46397b.setNum(i2);
        } else {
            Indicator indicator2 = this.f46397b;
            indicator2.setLineLength(Indicator.a(i2, indicator2.getDistance(), this.f46397b.getRadius(), this.f46397b.getLengthSelected()));
        }
        this.f46397b.setVisibility(0);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i2, int i3) {
        Indicator indicator = this.f46397b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float fMin = Math.min(1.0f, Math.max(0.0f, (i2 * 1.0f) / i3));
        Indicator indicator2 = this.f46397b;
        if (indicator2.f47573a != fMin) {
            indicator2.f47573a = Math.max(0.0f, Math.min(1.0f, fMin));
            indicator2.invalidate();
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(View view, int i2) {
        Indicator indicator = this.f46397b;
        if (indicator != null && indicator.getType() != 1) {
            this.f46397b.a(i2);
        }
        this.f = i2;
        a aVar = this.f46398c;
        if (aVar != null) {
            aVar.b(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(View view, int i2, float f) {
        ValueCallback<Integer> valueCallback;
        Bitmap bitmap;
        int i3;
        float f2 = this.f46396a.f46391h;
        float fA = f < 0.0f ? android.support.v4.media.a.a(1.0f, f2, f, 1.0f) : android.support.v4.media.a.a(f2, 1.0f, f, 1.0f);
        float f3 = this.f46396a.g;
        float fA2 = f < 0.0f ? android.support.v4.media.a.a(1.0f, f3, f, 1.0f) : android.support.v4.media.a.a(f3, 1.0f, f, 1.0f);
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
        } else {
            view.setPivotX(0.0f);
        }
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(fA);
        view.setScaleY(fA);
        view.setAlpha(Math.abs(fA2));
        Indicator indicator = this.f46397b;
        if (indicator != null && indicator.getType() != 1) {
            this.f46397b.a(f, i2);
        }
        a aVar = this.f46398c;
        if (aVar != null && aVar.f) {
            if (f == 0.0f) {
                aVar.b(i2);
            } else {
                Object tag = aVar.d.a(i2).getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
                if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                    sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                    if (dVar.d(aVar.f46365e)) {
                        aVar.a(dVar, f, i2);
                    } else if (dVar.c(aVar.f46365e)) {
                        if (i2 == aVar.f46363b) {
                            aVar.g = f;
                            float fMax = Math.max(Math.min(Math.abs(f), 1.0f), 0.0f);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.d.getResources(), dVar.f46429p);
                            bitmapDrawable.setAlpha((int) ((1.0f - fMax) * dVar.q));
                            aVar.f46364c = f > 0.0f ? i2 - 1 : i2 + 1;
                            View viewA = aVar.d.a(aVar.f46364c);
                            if (viewA != null) {
                                Object tag2 = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
                                if (tag2 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                                    sg.bigo.ads.ad.interstitial.multi_img.view.d dVar2 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag2;
                                    bitmap = dVar2.f46429p;
                                    i3 = (int) (dVar2.q * fMax);
                                } else {
                                    bitmap = null;
                                    i3 = 0;
                                }
                            } else {
                                bitmap = null;
                                i3 = 0;
                            }
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(aVar.d.getResources(), bitmap);
                            bitmapDrawable2.setAlpha(i3);
                            a.a(aVar.f46362a, bitmapDrawable, bitmapDrawable2);
                        }
                        aVar.a(dVar, f, i2);
                    }
                }
            }
        }
        this.f46399e = this.f == i2 && f != 0.0f;
        if (f != 0.0f || (valueCallback = this.d) == null) {
            return;
        }
        valueCallback.onReceiveValue(Integer.valueOf(i2));
    }

    public static void a(ViewFlow viewFlow, ValueCallback<Integer> valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        ViewFlow.c onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof f) {
            ((f) onItemChangeListener).d = valueCallback;
        }
    }

    public static boolean a(ViewFlow viewFlow) {
        ViewFlow.c onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if (onItemChangeListener == null || !(onItemChangeListener instanceof f)) {
            return false;
        }
        return ((f) onItemChangeListener).f46399e;
    }
}
