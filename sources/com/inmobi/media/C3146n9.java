package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3146n9 {
    public static ViewGroup.LayoutParams a(C2984d8 asset, ViewGroup parent) {
        Intrinsics.f(asset, "asset");
        Intrinsics.f(parent, "parent");
        C3001e8 c3001e8 = asset.d;
        Point point = c3001e8.f23552a;
        Point point2 = c3001e8.f23554c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a(point.x), a(point.y));
        if (parent instanceof C3081j8) {
            C3065i8 c3065i8 = new C3065i8(a(point.x), a(point.y));
            int iA = a(point2.x);
            int iA2 = a(point2.y);
            c3065i8.f23692a = iA;
            c3065i8.f23693b = iA2;
            return c3065i8;
        }
        if (parent instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(point.x), a(point.y));
            layoutParams2.setMargins(a(point2.x), a(point2.y), 0, 0);
            return layoutParams2;
        }
        if (parent instanceof AbsListView) {
            return new AbsListView.LayoutParams(a(point.x), a(point.y));
        }
        if (!(parent instanceof FrameLayout)) {
            HashMap map = D9.f22775c;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a(point.x), a(point.y));
        layoutParams3.setMargins(a(point2.x), a(point2.y), 0, 0);
        return layoutParams3;
    }

    public static int a(int i2) {
        int i3;
        return ((((Context) D9.f22776e.get()) instanceof InMobiAdActivity) || (i3 = D9.f) == 0) ? i2 : (int) (((((double) i3) * 1.0d) / ((double) D9.g)) * ((double) i2));
    }

    public static void a(Context context, ImageView imageView) {
        Bitmap bitmapCreateBitmap;
        if (imageView.getDrawable() == null) {
            float f = U3.d().f23294c;
            C3315y3 c3315y3 = new C3315y3(context, (byte) 0, null);
            if (Build.VERSION.SDK_INT < 28) {
                c3315y3.layout(0, 0, (int) (a(40) * f), (int) (a(40) * f));
                c3315y3.setDrawingCacheEnabled(true);
                c3315y3.buildDrawingCache();
                bitmapCreateBitmap = c3315y3.getDrawingCache();
                Intrinsics.e(bitmapCreateBitmap, "getDrawingCache(...)");
            } else {
                c3315y3.layout(0, 0, (int) (a(40) * f), (int) (a(40) * f));
                bitmapCreateBitmap = Bitmap.createBitmap((int) (a(40) * f), (int) (a(40) * f), Bitmap.Config.ARGB_8888);
                Intrinsics.e(bitmapCreateBitmap, "createBitmap(...)");
                c3315y3.draw(new Canvas(bitmapCreateBitmap));
            }
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
    }

    public static final void a(TextView textView, ArrayList arrayList) {
        HashMap map = D9.f22775c;
        int paintFlags = textView.getPaintFlags();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -1178781136) {
                if (iHashCode != -1026963764) {
                    if (iHashCode != -891985998) {
                        if (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                            i2 |= 1;
                        }
                    } else if (str.equals("strike")) {
                        paintFlags |= 16;
                    }
                } else if (str.equals(TtmlNode.UNDERLINE)) {
                    paintFlags |= 8;
                }
            } else if (str.equals(TtmlNode.ITALIC)) {
                i2 |= 2;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i2);
        textView.setPaintFlags(paintFlags);
    }

    public static void a(View view, C3001e8 assetStyle) {
        Intrinsics.f(view, "view");
        Intrinsics.f(assetStyle, "assetStyle");
        int color = Color.parseColor("#00000000");
        try {
            color = Color.parseColor(assetStyle.a());
        } catch (IllegalArgumentException e2) {
            HashMap map = D9.f22775c;
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        view.setBackgroundColor(color);
        if ("line".equals(assetStyle.f23555e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            if ("curved".equals(assetStyle.f)) {
                gradientDrawable.setCornerRadius(assetStyle.f23556h);
            }
            int color2 = Color.parseColor("#ff000000");
            try {
                String str = assetStyle.f23557i;
                Locale US = Locale.US;
                Intrinsics.e(US, "US");
                String lowerCase = str.toLowerCase(US);
                Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                color2 = Color.parseColor(lowerCase);
            } catch (IllegalArgumentException e3) {
                HashMap map2 = D9.f22775c;
                S5 s6 = S5.f23167a;
                S5.d.a(new C3011f2(e3));
            }
            gradientDrawable.setStroke(1, color2);
            view.setBackground(gradientDrawable);
        }
    }

    public static final void a(View view) {
        HashMap map = D9.f22775c;
        view.setBackground(null);
    }
}
