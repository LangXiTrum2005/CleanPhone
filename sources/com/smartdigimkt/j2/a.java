package com.smartdigimkt.j2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.video.dynview.widget.ATRotationView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkImageView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkTextView;
import com.smartdigimkt.expressad.videocommon.view.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a extends BaseAdapter {
    private static final String d = "OrderCampAdapter";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35900e = "sdm_lv_item_rl";
    private static final String f = "sdm_lv_iv";
    private static final String g = "sdm_lv_icon_iv";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f35901h = "sdm_lv_title_tv";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f35902i = "sdm_lv_tv_install";
    private static final String j = "sdm_lv_sv_starlevel";
    private static final String k = "sdm_lv_sv_heat_level";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f35903l = "sdm_lv_ration";
    private static final String m = "sdm_lv_desc_tv";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35904n = "sdm_iv_flag";
    private static final String o = "sdm_order_viewed_tv";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f35905p = "sdm_order_layout_item";
    private static final String q = "sdm_lv_iv_burl";
    private static final String r = "501";
    private static final String s = "\\.xml";
    private static final String t = "\\/xml";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f35906u = "_item.xml";
    public static final String v = "template_config.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35907a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f35908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d> f35909c;

    public class b implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35913a;

        public b(Context context) {
            this.f35913a = context;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                int iA = v.a(this.f35913a, 12.0f);
                a.this.f35908b.j.getLayoutParams().height = iA;
                a.this.f35908b.j.getLayoutParams().width = (int) (iA * width);
                a.this.f35908b.j.setImageBitmap(bitmap);
                a.this.f35908b.j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f35915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ATRotationView f35916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnyThinkImageView f35917c;
        RoundImageView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f35918e;
        TextView f;
        TextView g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        TextView f35919h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        AnyThinkLevelLayoutView f35920i;
        ImageView j;
    }

    public a(List<d> list) {
        this.f35909c = list;
    }

    private View b(int i2) {
        return a();
    }

    private int c(String str) {
        return k.a(com.smartdigimkt.m6.b.p().k().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return k.a(com.smartdigimkt.m6.b.p().k().getApplicationContext(), str, "layout");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<d> list = this.f35909c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f35909c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        List<d> list = this.f35909c;
        if (list != null) {
            return list.get(i2);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                view = b(i2);
            } else {
                this.f35908b = (c) view.getTag();
            }
            a(view);
            a(i2, viewGroup);
            a(i2);
            return view;
        } catch (Exception e2) {
            e2.getMessage();
            return view;
        }
    }

    private void a(int i2, ViewGroup viewGroup) {
        List<d> list = this.f35909c;
        if (list == null || this.f35908b == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f35908b.f35917c;
        if (anyThinkImageView != null) {
            a(anyThinkImageView, this.f35909c.get(i2).k(), false);
        }
        RoundImageView roundImageView = this.f35908b.d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f35908b.d, this.f35909c.get(i2).i(), true);
        }
        double dO = this.f35909c.get(i2).o();
        if (dO <= 0.0d) {
            dO = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f35908b.f35920i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(dO, this.f35909c.get(i2).m());
            this.f35908b.f35920i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f35908b.f35916b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f35908b.f35916b.setHeightRatio(1.0f);
            this.f35908b.f35916b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f35908b.f35917c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: com.smartdigimkt.j2.a$a, reason: collision with other inner class name */
    public class C0509a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f35910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35911b;

        public C0509a(ImageView imageView, boolean z2) {
            this.f35910a = imageView;
            this.f35911b = z2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f35910a.setImageBitmap(bitmap);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            if (this.f35911b) {
                this.f35910a.setVisibility(8);
            }
        }
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.smartdigimkt.m6.b.p().k()).inflate(d(f35905p), (ViewGroup) null);
        c cVar = new c();
        this.f35908b = cVar;
        cVar.f35917c = (AnyThinkImageView) viewInflate.findViewById(c(f));
        this.f35908b.d = (RoundImageView) viewInflate.findViewById(c(g));
        this.f35908b.f35920i = (AnyThinkLevelLayoutView) viewInflate.findViewById(c(j));
        this.f35908b.f35916b = (ATRotationView) viewInflate.findViewById(c(f35903l));
        viewInflate.setTag(this.f35908b);
        return viewInflate;
    }

    private void a(View view) {
        this.f35908b.f35915a = (RelativeLayout) view.findViewById(a(f35900e));
        this.f35908b.f35918e = (TextView) view.findViewById(a(f35901h));
        this.f35908b.g = (TextView) view.findViewById(a(f35902i));
        this.f35908b.f = (TextView) view.findViewById(a(m));
        this.f35908b.j = (ImageView) view.findViewById(a(f35904n));
        this.f35908b.f35919h = (TextView) view.findViewById(a(o));
    }

    private void a(ImageView imageView, String str, boolean z2) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.smartdigimkt.f0.b.a(imageView.getContext()).a(str, new C0509a(imageView, z2));
        } else if (z2) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i2) {
        if (this.f35908b != null) {
            d dVar = this.f35909c.get(i2);
            if (this.f35908b.f35918e != null) {
                this.f35908b.f35918e.setText(dVar.f());
            }
            if (this.f35908b.f != null) {
                this.f35908b.f.setText(dVar.e());
            }
            if (this.f35908b.g != null) {
                String strB = dVar.b();
                if (this.f35908b.g instanceof AnyThinkTextView) {
                    ((AnyThinkTextView) this.f35908b.g).setObjectAnimator(new com.smartdigimkt.l2.b().a(this.f35908b.g));
                }
                this.f35908b.g.setText(strB);
            }
            if (this.f35908b.j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    v.a(this.f35908b.j, dVar, com.smartdigimkt.m6.b.p().k(), false);
                    com.smartdigimkt.f0.b.a(contextK).a(dVar.P(), new b(contextK));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            if (this.f35908b.f35919h != null) {
                try {
                    this.f35908b.f35919h.setText(com.smartdigimkt.m6.b.p().k().getResources().getString(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_viewed_text_str", k.f38992h)));
                    this.f35908b.f35919h.setVisibility(0);
                } catch (Exception e3) {
                    e3.getMessage();
                }
            }
        }
    }

    private int a(String str) {
        if (this.f35907a) {
            return b(str);
        }
        return c(str);
    }
}
