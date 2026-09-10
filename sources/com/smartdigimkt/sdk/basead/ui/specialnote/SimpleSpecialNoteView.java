package com.smartdigimkt.sdk.basead.ui.specialnote;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleSpecialNoteView extends BaseSpecialNoteView {
    public SimpleSpecialNoteView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public void a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
        translateAnimation.setDuration(500L);
        startAnimation(translateAnimation);
        super.a();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public void e() {
        this.s0 = getContext().getString(h.a(b.p().k(), "myoffer_special_note_delay_click_simple", k.f38992h));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public void f() {
        setOrientation(0);
        int iA = h.a(getContext(), 5.0f);
        setPadding(iA, 0, iA, 0);
        setGravity(16);
        setBackgroundColor(Color.parseColor("#80000000"));
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_special_note_simple", "layout"), (ViewGroup) this, true);
        this.q0 = (TextView) findViewById(h.a(getContext(), "myoffer_special_countdown_text", "id"));
        this.r0 = (TextView) findViewById(h.a(getContext(), "myoffer_special_cancel_text", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public boolean g() {
        return true;
    }

    public SimpleSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
