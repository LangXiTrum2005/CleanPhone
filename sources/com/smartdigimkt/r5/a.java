package com.smartdigimkt.r5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.sdk.basead.ui.ScanningAnimButton;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ScanningAnimButton f38087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ScanningAnimButton f38088b;

    @Override // com.smartdigimkt.r5.d
    public void a(Drawable drawable) {
        ScanningAnimButton scanningAnimButton = this.f38087a;
        if (scanningAnimButton == null || drawable == null) {
            return;
        }
        try {
            scanningAnimButton.setBackground(drawable);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.r5.d
    public void b(ViewGroup viewGroup) {
    }

    @Override // com.smartdigimkt.r5.d
    public String c() {
        ScanningAnimButton scanningAnimButton = this.f38087a;
        if (scanningAnimButton == null) {
            return "";
        }
        scanningAnimButton.getText().toString();
        return "";
    }

    @Override // com.smartdigimkt.r5.d
    public View b() {
        return this.f38088b;
    }

    @Override // com.smartdigimkt.r5.d
    public void a(String str) {
        ScanningAnimButton scanningAnimButton = this.f38087a;
        if (scanningAnimButton != null) {
            scanningAnimButton.setText(str);
        }
    }

    @Override // com.smartdigimkt.r5.d
    public View a() {
        return this.f38087a;
    }
}
