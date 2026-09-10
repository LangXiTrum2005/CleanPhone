package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f9233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f9234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f9235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t2 f9236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9237f;

    public void a(int i10) {
        this.f9237f = i10;
    }

    public t2 b() {
        return this.f9236e;
    }

    public int a() {
        return this.f9237f;
    }

    public void a(t2 t2Var) {
        this.f9236e = t2Var;
        this.f9232a.setText(t2Var.k());
        this.f9232a.setTextColor(t2Var.l());
        if (this.f9233b != null) {
            if (!TextUtils.isEmpty(t2Var.f())) {
                this.f9233b.setTypeface(null, 0);
                this.f9233b.setVisibility(0);
                this.f9233b.setText(t2Var.f());
                this.f9233b.setTextColor(t2Var.g());
                if (t2Var.p()) {
                    this.f9233b.setTypeface(null, 1);
                }
            } else {
                this.f9233b.setVisibility(8);
            }
        }
        if (this.f9234c != null) {
            if (t2Var.h() > 0) {
                this.f9234c.setImageResource(t2Var.h());
                this.f9234c.setColorFilter(t2Var.i());
                this.f9234c.setVisibility(0);
            } else {
                this.f9234c.setVisibility(8);
            }
        }
        if (this.f9235d != null) {
            if (t2Var.d() > 0) {
                this.f9235d.setImageResource(t2Var.d());
                this.f9235d.setColorFilter(t2Var.e());
                this.f9235d.setVisibility(0);
                return;
            }
            this.f9235d.setVisibility(8);
        }
    }
}
