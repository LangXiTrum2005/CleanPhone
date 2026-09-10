package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends a {
    public d(e.c cVar, Map<String, Object> map, Context context, a.InterfaceC0839a interfaceC0839a) {
        super(cVar, map, context, interfaceC0839a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final void a(int i2) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z2 = false;
        if (i2 != 2 && i2 == 3) {
            iA = -45718;
            z2 = true;
            iB = -45718;
        }
        a(iA, iB, z2);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f47182h, sg.bigo.ads.common.form.render.a.a(6), null, false);
        this.f47183i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.d);
        a(1);
        final RadioGroup radioGroup = (RadioGroup) this.f47183i.findViewById(R.id.inter_form_edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                    radioGroup.requestFocus();
                    RadioButton radioButton = (RadioButton) radioGroup2.findViewById(i2);
                    d.this.a(2);
                    if (radioButton != null) {
                        radioButton.setTextColor(-16736769);
                        d.this.f47180c = radioButton.getText().toString();
                        d dVar = d.this;
                        a.InterfaceC0839a interfaceC0839a = dVar.j;
                        if (interfaceC0839a != null) {
                            interfaceC0839a.a(dVar.f47181e, dVar.f47180c);
                        }
                    }
                }
            });
            if (this.g.length != 0) {
                String strA = sg.bigo.ads.common.form.a.a(this.f47181e, this.f47179b);
                CompoundButton compoundButton = null;
                int i2 = 0;
                while (true) {
                    String[] strArr = this.g;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i2];
                    boolean z2 = i2 == 0;
                    CompoundButton bVar = new sg.bigo.ads.common.view.b(this.f47182h);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    if (!z2) {
                        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f47182h, 8);
                    }
                    bVar.setLayoutParams(marginLayoutParams);
                    bVar.setPadding(sg.bigo.ads.common.utils.e.a(this.f47182h, 12), sg.bigo.ads.common.utils.e.a(this.f47182h, 10), sg.bigo.ads.common.utils.e.a(this.f47182h, 12), sg.bigo.ads.common.utils.e.a(this.f47182h, 11));
                    bVar.setTextSize(13.0f);
                    a.a(bVar, str);
                    bVar.setButtonDrawable((Drawable) null);
                    Context context = this.f47182h;
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int i3 = sg.bigo.ads.common.form.render.a.f47177a ? -15524570 : -657158;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(i3);
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(i3);
                    gradientDrawable2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    gradientDrawable2.setStroke(1, -16736769);
                    stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable2);
                    bVar.setBackground(stateListDrawable);
                    bVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.2
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton2, boolean z3) {
                            compoundButton2.setTextColor(z3 ? -16736769 : sg.bigo.ads.common.form.render.a.b());
                        }
                    });
                    bVar.setTextColor(sg.bigo.ads.common.form.render.a.b());
                    if (!q.a((CharSequence) strA) && strA.equalsIgnoreCase(this.g[i2])) {
                        a.InterfaceC0839a interfaceC0839a = this.j;
                        if (interfaceC0839a != null) {
                            interfaceC0839a.a(this.f47178a.d, strA);
                        }
                        this.f47180c = strA;
                        compoundButton = bVar;
                    }
                    u.a(bVar, radioGroup, null, -1);
                    i2++;
                }
                if (compoundButton != null) {
                    compoundButton.setChecked(true);
                }
            }
        }
        return this.f47183i;
    }
}
