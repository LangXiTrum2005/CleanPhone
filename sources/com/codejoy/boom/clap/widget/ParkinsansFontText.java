package com.codejoy.boom.clap.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.codejoy.boom.clap.helper.competently;
import com.codejoy.boom.clap.polloi;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ParkinsansFontText.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/codejoy/boom/clap/widget/ParkinsansFontText;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "applyFontWeight", "()V", "setRegularFont", "setMediumFont", "setSemiboldFont", "setBoldFont", "setExtraBold", TtmlNode.ATTR_TTS_FONT_WEIGHT, "I", "Companion", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ParkinsansFontText extends AppCompatTextView {
    public static final int WEIGHT_BOLD = 3;
    public static final int WEIGHT_EXTRA_BOLD = 4;
    public static final int WEIGHT_MEDIUM = 1;
    public static final int WEIGHT_REGULAR = 0;
    public static final int WEIGHT_SEMIBOLD = 2;
    private int fontWeight;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkinsansFontText(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, null);
    }

    private final void applyFontWeight() {
        int i = this.fontWeight;
        String str = "font/Parkinsans-Regular.ttf";
        if (i != 0) {
            if (i == 1) {
                str = "font/Parkinsans-Medium.ttf";
            } else if (i == 2) {
                str = "font/Parkinsans-SemiBold.ttf";
            } else if (i == 3) {
                str = "font/Parkinsans-Bold.ttf";
            } else if (i == 4) {
                str = "font/Parkinsans-ExtraBold.ttf";
            }
        }
        competently competentlyVar = competently.f18256attabal;
        AssetManager assets = getContext().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        setTypeface(competentlyVar.attabal(assets, str));
    }

    private final void initView(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, polloi.ParkinsansFontText);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                int i = typedArrayObtainStyledAttributes.getInt(polloi.ParkinsansFontText_customFontWeight, 0);
                this.fontWeight = i;
                if (i < 0 || i > 4) {
                    this.fontWeight = 0;
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        applyFontWeight();
    }

    public final void setBoldFont() {
        this.fontWeight = 3;
        applyFontWeight();
    }

    public final void setExtraBold() {
        this.fontWeight = 4;
        applyFontWeight();
    }

    public final void setMediumFont() {
        this.fontWeight = 1;
        applyFontWeight();
    }

    public final void setRegularFont() {
        this.fontWeight = 0;
        applyFontWeight();
    }

    public final void setSemiboldFont() {
        this.fontWeight = 2;
        applyFontWeight();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkinsansFontText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkinsansFontText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet);
    }
}
