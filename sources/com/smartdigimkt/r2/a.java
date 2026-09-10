package com.smartdigimkt.r2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.video.dynview.widget.ATRotationView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkImageView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.smartdigimkt.expressad.videocommon.view.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String m = "DataEnergizeWrapper";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f37984n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.p2.b f37985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f37986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f37987c;
    private String d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37988e = "#60000000";
    private String f = "#FF5F5F5F";
    private String g = "#90ECECEC";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f37989h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.p2.a f37990i = null;
    private boolean j = false;
    private int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.smartdigimkt.h2.a f37991l = new b();

    /* JADX INFO: renamed from: com.smartdigimkt.r2.a$a, reason: collision with other inner class name */
    public class C0572a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f37992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.c2.c f37994c;
        final /* synthetic */ View d;

        public C0572a(ImageView imageView, String str, com.smartdigimkt.c2.c cVar, View view) {
            this.f37992a = imageView;
            this.f37993b = str;
            this.f37994c = cVar;
            this.d = view;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f37992a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f37986b != null) {
                a.this.f37986b.put(s.a(this.f37993b), bitmap);
                a.this.a(this.f37994c, this.d);
            }
        }
    }

    public class b implements com.smartdigimkt.h2.a {
        public b() {
        }

        @Override // com.smartdigimkt.h2.a
        public void a() {
            if (!a.this.j || a.this.f37985a == null) {
                return;
            }
            a.this.f37985a.a(a.this.k * 1000, a.this.f37990i);
            a.this.j = false;
        }

        @Override // com.smartdigimkt.h2.a
        public void b() {
            if (a.this.f37985a != null) {
                a.this.f37985a.a();
                a.this.j = true;
            }
        }

        @Override // com.smartdigimkt.h2.a
        public void c() {
            if (a.this.f37985a != null) {
                a.this.f37985a.a();
                a.this.j = true;
            }
        }
    }

    public class c extends com.smartdigimkt.g3.a {
        final /* synthetic */ Map Z;
        final /* synthetic */ List e0;

        public c(Map map, List list) {
            this.Z = map;
            this.e0 = list;
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            if (a.this.f37987c) {
                return;
            }
            a.this.f37987c = true;
            a.this.a(this.Z, (List<com.smartdigimkt.x.d>) this.e0, 0);
        }
    }

    public class d extends com.smartdigimkt.g3.a {
        final /* synthetic */ Map Z;
        final /* synthetic */ List e0;

        public d(Map map, List list) {
            this.Z = map;
            this.e0 = list;
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            if (a.this.f37987c) {
                return;
            }
            a.this.f37987c = true;
            a.this.a(this.Z, (List<com.smartdigimkt.x.d>) this.e0, 1);
        }
    }

    public class e extends com.smartdigimkt.g3.a {
        final /* synthetic */ Map Z;

        public e(Map map) {
            this.Z = map;
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            if (a.this.f37987c) {
                return;
            }
            a.this.f37987c = true;
            a.this.b(this.Z);
        }
    }

    public class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f38000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f38001b;

        public g(Map map, List list) {
            this.f38000a = map;
            this.f38001b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
            a.this.a(this.f38000a, (List<com.smartdigimkt.x.d>) this.f38001b, i2);
        }
    }

    public class h implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f38003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f38004b;

        public h(Map map, List list) {
            this.f38003a = map;
            this.f38004b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
            a.this.a(this.f38003a, (List<com.smartdigimkt.x.d>) this.f38004b, i2);
        }
    }

    public class i implements View.OnClickListener {
        final /* synthetic */ Map X;

        public i(Map map) {
            this.X = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.X);
        }
    }

    public void c(com.smartdigimkt.c2.c cVar, View view, Map map, com.smartdigimkt.i2.e eVar) {
        try {
            if (this.f37986b == null) {
                this.f37986b = new HashMap();
            }
            List<com.smartdigimkt.x.d> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f37984n = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f37984n = false;
            ListView listView = (ListView) view.findViewById(a("sdm_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a("sdm_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a("sdm_order_view_iv_close"));
            com.smartdigimkt.j2.a aVar = new com.smartdigimkt.j2.a(listB);
            if (cVar.i() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new g(map, listB));
                }
            } else if (gridView != null) {
                int iN = (int) cVar.n();
                int size = iN / listB.size();
                int i2 = size / 9;
                int i3 = i2 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iN - (i2 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i2) - (i3 / 2));
                gridView.setHorizontalSpacing(i3);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new h(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new i(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    public class f implements com.smartdigimkt.p2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f37997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f37998b;

        public f(TextView textView, Map map) {
            this.f37997a = textView;
            this.f37998b = map;
        }

        @Override // com.smartdigimkt.p2.a
        public void a(long j) {
            a.this.k = (int) (j / 1000);
            this.f37997a.setText(com.smartdigimkt.m2.c.a(a.this.k, this.f37997a.getContext()));
            a.this.f37989h++;
        }

        @Override // com.smartdigimkt.p2.a
        public void a() {
            a.this.b(this.f37998b);
        }
    }

    public void b(com.smartdigimkt.c2.c cVar, View view, Map map, com.smartdigimkt.i2.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f37984n = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        f37984n = false;
        ImageView imageView = (ImageView) view.findViewById(a("sdm_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a("sdm_reward_title_tv"));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(a("sdm_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a("sdm_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a("sdm_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a("sdm_reward_desc_tv"));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a("sdm_reward_bottom_layout"));
        ArrayList arrayList = new ArrayList();
        List<com.smartdigimkt.x.d> listB = cVar.b();
        if (listB != null && listB.size() > 0) {
            com.smartdigimkt.x.d dVar = listB.get(0);
            if (dVar != null) {
                if (imageView != null) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                    a(dVar.i(), imageView);
                }
                if (textView != null) {
                    textView.setText(dVar.f());
                }
                if (textView3 != null) {
                    textView3.setText(dVar.e());
                }
                if (linearLayout != null) {
                    double dO = dVar.o();
                    if (dO <= 0.0d) {
                        dO = 5.0d;
                    }
                    ((AnyThinkLevelLayoutView) linearLayout).setRatingAndUser(dO, dVar.m());
                }
                if (textView2 != null) {
                    textView2.setText(dVar.b());
                }
                int iM = cVar.m();
                if (iM == 102 || iM == 202 || iM == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iM == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, dVar.k(), iM);
                } else if (iM != 902) {
                    if (iM != 904) {
                        if (iM == 5002010) {
                            if (cVar.r() && relativeLayout != null && relativeLayout.getVisibility() == 0) {
                                arrayList.add(relativeLayout);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.r()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.o()) || !cVar.o().equals("dsp") || !TextUtils.isEmpty(dVar.p0())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.smartdigimkt.f2.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.smartdigimkt.f2.b.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x022d  */
    public void a(com.smartdigimkt.c2.c cVar, View view, Map map, com.smartdigimkt.i2.e eVar) {
        com.smartdigimkt.x.d dVar;
        com.smartdigimkt.x.d dVar2;
        int i2;
        String str;
        int i3;
        if (this.f37986b == null) {
            this.f37986b = new HashMap();
        }
        List<com.smartdigimkt.x.d> listB = cVar.b();
        if (view == null) {
            eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_ROOTVIEW);
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_CONTEXT);
            return;
        }
        if (listB == null || listB.size() <= 1) {
            dVar = null;
            dVar2 = null;
        } else {
            dVar = listB.get(0);
            dVar.i0(1);
            dVar2 = listB.get(1);
            dVar2.i0(2);
        }
        if (dVar == null && eVar != null) {
            eVar.a(com.smartdigimkt.f2.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (dVar2 == null && eVar != null) {
            eVar.a(com.smartdigimkt.f2.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        f37984n = false;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a("sdm_top_item_rl"));
        AnyThinkImageView anyThinkImageView = (AnyThinkImageView) view.findViewById(a("sdm_top_iv"));
        ATRotationView aTRotationView = (ATRotationView) view.findViewById(a("sdm_top_ration"));
        TextView textView = (TextView) view.findViewById(a("sdm_top_title_tv"));
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(a("sdm_bottom_item_rl"));
        ATRotationView aTRotationView2 = (ATRotationView) view.findViewById(a("sdm_bottom_ration"));
        AnyThinkImageView anyThinkImageView2 = (AnyThinkImageView) view.findViewById(a("sdm_bottom_iv"));
        RoundImageView roundImageView = (RoundImageView) view.findViewById(a("sdm_bottom_icon_iv"));
        com.smartdigimkt.x.d dVar3 = dVar;
        TextView textView2 = (TextView) view.findViewById(a("sdm_bottom_title_tv"));
        com.smartdigimkt.x.d dVar4 = dVar2;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new c(map, listB));
        }
        if (anyThinkImageView == null) {
            i2 = 0;
            str = "sdm_top_icon_iv";
        } else {
            anyThinkImageView.setCustomBorder(20, 20, 0, 0, 10, -16777216);
            a(dVar3.k(), anyThinkImageView, cVar, view);
            if (aTRotationView == null) {
                i2 = 0;
            } else if (dVar3.j0()) {
                if (!TextUtils.isEmpty(dVar3.i())) {
                    ImageView imageView = new ImageView(cVar.c());
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, v.a(cVar.c(), 200.0f)));
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    aTRotationView.addView(imageView);
                    a(dVar3.i(), imageView);
                    aTRotationView.setWidthRatio(0.45f);
                    aTRotationView.setHeightRatio(0.9f);
                    aTRotationView.setAutoscroll(true);
                    str = "sdm_top_icon_iv";
                    i2 = 0;
                } else {
                    aTRotationView.setWidthRatio(1.0f);
                    aTRotationView.setHeightRatio(1.0f);
                    i2 = 0;
                    aTRotationView.setAutoscroll(false);
                }
            } else {
                i2 = 0;
                aTRotationView.setWidthRatio(1.0f);
                aTRotationView.setHeightRatio(1.0f);
                aTRotationView.setAutoscroll(false);
            }
            str = "sdm_top_icon_iv";
        }
        RoundImageView roundImageView2 = (RoundImageView) view.findViewById(a(str));
        if (roundImageView2 != null) {
            roundImageView2.setType(i2);
            a(dVar3.i(), roundImageView2);
        }
        if (textView != null) {
            if (!TextUtils.isEmpty(dVar3.f())) {
                textView.setText(dVar3.f());
            } else {
                textView.setVisibility(8);
            }
        }
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new d(map, listB));
        }
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(20, 20, 0, 0, 10, -16777216);
            a(dVar4.k(), anyThinkImageView2, cVar, view);
            if (aTRotationView2 == null) {
                i3 = 0;
            } else if (dVar4.j0()) {
                if (!TextUtils.isEmpty(dVar4.i())) {
                    ImageView imageView2 = new ImageView(cVar.c());
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, v.a(cVar.c(), 200.0f)));
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    aTRotationView2.addView(imageView2);
                    a(dVar4.i(), imageView2);
                    aTRotationView2.setWidthRatio(0.45f);
                    aTRotationView2.setHeightRatio(0.9f);
                    aTRotationView2.setAutoscroll(true);
                    i3 = 0;
                } else {
                    aTRotationView2.setWidthRatio(1.0f);
                    aTRotationView2.setHeightRatio(1.0f);
                    i3 = 0;
                    aTRotationView2.setAutoscroll(false);
                }
            } else {
                i3 = 0;
                aTRotationView2.setWidthRatio(1.0f);
                aTRotationView2.setHeightRatio(1.0f);
                aTRotationView2.setAutoscroll(false);
            }
        } else {
            i3 = 0;
        }
        if (roundImageView != null) {
            roundImageView.setType(i3);
            a(dVar4.i(), roundImageView);
        }
        if (textView2 != null) {
            textView2.setText(dVar4.f());
        }
        a(dVar3.g0(), context, view, cVar.i(), map, dVar3);
        if (eVar != null) {
            eVar.a(view, null);
        }
    }

    public class j implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f38008b;

        /* JADX INFO: renamed from: com.smartdigimkt.r2.a$j$a, reason: collision with other inner class name */
        public class RunnableC0573a implements Runnable {
            final /* synthetic */ Bitmap X;

            /* JADX INFO: renamed from: com.smartdigimkt.r2.a$j$a$a, reason: collision with other inner class name */
            public class RunnableC0574a implements Runnable {
                final /* synthetic */ Bitmap X;

                public RunnableC0574a(Bitmap bitmap) {
                    this.X = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    j.this.f38008b.setImageBitmap(this.X);
                }
            }

            public RunnableC0573a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    j.this.f38008b.post(new RunnableC0574a(com.smartdigimkt.v0.h.a(this.X, 10)));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        public j(int i2, ImageView imageView) {
            this.f38007a = i2;
            this.f38008b = imageView;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = k.a(this.f38008b.getContext(), "sdm_icon_play_bg", k.d);
                this.f38008b.setBackgroundColor(Color.parseColor(a.this.f));
                this.f38008b.setImageResource(iA);
                this.f38008b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i2 = this.f38007a;
            if (i2 != 501 && i2 != 802) {
                this.f38008b.setImageBitmap(bitmap);
            } else {
                com.smartdigimkt.t0.a.b().execute(new RunnableC0573a(bitmap));
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            try {
                int iA = k.a(this.f38008b.getContext(), "sdm_icon_play_bg", k.d);
                this.f38008b.setBackgroundColor(Color.parseColor(a.this.f));
                this.f38008b.setImageResource(iA);
                this.f38008b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.smartdigimkt.d2.a.f34394F) && (map.get(com.smartdigimkt.d2.a.f34394F) instanceof com.smartdigimkt.i2.d)) {
                    ((com.smartdigimkt.i2.d) map.get(com.smartdigimkt.d2.a.f34394F)).a();
                    b();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private void b(com.smartdigimkt.c2.c cVar, View view) {
        com.smartdigimkt.k2.a.b bVarA = com.smartdigimkt.k2.a.a();
        bVarA.a(cVar.i()).a(true);
        if (cVar.i() != 2 || cVar.n() > cVar.l()) {
            bVarA.b(cVar.n()).a(cVar.l());
        } else {
            bVarA.b(cVar.l()).a(cVar.n());
        }
        if (view.getBackground() == null) {
            view.setBackgroundDrawable(bVarA.a());
        }
    }

    private void b() {
        com.smartdigimkt.n2.a.a().b();
        com.smartdigimkt.p2.b bVar = this.f37985a;
        if (bVar != null) {
            bVar.a();
            this.f37985a = null;
        }
        com.smartdigimkt.e2.a.a().f34606a = null;
        if (this.f37991l != null) {
            this.f37991l = null;
        }
        Map<String, Bitmap> map = this.f37986b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f37986b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.f37986b.clear();
        }
    }

    public void a(com.smartdigimkt.c2.c cVar, View view, com.smartdigimkt.i2.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(a("sdm_iv_adbanner_bg"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(a("sdm_iv_adbanner"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e2) {
            e2.getMessage();
            eVar.a(com.smartdigimkt.f2.b.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, Context context, View view, int i2, Map map, com.smartdigimkt.x.d dVar) {
        FrameLayout.LayoutParams layoutParams;
        String strA = z.a(str, com.smartdigimkt.q0.b.T);
        z.a(str, com.smartdigimkt.q0.b.f37771U);
        long j2 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j2 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f37984n = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f37984n = false;
            TextView textView = (TextView) view.findViewById(a("sdm_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.d));
                String str2 = this.f37988e;
                com.smartdigimkt.o2.a.a(textView, 1, 12, str2, str2);
                if (i2 == 2 && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                    int iJ = v.j(context);
                    int iA = v.a(context, 10.0f);
                    layoutParams.setMargins(iA, iA, iJ, iA);
                }
                textView.setVisibility(0);
                textView.setOnClickListener(new e(map));
                this.f37990i = new f(textView, map);
                com.smartdigimkt.p2.b bVarA = new com.smartdigimkt.p2.b().b(j2 * 1000).a(1000L).a(this.f37990i);
                this.f37985a = bVarA;
                bVarA.c();
            }
            ImageView imageView = (ImageView) view.findViewById(a("sdm_iv_link"));
            if (dVar == null) {
                return;
            }
            if (dVar.W() != null) {
                dVar.W().h("");
            }
            if (imageView != null) {
                v.a(imageView, dVar, view.getContext(), true);
            }
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i2) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.smartdigimkt.f0.b.a(imageView.getContext()).a(str, new j(i2, imageView));
    }

    private void a(String str, ImageView imageView, com.smartdigimkt.c2.c cVar, View view) {
        com.smartdigimkt.f0.b.a(imageView.getContext()).a(str, new C0572a(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void a(ListView listView, com.smartdigimkt.c2.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fL = (cVar.l() - v.a(com.smartdigimkt.m6.b.p().k(), 720.0f)) / 2.0f;
            int iA = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
            int i2 = (int) fL;
            layoutParams.setMargins(iA, i2, iA, i2);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<com.smartdigimkt.x.d> list, int i2) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(com.smartdigimkt.d2.a.f34394F) && (map.get(com.smartdigimkt.d2.a.f34394F) instanceof com.smartdigimkt.i2.d)) {
            com.smartdigimkt.i2.d dVar = (com.smartdigimkt.i2.d) map.get(com.smartdigimkt.d2.a.f34394F);
            if (dVar != null) {
                dVar.a(list.get(i2));
            }
            b();
            return;
        }
        if (map.containsKey(com.smartdigimkt.d2.a.G) && (map.get(com.smartdigimkt.d2.a.G) instanceof com.smartdigimkt.i2.c)) {
            com.smartdigimkt.i2.c cVar = (com.smartdigimkt.i2.c) map.get(com.smartdigimkt.d2.a.G);
            if (cVar != null) {
                cVar.a(list.get(i2), i2);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.smartdigimkt.d2.a.G) && (map.get(com.smartdigimkt.d2.a.G) instanceof com.smartdigimkt.i2.c)) {
                    ((com.smartdigimkt.i2.c) map.get(com.smartdigimkt.d2.a.G)).close();
                    b();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.c2.c cVar, View view) {
        Map<String, Bitmap> map = this.f37986b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.smartdigimkt.l2.b().a(this.f37986b, cVar, view);
    }

    private int a(String str) {
        return k.a(com.smartdigimkt.m6.b.p().k(), str, "id");
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.g));
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }
}
