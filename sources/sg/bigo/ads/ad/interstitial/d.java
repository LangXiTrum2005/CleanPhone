package sg.bigo.ads.ad.interstitial;

import android.webkit.ValueCallback;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f45976a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f45977b = -14671580;
    private final WeakHashMap<TextView, d> d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakHashMap<ValueCallback<Double>, d> f45979e = new WeakHashMap<>();
    private double f = Double.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f45978c = f45977b;

    public interface a {
        int a();
    }

    public final int a(int i2) {
        int iB = sg.bigo.ads.common.w.b.b(i2);
        this.f = sg.bigo.ads.common.w.b.a(iB);
        Iterator<Map.Entry<TextView, d>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            TextView key = it.next().getKey();
            if (key != null) {
                a(key, this.f);
                this.f45978c = this.f <= 3.0d ? f45977b : f45976a;
            }
        }
        Iterator<Map.Entry<ValueCallback<Double>, d>> it2 = this.f45979e.entrySet().iterator();
        while (it2.hasNext()) {
            ValueCallback<Double> key2 = it2.next().getKey();
            if (key2 != null) {
                key2.onReceiveValue(Double.valueOf(this.f));
            }
        }
        return iB;
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        this.d.put(textView, this);
        double d = this.f;
        if (d != Double.NaN) {
            a(textView, d);
        }
    }

    public static void b(TextView textView, int i2) {
        a(textView, i2, null);
    }

    public final void a(ValueCallback<Double> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.f45979e.put(valueCallback, this);
        double d = this.f;
        if (d != Double.MIN_VALUE) {
            valueCallback.onReceiveValue(Double.valueOf(d));
        }
    }

    public final void a(TextView textView) {
        if (textView == null) {
            return;
        }
        this.d.remove(textView);
    }

    public static void a(TextView textView, double d) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(d <= 3.0d ? f45977b : f45976a);
    }

    public static void a(TextView textView, int i2) {
        if (textView == null) {
            return;
        }
        a(textView, sg.bigo.ads.common.w.b.a(i2));
    }

    public static void a(final TextView textView, int i2, final sg.bigo.ads.common.w.b.a aVar) {
        if (textView == null) {
            return;
        }
        sg.bigo.ads.common.w.b.a(textView, i2, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.1
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    return aVar2.a();
                }
                return 0L;
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i3) {
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(i3);
                }
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final boolean a(int i3) {
                d.a(textView, sg.bigo.ads.common.w.b.a(i3));
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 == null) {
                    return false;
                }
                aVar2.a(i3);
                return false;
            }
        });
    }
}
