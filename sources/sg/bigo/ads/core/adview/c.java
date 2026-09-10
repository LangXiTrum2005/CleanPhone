package sg.bigo.ads.core.adview;

import android.view.View;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.api.a<?> f48267a;

    public c(sg.bigo.ads.api.a<?> aVar) {
        this.f48267a = aVar;
    }

    public final void a(int i2) {
        this.f48267a.setTag(Integer.valueOf(i2));
    }

    public void a(View view) {
        u.a(view, this.f48267a, null, -1);
    }

    public boolean a(int i2, int i3) {
        return u.a(this.f48267a, i2, i3);
    }
}
