package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e.c f47178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map<String, Object> f47179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f47180c;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f47181e;
    protected int f;
    protected String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Context f47182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f47183i;
    protected InterfaceC0839a j;

    /* JADX INFO: renamed from: sg.bigo.ads.common.form.render.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0839a {
        void a(String str, String str2);
    }

    public a(e.c cVar, Map<String, Object> map, Context context, InterfaceC0839a interfaceC0839a) {
        this.f47182h = context;
        this.f47178a = cVar;
        this.f47179b = map;
        this.d = cVar.f46983a;
        this.f47181e = cVar.d;
        this.f = cVar.f46984b;
        this.g = cVar.f46985c;
        this.j = interfaceC0839a;
    }

    public void a(int i2) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z2 = false;
        if (i2 != 2) {
            if (i2 == 3) {
                iA = -45718;
                z2 = true;
            }
            a(iA, iB, z2);
        }
        iA = -16736769;
        iB = iA;
        a(iA, iB, z2);
    }

    public abstract View b();

    public final View c() {
        return this.f47183i;
    }

    public final void a(int i2, int i3, boolean z2) {
        View view = this.f47183i;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.inter_form_edit_content);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(this.f47182h, 1), i2);
            gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.f47182h, 8));
            viewFindViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.f47183i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.f47182h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z2 ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f47183i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i3);
        }
    }

    public static void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public final boolean a() {
        boolean zA = q.a((CharSequence) this.f47180c);
        if (this.f47178a.f46984b == 3) {
            zA = !q.g(this.f47180c);
        }
        a(zA ? 3 : 1);
        return zA;
    }
}
