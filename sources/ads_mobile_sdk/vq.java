package ads_mobile_sdk;

import ads_mobile_sdk.vq;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class vq extends FrameLayout {
    public Function0 a;
    public final ImageButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    public vq(Context context, String closeButtonAsset, wq config) {
        Drawable drawable;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeButtonAsset, "closeButtonAsset");
        Intrinsics.checkNotNullParameter(config, "config");
        this.b = new ImageButton(context);
        Resources resources = context.getResources();
        Drawable drawable2 = null;
        try {
            if (!Intrinsics.wireman(closeButtonAsset, "white")) {
                drawable = Intrinsics.wireman(closeButtonAsset, "black") ? resources.getDrawable(danae.saneness.admob_close_button_black_circle_white_cross, null) : drawable;
                if (drawable2 == null) {
                    this.b.setImageResource(R.drawable.btn_dialog);
                } else {
                    this.b.setImageDrawable(drawable2);
                    this.b.setScaleType(ImageView.ScaleType.CENTER);
                }
                this.b.setBackgroundColor(0);
                this.b.setPadding(imari.attabal(context, config.a), imari.attabal(context, 0), imari.attabal(context, config.b), imari.attabal(context, config.c));
                this.b.setContentDescription("Fullscreen ad close button");
                setOnClickListener(new View.OnClickListener() { // from class: saneness.gloriole
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vq.a(this.f37156kowloon, view);
                    }
                });
                this.b.setOnClickListener(new View.OnClickListener() { // from class: saneness.pigment
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vq.b(this.f37251kowloon, view);
                    }
                });
                addView(this.b, new FrameLayout.LayoutParams(imari.attabal(context, config.a + 50 + config.b), imari.attabal(context, config.c + 50)));
            }
            drawable = resources.getDrawable(danae.saneness.admob_close_button_white_circle_black_cross, null);
            drawable2 = drawable;
        } catch (Resources.NotFoundException unused) {
        }
        if (drawable2 == null) {
            this.b.setImageResource(R.drawable.btn_dialog);
        } else {
            this.b.setImageDrawable(drawable2);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
        }
        this.b.setBackgroundColor(0);
        this.b.setPadding(imari.attabal(context, config.a), imari.attabal(context, 0), imari.attabal(context, config.b), imari.attabal(context, config.c));
        this.b.setContentDescription("Fullscreen ad close button");
        setOnClickListener(new View.OnClickListener() { // from class: saneness.gloriole
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vq.a(this.f37156kowloon, view);
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: saneness.pigment
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vq.b(this.f37251kowloon, view);
            }
        });
        addView(this.b, new FrameLayout.LayoutParams(imari.attabal(context, config.a + 50 + config.b), imari.attabal(context, config.c + 50)));
    }

    public static final void a(vq this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0 function0 = this$0.a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void b(vq this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0 function0 = this$0.a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
