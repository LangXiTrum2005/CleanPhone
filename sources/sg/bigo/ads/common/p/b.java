package sg.bigo.ads.common.p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.p004ironsource.d9;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ImageView f47399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<WeakReference<g>> f47401c;

    public b(ImageView imageView) {
        this.f47400b = false;
        this.f47401c = new ArrayList();
        this.f47399a = imageView;
        imageView.setAdjustViewBounds(true);
    }

    private void a(String str) {
        try {
            int i2 = Integer.parseInt(str);
            ImageView imageView = this.f47399a;
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), i2));
        } catch (NumberFormatException unused) {
        }
    }

    private void b(final String str) {
        final WeakReference weakReference = new WeakReference(this.f47399a);
        final Context applicationContext = this.f47399a.getContext().getApplicationContext();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.3
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapA = b.this.f47400b ? sg.bigo.ads.common.utils.d.a(str) : sg.bigo.ads.common.utils.d.a(str, applicationContext);
                if (bitmapA == null) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.common.p.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageView imageView = (ImageView) weakReference.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmapA);
                        }
                    }
                });
            }
        });
    }

    public b(ImageView imageView, byte b2) {
        this.f47400b = false;
        this.f47401c = new ArrayList();
        this.f47399a = imageView;
        imageView.setAdjustViewBounds(true);
        this.f47400b = true;
    }

    private void b(final Executor executor, final String str, final boolean z2) {
        final WeakReference weakReference = new WeakReference(this.f47399a);
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.1
            @Override // java.lang.Runnable
            public final void run() {
                final b bVar = b.this;
                Executor executor2 = executor;
                String str2 = str;
                boolean z3 = z2;
                final WeakReference weakReference2 = weakReference;
                g gVar = new g() { // from class: sg.bigo.ads.common.p.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i2, String str3, String str4) {
                        Iterator<WeakReference<g>> it = b.this.f47401c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(i2, str3, str4);
                            }
                        }
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, f fVar) {
                        ImageView imageView = (ImageView) weakReference2.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                        Iterator<WeakReference<g>> it = b.this.f47401c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(bitmap, fVar);
                            }
                        }
                    }
                };
                Context applicationContext = bVar.f47399a.getContext().getApplicationContext();
                if (bVar.f47400b) {
                    e.b(applicationContext, executor2, str2, z3, gVar);
                } else {
                    e.a(applicationContext, executor2, str2, z3, gVar);
                }
            }
        });
    }

    public final void a(Executor executor, String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if ("res".equalsIgnoreCase(scheme)) {
            a(uri.getHost());
            return;
        }
        if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
            b(executor, str, z2);
        } else if (d9.h.f24719b.equalsIgnoreCase(scheme)) {
            b(uri.getPath());
        }
    }

    public final void a(g gVar) {
        if (gVar == null) {
            return;
        }
        this.f47401c.add(new WeakReference<>(gVar));
    }
}
