package com.google.android.libraries.ads.mobile.sdk.nativead;

import ads_mobile_sdk.zl1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.emmesh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/MediaView;", "Lcom/google/android/gms/ads/nativead/MediaView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/ImageView$ScaleType;", "value", "a", "Landroid/widget/ImageView$ScaleType;", "getImageScaleType", "()Landroid/widget/ImageView$ScaleType;", "setImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "imageScaleType", "Lacidy/saneness;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lacidy/saneness;", "getMediaContent", "()Lacidy/saneness;", "setMediaContent", "(Lacidy/saneness;)V", "mediaContent", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MediaView extends com.google.android.gms.ads.nativead.MediaView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ImageView.ScaleType imageScaleType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private acidy.saneness mediaContent;
    private emmesh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(zl1 zl1Var) {
        synchronized (this) {
            this.c = zl1Var;
            Unit unit = Unit.f29295attabal;
        }
        ImageView.ScaleType scaleType = this.imageScaleType;
        if (scaleType != null) {
            zl1Var.a(scaleType);
        }
    }

    public final ImageView.ScaleType getImageScaleType() {
        return this.imageScaleType;
    }

    public final acidy.saneness getMediaContent() {
        return this.mediaContent;
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        emmesh emmeshVar;
        this.imageScaleType = scaleType;
        if (scaleType != null) {
            synchronized (this) {
                emmeshVar = this.c;
            }
            if (emmeshVar != null) {
                ((zl1) emmeshVar).a(scaleType);
            }
        }
    }

    public final void setMediaContent(acidy.saneness sanenessVar) {
        InternalNativeAd internalNativeAdA;
        this.mediaContent = sanenessVar;
        if (sanenessVar == null || (internalNativeAdA = sanenessVar.a()) == null) {
            return;
        }
        internalNativeAdA.attabal(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
