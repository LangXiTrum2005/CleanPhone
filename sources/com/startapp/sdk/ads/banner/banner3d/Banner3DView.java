package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.internal.e1;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.json.RatingBar;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes6.dex */
public class Banner3DView extends RelativeLayout {
    public static final int g = R.id.io_start_banner_photo;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f40427h = R.id.io_start_banner_title;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f40428i = R.id.io_start_banner_description;
    public static final int j = R.id.io_start_banner_download;
    public static final int k = R.id.io_start_banner_rating;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f40429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f40430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f40431c;
    private RatingBar d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f40432e;
    private final Point f;

    public enum Template {
        /* JADX INFO: Fake field, exist only in values array */
        XS,
        S,
        M,
        L,
        XL
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Context context = getContext();
        Template template = Template.S;
        int i2 = this.f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i2 > size.getSize().getWidth() || this.f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i3 = this.f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i3 > size2.getSize().getWidth() || this.f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i4 = this.f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i4 > size3.getSize().getWidth() || this.f.y > size3.getSize().getHeight()) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int iA = li.a(context, 2);
        int iRound = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int iRound2 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int iRound3 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int iRound4 = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int iRound5 = Math.round(TypedValue.applyDimension(1, 20, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        int iRound6 = Math.round(TypedValue.applyDimension(1, 90, context.getResources().getDisplayMetrics()));
        setPadding(iRound2, 0, iRound2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f40431c = imageView;
        int i5 = g;
        imageView.setId(i5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound6, iRound6);
        layoutParams.addRule(15);
        this.f40431c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f40429a = textView;
        int i6 = f40427h;
        textView.setId(i6);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i5);
        layoutParams2.addRule(14);
        this.f40429a.setLayoutParams(layoutParams2);
        this.f40429a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f40429a.setGravity(8388611);
        this.f40429a.setBackgroundColor(0);
        int iOrdinal = template.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f40429a.setTextSize(17.0f);
            this.f40429a.setPadding(iRound, 0, 0, iA);
            layoutParams2.width = li.a(getContext(), (int) (((double) this.f.x) * 0.55d));
        } else if (iOrdinal == 2) {
            this.f40429a.setTextSize(17.0f);
            this.f40429a.setPadding(iRound, 0, 0, iA);
            layoutParams2.width = li.a(getContext(), (int) (((double) this.f.x) * 0.65d));
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            this.f40429a.setTextSize(22.0f);
            this.f40429a.setPadding(iRound, 0, 0, iRound2);
        }
        this.f40429a.setSingleLine(true);
        this.f40429a.setEllipsize(TextUtils.TruncateAt.END);
        li.a(this.f40429a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f40430b = textView2;
        int i7 = f40428i;
        textView2.setId(i7);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i5);
        layoutParams3.addRule(3, i6);
        layoutParams3.setMargins(0, 0, 0, iRound2);
        this.f40430b.setLayoutParams(layoutParams3);
        this.f40430b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f40430b.setTextSize(18.0f);
        this.f40430b.setMaxLines(2);
        this.f40430b.setLines(2);
        this.f40430b.setSingleLine(false);
        this.f40430b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f40430b.setHorizontallyScrolling(true);
        this.f40430b.setPadding(iRound, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.d = ratingBar;
        ratingBar.setId(k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int iOrdinal2 = template.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            layoutParams4.addRule(17, i5);
            layoutParams4.addRule(8, i5);
        } else if (iOrdinal2 == 3 || iOrdinal2 == 4) {
            layoutParams4.addRule(17, i6);
            layoutParams3.width = li.a(getContext(), (int) (((double) this.f.x) * 0.6d));
        }
        layoutParams4.setMargins(iRound, iRound4, iRound, 0);
        this.d.setLayoutParams(layoutParams4);
        this.f40432e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int iOrdinal3 = template.ordinal();
        if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
            this.f40432e.setTextSize(13.0f);
            layoutParams5.addRule(17, i6);
            layoutParams5.addRule(15);
        } else if (iOrdinal3 == 3) {
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(iRound5, 0, 0, 0);
            this.f40432e.setTextSize(26.0f);
        } else if (iOrdinal3 == 4) {
            layoutParams5.addRule(17, i7);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(iRound5 * 7, 0, 0, 0);
            this.f40432e.setTextSize(26.0f);
        }
        this.f40432e.setPadding(iRound3, iRound3, iRound3, iRound3);
        this.f40432e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f40432e.setTextColor(-1);
        this.f40432e.setTypeface(null, 1);
        this.f40432e.setId(j);
        this.f40432e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f40432e.setBackgroundDrawable(new e1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f40431c);
        addView(this.f40429a);
        int iOrdinal4 = template.ordinal();
        if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
            addView(this.f40432e);
        } else if (iOrdinal4 == 3 || iOrdinal4 == 4) {
            addView(this.f40432e);
            addView(this.f40430b);
        }
        addView(this.d);
    }

    public void setButtonText(boolean z2) {
        if (z2) {
            this.f40432e.setText("OPEN");
        } else {
            this.f40432e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] strArrA = a(str);
                String str2 = strArrA[0];
                String str3 = strArrA[1];
                String strM = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    strM = android.support.v4.media.a.m(strM, "...");
                }
                this.f40430b.setText(str2 + IOUtils.LINE_SEPARATOR_UNIX + strM);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f40431c.setImageBitmap(bitmap);
    }

    public void setRating(float f) {
        try {
            this.d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f40429a.setText(str);
    }

    public void setImage(int i2, int i3, int i4) {
        this.f40431c.setImageResource(i2);
        ViewGroup.LayoutParams layoutParams = this.f40431c.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f40431c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i2, int i3) {
        this.f40431c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f40431c.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.f40431c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    private static String[] a(String str) {
        boolean z2;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i2 = length - 1;
            int i3 = length - 2;
            while (true) {
                if (i3 <= 0) {
                    z2 = false;
                    break;
                }
                if (charArray[i3] == ' ') {
                    z2 = true;
                    i2 = i3;
                    break;
                }
                i3--;
            }
            int i4 = z2 ? i2 : 55;
            strArr[0] = str.substring(0, i4);
            strArr[1] = str.substring(i4 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
