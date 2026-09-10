package com.smartdigimkt.sdk.basead.ui.specialnote;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenSpecialNoteView extends BaseSpecialNoteView {
    public ScreenSpecialNoteView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public void a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        startAnimation(translateAnimation);
        super.a();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public void f() {
        setOrientation(0);
        setPadding(h.a(getContext(), 10.0f), 0, h.a(getContext(), 12.0f), 0);
        setGravity(16);
        setBackgroundResource(h.a(b.p().k(), "myoffer_bg_shake_border_thumb", k.d));
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_special_note", "layout"), (ViewGroup) this, true);
        this.q0 = (TextView) findViewById(h.a(getContext(), "myoffer_special_countdown_text", "id"));
        this.r0 = (TextView) findViewById(h.a(getContext(), "myoffer_special_cancel_text", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView
    public boolean g() {
        return false;
    }

    public ScreenSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
