package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {
    public b(e.c cVar, Map<String, Object> map, Context context, a.InterfaceC0839a interfaceC0839a) {
        super(cVar, map, context, interfaceC0839a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f47182h, sg.bigo.ads.common.form.render.a.a(2), null, false);
        this.f47183i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.d);
        a(1);
        final EditText editText = (EditText) this.f47183i.findViewById(R.id.inter_form_edit_content);
        String strA = sg.bigo.ads.common.form.a.a(this.f47181e, this.f47179b);
        if (editText != null) {
            editText.setTextColor(sg.bigo.ads.common.form.render.a.b());
            editText.setHint(sg.bigo.ads.common.form.a.a(this.f47182h, R.string.bigo_ad_form_question_hint));
            if (!q.a((CharSequence) strA)) {
                a.InterfaceC0839a interfaceC0839a = this.j;
                if (interfaceC0839a != null) {
                    interfaceC0839a.a(this.f47178a.d, strA);
                }
                this.f47180c = strA;
                editText.setText(strA);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.common.form.render.a.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    b.this.f47180c = editText.getText().toString();
                    b bVar = b.this;
                    a.InterfaceC0839a interfaceC0839a2 = bVar.j;
                    if (interfaceC0839a2 != null) {
                        interfaceC0839a2.a(bVar.f47178a.d, bVar.f47180c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.common.form.render.a.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    b bVar = b.this;
                    if (z2) {
                        bVar.a(2);
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this.f47183i;
    }
}
