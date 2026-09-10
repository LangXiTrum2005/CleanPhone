package com.charging.screenshow.battery.animations.themes.utils.ext;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.TextView;
import com.charging.screenshow.battery.animations.themes.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/ext/TextViewExt;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextViewExt {
    public static void a(TextView textView) {
        Context context = textView.getContext();
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().getTextSize() * textView.getText().length(), 0.0f, context.getResources().getColor(R.color.text_blue_start), context.getResources().getColor(R.color.text_blue_end), Shader.TileMode.CLAMP));
        textView.invalidate();
    }
}
