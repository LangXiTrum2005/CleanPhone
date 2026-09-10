package sg.bigo.ads.common.form;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.api.a.f;
import sg.bigo.ads.common.form.render.a.d;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.common.form.render.b f47172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f47173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewFlow f47174c;
    public final Indicator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f47175e;

    private c(RelativeLayout relativeLayout, sg.bigo.ads.common.form.render.b bVar) {
        this.f47173b = relativeLayout;
        this.f47172a = bVar;
        this.f47174c = (ViewFlow) relativeLayout.findViewById(R.id.inter_image_view_flow);
        this.d = (Indicator) relativeLayout.findViewById(R.id.inter_image_indicator);
        this.f47175e = (LinearLayout) relativeLayout.findViewById(R.id.inter_form_content);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static c a(Context context, e eVar, Map<String, Object> map, boolean z2, int i2, int i3, sg.bigo.ads.common.form.render.b.a aVar) {
        ViewGroup.LayoutParams layoutParams;
        int iA;
        RelativeLayout relativeLayout;
        sg.bigo.ads.common.form.render.b bVar = new sg.bigo.ads.common.form.render.b(context, eVar, map, i2, i3, aVar);
        sg.bigo.ads.common.form.render.a.a bVar2 = null;
        View view = null;
        RelativeLayout relativeLayout2 = (RelativeLayout) sg.bigo.ads.common.utils.a.a(bVar.f47196a, sg.bigo.ads.common.form.render.a.a(3), null, false);
        bVar.f47199e = relativeLayout2;
        if (relativeLayout2 == null) {
            relativeLayout = null;
        } else {
            if (z2) {
                sg.bigo.ads.common.form.render.c.a(relativeLayout2, bVar.f47196a, bVar.f47197b, bVar, 5);
            } else {
                sg.bigo.ads.common.form.render.b.a((TextView) relativeLayout2.findViewById(R.id.inter_form_content_title), bVar.f47197b.a());
                sg.bigo.ads.common.form.render.b.a((TextView) bVar.f47199e.findViewById(R.id.inter_form_content_description), bVar.f47197b.b());
                RelativeLayout relativeLayout3 = bVar.f47199e;
                e eVar2 = bVar.f47197b;
                int i4 = 1;
                if (eVar2.k() == null || !q.b((CharSequence) eVar2.k().c())) {
                    ViewGroup viewGroup = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_icon_layout);
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_content_layout);
                    if (viewGroup2 != null) {
                        viewGroup2.setPadding(0, 0, 0, 0);
                    }
                } else {
                    ImageView imageView = (ImageView) relativeLayout3.findViewById(R.id.inter_form_content_icon);
                    if (imageView != null) {
                        new sg.bigo.ads.common.p.b(imageView, (byte) 0).a(null, eVar2.k().c(), true);
                    }
                }
                RelativeLayout relativeLayout4 = bVar.f47199e;
                Context context2 = bVar.f47196a;
                e eVar3 = bVar.f47197b;
                View viewFindViewById = relativeLayout4.findViewById(R.id.inter_blank_viewholder);
                if (viewFindViewById != null && eVar3.j() != null) {
                    int iA2 = sg.bigo.ads.common.form.render.c.a(context2, eVar3);
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                    layoutParams2.height = iA2 - sg.bigo.ads.common.utils.e.a(context2, 8);
                    viewFindViewById.setLayoutParams(layoutParams2);
                }
                FrameLayout frameLayout = (FrameLayout) relativeLayout4.findViewById(R.id.inter_form_icon_layout);
                if (frameLayout != null) {
                    if (eVar3.j() == null) {
                        iA = 0;
                    } else {
                        iA = sg.bigo.ads.common.form.render.c.a(context2, eVar3) - sg.bigo.ads.common.utils.e.a(context2, 33);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams3.topMargin = iA;
                        frameLayout.setLayoutParams(layoutParams3);
                    }
                    HeightScrollView heightScrollView = (HeightScrollView) relativeLayout4.findViewById(R.id.inter_form_scroll);
                    if (heightScrollView != null) {
                        heightScrollView.setBlankView(viewFindViewById);
                        heightScrollView.setOnScrollListener(new HeightScrollView.a() { // from class: sg.bigo.ads.common.form.render.c.6

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ FrameLayout f47217a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ int f47218b;

                            public AnonymousClass6() {
                                frameLayout = frameLayout;
                                i = iA;
                            }

                            @Override // sg.bigo.ads.common.view.HeightScrollView.a
                            public final void a(int i5) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                                marginLayoutParams.topMargin = i - i5;
                                frameLayout.setLayoutParams(marginLayoutParams);
                            }
                        });
                    }
                }
                Button button = (Button) bVar.f47199e.findViewById(R.id.inter_form_submit);
                bVar.d = button;
                if (button != null) {
                    button.setText(a.a(bVar.f47196a, R.string.bigo_ad_form_submit));
                    bVar.d.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.b.3
                        public AnonymousClass3() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View viewC;
                            GradientDrawable gradientDrawable;
                            b bVar3 = b.this;
                            bVar3.a(3, bVar3.g, System.currentTimeMillis() - b.this.f);
                            sg.bigo.ads.common.form.render.a.c cVar = b.this.f47198c;
                            if (cVar != null) {
                                List<sg.bigo.ads.common.form.render.a.a> list = cVar.g;
                                int size = list == null ? 0 : list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size) {
                                        sg.bigo.ads.common.form.render.a.a aVar2 = cVar.g.get(i5);
                                        if (aVar2 != null && aVar2.a()) {
                                            viewC = aVar2.c();
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        viewC = null;
                                        break;
                                    }
                                }
                            } else {
                                viewC = null;
                                break;
                            }
                            if (viewC != null) {
                                RelativeLayout relativeLayout5 = b.this.f47199e;
                                HeightScrollView heightScrollView2 = (HeightScrollView) relativeLayout5.findViewById(R.id.inter_form_scroll);
                                View viewFindViewById2 = relativeLayout5.findViewById(R.id.inter_blank_viewholder);
                                int height = viewFindViewById2 != null ? viewFindViewById2.getHeight() : 0;
                                if (heightScrollView2 != null) {
                                    heightScrollView2.scrollTo(0, viewC.getTop() + height);
                                    return;
                                }
                                return;
                            }
                            if (b.this.f47198c.b()) {
                                b bVar4 = b.this;
                                c.a(bVar4.f47199e, bVar4.f47196a, bVar4.f47197b, bVar4, 1);
                                return;
                            }
                            b bVar5 = b.this;
                            RelativeLayout relativeLayout6 = bVar5.f47199e;
                            Context context3 = bVar5.f47196a;
                            e eVar4 = bVar5.f47197b;
                            ViewGroup viewGroup3 = (ViewGroup) relativeLayout6.findViewById(R.id.inter_privacy_notice_container);
                            View viewA = sg.bigo.ads.common.utils.a.a(context3, sg.bigo.ads.common.form.render.a.a(4), null, false);
                            if (viewA != null && viewGroup3 != null) {
                                u.a(viewA, viewGroup3, null, -1);
                                TextView textView = (TextView) viewA.findViewById(R.id.bigo_ad_form_btn_cancel);
                                if (textView != null) {
                                    if (context3 == null) {
                                        gradientDrawable = null;
                                    } else {
                                        boolean z3 = sg.bigo.ads.common.form.render.a.f47177a;
                                        int i6 = z3 ? -14931661 : -1;
                                        int i7 = z3 ? -10456960 : -4009768;
                                        gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context3, 1), i7);
                                        gradientDrawable.setColor(i6);
                                        gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context3, 8));
                                    }
                                    textView.setBackground(gradientDrawable);
                                    textView.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_cancel));
                                    textView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.1

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ View f47206a;

                                        /* JADX INFO: renamed from: b */
                                        final /* synthetic */ a f47207b;

                                        public AnonymousClass1() {
                                            view = viewA;
                                            aVar = bVar5;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.b();
                                            }
                                        }
                                    });
                                }
                                TextView textView2 = (TextView) viewA.findViewById(R.id.bigo_ad_form_btn_agree);
                                if (textView2 != null) {
                                    textView2.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_agree));
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.2

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ View f47208a;

                                        /* JADX INFO: renamed from: b */
                                        final /* synthetic */ ViewGroup f47209b;

                                        /* JADX INFO: renamed from: c */
                                        final /* synthetic */ Context f47210c;
                                        final /* synthetic */ e d;

                                        /* JADX INFO: renamed from: e */
                                        final /* synthetic */ a f47211e;

                                        public AnonymousClass2() {
                                            view = viewA;
                                            viewGroup = relativeLayout6;
                                            context = context3;
                                            eVar = eVar4;
                                            aVar = bVar5;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            c.a(viewGroup, context, eVar, aVar, 2);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.c();
                                            }
                                        }
                                    });
                                }
                                PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) viewA.findViewById(R.id.inter_form_check_box);
                                if (privacyCheckBox != null && textView2 != null) {
                                    privacyCheckBox.setOnCheckChangeListener(new PrivacyCheckBox.d() { // from class: sg.bigo.ads.common.form.render.c.3

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ TextView f47212a;

                                        public AnonymousClass3() {
                                            textView = textView2;
                                        }

                                        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.d
                                        public final void a(boolean z4) {
                                            int i8;
                                            if (z4) {
                                                i8 = R.drawable.bigo_ad_btn_background;
                                            } else {
                                                i8 = sg.bigo.ads.common.form.render.a.f47177a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white;
                                            }
                                            textView.setBackgroundResource(i8);
                                            textView.setClickable(z4);
                                        }
                                    });
                                }
                                c.a(viewA, eVar4, null, bVar5);
                            }
                            b bVar6 = b.this;
                            bVar6.a(4, bVar6.g, System.currentTimeMillis() - b.this.f);
                        }
                    });
                }
                ViewGroup viewGroup3 = (ViewGroup) bVar.f47199e.findViewById(R.id.inter_form_content);
                if (viewGroup3 != null) {
                    sg.bigo.ads.common.form.render.a.c cVar = bVar.f47198c;
                    View viewA = sg.bigo.ads.common.utils.a.a(cVar.f47187a, sg.bigo.ads.common.form.render.a.a(5), null, false);
                    cVar.f47190e = viewA;
                    if (viewA == null) {
                        layoutParams = null;
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) viewA.findViewById(R.id.bigo_ad_id_form_question);
                        e.c[] cVarArr = cVar.d;
                        if (cVarArr != null && viewGroup4 != null) {
                            int length = cVarArr.length;
                            int i5 = 0;
                            while (i5 < length) {
                                e.c cVar2 = cVarArr[i5];
                                Map<String, Object> map2 = cVar.f47188b;
                                Context context3 = cVar.f47187a;
                                if (cVar2 != null) {
                                    int i6 = cVar2.f46984b;
                                    bVar2 = i6 != i4 ? (i6 == 2 || i6 == 3) ? new sg.bigo.ads.common.form.render.a.b(cVar2, map2, context3, cVar) : null : new d(cVar2, map2, context3, cVar);
                                }
                                if (bVar2 != null) {
                                    cVar.g.add(bVar2);
                                    View viewB = bVar2.b();
                                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                                    layoutParams4.bottomMargin = sg.bigo.ads.common.utils.e.a(cVar.f47187a, 27);
                                    u.a(viewB, viewGroup4, layoutParams4, -1);
                                }
                                i5++;
                                bVar2 = null;
                                i4 = 1;
                            }
                        }
                        TextView textView = (TextView) cVar.f47190e.findViewById(R.id.inter_form_question_purpose);
                        if (textView != null) {
                            textView.setText(cVar.f47189c.h());
                        }
                        cVar.f = sg.bigo.ads.common.form.render.c.a(cVar.f47190e, cVar.f47189c, cVar.f47188b, cVar.f47191h);
                        view = cVar.f47190e;
                        layoutParams = null;
                    }
                    u.a(view, viewGroup3, layoutParams, -1);
                }
            }
            u.a(bVar.f47199e, new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.form.render.b.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    sg.bigo.ads.common.n.d.a(2, b.this.f47200h);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    b bVar3 = b.this;
                    bVar3.a(12, bVar3.g, System.currentTimeMillis() - b.this.f);
                }
            });
            relativeLayout = bVar.f47199e;
        }
        c cVar3 = new c(relativeLayout, bVar);
        cVar3.d.setType(0);
        cVar3.d.setRadius(sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.d.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.f47174c.setViewStyle(3);
        cVar3.f47174c.setFlipInterval(5000);
        cVar3.f47174c.setOnItemChangeListener(new ViewFlow.c() { // from class: sg.bigo.ads.common.form.c.1
            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i7) {
                Indicator indicator;
                int i8;
                c.this.d.setNum(i7);
                if (i7 > 1) {
                    indicator = c.this.d;
                    i8 = 0;
                } else {
                    indicator = c.this.d;
                    i8 = 4;
                }
                indicator.setVisibility(i8);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i7, int i8) {
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(View view2, int i7) {
                c.this.d.a(i7);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(View view2, int i7, float f) {
                c.this.d.a(f, i7);
            }
        });
        cVar3.f47174c.getLayoutParams().height = sg.bigo.ads.common.form.render.c.a(context, eVar);
        f[] fVarArrI = eVar.i();
        if (!k.a(fVarArrI)) {
            for (f fVar : fVarArrI) {
                ImageView imageView2 = new ImageView(context);
                new sg.bigo.ads.common.p.b(imageView2).a(null, fVar.c(), false);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewFlow.b bVar3 = new ViewFlow.b();
                ((ViewGroup.LayoutParams) bVar3).width = -1;
                ((ViewGroup.LayoutParams) bVar3).height = -2;
                bVar3.f47656e = 48;
                bVar3.d = 3;
                cVar3.f47174c.addView(imageView2, bVar3);
                if (eVar.f() == 0) {
                    break;
                }
            }
        }
        return cVar3;
    }
}
