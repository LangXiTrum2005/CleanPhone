package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.d;

/* JADX INFO: loaded from: classes7.dex */
public class AdImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.common.p.b f47554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47556c;

    public AdImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBitmapInternal(Bitmap bitmap) {
        if (this.f47556c) {
            d.a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    private void setImageBitmapWithGradient(Bitmap bitmap) {
        d.a(bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.common.view.AdImageView.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                final Bitmap bitmap3 = bitmap2;
                AdImageView.this.post(new Runnable() { // from class: sg.bigo.ads.common.view.AdImageView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdImageView.this.setImageBitmapInternal(bitmap3);
                    }
                });
            }
        });
    }

    public final void a() {
        this.f47554a.f47401c.clear();
    }

    public void setBlurBorder(boolean z2) {
        this.f47555b = z2;
    }

    public void setFadeEnable(boolean z2) {
        this.f47556c = z2;
    }

    public void setIconTag(boolean z2) {
        sg.bigo.ads.common.p.b bVar = this.f47554a;
        if (bVar != null) {
            bVar.f47400b = z2;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (!this.f47555b || bitmap == null) {
            setImageBitmapInternal(bitmap);
        } else {
            setImageBitmapWithGradient(bitmap);
        }
    }

    public AdImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a(String str, boolean z2) {
        a(null, str, z2);
    }

    public AdImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47555b = false;
        this.f47556c = false;
        this.f47554a = new sg.bigo.ads.common.p.b(this);
    }

    public final void a(Executor executor, String str, boolean z2) {
        this.f47554a.a(executor, str, z2);
    }

    public final void a(g gVar) {
        this.f47554a.a(gVar);
    }
}
