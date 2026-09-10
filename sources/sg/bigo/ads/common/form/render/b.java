package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.common.form.b.a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f47197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.common.form.render.a.c f47198c;
    public Button d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f47199e;
    long f;
    int g;
    private final WeakReference<a> j;
    private int k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47201i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean[] f47202l = new boolean[13];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f47200h = new Runnable() { // from class: sg.bigo.ads.common.form.render.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            RelativeLayout relativeLayout = bVar.f47199e;
            if (relativeLayout == null || bVar.f > 0) {
                d.a(bVar.f47200h);
                return;
            }
            if (!sg.bigo.ads.common.ab.a.a(relativeLayout, new Rect())) {
                d.a(2, b.this.f47200h, 500L);
                return;
            }
            d.a(b.this.f47200h);
            b.this.f = System.currentTimeMillis();
            b bVar2 = b.this;
            bVar2.a(1, bVar2.g, 0L);
        }
    };

    public interface a {
        void a();

        void a(String str);
    }

    public b(Context context, e eVar, Map<String, Object> map, int i2, int i3, a aVar) {
        this.f47196a = context;
        this.f47197b = eVar;
        sg.bigo.ads.common.form.render.a.f47177a = eVar.d() == 1;
        this.f47198c = new sg.bigo.ads.common.form.render.a.c(eVar, map, context, this);
        this.j = new WeakReference<>(aVar);
        this.g = i2;
        this.k = i3;
    }

    private void d(String str) {
        if (this.j.get() != null) {
            this.j.get().a(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a() {
        Button button = this.d;
        if (button == null || this.f47201i) {
            return;
        }
        button.setEnabled(true);
        this.d.setBackgroundResource(R.drawable.bigo_ad_btn_background);
        this.d.setTextColor(-1);
        this.f47201i = true;
        a(2, this.g, System.currentTimeMillis() - this.f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b() {
        a(5, this.g, System.currentTimeMillis() - this.f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c() {
        a(6, this.g, System.currentTimeMillis() - this.f);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(int i2) {
        int i3;
        long jCurrentTimeMillis;
        int i4;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = this.g;
                jCurrentTimeMillis = System.currentTimeMillis() - this.f;
                i4 = 8;
            }
            sg.bigo.ads.common.form.a.b(this.k);
        }
        i3 = this.g;
        jCurrentTimeMillis = System.currentTimeMillis() - this.f;
        i4 = 7;
        a(i4, i3, jCurrentTimeMillis);
        sg.bigo.ads.common.form.a.b(this.k);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(int i2) {
        if (this.j.get() != null) {
            this.j.get().a();
        }
        sg.bigo.ads.common.form.b.a().a(sg.bigo.ads.common.form.a.a(this.f47197b, this.f47198c.b(), this.f47198c.a()), this, i2);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c(String str) {
        a(9, this.g, System.currentTimeMillis() - this.f);
        d(str);
    }

    public final void a(int i2, int i3, long j) {
        boolean[] zArr = this.f47202l;
        if (i2 >= zArr.length || zArr[i2]) {
            return;
        }
        sg.bigo.ads.core.d.b.a(i2, i3, j);
        this.f47202l[i2] = true;
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(String str) {
        a(10, this.g, System.currentTimeMillis() - this.f);
        d(str);
    }

    public static void a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a(String str) {
        a(11, this.g, System.currentTimeMillis() - this.f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(Map<String, Object> map) {
        sg.bigo.ads.common.form.a.a(this.k, map);
    }
}
