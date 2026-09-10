package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class IconListView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a> f46401b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f46402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f46403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46404c;
        public final LinearLayout d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f46405e;
        public final ImageView f;
        public final LinearLayout g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f46406h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ImageView f46407i;
        public final f.a j;
        public final String k;

        public a(Context context, f.a aVar, String str, boolean z2) {
            this.f46402a = context;
            View viewA = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.f46403b = viewA;
            this.f46404c = z2;
            LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_title_layout);
            this.d = linearLayout;
            this.f46405e = (TextView) viewA.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) viewA.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.g = linearLayout2;
            this.f46406h = (TextView) viewA.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.f46407i = (ImageView) viewA.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.j = aVar;
            this.k = str;
            a();
        }

        public void a() {
            if (this.j.r == 0) {
                this.f46405e.setVisibility(8);
            } else {
                this.f46405e.setVisibility(0);
                this.f46405e.setText(this.j.r);
                if (this.f46404c) {
                    this.f46405e.setTextColor(-1);
                }
            }
            if (this.j.s == 0) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setImageResource(this.j.s);
            }
            if (this.j.t == 0) {
                this.f46406h.setVisibility(8);
            } else {
                this.f46406h.setVisibility(0);
                this.f46406h.setText(this.j.t);
                if (this.f46404c) {
                    this.f46406h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.j.f46250u == 0) {
                this.f46407i.setVisibility(8);
            } else {
                this.f46407i.setVisibility(0);
                this.f46407i.setImageResource(this.j.f46250u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z2) {
            super(context, aVar, str, z2);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f46405e.setVisibility(0);
            this.f46405e.setText(sg.bigo.ads.common.utils.a.a(this.f46402a, this.j.r, sg.bigo.ads.ad.b.f.a(this.k)));
            if (this.f46404c) {
                this.f46405e.setTextColor(-1);
            }
            this.f.setVisibility(8);
            this.f46406h.setVisibility(0);
            this.f46406h.setText(this.j.t);
            if (this.f46404c) {
                this.f46406h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f46407i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z2) {
            super(context, aVar, str, z2);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f46405e.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.f46406h.setVisibility(0);
            this.f46406h.setText(this.j.t);
            if (this.f46404c) {
                this.f46406h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f46407i.setVisibility(0);
            this.f46407i.setImageResource(this.j.f46250u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z2) {
            super(context, aVar, str, z2);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.f46405e.setVisibility(0);
            this.f46405e.setText(sg.bigo.ads.common.utils.a.a(this.f46402a, this.j.r, sg.bigo.ads.ad.b.f.c(this.k)));
            if (this.f46404c) {
                this.f46405e.setTextColor(-1);
            }
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.f46406h.setVisibility(0);
            this.f46406h.setText(sg.bigo.ads.ad.b.f.b(this.k) + " " + sg.bigo.ads.common.utils.a.a(this.f46402a, this.j.t, new Object[0]));
            if (this.f46404c) {
                this.f46406h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.f46407i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    private List<a> a(Context context, int i2, String str) {
        d dVar;
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 8) {
            List<f.a> listA = f.a.a(i2);
            Random random = new Random();
            while (!listA.isEmpty()) {
                arrayList.add(new a(context, listA.remove(random.nextInt(listA.size())), str, this.f46400a));
            }
            return arrayList;
        }
        boolean z2 = this.f46400a;
        if (z2) {
            dVar = new d(context, f.a.STAR_WHITE, str, z2);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM_WHITE, str, this.f46400a));
            cVar = new c(context, f.a.Everyone_WHITE, str, this.f46400a);
        } else {
            dVar = new d(context, f.a.STAR, str, z2);
            arrayList.add(dVar);
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM, str, this.f46400a));
            cVar = new c(context, f.a.Everyone, str, this.f46400a);
        }
        arrayList.add(cVar);
        return arrayList;
    }

    public List<a> getItems() {
        return this.f46401b;
    }

    public void setThemeWhite(boolean z2) {
        this.f46400a = z2;
    }

    public IconListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0041  */
    /* JADX WARN: Code duplicated, block: B:43:0x0067  */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final void a(f fVar) {
        List<a> listA;
        int i2;
        int i3;
        removeAllViews();
        if (fVar == null) {
            return;
        }
        Context context = getContext();
        int i4 = fVar.f46238a;
        if (i4 != 1) {
            int i5 = 4;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (fVar.d) {
                        i5 = this.f46400a ? 8 : 2;
                    } else if (!this.f46400a) {
                        i5 = 1;
                    }
                    listA = a(context, i5, fVar.f46240c);
                } else if (i4 != 4 || !fVar.d) {
                    return;
                } else {
                    listA = a(context, this.f46400a ? 8 : 2, fVar.f46240c);
                }
            } else if (!fVar.d) {
                if (!this.f46400a) {
                    i5 = 1;
                }
                listA = a(context, i5, fVar.f46240c);
            }
            this.f46401b = listA;
            if (k.a((Collection) this.f46401b)) {
                return;
            }
            for (i2 = 0; i2 < this.f46401b.size(); i2++) {
                if (i2 > 0) {
                    Context context2 = getContext();
                    if (this.f46400a) {
                        i3 = R.layout.bigo_ad_layout_space;
                    } else {
                        i3 = R.layout.bigo_ad_layout_space_black;
                    }
                    sg.bigo.ads.common.utils.a.a(context2, i3, this, true);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                addView(this.f46401b.get(i2).f46403b, layoutParams);
            }
        }
        if (!fVar.d) {
            return;
        }
        listA = a(context, 0, fVar.f46240c);
        this.f46401b = listA;
        if (k.a((Collection) this.f46401b)) {
            return;
        }
        while (i2 < this.f46401b.size()) {
            if (i2 > 0) {
                Context context3 = getContext();
                if (this.f46400a) {
                    i3 = R.layout.bigo_ad_layout_space;
                } else {
                    i3 = R.layout.bigo_ad_layout_space_black;
                }
                sg.bigo.ads.common.utils.a.a(context3, i3, this, true);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            addView(this.f46401b.get(i2).f46403b, layoutParams2);
        }
    }

    public IconListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f46400a = false;
        setOrientation(0);
        setGravity(17);
    }
}
