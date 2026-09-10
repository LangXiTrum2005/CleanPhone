package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class AM implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2813a;

    public /* synthetic */ AM(Object obj) {
        this.f2813a = obj;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.toString().length();
        EM em = (EM) this.f2813a;
        em.c.getClass();
        boolean z = length == 0;
        em.m.setEnabled(!z);
        TextView textView = em.k;
        BM bm = em.c;
        if (textView != null) {
            bm.getClass();
            em.k.setVisibility(8);
            boolean z2 = (z && length == 0) || length < -1;
            AbstractC2340Cl.R(em.g, z2 ? 0 : bm.n);
            em.m.setEnabled(!z2);
        }
        bm.getClass();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
