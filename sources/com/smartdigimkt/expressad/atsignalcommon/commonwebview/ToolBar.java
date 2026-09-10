package com.smartdigimkt.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f34685c = 40;
        public static int d = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34687b;

        public void a(int i2) {
            this.f34687b = i2;
        }

        public void b(int i2) {
            d = i2;
        }

        public void c(int i2) {
            f34685c = i2;
        }

        public void d(int i2) {
            this.f34686a = i2;
        }

        public int a() {
            return this.f34687b;
        }

        public int b() {
            return d;
        }

        public int c() {
            return f34685c;
        }

        public int d() {
            return this.f34686a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34690c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View.OnClickListener f34691e;

        public b(String str, String str2, String str3, boolean z2, View.OnClickListener onClickListener) {
            this.f34689b = str;
            this.f34688a = str2;
            this.f34690c = str3;
            this.d = z2;
            this.f34691e = onClickListener;
        }

        public b a(View.OnClickListener onClickListener) {
            this.f34691e = onClickListener;
            return this;
        }

        public b b(String str) {
            this.f34689b = str;
            return this;
        }

        public b c(String str) {
            this.f34688a = str;
            return this;
        }

        public b a(String str) {
            this.f34690c = str;
            return this;
        }

        public b a(boolean z2) {
            this.d = z2;
            return this;
        }

        public b(String str) {
            this.d = true;
            this.f34689b = str;
        }
    }

    public ToolBar(Context context) {
        super(context);
        c();
    }

    private void a(a aVar, List<b> list) {
        setOrientation(0);
        try {
            int iA = v.a(getContext(), 10.0f);
            setPadding(0, iA, v.a(getContext(), 20.0f), iA);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f34689b);
                imageView.setImageDrawable(getResources().getDrawable(h.a(getContext(), bVar.f34690c, k.d)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(aVar.c(), -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(bVar.f34691e);
                if (!bVar.d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    private void c() {
        setOrientation(0);
        try {
            int iA = v.a(getContext(), 10.0f);
            setPadding(0, iA, 0, iA);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) b();
            imageView.setTag("backward");
            imageView.setImageDrawable(getResources().getDrawable(h.a(getContext(), "cm_backward", k.d)));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) b();
            imageView2.setTag("forward");
            imageView2.setImageDrawable(getResources().getDrawable(h.a(getContext(), "cm_forward", k.d)));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) b();
            imageView3.setTag("refresh");
            imageView3.setImageDrawable(getResources().getDrawable(h.a(getContext(), "cm_refresh", k.d)));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) b();
            imageView4.setTag("open_by_browser");
            imageView4.setImageDrawable(getResources().getDrawable(h.a(getContext(), "cm_browser", k.d)));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) b();
            imageView5.setTag("exits");
            imageView5.setImageDrawable(getResources().getDrawable(h.a(getContext(), "cm_exits", k.d)));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(h.a(getContext(), str2, k.d)));
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str, int i2) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = (TextView) a();
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i2);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public ToolBar(Context context, List<b> list) {
        super(context);
        a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<b> list) {
        super(context, attributeSet);
        a(list);
    }

    public void setTitle(String str) {
        setTitle(str, -16777216);
    }

    public ToolBar(Context context, a aVar, List<b> list) {
        super(context);
        a(aVar, list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, a aVar, List<b> list) {
        super(context, attributeSet);
        a(aVar, list);
    }

    private void a(List<b> list) {
        setOrientation(0);
        try {
            int iA = v.a(getContext(), 10.0f);
            setPadding(0, iA, 0, iA);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f34689b);
                imageView.setImageDrawable(getResources().getDrawable(h.a(getContext(), bVar.f34690c, k.d)));
                imageView.setOnClickListener(bVar.f34691e);
                if (!bVar.d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private View a() {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setClickable(true);
        return textView;
    }
}
