package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.triweekly;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imari;

/* JADX INFO: loaded from: classes.dex */
public final class xx0 extends RelativeLayout {
    public static final float[] b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public final AnimationDrawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(Context context, b41 attribution, RelativeLayout.LayoutParams groupLayoutParams) {
        AnimationDrawable animationDrawable;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        Intrinsics.checkNotNullParameter(groupLayoutParams, "groupLayoutParams");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(b, null, null));
        shapeDrawable.getPaint().setColor(attribution.c);
        setLayoutParams(groupLayoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(attribution.a)) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(attribution.a);
            textView.setTextColor(attribution.d);
            textView.setTextSize(attribution.e);
            textView.setPadding(imari.attabal(context, 4), 0, imari.attabal(context, 4), 0);
            addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List list = attribution.b;
        if (list.size() > 1) {
            this.a = new AnimationDrawable();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Drawable drawable = ((g61) it.next()).a;
                    if (drawable != null && (animationDrawable = this.a) != null) {
                        animationDrawable.addFrame(drawable, (int) p002kotlin.time.saneness.adultoid(attribution.a()));
                    }
                } catch (Exception e) {
                    triweekly triweeklyVar = kn0.a;
                    kn0.b("Error while getting drawable. " + e, null);
                }
            }
            imageView.setBackground(this.a);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable(((g61) list.get(0)).a);
            } catch (Exception e2) {
                triweekly triweeklyVar2 = kn0.a;
                kn0.b("Error while getting drawable. " + e2, null);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
