package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C2993j5;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2993j5 extends ImageView {
    public final byte a;
    public final InterfaceC3072m9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2993j5(Context context, byte b, InterfaceC3072m9 interfaceC3072m9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = b;
        this.b = interfaceC3072m9;
        int i = b == 0 ? 15 : (b == 2 || b == 3 || b == 4 || b == 5 || b == 6) ? 30 : 0;
        try {
            Integer numA = a(b);
            try {
                if (numA == null) {
                    if (interfaceC3072m9 != null) {
                        ((C3097n9) interfaceC3072m9).b("CustomView", "null drawable id while creating button - " + ((int) b));
                        return;
                    }
                    return;
                }
                a(numA.intValue(), i, i, i, i);
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).c("CustomView", "new customView - " + ((int) b) + " created");
                    return;
                }
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Exception exc = e;
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            ((C3097n9) interfaceC3072m10).a("CustomView", "exception while building customView", exc);
        }
        taiyuan taiyuanVar = P9.a;
        AbstractC2973i9.a(exc);
    }

    public static Integer a(byte b) {
        if (b == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i, final int i2, final int i3, final int i4, final int i5) {
        C3342x5.a.getClass();
        if (!C3342x5.w()) {
            cutely.wireman(A9.d, null, null, new C2969i5(this, i, i2, i3, i4, i5, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: adsuki.euthanasia
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C2993j5.a(this.f3430attabal, i2, i3, i4, i5, drawable);
                }
            }, ((Wb) AbstractC3119o6.e.getValue()).a);
        }
    }

    public static final void a(C2993j5 c2993j5, int i, int i2, int i3, int i4, Drawable drawable) {
        if (drawable == null) {
            InterfaceC3072m9 interfaceC3072m9 = c2993j5.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("CustomView", "drawable for " + ((int) c2993j5.a) + " is null");
                return;
            }
            return;
        }
        c2993j5.setImageDrawable(drawable);
        c2993j5.setPadding(i, i2, i3, i4);
    }

    public final void a(final Drawable drawable, final int i, final int i2, final int i3, final int i4) {
        post(new Runnable() { // from class: adsuki.laky
            @Override // java.lang.Runnable
            public final void run() {
                C2993j5.a(this.f3507kowloon, drawable, i, i2, i3, i4);
            }
        });
    }

    public static final void a(C2993j5 c2993j5, Drawable drawable, int i, int i2, int i3, int i4) {
        c2993j5.setImageDrawable(drawable);
        c2993j5.setPadding(i, i2, i3, i4);
    }
}
