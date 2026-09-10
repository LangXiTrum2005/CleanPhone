package sg.bigo.ads.core.adview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.s;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile boolean f48268b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f48269a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ViewGroup f48270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f48271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f48272c;
        String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f48273e;
        String f;
        String g;

        public a(ViewGroup viewGroup) {
            this.f48270a = viewGroup;
        }
    }

    public class b extends Dialog {
        public b(Context context) {
            super(context, R.style.Dialog_FullScreen);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            super.dismiss();
            e.a();
        }

        @Override // android.app.Dialog
        public final void onCreate(Bundle bundle) {
            View viewFindViewById;
            super.onCreate(bundle);
            View viewA = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_optionview_feedback, null, false);
            setContentView(viewA);
            e.a(getWindow());
            if (!TextUtils.isEmpty(e.this.f48269a.f48271b)) {
                View viewFindViewById2 = findViewById(R.id.bigo_ad_btn_why_this_ad);
                viewFindViewById2.setVisibility(0);
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f48269a.f48271b);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f48269a.f48272c)) {
                final View viewFindViewById3 = findViewById(R.id.inter_option_btn_copy_ru_ad_marker);
                if (viewFindViewById3 != null) {
                    TextView textView = (TextView) viewFindViewById3.findViewById(R.id.inter_option_text_copy_ru_ad_marker);
                    if (textView != null) {
                        textView.setText(sg.bigo.ads.common.utils.a.a(getContext(), R.string.bigo_ad_feedback_copy_ad_id, e.this.f48269a.f48272c));
                    }
                    viewFindViewById3.setVisibility(0);
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (sg.bigo.ads.common.utils.c.g(viewFindViewById3.getContext(), e.this.f48269a.f48272c)) {
                                Toast.makeText(viewFindViewById3.getContext(), sg.bigo.ads.common.utils.a.a(viewFindViewById3.getContext(), R.string.bigo_ad_feedback_copied, new Object[0]), 0).show();
                            }
                            b.this.dismiss();
                        }
                    });
                }
                if (viewFindViewById3 != null && (viewFindViewById = viewFindViewById3.findViewById(R.id.inter_option_line)) != null) {
                    viewFindViewById.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(e.this.f48269a.d)) {
                findViewById(R.id.inter_option_ll_ad_info).setVisibility(0);
                ((TextView) findViewById(R.id.inter_option_tv_ad_info)).setText(e.this.f48269a.d);
            }
            if (!TextUtils.isEmpty(e.this.f48269a.f48273e)) {
                View viewFindViewById4 = findViewById(R.id.bigo_ad_btn_ad_copy_link);
                viewFindViewById4.setVisibility(0);
                final Context context = viewFindViewById4.getContext();
                viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (sg.bigo.ads.common.utils.c.g(context, e.this.f48269a.f48273e)) {
                            Context context2 = context;
                            Toast.makeText(context2, sg.bigo.ads.common.utils.a.a(context2, R.string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
                        }
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f48269a.f)) {
                View viewFindViewById5 = findViewById(R.id.bigo_ad_btn_rec_rule);
                viewFindViewById5.setVisibility(0);
                viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f48269a.f);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.f48269a.g)) {
                View viewFindViewById6 = findViewById(R.id.bigo_ad_btn_user_privacy);
                viewFindViewById6.setVisibility(0);
                viewFindViewById6.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.b(view.getContext(), e.this.f48269a.g);
                        b.this.dismiss();
                    }
                });
            }
            viewA.findViewById(R.id.bigo_ad_feedback_background).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.dismiss();
                }
            });
        }
    }

    private e(a aVar) {
        this.f48269a = aVar;
    }

    public /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }

    public static /* synthetic */ void a(Window window) {
        if (window != null) {
            s.a(window);
        }
    }

    public static /* synthetic */ boolean a() {
        f48268b = false;
        return false;
    }
}
