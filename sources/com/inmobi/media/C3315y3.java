package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.inmobi.ads.R;
import com.inmobi.media.C3315y3;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3315y3 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f24116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:35:0x0042  */
    /* JADX WARN: Code duplicated, block: B:36:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    public C3315y3(Context context, byte b2, InterfaceC3333z5 interfaceC3333z5) {
        int i2;
        super(context);
        C3315y3 c3315y3 = "context";
        Intrinsics.f(context, "context");
        this.f24115a = b2;
        this.f24116b = interfaceC3333z5;
        if (b2 == 0) {
            i2 = 15;
        } else if (b2 == 1) {
            i2 = 0;
        } else if (b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5 || b2 == 6) {
            i2 = 30;
        } else if (b2 == 9 || b2 == 10 || b2 == 7 || b2 == 8) {
            i2 = 15;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        try {
            Integer numA = a(b2);
            try {
                if (numA == null) {
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("CustomView", "null drawable id while creating button - " + ((int) b2));
                        return;
                    }
                    return;
                }
                a(numA.intValue(), i3, i3, i3, i3);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("CustomView", "new customView - " + ((int) b2) + " created");
                    return;
                }
                return;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            c3315y3 = this;
        }
        Exception exc = e;
        InterfaceC3333z5 interfaceC3333z6 = c3315y3.f24116b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("CustomView", "exception while building customView", exc);
        }
        S5 s5 = S5.f23167a;
        S5.d.a(AbstractC3285w5.a(exc, "event"));
    }

    public static Integer a(byte b2) {
        if (b2 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b2 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b2 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b2 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b2 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b2 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b2 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b2 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b2 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        if (b2 == 7) {
            return Integer.valueOf(R.drawable.im_play);
        }
        if (b2 == 8) {
            return Integer.valueOf(R.drawable.im_pause);
        }
        return null;
    }

    public final void a(final int i2, final int i3, final int i4, final int i5, final int i6) {
        if (L3.f22938a.H()) {
            Icon.createWithResource(getContext(), i2).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: A.M0
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C3315y3.a(this.f3148a, i3, i4, i5, i6, drawable);
                }
            }, ((ExecutorC3160o7) AbstractC3332z4.d.getX()).f23866a);
        } else {
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new Runnable() { // from class: A.N0
                @Override // java.lang.Runnable
                public final void run() {
                    C3315y3.a(this.X, i2, i3, i4, i5, i6);
                }
            });
        }
    }

    public static final void a(C3315y3 this$0, int i2, int i3, int i4, int i5, Drawable drawable) {
        Intrinsics.f(this$0, "this$0");
        if (drawable == null) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24116b;
            if (interfaceC3333z5 != null) {
                A5 a5 = (A5) interfaceC3333z5;
                a5.b("CustomView", android.support.v4.media.a.i(this$0.f24115a, " is null", new StringBuilder("drawable for ")));
                return;
            }
            return;
        }
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i2, i3, i4, i5);
    }

    public static final void a(C3315y3 this$0, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.f(this$0, "this$0");
        Drawable drawable = ContextCompat.getDrawable(this$0.getContext(), i2);
        if (drawable == null) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24116b;
            if (interfaceC3333z5 != null) {
                A5 a5 = (A5) interfaceC3333z5;
                a5.b("CustomView", android.support.v4.media.a.i(this$0.f24115a, " cannot be created", new StringBuilder("CustomView drawable for ")));
                return;
            }
            return;
        }
        this$0.a(drawable, i3, i4, i5, i6);
    }

    public final void a(final Drawable drawable, final int i2, final int i3, final int i4, final int i5) {
        post(new Runnable() { // from class: A.L0
            @Override // java.lang.Runnable
            public final void run() {
                C3315y3.a(this.X, drawable, i2, i3, i4, i5);
            }
        });
    }

    public static final void a(C3315y3 this$0, Drawable drawable, int i2, int i3, int i4, int i5) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(drawable, "$drawable");
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i2, i3, i4, i5);
    }
}
