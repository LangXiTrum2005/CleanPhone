package sg.bigo.ads.ad.c;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ImageView f45630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.ad.b.c f45631b;

    public b(sg.bigo.ads.ad.b.c cVar) {
        ImageView imageView;
        Context context;
        this.f45631b = cVar;
        if (cVar == null || (context = cVar.f45584b.f) == null) {
            imageView = null;
        } else {
            imageView = new ImageView(context);
            int iA = e.a(context, 38);
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iA, iA));
            imageView.setVisibility(8);
        }
        this.f45630a = imageView;
    }

    public final void a() {
        ImageView imageView = this.f45630a;
        if (imageView != null) {
            u.b(imageView);
            this.f45630a = null;
        }
        sg.bigo.ads.ad.b.c cVar = this.f45631b;
        if (cVar != null) {
            cVar.destroy();
            this.f45631b = null;
        }
    }
}
