package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends TextView {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(Context context) {
        CharSequence string;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            string = context.getResources().getString(danae.dern.test_ad);
        } catch (Resources.NotFoundException unused) {
            string = "Test Ad";
        }
        setText(string);
        setTextSize(15.0f);
        setTextColor(-1);
        setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        setBackground(gradientDrawable);
    }
}
