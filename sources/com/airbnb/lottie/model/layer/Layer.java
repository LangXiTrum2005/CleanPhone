package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieComposition f9841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9842c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerType f9843e;
    public final long f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f9844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AnimatableTransform f9845i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9846l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f9847n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9848p;
    public final AnimatableTextFrame q;
    public final AnimatableTextProperties r;
    public final AnimatableFloatValue s;
    public final List t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MatteType f9849u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BlurEffect f9850w;
    public final DropShadowEffect x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {
        public static final LayerType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final LayerType f9851Y;
        public static final LayerType Z;
        public static final /* synthetic */ LayerType[] e0;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            X = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            LayerType layerType3 = new LayerType("IMAGE", 2);
            f9851Y = layerType3;
            LayerType layerType4 = new LayerType("NULL", 3);
            LayerType layerType5 = new LayerType("SHAPE", 4);
            LayerType layerType6 = new LayerType(AdPreferences.TYPE_TEXT, 5);
            LayerType layerType7 = new LayerType("UNKNOWN", 6);
            Z = layerType7;
            e0 = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) e0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {
        public static final MatteType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final MatteType f9852Y;
        public static final /* synthetic */ MatteType[] Z;

        static {
            MatteType matteType = new MatteType("NONE", 0);
            X = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            MatteType matteType3 = new MatteType("INVERT", 2);
            f9852Y = matteType3;
            Z = new MatteType[]{matteType, matteType2, matteType3, new MatteType("LUMA", 3), new MatteType("LUMA_INVERTED", 4), new MatteType("UNKNOWN", 5)};
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) Z.clone();
        }
    }

    public Layer(List list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, String str2, List list2, AnimatableTransform animatableTransform, int i2, int i3, int i4, float f, float f2, int i5, int i6, AnimatableTextFrame animatableTextFrame, AnimatableTextProperties animatableTextProperties, List list3, MatteType matteType, AnimatableFloatValue animatableFloatValue, boolean z2, BlurEffect blurEffect, DropShadowEffect dropShadowEffect) {
        this.f9840a = list;
        this.f9841b = lottieComposition;
        this.f9842c = str;
        this.d = j;
        this.f9843e = layerType;
        this.f = j2;
        this.g = str2;
        this.f9844h = list2;
        this.f9845i = animatableTransform;
        this.j = i2;
        this.k = i3;
        this.f9846l = i4;
        this.m = f;
        this.f9847n = f2;
        this.o = i5;
        this.f9848p = i6;
        this.q = animatableTextFrame;
        this.r = animatableTextProperties;
        this.t = list3;
        this.f9849u = matteType;
        this.s = animatableFloatValue;
        this.v = z2;
        this.f9850w = blurEffect;
        this.x = dropShadowEffect;
    }

    public final String a(String str) {
        int i2;
        StringBuilder sbW = android.support.v4.media.a.w(str);
        sbW.append(this.f9842c);
        sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        LottieComposition lottieComposition = this.f9841b;
        Layer layer = (Layer) lottieComposition.f9518h.d(this.f);
        if (layer != null) {
            sbW.append("\t\tParents: ");
            sbW.append(layer.f9842c);
            for (Layer layer2 = (Layer) lottieComposition.f9518h.d(layer.f); layer2 != null; layer2 = (Layer) lottieComposition.f9518h.d(layer2.f)) {
                sbW.append("->");
                sbW.append(layer2.f9842c);
            }
            sbW.append(str);
            sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        List list = this.f9844h;
        if (!list.isEmpty()) {
            sbW.append(str);
            sbW.append("\tMasks: ");
            sbW.append(list.size());
            sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        int i3 = this.j;
        if (i3 != 0 && (i2 = this.k) != 0) {
            sbW.append(str);
            sbW.append("\tBackground: ");
            sbW.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(this.f9846l)));
        }
        List list2 = this.f9840a;
        if (!list2.isEmpty()) {
            sbW.append(str);
            sbW.append("\tShapes:\n");
            for (Object obj : list2) {
                sbW.append(str);
                sbW.append("\t\t");
                sbW.append(obj);
                sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sbW.toString();
    }

    public final String toString() {
        return a("");
    }
}
