package sg.bigo.ads.ad.splash.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f46863l;

    public e(sg.bigo.ads.api.core.g gVar, m mVar, m mVar2, sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, mVar, mVar2, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0327  */
    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, ViewGroup viewGroup, int i2) {
        boolean z3;
        T t;
        super.a(z2, viewGroup, i2);
        if (!z2) {
            View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (viewFindViewWithTag instanceof ImageView) {
                viewGroup.removeView(viewFindViewWithTag);
                return;
            }
            return;
        }
        if (this.f46863l == null) {
            x xVar = new x();
            m mVar = this.f46825c;
            if (mVar != null) {
                xVar.f = mVar.c("video_play_page.media_view_clickable_switch");
                xVar.f46716h = this.f46825c.c("video_play_page.ad_component_clickable_switch");
                xVar.g = this.f46825c.c("video_play_page.other_space_clickable_switch");
                xVar.f46717i = this.f46825c.a("video_play_page.click_type");
                xVar.k = this.f46825c.c("layer.other_space_clickable_switch");
                xVar.f46718l = this.f46825c.a("layer.click_type");
                xVar.f46712a = false;
                xVar.f46713b = 0;
                xVar.f46714c = this.f46825c.a("video_play_page.force_staying_time");
                xVar.d = this.f46825c.c("layer.is_show_layer");
                xVar.f46715e = this.f46825c.a("layer.force_staying_time");
                xVar.j = this.f46825c.a("video_play_page.auto_click");
                xVar.m = this.f46825c.a("video_play_page.time_for_auto_click", -1);
                xVar.f46719n = this.f46825c.a("video_play_page.time_for_show_backup", -1);
            } else {
                xVar.j = 1;
                xVar.f46712a = this.f46824b.c("interstitial_video_style.video_play_page.is_global_click");
                xVar.f46713b = this.f46824b.a("interstitial_video_style.video_play_page.impression_close_seconds");
                xVar.f46714c = this.f46824b.a("interstitial_video_style.video_play_page.close_click_seconds");
                xVar.d = this.f46824b.c("interstitial_video_style.video_play_page.is_jump_layer");
                xVar.f46715e = this.f46824b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            }
            sg.bigo.ads.ad.b.c cVar = this.f46827h.x;
            m mVar2 = this.f46825c;
            if (mVar2 == null) {
                mVar2 = this.f46824b;
            }
            this.f46863l = new i(cVar, viewGroup, xVar, sg.bigo.ads.ad.interstitial.multi_img.b.c(cVar, mVar2));
        }
        final i iVar = this.f46863l;
        Context context = iVar.m.getContext();
        List<String> listA = iVar.f46886h.a();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = iVar.f46886h;
        boolean z4 = bVar.f46372e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar.f46370b;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar2 = bVar.d;
        p pVarA = s.a(iVar.f46888l);
        iVar.f46884c = (ViewFlow) iVar.m.findViewById(R.id.inter_media_ad_view_flow);
        iVar.d = (Indicator) iVar.m.findViewById(R.id.vf_indicator);
        m mVar3 = iVar.f46886h.f46369a;
        int iA = mVar3 == null ? 1 : sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar3.a("video_play_page.background_colour"));
        if (iA == 4 || iA == 5) {
            iVar.f = new sg.bigo.ads.ad.interstitial.multi_img.a(iVar.m, iVar.f46884c, iVar.f46889n, iA);
        }
        int i3 = iA;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar3 = cVar2;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVar3, false, iVar.d(), i3);
        iVar.g = bVar2;
        iVar.f46885e = bVar2.j;
        ((MediaView) bVar2.f46427l).setImageBlurBorder(false);
        iVar.g.a(pVarA.f47362b, pVarA.f47363c);
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = iVar.g;
        bVar3.s = true;
        if (bVar3.c()) {
            if (((sg.bigo.ads.core.a.a) iVar.f46888l.f()).aR()) {
                Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> set = i.j;
                synchronized (set) {
                    set.add(iVar.g);
                }
            }
            if (iVar.f != null) {
                iVar.g.r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.splash.a.i.4
                    public AnonymousClass4() {
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        i.this.f.a(i.this.f46884c.a(i.this.g.j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        i.this.g.r = null;
                        a();
                    }
                };
            }
        }
        iVar.f46884c.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVar.f));
        iVar.f46884c.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVar.f46392i));
        iVar.f46884c.setViewStyle(dVar.j);
        iVar.f46884c.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, iVar.d, iVar.f));
        int i4 = 0;
        for (int i5 = 0; i5 < listA.size(); i5++) {
            String str = listA.get(i5);
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                int i6 = i4 + 1;
                sg.bigo.ads.ad.interstitial.multi_img.c cVar4 = cVar3;
                iVar.a(context, cVar4, i3, str, ((sg.bigo.ads.core.a.a) iVar.f46888l.f()).al());
                cVar3 = cVar4;
                i4 = i6;
            }
        }
        if (z4) {
            int i7 = i4 + 1;
            sg.bigo.ads.ad.interstitial.multi_img.c cVar5 = cVar3;
            final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = iVar.a(context, cVar5, i3, null, false);
            cVar3 = cVar5;
            sg.bigo.ads.ad.splash.a.a(iVar.f46888l, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.i.5

                /* JADX INFO: renamed from: a */
                final /* synthetic */ sg.bigo.ads.ad.interstitial.multi_img.view.a f46897a;

                public AnonymousClass5() {
                    aVar = aVarA;
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        aVar.a(bitmap2);
                    }
                }
            });
            i4 = i7;
        }
        sg.bigo.ads.ad.interstitial.multi_img.d dVar2 = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
        int i8 = dVar == dVar2 ? i4 >> 1 : 0;
        ViewFlow.b bVar4 = new ViewFlow.b();
        bVar4.f47653a = pVarA.f47362b;
        bVar4.f47654b = pVarA.f47363c;
        bVar4.f47655c = true;
        bVar4.d = cVar3.d;
        iVar.f46884c.addView(iVar.f46885e, Math.max(0, i8), bVar4);
        int i9 = i.AnonymousClass2.f46894a[dVar.ordinal()];
        int i10 = 3;
        if (i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
            ViewFlow.d dVar3 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.splash.a.i.9
                public AnonymousClass9() {
                }

                @Override // sg.bigo.ads.common.view.ViewFlow.d
                public final void a() {
                    i.this.f46888l.a(8, 29);
                }
            };
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar6 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
            iVar.o = cVar6;
            iVar.f46884c.setStartView(cVar6.f46418a);
            iVar.f46884c.setOnStartViewShowListener(dVar3);
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar7 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
            iVar.f46890p = cVar7;
            iVar.f46884c.setEndView(cVar7.f46418a);
            iVar.f46884c.setOnEndViewShowListener(dVar3);
        }
        int iA2 = dVar == dVar2 ? iVar.f46884c.a(iVar.f46885e) : 0;
        iVar.f46884c.b(iA2);
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = iVar.f;
        if (aVar != null) {
            aVar.b(iA2);
        }
        MediaView mediaView = (MediaView) iVar.g.f46427l;
        sg.bigo.ads.ad.b.c cVar8 = iVar.f46888l;
        cVar8.f45465I = iVar.f46887i.f46717i;
        cVar8.a(iVar.m, mediaView, (ImageView) null, (AdOptionsView) null, (List<View>) null, 8, null);
        int i11 = iVar.f46887i.f46717i;
        View viewFindViewById = iVar.m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.b.a.a(iVar.f46884c, 9);
        if (iVar.f46887i.g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar5 = iVar.g;
            if (bVar5 != null) {
                ((MediaView) bVar5.f46427l).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.ad.b.a.a(iVar.m, viewFindViewById, 8, iVar.f46888l, i11);
            sg.bigo.ads.ad.b.a.a(iVar.m, iVar.f46884c, 8, iVar.f46888l, i11);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar6 = iVar.g;
            if (bVar6 != null) {
                ((MediaView) bVar6.f46427l).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup2 = iVar.m;
            sg.bigo.ads.core.adview.h hVar = r.f46631F;
            sg.bigo.ads.ad.b.a.a(viewGroup2, viewFindViewById, 8, hVar, 0);
            sg.bigo.ads.ad.b.a.a(iVar.m, iVar.f46884c, 8, hVar, 0);
        }
        if (iVar.e()) {
            i10 = i11;
            z3 = false;
        } else {
            int iA3 = iVar.f46886h.f46369a.a("video_play_page.multi_click_type");
            if (iA3 == 2) {
                z3 = false;
            } else {
                if (iA3 != 3) {
                    i10 = i11;
                } else if (i11 == 1 || i11 == 2) {
                    z3 = true;
                }
                z3 = false;
            }
        }
        boolean z5 = iVar.f46887i.f;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar7 = iVar.g;
        if (bVar7 != null && (t = bVar7.f46427l) != 0) {
            ViewGroup viewGroup3 = iVar.m;
            sg.bigo.ads.ad.b.c cVar9 = iVar.f46888l;
            if (z3) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t, 8, cVar9, iVar.k);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t, 8, cVar9, i10);
            }
            MediaView mediaView2 = (MediaView) iVar.g.f46427l;
            if (z5) {
                mediaView2.setMediaAreaClickable(true);
                ((MediaView) iVar.g.f46427l).b().a(false);
            } else {
                mediaView2.setMediaAreaClickable(false);
                ((MediaView) iVar.g.f46427l).b().a(true);
            }
        }
        Iterator<View> it = iVar.f46884c.getItems().iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar4 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar4.j, 5);
                ViewGroup viewGroup4 = iVar.m;
                RoundedFrameLayout roundedFrameLayout = dVar4.j;
                if (z5) {
                    sg.bigo.ads.ad.b.c cVar10 = iVar.f46888l;
                    if (z3) {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, cVar10, iVar.k);
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, cVar10, i10);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, r.f46631F, 0);
                }
            }
        }
        iVar.f();
        a(this.f46863l.q);
        m mVar4 = this.f46825c;
        if (mVar4 != null) {
            int iA4 = mVar4.a("video_play_page.background_colour");
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                this.f46863l.f46889n.b(textView);
            }
            if (1 == iA4) {
                this.f46863l.f46889n.a(-1);
                i iVar2 = this.f46863l;
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar11 = iVar2.o;
                if (cVar11 != null) {
                    cVar11.a(false);
                }
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar12 = iVar2.f46890p;
                if (cVar12 != null) {
                    cVar12.a(false);
                }
                i iVar3 = this.f46863l;
                int iB = q.b("#80202124", -7829368);
                Indicator indicator = iVar3.d;
                if (indicator != null) {
                    indicator.setColorSelected(-16777216);
                    iVar3.d.setColor(iB);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void c() {
        super.c();
        i iVar = this.f46863l;
        if (iVar != null) {
            iVar.q = null;
            this.f46863l = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
