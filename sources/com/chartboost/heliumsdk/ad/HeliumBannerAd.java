package com.chartboost.heliumsdk.ad;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.a;
import com.chartboost.heliumsdk.R;
import com.chartboost.heliumsdk.controllers.banners.BannerController;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.Keywords;
import com.chartboost.heliumsdk.utils.Dips;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.k6;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.x4;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002KLB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\b\u0010/\u001a\u000200H\u0002J\u0006\u00101\u001a\u000200J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u00020\nH\u0016J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\nH\u0002J\b\u00107\u001a\u0004\u0018\u00010\u000fJ\b\u00108\u001a\u000200H\u0016J\u001e\u00108\u001a\u0002002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\nH\u0014J\u0012\u0010<\u001a\u0002002\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\nH\u0014J\u0010\u0010B\u001a\u0002002\u0006\u0010A\u001a\u00020\nH\u0014J\u001c\u0010C\u001a\u00020D2\n\u0010E\u001a\u00060FR\u00020G2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010H\u001a\u00020\u000f*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0002R\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R \u0010,\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020+8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumBannerAd;", "Landroid/widget/FrameLayout;", "Lcom/chartboost/heliumsdk/ad/HeliumAd;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "placementName", "", "size", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "heliumBannerAdListener", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAdListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;Lcom/chartboost/heliumsdk/ad/HeliumBannerAdListener;)V", "<set-?>", "availableHeightDips", "getAvailableHeightDips", "()I", "availableWidthDips", "getAvailableWidthDips", "bannerController", "Lcom/chartboost/heliumsdk/controllers/banners/BannerController;", "getBannerController$annotations", "()V", "getBannerController", "()Lcom/chartboost/heliumsdk/controllers/banners/BannerController;", "getHeliumBannerAdListener", "()Lcom/chartboost/heliumsdk/ad/HeliumBannerAdListener;", "setHeliumBannerAdListener", "(Lcom/chartboost/heliumsdk/ad/HeliumBannerAdListener;)V", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", "lastVisibility", "lastWindowVisibility", "getPlacementName", "()Ljava/lang/String;", "", "shouldFireListeners", "getShouldFireListeners", "()Z", "checkAllVisibility", "", "clearAd", "destroy", "getAdType", "getCreativeSizeDips", "Landroid/util/Size;", "getOverallVisibility", "getSize", "load", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onViewAdded", "child", "Landroid/view/View;", "onVisibilityChanged", "changedView", "visibility", "onWindowVisibilityChanged", "retrieveValuesFromAttributes", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerAttributes;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "toBannerSize", "flexibleWidth", "flexibleHeight", "HeliumBannerAttributes", "HeliumBannerSize", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeliumBannerAd extends FrameLayout implements HeliumAd {
    private int availableHeightDips;
    private int availableWidthDips;
    private final BannerController bannerController;
    private HeliumBannerAdListener heliumBannerAdListener;
    private final Keywords keywords;
    private int lastVisibility;
    private int lastWindowVisibility;
    private String placementName;
    private boolean shouldFireListeners;
    private HeliumBannerSize size;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerAttributes;", "", "placementName", "", "size", "", "flexibleWidth", "flexibleHeight", "(Ljava/lang/String;III)V", "getFlexibleHeight", "()I", "getFlexibleWidth", "getPlacementName", "()Ljava/lang/String;", "getSize", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HeliumBannerAttributes {
        private final int flexibleHeight;
        private final int flexibleWidth;
        private final String placementName;
        private final int size;

        public HeliumBannerAttributes(String str, int i2, int i3, int i4) {
            this.placementName = str;
            this.size = i2;
            this.flexibleWidth = i3;
            this.flexibleHeight = i4;
        }

        public static /* synthetic */ HeliumBannerAttributes copy$default(HeliumBannerAttributes heliumBannerAttributes, String str, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = heliumBannerAttributes.placementName;
            }
            if ((i5 & 2) != 0) {
                i2 = heliumBannerAttributes.size;
            }
            if ((i5 & 4) != 0) {
                i3 = heliumBannerAttributes.flexibleWidth;
            }
            if ((i5 & 8) != 0) {
                i4 = heliumBannerAttributes.flexibleHeight;
            }
            return heliumBannerAttributes.copy(str, i2, i3, i4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementName() {
            return this.placementName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFlexibleWidth() {
            return this.flexibleWidth;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getFlexibleHeight() {
            return this.flexibleHeight;
        }

        public final HeliumBannerAttributes copy(String placementName, int size, int flexibleWidth, int flexibleHeight) {
            return new HeliumBannerAttributes(placementName, size, flexibleWidth, flexibleHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeliumBannerAttributes)) {
                return false;
            }
            HeliumBannerAttributes heliumBannerAttributes = (HeliumBannerAttributes) other;
            return Intrinsics.a(this.placementName, heliumBannerAttributes.placementName) && this.size == heliumBannerAttributes.size && this.flexibleWidth == heliumBannerAttributes.flexibleWidth && this.flexibleHeight == heliumBannerAttributes.flexibleHeight;
        }

        public final int getFlexibleHeight() {
            return this.flexibleHeight;
        }

        public final int getFlexibleWidth() {
            return this.flexibleWidth;
        }

        public final String getPlacementName() {
            return this.placementName;
        }

        public final int getSize() {
            return this.size;
        }

        public int hashCode() {
            String str = this.placementName;
            return Integer.hashCode(this.flexibleHeight) + a.a(this.flexibleWidth, a.a(this.size, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HeliumBannerAttributes(placementName=");
            sb.append(this.placementName);
            sb.append(", size=");
            sb.append(this.size);
            sb.append(", flexibleWidth=");
            sb.append(this.flexibleWidth);
            sb.append(", flexibleHeight=");
            return android.support.v4.media.a.p(sb, this.flexibleHeight, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "", "name", "", "width", "", "height", "isAdaptive", "", "(Ljava/lang/String;IIZ)V", "aspectRatio", "", "getAspectRatio", "()D", "getHeight", "()I", "()Z", "getName", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HeliumBannerSize {
        private final double aspectRatio;
        private final int height;
        private final boolean isAdaptive;
        private final String name;
        private final int width;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final HeliumBannerSize STANDARD = new HeliumBannerSize("STANDARD", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, false, 8, null);
        public static final HeliumBannerSize MEDIUM = new HeliumBannerSize("MEDIUM", 300, 250, false, 8, null);
        public static final HeliumBannerSize LEADERBOARD = new HeliumBannerSize(l.d, 728, 90, false, 8, null);

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0007J\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize$Companion;", "", "()V", l.d, "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "MEDIUM", "STANDARD", "adaptive10x1", "width", "", "adaptive1x1", "adaptive1x2", "adaptive1x3", "adaptive1x4", "adaptive2x1", "adaptive4x1", "adaptive6x1", "adaptive8x1", "adaptive9x16", k6.f25513u, "height", "asSize", "Landroid/util/Size;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ HeliumBannerSize bannerSize$default(Companion companion, int i2, int i3, int i4, Object obj) {
                if ((i4 & 2) != 0) {
                    i3 = 0;
                }
                return companion.bannerSize(i2, i3);
            }

            public final HeliumBannerSize adaptive10x1(int width) {
                return bannerSize(width, (int) (((double) width) / 10.0d));
            }

            public final HeliumBannerSize adaptive1x1(int width) {
                return bannerSize(width, width);
            }

            public final HeliumBannerSize adaptive1x2(int width) {
                return bannerSize(width, (int) (((double) width) * 2.0d));
            }

            public final HeliumBannerSize adaptive1x3(int width) {
                return bannerSize(width, (int) (((double) width) * 3.0d));
            }

            public final HeliumBannerSize adaptive1x4(int width) {
                return bannerSize(width, (int) (((double) width) * 4.0d));
            }

            public final HeliumBannerSize adaptive2x1(int width) {
                return bannerSize(width, (int) (((double) width) / 2.0d));
            }

            public final HeliumBannerSize adaptive4x1(int width) {
                return bannerSize(width, (int) (((double) width) / 4.0d));
            }

            public final HeliumBannerSize adaptive6x1(int width) {
                return bannerSize(width, (int) (((double) width) / 6.0d));
            }

            public final HeliumBannerSize adaptive8x1(int width) {
                return bannerSize(width, (int) (((double) width) / 8.0d));
            }

            public final HeliumBannerSize adaptive9x16(int width) {
                return bannerSize(width, (int) ((((double) width) * 16.0d) / 9.0d));
            }

            public final Size asSize(HeliumBannerSize heliumBannerSize) {
                Intrinsics.f(heliumBannerSize, "<this>");
                return new Size(heliumBannerSize.getWidth(), heliumBannerSize.getHeight());
            }

            @JvmStatic
            public final HeliumBannerSize bannerSize(int width, int height) {
                return new HeliumBannerSize("ADAPTIVE", width, height, true, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ HeliumBannerSize(String str, int i2, int i3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i2, i3, z2);
        }

        @JvmStatic
        public static final HeliumBannerSize bannerSize(int i2, int i3) {
            return INSTANCE.bannerSize(i2, i3);
        }

        public static /* synthetic */ HeliumBannerSize copy$default(HeliumBannerSize heliumBannerSize, String str, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = heliumBannerSize.name;
            }
            if ((i4 & 2) != 0) {
                i2 = heliumBannerSize.width;
            }
            if ((i4 & 4) != 0) {
                i3 = heliumBannerSize.height;
            }
            if ((i4 & 8) != 0) {
                z2 = heliumBannerSize.isAdaptive;
            }
            return heliumBannerSize.copy(str, i2, i3, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsAdaptive() {
            return this.isAdaptive;
        }

        public final HeliumBannerSize copy(String name, int width, int height, boolean isAdaptive) {
            Intrinsics.f(name, "name");
            return new HeliumBannerSize(name, width, height, isAdaptive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeliumBannerSize)) {
                return false;
            }
            HeliumBannerSize heliumBannerSize = (HeliumBannerSize) other;
            return Intrinsics.a(this.name, heliumBannerSize.name) && this.width == heliumBannerSize.width && this.height == heliumBannerSize.height && this.isAdaptive == heliumBannerSize.isAdaptive;
        }

        public final double getAspectRatio() {
            return this.aspectRatio;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getName() {
            return this.name;
        }

        public final int getWidth() {
            return this.width;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iA = a.a(this.height, a.a(this.width, this.name.hashCode() * 31, 31), 31);
            boolean z2 = this.isAdaptive;
            ?? r1 = z2;
            if (z2) {
                r1 = 1;
            }
            return iA + r1;
        }

        public final boolean isAdaptive() {
            return this.isAdaptive;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HeliumBannerSize(name=");
            sb.append(this.name);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", isAdaptive=");
            return a.r(sb, this.isAdaptive, ')');
        }

        private HeliumBannerSize(String str, int i2, int i3, boolean z2) {
            this.name = str;
            this.width = i2;
            this.height = i3;
            this.isAdaptive = z2;
            this.aspectRatio = (i3 == 0 || i2 == 0) ? 0.0d : ((double) i2) / ((double) i3);
        }

        public /* synthetic */ HeliumBannerSize(String str, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i2, i3, (i4 & 8) != 0 ? false : z2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeliumBannerAd(Context context) {
        this(context, null);
        Intrinsics.f(context, "context");
    }

    private final void checkAllVisibility() {
        if (this.lastWindowVisibility == 0 && this.lastVisibility == 0) {
            this.bannerController.onHeliumBannerAdResumeRefresh();
        } else {
            this.bannerController.onHeliumBannerAdPauseRefresh();
        }
    }

    public static /* synthetic */ void getBannerController$annotations() {
    }

    private final int getOverallVisibility() {
        int visibility = getVisibility();
        int i2 = 0;
        for (ViewParent parent = getParent(); parent != null && i2 < 25; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getVisibility() > visibility) {
                    visibility = view.getVisibility();
                }
            }
            if (visibility > 0) {
                return visibility;
            }
            i2++;
        }
        return visibility;
    }

    public static /* synthetic */ void load$default(HeliumBannerAd heliumBannerAd, String str, HeliumBannerSize heliumBannerSize, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            heliumBannerSize = null;
        }
        heliumBannerAd.load(str, heliumBannerSize);
    }

    private final HeliumBannerAttributes retrieveValuesFromAttributes(Resources.Theme theme, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, R.styleable.HeliumBannerAd, 0, 0);
        Intrinsics.e(typedArrayObtainStyledAttributes, "theme.obtainStyledAttrib…ble.HeliumBannerAd, 0, 0)");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.HeliumBannerAd_heliumPlacementName);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HeliumBannerAd_heliumBannerSize, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeliumBannerAd_heliumBannerFlexibleWidth, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HeliumBannerAd_heliumBannerFlexibleHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        return new HeliumBannerAttributes(string, i2, dimensionPixelSize, dimensionPixelSize2);
    }

    private final HeliumBannerSize toBannerSize(int i2, int i3, int i4) {
        if (i2 == 0) {
            return HeliumBannerSize.STANDARD;
        }
        if (i2 == 1) {
            return HeliumBannerSize.MEDIUM;
        }
        if (i2 == 2) {
            return HeliumBannerSize.LEADERBOARD;
        }
        if (i2 == 4) {
            return HeliumBannerSize.INSTANCE.bannerSize(i3, i4);
        }
        LogController.INSTANCE.w("Size not defined, set to STANDARD by default");
        return HeliumBannerSize.STANDARD;
    }

    public final void clearAd() {
        this.bannerController.clearAd();
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public void destroy() {
        this.heliumBannerAdListener = null;
        this.bannerController.destroy();
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public int getAdType() {
        AdFormat.Companion companion = AdFormat.INSTANCE;
        Map<String, AdFormat> placementsToAdFormats = AppConfigStorage.INSTANCE.getPlacementsToAdFormats();
        return companion.toAdType(placementsToAdFormats != null ? placementsToAdFormats.get(getPlacementName()) : null);
    }

    public final int getAvailableHeightDips() {
        return this.availableHeightDips;
    }

    public final int getAvailableWidthDips() {
        return this.availableWidthDips;
    }

    public final BannerController getBannerController() {
        return this.bannerController;
    }

    public final Size getCreativeSizeDips() {
        return this.bannerController.getCreativeSizeDips$Helium_release(this.size);
    }

    public final HeliumBannerAdListener getHeliumBannerAdListener() {
        if (this.heliumBannerAdListener == null) {
            LogController.INSTANCE.w("Banner listener is null on getHeliumBannerAdListener");
        }
        return this.heliumBannerAdListener;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public Keywords getKeywords() {
        return this.keywords;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public String getPlacementName() {
        return this.placementName;
    }

    public final boolean getShouldFireListeners() {
        return !this.bannerController.getShouldAutoRefresh();
    }

    public final HeliumBannerSize getSize() {
        return this.size;
    }

    public final void load(String placementName, HeliumBannerSize size) {
        if (Intrinsics.a(placementName, getPlacementName()) && Intrinsics.a(this.size, size)) {
            load();
            return;
        }
        if (placementName == null) {
            placementName = getPlacementName();
        }
        this.placementName = placementName;
        if (size == null) {
            size = this.size;
        }
        this.size = size;
        this.bannerController.renewCachedAd$Helium_release();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMax;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i2 = 0;
        if (size2 == 0 && size == 0) {
            this.availableWidthDips = 0;
            this.availableHeightDips = 0;
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ViewParent parent = getParent();
            Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            int iMax2 = 0;
            iMax = 0;
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                if (!Intrinsics.a(childAt, this) && childAt.getVisibility() != 8) {
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                    iMax = Math.max(iMax, childAt.getMeasuredHeight());
                }
                i2++;
            }
            i2 = iMax2;
        } else {
            iMax = 0;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        this.availableWidthDips = (int) Math.floor((((size - i2) - getPaddingLeft()) - getPaddingRight()) / f);
        this.availableHeightDips = (int) Math.floor((((size2 - iMax) - getPaddingTop()) - getPaddingBottom()) / f);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        HeliumBannerAdListener heliumBannerAdListener = getHeliumBannerAdListener();
        if (heliumBannerAdListener != null) {
            heliumBannerAdListener.onAdViewAdded(getPlacementName(), child);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        int overallVisibility = getOverallVisibility();
        int i2 = this.lastVisibility;
        if (overallVisibility == i2) {
            return;
        }
        if (overallVisibility == 8 && i2 == 4) {
            return;
        }
        if (overallVisibility == 4 && i2 == 8) {
            return;
        }
        this.lastVisibility = overallVisibility;
        checkAllVisibility();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        int i2 = this.lastWindowVisibility;
        if (visibility == i2) {
            return;
        }
        if (visibility == 8 && i2 == 4) {
            return;
        }
        if (visibility == 4 && i2 == 8) {
            return;
        }
        this.lastWindowVisibility = visibility;
        checkAllVisibility();
    }

    public final void setHeliumBannerAdListener(HeliumBannerAdListener heliumBannerAdListener) {
        this.heliumBannerAdListener = heliumBannerAdListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeliumBannerAd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumBannerAd(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.f(context, "context");
        this.keywords = new Keywords();
        this.placementName = "";
        this.bannerController = new BannerController(new WeakReference(this), null, null, 6, null);
        this.shouldFireListeners = true;
        this.lastWindowVisibility = getWindowVisibility();
        this.lastVisibility = getVisibility();
        if (!isInEditMode()) {
            setBackgroundColor(0);
        }
        if (attributeSet == null) {
            LogController.INSTANCE.e("Error creating HeliumBannerAd, make sure the attributes declared in the XML are correct");
            return;
        }
        Resources.Theme theme = context.getTheme();
        Intrinsics.e(theme, "context.theme");
        HeliumBannerAttributes heliumBannerAttributesRetrieveValuesFromAttributes = retrieveValuesFromAttributes(theme, attributeSet);
        String placementName = heliumBannerAttributesRetrieveValuesFromAttributes.getPlacementName();
        String str = placementName != null ? placementName : "";
        int size = heliumBannerAttributesRetrieveValuesFromAttributes.getSize();
        if (size == -1) {
            LogController.INSTANCE.e("Error creating HeliumBannerAd, make sure the attributes declared in the XML are correct");
            return;
        }
        Dips dips = Dips.INSTANCE;
        this.size = toBannerSize(size, dips.pixelsToIntDips(heliumBannerAttributesRetrieveValuesFromAttributes.getFlexibleWidth(), context), dips.pixelsToIntDips(heliumBannerAttributesRetrieveValuesFromAttributes.getFlexibleHeight(), context));
        this.placementName = str;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public void load() {
        this.bannerController.load();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumBannerAd(Context context, String placementName, HeliumBannerSize size, HeliumBannerAdListener heliumBannerAdListener) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(size, "size");
        this.keywords = new Keywords();
        this.placementName = "";
        this.bannerController = new BannerController(new WeakReference(this), null, null, 6, null);
        this.shouldFireListeners = true;
        this.lastWindowVisibility = getWindowVisibility();
        this.lastVisibility = getVisibility();
        if (!isInEditMode()) {
            setBackgroundColor(0);
        }
        this.placementName = placementName;
        this.size = size;
        this.heliumBannerAdListener = heliumBannerAdListener;
    }
}
