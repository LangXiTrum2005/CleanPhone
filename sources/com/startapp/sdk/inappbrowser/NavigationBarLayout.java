package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.sdk.internal.g2;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.td;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationBarLayout extends RelativeLayout {
    private static final int j = R.id.io_start_navigation_bar;
    private static final int k = R.id.io_start_navigation_bar_title;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f40757l = R.id.io_start_navigation_bar_close;
    private static final int m = R.id.io_start_navigation_bar_external;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f40758n = R.id.io_start_navigation_bar_back;
    private static final int o = R.id.io_start_navigation_bar_forward;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f40759p = R.id.io_start_navigation_bar_title_url;
    private static final int q = Color.rgb(78, 86, 101);
    private static final int r = Color.rgb(148, ModuleDescriptor.MODULE_VERSION, 166);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f40760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f40761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f40762c;
    private ImageView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f40763e;
    private TextView f;
    private TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f40764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f40765i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f40764h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f40764h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f40763e.setImageBitmap(((td) this.f40765i.get("BACK_DARK")).f41521a);
                this.f40763e.setEnabled(true);
            } else {
                this.f40763e.setImageBitmap(((td) this.f40765i.get("BACK")).f41521a);
                this.f40763e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f40762c.setImageBitmap(((td) this.f40765i.get("FORWARD_DARK")).f41521a);
                this.f40762c.setEnabled(true);
            } else {
                this.f40762c.setImageBitmap(((td) this.f40765i.get("FORWARD")).f41521a);
                this.f40762c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f40763e.setImageBitmap(((td) this.f40765i.get("BACK_DARK")).f41521a);
            addView(this.f40763e, li.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f40762c;
            int i2 = f40758n;
            RelativeLayout.LayoutParams layoutParamsA = li.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            layoutParamsA.addRule(1, i2);
            addView(view, layoutParamsA);
            removeView(this.f40760a);
            this.f40760a.removeView(this.g);
            this.f40760a.removeView(this.f);
            this.f40760a.addView(this.f, li.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f40760a;
            TextView textView = this.g;
            int i3 = k;
            RelativeLayout.LayoutParams layoutParamsA2 = li.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            layoutParamsA2.addRule(3, i3);
            relativeLayout.addView(textView, layoutParamsA2);
            int i4 = o;
            RelativeLayout.LayoutParams layoutParamsA3 = li.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            layoutParamsA3.addRule(1, i4);
            layoutParamsA3.addRule(0, m);
            addView(this.f40760a, layoutParamsA3);
            this.f40764h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.g;
    }

    public final void c() throws Throwable {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i2 = q;
        int i3 = k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i2);
        textView.setId(i3);
        this.f = textView;
        Context context2 = getContext();
        int i4 = r;
        int i5 = f40759p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i4);
        textView2.setId(i5);
        this.g = textView2;
        this.f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f40760a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f40760a.addView(this.f, li.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f40760a;
        TextView textView3 = this.g;
        RelativeLayout.LayoutParams layoutParamsA = li.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        layoutParamsA.addRule(3, i3);
        relativeLayout2.addView(textView3, layoutParamsA);
        for (td tdVar : this.f40765i.values()) {
            Context context3 = getContext();
            String str = tdVar.d;
            Bitmap bitmapB = g2.b(context3, str);
            if (bitmapB == null) {
                bitmapB = g2.b(context3, str);
            }
            if (bitmapB != null) {
                tdVar.f41521a = Bitmap.createScaledBitmap(bitmapB, li.a(getContext(), tdVar.f41522b), li.a(getContext(), tdVar.f41523c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((td) this.f40765i.get("X")).f41521a;
        int i6 = f40757l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i6);
        this.f40761b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((td) this.f40765i.get("BROWSER")).f41521a;
        int i7 = m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i7);
        this.d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((td) this.f40765i.get("BACK")).f41521a;
        int i8 = f40758n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i8);
        this.f40763e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((td) this.f40765i.get("FORWARD")).f41521a;
        int i9 = o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i9);
        this.f40762c = imageView4;
        int iA = li.a(getContext(), 10);
        this.f40762c.setPadding(iA, iA, iA, iA);
        this.f40762c.setEnabled(false);
        this.f40763e.setPadding(iA, iA, iA, iA);
        addView(this.f40761b, li.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.d;
        RelativeLayout.LayoutParams layoutParamsA2 = li.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        layoutParamsA2.addRule(0, i6);
        addView(view, layoutParamsA2);
        View view2 = this.f40760a;
        RelativeLayout.LayoutParams layoutParamsA3 = li.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        layoutParamsA3.addRule(0, i7);
        addView(view2, layoutParamsA3);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, li.a(getContext(), 60)));
        setId(j);
        HashMap map = new HashMap();
        map.put("BACK", new td(14, 22, "back_.png"));
        map.put("BACK_DARK", new td(14, 22, "back_dark.png"));
        map.put("FORWARD", new td(14, 22, "forward_.png"));
        map.put("FORWARD_DARK", new td(14, 22, "forward_dark.png"));
        map.put("X", new td(23, 23, "x_dark.png"));
        map.put("BROWSER", new td(28, 28, "browser_icon_dark.png"));
        this.f40765i = map;
    }

    public final void e() {
        this.f40765i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f40761b.setOnClickListener(onClickListener);
        this.f40763e.setOnClickListener(onClickListener);
        this.f40762c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f;
    }
}
