package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.core.adview.f;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public class MediaView extends sg.bigo.ads.api.a<f> {

    public interface a {
        void a(sg.bigo.ads.core.player.b.b bVar);

        void a(boolean z2);

        boolean a();

        void b();
    }

    public MediaView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new f(this);
    }

    public final float b(int i2, int i3) {
        f viewImpl = getViewImpl();
        if (viewImpl.f48284c == null) {
            return 0.0f;
        }
        return viewImpl.c() > viewImpl.d() ? (((viewImpl.c() * i3) / viewImpl.d()) * 1.0f) / i2 : (((viewImpl.d() * i2) / viewImpl.c()) * 1.0f) / i3;
    }

    public final void c() {
        f viewImpl = getViewImpl();
        AdImageView adImageView = viewImpl.f48284c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            viewImpl.f48284c.a();
            viewImpl.f48284c = null;
        }
        sg.bigo.ads.core.player.b.f fVar = viewImpl.f48283b;
        if (fVar != null) {
            fVar.d();
            viewImpl.f48283b = null;
        }
    }

    public View getImage() {
        return getViewImpl().f48284c;
    }

    public VideoController getVideoController() {
        return getViewImpl().f;
    }

    public void setImageBlurBorder(boolean z2) {
        getViewImpl().g = z2;
    }

    public void setMediaAreaClickable(boolean z2) {
        getViewImpl().f48285e = Boolean.valueOf(z2);
    }

    public void setOtherClickAreaClick(boolean z2) {
        getViewImpl().d = Boolean.valueOf(z2);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Bitmap bitmap) {
        getViewImpl().g = false;
        f viewImpl = getViewImpl();
        if (bitmap != null) {
            int iA = e.a(viewImpl.f48267a.getContext(), 10);
            int iA2 = e.a(viewImpl.f48267a.getContext(), 4);
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewImpl.f48267a.getContext());
            roundedFrameLayout.setCornerRadius(iA2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = (width == height && viewImpl.f48267a.getWidth() <= viewImpl.f48267a.getHeight()) || width > height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z2 ? -1 : -2, z2 ? -2 : -1, 17);
            layoutParams.setMargins(iA, iA, iA, iA);
            roundedFrameLayout.setLayoutParams(layoutParams);
            AdImageView adImageView = new AdImageView(viewImpl.f48267a.getContext());
            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            u.a(adImageView, roundedFrameLayout, null, -1);
            u.a(roundedFrameLayout, viewImpl.f48267a, null, -1);
            adImageView.setBlurBorder(viewImpl.g);
            adImageView.setImageBitmap(bitmap);
        }
    }

    public final a b() {
        return getViewImpl();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void a(String str) {
        getViewImpl().a(str);
    }

    public final void a(o oVar, g gVar) {
        getViewImpl().a(oVar, gVar);
    }

    public final void a(sg.bigo.ads.core.a.a aVar, p pVar, sg.bigo.ads.core.g.c cVar) {
        getViewImpl().a(aVar, pVar, cVar);
    }

    public final void a(sg.bigo.ads.core.player.b.d dVar) {
        getViewImpl().a(dVar);
    }
}
