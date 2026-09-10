package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q1 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r1 f9038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f9039o;

    public q1(r1 r1Var, Context context) {
        super(t2.c.DETAIL);
        this.f9038n = r1Var;
        this.f9039o = context;
        this.f9735c = r();
        this.f9736d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + q7.a(this.f9038n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f9038n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f9038n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.t2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.t2
    public int e() {
        return this.f9039o.getColor(R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return true;
    }
}
