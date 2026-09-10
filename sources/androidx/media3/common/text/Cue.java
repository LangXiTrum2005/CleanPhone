package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Cue {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f5586A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f5587B;
    public static final String C;
    public static final String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f5588E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f5589F;
    public static final String G;
    public static final String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f5590I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f5591J;
    public static final String r;
    public static final String s;
    public static final String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f5592u;
    public static final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f5593w;
    public static final String x;
    public static final String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f5594z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f5597c;
    public final Bitmap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5598e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f5599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5600i;
    public final float j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5601l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5602n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5603p;
    public final float q;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f5604a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f5605b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Layout.Alignment f5606c = null;
        public Layout.Alignment d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f5607e = -3.4028235E38f;
        public int f = Integer.MIN_VALUE;
        public int g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f5608h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5609i = Integer.MIN_VALUE;
        public int j = Integer.MIN_VALUE;
        public float k = -3.4028235E38f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f5610l = -3.4028235E38f;
        public float m = -3.4028235E38f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f5611n = false;
        public int o = -16777216;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5612p = Integer.MIN_VALUE;
        public float q;

        public final Cue a() {
            return new Cue(this.f5604a, this.f5606c, this.d, this.f5605b, this.f5607e, this.f, this.g, this.f5608h, this.f5609i, this.j, this.k, this.f5610l, this.m, this.f5611n, this.o, this.f5612p, this.q);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        Builder builder = new Builder();
        builder.f5604a = "";
        builder.a();
        int i2 = Util.f5683a;
        r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        t = Integer.toString(1, 36);
        f5592u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f5593w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        f5594z = Integer.toString(6, 36);
        f5586A = Integer.toString(7, 36);
        f5587B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        f5588E = Integer.toString(11, 36);
        f5589F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        f5590I = Integer.toString(15, 36);
        f5591J = Integer.toString(16, 36);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i2, int i3, float f2, int i4, int i5, float f3, float f4, float f5, boolean z2, int i6, int i7, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            Assertions.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f5595a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f5595a = charSequence.toString();
        } else {
            this.f5595a = null;
        }
        this.f5596b = alignment;
        this.f5597c = alignment2;
        this.d = bitmap;
        this.f5598e = f;
        this.f = i2;
        this.g = i3;
        this.f5599h = f2;
        this.f5600i = i4;
        this.j = f4;
        this.k = f5;
        this.f5601l = z2;
        this.m = i6;
        this.f5602n = i5;
        this.o = f3;
        this.f5603p = i7;
        this.q = f6;
    }

    public static Cue b(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(r);
        if (charSequence != null) {
            builder.f5604a = charSequence;
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(s);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i2 = bundle2.getInt(CustomSpanBundler.f5615a);
                    int i3 = bundle2.getInt(CustomSpanBundler.f5616b);
                    int i4 = bundle2.getInt(CustomSpanBundler.f5617c);
                    int i5 = bundle2.getInt(CustomSpanBundler.d, -1);
                    Bundle bundle3 = bundle2.getBundle(CustomSpanBundler.f5618e);
                    if (i5 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(RubySpan.f5619c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new RubySpan(string, bundle3.getInt(RubySpan.d)), i2, i3, i4);
                    } else if (i5 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new TextEmphasisSpan(bundle3.getInt(TextEmphasisSpan.d), bundle3.getInt(TextEmphasisSpan.f5622e), bundle3.getInt(TextEmphasisSpan.f)), i2, i3, i4);
                    } else if (i5 == 3) {
                        spannableStringValueOf.setSpan(new HorizontalTextInVerticalContextSpan(), i2, i3, i4);
                    }
                }
                builder.f5604a = spannableStringValueOf;
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(t);
        if (alignment != null) {
            builder.f5606c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f5592u);
        if (alignment2 != null) {
            builder.d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(v);
        if (bitmap != null) {
            builder.f5605b = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(f5593w);
            if (byteArray != null) {
                builder.f5605b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
        }
        String str = x;
        if (bundle.containsKey(str)) {
            String str2 = y;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i6 = bundle.getInt(str2);
                builder.f5607e = f;
                builder.f = i6;
            }
        }
        String str3 = f5594z;
        if (bundle.containsKey(str3)) {
            builder.g = bundle.getInt(str3);
        }
        String str4 = f5586A;
        if (bundle.containsKey(str4)) {
            builder.f5608h = bundle.getFloat(str4);
        }
        String str5 = f5587B;
        if (bundle.containsKey(str5)) {
            builder.f5609i = bundle.getInt(str5);
        }
        String str6 = D;
        if (bundle.containsKey(str6)) {
            String str7 = C;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i7 = bundle.getInt(str7);
                builder.k = f2;
                builder.j = i7;
            }
        }
        String str8 = f5588E;
        if (bundle.containsKey(str8)) {
            builder.f5610l = bundle.getFloat(str8);
        }
        String str9 = f5589F;
        if (bundle.containsKey(str9)) {
            builder.m = bundle.getFloat(str9);
        }
        String str10 = G;
        if (bundle.containsKey(str10)) {
            builder.o = bundle.getInt(str10);
            builder.f5611n = true;
        }
        if (!bundle.getBoolean(H, false)) {
            builder.f5611n = false;
        }
        String str11 = f5590I;
        if (bundle.containsKey(str11)) {
            builder.f5612p = bundle.getInt(str11);
        }
        String str12 = f5591J;
        if (bundle.containsKey(str12)) {
            builder.q = bundle.getFloat(str12);
        }
        return builder.a();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f5604a = this.f5595a;
        builder.f5605b = this.d;
        builder.f5606c = this.f5596b;
        builder.d = this.f5597c;
        builder.f5607e = this.f5598e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f5608h = this.f5599h;
        builder.f5609i = this.f5600i;
        builder.j = this.f5602n;
        builder.k = this.o;
        builder.f5610l = this.j;
        builder.m = this.k;
        builder.f5611n = this.f5601l;
        builder.o = this.m;
        builder.f5612p = this.f5603p;
        builder.q = this.q;
        return builder;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f5595a;
        if (charSequence != null) {
            bundle.putCharSequence(r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = CustomSpanBundler.f5615a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (RubySpan rubySpan : (RubySpan[]) spanned.getSpans(0, spanned.length(), RubySpan.class)) {
                    rubySpan.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(RubySpan.f5619c, rubySpan.f5620a);
                    bundle2.putInt(RubySpan.d, rubySpan.f5621b);
                    arrayList.add(CustomSpanBundler.a(spanned, rubySpan, 1, bundle2));
                }
                for (TextEmphasisSpan textEmphasisSpan : (TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), TextEmphasisSpan.class)) {
                    textEmphasisSpan.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(TextEmphasisSpan.d, textEmphasisSpan.f5623a);
                    bundle3.putInt(TextEmphasisSpan.f5622e, textEmphasisSpan.f5624b);
                    bundle3.putInt(TextEmphasisSpan.f, textEmphasisSpan.f5625c);
                    arrayList.add(CustomSpanBundler.a(spanned, textEmphasisSpan, 2, bundle3));
                }
                for (HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), HorizontalTextInVerticalContextSpan.class)) {
                    arrayList.add(CustomSpanBundler.a(spanned, horizontalTextInVerticalContextSpan, 3, null));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(s, arrayList);
                }
            }
        }
        bundle.putSerializable(t, this.f5596b);
        bundle.putSerializable(f5592u, this.f5597c);
        bundle.putFloat(x, this.f5598e);
        bundle.putInt(y, this.f);
        bundle.putInt(f5594z, this.g);
        bundle.putFloat(f5586A, this.f5599h);
        bundle.putInt(f5587B, this.f5600i);
        bundle.putInt(C, this.f5602n);
        bundle.putFloat(D, this.o);
        bundle.putFloat(f5588E, this.j);
        bundle.putFloat(f5589F, this.k);
        bundle.putBoolean(H, this.f5601l);
        bundle.putInt(G, this.m);
        bundle.putInt(f5590I, this.f5603p);
        bundle.putFloat(f5591J, this.q);
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Assertions.e(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f5593w, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (!TextUtils.equals(this.f5595a, cue.f5595a) || this.f5596b != cue.f5596b || this.f5597c != cue.f5597c) {
            return false;
        }
        Bitmap bitmap = cue.d;
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f5598e == cue.f5598e && this.f == cue.f && this.g == cue.g && this.f5599h == cue.f5599h && this.f5600i == cue.f5600i && this.j == cue.j && this.k == cue.k && this.f5601l == cue.f5601l && this.m == cue.m && this.f5602n == cue.f5602n && this.o == cue.o && this.f5603p == cue.f5603p && this.q == cue.q;
    }

    public final int hashCode() {
        Float fValueOf = Float.valueOf(this.f5598e);
        Integer numValueOf = Integer.valueOf(this.f);
        Integer numValueOf2 = Integer.valueOf(this.g);
        Float fValueOf2 = Float.valueOf(this.f5599h);
        Integer numValueOf3 = Integer.valueOf(this.f5600i);
        Float fValueOf3 = Float.valueOf(this.j);
        Float fValueOf4 = Float.valueOf(this.k);
        Boolean boolValueOf = Boolean.valueOf(this.f5601l);
        Integer numValueOf4 = Integer.valueOf(this.m);
        Integer numValueOf5 = Integer.valueOf(this.f5602n);
        Float fValueOf5 = Float.valueOf(this.o);
        Integer numValueOf6 = Integer.valueOf(this.f5603p);
        Float fValueOf6 = Float.valueOf(this.q);
        return Arrays.hashCode(new Object[]{this.f5595a, this.f5596b, this.f5597c, this.d, fValueOf, numValueOf, numValueOf2, fValueOf2, numValueOf3, fValueOf3, fValueOf4, boolValueOf, numValueOf4, numValueOf5, fValueOf5, numValueOf6, fValueOf6});
    }
}
